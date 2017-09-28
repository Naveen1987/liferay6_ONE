package com.daff;

import com.liferay.portal.kernel.events.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.struts.LastPath;
import com.liferay.portal.kernel.util.StringPool;

public class PostLoginEventPortlet extends Action {
	/* (non-Java-doc)
	 * @see com.liferay.portal.kernel.events.Action#Action()
	 */
	public PostLoginEventPortlet() {
		super();
	}

	/* (non-Java-doc)
	 * @see com.liferay.portal.kernel.events.Action#run(HttpServletRequest arg0, HttpServletResponse arg1)
	 */
	public static final Log LOGGER = LogFactoryUtil.getLog(PostLoginEventPortlet.class);
	public void run(HttpServletRequest req, HttpServletResponse arg1) throws ActionException {
		LOGGER.info("Redirecting to internal-intranet.....");
		HttpSession session = req.getSession();
		  session.setAttribute("LAST_PATH", new LastPath(StringPool.BLANK, "/group/internal-intranet/welcome"));
	}

}