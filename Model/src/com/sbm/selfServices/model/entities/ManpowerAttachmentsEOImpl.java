package com.sbm.selfServices.model.entities;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.BlobDomain;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Dec 06 12:35:29 AST 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ManpowerAttachmentsEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        AttachId {
            public Object get(ManpowerAttachmentsEOImpl obj) {
                return obj.getAttachId();
            }

            public void put(ManpowerAttachmentsEOImpl obj, Object value) {
                obj.setAttachId((DBSequence)value);
            }
        }
        ,
        FileName {
            public Object get(ManpowerAttachmentsEOImpl obj) {
                return obj.getFileName();
            }

            public void put(ManpowerAttachmentsEOImpl obj, Object value) {
                obj.setFileName((String)value);
            }
        }
        ,
        FileType {
            public Object get(ManpowerAttachmentsEOImpl obj) {
                return obj.getFileType();
            }

            public void put(ManpowerAttachmentsEOImpl obj, Object value) {
                obj.setFileType((String)value);
            }
        }
        ,
        AttachmentFile {
            public Object get(ManpowerAttachmentsEOImpl obj) {
                return obj.getAttachmentFile();
            }

            public void put(ManpowerAttachmentsEOImpl obj, Object value) {
                obj.setAttachmentFile((BlobDomain)value);
            }
        }
        ,
        ManpowerReqId {
            public Object get(ManpowerAttachmentsEOImpl obj) {
                return obj.getManpowerReqId();
            }

            public void put(ManpowerAttachmentsEOImpl obj, Object value) {
                obj.setManpowerReqId((Number)value);
            }
        }
        ,
        UploadedBy {
            public Object get(ManpowerAttachmentsEOImpl obj) {
                return obj.getUploadedBy();
            }

            public void put(ManpowerAttachmentsEOImpl obj, Object value) {
                obj.setUploadedBy((String)value);
            }
        }
        ,
        ManPowerRequest {
            public Object get(ManpowerAttachmentsEOImpl obj) {
                return obj.getManPowerRequest();
            }

            public void put(ManpowerAttachmentsEOImpl obj, Object value) {
                obj.setManPowerRequest((EntityImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(ManpowerAttachmentsEOImpl object);

        public abstract void put(ManpowerAttachmentsEOImpl object,
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
    public static final int ATTACHID = AttributesEnum.AttachId.index();
    public static final int FILENAME = AttributesEnum.FileName.index();
    public static final int FILETYPE = AttributesEnum.FileType.index();
    public static final int ATTACHMENTFILE = AttributesEnum.AttachmentFile.index();
    public static final int MANPOWERREQID = AttributesEnum.ManpowerReqId.index();
    public static final int UPLOADEDBY = AttributesEnum.UploadedBy.index();
    public static final int MANPOWERREQUEST = AttributesEnum.ManPowerRequest.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ManpowerAttachmentsEOImpl() {
    }

    /**
     * Gets the attribute value for AttachId, using the alias name AttachId.
     * @return the AttachId
     */
    public DBSequence getAttachId() {
        return (DBSequence)getAttributeInternal(ATTACHID);
    }

    /**
     * Sets <code>value</code> as the attribute value for AttachId.
     * @param value value to set the AttachId
     */
    public void setAttachId(DBSequence value) {
        setAttributeInternal(ATTACHID, value);
    }

    /**
     * Gets the attribute value for FileName, using the alias name FileName.
     * @return the FileName
     */
    public String getFileName() {
        return (String)getAttributeInternal(FILENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for FileName.
     * @param value value to set the FileName
     */
    public void setFileName(String value) {
        setAttributeInternal(FILENAME, value);
    }

    /**
     * Gets the attribute value for FileType, using the alias name FileType.
     * @return the FileType
     */
    public String getFileType() {
        return (String)getAttributeInternal(FILETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for FileType.
     * @param value value to set the FileType
     */
    public void setFileType(String value) {
        setAttributeInternal(FILETYPE, value);
    }

    /**
     * Gets the attribute value for AttachmentFile, using the alias name AttachmentFile.
     * @return the AttachmentFile
     */
    public BlobDomain getAttachmentFile() {
        return (BlobDomain)getAttributeInternal(ATTACHMENTFILE);
    }

    /**
     * Sets <code>value</code> as the attribute value for AttachmentFile.
     * @param value value to set the AttachmentFile
     */
    public void setAttachmentFile(BlobDomain value) {
        setAttributeInternal(ATTACHMENTFILE, value);
    }

    /**
     * Gets the attribute value for ManpowerReqId, using the alias name ManpowerReqId.
     * @return the ManpowerReqId
     */
    public Number getManpowerReqId() {
        return (Number)getAttributeInternal(MANPOWERREQID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ManpowerReqId.
     * @param value value to set the ManpowerReqId
     */
    public void setManpowerReqId(Number value) {
        setAttributeInternal(MANPOWERREQID, value);
    }

    /**
     * Gets the attribute value for UploadedBy, using the alias name UploadedBy.
     * @return the UploadedBy
     */
    public String getUploadedBy() {
        return (String)getAttributeInternal(UPLOADEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UploadedBy.
     * @param value value to set the UploadedBy
     */
    public void setUploadedBy(String value) {
        setAttributeInternal(UPLOADEDBY, value);
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
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getManPowerRequest() {
        return (EntityImpl)getAttributeInternal(MANPOWERREQUEST);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setManPowerRequest(EntityImpl value) {
        setAttributeInternal(MANPOWERREQUEST, value);
    }

    /**
     * @param attachId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(DBSequence attachId) {
        return new Key(new Object[]{attachId});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.sbm.selfServices.model.entities.ManpowerAttachmentsEO");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        getDBTransaction().commit();
        super.create(attributeList);
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}