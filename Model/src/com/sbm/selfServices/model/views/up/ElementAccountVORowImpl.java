package com.sbm.selfServices.model.views.up;

import com.sbm.selfServices.model.entities.ElementAccountEOImpl;

import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed May 22 10:20:42 AST 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ElementAccountVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        AccountId {
            public Object get(ElementAccountVORowImpl obj) {
                return obj.getAccountId();
            }

            public void put(ElementAccountVORowImpl obj, Object value) {
                obj.setAccountId((Number)value);
            }
        }
        ,
        ElementName {
            public Object get(ElementAccountVORowImpl obj) {
                return obj.getElementName();
            }

            public void put(ElementAccountVORowImpl obj, Object value) {
                obj.setElementName((String)value);
            }
        }
        ,
        AccountNumber {
            public Object get(ElementAccountVORowImpl obj) {
                return obj.getAccountNumber();
            }

            public void put(ElementAccountVORowImpl obj, Object value) {
                obj.setAccountNumber((String)value);
            }
        }
        ,
        ActiveYn {
            public Object get(ElementAccountVORowImpl obj) {
                return obj.getActiveYn();
            }

            public void put(ElementAccountVORowImpl obj, Object value) {
                obj.setActiveYn((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(ElementAccountVORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(ElementAccountVORowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreationDate {
            public Object get(ElementAccountVORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(ElementAccountVORowImpl obj, Object value) {
                obj.setCreationDate((Timestamp)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(ElementAccountVORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(ElementAccountVORowImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(ElementAccountVORowImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(ElementAccountVORowImpl obj, Object value) {
                obj.setLastUpdateDate((Timestamp)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(ElementAccountVORowImpl object);

        public abstract void put(ElementAccountVORowImpl object, Object value);

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
    public static final int ACCOUNTID = AttributesEnum.AccountId.index();
    public static final int ELEMENTNAME = AttributesEnum.ElementName.index();
    public static final int ACCOUNTNUMBER = AttributesEnum.AccountNumber.index();
    public static final int ACTIVEYN = AttributesEnum.ActiveYn.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ElementAccountVORowImpl() {
    }

    /**
     * Gets ElementAccountEO entity object.
     * @return the ElementAccountEO
     */
    public ElementAccountEOImpl getElementAccountEO() {
        return (ElementAccountEOImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for ACCOUNT_ID using the alias name AccountId.
     * @return the ACCOUNT_ID
     */
    public Number getAccountId() {
        return (Number) getAttributeInternal(ACCOUNTID);
    }

    /**
     * Sets <code>value</code> as attribute value for ACCOUNT_ID using the alias name AccountId.
     * @param value value to set the ACCOUNT_ID
     */
    public void setAccountId(Number value) {
        setAttributeInternal(ACCOUNTID, value);
    }

    /**
     * Gets the attribute value for ELEMENT_NAME using the alias name ElementName.
     * @return the ELEMENT_NAME
     */
    public String getElementName() {
        return (String) getAttributeInternal(ELEMENTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for ELEMENT_NAME using the alias name ElementName.
     * @param value value to set the ELEMENT_NAME
     */
    public void setElementName(String value) {
        setAttributeInternal(ELEMENTNAME, value);
    }

    /**
     * Gets the attribute value for ACCOUNT_NUMBER using the alias name AccountNumber.
     * @return the ACCOUNT_NUMBER
     */
    public String getAccountNumber() {
        return (String) getAttributeInternal(ACCOUNTNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for ACCOUNT_NUMBER using the alias name AccountNumber.
     * @param value value to set the ACCOUNT_NUMBER
     */
    public void setAccountNumber(String value) {
        setAttributeInternal(ACCOUNTNUMBER, value);
    }

    /**
     * Gets the attribute value for ACTIVE_YN using the alias name ActiveYn.
     * @return the ACTIVE_YN
     */
    public String getActiveYn() {
        return (String) getAttributeInternal(ACTIVEYN);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTIVE_YN using the alias name ActiveYn.
     * @param value value to set the ACTIVE_YN
     */
    public void setActiveYn(String value) {
        setAttributeInternal(ACTIVEYN, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Timestamp getCreationDate() {
        return (Timestamp) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Timestamp value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @return the LAST_UPDATE_DATE
     */
    public Timestamp getLastUpdateDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @param value value to set the LAST_UPDATE_DATE
     */
    public void setLastUpdateDate(Timestamp value) {
        setAttributeInternal(LASTUPDATEDATE, value);
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
