
<%@page import="java.util.*"%>
<%@ include file="init.jsp" %>
<script src='<%=request.getContextPath()+"/js/jquery-1.10.2.min.js"%>'></script>
<h1>Mail Sender</h1>
<fieldset>
<legend>Mail Form</legend>
<liferay-ui:success key="successmsg" message="" />
<aui:form action="" method="post" name="mailSenderForm">
<aui:layout>
		<aui:column>
			<aui:input 	label="From Mail Address" name="senderEmailAddess" id="senderEmailAddess" type="text" style="width:600px;height:20px;"/>
		</aui:column>
</aui:layout>
<aui:layout>
		<aui:column>
			&nbsp;
		</aui:column>
</aui:layout>
<aui:layout>
		<aui:column>
			<aui:input 	label="To Mail Address" name="receiverEmailAddess" id="receiverEmailAddess" type="text" style="width:600px;height:20px;"/>
		</aui:column>
</aui:layout>
<aui:layout>
		<aui:column>
			&nbsp;
		</aui:column>
</aui:layout>
<aui:layout>
		<aui:column>
			<aui:input 	label="Mail Subject" name="mailSubject" id="mailSubject" type="text" style="width:600px;height:20px;"/>
		</aui:column>
</aui:layout>
<aui:layout>
		<aui:column>
			&nbsp;
		</aui:column>
</aui:layout>
<aui:layout>
		<aui:column>
			<liferay-ui:input-editor >
			</liferay-ui:input-editor>
		</aui:column>
</aui:layout>
<aui:layout>
		<aui:column>
			&nbsp;
		</aui:column>
</aui:layout>
<aui:layout>
		<aui:column>
			<aui:button type="submit" value="Send Mail" name="submit"
				></aui:button>
		</aui:column>
</aui:layout>
</aui:form>
</fieldset>



