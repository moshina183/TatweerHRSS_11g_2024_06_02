package com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebServiceClient(wsdlLocation="https://egwo-test.fa.em2.oraclecloud.com/hcmCommonDataLoader/HCMDataLoader?wsdl",
  targetNamespace="http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/",
  name="HCMDataLoader")
public class HCMDataLoader_Service
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.HCMDataLoader_Service");
      URL baseUrl = HCMDataLoader_Service.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            HCMDataLoader_Service.class.getResource("https://egwo-test.fa.em2.oraclecloud.com/hcmCommonDataLoader/HCMDataLoader?wsdl");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "https://egwo-test.fa.em2.oraclecloud.com/hcmCommonDataLoader/HCMDataLoader?wsdl");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "https://egwo-test.fa.em2.oraclecloud.com/hcmCommonDataLoader/HCMDataLoader?wsdl");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using https://egwo-test.fa.em2.oraclecloud.com/hcmCommonDataLoader/HCMDataLoader?wsdl",
          e);
    }
  }

  public HCMDataLoader_Service()
  {
    super(wsdlLocationURL,
          new QName("http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/",
                    "HCMDataLoader"));
  }

  public HCMDataLoader_Service(URL wsdlLocation, QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="HCMDataLoaderSoapHttpPort")
  public com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.HCMDataLoader getHCMDataLoaderSoapHttpPort()
  {
    return (com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.HCMDataLoader) super.getPort(new QName("http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/",
                                                                                                                                 "HCMDataLoaderSoapHttpPort"),
                                                                                                                       com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.HCMDataLoader.class);
  }

  @WebEndpoint(name="HCMDataLoaderSoapHttpPort")
  public com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.HCMDataLoader getHCMDataLoaderSoapHttpPort(WebServiceFeature... features)
  {
    return (com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.HCMDataLoader) super.getPort(new QName("http://xmlns.oracle.com/apps/hcm/common/dataLoader/core/dataLoaderIntegrationService/",
                                                                                                                                 "HCMDataLoaderSoapHttpPort"),
                                                                                                                       com.oracle.xmlns.apps.hcm.common.dataloader.core.dataloaderintegrationservice.HCMDataLoader.class,
                                                                                                                       features);
  }
}
