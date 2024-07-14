package com.oracle.xmlns.oxp.service.v2;

import javax.xml.ws.WebFault;

@WebFault(faultBean="com.oracle.xmlns.oxp.service.v2.AccessDeniedException",
  targetNamespace="http://xmlns.oracle.com/oxp/service/v2", name="fault")
public class AccessDeniedException_Exception
  extends Exception
{
  private com.oracle.xmlns.oxp.service.v2.AccessDeniedException faultInfo;

  public AccessDeniedException_Exception(String message,
                                         com.oracle.xmlns.oxp.service.v2.AccessDeniedException faultInfo)
  {
    super(message);
    this.faultInfo = faultInfo;
  }

  public AccessDeniedException_Exception(String message,
                                         com.oracle.xmlns.oxp.service.v2.AccessDeniedException faultInfo,
                                         Throwable t)
  {
    super(message,t);
    this.faultInfo = faultInfo;
  }

  public com.oracle.xmlns.oxp.service.v2.AccessDeniedException getFaultInfo()
  {
    return faultInfo;
  }

  public void setFaultInfo(com.oracle.xmlns.oxp.service.v2.AccessDeniedException faultInfo)
  {
    this.faultInfo = faultInfo;
  }
}
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)
