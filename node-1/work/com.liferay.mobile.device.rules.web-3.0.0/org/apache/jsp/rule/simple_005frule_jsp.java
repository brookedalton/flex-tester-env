package org.apache.jsp.rule;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.frontend.taglib.clay.servlet.taglib.util.JSPNavigationItemList;
import com.liferay.mobile.device.rules.action.ActionHandler;
import com.liferay.mobile.device.rules.action.ActionHandlerManagerUtil;
import com.liferay.mobile.device.rules.constants.MDRPortletKeys;
import com.liferay.mobile.device.rules.exception.ActionTypeException;
import com.liferay.mobile.device.rules.exception.NoSuchActionException;
import com.liferay.mobile.device.rules.exception.NoSuchRuleException;
import com.liferay.mobile.device.rules.exception.NoSuchRuleGroupException;
import com.liferay.mobile.device.rules.exception.NoSuchRuleGroupInstanceException;
import com.liferay.mobile.device.rules.model.MDRAction;
import com.liferay.mobile.device.rules.model.MDRRule;
import com.liferay.mobile.device.rules.model.MDRRuleGroup;
import com.liferay.mobile.device.rules.model.MDRRuleGroupInstance;
import com.liferay.mobile.device.rules.rule.RuleGroupProcessorUtil;
import com.liferay.mobile.device.rules.rule.UnknownRuleHandlerException;
import com.liferay.mobile.device.rules.service.MDRActionLocalServiceUtil;
import com.liferay.mobile.device.rules.service.MDRRuleGroupInstanceLocalServiceUtil;
import com.liferay.mobile.device.rules.service.MDRRuleGroupInstanceServiceUtil;
import com.liferay.mobile.device.rules.service.MDRRuleGroupLocalServiceUtil;
import com.liferay.mobile.device.rules.service.MDRRuleLocalServiceUtil;
import com.liferay.mobile.device.rules.util.comparator.RuleCreateDateComparator;
import com.liferay.mobile.device.rules.util.comparator.RuleGroupInstancePriorityComparator;
import com.liferay.mobile.device.rules.web.internal.constants.MDRWebKeys;
import com.liferay.mobile.device.rules.web.internal.display.context.MDRActionDisplayContext;
import com.liferay.mobile.device.rules.web.internal.rule.group.rule.SimpleRuleHandler;
import com.liferay.mobile.device.rules.web.internal.search.RuleGroupChecker;
import com.liferay.mobile.device.rules.web.internal.search.RuleGroupDisplayTerms;
import com.liferay.mobile.device.rules.web.internal.search.RuleGroupSearch;
import com.liferay.mobile.device.rules.web.internal.search.RuleGroupSearchTerms;
import com.liferay.mobile.device.rules.web.internal.security.permission.resource.MDRPermission;
import com.liferay.mobile.device.rules.web.internal.security.permission.resource.MDRRuleGroupInstancePermission;
import com.liferay.mobile.device.rules.web.internal.security.permission.resource.MDRRuleGroupPermission;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.bean.BeanParamUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.search.ResultRow;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.language.UnicodeLanguageUtil;
import com.liferay.portal.kernel.mobile.device.DeviceDetectionUtil;
import com.liferay.portal.kernel.mobile.device.VersionableName;
import com.liferay.portal.kernel.model.ColorScheme;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.LayoutConstants;
import com.liferay.portal.kernel.model.LayoutSet;
import com.liferay.portal.kernel.model.Theme;
import com.liferay.portal.kernel.plugin.PluginPackage;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.PortletURLUtil;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.GroupServiceUtil;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.service.LayoutServiceUtil;
import com.liferay.portal.kernel.service.LayoutSetLocalServiceUtil;
import com.liferay.portal.kernel.service.LayoutTemplateLocalServiceUtil;
import com.liferay.portal.kernel.service.ThemeLocalServiceUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.HttpUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.util.PropsValues;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;

public final class simple_005frule_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/init-ext.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_option_value_selected_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_col_width;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_row;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1ui_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1theme_defineObjects_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_option_selected_label_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_liferay$1frontend_defineObjects_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_fieldset_markupView_label_collapsible_collapsed;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_select_name_multiple;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_aui_select_name_label;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_portlet_defineObjects_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_aui_option_value_selected_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_col_width = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_row = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_liferay$1ui_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_liferay$1theme_defineObjects_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_option_selected_label_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_liferay$1frontend_defineObjects_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_fieldset_markupView_label_collapsible_collapsed = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_select_name_multiple = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_aui_select_name_label = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_portlet_defineObjects_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_aui_option_value_selected_label_nobody.release();
    _jspx_tagPool_aui_col_width.release();
    _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.release();
    _jspx_tagPool_aui_row.release();
    _jspx_tagPool_liferay$1ui_message_key_nobody.release();
    _jspx_tagPool_liferay$1theme_defineObjects_nobody.release();
    _jspx_tagPool_aui_option_selected_label_nobody.release();
    _jspx_tagPool_liferay$1frontend_defineObjects_nobody.release();
    _jspx_tagPool_aui_fieldset_markupView_label_collapsible_collapsed.release();
    _jspx_tagPool_aui_select_name_multiple.release();
    _jspx_tagPool_aui_select_name_label.release();
    _jspx_tagPool_portlet_defineObjects_nobody.release();
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
      out.write("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
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
      out.write('\n');
      out.write('\n');

long groupId = ParamUtil.getLong(request, "groupId", themeDisplay.getSiteGroupId());

portletDisplay.setShowExportImportIcon(false);
portletDisplay.setShowStagingIcon(false);

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

MDRRule rule = (MDRRule)request.getAttribute(MDRWebKeys.MOBILE_DEVICE_RULES_RULE);

Set<String> operatingSystems = Collections.emptySet();
int tablet = 0;

String screenPhysicalHeightMax = StringPool.BLANK;
String screenPhysicalHeightMin = StringPool.BLANK;
String screenPhysicalWidthMax = StringPool.BLANK;
String screenPhysicalWidthMin = StringPool.BLANK;

String screenResolutionHeightMax = StringPool.BLANK;
String screenResolutionHeightMin = StringPool.BLANK;
String screenResolutionWidthMax = StringPool.BLANK;
String screenResolutionWidthMin = StringPool.BLANK;

if (rule != null) {
	UnicodeProperties typeSettingsProperties = rule.getTypeSettingsProperties();

	operatingSystems = SetUtil.fromArray(StringUtil.split(typeSettingsProperties.get(SimpleRuleHandler.PROPERTY_OS)));

	String tabletString = GetterUtil.getString(typeSettingsProperties.get(SimpleRuleHandler.PROPERTY_TABLET));

	if (tabletString.equals(StringPool.TRUE)) {
		tablet = 1;
	}
	else if (tabletString.equals(StringPool.FALSE)) {
		tablet = 2;
	}

	screenPhysicalHeightMax = GetterUtil.getString(typeSettingsProperties.get(SimpleRuleHandler.PROPERTY_SCREEN_PHYSICAL_HEIGHT_MAX));
	screenPhysicalHeightMin = GetterUtil.getString(typeSettingsProperties.get(SimpleRuleHandler.PROPERTY_SCREEN_PHYSICAL_HEIGHT_MIN));
	screenPhysicalWidthMax = GetterUtil.getString(typeSettingsProperties.get(SimpleRuleHandler.PROPERTY_SCREEN_PHYSICAL_WIDTH_MAX));
	screenPhysicalWidthMin = GetterUtil.getString(typeSettingsProperties.get(SimpleRuleHandler.PROPERTY_SCREEN_PHYSICAL_WIDTH_MIN));

	screenResolutionHeightMax = GetterUtil.getString(typeSettingsProperties.get(SimpleRuleHandler.PROPERTY_SCREEN_RESOLUTION_HEIGHT_MAX));
	screenResolutionHeightMin = GetterUtil.getString(typeSettingsProperties.get(SimpleRuleHandler.PROPERTY_SCREEN_RESOLUTION_HEIGHT_MIN));
	screenResolutionWidthMax = GetterUtil.getString(typeSettingsProperties.get(SimpleRuleHandler.PROPERTY_SCREEN_RESOLUTION_WIDTH_MAX));
	screenResolutionWidthMin = GetterUtil.getString(typeSettingsProperties.get(SimpleRuleHandler.PROPERTY_SCREEN_RESOLUTION_WIDTH_MIN));
}

      out.write('\n');
      out.write('\n');
      //  aui:fieldset
      com.liferay.taglib.aui.FieldsetTag _jspx_th_aui_fieldset_0 = (com.liferay.taglib.aui.FieldsetTag) _jspx_tagPool_aui_fieldset_markupView_label_collapsible_collapsed.get(com.liferay.taglib.aui.FieldsetTag.class);
      _jspx_th_aui_fieldset_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_fieldset_0.setParent(null);
      _jspx_th_aui_fieldset_0.setCollapsed( true );
      _jspx_th_aui_fieldset_0.setCollapsible( true );
      _jspx_th_aui_fieldset_0.setLabel("operating-system-and-type");
      _jspx_th_aui_fieldset_0.setMarkupView("lexicon");
      int _jspx_eval_aui_fieldset_0 = _jspx_th_aui_fieldset_0.doStartTag();
      if (_jspx_eval_aui_fieldset_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
        //  aui:select
        com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_0 = (com.liferay.taglib.aui.SelectTag) _jspx_tagPool_aui_select_name_multiple.get(com.liferay.taglib.aui.SelectTag.class);
        _jspx_th_aui_select_0.setPageContext(_jspx_page_context);
        _jspx_th_aui_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
        _jspx_th_aui_select_0.setMultiple( true );
        _jspx_th_aui_select_0.setName("os");
        int _jspx_eval_aui_select_0 = _jspx_th_aui_select_0.doStartTag();
        if (_jspx_eval_aui_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_aui_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.pushBody();
            _jspx_th_aui_select_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
            _jspx_th_aui_select_0.doInitBody();
          }
          do {
            out.write("\n\t\t");
            //  aui:option
            com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_0 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_value_selected_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
            _jspx_th_aui_option_0.setPageContext(_jspx_page_context);
            _jspx_th_aui_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
            _jspx_th_aui_option_0.setLabel(new String("any-os"));
            _jspx_th_aui_option_0.setSelected( operatingSystems.isEmpty() );
            _jspx_th_aui_option_0.setValue(new String(""));
            int _jspx_eval_aui_option_0 = _jspx_th_aui_option_0.doStartTag();
            if (_jspx_th_aui_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_aui_option_value_selected_label_nobody.reuse(_jspx_th_aui_option_0);
              return;
            }
            _jspx_tagPool_aui_option_value_selected_label_nobody.reuse(_jspx_th_aui_option_0);
            out.write("\n\n\t\t");

		Set<VersionableName> knownOperationSystems = DeviceDetectionUtil.getKnownOperatingSystems();

		for (VersionableName knownOperationSystem : knownOperationSystems) {
		
            out.write("\n\n\t\t\t");
            //  aui:option
            com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_1 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_selected_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
            _jspx_th_aui_option_1.setPageContext(_jspx_page_context);
            _jspx_th_aui_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_0);
            _jspx_th_aui_option_1.setLabel( knownOperationSystem.getName() );
            _jspx_th_aui_option_1.setSelected( operatingSystems.contains(knownOperationSystem.getName()) );
            int _jspx_eval_aui_option_1 = _jspx_th_aui_option_1.doStartTag();
            if (_jspx_th_aui_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_aui_option_selected_label_nobody.reuse(_jspx_th_aui_option_1);
              return;
            }
            _jspx_tagPool_aui_option_selected_label_nobody.reuse(_jspx_th_aui_option_1);
            out.write("\n\n\t\t");

		}
		
            out.write("\n\n\t");
            int evalDoAfterBody = _jspx_th_aui_select_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
          if (_jspx_eval_aui_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
            out = _jspx_page_context.popBody();
        }
        if (_jspx_th_aui_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          _jspx_tagPool_aui_select_name_multiple.reuse(_jspx_th_aui_select_0);
          return;
        }
        _jspx_tagPool_aui_select_name_multiple.reuse(_jspx_th_aui_select_0);
        out.write("\n\n\t");
        //  aui:select
        com.liferay.taglib.aui.SelectTag _jspx_th_aui_select_1 = (com.liferay.taglib.aui.SelectTag) _jspx_tagPool_aui_select_name_label.get(com.liferay.taglib.aui.SelectTag.class);
        _jspx_th_aui_select_1.setPageContext(_jspx_page_context);
        _jspx_th_aui_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_0);
        _jspx_th_aui_select_1.setLabel("device-type");
        _jspx_th_aui_select_1.setName("tablet");
        int _jspx_eval_aui_select_1 = _jspx_th_aui_select_1.doStartTag();
        if (_jspx_eval_aui_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          if (_jspx_eval_aui_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
            out = _jspx_page_context.pushBody();
            _jspx_th_aui_select_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
            _jspx_th_aui_select_1.doInitBody();
          }
          do {
            out.write("\n\t\t");
            //  aui:option
            com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_2 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_value_selected_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
            _jspx_th_aui_option_2.setPageContext(_jspx_page_context);
            _jspx_th_aui_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_1);
            _jspx_th_aui_option_2.setLabel(new String("any"));
            _jspx_th_aui_option_2.setSelected( tablet == 0 );
            _jspx_th_aui_option_2.setValue(new String(""));
            int _jspx_eval_aui_option_2 = _jspx_th_aui_option_2.doStartTag();
            if (_jspx_th_aui_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_aui_option_value_selected_label_nobody.reuse(_jspx_th_aui_option_2);
              return;
            }
            _jspx_tagPool_aui_option_value_selected_label_nobody.reuse(_jspx_th_aui_option_2);
            out.write("\n\t\t");
            //  aui:option
            com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_3 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_value_selected_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
            _jspx_th_aui_option_3.setPageContext(_jspx_page_context);
            _jspx_th_aui_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_1);
            _jspx_th_aui_option_3.setLabel(new String("tablets"));
            _jspx_th_aui_option_3.setSelected( tablet == 1 );
            _jspx_th_aui_option_3.setValue( true );
            int _jspx_eval_aui_option_3 = _jspx_th_aui_option_3.doStartTag();
            if (_jspx_th_aui_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_aui_option_value_selected_label_nobody.reuse(_jspx_th_aui_option_3);
              return;
            }
            _jspx_tagPool_aui_option_value_selected_label_nobody.reuse(_jspx_th_aui_option_3);
            out.write("\n\t\t");
            //  aui:option
            com.liferay.taglib.aui.OptionTag _jspx_th_aui_option_4 = (com.liferay.taglib.aui.OptionTag) _jspx_tagPool_aui_option_value_selected_label_nobody.get(com.liferay.taglib.aui.OptionTag.class);
            _jspx_th_aui_option_4.setPageContext(_jspx_page_context);
            _jspx_th_aui_option_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_select_1);
            _jspx_th_aui_option_4.setLabel(new String("other-devices"));
            _jspx_th_aui_option_4.setSelected( tablet == 2 );
            _jspx_th_aui_option_4.setValue( false );
            int _jspx_eval_aui_option_4 = _jspx_th_aui_option_4.doStartTag();
            if (_jspx_th_aui_option_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_aui_option_value_selected_label_nobody.reuse(_jspx_th_aui_option_4);
              return;
            }
            _jspx_tagPool_aui_option_value_selected_label_nobody.reuse(_jspx_th_aui_option_4);
            out.write('\n');
            out.write('	');
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
        out.write('\n');
      }
      if (_jspx_th_aui_fieldset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_aui_fieldset_markupView_label_collapsible_collapsed.reuse(_jspx_th_aui_fieldset_0);
        return;
      }
      _jspx_tagPool_aui_fieldset_markupView_label_collapsible_collapsed.reuse(_jspx_th_aui_fieldset_0);
      out.write('\n');
      out.write('\n');
      //  aui:fieldset
      com.liferay.taglib.aui.FieldsetTag _jspx_th_aui_fieldset_1 = (com.liferay.taglib.aui.FieldsetTag) _jspx_tagPool_aui_fieldset_markupView_label_collapsible_collapsed.get(com.liferay.taglib.aui.FieldsetTag.class);
      _jspx_th_aui_fieldset_1.setPageContext(_jspx_page_context);
      _jspx_th_aui_fieldset_1.setParent(null);
      _jspx_th_aui_fieldset_1.setCollapsed( true );
      _jspx_th_aui_fieldset_1.setCollapsible( true );
      _jspx_th_aui_fieldset_1.setLabel("physical-screen-size");
      _jspx_th_aui_fieldset_1.setMarkupView("lexicon");
      int _jspx_eval_aui_fieldset_1 = _jspx_th_aui_fieldset_1.doStartTag();
      if (_jspx_eval_aui_fieldset_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
        //  aui:row
        com.liferay.taglib.aui.RowTag _jspx_th_aui_row_0 = (com.liferay.taglib.aui.RowTag) _jspx_tagPool_aui_row.get(com.liferay.taglib.aui.RowTag.class);
        _jspx_th_aui_row_0.setPageContext(_jspx_page_context);
        _jspx_th_aui_row_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_1);
        int _jspx_eval_aui_row_0 = _jspx_th_aui_row_0.doStartTag();
        if (_jspx_eval_aui_row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n\t\t");
          //  aui:col
          com.liferay.taglib.aui.ColTag _jspx_th_aui_col_0 = (com.liferay.taglib.aui.ColTag) _jspx_tagPool_aui_col_width.get(com.liferay.taglib.aui.ColTag.class);
          _jspx_th_aui_col_0.setPageContext(_jspx_page_context);
          _jspx_th_aui_col_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_row_0);
          _jspx_th_aui_col_0.setWidth( 50 );
          int _jspx_eval_aui_col_0 = _jspx_th_aui_col_0.doStartTag();
          if (_jspx_eval_aui_col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n\t\t\t<h5>");
            if (_jspx_meth_liferay$1ui_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_col_0, _jspx_page_context))
              return;
            out.write("</h5>\n\n\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_0 = (com.liferay.taglib.aui.InputTag) _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.get(com.liferay.taglib.aui.InputTag.class);
            _jspx_th_aui_input_0.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_col_0);
            _jspx_th_aui_input_0.setCssClass("aui-field-digits physical-screen-size-field");
            _jspx_th_aui_input_0.setId( SimpleRuleHandler.PROPERTY_SCREEN_PHYSICAL_WIDTH_MIN );
            _jspx_th_aui_input_0.setInlineField( true );
            _jspx_th_aui_input_0.setLabel("width");
            _jspx_th_aui_input_0.setName( SimpleRuleHandler.PROPERTY_SCREEN_PHYSICAL_WIDTH_MIN );
            _jspx_th_aui_input_0.setPlaceholder("mm");
            _jspx_th_aui_input_0.setValue( screenPhysicalWidthMin );
            int _jspx_eval_aui_input_0 = _jspx_th_aui_input_0.doStartTag();
            if (_jspx_th_aui_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.reuse(_jspx_th_aui_input_0);
              return;
            }
            _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.reuse(_jspx_th_aui_input_0);
            out.write("\n\n\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_1 = (com.liferay.taglib.aui.InputTag) _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.get(com.liferay.taglib.aui.InputTag.class);
            _jspx_th_aui_input_1.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_col_0);
            _jspx_th_aui_input_1.setCssClass("aui-field-digits physical-screen-size-field-field");
            _jspx_th_aui_input_1.setId( SimpleRuleHandler.PROPERTY_SCREEN_PHYSICAL_HEIGHT_MIN );
            _jspx_th_aui_input_1.setInlineField( true );
            _jspx_th_aui_input_1.setLabel("height");
            _jspx_th_aui_input_1.setName( SimpleRuleHandler.PROPERTY_SCREEN_PHYSICAL_HEIGHT_MIN );
            _jspx_th_aui_input_1.setPlaceholder("mm");
            _jspx_th_aui_input_1.setValue( screenPhysicalHeightMin );
            int _jspx_eval_aui_input_1 = _jspx_th_aui_input_1.doStartTag();
            if (_jspx_th_aui_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.reuse(_jspx_th_aui_input_1);
              return;
            }
            _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.reuse(_jspx_th_aui_input_1);
            out.write("\n\t\t");
          }
          if (_jspx_th_aui_col_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_aui_col_width.reuse(_jspx_th_aui_col_0);
            return;
          }
          _jspx_tagPool_aui_col_width.reuse(_jspx_th_aui_col_0);
          out.write("\n\n\t\t");
          //  aui:col
          com.liferay.taglib.aui.ColTag _jspx_th_aui_col_1 = (com.liferay.taglib.aui.ColTag) _jspx_tagPool_aui_col_width.get(com.liferay.taglib.aui.ColTag.class);
          _jspx_th_aui_col_1.setPageContext(_jspx_page_context);
          _jspx_th_aui_col_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_row_0);
          _jspx_th_aui_col_1.setWidth( 50 );
          int _jspx_eval_aui_col_1 = _jspx_th_aui_col_1.doStartTag();
          if (_jspx_eval_aui_col_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n\t\t\t<h5>");
            if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_col_1, _jspx_page_context))
              return;
            out.write("</h5>\n\n\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_2 = (com.liferay.taglib.aui.InputTag) _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.get(com.liferay.taglib.aui.InputTag.class);
            _jspx_th_aui_input_2.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_col_1);
            _jspx_th_aui_input_2.setCssClass("aui-field-digits physical-physical-screen-size-field-field");
            _jspx_th_aui_input_2.setId( SimpleRuleHandler.PROPERTY_SCREEN_PHYSICAL_WIDTH_MAX );
            _jspx_th_aui_input_2.setInlineField( true );
            _jspx_th_aui_input_2.setLabel("width");
            _jspx_th_aui_input_2.setName( SimpleRuleHandler.PROPERTY_SCREEN_PHYSICAL_WIDTH_MAX );
            _jspx_th_aui_input_2.setPlaceholder("mm");
            _jspx_th_aui_input_2.setValue( screenPhysicalWidthMax );
            int _jspx_eval_aui_input_2 = _jspx_th_aui_input_2.doStartTag();
            if (_jspx_th_aui_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.reuse(_jspx_th_aui_input_2);
              return;
            }
            _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.reuse(_jspx_th_aui_input_2);
            out.write("\n\n\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_3 = (com.liferay.taglib.aui.InputTag) _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.get(com.liferay.taglib.aui.InputTag.class);
            _jspx_th_aui_input_3.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_col_1);
            _jspx_th_aui_input_3.setCssClass("aui-field-digits screen-physical-size-field-field");
            _jspx_th_aui_input_3.setId( SimpleRuleHandler.PROPERTY_SCREEN_PHYSICAL_HEIGHT_MAX );
            _jspx_th_aui_input_3.setInlineField( true );
            _jspx_th_aui_input_3.setLabel("height");
            _jspx_th_aui_input_3.setName( SimpleRuleHandler.PROPERTY_SCREEN_PHYSICAL_HEIGHT_MAX );
            _jspx_th_aui_input_3.setPlaceholder("mm");
            _jspx_th_aui_input_3.setValue( screenPhysicalHeightMax );
            int _jspx_eval_aui_input_3 = _jspx_th_aui_input_3.doStartTag();
            if (_jspx_th_aui_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.reuse(_jspx_th_aui_input_3);
              return;
            }
            _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.reuse(_jspx_th_aui_input_3);
            out.write("\n\t\t");
          }
          if (_jspx_th_aui_col_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_aui_col_width.reuse(_jspx_th_aui_col_1);
            return;
          }
          _jspx_tagPool_aui_col_width.reuse(_jspx_th_aui_col_1);
          out.write('\n');
          out.write('	');
        }
        if (_jspx_th_aui_row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          _jspx_tagPool_aui_row.reuse(_jspx_th_aui_row_0);
          return;
        }
        _jspx_tagPool_aui_row.reuse(_jspx_th_aui_row_0);
        out.write('\n');
      }
      if (_jspx_th_aui_fieldset_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_aui_fieldset_markupView_label_collapsible_collapsed.reuse(_jspx_th_aui_fieldset_1);
        return;
      }
      _jspx_tagPool_aui_fieldset_markupView_label_collapsible_collapsed.reuse(_jspx_th_aui_fieldset_1);
      out.write('\n');
      out.write('\n');
      //  aui:fieldset
      com.liferay.taglib.aui.FieldsetTag _jspx_th_aui_fieldset_2 = (com.liferay.taglib.aui.FieldsetTag) _jspx_tagPool_aui_fieldset_markupView_label_collapsible_collapsed.get(com.liferay.taglib.aui.FieldsetTag.class);
      _jspx_th_aui_fieldset_2.setPageContext(_jspx_page_context);
      _jspx_th_aui_fieldset_2.setParent(null);
      _jspx_th_aui_fieldset_2.setCollapsed( true );
      _jspx_th_aui_fieldset_2.setCollapsible( true );
      _jspx_th_aui_fieldset_2.setLabel("screen-resolution");
      _jspx_th_aui_fieldset_2.setMarkupView("lexicon");
      int _jspx_eval_aui_fieldset_2 = _jspx_th_aui_fieldset_2.doStartTag();
      if (_jspx_eval_aui_fieldset_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write('\n');
        out.write('	');
        //  aui:row
        com.liferay.taglib.aui.RowTag _jspx_th_aui_row_1 = (com.liferay.taglib.aui.RowTag) _jspx_tagPool_aui_row.get(com.liferay.taglib.aui.RowTag.class);
        _jspx_th_aui_row_1.setPageContext(_jspx_page_context);
        _jspx_th_aui_row_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_fieldset_2);
        int _jspx_eval_aui_row_1 = _jspx_th_aui_row_1.doStartTag();
        if (_jspx_eval_aui_row_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n\t\t");
          //  aui:col
          com.liferay.taglib.aui.ColTag _jspx_th_aui_col_2 = (com.liferay.taglib.aui.ColTag) _jspx_tagPool_aui_col_width.get(com.liferay.taglib.aui.ColTag.class);
          _jspx_th_aui_col_2.setPageContext(_jspx_page_context);
          _jspx_th_aui_col_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_row_1);
          _jspx_th_aui_col_2.setWidth( 50 );
          int _jspx_eval_aui_col_2 = _jspx_th_aui_col_2.doStartTag();
          if (_jspx_eval_aui_col_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n\t\t\t<h5>");
            if (_jspx_meth_liferay$1ui_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_col_2, _jspx_page_context))
              return;
            out.write("</h5>\n\n\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_4 = (com.liferay.taglib.aui.InputTag) _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.get(com.liferay.taglib.aui.InputTag.class);
            _jspx_th_aui_input_4.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_col_2);
            _jspx_th_aui_input_4.setCssClass("aui-field-digits screen-resolution-field");
            _jspx_th_aui_input_4.setId( SimpleRuleHandler.PROPERTY_SCREEN_RESOLUTION_WIDTH_MIN );
            _jspx_th_aui_input_4.setInlineField( true );
            _jspx_th_aui_input_4.setLabel("width");
            _jspx_th_aui_input_4.setName( SimpleRuleHandler.PROPERTY_SCREEN_RESOLUTION_WIDTH_MIN );
            _jspx_th_aui_input_4.setPlaceholder("px");
            _jspx_th_aui_input_4.setValue( screenResolutionWidthMin );
            int _jspx_eval_aui_input_4 = _jspx_th_aui_input_4.doStartTag();
            if (_jspx_th_aui_input_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.reuse(_jspx_th_aui_input_4);
              return;
            }
            _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.reuse(_jspx_th_aui_input_4);
            out.write("\n\n\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_5 = (com.liferay.taglib.aui.InputTag) _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.get(com.liferay.taglib.aui.InputTag.class);
            _jspx_th_aui_input_5.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_col_2);
            _jspx_th_aui_input_5.setCssClass("aui-field-digits screen-resolution-field");
            _jspx_th_aui_input_5.setId( SimpleRuleHandler.PROPERTY_SCREEN_RESOLUTION_HEIGHT_MIN );
            _jspx_th_aui_input_5.setInlineField( true );
            _jspx_th_aui_input_5.setLabel("height");
            _jspx_th_aui_input_5.setName( SimpleRuleHandler.PROPERTY_SCREEN_RESOLUTION_HEIGHT_MIN );
            _jspx_th_aui_input_5.setPlaceholder("px");
            _jspx_th_aui_input_5.setValue( screenResolutionHeightMin );
            int _jspx_eval_aui_input_5 = _jspx_th_aui_input_5.doStartTag();
            if (_jspx_th_aui_input_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.reuse(_jspx_th_aui_input_5);
              return;
            }
            _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.reuse(_jspx_th_aui_input_5);
            out.write("\n\t\t");
          }
          if (_jspx_th_aui_col_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_aui_col_width.reuse(_jspx_th_aui_col_2);
            return;
          }
          _jspx_tagPool_aui_col_width.reuse(_jspx_th_aui_col_2);
          out.write("\n\n\t\t");
          //  aui:col
          com.liferay.taglib.aui.ColTag _jspx_th_aui_col_3 = (com.liferay.taglib.aui.ColTag) _jspx_tagPool_aui_col_width.get(com.liferay.taglib.aui.ColTag.class);
          _jspx_th_aui_col_3.setPageContext(_jspx_page_context);
          _jspx_th_aui_col_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_row_1);
          _jspx_th_aui_col_3.setWidth( 50 );
          int _jspx_eval_aui_col_3 = _jspx_th_aui_col_3.doStartTag();
          if (_jspx_eval_aui_col_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            out.write("\n\t\t\t<h5>");
            if (_jspx_meth_liferay$1ui_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_aui_col_3, _jspx_page_context))
              return;
            out.write("</h5>\n\n\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_6 = (com.liferay.taglib.aui.InputTag) _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.get(com.liferay.taglib.aui.InputTag.class);
            _jspx_th_aui_input_6.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_col_3);
            _jspx_th_aui_input_6.setCssClass("aui-field-digits screen-resolution-field");
            _jspx_th_aui_input_6.setId( SimpleRuleHandler.PROPERTY_SCREEN_RESOLUTION_WIDTH_MAX );
            _jspx_th_aui_input_6.setInlineField( true );
            _jspx_th_aui_input_6.setLabel("width");
            _jspx_th_aui_input_6.setName( SimpleRuleHandler.PROPERTY_SCREEN_RESOLUTION_WIDTH_MAX );
            _jspx_th_aui_input_6.setPlaceholder("px");
            _jspx_th_aui_input_6.setValue( screenResolutionWidthMax );
            int _jspx_eval_aui_input_6 = _jspx_th_aui_input_6.doStartTag();
            if (_jspx_th_aui_input_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.reuse(_jspx_th_aui_input_6);
              return;
            }
            _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.reuse(_jspx_th_aui_input_6);
            out.write("\n\n\t\t\t");
            //  aui:input
            com.liferay.taglib.aui.InputTag _jspx_th_aui_input_7 = (com.liferay.taglib.aui.InputTag) _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.get(com.liferay.taglib.aui.InputTag.class);
            _jspx_th_aui_input_7.setPageContext(_jspx_page_context);
            _jspx_th_aui_input_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_col_3);
            _jspx_th_aui_input_7.setCssClass("aui-field-digits screen-resolution-field");
            _jspx_th_aui_input_7.setId( SimpleRuleHandler.PROPERTY_SCREEN_RESOLUTION_HEIGHT_MAX );
            _jspx_th_aui_input_7.setInlineField( true );
            _jspx_th_aui_input_7.setLabel("height");
            _jspx_th_aui_input_7.setName( SimpleRuleHandler.PROPERTY_SCREEN_RESOLUTION_HEIGHT_MAX );
            _jspx_th_aui_input_7.setPlaceholder("px");
            _jspx_th_aui_input_7.setValue( screenResolutionHeightMax );
            int _jspx_eval_aui_input_7 = _jspx_th_aui_input_7.doStartTag();
            if (_jspx_th_aui_input_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.reuse(_jspx_th_aui_input_7);
              return;
            }
            _jspx_tagPool_aui_input_value_placeholder_name_label_inlineField_id_cssClass_nobody.reuse(_jspx_th_aui_input_7);
            out.write("\n\t\t");
          }
          if (_jspx_th_aui_col_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_aui_col_width.reuse(_jspx_th_aui_col_3);
            return;
          }
          _jspx_tagPool_aui_col_width.reuse(_jspx_th_aui_col_3);
          out.write('\n');
          out.write('	');
        }
        if (_jspx_th_aui_row_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          _jspx_tagPool_aui_row.reuse(_jspx_th_aui_row_1);
          return;
        }
        _jspx_tagPool_aui_row.reuse(_jspx_th_aui_row_1);
        out.write('\n');
      }
      if (_jspx_th_aui_fieldset_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_aui_fieldset_markupView_label_collapsible_collapsed.reuse(_jspx_th_aui_fieldset_2);
        return;
      }
      _jspx_tagPool_aui_fieldset_markupView_label_collapsible_collapsed.reuse(_jspx_th_aui_fieldset_2);
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

  private boolean _jspx_meth_liferay$1ui_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_col_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (com.liferay.taglib.ui.MessageTag) _jspx_tagPool_liferay$1ui_message_key_nobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_col_0);
    _jspx_th_liferay$1ui_message_0.setKey("minimum");
    int _jspx_eval_liferay$1ui_message_0 = _jspx_th_liferay$1ui_message_0.doStartTag();
    if (_jspx_th_liferay$1ui_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_0);
      return true;
    }
    _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_0);
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_col_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (com.liferay.taglib.ui.MessageTag) _jspx_tagPool_liferay$1ui_message_key_nobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_col_1);
    _jspx_th_liferay$1ui_message_1.setKey("maximum");
    int _jspx_eval_liferay$1ui_message_1 = _jspx_th_liferay$1ui_message_1.doStartTag();
    if (_jspx_th_liferay$1ui_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_1);
      return true;
    }
    _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_1);
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_2(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_col_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_2 = (com.liferay.taglib.ui.MessageTag) _jspx_tagPool_liferay$1ui_message_key_nobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay$1ui_message_2.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_col_2);
    _jspx_th_liferay$1ui_message_2.setKey("minimum");
    int _jspx_eval_liferay$1ui_message_2 = _jspx_th_liferay$1ui_message_2.doStartTag();
    if (_jspx_th_liferay$1ui_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_2);
      return true;
    }
    _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_2);
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_aui_col_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_3 = (com.liferay.taglib.ui.MessageTag) _jspx_tagPool_liferay$1ui_message_key_nobody.get(com.liferay.taglib.ui.MessageTag.class);
    _jspx_th_liferay$1ui_message_3.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_col_3);
    _jspx_th_liferay$1ui_message_3.setKey("maximum");
    int _jspx_eval_liferay$1ui_message_3 = _jspx_th_liferay$1ui_message_3.doStartTag();
    if (_jspx_th_liferay$1ui_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_3);
      return true;
    }
    _jspx_tagPool_liferay$1ui_message_key_nobody.reuse(_jspx_th_liferay$1ui_message_3);
    return false;
  }
}