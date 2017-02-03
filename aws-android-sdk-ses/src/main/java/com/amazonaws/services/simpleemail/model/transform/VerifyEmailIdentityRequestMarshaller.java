/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for VerifyEmailIdentityRequest
 */
public class VerifyEmailIdentityRequestMarshaller implements
        Marshaller<Request<VerifyEmailIdentityRequest>, VerifyEmailIdentityRequest> {

    public Request<VerifyEmailIdentityRequest> marshall(
            VerifyEmailIdentityRequest verifyEmailIdentityRequest) {
        if (verifyEmailIdentityRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(VerifyEmailIdentityRequest)");
        }

        Request<VerifyEmailIdentityRequest> request = new DefaultRequest<VerifyEmailIdentityRequest>(
                verifyEmailIdentityRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "VerifyEmailIdentity");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (verifyEmailIdentityRequest.getEmailAddress() != null) {
            prefix = "EmailAddress";
            String emailAddress = verifyEmailIdentityRequest.getEmailAddress();
            request.addParameter(prefix, StringUtils.fromString(emailAddress));
        }

        return request;
    }
}