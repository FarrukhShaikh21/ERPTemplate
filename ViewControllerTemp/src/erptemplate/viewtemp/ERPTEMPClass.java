package erptemplate.viewtemp;

import erpglobals.viewglobals.ERPGlobalsClass;

import java.lang.reflect.Method;

import javax.faces.application.FacesMessage;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;

import oracle.adf.controller.ControllerContext;
import oracle.adf.model.BindingContext;
import oracle.adf.model.OperationBinding;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.data.RichListItem;
import oracle.adf.view.rich.component.rich.data.RichListView;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelAccordion;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.event.PopupFetchEvent;
import oracle.adf.view.rich.render.ClientEvent;

import oracle.jbo.ApplicationModule;
import oracle.jbo.JboException;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;


public class ERPTEMPClass {
    public ERPTEMPClass() {
        super();
    }
private String lERPActivityName;
private String lERPActionRuntime;//runtime activite name, this will be opened
private String lERPAllowEdit;
private String lERPAllowAdd;
private String lERPAllowDelete;
private String lERPAllowCancel;
private String lERPAllowSupervise;
private String lERPAllowUnsupervise;
private String lERPIsAllow;
private String lERPAllowEditOther;
private String lERPAllowPrint;
private String lERPAllowScan;
private String lERPModuleAction;//MODULE_ACTION id from SYS_MODULE_DETAIL
private RichOutputText OTERPModuleAction;
private RichLink LNERPSetupActionName;
private RichLink LNERPTransActionName;
private RichLink LNERPReportActionName;
private RichPanelAccordion RPAERPAccordion;
private RichShowDetailItem SDERPSetup;
private RichShowDetailItem SDERPTrans;
private RichShowDetailItem SDERPReport;
private RichListView LVERPSetup;
private RichListView LVERPTrans;
private RichListView LVERPReport;
private RichListItem LIERPSetup;
private RichListItem LIERPTrans;
private RichListItem LIERPReport;
private String ERPUserPicture;
private String ERPShowMenu="Y";
private RichInputText ErpGlobalSearchText;
private Integer ERPTransactionID;
private String lERPGlobalSearchTF;
private String lERPActionRuntimeGlobalSearch;
private String lERPModuleFromMenu="SEC";
private String lERPModuleFromGlobalSearch="";
private Integer lERPCompanyId;
private String[][] lERPModuleActionRights=new String[12][];
    public String getERPUserPicture1() {
        return ERPUserPicture;
    }

    public void setERPShowMenu(String ERPShowMenu) {
        this.ERPShowMenu = ERPShowMenu;
    }

    public String getERPShowMenu() {
        return ERPShowMenu;
    }


    public void setERPUserPicture(String ERPUserPicture) {
        this.ERPUserPicture = ERPUserPicture;
    }

    public String getERPUserPicture() {
       // return "NULL";
        return ERPGlobalsClass.doGetUserPicture();
    }

    public void setLERPAllowScan(String lERPAllowScan) {
        this.lERPAllowScan = lERPAllowScan;
    }

    public String getLERPAllowScan() {
        return lERPAllowScan;
    }

    public void setLIERPSetup(RichListItem LIERPSetup) {
        this.LIERPSetup = LIERPSetup;
    }

    public RichListItem getLIERPSetup() {
        return LIERPSetup;
    }

    public void setLIERPTrans(RichListItem LIERPTrans) {
        this.LIERPTrans = LIERPTrans;
    }

    public RichListItem getLIERPTrans() {
        return LIERPTrans;
    }

    public void setLIERPReport(RichListItem LIERPReport) {
        this.LIERPReport = LIERPReport;
    }

    public RichListItem getLIERPReport() {
        return LIERPReport;
    }

    public void setLVERPSetup(RichListView LVERPSetup) {
        this.LVERPSetup = LVERPSetup;
    }

    public RichListView getLVERPSetup() {
        return LVERPSetup;
    }

    public void setLVERPTrans(RichListView LVERPTrans) {
        this.LVERPTrans = LVERPTrans;
    }

    public RichListView getLVERPTrans() {
        return LVERPTrans;
    }

    public void setLVERPReport(RichListView LVERPReport) {
        this.LVERPReport = LVERPReport;
    }

    public RichListView getLVERPReport() {
        return LVERPReport;
    }

    public void setSDERPSetup(RichShowDetailItem SDERPSetup) {
        this.SDERPSetup = SDERPSetup;
    }

    public RichShowDetailItem getSDERPSetup() {
        return SDERPSetup;
    }

    public void setSDERPTrans(RichShowDetailItem SDERPTrans) {
        this.SDERPTrans = SDERPTrans;
    }

    public RichShowDetailItem getSDERPTrans() {
        return SDERPTrans;
    }

    public void setSDERPReport(RichShowDetailItem SDERPReport) {
        this.SDERPReport = SDERPReport;
    }

    public RichShowDetailItem getSDERPReport() {
        return SDERPReport;
    }

    public void setRPAERPAccordion(RichPanelAccordion RPAERPAccordion) {
        this.RPAERPAccordion = RPAERPAccordion;
    }

    public RichPanelAccordion getRPAERPAccordion() {
        return RPAERPAccordion;
    }



    public void setOTERPModuleAction(RichOutputText OTERPModuleAction) {
        this.OTERPModuleAction = OTERPModuleAction;
    }

    public RichOutputText getOTERPModuleAction() {
        return OTERPModuleAction;
    }

    public void setLERPAllowEdit(String lERPAllowEdit) {
        this.lERPAllowEdit = lERPAllowEdit;
    }

    public String getLERPAllowEdit() {
        return lERPAllowEdit;
    }

    public void setLERPAllowAdd(String lERPAllowAdd) {
        this.lERPAllowAdd = lERPAllowAdd;
    }

    public String getLERPAllowAdd() {
        return lERPAllowAdd;
    }

    public void setLERPAllowDelete(String lERPAllowDelete) {
        this.lERPAllowDelete = lERPAllowDelete;
    }

    public String getLERPAllowDelete() {
        return lERPAllowDelete;
    }

    public void setLERPAllowCancel(String lERPAllowCancel) {
        this.lERPAllowCancel = lERPAllowCancel;
    }

    public String getLERPAllowCancel() {
        return lERPAllowCancel;
    }

    public void setLERPAllowSupervise(String lERPAllowSupervise) {
        this.lERPAllowSupervise = lERPAllowSupervise;
    }

    public String getLERPAllowSupervise() {
        return lERPAllowSupervise;
    }

    public void setLERPAllowUnsupervise(String lERPAllowUnsupervise) {
        this.lERPAllowUnsupervise = lERPAllowUnsupervise;
    }

    public String getLERPAllowUnsupervise() {
        return lERPAllowUnsupervise;
    }


    public void setLERPIsAllow(String lERPIsAllow) {
        this.lERPIsAllow = lERPIsAllow;
    }

    public String getLERPIsAllow() {
        return lERPIsAllow;
    }

    public void setLERPAllowEditOther(String lERPAllowEditOther) {
        this.lERPAllowEditOther = lERPAllowEditOther;
    }

    public String getLERPAllowEditOther() {
        return lERPAllowEditOther;
    }

    public void setLERPModuleAction(String lERPModuleAction) {//MODULE_ACTION id from SYS_MODULE_DETAIL
        this.lERPModuleAction = lERPModuleAction;
    }

    public String getLERPModuleAction() {
        return lERPModuleAction;
    }


    public void setLERPActionRuntime(String lERPActionRuntime) {
        this.lERPActionRuntime = lERPActionRuntime;
    }

    public String getLERPActionRuntime() {
        return lERPActionRuntime;
    }

    public void setLErpActivityName(String lERPActivityName) {
        this.lERPActivityName = lERPActivityName;
    }

    public String getLErpActivityName() {
        return lERPActivityName;
    }


    public String doGotoErpActivity() {
    //System.out.println("lErpActivityRuntime"+"ERP-ACT-"+lErpActivityRuntime);
    return "ERP-ACT-"+lERPActionRuntime;
}


    public void setLNERPSetupActionName(RichLink LNERPSetupActionName) {
        this.LNERPSetupActionName = LNERPSetupActionName;
    }

    public RichLink getLNERPSetupActionName() {
        return LNERPSetupActionName;
    }

    public void setLNERPTransActionName(RichLink LNERPTransActionName) {
        this.LNERPTransActionName = LNERPTransActionName;
    }

    public RichLink getLNERPTransActionName() {
        return LNERPTransActionName;
    }

    public void setLNERPReportActionName(RichLink LNERPReportActionName) {
        this.LNERPReportActionName = LNERPReportActionName;
    }

    public RichLink getLNERPReportActionName() {
        return LNERPReportActionName;
    }


    public void setLERPAllowPrint(String lERPAllowPrint) {
        this.lERPAllowPrint = lERPAllowPrint;
    }

    public String getLERPAllowPrint() {
        return lERPAllowPrint;
    }

    public void doSetErpActivity() {
        System.out.println("i am pressed");
    }

    public String doGetSetupActivity() {
        this.lERPActivityName=getLNERPSetupActionName().getText();
        
        //System.out.println("this-is-doGetSetupActivity");
        this.lERPActivityName=getLNERPTransActionName().getText();
        try {
            //doSetErpActivityRights(); //
            doSetErpActivityRights(getOTERPModuleAction().getValue().toString()); //
        } catch (Exception e) {
            // TODO: Add catch code
            ERPGlobalsClass.doShowERPMessage("You Don't Have Rights on This Activity.", FacesMessage.SEVERITY_INFO);
            return null;
            
        }
        return "doStartERPTaskFlow";///this will start the task flow
    }  
    public String doGetTransActivity() {
        System.out.println("this-is-doGetTransActivity");
        this.lERPActivityName=getLNERPTransActionName().getText();
        try {
            doSetErpActivityRights(getOTERPModuleAction().getValue().toString()); //
            //doSetErpActivityRights(); //
            System.out.println("this-is-doGetTransActivity--finish");
        } catch (Exception e) {
            // TODO: Add catch code
            ERPGlobalsClass.doShowERPMessage("You Don't Have Rights on This Activity.", FacesMessage.SEVERITY_INFO);
            return null;
            
        }
        return "doStartERPTaskFlow";///this will start the task flow
    } 
    public String doGetReportActivity() {
        this.lERPActivityName=getLNERPTransActionName().getText();
        try {
            //doSetErpActivityRights(); //
            doSetErpActivityRights(getOTERPModuleAction().getValue().toString()); //
        } catch (Exception e) {
            // TODO: Add catch code
            ERPGlobalsClass.doShowERPMessage("You Don't Have Rights on This Activity.", FacesMessage.SEVERITY_INFO);
            return null;
            
        }
        return "doStartERPTaskFlow";///this will start the task flow
    }
   
    public String doPrintErpActivity() {
        System.out.println("this.lERPModuleAction:"+this.lERPModuleAction);
        return null;
    }
    
  public static void main(String[] args) {
        String[][] lERPModuleActionRights1=new String[11][];
             
lERPModuleActionRights1[0]=new String[]{"G_ERP_ALLOW_ADD","lERPAllowAdd","setLERPAllowAdd"};
lERPModuleActionRights1[1]=new String[]{"G_ERP_ALLOW_DELETE","lERPAllowDelete","setLERPAllowDelete"};
lERPModuleActionRights1[2]=new String[]{"G_ERP_ACTION_RUNTIME","lERPActionRuntime","setLERPActionRuntime"};    
lERPModuleActionRights1[3]=new String[]{"G_ERP_IS_ALLOW","lERPIsAllow","setLERPIsAllow"};
lERPModuleActionRights1[4]=new String[]{"G_ERP_ALLOW_EDIT","lERPAllowEdit","setLERPAllowEdit"};
lERPModuleActionRights1[5]=new String[]{"G_ERP_ALLOW_SUPERVISE","lERPAllowSupervise","setLERPAllowSupervise"};    
lERPModuleActionRights1[6]=new String[]{"G_ERP_ALLOW_UNSUPERVISE","lERPAllowUnsupervise","setLERPAllowUnsupervise"};    
lERPModuleActionRights1[7]=new String[]{"G_ERP_ALLOW_CANCEL","lERPAllowCancel","setLERPAllowCancel"};    
lERPModuleActionRights1[8]=new String[]{"G_ERP_ALLOW_EDIT_OTHER","lERPAllowEditOther","setLERPAllowEditOther"};    
lERPModuleActionRights1[9]=new String[]{"G_ERP_ALLOW_PRINT","lERPAllowPrint","setLERPAllowPrint"};    
lERPModuleActionRights1[10]=new String[]{"G_ERP_ALLOW_SCAN","lERPAllowScan","setLERPAllowScan"};
for (int i = 0; i < lERPModuleActionRights1.length; i++) {
        System.out.println(lERPModuleActionRights1[i][2]);
       }

    }  
    public static void main1(String[] args) {
        ERPTEMPClass c=new ERPTEMPClass();
        try {
//            System.out.println(c.getClass().getField("lERPModuleAction"));
//        System.out.println(c.getClass().getMethod("getLERPModuleAction", null));
//            System.out.println(c.getClass().getMethod("setLERPModuleAction", String.class));
//            System.out.println(c.getClass().getMethod("setLERPModuleAction", String.class).invoke(null,"thisis"));
            Method method = c.getClass().getMethod("setLERPModuleAction", String.class);
            System.out.println(method);
            method.invoke(c, "this is testing");
            System.out.println(c.getLERPModuleAction());
            //            System.out.println(c.getClass().getMethod("getLERPModuleAction", arg1);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void doSetErpActivityRights(String pText) {
        System.out.println("this-is-doGetTransActivity-a");

        lERPModuleAction = pText;//getOTERPModuleAction().getValue().toString(); //MODULE_ACTION id from SYS_MODULE_DETAIL
        System.out.println("this-is-doGetTransActivity-b");
        ADFContext.getCurrent().getPageFlowScope().put("G_ERP_MODULE_ACTION",lERPModuleAction);
        System.out.println("this-is-doGetTransActivity-c");
        DCBindingContainer bc = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
        System.out.println("this-is-doGetTransActivity-d");
    
        DCDataControl dc = bc.getDataControl();
        System.out.println("this-is-doGetTransActivity-e");
        ApplicationModule am = dc.getApplicationModule();
        ViewObject vo = am.findViewObject("QvoRights");
        if (vo != null) {
            vo.remove();
        }
        System.out.println("this-is-doGetTransActivity-E");
        System.out.println(lERPModuleAction+ "lERPModuleAction");
        System.out.println("SELECT MAX(A.ALLOW_ADD) ALLOW_ADD,MAX(A.ALLOW_DELETE) ALLOW_DELETE,MAX(A.ACTION_RUNTIME) ACTION_RUNTIME,MAX(A.IS_ALLOW) IS_ALLOW,MAX(A.ALLOW_EDIT) ALLOW_EDIT,MAX(A.ALLOW_SUPERVISE) ALLOW_SUPERVISE ,MAX(A.ALLOW_UNSUPERVISE) ALLOW_UNSUPERVISE,MAX(A.ALLOW_CANCEL) ALLOW_CANCEL, MAX(A.ALLOW_EDIT_OTHER) ALLOW_EDIT_OTHER, MAX(A.ALLOW_PRINT) ALLOW_PRINT,MAX(A.SCAN_FILE) SCAN_FILE   FROM VW_SYS_USERS_MODULE A WHERE PK='"+ERPGlobalsClass.doGetUserSno()+"-"+lERPModuleAction+"'");
        vo =
            am.createViewObjectFromQueryStmt("QvoRights",
                                             "SELECT MAX(A.ALLOW_ADD) ALLOW_ADD,MAX(A.ALLOW_DELETE) ALLOW_DELETE,MAX(A.ACTION_RUNTIME) ACTION_RUNTIME,MAX(A.IS_ALLOW) IS_ALLOW,MAX(A.ALLOW_EDIT) ALLOW_EDIT,MAX(A.ALLOW_SUPERVISE) ALLOW_SUPERVISE ,MAX(A.ALLOW_UNSUPERVISE) ALLOW_UNSUPERVISE,MAX(A.ALLOW_CANCEL) ALLOW_CANCEL, MAX(A.ALLOW_EDIT_OTHER) ALLOW_EDIT_OTHER, MAX(A.ALLOW_PRINT) ALLOW_PRINT,MAX(A.SCAN_FILE) SCAN_FILE   FROM VW_SYS_USERS_MODULE A WHERE PK='"+ERPGlobalsClass.doGetUserSno()+"-"+lERPModuleAction+"'");
        vo.executeQuery();
  
        if (vo.getRowCount()==0) {
            throw new JboException("You Don't Have Rights on This Activity.");
       }
        
        this.lERPAllowAdd = vo.first().getAttribute(0).toString();
        ADFContext.getCurrent().getPageFlowScope().put("G_ERP_ALLOW_ADD",lERPAllowAdd);
        this.lERPAllowDelete = vo.first().getAttribute(1).toString();
        ADFContext.getCurrent().getPageFlowScope().put("G_ERP_ALLOW_DELETE",lERPAllowDelete);
        this.lERPActionRuntime = vo.first().getAttribute(2).toString();
        ADFContext.getCurrent().getPageFlowScope().put("G_ERP_ACTION_RUNTIME",lERPActionRuntime);
        this.lERPIsAllow = vo.first().getAttribute(3).toString();
        ADFContext.getCurrent().getPageFlowScope().put("G_ERP_IS_ALLOW",lERPIsAllow);
        this.lERPAllowEdit = vo.first().getAttribute(4).toString();
        ADFContext.getCurrent().getPageFlowScope().put("G_ERP_ALLOW_EDIT",lERPAllowEdit);
        this.lERPAllowSupervise = vo.first().getAttribute(5).toString();
        ADFContext.getCurrent().getPageFlowScope().put("G_ERP_ALLOW_SUPERVISE",lERPAllowSupervise);
        this.lERPAllowUnsupervise = vo.first().getAttribute(6).toString();
        ADFContext.getCurrent().getPageFlowScope().put("G_ERP_ALLOW_UNSUPERVISE",lERPAllowUnsupervise);
        this.lERPAllowCancel = vo.first().getAttribute(7).toString();
        ADFContext.getCurrent().getPageFlowScope().put("G_ERP_ALLOW_CANCEL",lERPAllowCancel);
        this.lERPAllowEditOther = vo.first().getAttribute(8).toString();
        ADFContext.getCurrent().getPageFlowScope().put("G_ERP_ALLOW_EDIT_OTHER",lERPAllowEditOther);
        //System.out.println("i am calling");
        this.lERPAllowPrint = vo.first().getAttribute(9).toString();
        ADFContext.getCurrent().getPageFlowScope().put("G_ERP_ALLOW_PRINT",lERPAllowPrint);
        this.lERPAllowScan = vo.first().getAttribute(10).toString();
        ADFContext.getCurrent().getPageFlowScope().put("G_ERP_ALLOW_SCAN",lERPAllowScan);
        System.out.println("-----------finish-------------------");         
        /*
        System.out.println(this.lERPAllowAdd + "lERPAllowAdd");
        System.out.println(this.lERPAllowDelete + "lERPAllowDelete");
        System.out.println(this.lERPActionRuntime + "lERPActionRuntime");
        
        System.out.println("USER"+ERPGlobalsClass.doGetUserSno());
        */
//        lERPModuleActionRights[][]=new String[9][];
        lERPModuleActionRights[0]=new String[]{"G_ERP_MODULE_ACTION",lERPModuleAction,"setLERPModuleAction"};
        lERPModuleActionRights[1]=new String[]{"G_ERP_ALLOW_ADD", lERPAllowAdd,"setLERPAllowAdd" };
        lERPModuleActionRights[2]=new String[]{"G_ERP_ALLOW_DELETE",lERPAllowEdit,"setLERPAllowDelete"};
        lERPModuleActionRights[3]=new String[]{"G_ERP_ACTION_RUNTIME",lERPActionRuntime,"setLERPActionRuntime"};    
        lERPModuleActionRights[4]=new String[]{"G_ERP_IS_ALLOW",lERPIsAllow,"setLERPIsAllow"};
        lERPModuleActionRights[5]=new String[]{"G_ERP_ALLOW_EDIT",lERPAllowEdit,"setLERPAllowEdit"};
        lERPModuleActionRights[6]=new String[]{"G_ERP_ALLOW_SUPERVISE",lERPAllowSupervise,"setLERPAllowSupervise"};    
        lERPModuleActionRights[7]=new String[]{"G_ERP_ALLOW_UNSUPERVISE",lERPAllowUnsupervise,"setLERPAllowUnsupervise"};    
        lERPModuleActionRights[8]=new String[]{"G_ERP_ALLOW_CANCEL",lERPAllowCancel,"setLERPAllowCancel"};    
        lERPModuleActionRights[9]=new String[]{"G_ERP_ALLOW_EDIT_OTHER",lERPAllowEditOther,"setLERPAllowEditOther"};    
        lERPModuleActionRights[10]=new String[]{"G_ERP_ALLOW_PRINT",lERPAllowPrint,"setLERPAllowPrint"};    
        lERPModuleActionRights[11]=new String[]{"G_ERP_ALLOW_SCAN",lERPAllowScan,"setLERPAllowScan"};
 
        
       
    }


    public Integer getERPUserId() {
        System.out.println("template getERPUserId");
//       return 1;
        return ERPGlobalsClass.doGetUserSno();
    }

    public String getERPUserCode() {
        System.out.println("template getERPUserCode");
        return ERPGlobalsClass.doGetUserCode();
    }

    public String getERPUserName() {
        //System.out.println("template getERPUserName");
//        return "NULL";
        return ERPGlobalsClass.doGetUserName();
    }    
    public void doSetActivityDescriptionNull() {
        setLErpActivityName("");
    }
    public String doERPLogoutApp() {
        return "ERPLOGOUTAPP";
    }
  
    public String doERPChangePassword() {
        return "ERPLCHANGEPWD";
    }
    public void doERPHideMenu() {
        setERPShowMenu("N");
    }
    public String doGoToERPGlobalSearchActivity() {
        return null;
    }
    public void ERPClientAutoSuggest(ClientEvent erpce) {
        
    }


    public void setErpGlobalSearchText(RichInputText ErpGlobalSearchText) {
        this.ErpGlobalSearchText = ErpGlobalSearchText;
    }

    public RichInputText getErpGlobalSearchText() {
        return ErpGlobalSearchText;
    }

    public void ErpPopupFetchEvent(PopupFetchEvent erppfe) {
        /**/
        System.out.println("i am calling");
        String strglobalsearch =
            "" + (getErpGlobalSearchText().getValue() == null ? "###-###" : getErpGlobalSearchText().getValue());
        System.out.println(strglobalsearch + "<strglobalsearch");
        DCBindingContainer bc = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
        //          DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding ib = bc.findIteratorBinding("VwERPGlobalSearchROIterator");

        ViewObject vo = ib.getViewObject();
        vo.resetExecuted();
        vo.setWhereClause("EXISTS (SELECT '' FROM SYS_USERS_MODULE SUM WHERE SUM.MODULE_ACTION=QRSLT.MODULE_ACTION AND "+
                          "SUM.USER_ID="+ERPGlobalsClass.doGetUserSno()+") AND upper(SEARCH_STRING) like UPPER('%" +(strglobalsearch.length() == 0 ? "###-###" : strglobalsearch) + "%')");
        System.out.println(vo.getWhereClause() + "where clause");
        vo.executeQuery();
    }
    
    public String ERPdoGoToGlobalSearchActivity() {
        doSetErpActivityRights(lERPModuleAction);
        DCBindingContainer bc = (DCBindingContainer) BindingContext.getCurrent().getCurrentBindingsEntry();
        ApplicationModule am = bc.getDataControl().getApplicationModule();
        ViewObject vo = am.findViewObject("VwSysGlobalSearchActionRO");
        vo.setNamedWhereClauseParam("P_ADF_MODULE_ACTION", lERPModuleAction);
        vo.executeQuery();
        System.out.println(vo.getRowCount() + " vo row counting is new");
        try {
            BindingContext bindingContext = BindingContext.getCurrent();
            DCBindingContainer dcbMod =null;
            //bindingContext.findBindingContainer("erpadm_viewadm_ERPBTFADM_ERPBTFADM_ExecuteWithParams1PageDef11111");
            OperationBinding ob = null;//(OperationBinding) dcbMod.get("ExecuteWithParams");
            
            while(vo.hasNext())
            {
              Row r=vo.next();

                if (r.getAttribute("ActionType").toString().equals("EXE")) {
//                    System.out.println("one");
                    dcbMod = bindingContext.findBindingContainer(r.getAttribute("PageDefinitionName").toString());
//                    System.out.println("two");
                    ob = (OperationBinding) dcbMod.get(r.getAttribute("OperationBindingName"));
//                    System.out.println("three");
                    //            OperationBinding ib = (OperationBinding) dcbMod.get("ERPEDITSEC_0007QUERY");
                    ob.getParamsMap().put(r.getAttribute("ParameterName"), getERPTransactionID());

//                    System.out.println("four");
                    ob.execute();
                }
                else if(r.getAttribute("ActionType").toString().equals("LOC")) {
                    System.out.println("---------this is location-----------");
                    dcbMod = bindingContext.findBindingContainer(r.getAttribute("PageDefinitionName").toString());
                    ob = (OperationBinding) dcbMod.get(r.getAttribute("OperationBindingName"));
                    ob.execute();
                }
                else {
                    System.out.println("one");
                    dcbMod = bindingContext.findBindingContainer(r.getAttribute("PageDefinitionName").toString());
                    System.out.println("two");
                    ob = (OperationBinding) dcbMod.get(r.getAttribute("OperationBindingName"));
                    System.out.println("three");
                    //            OperationBinding ib = (OperationBinding) dcbMod.get("ERPEDITSEC_0007QUERY");
                    ob.getParamsMap().put(r.getAttribute("ParameterName"), getLERPCompanyId());

                    System.out.println("four");
                    ob.execute();
                }
            }    
//            System.out.println("six--");
//            System.out.println("lERPGlobalSearchTF:" + lERPGlobalSearchTF);
//            System.out.println("ERPActionRuntime:" + lERPActionRuntime);
//            System.out.println(lERPGlobalSearchTF + "/" + lERPActionRuntimeGlobalSearch);
//            System.out.println(" seven");

        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
           FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(e.getMessage()));
        }
        System.out.println(" this is new version");
        NavigationHandler   nvHndlr = FacesContext.getCurrentInstance().getApplication().getNavigationHandler();
        System.out.println(lERPModuleFromMenu + "lERPModuleFromMenu");
        System.out.println(lERPModuleFromGlobalSearch + "lERPModuleFromGlobalSearch");              
        if ((!lERPModuleFromMenu.equals(lERPModuleFromGlobalSearch) ) && !lERPModuleFromMenu.equals("-")) {//calling from different module

        }
        nvHndlr.handleNavigation(FacesContext.getCurrentInstance(), null, "ERPACTEXITTASKFLOWVIAGS");

        ControllerContext.getInstance().getCurrentViewPort().setViewId(lERPActionRuntimeGlobalSearch);
        System.out.println(ControllerContext.getInstance().getCurrentViewPort().getTaskFlowContext().getTaskFlowId());
         getErpGlobalSearchText().setValue("");
         return null;
        //        return lERPGlobalSearchTF + "/" + lERPActionRuntimeGlobalSearch;
//        return lERPGlobalSearchTF + "/" + lERPActionRuntimeGlobalSearch;
    }


    public void setERPTransactionID(Integer ERPTransactionID) {
        this.ERPTransactionID = ERPTransactionID;
    }

    public Integer getERPTransactionID() {
        return ERPTransactionID;
    }

    public void setLERPGlobalSearchTF(String lERPGlobalSearchTF) {
        this.lERPGlobalSearchTF = lERPGlobalSearchTF;
    }

    public String getLERPGlobalSearchTF() {
        return lERPGlobalSearchTF;
    }

    public void setLERPActionRuntimeGlobalSearch(String lERPActionRuntimeGlobalSearch) {
        this.lERPActionRuntimeGlobalSearch = lERPActionRuntimeGlobalSearch;
    }

    public String getLERPActionRuntimeGlobalSearch() {
        return lERPActionRuntimeGlobalSearch;
    }


    public void setLERPModuleFromMenu(String lERPModuleFromMenu) {
        this.lERPModuleFromMenu = lERPModuleFromMenu;
    }

    public String getLERPModuleFromMenu() {
        return lERPModuleFromMenu;
    }

    public void setLERPModuleFromGlobalSearch(String lERPModuleFromGlobalSearch) {
        this.lERPModuleFromGlobalSearch = lERPModuleFromGlobalSearch;
    }

    public String getLERPModuleFromGlobalSearch() {
        return lERPModuleFromGlobalSearch;
    }


    public void setLERPCompanyId(Integer lERPCompanyId) {
        this.lERPCompanyId = lERPCompanyId;
    }

    public Integer getLERPCompanyId() {
        return lERPCompanyId;
    }
    public void doERPSetModuleActionForRights() {
        System.out.println("------new4-------");
        System.out.println("getLERPModuleActionRights().length"+getLERPModuleActionRights().length);
        System.out.println("lERPModuleActionRights"+lERPModuleActionRights.length);
        try {
            for (int i = 0; i < getLERPModuleActionRights().length; i++) {
                
               System.out.println(lERPModuleActionRights[i][0]+">>"+lERPModuleActionRights[i][1]);
//               System.out.println(lERPModuleActionRights[i][0]+">>"+lERPModuleActionRights[i][1]);
               ADFContext.getCurrent().getPageFlowScope().put(lERPModuleActionRights[i][0],lERPModuleActionRights[i][1]);
               Method erpmethod=this.getClass().getMethod(lERPModuleActionRights[i][2], String.class);
                erpmethod.invoke(this, lERPModuleActionRights[i][1]);
           }
            
            System.out.println(getLERPAllowAdd());
            System.out.println(getLERPAllowDelete());
            System.out.println(getLERPActionRuntime());
            System.out.println(getLERPIsAllow());
            System.out.println(getLERPAllowEdit());
            System.out.println(getLERPAllowSupervise());
            System.out.println(getLERPAllowUnsupervise());
            System.out.println(getLERPAllowCancel());
            System.out.println(getLERPAllowEditOther());
            System.out.println(getLERPAllowPrint());
            System.out.println(getLERPAllowScan());
            
            
//                Method method = c.getClass().getMethod("setLERPModuleAction", String.class);
//                System.out.println(method);
//                method.invoke(c, "this is testing");
//                System.out.println(c.getLERPModuleAction());
//                //            System.out.println(c.getClass().getMethod("getLERPModuleAction", arg1);
                
            

        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }
     
    }

    public void setLERPModuleActionRights(String[][] lERPModuleActionRights) {
        this.lERPModuleActionRights = lERPModuleActionRights;
    }

    public String[][] getLERPModuleActionRights() {
        return lERPModuleActionRights;
    }

}
