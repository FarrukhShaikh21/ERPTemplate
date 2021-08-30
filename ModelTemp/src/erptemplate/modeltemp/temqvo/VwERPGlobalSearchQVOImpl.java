package erptemplate.modeltemp.temqvo;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.adf.share.ADFContext;

import oracle.jbo.Row;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.ViewRowSetImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Aug 14 01:47:50 PKT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class VwERPGlobalSearchQVOImpl extends ViewObjectImpl {

    /**
     * This is the default constructor (do not remove).
     */
    public VwERPGlobalSearchQVOImpl() {
    }

    /**
     * executeQueryForCollection - overridden for custom java data source support.
     */
    @Override
    protected void executeQueryForCollection(Object qc, Object[] params, int noUserParams) {
        super.executeQueryForCollection(qc, params, noUserParams);
    }

    /**
     * hasNextForCollection - overridden for custom java data source support.
     */
    @Override
    protected boolean hasNextForCollection(Object qc) {
        boolean bRet = super.hasNextForCollection(qc);
        return bRet;
    }

    /**
     * createRowFromResultSet - overridden for custom java data source support.
     */
    @Override
    protected ViewRowImpl createRowFromResultSet(Object qc, ResultSet resultSet) {
        String erpConnType="-";
        ViewRowImpl value = super.createRowFromResultSet(qc, resultSet);
        
        System.out.println("createrowfromresultset-V8");
        
        
        if (value.getAttribute("LocationId").toString().equals("0")) {
            return value;
        } 
        PreparedStatement erpps =null;
        if (erpConnType.equals("-")) {
//            System.out.println("1");
            try {
                erpps =
                    getDBTransaction().createPreparedStatement("SELECT SYS_CONTEXT ('USERENV', 'SESSION_USER') FROM DUAL",
                                                               getDBTransaction().DEFAULT);
                erpps.executeQuery();
                erpConnType = "ORACLE";
            } catch (Exception sqle) {
                // TODO: Add catch code
                erpConnType = "MYSQL";
            } finally {
                try {
                    erpps.close();
                } catch (Exception e) {
                }
            }
        }

   System.out.println(erpConnType +"erpconntyep");
//        System.out.println(getDBTransaction().getSession().getEnvironment().toString().contains("DBconnection=jdbc:mysql:"));
        
        
    
        String erpUserId=""+ADFContext.getCurrent().getPageFlowScope().get("G_USER_SNO");
        String erpGlobalCompany= ""+ADFContext.getCurrent().getPageFlowScope().get("G_GLOBAL_DEF_COMPANY");
        CallableStatement cs =null;
        String erpStatement="";
        try {
            if (erpConnType.equals("ORACLE")) {
             erpStatement=  "begin proc_set_user_location_access(" + erpUserId + ",'" +
                                                                      value.getAttribute("ModuleAction") + "' ," + erpGlobalCompany +
                                                                      "); end;";
           }
            else {
                erpStatement=  " call proc_set_user_location_access(" + erpUserId + ",'" +
                                                                         value.getAttribute("ModuleAction") + "' ," + erpGlobalCompany +
                                                                         ");  ";
            }
            System.out.println(erpStatement +"<erpstatement>"+erpConnType);
            cs=getDBTransaction().createCallableStatement(erpStatement, 1);
            
            System.out.println("SELECT COUNT(1) C1 FROM temp_admin_company_access WHERE MODULE_ACTION='" +
                               value.getAttribute("ModuleAction") + "' AND COMPANY_ID=" +
                               value.getAttribute("LocationId"));
           
            cs.executeUpdate();
            System.out.println("i am executing"); 

        } catch (Exception e) {
            // TODO: Add catch code
            try {
                cs.close();
            } catch (SQLException f) {
            }
            e.printStackTrace();
        } finally {
            try {
                cs.close();
            } catch (SQLException e) {
            }
        }

        PreparedStatement ps =
            getDBTransaction().createPreparedStatement("SELECT COUNT(1) C1 FROM temp_admin_company_access WHERE MODULE_ACTION='" +
                                                       value.getAttribute("ModuleAction") + "' AND COMPANY_ID=" +
                                                       value.getAttribute("LocationId"), 1);
        ResultSet rs = null;

        try {
            rs = ps.executeQuery();

            if (rs.next()) {
                if (rs.getInt(1) == 0) {
                    //                        erpmodule="-";
                    return null;
                }

            }
        } catch (SQLException sqle) {
            // TODO: Add catch code
            sqle.printStackTrace();
        }
        finally{
            try {
                rs.close();
                ps.close();
            } catch (SQLException e) {
            }
           
        }
        
        return value;
    }

/*
 
     @Override
    protected ViewRowImpl createRowFromResultSet(Object qc, ResultSet resultSet) {
        ViewRowImpl value = super.createRowFromResultSet(qc, resultSet);
        if (value.getAttribute("LocationId").toString().equals("0")) {
            return value;
        }
        CallableStatement cs =
            getDBTransaction().createCallableStatement("begin proc_set_user_location_access(" + 1 + ",'" +
                                                       value.getAttribute("ModuleAction") + "' ," + 1 + "); end;", 1);
        try {
            System.out.println("SELECT COUNT(1) C1 FROM temp_admin_company_access WHERE MODULE_ACTION='" +
                               value.getAttribute("ModuleAction") + "' AND COMPANY_ID=" +
                               value.getAttribute("LocationId"));
            cs.executeUpdate();


        } catch (Exception e) {
            // TODO: Add catch code
            try {
                cs.close();
            } catch (SQLException f) {
            }
            e.printStackTrace();
        } finally {
            try {
                cs.close();
            } catch (SQLException e) {
            }
        }

        PreparedStatement ps =
            getDBTransaction().createPreparedStatement("SELECT COUNT(1) C1 FROM temp_admin_company_access WHERE MODULE_ACTION='" +
                                                       value.getAttribute("ModuleAction") + "' AND COMPANY_ID=" +
                                                       value.getAttribute("LocationId"), 1);
        ResultSet rs = null;

        try {
            rs = ps.executeQuery();

            if (rs.next()) {
                if (rs.getInt(1) == 0) {
                    //                        erpmodule="-";
                    return null;
                }

            }
        } catch (SQLException sqle) {
            // TODO: Add catch code
            sqle.printStackTrace();
        }
        finally{
            try {
                rs.close();
                ps.close();
            } catch (SQLException e) {
            }
           
        }

        return value;
    }
 */
    /**
     * getQueryHitCount - overridden for custom java data source support.
     */
    @Override
    public long getQueryHitCount(ViewRowSetImpl viewRowSet) {
        long value = super.getQueryHitCount(viewRowSet);
        return value;
    }

    /**
     * getCappedQueryHitCount - overridden for custom java data source support.
     */
    @Override
    public long getCappedQueryHitCount(ViewRowSetImpl viewRowSet, Row[] masterRows, long oldCap, long cap) {
        long value = super.getCappedQueryHitCount(viewRowSet, masterRows, oldCap, cap);
        return value;
    }
}

