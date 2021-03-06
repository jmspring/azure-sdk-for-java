/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.notificationhubs.models;

/**
* Parameters supplied to the Check NameAvailability operation.
*/
public class CheckAvailabilityParameters {
    private String name;
    
    /**
    * Required. Gets or sets the name to check for.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Required. Gets or sets the name to check for.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    /**
    * Initializes a new instance of the CheckAvailabilityParameters class.
    *
    */
    public CheckAvailabilityParameters() {
    }
    
    /**
    * Initializes a new instance of the CheckAvailabilityParameters class with
    * required arguments.
    *
    * @param name Gets or sets the name to check for.
    */
    public CheckAvailabilityParameters(String name) {
        if (name == null) {
            throw new NullPointerException("name");
        }
        this.setName(name);
    }
}
