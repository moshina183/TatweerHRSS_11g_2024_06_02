package com.sbm.selfServices.model.services.client;

import com.sbm.selfServices.model.services.common.SBMModule;

import java.util.ArrayList;

import oracle.jbo.Row;
import oracle.jbo.client.remote.ApplicationModuleImpl;
import oracle.jbo.domain.BlobDomain;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Feb 28 08:40:55 EET 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SBMModuleClient extends ApplicationModuleImpl implements SBMModule {
    /**
     * This is the default constructor (do not remove).
     */
    public SBMModuleClient() {
    }





//    public ArrayList getBusinessTripDatesToCheckOverlap(String personNumber) {
//        Object _ret =
//            this.riInvokeExportedMethod(this,"getBusinessTripDatesToCheckOverlap",new String [] {"java.lang.String"},new Object[] {personNumber});
//        return (ArrayList)_ret;
//    }


    //    public ArrayList<Row> getBusinessTripDatesToCheckOverlap(String personNumber) {
//        Object _ret =
//            this.riInvokeExportedMethod(this,"getBusinessTripDatesToCheckOverlap",new String [] {"java.lang.String"},new Object[] {personNumber});
//        return (ArrayList<Row>)_ret;
//    }


//    public ArrayList<Row> getBusinessTripDatesToCheckOverlap(String personNumber) {
//        Object _ret =
//            this.riInvokeExportedMethod(this,"getBusinessTripDatesToCheckOverlap",new String [] {"java.lang.String"},new Object[] {personNumber});
//        return (ArrayList<Row>)_ret;
//    }


//    public ArrayList getBusinessTripDatesToCheckOverlap(String personNumber) {
//        Object _ret =
//            this.riInvokeExportedMethod(this,"getBusinessTripDatesToCheckOverlap",new String [] {"java.lang.String"},new Object[] {personNumber});
//        return (ArrayList)_ret;
//    }


    public void calcAllowances(String tripType, String classType, Number days,
                               String allowanceType) {
        Object _ret =
            this.riInvokeExportedMethod(this,"calcAllowances",new String [] {"java.lang.String","java.lang.String","oracle.jbo.domain.Number","java.lang.String"},new Object[] {tripType, classType, days, allowanceType});
        return;
    }

    public void callSendEmailStoredPL(String sender, String receiver,
                                      String subject, String e_body) {
        Object _ret =
            this.riInvokeExportedMethod(this,"callSendEmailStoredPL",new String [] {"java.lang.String","java.lang.String","java.lang.String","java.lang.String"},new Object[] {sender, receiver, subject, e_body});
        return;
    }

    public Row getNextStep(Number currentStep, String requestName) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getNextStep",new String [] {"oracle.jbo.domain.Number","java.lang.String"},new Object[] {currentStep, requestName});
        return (Row)_ret;
    }

    public void changeExpenseFlag(Number localBusinessTripId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"changeExpenseFlag",new String [] {"oracle.jbo.domain.Number"},new Object[] {localBusinessTripId});
        return;
    }

    public Number getTotalMonthsPerYear(String PersonId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getTotalMonthsPerYear",new String [] {"java.lang.String"},new Object[] {PersonId});
        return (Number)_ret;
    }

    public Number getTotalhoursPerMonth(String PersonId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getTotalhoursPerMonth",new String [] {"java.lang.String"},new Object[] {PersonId});
        return (Number)_ret;
    }

    public void deleteDeptTableRows() {
        Object _ret =
            this.riInvokeExportedMethod(this,"deleteDeptTableRows",null,null);
        return;
    }

    public Row getLoanTotalsRow(String PersonId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getLoanTotalsRow",new String [] {"java.lang.String"},new Object[] {PersonId});
        return (Row)_ret;
    }

    public Number getTotalMonthsInYear(String PersonId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getTotalMonthsInYear",new String [] {"java.lang.String"},new Object[] {PersonId});
        return (Number)_ret;
    }

    public void deleteJobsTableRows() {
        Object _ret =
            this.riInvokeExportedMethod(this,"deleteJobsTableRows",null,null);
        return;
    }

    public void deleteGradesTableRows() {
        Object _ret =
            this.riInvokeExportedMethod(this,"deleteGradesTableRows",null,null);
        return;
    }

    public void deleteDeptEmployeesTableRows() {
        Object _ret =
            this.riInvokeExportedMethod(this,"deleteDeptEmployeesTableRows",null,null);
        return;
    }

    public Number getTotalConsumedAmountPerYear(String bindPersonNo,
                                                Date bindStartOfYear,
                                                Date bindEndOfYear) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getTotalConsumedAmountPerYear",new String [] {"java.lang.String","oracle.jbo.domain.Date","oracle.jbo.domain.Date"},new Object[] {bindPersonNo, bindStartOfYear, bindEndOfYear});
        return (Number)_ret;
    }

    public void deletePositionsTableRows() {
        Object _ret =
            this.riInvokeExportedMethod(this,"deletePositionsTableRows",null,null);
        return;
    }

    public Number getTotalAmountSpecialNeed(String PersonNumber) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getTotalAmountSpecialNeed",new String [] {"java.lang.String"},new Object[] {PersonNumber});
        return (Number)_ret;
    }

    public Number getTotalAmountEducAllow(String PersonNumber) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getTotalAmountEducAllow",new String [] {"java.lang.String"},new Object[] {PersonNumber});
        return (Number)_ret;
    }

    public void deleteMngrEmpsTableRows() {
        Object _ret =
            this.riInvokeExportedMethod(this,"deleteMngrEmpsTableRows",null,null);
        return;
    }

    public Number getMobileRequestsThisMonth(String PersonNumber) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getMobileRequestsThisMonth",new String [] {"java.lang.String"},new Object[] {PersonNumber});
        return (Number)_ret;
    }

    public Number getExitRequestsInSameTravelDate(String bindPersonNo,
                                                  Date travelDateBind) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getExitRequestsInSameTravelDate",new String [] {"java.lang.String","oracle.jbo.domain.Date"},new Object[] {bindPersonNo, travelDateBind});
        return (Number)_ret;
    }

    public void changeExpenseFlagToNo(Number localBusinessTripId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"changeExpenseFlagToNo",new String [] {"oracle.jbo.domain.Number"},new Object[] {localBusinessTripId});
        return;
    }

    public ArrayList<Row> getBusinessTripDatesToCheckOverlap(String personNumber) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getBusinessTripDatesToCheckOverlap",new String [] {"java.lang.String"},new Object[] {personNumber});
        return (ArrayList<Row>)_ret;
    }

    public Number getExitReEntryBT(Date bindDate, String bindPersonNo) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getExitReEntryBT",new String [] {"oracle.jbo.domain.Date","java.lang.String"},new Object[] {bindDate, bindPersonNo});
        return (Number)_ret;
    }

    public String getLastExceptionalRewardDate(String bindPersonNumber) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getLastExceptionalRewardDate",new String [] {"java.lang.String"},new Object[] {bindPersonNumber});
        return (String)_ret;
    }

    public void empIsManager(String bindPersonNumber) {
        Object _ret =
            this.riInvokeExportedMethod(this,"empIsManager",new String [] {"java.lang.String"},new Object[] {bindPersonNumber});
        return;
    }

    public void deleteAllLocations() {
        Object _ret =
            this.riInvokeExportedMethod(this,"deleteAllLocations",null,null);
        return;
    }

    public Row getLastLoanDetails(String personNumber) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getLastLoanDetails",new String [] {"java.lang.String"},new Object[] {personNumber});
        return (Row)_ret;
    }

    public String callApprovalHistory(int req_id, String req_type,
                                      int prev_step_id, int step_id,
                                      String assignee_name,
                                      String approval_flow,
                                      String final_approval_flow,
                                      String approval_type) {
        Object _ret =
            this.riInvokeExportedMethod(this,"callApprovalHistory",new String [] {"int","java.lang.String","int","int","java.lang.String","java.lang.String","java.lang.String","java.lang.String"},new Object[] {new Integer(req_id), req_type, new Integer(prev_step_id), new Integer(step_id), assignee_name, approval_flow, final_approval_flow, approval_type});
        return (String)_ret;
    }

    public String callApprovalHistory(int req_id, String req_type,
                                      int prev_step_id, int step_id,
                                      String assignee_name,
                                      String approval_flow,
                                      String final_approval_flow) {
        Object _ret =
            this.riInvokeExportedMethod(this,"callApprovalHistory",new String [] {"int","java.lang.String","int","int","java.lang.String","java.lang.String","java.lang.String"},new Object[] {new Integer(req_id), req_type, new Integer(prev_step_id), new Integer(step_id), assignee_name, approval_flow, final_approval_flow});
        return (String)_ret;
    }

    public String callDelegateProcess(int req_id, int step_id, String req_name,
                                      String assigneeName, String assignee,
                                      String actionType, String approvalType) {
        Object _ret =
            this.riInvokeExportedMethod(this,"callDelegateProcess",new String [] {"int","int","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String"},new Object[] {new Integer(req_id), new Integer(step_id), req_name, assigneeName, assignee, actionType, approvalType});
        return (String)_ret;
    }

    public void sendExperienceCertificate(String sender, String receiver,
                                          String subject, String e_body,
                                          Integer requestId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"sendExperienceCertificate",new String [] {"java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.Integer"},new Object[] {sender, receiver, subject, e_body, requestId});
        return;
    }

    public void sendTrainingCertificate(Integer requestId) {
        Object _ret =
            this.riInvokeExportedMethod(this,"sendTrainingCertificate",new String [] {"java.lang.Integer"},new Object[] {requestId});
        return;
    }

    public void callSendInvoiceEmailStoredPL(String p_request_type,
                                             String p_request_number,
                                             BlobDomain p_attachment) {
        Object _ret =
            this.riInvokeExportedMethod(this,"callSendInvoiceEmailStoredPL",new String [] {"java.lang.String","java.lang.String","oracle.jbo.domain.BlobDomain"},new Object[] {p_request_type, p_request_number, p_attachment});
        return;
    }

    public long getCEONextStepId(String requestName) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getCEONextStepId",new String [] {"java.lang.String"},new Object[] {requestName});
        return ((Long)_ret).longValue();
    }

    public Row getElementAccount(String elementName) {
        Object _ret =
            this.riInvokeExportedMethod(this,"getElementAccount",new String [] {"java.lang.String"},new Object[] {elementName});
        return (Row)_ret;
    }

    public String callTatHdrUpdateProcess(String request_id, String person_no,
                                          String request_status,
                                          String doc_title, String doc_author,
                                          String security_group,
                                          String element_name,
                                          String doc_account, String doc_type,
                                          String base_sixtyfour_file) {
        Object _ret =
            this.riInvokeExportedMethod(this,"callTatHdrUpdateProcess",new String [] {"java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String","java.lang.String"},new Object[] {request_id, person_no, request_status, doc_title, doc_author, security_group, element_name, doc_account, doc_type, base_sixtyfour_file});
        return (String)_ret;
    }
}