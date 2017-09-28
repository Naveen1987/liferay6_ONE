package com.daffo.filelib.model;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFileEntryMetadata;
import com.liferay.portlet.documentlibrary.model.DLFileEntryType;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryMetadataLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryTypeLocalServiceUtil;
import com.liferay.portlet.dynamicdatamapping.model.DDMStructure;
import com.liferay.portlet.dynamicdatamapping.service.DDMStructureLocalServiceUtil;
import com.liferay.portlet.dynamicdatamapping.storage.Fields;
import com.liferay.portlet.dynamicdatamapping.storage.StorageEngineUtil;


public class FolderAndDocType_Service {

	//DLApp deals with folder not DLFolders
	//This will provide more specific results associated with repository Id
	//Only of Current Site Only
	public List<Folder> getAllFolder(ThemeDisplay themeDisplay){
		long repositoryId = themeDisplay.getScopeGroupId();
		
		List<Folder> folders=null;
		 try {
		      folders = DLAppServiceUtil.getFolders(repositoryId, DLFolderConstants.DEFAULT_PARENT_FOLDER_ID);
			  for (Folder folder : folders) {
//				     System.out.println("Folder Id >> "+folder.getFolderId());
//				     System.out.println("Folder Name >>"+folder.getName());
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return folders;
	} 
	
	public Folder getFolder(ThemeDisplay themeDisplay,String folderName){
		Folder f=null;
			  for (Folder folder : getAllFolder(themeDisplay)) {
				     if(folder.getName().equalsIgnoreCase(folderName)){
//				    	 System.out.println("Folder Id >> "+folder.getFolderId());
//					     System.out.println("Folder Name >>"+folder.getName());
				    	 f=folder;break;
				     }
				}
		return f;
	} 
	
	public List<DDMStructure> getSiteAllDocumentType(ThemeDisplay themeDisplay) throws SystemException, PortalException{
		List<DDMStructure> structures =DDMStructureLocalServiceUtil.getStructures(themeDisplay.getScopeGroupId()); 
				for(DDMStructure dms:structures){
//			System.out.println(dms.getStructureId()+" "+dms.getNameCurrentValue()+" ");
//			System.out.println(dms.getFieldNames());
			
		}
		//System.out.println(structures);
		return structures;		
	}
	public DDMStructure getSiteDocumentType(ThemeDisplay themeDisplay,String docType) throws SystemException, PortalException{
	
	DDMStructure dm=null;
	for(DDMStructure dms:getSiteAllDocumentType(themeDisplay)){
			if(dms.getNameCurrentValue().equalsIgnoreCase(docType))
			{
//				System.out.println(dms.getStructureId()+" "+dms.getNameCurrentValue()+" ");
//				System.out.println(dms.getFieldNames());
				dm=dms;break;
			}
	}
	
		//System.out.println(structures);
		return dm;		
	}
	
	public List<DLFileEntry> getAllFiles(ThemeDisplay themeDisplay,long folderId){
		List<DLFileEntry> fileEntryService = null;
		try {
			 fileEntryService = DLFileEntryLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),folderId,-1, -1, null); //12345 is folderId
			 } catch (SystemException e) {
			  e.printStackTrace();
			 }
		return fileEntryService;
	}
	
	public Map<String,String> getFileData(ThemeDisplay themeDisplay,Folder folder,DLFileEntry dlFileEntry) throws PortalException, SystemException{
	String title=dlFileEntry.getTitle();
	//System.out.println(title);
	String url = themeDisplay.getPortalURL() + themeDisplay.getPathContext() + "/documents/" + themeDisplay.getScopeGroupId() + "/" +
				 dlFileEntry.getFolderId() +  "/" +dlFileEntry.getTitle();
	//System.out.println(url); 
	String description=dlFileEntry.getDescription();
	//System.out.println(description);
	double size=((double)dlFileEntry.getSize())/1024;
	//System.out.println(size);
	String extension=dlFileEntry.getExtension();
	//System.out.println(extension);
	String modifydate=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aaa").format(dlFileEntry.getModifiedDate());
	//System.out.println(modifydate);
	String createddate=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss aaa").format(dlFileEntry.getCreateDate());
	//System.out.println(modifydate);
	
	//Fecthing structure Type related data
	DLFileEntryType dLFileEntryType = DLFileEntryTypeLocalServiceUtil.getFileEntryType(dlFileEntry.getFileEntryTypeId());
	DDMStructure yourStructure = null;
	List<DDMStructure> structures =  dLFileEntryType.getDDMStructures();
		for (DDMStructure struct : structures) {
			//System.out.println("-"+struct.getName(Locale.ROOT));
			//System.out.println(struct.getNameCurrentValue());
			if (struct.getName(Locale.ROOT).equalsIgnoreCase(folder.getName())) {
		    	yourStructure = struct;
		    //System.out.println(yourStructure);
		    	break;
		    }
		}
	DLFileEntryMetadata dlFileEntryMetadata = DLFileEntryMetadataLocalServiceUtil.getFileEntryMetadata (yourStructure.getStructureId(), 
	dlFileEntry.getFileVersion().getFileVersionId());
	Fields fields = StorageEngineUtil.getFields(dlFileEntryMetadata.getDDMStorageId());
	//Now Creating map with values
	Map<String, String>values=new HashMap<String, String>();
	values.put("title", title);
	values.put("url", url);
	values.put("description", description);
	values.put("createddate", createddate);
	values.put("modifydate", modifydate);
	values.put("size", ((size % 1 == 0)?String.format("%.0f", size):String.format("%.2f", size))+" KB");
	values.put("extension", extension);
	if(new FileExtensionFinder().finder(extension)){
		values.put("icon",extension+"-icon-48x48.png");
	}
	else{
		values.put("icon", "alledit-icon-48x48.png");
	}
	for(String name:fields.getNames()){
		String value = fields.get(name).getValue(Locale.ROOT).toString();
		//System.out.println(name+":"+value);
	values.put(name, value);
	}
//	String a = fields.get("COD").getValue(Locale.ROOT).toString();
//	String b = fields.get("REV").getValue(Locale.ROOT).toString();
//	String c = fields.get("Lingua").getValue(Locale.ROOT).toString();
//	System.out.println(values);
	return values;
	
	}
}