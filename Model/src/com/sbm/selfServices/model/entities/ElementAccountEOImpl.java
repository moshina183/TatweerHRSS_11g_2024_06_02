package com.sbm.selfServices.model.entities;

import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed May 22 10:16:59 AST 2024
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ElementAccountEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        AccountId {
            public Object get(ElementAccountEOImpl obj) {
                return obj.getAccountId();
            }

            public void put(ElementAccountEOImpl obj, Object value) {
                obj.setAccountId((Number)value);
            }
        }
        ,
        ElementName {
            public Object get(ElementAccountEOImpl obj) {
                return obj.getElementName();
            }

            public void put(ElementAccountEOImpl obj, Object value) {
                obj.setElementName((String)value);
            }
        }
        ,
        AccountNumber {
            public Object get(ElementAccountEOImpl obj) {
                return obj.getAccountNumber();
            }

            public void put(ElementAccountEOImpl obj, Object value) {
                obj.setAccountNumber((String)value);
            }
        }
        ,
        ActiveYn {
            public Object get(ElementAccountEOImpl obj) {
                return obj.getActiveYn();
            }

            public void put(ElementAccountEOImpl obj, Object value) {
                obj.setActiveYn((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(ElementAccountEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(ElementAccountEOImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreationDate {
            public Object get(ElementAccountEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(ElementAccountEOImpl obj, Object value) {
                obj.setCreationDate((Timestamp)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(ElementAccountEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(ElementAccountEOImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(ElementAccountEOImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(ElementAccountEOImpl obj, Object value) {
                obj.setLastUpdateDate((Timestamp)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(ElementAccountEOImpl object);

        public abstract void put(ElementAccountEOImpl object, Object value);

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
    public ElementAccountEOImpl() {
    }

    /**
     * Gets the attribute value for AccountId, using the alias name AccountId.
     * @return the AccountId
     */
    public Number getAccountId() {
        return (Number)getAttributeInternal(ACCOUNTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AccountId.
     * @param value value to set the AccountId
     */
    public void setAccountId(Number value) {
        setAttributeInternal(ACCOUNTID, value);
    }

    /**
     * Gets the attribute value for ElementName, using the alias name ElementName.
     * @return the ElementName
     */
    public String getElementName() {
        return (String)getAttributeInternal(ELEMENTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for ElementName.
     * @param value value to set the ElementName
     */
    public void setElementName(String value) {
        setAttributeInternal(ELEMENTNAME, value);
    }

    /**
     * Gets the attribute value for AccountNumber, using the alias name AccountNumber.
     * @return the AccountNumber
     */
    public String getAccountNumber() {
        return (String)getAttributeInternal(ACCOUNTNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for AccountNumber.
     * @param value value to set the AccountNumber
     */
    public void setAccountNumber(String value) {
        setAttributeInternal(ACCOUNTNUMBER, value);
    }

    /**
     * Gets the attribute value for ActiveYn, using the alias name ActiveYn.
     * @return the ActiveYn
     */
    public String getActiveYn() {
        return (String)getAttributeInternal(ACTIVEYN);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActiveYn.
     * @param value value to set the ActiveYn
     */
    public void setActiveYn(String value) {
        setAttributeInternal(ACTIVEYN, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public String getCreatedBy() {
        return (String)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Timestamp getCreationDate() {
        return (Timestamp)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Timestamp value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the LastUpdateDate
     */
    public Timestamp getLastUpdateDate() {
        return (Timestamp)getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateDate.
     * @param value value to set the LastUpdateDate
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

    /**
     * @param accountId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number accountId) {
        return new Key(new Object[]{accountId});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.sbm.selfServices.model.entities.ElementAccountEO");
    }
}
