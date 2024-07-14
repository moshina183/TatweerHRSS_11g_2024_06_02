package com.sbm.selfServices.model.views.up;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Mar 03 14:59:52 AST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RepaymentTicketsViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        RepaymentTicketsId {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getRepaymentTicketsId();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setRepaymentTicketsId((DBSequence)value);
            }
        }
        ,
        CreationDate {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        PersonNumber {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getPersonNumber();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setPersonNumber((String)value);
            }
        }
        ,
        PersonName {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getPersonName();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setPersonName((String)value);
            }
        }
        ,
        StepId {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getStepId();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setStepId((Integer)value);
            }
        }
        ,
        Assignee {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getAssignee();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setAssignee((String)value);
            }
        }
        ,
        AssigneeName {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getAssigneeName();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setAssigneeName((String)value);
            }
        }
        ,
        PersonPosition {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getPersonPosition();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setPersonPosition((String)value);
            }
        }
        ,
        PersonJob {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getPersonJob();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setPersonJob((String)value);
            }
        }
        ,
        PersonDepartment {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getPersonDepartment();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setPersonDepartment((String)value);
            }
        }
        ,
        PersonLocation {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getPersonLocation();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setPersonLocation((String)value);
            }
        }
        ,
        PersonGrade {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getPersonGrade();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setPersonGrade((String)value);
            }
        }
        ,
        RequestStatus {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getRequestStatus();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setRequestStatus((String)value);
            }
        }
        ,
        RejectionReason {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getRejectionReason();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setRejectionReason((String)value);
            }
        }
        ,
        Destination {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getDestination();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setDestination((String)value);
            }
        }
        ,
        RequestReason {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getRequestReason();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setRequestReason((String)value);
            }
        }
        ,
        OtherReason {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getOtherReason();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setOtherReason((String)value);
            }
        }
        ,
        PaymentMethod {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getPaymentMethod();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setPaymentMethod((String)value);
            }
        }
        ,
        CompensationPrice {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getCompensationPrice();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setCompensationPrice((Number)value);
            }
        }
        ,
        Amount {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getAmount();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setAmount((Number)value);
            }
        }
        ,
        Comments {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getComments();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setComments((String)value);
            }
        }
        ,
        TravelDate {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getTravelDate();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setTravelDate((Date)value);
            }
        }
        ,
        EndBalance {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getEndBalance();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setEndBalance((Number)value);
            }
        }
        ,
        ToDate {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getToDate();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setToDate((Date)value);
            }
        }
        ,
        ActionTaken {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getActionTaken();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setActionTaken((String)value);
            }
        }
        ,
        PaymentStatus {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getPaymentStatus();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setPaymentStatus((String)value);
            }
        }
        ,
        InvoiceNumber {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getInvoiceNumber();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setInvoiceNumber((String)value);
            }
        }
        ,
        EditRequest {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getEditRequest();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setEditRequest((String)value);
            }
        }
        ,
        ApprovalHistoryVO {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getApprovalHistoryVO();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        RepaymentTicketsAttachmentsView {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getRepaymentTicketsAttachmentsView();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        RepaymentTicketsReqReasonLOV1 {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getRepaymentTicketsReqReasonLOV1();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        DepartmentsLOV1 {
            public Object get(RepaymentTicketsViewRowImpl obj) {
                return obj.getDepartmentsLOV1();
            }

            public void put(RepaymentTicketsViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(RepaymentTicketsViewRowImpl object);

        public abstract void put(RepaymentTicketsViewRowImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int REPAYMENTTICKETSID = AttributesEnum.RepaymentTicketsId.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int PERSONNUMBER = AttributesEnum.PersonNumber.index();
    public static final int PERSONNAME = AttributesEnum.PersonName.index();
    public static final int STEPID = AttributesEnum.StepId.index();
    public static final int ASSIGNEE = AttributesEnum.Assignee.index();
    public static final int ASSIGNEENAME = AttributesEnum.AssigneeName.index();
    public static final int PERSONPOSITION = AttributesEnum.PersonPosition.index();
    public static final int PERSONJOB = AttributesEnum.PersonJob.index();
    public static final int PERSONDEPARTMENT = AttributesEnum.PersonDepartment.index();
    public static final int PERSONLOCATION = AttributesEnum.PersonLocation.index();
    public static final int PERSONGRADE = AttributesEnum.PersonGrade.index();
    public static final int REQUESTSTATUS = AttributesEnum.RequestStatus.index();
    public static final int REJECTIONREASON = AttributesEnum.RejectionReason.index();
    public static final int DESTINATION = AttributesEnum.Destination.index();
    public static final int REQUESTREASON = AttributesEnum.RequestReason.index();
    public static final int OTHERREASON = AttributesEnum.OtherReason.index();
    public static final int PAYMENTMETHOD = AttributesEnum.PaymentMethod.index();
    public static final int COMPENSATIONPRICE = AttributesEnum.CompensationPrice.index();
    public static final int AMOUNT = AttributesEnum.Amount.index();
    public static final int COMMENTS = AttributesEnum.Comments.index();
    public static final int TRAVELDATE = AttributesEnum.TravelDate.index();
    public static final int ENDBALANCE = AttributesEnum.EndBalance.index();
    public static final int TODATE = AttributesEnum.ToDate.index();
    public static final int ACTIONTAKEN = AttributesEnum.ActionTaken.index();
    public static final int PAYMENTSTATUS = AttributesEnum.PaymentStatus.index();
    public static final int INVOICENUMBER = AttributesEnum.InvoiceNumber.index();
    public static final int EDITREQUEST = AttributesEnum.EditRequest.index();
    public static final int APPROVALHISTORYVO = AttributesEnum.ApprovalHistoryVO.index();
    public static final int REPAYMENTTICKETSATTACHMENTSVIEW = AttributesEnum.RepaymentTicketsAttachmentsView.index();
    public static final int REPAYMENTTICKETSREQREASONLOV1 = AttributesEnum.RepaymentTicketsReqReasonLOV1.index();
    public static final int DEPARTMENTSLOV1 = AttributesEnum.DepartmentsLOV1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public RepaymentTicketsViewRowImpl() {
    }

    /**
     * Gets RepaymentTickets entity object.
     * @return the RepaymentTickets
     */
    public EntityImpl getRepaymentTickets() {
        return (EntityImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for REPAYMENT_TICKETS_ID using the alias name RepaymentTicketsId.
     * @return the REPAYMENT_TICKETS_ID
     */
    public DBSequence getRepaymentTicketsId() {
        return (DBSequence)getAttributeInternal(REPAYMENTTICKETSID);
    }

    /**
     * Sets <code>value</code> as attribute value for REPAYMENT_TICKETS_ID using the alias name RepaymentTicketsId.
     * @param value value to set the REPAYMENT_TICKETS_ID
     */
    public void setRepaymentTicketsId(DBSequence value) {
        setAttributeInternal(REPAYMENTTICKETSID, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for PERSON_NUMBER using the alias name PersonNumber.
     * @return the PERSON_NUMBER
     */
    public String getPersonNumber() {
        return (String) getAttributeInternal(PERSONNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for PERSON_NUMBER using the alias name PersonNumber.
     * @param value value to set the PERSON_NUMBER
     */
    public void setPersonNumber(String value) {
        setAttributeInternal(PERSONNUMBER, value);
    }

    /**
     * Gets the attribute value for PERSON_NAME using the alias name PersonName.
     * @return the PERSON_NAME
     */
    public String getPersonName() {
        return (String) getAttributeInternal(PERSONNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for PERSON_NAME using the alias name PersonName.
     * @param value value to set the PERSON_NAME
     */
    public void setPersonName(String value) {
        setAttributeInternal(PERSONNAME, value);
    }

    /**
     * Gets the attribute value for STEP_ID using the alias name StepId.
     * @return the STEP_ID
     */
    public Integer getStepId() {
        return (Integer) getAttributeInternal(STEPID);
    }

    /**
     * Sets <code>value</code> as attribute value for STEP_ID using the alias name StepId.
     * @param value value to set the STEP_ID
     */
    public void setStepId(Integer value) {
        setAttributeInternal(STEPID, value);
    }

    /**
     * Gets the attribute value for ASSIGNEE using the alias name Assignee.
     * @return the ASSIGNEE
     */
    public String getAssignee() {
        return (String) getAttributeInternal(ASSIGNEE);
    }

    /**
     * Sets <code>value</code> as attribute value for ASSIGNEE using the alias name Assignee.
     * @param value value to set the ASSIGNEE
     */
    public void setAssignee(String value) {
        setAttributeInternal(ASSIGNEE, value);
    }

    /**
     * Gets the attribute value for ASSIGNEE_NAME using the alias name AssigneeName.
     * @return the ASSIGNEE_NAME
     */
    public String getAssigneeName() {
        return (String) getAttributeInternal(ASSIGNEENAME);
    }

    /**
     * Sets <code>value</code> as attribute value for ASSIGNEE_NAME using the alias name AssigneeName.
     * @param value value to set the ASSIGNEE_NAME
     */
    public void setAssigneeName(String value) {
        setAttributeInternal(ASSIGNEENAME, value);
    }

    /**
     * Gets the attribute value for PERSON_POSITION using the alias name PersonPosition.
     * @return the PERSON_POSITION
     */
    public String getPersonPosition() {
        return (String) getAttributeInternal(PERSONPOSITION);
    }

    /**
     * Sets <code>value</code> as attribute value for PERSON_POSITION using the alias name PersonPosition.
     * @param value value to set the PERSON_POSITION
     */
    public void setPersonPosition(String value) {
        setAttributeInternal(PERSONPOSITION, value);
    }

    /**
     * Gets the attribute value for PERSON_JOB using the alias name PersonJob.
     * @return the PERSON_JOB
     */
    public String getPersonJob() {
        return (String) getAttributeInternal(PERSONJOB);
    }

    /**
     * Sets <code>value</code> as attribute value for PERSON_JOB using the alias name PersonJob.
     * @param value value to set the PERSON_JOB
     */
    public void setPersonJob(String value) {
        setAttributeInternal(PERSONJOB, value);
    }

    /**
     * Gets the attribute value for PERSON_DEPARTMENT using the alias name PersonDepartment.
     * @return the PERSON_DEPARTMENT
     */
    public String getPersonDepartment() {
        return (String) getAttributeInternal(PERSONDEPARTMENT);
    }

    /**
     * Sets <code>value</code> as attribute value for PERSON_DEPARTMENT using the alias name PersonDepartment.
     * @param value value to set the PERSON_DEPARTMENT
     */
    public void setPersonDepartment(String value) {
        setAttributeInternal(PERSONDEPARTMENT, value);
    }

    /**
     * Gets the attribute value for PERSON_LOCATION using the alias name PersonLocation.
     * @return the PERSON_LOCATION
     */
    public String getPersonLocation() {
        return (String) getAttributeInternal(PERSONLOCATION);
    }

    /**
     * Sets <code>value</code> as attribute value for PERSON_LOCATION using the alias name PersonLocation.
     * @param value value to set the PERSON_LOCATION
     */
    public void setPersonLocation(String value) {
        setAttributeInternal(PERSONLOCATION, value);
    }

    /**
     * Gets the attribute value for PERSON_GRADE using the alias name PersonGrade.
     * @return the PERSON_GRADE
     */
    public String getPersonGrade() {
        return (String) getAttributeInternal(PERSONGRADE);
    }

    /**
     * Sets <code>value</code> as attribute value for PERSON_GRADE using the alias name PersonGrade.
     * @param value value to set the PERSON_GRADE
     */
    public void setPersonGrade(String value) {
        setAttributeInternal(PERSONGRADE, value);
    }

    /**
     * Gets the attribute value for REQUEST_STATUS using the alias name RequestStatus.
     * @return the REQUEST_STATUS
     */
    public String getRequestStatus() {
        return (String) getAttributeInternal(REQUESTSTATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for REQUEST_STATUS using the alias name RequestStatus.
     * @param value value to set the REQUEST_STATUS
     */
    public void setRequestStatus(String value) {
        setAttributeInternal(REQUESTSTATUS, value);
    }

    /**
     * Gets the attribute value for REJECTION_REASON using the alias name RejectionReason.
     * @return the REJECTION_REASON
     */
    public String getRejectionReason() {
        return (String) getAttributeInternal(REJECTIONREASON);
    }

    /**
     * Sets <code>value</code> as attribute value for REJECTION_REASON using the alias name RejectionReason.
     * @param value value to set the REJECTION_REASON
     */
    public void setRejectionReason(String value) {
        setAttributeInternal(REJECTIONREASON, value);
    }

    /**
     * Gets the attribute value for DESTINATION using the alias name Destination.
     * @return the DESTINATION
     */
    public String getDestination() {
        return (String) getAttributeInternal(DESTINATION);
    }

    /**
     * Sets <code>value</code> as attribute value for DESTINATION using the alias name Destination.
     * @param value value to set the DESTINATION
     */
    public void setDestination(String value) {
        setAttributeInternal(DESTINATION, value);
    }

    /**
     * Gets the attribute value for REQUEST_REASON using the alias name RequestReason.
     * @return the REQUEST_REASON
     */
    public String getRequestReason() {
        return (String) getAttributeInternal(REQUESTREASON);
    }

    /**
     * Sets <code>value</code> as attribute value for REQUEST_REASON using the alias name RequestReason.
     * @param value value to set the REQUEST_REASON
     */
    public void setRequestReason(String value) {
        setAttributeInternal(REQUESTREASON, value);
    }

    /**
     * Gets the attribute value for OTHER_REASON using the alias name OtherReason.
     * @return the OTHER_REASON
     */
    public String getOtherReason() {
        return (String) getAttributeInternal(OTHERREASON);
    }

    /**
     * Sets <code>value</code> as attribute value for OTHER_REASON using the alias name OtherReason.
     * @param value value to set the OTHER_REASON
     */
    public void setOtherReason(String value) {
        setAttributeInternal(OTHERREASON, value);
    }

    /**
     * Gets the attribute value for PAYMENT_METHOD using the alias name PaymentMethod.
     * @return the PAYMENT_METHOD
     */
    public String getPaymentMethod() {
        return (String) getAttributeInternal(PAYMENTMETHOD);
    }

    /**
     * Sets <code>value</code> as attribute value for PAYMENT_METHOD using the alias name PaymentMethod.
     * @param value value to set the PAYMENT_METHOD
     */
    public void setPaymentMethod(String value) {
        setAttributeInternal(PAYMENTMETHOD, value);
    }

    /**
     * Gets the attribute value for COMPENSATION_PRICE using the alias name CompensationPrice.
     * @return the COMPENSATION_PRICE
     */
    public Number getCompensationPrice() {
        return (Number) getAttributeInternal(COMPENSATIONPRICE);
    }

    /**
     * Sets <code>value</code> as attribute value for COMPENSATION_PRICE using the alias name CompensationPrice.
     * @param value value to set the COMPENSATION_PRICE
     */
    public void setCompensationPrice(Number value) {
        setAttributeInternal(COMPENSATIONPRICE, value);
    }

    /**
     * Gets the attribute value for AMOUNT using the alias name Amount.
     * @return the AMOUNT
     */
    public Number getAmount() {
        return (Number) getAttributeInternal(AMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for AMOUNT using the alias name Amount.
     * @param value value to set the AMOUNT
     */
    public void setAmount(Number value) {
        setAttributeInternal(AMOUNT, value);
    }

    /**
     * Gets the attribute value for COMMENTS using the alias name Comments.
     * @return the COMMENTS
     */
    public String getComments() {
        return (String) getAttributeInternal(COMMENTS);
    }

    /**
     * Sets <code>value</code> as attribute value for COMMENTS using the alias name Comments.
     * @param value value to set the COMMENTS
     */
    public void setComments(String value) {
        setAttributeInternal(COMMENTS, value);
    }

    /**
     * Gets the attribute value for TRAVEL_DATE using the alias name TravelDate.
     * @return the TRAVEL_DATE
     */
    public Date getTravelDate() {
        return (Date) getAttributeInternal(TRAVELDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for TRAVEL_DATE using the alias name TravelDate.
     * @param value value to set the TRAVEL_DATE
     */
    public void setTravelDate(Date value) {
        setAttributeInternal(TRAVELDATE, value);
    }

    /**
     * Gets the attribute value for END_BALANCE using the alias name EndBalance.
     * @return the END_BALANCE
     */
    public Number getEndBalance() {
        return (Number) getAttributeInternal(ENDBALANCE);
    }

    /**
     * Sets <code>value</code> as attribute value for END_BALANCE using the alias name EndBalance.
     * @param value value to set the END_BALANCE
     */
    public void setEndBalance(Number value) {
        setAttributeInternal(ENDBALANCE, value);
    }

    /**
     * Gets the attribute value for TO_DATE using the alias name ToDate.
     * @return the TO_DATE
     */
    public Date getToDate() {
        return (Date) getAttributeInternal(TODATE);
    }

    /**
     * Sets <code>value</code> as attribute value for TO_DATE using the alias name ToDate.
     * @param value value to set the TO_DATE
     */
    public void setToDate(Date value) {
        setAttributeInternal(TODATE, value);
    }

    /**
     * Gets the attribute value for ACTION_TAKEN using the alias name ActionTaken.
     * @return the ACTION_TAKEN
     */
    public String getActionTaken() {
        return (String) getAttributeInternal(ACTIONTAKEN);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTION_TAKEN using the alias name ActionTaken.
     * @param value value to set the ACTION_TAKEN
     */
    public void setActionTaken(String value) {
        setAttributeInternal(ACTIONTAKEN, value);
    }

    /**
     * Gets the attribute value for PAYMENT_STATUS using the alias name PaymentStatus.
     * @return the PAYMENT_STATUS
     */
    public String getPaymentStatus() {
        return (String) getAttributeInternal(PAYMENTSTATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for PAYMENT_STATUS using the alias name PaymentStatus.
     * @param value value to set the PAYMENT_STATUS
     */
    public void setPaymentStatus(String value) {
        setAttributeInternal(PAYMENTSTATUS, value);
    }

    /**
     * Gets the attribute value for INVOICE_NUMBER using the alias name InvoiceNumber.
     * @return the INVOICE_NUMBER
     */
    public String getInvoiceNumber() {
        return (String) getAttributeInternal(INVOICENUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for INVOICE_NUMBER using the alias name InvoiceNumber.
     * @param value value to set the INVOICE_NUMBER
     */
    public void setInvoiceNumber(String value) {
        setAttributeInternal(INVOICENUMBER, value);
    }

    /**
     * Gets the attribute value for EDIT_REQUEST using the alias name EditRequest.
     * @return the EDIT_REQUEST
     */
    public String getEditRequest() {
        return (String) getAttributeInternal(EDITREQUEST);
    }

    /**
     * Sets <code>value</code> as attribute value for EDIT_REQUEST using the alias name EditRequest.
     * @param value value to set the EDIT_REQUEST
     */
    public void setEditRequest(String value) {
        setAttributeInternal(EDITREQUEST, value);
    }


    /**
     * Gets the associated <code>RowIterator</code> using master-detail link ApprovalHistoryVO.
     */
    public RowIterator getApprovalHistoryVO() {
        return (RowIterator)getAttributeInternal(APPROVALHISTORYVO);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link RepaymentTicketsAttachmentsView.
     */
    public RowIterator getRepaymentTicketsAttachmentsView() {
        return (RowIterator)getAttributeInternal(REPAYMENTTICKETSATTACHMENTSVIEW);
    }

    /**
     * Gets the view accessor <code>RowSet</code> RepaymentTicketsReqReasonLOV1.
     */
    public RowSet getRepaymentTicketsReqReasonLOV1() {
        return (RowSet)getAttributeInternal(REPAYMENTTICKETSREQREASONLOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> DepartmentsLOV1.
     */
    public RowSet getDepartmentsLOV1() {
        return (RowSet)getAttributeInternal(DEPARTMENTSLOV1);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
