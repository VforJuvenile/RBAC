/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.rbac.action.system;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.rbac.common.BaseAction;
import com.rbac.form.system.AccountListForm;
import com.rbac.service.AccountService;
import com.rbac.service.LoginService;

/** 
 * MyEclipse Struts
 * Creation date: 04-11-2014
 * 
 * XDoclet definition:
 * @struts.action path="/accountList" name="accountListForm" input="/system/accountList.jsp" scope="request" validate="true"
 */
public class AccountListAction extends BaseAction {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		AccountListForm accountListForm = (AccountListForm) form;
		AccountService accountService = (AccountService) super
			.getBean("accountService");
		//accountService.saveOrUpdateAccount(accountService.getAccountById(1L));
		return mapping.getInputForward();
	}
}