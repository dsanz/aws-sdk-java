/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticbeanstalk.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Restart App Server Request Marshaller
 */
public class RestartAppServerRequestMarshaller implements Marshaller<Request<RestartAppServerRequest>, RestartAppServerRequest> {

    public Request<RestartAppServerRequest> marshall(RestartAppServerRequest restartAppServerRequest) {
        Request<RestartAppServerRequest> request = new DefaultRequest<RestartAppServerRequest>(restartAppServerRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "RestartAppServer");
        request.addParameter("Version", "2010-12-01");
        if (restartAppServerRequest != null) {
            if (restartAppServerRequest.getEnvironmentId() != null) {
                request.addParameter("EnvironmentId", StringUtils.fromString(restartAppServerRequest.getEnvironmentId()));
            }
        }
        if (restartAppServerRequest != null) {
            if (restartAppServerRequest.getEnvironmentName() != null) {
                request.addParameter("EnvironmentName", StringUtils.fromString(restartAppServerRequest.getEnvironmentName()));
            }
        }


        return request;
    }
}
