package org.apache.jsp.rss_005fsettings;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.rss.util.RSSUtil;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/rss_settings/init.jsp");
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/rss_settings/init-ext.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_input_value_type_name_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_portlet_namespace_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_col;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_row;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_option_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_script;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_portlet_defineObjects_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_col_width;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_option_value_selected_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1theme_defineObjects_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_option_selected_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1frontend_defineObjects_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_select_value_name_label;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_select_name_label;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_aui_input_value_type_name_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_portlet_namespace_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_col = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_row = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_option_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_script = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_portlet_defineObjects_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_col_width = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_option_value_selected_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_liferay$1theme_defineObjects_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_option_selected_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_liferay$1frontend_defineObjects_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_select_value_name_label = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_select_name_label = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_aui_input_value_type_name_label_nobody.release();
    _jspx_tagPool_portlet_namespace_nobody.release();
    _jspx_tagPool_aui_col.release();
    _jspx_tagPool_aui_row.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_aui_option_label_nobody.release();
    _jspx_tagPool_aui_script.release();
    _jspx_tagPool_portlet_defineObjects_nobody.release();
    _jspx_tagPool_aui_col_width.release();
    _jspx_tagPool_aui_option_value_selected_label_nobody.release();
    _jspx_tagPool_liferay$1theme_defineObjects_nobody.release();
    _jspx_tagPool_aui_option_selected_label_nobody.release();
    _jspx_tagPool_liferay$1frontend_defineObjects_nobody.release();
    _jspx_tagPool_aui_select_value_name_label.release();
    _jspx_tagPool_aui_select_name_label.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n\n\n\n\n\n\n\n\n\n");
      //  liferay-frontend:defineObjects
      com.liferay.frontend.taglib.servlet.taglib.DefineObjectsTag _jspx_th_liferay$1frontend_defineObjects_0 = (com.liferay.frontend.taglib.servlet.taglib.DefineObjectsTag) _jspx_tagPool_liferay$1frontend_defineObjects_nobody.get(com.liferay.frontend.taglib.servlet.taglib.DefineObjectsTag.class);
      _jspx_th_liferay$1frontend_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1frontend_defineObjects_0.setParent(null);
      int _jspx_eval_liferay$1frontend_defineObjects_0 = _jspx_th_liferay$1frontend_defineObjects_0.doStartTag();
      if (_jspx_th_liferay$1frontend_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_liferay$1frontend_defineObjects_nobody.reuse(_jspx_th_liferay$1frontend_defineObjects_0);
        return;
      }
      _jspx_tagPool_liferay$1frontend_defineObjects_nobody.reuse(_jspx_th_liferay$1frontend_defineObjects_0);
      java.lang.String currentURL = null;
      javax.portlet.PortletURL currentURLObj = null;
      java.lang.String npmResolvedPackageName = null;
      java.util.ResourceBundle resourceBundle = null;
      javax.portlet.WindowState windowState = null;
      currentURL = (java.lang.String) _jspx_page_context.findAttribute("currentURL");
      currentURLObj = (javax.portlet.PortletURL) _jspx_page_context.findAttribute("currentURLObj");
      npmResolvedPackageName = (java.lang.String) _jspx_page_context.findAttribute("npmResolvedPackageName");
      resourceBundle = (java.util.ResourceBundle) _jspx_page_context.findAttribute("resourceBundle");
      windowState = (javax.portlet.WindowState) _jspx_page_context.findAttribute("windowState");
      out.write('\n');
      out.write('\n');
      //  liferay-theme:defineObjects
      com.liferay.taglib.theme.DefineObjectsTag _jspx_th_liferay$1theme_defineObjects_0 = (com.liferay.taglib.theme.DefineObjectsTag) _jspx_tagPool_liferay$1theme_defineObjects_nobody.get(com.liferay.taglib.theme.DefineObjectsTag.class);
      _jspx_th_liferay$1theme_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1theme_defineObjects_0.setParent(null);
      int _jspx_eval_liferay$1theme_defineObjects_0 = _jspx_th_liferay$1theme_defineObjects_0.doStartTag();
      if (_jspx_th_liferay$1theme_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_liferay$1theme_defineObjects_nobody.reuse(_jspx_th_liferay$1theme_defineObjects_0);
        return;
      }
      _jspx_tagPool_liferay$1theme_defineObjects_nobody.reuse(_jspx_th_liferay$1theme_defineObjects_0);
      com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay = null;
      com.liferay.portal.kernel.model.Company company = null;
      com.liferay.portal.kernel.model.Account account = null;
      com.liferay.portal.kernel.model.User user = null;
      com.liferay.portal.kernel.model.User realUser = null;
      com.liferay.portal.kernel.model.Contact contact = null;
      com.liferay.portal.kernel.model.Layout layout = null;
      java.util.List layouts = null;
      java.lang.Long plid = null;
      com.liferay.portal.kernel.model.LayoutTypePortlet layoutTypePortlet = null;
      java.lang.Long scopeGroupId = null;
      com.liferay.portal.kernel.security.permission.PermissionChecker permissionChecker = null;
      java.util.Locale locale = null;
      java.util.TimeZone timeZone = null;
      com.liferay.portal.kernel.model.Theme theme = null;
      com.liferay.portal.kernel.model.ColorScheme colorScheme = null;
      com.liferay.portal.kernel.theme.PortletDisplay portletDisplay = null;
      java.lang.Long portletGroupId = null;
      themeDisplay = (com.liferay.portal.kernel.theme.ThemeDisplay) _jspx_page_context.findAttribute("themeDisplay");
      company = (com.liferay.portal.kernel.model.Company) _jspx_page_context.findAttribute("company");
      account = (com.liferay.portal.kernel.model.Account) _jspx_page_context.findAttribute("account");
      user = (com.liferay.portal.kernel.model.User) _jspx_page_context.findAttribute("user");
      realUser = (com.liferay.portal.kernel.model.User) _jspx_page_context.findAttribute("realUser");
      contact = (com.liferay.portal.kernel.model.Contact) _jspx_page_context.findAttribute("contact");
      layout = (com.liferay.portal.kernel.model.Layout) _jspx_page_context.findAttribute("layout");
      layouts = (java.util.List) _jspx_page_context.findAttribute("layouts");
      plid = (java.lang.Long) _jspx_page_context.findAttribute("plid");
      layoutTypePortlet = (com.liferay.portal.kernel.model.LayoutTypePortlet) _jspx_page_context.findAttribute("layoutTypePortlet");
      scopeGroupId = (java.lang.Long) _jspx_page_context.findAttribute("scopeGroupId");
      permissionChecker = (com.liferay.portal.kernel.security.permission.PermissionChecker) _jspx_page_context.findAttribute("permissionChecker");
      locale = (java.util.Locale) _jspx_page_context.findAttribute("locale");
      timeZone = (java.util.TimeZone) _jspx_page_context.findAttribute("timeZone");
      theme = (com.liferay.portal.kernel.model.Theme) _jspx_page_context.findAttribute("theme");
      colorScheme = (com.liferay.portal.kernel.model.ColorScheme) _jspx_page_context.findAttribute("colorScheme");
      portletDisplay = (com.liferay.portal.kernel.theme.PortletDisplay) _jspx_page_context.findAttribute("portletDisplay");
      portletGroupId = (java.lang.Long) _jspx_page_context.findAttribute("portletGroupId");
      out.write('\n');
      out.write('\n');
      //  portlet:defineObjects
      com.liferay.taglib.portlet.DefineObjectsTag _jspx_th_portlet_defineObjects_0 = (com.liferay.taglib.portlet.DefineObjectsTag) _jspx_tagPool_portlet_defineObjects_nobody.get(com.liferay.taglib.portlet.DefineObjectsTag.class);
      _jspx_th_portlet_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_portlet_defineObjects_0.setParent(null);
      int _jspx_eval_portlet_defineObjects_0 = _jspx_th_portlet_defineObjects_0.doStartTag();
      if (_jspx_th_portlet_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_portlet_defineObjects_nobody.reuse(_jspx_th_portlet_defineObjects_0);
        return;
      }
      _jspx_tagPool_portlet_defineObjects_nobody.reuse(_jspx_th_portlet_defineObjects_0);
      javax.portlet.ActionRequest actionRequest = null;
      javax.portlet.ActionResponse actionResponse = null;
      javax.portlet.EventRequest eventRequest = null;
      javax.portlet.EventResponse eventResponse = null;
      com.liferay.portal.kernel.portlet.LiferayPortletRequest liferayPortletRequest = null;
      com.liferay.portal.kernel.portlet.LiferayPortletResponse liferayPortletResponse = null;
      javax.portlet.PortletConfig portletConfig = null;
      java.lang.String portletName = null;
      javax.portlet.PortletPreferences portletPreferences = null;
      java.util.Map portletPreferencesValues = null;
      javax.portlet.PortletSession portletSession = null;
      java.util.Map portletSessionScope = null;
      javax.portlet.RenderRequest renderRequest = null;
      javax.portlet.RenderResponse renderResponse = null;
      javax.portlet.ResourceRequest resourceRequest = null;
      javax.portlet.ResourceResponse resourceResponse = null;
      actionRequest = (javax.portlet.ActionRequest) _jspx_page_context.findAttribute("actionRequest");
      actionResponse = (javax.portlet.ActionResponse) _jspx_page_context.findAttribute("actionResponse");
      eventRequest = (javax.portlet.EventRequest) _jspx_page_context.findAttribute("eventRequest");
      eventResponse = (javax.portlet.EventResponse) _jspx_page_context.findAttribute("eventResponse");
      liferayPortletRequest = (com.liferay.portal.kernel.portlet.LiferayPortletRequest) _jspx_page_context.findAttribute("liferayPortletRequest");
      liferayPortletResponse = (com.liferay.portal.kernel.portlet.LiferayPortletResponse) _jspx_page_context.findAttribute("liferayPortletResponse");
      portletConfig = (javax.portlet.PortletConfig) _jspx_page_context.findAttribute("portletConfig");
      portletName = (java.lang.String) _jspx_page_context.findAttribute("portletName");
      portletPreferences = (javax.portlet.PortletPreferences) _jspx_page_context.findAttribute("portletPreferences");
      portletPreferencesValues = (java.util.Map) _jspx_page_context.findAttribute("portletPreferencesValues");
      portletSession = (javax.portlet.PortletSession) _jspx_page_context.findAttribute("portletSession");
      portletSessionScope = (java.util.Map) _jspx_page_context.findAttribute("portletSessionScope");
      renderRequest = (javax.portlet.RenderRequest) _jspx_page_context.findAttribute("renderRequest");
      renderResponse = (javax.portlet.RenderResponse) _jspx_page_context.findAttribute("renderResponse");
      resourceRequest = (javax.portlet.ResourceRequest) _jspx_page_context.findAttribute("resourceRequest");
      resourceResponse = (javax.portlet.ResourceResponse) _jspx_page_context.findAttribute("resourceResponse");
      out.write("\n\n\n\n");
      out.write('\n');
      out.write('\n');

int delta = GetterUtil.getInteger((String)request.getAttribute("liferay-rss:rss-settings:delta"));
String displayStyle = (String)request.getAttribute("liferay-rss:rss-settings:displayStyle");
String[] displayStyles = (String[])request.getAttribute("liferay-rss:rss-settings:displayStyles");
boolean enabled = GetterUtil.getBoolean((String)request.getAttribute("liferay-rss:rss-settings:enabled"));
String feedType = (String)request.getAttribute("liferay-rss:rss-settings:feedType");
String name = (String)request.getAttribute("liferay-rss:rss-settings:name");
boolean nameEnabled = GetterUtil.getBoolean((String)request.getAttribute("liferay-rss:rss-settings:nameEnabled"));

      out.write("\n\n<div class=\"taglib-rss-settings\">\n\t");
      //  aui:input
      com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (com.liferay.taglib.aui.InputTag) _jspx_tagPool_aui_input_value_type_name_label_nobody.get(com.liferay.taglib.aui.InputTag.class);
      _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_input_0.setParent(null);
      _jspx_th_aui_input_0.setLabel("enable-rss-subscription");
      _jspx_th_aui_input_0.setName("preferences--enableRss--");
      _jspx_th_aui_input_0.setType("toggle-switch");
      _jspx_th_aui_input_0.setValue( enabled );
      int _jspx_eval_aui_input_0 = _jspx_th_aui_input_0.doStartTag();
      if (_jspx_th_aui_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_aui_input_value_type_name_label_nobody.reuse(_jspx_th_aui_input_0);
        return;
      }
      _jspx_tagPool_aui_input_value_type_name_label_nobody.reuse(_jspx_th_aui_input_0);
      out.write("\n\n\t<div id=\"");
      if (_jspx_meth_portlet_namespace_0(_jspx_page_context))
        return;
      out.write("rssOptions\">\n\t\t");
      //  c:if
      com.liferay.taglib.core.IfTag _jspx_th_c_if_0 = (com.liferay.taglib.core.IfTag) _jspx_tagPool_c_if_test.get(com.liferay.taglib.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest( nameEnabled );
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n\t\t\t");
        //  aui:row
        com.liferay.taglib.aui.RowTag _jspx_th_aui_row_0 = (com.liferay.taglib.aui.RowTag) _jspx_tagPool_aui_row.get(com.liferay.taglib.aui.RowTag.class);
        _jspx_th_aui_row_0.setPageContext(_jspx_page_context);
        _jspx_th_aui_row_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
        int _jspx_eval_aui_row_0 = _jspx_th_aui_row_0.doStartTag();
        if (_jspx_eval_aui_row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n\t\t\t\t");
          //  aui:col
          com.liferay.taglib.aui.ColTag _jspx_th_aui_col_0 = (com.liferay.taglib.aui.ColTag) _jspx_tagPool_aui_col.get(com.liferay.taglib.aui.ColTag.class);
          _jspx_th_aui_col_0.setPageContext(_jspx_page_context);
          _jspx_th_aui_col_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_row_0);
          int _jspx_eval_aui_col_0 = _jspx_th_aui_col_0.doStartTag();
          if (_jspx_eval_aui_col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n\t\t\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_1 = (com.liferay.taglib.aui.InputTag) _jspx_tagPool_aui_input_value_type_name_label_nobody.get(com.liferay.taglib.aui.InputTag.class);
            _jspx_th_aui_input_1.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_col_0);
            _jspx_th_aui_input_1.setLabel("rss-feed-name");
            _jspx_th_aui_input_1.setName("preferences--rssName--");
            _jspx_th_aui_input_1.setType("text");
            _jspx_th_aui_input_1.setValue( name );
            int _jspx_eval_aui_input_1 = _jspx_th_aui_input_1.doStartTag();
            if (_jspx_th_aui_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_aui_input_value_type_name_label_nobody.reuse(_jspx_th_aui_input_1);
              return;
            }
            _jspx_tagPool_aui_input_value_type_name_label_nobody.reuse(_jspx_th_aui_input_1);
            out.write("\n\t\t\t\t");
          }
          if (_jspx_th_aui_col_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_aui_col.reuse(_jspx_th_aui_col_0);
            return;
          }
          _jspx_tagPool_aui_col.reuse(_jspx_th_aui_col_0);
          out.write("\n\t\t\t");
        }
        if (_jspx_th_aui_row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          _jspx_tagPool_aui_row.reuse(_jspx_th_aui_row_0);
          return;
        }
        _jspx_tagPool_aui_row.reuse(_jspx_th_aui_row_0);
        out.write("\n\t\t");
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write("\n\n\t\t");
      //  aui:row
      com.liferay.taglib.aui.RowTag _jspx_th_aui_row_1 = (com.liferay.taglib.aui.RowTag) _jspx_tagPool_aui_row.get(com.liferay.taglib.aui.RowTag.class);
      _jspx_th_aui_row_1.setPageContext(_jspx_page_context);
      _jspx_th_aui_row_1.setParent(null);
      int _jspx_eval_aui_row_1 = _jspx_th_aui_row_1.doStartTag();
      if (_jspx_eval_aui_row_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n\t\t\t");
        //  aui:col
        com.liferay.taglib.aui.ColTag _jspx_th_aui_col_1 = (com.liferay.taglib.aui.ColTag) _jspx_tagPool_aui_col_width.get(com.liferay.taglib.aui.ColTag.class);
        _jspx_th_aui_col_1.setPageContext(_jspx_page_context);
        _jspx_th_aui_col_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_row_1);
        _jspx_th_aui_col_1.setWidth( 33 );
        int _jspx_eval_aui_col_1 = _jspx_th_aui_col_1.doStartTag();
        if (_jspx_eval_aui_col_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n\t\t\t\t");
          //  aui:select
          com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_0 = (com.liferay.taglib.aui.SelectTag) _jspx_tagPool_aui_select_value_name_label.get(com.liferay.taglib.aui.SelectTag.class);
          _jspx_th_aui_select_0.setPageContext(_jspx_page_context);
          _jspx_th_aui_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_col_1);
          _jspx_th_aui_select_0.setLabel("maximum-items-to-display");
          _jspx_th_aui_select_0.setName("preferences--rssDelta--");
          _jspx_th_aui_select_0.setValue( delta );
          int _jspx_eval_aui_select_0 = _jspx_th_aui_select_0.doStartTag();
          if (_jspx_eval_aui_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_aui_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_aui_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_aui_select_0.doInitBody();
            }
            do {
              out.write("\n\t\t\t\t\t");
              if (_jspx_meth_aui_option_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t\t\t");
              if (_jspx_meth_aui_option_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t\t\t");
              if (_jspx_meth_aui_option_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t\t\t");
              if (_jspx_meth_aui_option_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t\t\t");
              if (_jspx_meth_aui_option_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t\t\t");
              if (_jspx_meth_aui_option_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t\t\t");
              if (_jspx_meth_aui_option_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t\t\t");
              if (_jspx_meth_aui_option_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t\t\t");
              if (_jspx_meth_aui_option_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t\t\t");
              if (_jspx_meth_aui_option_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t\t\t");
              if (_jspx_meth_aui_option_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t\t\t");
              if (_jspx_meth_aui_option_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t\t\t");
              if (_jspx_meth_aui_option_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t\t\t");
              if (_jspx_meth_aui_option_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t\t\t");
              if (_jspx_meth_aui_option_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t\t\t");
              if (_jspx_meth_aui_option_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t\t\t");
              if (_jspx_meth_aui_option_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_select_0, _jspx_page_context))
                return;
              out.write("\n\t\t\t\t");
              int evalDoAfterBody = _jspx_th_aui_select_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_aui_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_aui_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_aui_select_value_name_label.reuse(_jspx_th_aui_select_0);
            return;
          }
          _jspx_tagPool_aui_select_value_name_label.reuse(_jspx_th_aui_select_0);
          out.write("\n\t\t\t");
        }
        if (_jspx_th_aui_col_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          _jspx_tagPool_aui_col_width.reuse(_jspx_th_aui_col_1);
          return;
        }
        _jspx_tagPool_aui_col_width.reuse(_jspx_th_aui_col_1);
        out.write("\n\n\t\t\t");
        //  aui:col
        com.liferay.taglib.aui.ColTag _jspx_th_aui_col_2 = (com.liferay.taglib.aui.ColTag) _jspx_tagPool_aui_col_width.get(com.liferay.taglib.aui.ColTag.class);
        _jspx_th_aui_col_2.setPageContext(_jspx_page_context);
        _jspx_th_aui_col_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_row_1);
        _jspx_th_aui_col_2.setWidth( 33 );
        int _jspx_eval_aui_col_2 = _jspx_th_aui_col_2.doStartTag();
        if (_jspx_eval_aui_col_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n\t\t\t\t");
          //  aui:select
          com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_1 = (com.liferay.taglib.aui.SelectTag) _jspx_tagPool_aui_select_name_label.get(com.liferay.taglib.aui.SelectTag.class);
          _jspx_th_aui_select_1.setPageContext(_jspx_page_context);
          _jspx_th_aui_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_col_2);
          _jspx_th_aui_select_1.setLabel("display-style");
          _jspx_th_aui_select_1.setName("preferences--rssDisplayStyle--");
          int _jspx_eval_aui_select_1 = _jspx_th_aui_select_1.doStartTag();
          if (_jspx_eval_aui_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_aui_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_aui_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_aui_select_1.doInitBody();
            }
            do {
              out.write("\n\n\t\t\t\t\t");

					for (String curDisplayStyle : displayStyles) {
					
              out.write("\n\n\t\t\t\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_17 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_selected_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
              _jspx_th_aui_option_17.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_1);
              _jspx_th_aui_option_17.setLabel( curDisplayStyle );
              _jspx_th_aui_option_17.setSelected( displayStyle.equals(curDisplayStyle) );
              int _jspx_eval_aui_option_17 = _jspx_th_aui_option_17.doStartTag();
              if (_jspx_th_aui_option_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_aui_option_selected_label_nobody.reuse(_jspx_th_aui_option_17);
                return;
              }
              _jspx_tagPool_aui_option_selected_label_nobody.reuse(_jspx_th_aui_option_17);
              out.write("\n\n\t\t\t\t\t");

					}
					
              out.write("\n\n\t\t\t\t");
              int evalDoAfterBody = _jspx_th_aui_select_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_aui_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_aui_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_aui_select_name_label.reuse(_jspx_th_aui_select_1);
            return;
          }
          _jspx_tagPool_aui_select_name_label.reuse(_jspx_th_aui_select_1);
          out.write("\n\t\t\t");
        }
        if (_jspx_th_aui_col_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          _jspx_tagPool_aui_col_width.reuse(_jspx_th_aui_col_2);
          return;
        }
        _jspx_tagPool_aui_col_width.reuse(_jspx_th_aui_col_2);
        out.write("\n\n\t\t\t");
        //  aui:col
        com.liferay.taglib.aui.ColTag _jspx_th_aui_col_3 = (com.liferay.taglib.aui.ColTag) _jspx_tagPool_aui_col_width.get(com.liferay.taglib.aui.ColTag.class);
        _jspx_th_aui_col_3.setPageContext(_jspx_page_context);
        _jspx_th_aui_col_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_row_1);
        _jspx_th_aui_col_3.setWidth( 33 );
        int _jspx_eval_aui_col_3 = _jspx_th_aui_col_3.doStartTag();
        if (_jspx_eval_aui_col_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n\t\t\t\t");
          //  aui:select
          com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_2 = (com.liferay.taglib.aui.SelectTag) _jspx_tagPool_aui_select_name_label.get(com.liferay.taglib.aui.SelectTag.class);
          _jspx_th_aui_select_2.setPageContext(_jspx_page_context);
          _jspx_th_aui_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_col_3);
          _jspx_th_aui_select_2.setLabel("format");
          _jspx_th_aui_select_2.setName("preferences--rssFeedType--");
          int _jspx_eval_aui_select_2 = _jspx_th_aui_select_2.doStartTag();
          if (_jspx_eval_aui_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_aui_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_aui_select_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_aui_select_2.doInitBody();
            }
            do {
              out.write("\n\n\t\t\t\t\t");

					for (String type : RSSUtil.FEED_TYPES) {
					
              out.write("\n\n\t\t\t\t\t\t");
              //  aui:option
              com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_18 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_value_selected_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
              _jspx_th_aui_option_18.setPageContext(_jspx_page_context);
              _jspx_th_aui_option_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_2);
              _jspx_th_aui_option_18.setLabel( RSSUtil.getFeedTypeName(type) );
              _jspx_th_aui_option_18.setSelected( feedType.equals(type) );
              _jspx_th_aui_option_18.setValue( type );
              int _jspx_eval_aui_option_18 = _jspx_th_aui_option_18.doStartTag();
              if (_jspx_th_aui_option_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _jspx_tagPool_aui_option_value_selected_label_nobody.reuse(_jspx_th_aui_option_18);
                return;
              }
              _jspx_tagPool_aui_option_value_selected_label_nobody.reuse(_jspx_th_aui_option_18);
              out.write("\n\n\t\t\t\t\t");

					}
					
              out.write("\n\n\t\t\t\t");
              int evalDoAfterBody = _jspx_th_aui_select_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_aui_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_aui_select_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_aui_select_name_label.reuse(_jspx_th_aui_select_2);
            return;
          }
          _jspx_tagPool_aui_select_name_label.reuse(_jspx_th_aui_select_2);
          out.write("\n\t\t\t");
        }
        if (_jspx_th_aui_col_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          _jspx_tagPool_aui_col_width.reuse(_jspx_th_aui_col_3);
          return;
        }
        _jspx_tagPool_aui_col_width.reuse(_jspx_th_aui_col_3);
        out.write("\n\t\t");
      }
      if (_jspx_th_aui_row_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_aui_row.reuse(_jspx_th_aui_row_1);
        return;
      }
      _jspx_tagPool_aui_row.reuse(_jspx_th_aui_row_1);
      out.write("\n\t</div>\n</div>\n\n");
      if (_jspx_meth_aui_script_0(_jspx_page_context))
        return;
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_portlet_namespace_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_0 = (com.liferay.taglib.portlet.NamespaceTag) _jspx_tagPool_portlet_namespace_nobody.get(com.liferay.taglib.portlet.NamespaceTag.class);
    _jspx_th_portlet_namespace_0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_0.setParent(null);
    int _jspx_eval_portlet_namespace_0 = _jspx_th_portlet_namespace_0.doStartTag();
    if (_jspx_th_portlet_namespace_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_portlet_namespace_nobody.reuse(_jspx_th_portlet_namespace_0);
      return true;
    }
    _jspx_tagPool_portlet_namespace_nobody.reuse(_jspx_th_portlet_namespace_0);
    return false;
  }

  private boolean _jspx_meth_aui_option_0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_0 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
    _jspx_th_aui_option_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
    _jspx_th_aui_option_0.setLabel(new String("1"));
    int _jspx_eval_aui_option_0 = _jspx_th_aui_option_0.doStartTag();
    if (_jspx_th_aui_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_0);
      return true;
    }
    _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_0);
    return false;
  }

  private boolean _jspx_meth_aui_option_1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_1 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
    _jspx_th_aui_option_1.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
    _jspx_th_aui_option_1.setLabel(new String("2"));
    int _jspx_eval_aui_option_1 = _jspx_th_aui_option_1.doStartTag();
    if (_jspx_th_aui_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_1);
      return true;
    }
    _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_1);
    return false;
  }

  private boolean _jspx_meth_aui_option_2(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_2 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
    _jspx_th_aui_option_2.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
    _jspx_th_aui_option_2.setLabel(new String("3"));
    int _jspx_eval_aui_option_2 = _jspx_th_aui_option_2.doStartTag();
    if (_jspx_th_aui_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_2);
      return true;
    }
    _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_2);
    return false;
  }

  private boolean _jspx_meth_aui_option_3(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_3 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
    _jspx_th_aui_option_3.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
    _jspx_th_aui_option_3.setLabel(new String("4"));
    int _jspx_eval_aui_option_3 = _jspx_th_aui_option_3.doStartTag();
    if (_jspx_th_aui_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_3);
      return true;
    }
    _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_3);
    return false;
  }

  private boolean _jspx_meth_aui_option_4(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_4 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
    _jspx_th_aui_option_4.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
    _jspx_th_aui_option_4.setLabel(new String("5"));
    int _jspx_eval_aui_option_4 = _jspx_th_aui_option_4.doStartTag();
    if (_jspx_th_aui_option_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_4);
      return true;
    }
    _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_4);
    return false;
  }

  private boolean _jspx_meth_aui_option_5(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_5 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
    _jspx_th_aui_option_5.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
    _jspx_th_aui_option_5.setLabel(new String("10"));
    int _jspx_eval_aui_option_5 = _jspx_th_aui_option_5.doStartTag();
    if (_jspx_th_aui_option_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_5);
      return true;
    }
    _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_5);
    return false;
  }

  private boolean _jspx_meth_aui_option_6(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_6 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
    _jspx_th_aui_option_6.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
    _jspx_th_aui_option_6.setLabel(new String("15"));
    int _jspx_eval_aui_option_6 = _jspx_th_aui_option_6.doStartTag();
    if (_jspx_th_aui_option_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_6);
      return true;
    }
    _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_6);
    return false;
  }

  private boolean _jspx_meth_aui_option_7(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_7 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
    _jspx_th_aui_option_7.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
    _jspx_th_aui_option_7.setLabel(new String("20"));
    int _jspx_eval_aui_option_7 = _jspx_th_aui_option_7.doStartTag();
    if (_jspx_th_aui_option_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_7);
      return true;
    }
    _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_7);
    return false;
  }

  private boolean _jspx_meth_aui_option_8(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_8 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
    _jspx_th_aui_option_8.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
    _jspx_th_aui_option_8.setLabel(new String("25"));
    int _jspx_eval_aui_option_8 = _jspx_th_aui_option_8.doStartTag();
    if (_jspx_th_aui_option_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_8);
      return true;
    }
    _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_8);
    return false;
  }

  private boolean _jspx_meth_aui_option_9(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_9 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
    _jspx_th_aui_option_9.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
    _jspx_th_aui_option_9.setLabel(new String("30"));
    int _jspx_eval_aui_option_9 = _jspx_th_aui_option_9.doStartTag();
    if (_jspx_th_aui_option_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_9);
      return true;
    }
    _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_9);
    return false;
  }

  private boolean _jspx_meth_aui_option_10(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_10 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
    _jspx_th_aui_option_10.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
    _jspx_th_aui_option_10.setLabel(new String("40"));
    int _jspx_eval_aui_option_10 = _jspx_th_aui_option_10.doStartTag();
    if (_jspx_th_aui_option_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_10);
      return true;
    }
    _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_10);
    return false;
  }

  private boolean _jspx_meth_aui_option_11(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_11 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
    _jspx_th_aui_option_11.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
    _jspx_th_aui_option_11.setLabel(new String("50"));
    int _jspx_eval_aui_option_11 = _jspx_th_aui_option_11.doStartTag();
    if (_jspx_th_aui_option_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_11);
      return true;
    }
    _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_11);
    return false;
  }

  private boolean _jspx_meth_aui_option_12(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_12 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
    _jspx_th_aui_option_12.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
    _jspx_th_aui_option_12.setLabel(new String("60"));
    int _jspx_eval_aui_option_12 = _jspx_th_aui_option_12.doStartTag();
    if (_jspx_th_aui_option_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_12);
      return true;
    }
    _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_12);
    return false;
  }

  private boolean _jspx_meth_aui_option_13(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_13 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
    _jspx_th_aui_option_13.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
    _jspx_th_aui_option_13.setLabel(new String("70"));
    int _jspx_eval_aui_option_13 = _jspx_th_aui_option_13.doStartTag();
    if (_jspx_th_aui_option_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_13);
      return true;
    }
    _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_13);
    return false;
  }

  private boolean _jspx_meth_aui_option_14(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_14 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
    _jspx_th_aui_option_14.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
    _jspx_th_aui_option_14.setLabel(new String("80"));
    int _jspx_eval_aui_option_14 = _jspx_th_aui_option_14.doStartTag();
    if (_jspx_th_aui_option_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_14);
      return true;
    }
    _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_14);
    return false;
  }

  private boolean _jspx_meth_aui_option_15(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_15 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
    _jspx_th_aui_option_15.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
    _jspx_th_aui_option_15.setLabel(new String("90"));
    int _jspx_eval_aui_option_15 = _jspx_th_aui_option_15.doStartTag();
    if (_jspx_th_aui_option_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_15);
      return true;
    }
    _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_15);
    return false;
  }

  private boolean _jspx_meth_aui_option_16(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_select_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:option
    com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_16 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
    _jspx_th_aui_option_16.setPageContext(_jspx_page_context);
    _jspx_th_aui_option_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
    _jspx_th_aui_option_16.setLabel(new String("100"));
    int _jspx_eval_aui_option_16 = _jspx_th_aui_option_16.doStartTag();
    if (_jspx_th_aui_option_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_16);
      return true;
    }
    _jspx_tagPool_aui_option_label_nobody.reuse(_jspx_th_aui_option_16);
    return false;
  }

  private boolean _jspx_meth_aui_script_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  aui:script
    com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_0 = (com.liferay.taglib.aui.ScriptTag) _jspx_tagPool_aui_script.get(com.liferay.taglib.aui.ScriptTag.class);
    _jspx_th_aui_script_0.setPageContext(_jspx_page_context);
    _jspx_th_aui_script_0.setParent(null);
    int _jspx_eval_aui_script_0 = _jspx_th_aui_script_0.doStartTag();
    if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_aui_script_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_aui_script_0.doInitBody();
      }
      do {
        out.write("\n\tLiferay.Util.toggleBoxes('");
        if (_jspx_meth_portlet_namespace_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
          return true;
        out.write("enableRss','");
        if (_jspx_meth_portlet_namespace_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_script_0, _jspx_page_context))
          return true;
        out.write("rssOptions');\n");
        int evalDoAfterBody = _jspx_th_aui_script_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_aui_script_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_aui_script.reuse(_jspx_th_aui_script_0);
      return true;
    }
    _jspx_tagPool_aui_script.reuse(_jspx_th_aui_script_0);
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_1 = (com.liferay.taglib.portlet.NamespaceTag) _jspx_tagPool_portlet_namespace_nobody.get(com.liferay.taglib.portlet.NamespaceTag.class);
    _jspx_th_portlet_namespace_1.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_1 = _jspx_th_portlet_namespace_1.doStartTag();
    if (_jspx_th_portlet_namespace_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_portlet_namespace_nobody.reuse(_jspx_th_portlet_namespace_1);
      return true;
    }
    _jspx_tagPool_portlet_namespace_nobody.reuse(_jspx_th_portlet_namespace_1);
    return false;
  }

  private boolean _jspx_meth_portlet_namespace_2(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_script_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_2 = (com.liferay.taglib.portlet.NamespaceTag) _jspx_tagPool_portlet_namespace_nobody.get(com.liferay.taglib.portlet.NamespaceTag.class);
    _jspx_th_portlet_namespace_2.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_script_0);
    int _jspx_eval_portlet_namespace_2 = _jspx_th_portlet_namespace_2.doStartTag();
    if (_jspx_th_portlet_namespace_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_portlet_namespace_nobody.reuse(_jspx_th_portlet_namespace_2);
      return true;
    }
    _jspx_tagPool_portlet_namespace_nobody.reuse(_jspx_th_portlet_namespace_2);
    return false;
  }
}