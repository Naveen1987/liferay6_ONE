package com.daff.attivita_formativa;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.sample.model.suiluppo_application;
import com.liferay.sample.model.suiluppo_course;
import com.liferay.sample.service.suiluppo_applicationLocalServiceUtil;
import com.liferay.sample.service.suiluppo_courseLocalServiceUtil;

public class Suiluppo_course_applicationUtil {
	
public  List<suiluppo_application> getApplicantUnderCourse(long courseId) throws SystemException{
	DynamicQuery userQuery =suiluppo_applicationLocalServiceUtil.dynamicQuery();
	userQuery.add(RestrictionsFactoryUtil.eq("course_id", courseId));
	List<suiluppo_application> sur=suiluppo_applicationLocalServiceUtil.dynamicQuery(userQuery);
	//Updating Course Allocation Table
	return sur;
}
public boolean checkApplicantUnderCourse(long courseId,String applicant) throws SystemException
{
	   //DynamicQuery appQuery = DynamicQueryFactoryUtil.forClass(suiluppo_application.class,PortalClassLoaderUtil.getClassLoader());
	   DynamicQuery appQuery = suiluppo_applicationLocalServiceUtil.dynamicQuery();
       appQuery.add(RestrictionsFactoryUtil.and(RestrictionsFactoryUtil.eq("applicat_name", applicant), RestrictionsFactoryUtil.eq("course_id", courseId)));
       return (suiluppo_applicationLocalServiceUtil.dynamicQuery(appQuery).size()>0?true:false);
    
}
public List<suiluppo_course> getCourseUnderDocente(String Docente) throws SystemException
{
	DynamicQuery dyQuery=suiluppo_courseLocalServiceUtil.dynamicQuery();
	dyQuery.add(RestrictionsFactoryUtil.eq("Docente", Docente));
	return suiluppo_courseLocalServiceUtil.dynamicQuery(dyQuery);
    
}
public List<suiluppo_course> getCourseNotUnderDocente(String Docente) throws SystemException
{
	//DynamicQuery dyQuery = DynamicQueryFactoryUtil.forClass(suiluppo_course.class,PortalClassLoaderUtil.getClassLoader());
	DynamicQuery dyQuery=suiluppo_courseLocalServiceUtil.dynamicQuery();
    dyQuery.add(RestrictionsFactoryUtil.ne("Docente", Docente));
    return suiluppo_courseLocalServiceUtil.dynamicQuery(dyQuery);
    
}
}
