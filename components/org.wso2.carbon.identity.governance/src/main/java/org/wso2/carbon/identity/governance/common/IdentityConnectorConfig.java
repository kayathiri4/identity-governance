/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.governance.common;

import org.wso2.carbon.identity.application.common.model.Property;
import org.wso2.carbon.identity.core.ConnectorConfig;
import org.wso2.carbon.identity.governance.IdentityGovernanceException;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * This interface is used for create connectors.
 */
public interface IdentityConnectorConfig extends ConnectorConfig {

    Properties getDefaultPropertyValues(String tenantDomain) throws IdentityGovernanceException;

    Map<String, String> getDefaultPropertyValues(String[] propertyNames, String tenantDomain) throws
            IdentityGovernanceException;

    default List<String> getConfidentialPropertyValues(String tenantDomain) {

        return null;
    }

    /**
     * Override this method to set meta data properties.
     *
     * @return Map object, key as property name and value as Property Object.
     */
    default Map<String, Property> getMetaData() {

        return null;
    }
}
