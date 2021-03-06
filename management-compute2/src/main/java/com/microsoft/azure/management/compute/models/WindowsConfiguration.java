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

package com.microsoft.azure.management.compute.models;

import com.microsoft.windowsazure.core.LazyArrayList;
import java.util.ArrayList;

/**
* Describes Windows Configuration of the OS Profile.
*/
public class WindowsConfiguration {
    private ArrayList<AdditionalUnattendContent> additionalUnattendContents;
    
    /**
    * Optional. Gets or sets the additional base-64 encoded XML formatted
    * information that can be included in the Unattend.xml file.
    * @return The AdditionalUnattendContents value.
    */
    public ArrayList<AdditionalUnattendContent> getAdditionalUnattendContents() {
        return this.additionalUnattendContents;
    }
    
    /**
    * Optional. Gets or sets the additional base-64 encoded XML formatted
    * information that can be included in the Unattend.xml file.
    * @param additionalUnattendContentsValue The AdditionalUnattendContents
    * value.
    */
    public void setAdditionalUnattendContents(final ArrayList<AdditionalUnattendContent> additionalUnattendContentsValue) {
        this.additionalUnattendContents = additionalUnattendContentsValue;
    }
    
    private Boolean enableAutomaticUpdates;
    
    /**
    * Optional. Gets or sets whether Windows updates are automatically
    * installed on the VM
    * @return The EnableAutomaticUpdates value.
    */
    public Boolean isEnableAutomaticUpdates() {
        return this.enableAutomaticUpdates;
    }
    
    /**
    * Optional. Gets or sets whether Windows updates are automatically
    * installed on the VM
    * @param enableAutomaticUpdatesValue The EnableAutomaticUpdates value.
    */
    public void setEnableAutomaticUpdates(final Boolean enableAutomaticUpdatesValue) {
        this.enableAutomaticUpdates = enableAutomaticUpdatesValue;
    }
    
    private Boolean provisionVMAgent;
    
    /**
    * Optional. Gets or sets whether VM Agent should be provisioned on the
    * Virtual Machine.
    * @return The ProvisionVMAgent value.
    */
    public Boolean isProvisionVMAgent() {
        return this.provisionVMAgent;
    }
    
    /**
    * Optional. Gets or sets whether VM Agent should be provisioned on the
    * Virtual Machine.
    * @param provisionVMAgentValue The ProvisionVMAgent value.
    */
    public void setProvisionVMAgent(final Boolean provisionVMAgentValue) {
        this.provisionVMAgent = provisionVMAgentValue;
    }
    
    private String timeZone;
    
    /**
    * Optional. Gets or sets the Time Zone of the VM
    * @return The TimeZone value.
    */
    public String getTimeZone() {
        return this.timeZone;
    }
    
    /**
    * Optional. Gets or sets the Time Zone of the VM
    * @param timeZoneValue The TimeZone value.
    */
    public void setTimeZone(final String timeZoneValue) {
        this.timeZone = timeZoneValue;
    }
    
    private WinRMConfiguration winRMConfiguration;
    
    /**
    * Optional. Gets or sets the Windows Remote Management configuration of the
    * VM
    * @return The WinRMConfiguration value.
    */
    public WinRMConfiguration getWinRMConfiguration() {
        return this.winRMConfiguration;
    }
    
    /**
    * Optional. Gets or sets the Windows Remote Management configuration of the
    * VM
    * @param winRMConfigurationValue The WinRMConfiguration value.
    */
    public void setWinRMConfiguration(final WinRMConfiguration winRMConfigurationValue) {
        this.winRMConfiguration = winRMConfigurationValue;
    }
    
    /**
    * Initializes a new instance of the WindowsConfiguration class.
    *
    */
    public WindowsConfiguration() {
        this.setAdditionalUnattendContents(new LazyArrayList<AdditionalUnattendContent>());
    }
}
