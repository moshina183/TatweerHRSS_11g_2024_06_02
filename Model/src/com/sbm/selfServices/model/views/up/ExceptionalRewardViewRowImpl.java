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
// ---    Sat Apr 27 20:38:18 AST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ExceptionalRewardViewRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ExceptionalRewardId {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getExceptionalRewardId();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setExceptionalRewardId((DBSequence)value);
            }
        }
        ,
        CreationDate {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        PersonNumber {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getPersonNumber();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setPersonNumber((String)value);
            }
        }
        ,
        PersonName {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getPersonName();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setPersonName((String)value);
            }
        }
        ,
        StepId {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getStepId();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setStepId((Integer)value);
            }
        }
        ,
        Assignee {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getAssignee();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setAssignee((String)value);
            }
        }
        ,
        AssigneeName {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getAssigneeName();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setAssigneeName((String)value);
            }
        }
        ,
        PersonPosition {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getPersonPosition();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setPersonPosition((String)value);
            }
        }
        ,
        PersonJob {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getPersonJob();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setPersonJob((String)value);
            }
        }
        ,
        PersonDepartment {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getPersonDepartment();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setPersonDepartment((String)value);
            }
        }
        ,
        PersonLocation {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getPersonLocation();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setPersonLocation((String)value);
            }
        }
        ,
        PersonGrade {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getPersonGrade();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setPersonGrade((String)value);
            }
        }
        ,
        RequestStatus {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getRequestStatus();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setRequestStatus((String)value);
            }
        }
        ,
        RejectionReason {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getRejectionReason();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setRejectionReason((String)value);
            }
        }
        ,
        RewardAmount {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getRewardAmount();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setRewardAmount((Number)value);
            }
        }
        ,
        Justification {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getJustification();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setJustification((String)value);
            }
        }
        ,
        PercentageFromBasicSal {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getPercentageFromBasicSal();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setPercentageFromBasicSal((Number)value);
            }
        }
        ,
        BasicSalary {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getBasicSalary();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setBasicSalary((Number)value);
            }
        }
        ,
        HrRecomendations {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getHrRecomendations();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setHrRecomendations((Number)value);
            }
        }
        ,
        LastRewardDate {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getLastRewardDate();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setLastRewardDate((Date)value);
            }
        }
        ,
        EmpBasicSalary {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getEmpBasicSalary();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setEmpBasicSalary((String)value);
            }
        }
        ,
        CreatedByName {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getCreatedByName();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setCreatedByName((String)value);
            }
        }
        ,
        CreatedByNo {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getCreatedByNo();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setCreatedByNo((String)value);
            }
        }
        ,
        ActionTaken {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getActionTaken();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setActionTaken((String)value);
            }
        }
        ,
        LastRewardDateString {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getLastRewardDateString();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setLastRewardDateString((String)value);
            }
        }
        ,
        EditRequest {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getEditRequest();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setEditRequest((String)value);
            }
        }
        ,
        ExceptionalRewardAttachmentsView {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getExceptionalRewardAttachmentsView();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ApprovalHistoryVO {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getApprovalHistoryVO();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ManagerEmployeesVO1 {
            public Object get(ExceptionalRewardViewRowImpl obj) {
                return obj.getManagerEmployeesVO1();
            }

            public void put(ExceptionalRewardViewRowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(ExceptionalRewardViewRowImpl object);

        public abstract void put(ExceptionalRewardViewRowImpl object,
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


    public static final int EXCEPTIONALREWARDID = AttributesEnum.ExceptionalRewardId.index();
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
    public static final int REWARDAMOUNT = AttributesEnum.RewardAmount.index();
    public static final int JUSTIFICATION = AttributesEnum.Justification.index();
    public static final int PERCENTAGEFROMBASICSAL = AttributesEnum.PercentageFromBasicSal.index();
    public static final int BASICSALARY = AttributesEnum.BasicSalary.index();
    public static final int HRRECOMENDATIONS = AttributesEnum.HrRecomendations.index();
    public static final int LASTREWARDDATE = AttributesEnum.LastRewardDate.index();
    public static final int EMPBASICSALARY = AttributesEnum.EmpBasicSalary.index();
    public static final int CREATEDBYNAME = AttributesEnum.CreatedByName.index();
    public static final int CREATEDBYNO = AttributesEnum.CreatedByNo.index();
    public static final int ACTIONTAKEN = AttributesEnum.ActionTaken.index();
    public static final int LASTREWARDDATESTRING = AttributesEnum.LastRewardDateString.index();
    public static final int EDITREQUEST = AttributesEnum.EditRequest.index();
    public static final int EXCEPTIONALREWARDATTACHMENTSVIEW = AttributesEnum.ExceptionalRewardAttachmentsView.index();
    public static final int APPROVALHISTORYVO = AttributesEnum.ApprovalHistoryVO.index();
    public static final int MANAGEREMPLOYEESVO1 = AttributesEnum.ManagerEmployeesVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ExceptionalRewardViewRowImpl() {
    }

    /**
     * Gets ExceptionalReward entity object.
     * @return the ExceptionalReward
     */
    public EntityImpl getExceptionalReward() {
        return (EntityImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for EXCEPTIONAL_REWARD_ID using the alias name ExceptionalRewardId.
     * @return the EXCEPTIONAL_REWARD_ID
     */
    public DBSequence getExceptionalRewardId() {
        return (DBSequence)getAttributeInternal(EXCEPTIONALREWARDID);
    }

    /**
     * Sets <code>value</code> as attribute value for EXCEPTIONAL_REWARD_ID using the alias name ExceptionalRewardId.
     * @param value value to set the EXCEPTIONAL_REWARD_ID
     */
    public void setExceptionalRewardId(DBSequence value) {
        setAttributeInternal(EXCEPTIONALREWARDID, value);
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
     * Gets the attribute value for REWARD_AMOUNT using the alias name RewardAmount.
     * @return the REWARD_AMOUNT
     */
    public Number getRewardAmount() {
        return (Number) getAttributeInternal(REWARDAMOUNT);
    }

    /**
     * Sets <code>value</code> as attribute value for REWARD_AMOUNT using the alias name RewardAmount.
     * @param value value to set the REWARD_AMOUNT
     */
    public void setRewardAmount(Number value) {
        setAttributeInternal(REWARDAMOUNT, value);
    }

    /**
     * Gets the attribute value for JUSTIFICATION using the alias name Justification.
     * @return the JUSTIFICATION
     */
    public String getJustification() {
        return (String) getAttributeInternal(JUSTIFICATION);
    }

    /**
     * Sets <code>value</code> as attribute value for JUSTIFICATION using the alias name Justification.
     * @param value value to set the JUSTIFICATION
     */
    public void setJustification(String value) {
        setAttributeInternal(JUSTIFICATION, value);
    }

    /**
     * Gets the attribute value for PERCENTAGE_FROM_BASIC_SAL using the alias name PercentageFromBasicSal.
     * @return the PERCENTAGE_FROM_BASIC_SAL
     */
    public Number getPercentageFromBasicSal() {
        return (Number) getAttributeInternal(PERCENTAGEFROMBASICSAL);
    }

    /**
     * Sets <code>value</code> as attribute value for PERCENTAGE_FROM_BASIC_SAL using the alias name PercentageFromBasicSal.
     * @param value value to set the PERCENTAGE_FROM_BASIC_SAL
     */
    public void setPercentageFromBasicSal(Number value) {
        setAttributeInternal(PERCENTAGEFROMBASICSAL, value);
    }

    /**
     * Gets the attribute value for BASIC_SALARY using the alias name BasicSalary.
     * @return the BASIC_SALARY
     */
    public Number getBasicSalary() {
        return (Number) getAttributeInternal(BASICSALARY);
    }

    /**
     * Sets <code>value</code> as attribute value for BASIC_SALARY using the alias name BasicSalary.
     * @param value value to set the BASIC_SALARY
     */
    public void setBasicSalary(Number value) {
        setAttributeInternal(BASICSALARY, value);
    }

    /**
     * Gets the attribute value for HR_RECOMENDATIONS using the alias name HrRecomendations.
     * @return the HR_RECOMENDATIONS
     */
    public Number getHrRecomendations() {
        return (Number) getAttributeInternal(HRRECOMENDATIONS);
    }

    /**
     * Sets <code>value</code> as attribute value for HR_RECOMENDATIONS using the alias name HrRecomendations.
     * @param value value to set the HR_RECOMENDATIONS
     */
    public void setHrRecomendations(Number value) {
        setAttributeInternal(HRRECOMENDATIONS, value);
    }

    /**
     * Gets the attribute value for LAST_REWARD_DATE using the alias name LastRewardDate.
     * @return the LAST_REWARD_DATE
     */
    public Date getLastRewardDate() {
        return (Date) getAttributeInternal(LASTREWARDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_REWARD_DATE using the alias name LastRewardDate.
     * @param value value to set the LAST_REWARD_DATE
     */
    public void setLastRewardDate(Date value) {
        setAttributeInternal(LASTREWARDDATE, value);
    }

    /**
     * Gets the attribute value for EMP_BASIC_SALARY using the alias name EmpBasicSalary.
     * @return the EMP_BASIC_SALARY
     */
    public String getEmpBasicSalary() {
        return (String) getAttributeInternal(EMPBASICSALARY);
    }

    /**
     * Sets <code>value</code> as attribute value for EMP_BASIC_SALARY using the alias name EmpBasicSalary.
     * @param value value to set the EMP_BASIC_SALARY
     */
    public void setEmpBasicSalary(String value) {
        setAttributeInternal(EMPBASICSALARY, value);
    }

    /**
     * Gets the attribute value for CREATED_BY_NAME using the alias name CreatedByName.
     * @return the CREATED_BY_NAME
     */
    public String getCreatedByName() {
        return (String) getAttributeInternal(CREATEDBYNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY_NAME using the alias name CreatedByName.
     * @param value value to set the CREATED_BY_NAME
     */
    public void setCreatedByName(String value) {
        setAttributeInternal(CREATEDBYNAME, value);
    }

    /**
     * Gets the attribute value for CREATED_BY_NO using the alias name CreatedByNo.
     * @return the CREATED_BY_NO
     */
    public String getCreatedByNo() {
        return (String) getAttributeInternal(CREATEDBYNO);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY_NO using the alias name CreatedByNo.
     * @param value value to set the CREATED_BY_NO
     */
    public void setCreatedByNo(String value) {
        setAttributeInternal(CREATEDBYNO, value);
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
     * Gets the attribute value for LAST_REWARD_DATE_STRING using the alias name LastRewardDateString.
     * @return the LAST_REWARD_DATE_STRING
     */
    public String getLastRewardDateString() {
        return (String) getAttributeInternal(LASTREWARDDATESTRING);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_REWARD_DATE_STRING using the alias name LastRewardDateString.
     * @param value value to set the LAST_REWARD_DATE_STRING
     */
    public void setLastRewardDateString(String value) {
        setAttributeInternal(LASTREWARDDATESTRING, value);
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
     * Gets the associated <code>RowIterator</code> using master-detail link ExceptionalRewardAttachmentsView.
     */
    public RowIterator getExceptionalRewardAttachmentsView() {
        return (RowIterator)getAttributeInternal(EXCEPTIONALREWARDATTACHMENTSVIEW);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link ApprovalHistoryVO.
     */
    public RowIterator getApprovalHistoryVO() {
        return (RowIterator)getAttributeInternal(APPROVALHISTORYVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ManagerEmployeesVO1.
     */
    public RowSet getManagerEmployeesVO1() {
        return (RowSet)getAttributeInternal(MANAGEREMPLOYEESVO1);
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
