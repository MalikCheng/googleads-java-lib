// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201802.ch;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Use this service to retrieve the changed entities for a customer account or campaign based on the
 *       given date range.
 *       
 *       <p class="note"><b>Note:</b> There will be some delay in changes becoming visible to this
 *       service; thus, use {@code lastChangeTimestamp} from the response to determine the validity period
 *       for the data.
 *       
 *       <p class="note"><b>Note:</b> CustomerSyncService only supports queries for dates within the last
 *       90 days.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CustomerSyncServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/ch/v201802")
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201802.ch.ObjectFactory.class,
    com.google.api.ads.adwords.jaxws.v201802.cm.ObjectFactory.class
})
public interface CustomerSyncServiceInterface {


    /**
     * 
     *         Returns information about changed entities inside a customer's account.
     *         
     *         @param selector Specifies the filter for selecting changehistory events for a customer.
     *         @return A Customer->Campaign->AdGroup hierarchy containing information about the objects
     *         changed at each level. All Campaigns that are requested in the selector will be returned,
     *         regardless of whether or not they have changed, but unchanged AdGroups will be ignored.
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201802.ch.CustomerChangeData
     * @throws ApiException
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/ch/v201802")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/ch/v201802", className = "com.google.api.ads.adwords.jaxws.v201802.ch.CustomerSyncServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/ch/v201802", className = "com.google.api.ads.adwords.jaxws.v201802.ch.CustomerSyncServiceInterfacegetResponse")
    public CustomerChangeData get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/ch/v201802")
        CustomerSyncSelector selector)
        throws ApiException
    ;

}