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

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Application Version Description StAX Unmarshaller
 */
public class ApplicationVersionDescriptionStaxUnmarshaller implements Unmarshaller<ApplicationVersionDescription, StaxUnmarshallerContext> {

    

    public ApplicationVersionDescription unmarshall(StaxUnmarshallerContext context) throws Exception {
        ApplicationVersionDescription applicationVersionDescription = new ApplicationVersionDescription();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return applicationVersionDescription;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("ApplicationName", targetDepth)) {
                    applicationVersionDescription.setApplicationName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Description", targetDepth)) {
                    applicationVersionDescription.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VersionLabel", targetDepth)) {
                    applicationVersionDescription.setVersionLabel(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SourceBundle", targetDepth)) {
                    applicationVersionDescription.setSourceBundle(S3LocationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DateCreated", targetDepth)) {
                    applicationVersionDescription.setDateCreated(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DateUpdated", targetDepth)) {
                    applicationVersionDescription.setDateUpdated(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return applicationVersionDescription;
                }
            }
        }
    }

    private static ApplicationVersionDescriptionStaxUnmarshaller instance;
    public static ApplicationVersionDescriptionStaxUnmarshaller getInstance() {
        if (instance == null) instance = new ApplicationVersionDescriptionStaxUnmarshaller();
        return instance;
    }
}
    