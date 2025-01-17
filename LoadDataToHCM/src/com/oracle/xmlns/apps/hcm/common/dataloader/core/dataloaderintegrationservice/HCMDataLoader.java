package com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice;

import java.util.List;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebService(wsdlLocation="https://egwo-test.fa.em2.oraclecloud.com/hcmCommonDataLoader/HCMDataLoader?wsdl",
  targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/",
  name="HCMDataLoader")
@XmlSeeAlso(
  { sdo.commonj.java.ObjectFactory.class, com.oracle.xmlns.oracleas.schema.oracle_fault_11_0.ObjectFactory.class, com.oracle.xmlns.adf.svc.types.ObjectFactory.class, sdo.commonj.ObjectFactory.class, com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.types.ObjectFactory.class, sdo.commonj.xml.ObjectFactory.class, com.oracle.xmlns.adf.svc.errors.ObjectFactory.class })
public interface HCMDataLoader
{
  @WebMethod(action="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/importAndLoadData")
  @Action(input="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/importAndLoadData", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/HCMDataLoader/importAndLoadData/Fault/ServiceException",
          className=com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.ServiceException.class) },
    output="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/HCMDataLoader/importAndLoadDataResponse")
  @ResponseWrapper(localName="importAndLoadDataResponse", targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
    className="com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.types.ImportAndLoadDataResponse")
  @RequestWrapper(localName="importAndLoadData", targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
    className="com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.types.ImportAndLoadData")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
    name="result")
  public String importAndLoadData(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
      name="ContentId")
    String contentId, @WebParam(targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
      name="Parameters")
    String parameters)
    throws com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/importAndLoadDataAsync")
  @Action(input="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/importAndLoadDataAsync")
  @RequestWrapper(localName="importAndLoadDataAsync", targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
    className="com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.types.ImportAndLoadDataAsync")
  @Oneway
  public void importAndLoadDataAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
      name="ContentId")
    String contentId, @WebParam(targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
      name="Parameters")
    String parameters);

  @WebMethod(action="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/getDfltObjAttrHints")
  @Action(input="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/getDfltObjAttrHints", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/HCMDataLoader/getDfltObjAttrHints/Fault/ServiceException",
          className=com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.ServiceException.class) },
    output="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/HCMDataLoader/getDfltObjAttrHintsResponse")
  @ResponseWrapper(localName="getDfltObjAttrHintsResponse",
    targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
    className="com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.types.GetDfltObjAttrHintsResponse")
  @RequestWrapper(localName="getDfltObjAttrHints", targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
    className="com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.types.GetDfltObjAttrHints")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
    name="result")
  public com.oracle.xmlns.adf.svc.types.ObjAttrHints getDfltObjAttrHints(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
      name="viewName")
    String viewName, @WebParam(targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
      name="localeName")
    String localeName)
    throws com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/getServiceLastUpdateTime")
  @Action(input="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/getServiceLastUpdateTime", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/HCMDataLoader/getServiceLastUpdateTime/Fault/ServiceException",
          className=com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.ServiceException.class) },
    output="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/HCMDataLoader/getServiceLastUpdateTimeResponse")
  @ResponseWrapper(localName="getServiceLastUpdateTimeResponse",
    targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
    className="com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.types.GetServiceLastUpdateTimeResponse")
  @RequestWrapper(localName="getServiceLastUpdateTime", targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
    className="com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.types.GetServiceLastUpdateTime")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
    name="result")
  public XMLGregorianCalendar getServiceLastUpdateTime()
    throws com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/getEntityList")
  @Action(input="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/getEntityList", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/HCMDataLoader/getEntityList/Fault/ServiceException",
          className=com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.ServiceException.class) },
    output="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/HCMDataLoader/getEntityListResponse")
  @ResponseWrapper(localName="getEntityListResponse", targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
    className="com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.types.GetEntityListResponse")
  @RequestWrapper(localName="getEntityList", targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
    className="com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.types.GetEntityList")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
    name="result")
  public List<com.oracle.xmlns.adf.svc.types.ServiceViewInfo> getEntityList()
    throws com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/getEntityListAsync")
  @Action(input="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/getEntityListAsync")
  @RequestWrapper(localName="getEntityListAsync", targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
    className="com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.types.GetEntityListAsync")
  @Oneway
  public void getEntityListAsync();

  @WebMethod(action="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/getDfltObjAttrHintsAsync")
  @Action(input="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/getDfltObjAttrHintsAsync")
  @RequestWrapper(localName="getDfltObjAttrHintsAsync", targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
    className="com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.types.GetDfltObjAttrHintsAsync")
  @Oneway
  public void getDfltObjAttrHintsAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
      name="viewName")
    String viewName, @WebParam(targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
      name="localeName")
    String localeName);

  @WebMethod(action="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/getServiceLastUpdateTimeAsync")
  @Action(input="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/getServiceLastUpdateTimeAsync")
  @RequestWrapper(localName="getServiceLastUpdateTimeAsync",
    targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
    className="com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.types.GetServiceLastUpdateTimeAsync")
  @Oneway
  public void getServiceLastUpdateTimeAsync();

  @WebMethod(action="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/getDataSetStatus")
  @Action(input="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/getDataSetStatus", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/HCMDataLoader/getDataSetStatus/Fault/ServiceException",
          className=com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.ServiceException.class) },
    output="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/HCMDataLoader/getDataSetStatusResponse")
  @ResponseWrapper(localName="getDataSetStatusResponse", targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
    className="com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.types.GetDataSetStatusResponse")
  @RequestWrapper(localName="getDataSetStatus", targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
    className="com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.types.GetDataSetStatus")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
    name="result")
  public String getDataSetStatus(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
      name="Parameters")
    String parameters)
    throws com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/getDataSetStatusAsync")
  @Action(input="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/getDataSetStatusAsync")
  @RequestWrapper(localName="getDataSetStatusAsync", targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
    className="com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.types.GetDataSetStatusAsync")
  @Oneway
  public void getDataSetStatusAsync(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/types/",
      name="Parameters")
    String parameters);
}
