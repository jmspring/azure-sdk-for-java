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

package com.microsoft.windowsazure.scheduler;

import com.microsoft.windowsazure.core.ServiceClient;
import com.microsoft.windowsazure.credentials.SubscriptionCloudCredentials;
import com.microsoft.windowsazure.management.configuration.ManagementConfiguration;
import com.microsoft.windowsazure.scheduler.models.HttpAuthenticationType;
import com.microsoft.windowsazure.scheduler.models.JobActionType;
import com.microsoft.windowsazure.scheduler.models.JobHistoryActionName;
import com.microsoft.windowsazure.scheduler.models.JobHistoryStatus;
import com.microsoft.windowsazure.scheduler.models.JobRecurrenceFrequency;
import com.microsoft.windowsazure.scheduler.models.JobScheduleDay;
import com.microsoft.windowsazure.scheduler.models.JobServiceBusAuthenticationType;
import com.microsoft.windowsazure.scheduler.models.JobServiceBusTransportType;
import com.microsoft.windowsazure.scheduler.models.JobState;
import com.microsoft.windowsazure.scheduler.models.RetryType;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutorService;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.http.impl.client.HttpClientBuilder;

public class SchedulerClientImpl extends ServiceClient<SchedulerClient> implements SchedulerClient {
    private String apiVersion;
    
    /**
    * Gets the API version.
    * @return The ApiVersion value.
    */
    public String getApiVersion() {
        return this.apiVersion;
    }
    
    private URI baseUri;
    
    /**
    * Gets the URI used as the base for all cloud service requests.
    * @return The BaseUri value.
    */
    public URI getBaseUri() {
        return this.baseUri;
    }
    
    private String cloudServiceName;
    
    /**
    * @return The CloudServiceName value.
    */
    public String getCloudServiceName() {
        return this.cloudServiceName;
    }
    
    /**
    * @param cloudServiceNameValue The CloudServiceName value.
    */
    public void setCloudServiceName(final String cloudServiceNameValue) {
        this.cloudServiceName = cloudServiceNameValue;
    }
    
    private SubscriptionCloudCredentials credentials;
    
    /**
    * Gets subscription credentials which uniquely identify Microsoft Azure
    * subscription. The subscription ID forms part of the URI for every
    * service call.
    * @return The Credentials value.
    */
    public SubscriptionCloudCredentials getCredentials() {
        return this.credentials;
    }
    
    private String jobCollectionName;
    
    /**
    * @return The JobCollectionName value.
    */
    public String getJobCollectionName() {
        return this.jobCollectionName;
    }
    
    /**
    * @param jobCollectionNameValue The JobCollectionName value.
    */
    public void setJobCollectionName(final String jobCollectionNameValue) {
        this.jobCollectionName = jobCollectionNameValue;
    }
    
    private int longRunningOperationInitialTimeout;
    
    /**
    * Gets or sets the initial timeout for Long Running Operations.
    * @return The LongRunningOperationInitialTimeout value.
    */
    public int getLongRunningOperationInitialTimeout() {
        return this.longRunningOperationInitialTimeout;
    }
    
    /**
    * Gets or sets the initial timeout for Long Running Operations.
    * @param longRunningOperationInitialTimeoutValue The
    * LongRunningOperationInitialTimeout value.
    */
    public void setLongRunningOperationInitialTimeout(final int longRunningOperationInitialTimeoutValue) {
        this.longRunningOperationInitialTimeout = longRunningOperationInitialTimeoutValue;
    }
    
    private int longRunningOperationRetryTimeout;
    
    /**
    * Gets or sets the retry timeout for Long Running Operations.
    * @return The LongRunningOperationRetryTimeout value.
    */
    public int getLongRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }
    
    /**
    * Gets or sets the retry timeout for Long Running Operations.
    * @param longRunningOperationRetryTimeoutValue The
    * LongRunningOperationRetryTimeout value.
    */
    public void setLongRunningOperationRetryTimeout(final int longRunningOperationRetryTimeoutValue) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeoutValue;
    }
    
    private JobOperations jobs;
    
    /**
    * @return The JobsOperations value.
    */
    public JobOperations getJobsOperations() {
        return this.jobs;
    }
    
    /**
    * Initializes a new instance of the SchedulerClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    */
    public SchedulerClientImpl(HttpClientBuilder httpBuilder, ExecutorService executorService) {
        super(httpBuilder, executorService);
        this.jobs = new JobOperationsImpl(this);
        this.apiVersion = "2013-03-01";
        this.longRunningOperationInitialTimeout = -1;
        this.longRunningOperationRetryTimeout = -1;
    }
    
    /**
    * Initializes a new instance of the SchedulerClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    * @param cloudServiceName Required.
    * @param jobCollectionName Required.
    * @param credentials Required. Gets subscription credentials which uniquely
    * identify Microsoft Azure subscription. The subscription ID forms part of
    * the URI for every service call.
    * @param baseUri Optional. Gets the URI used as the base for all cloud
    * service requests.
    */
    @Inject
    public SchedulerClientImpl(HttpClientBuilder httpBuilder, ExecutorService executorService, @Named(ManagementConfiguration.CLOUD_SERVICE_NAME) String cloudServiceName, @Named(ManagementConfiguration.JOB_COLLECTION_NAME) String jobCollectionName, @Named(ManagementConfiguration.SUBSCRIPTION_CLOUD_CREDENTIALS) SubscriptionCloudCredentials credentials, @Named(ManagementConfiguration.URI) URI baseUri) {
        this(httpBuilder, executorService);
        if (cloudServiceName == null) {
            throw new NullPointerException("cloudServiceName");
        } else {
            this.cloudServiceName = cloudServiceName;
        }
        if (jobCollectionName == null) {
            throw new NullPointerException("jobCollectionName");
        } else {
            this.jobCollectionName = jobCollectionName;
        }
        if (credentials == null) {
            throw new NullPointerException("credentials");
        } else {
            this.credentials = credentials;
        }
        if (baseUri == null) {
            try {
                this.baseUri = new URI("https://management.core.windows.net/");
            }
            catch (URISyntaxException ex) {
            }
        } else {
            this.baseUri = baseUri;
        }
    }
    
    /**
    * Initializes a new instance of the SchedulerClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    * @param cloudServiceName Required.
    * @param jobCollectionName Required.
    * @param credentials Required. Gets subscription credentials which uniquely
    * identify Microsoft Azure subscription. The subscription ID forms part of
    * the URI for every service call.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    */
    public SchedulerClientImpl(HttpClientBuilder httpBuilder, ExecutorService executorService, String cloudServiceName, String jobCollectionName, SubscriptionCloudCredentials credentials) throws URISyntaxException {
        this(httpBuilder, executorService);
        if (cloudServiceName == null) {
            throw new NullPointerException("cloudServiceName");
        }
        if (jobCollectionName == null) {
            throw new NullPointerException("jobCollectionName");
        }
        if (credentials == null) {
            throw new NullPointerException("credentials");
        }
        this.cloudServiceName = cloudServiceName;
        this.jobCollectionName = jobCollectionName;
        this.credentials = credentials;
        this.baseUri = new URI("https://management.core.windows.net/");
    }
    
    /**
    * Initializes a new instance of the SchedulerClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    * @param cloudServiceName Required.
    * @param jobCollectionName Required.
    * @param credentials Required. Gets subscription credentials which uniquely
    * identify Microsoft Azure subscription. The subscription ID forms part of
    * the URI for every service call.
    * @param baseUri Optional. Gets the URI used as the base for all cloud
    * service requests.
    * @param apiVersion Optional. Gets the API version.
    * @param longRunningOperationInitialTimeout Required. Gets or sets the
    * initial timeout for Long Running Operations.
    * @param longRunningOperationRetryTimeout Required. Gets or sets the retry
    * timeout for Long Running Operations.
    */
    public SchedulerClientImpl(HttpClientBuilder httpBuilder, ExecutorService executorService, String cloudServiceName, String jobCollectionName, SubscriptionCloudCredentials credentials, URI baseUri, String apiVersion, int longRunningOperationInitialTimeout, int longRunningOperationRetryTimeout) {
        this(httpBuilder, executorService);
        this.cloudServiceName = cloudServiceName;
        this.jobCollectionName = jobCollectionName;
        this.credentials = credentials;
        this.baseUri = baseUri;
        this.apiVersion = apiVersion;
        this.longRunningOperationInitialTimeout = longRunningOperationInitialTimeout;
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
    }
    
    /**
    * Initializes a new instance of the SchedulerClientImpl class.
    *
    * @param httpBuilder The HTTP client builder.
    * @param executorService The executor service.
    */
    protected SchedulerClientImpl newInstance(HttpClientBuilder httpBuilder, ExecutorService executorService) {
        return new SchedulerClientImpl(httpBuilder, executorService, this.getCloudServiceName(), this.getJobCollectionName(), this.getCredentials(), this.getBaseUri(), this.getApiVersion(), this.getLongRunningOperationInitialTimeout(), this.getLongRunningOperationRetryTimeout());
    }
    
    /**
    * Parse enum values for type HttpAuthenticationType.
    *
    * @param value The value to parse.
    * @return The enum value.
    */
     static HttpAuthenticationType parseHttpAuthenticationType(String value) {
        if ("NotSpecified".equalsIgnoreCase(value)) {
            return HttpAuthenticationType.NOTSPECIFIED;
        }
        if ("ClientCertificate".equalsIgnoreCase(value)) {
            return HttpAuthenticationType.CLIENTCERTIFICATE;
        }
        if ("ActiveDirectoryOAuth".equalsIgnoreCase(value)) {
            return HttpAuthenticationType.ACTIVEDIRECTORYOAUTH;
        }
        if ("Basic".equalsIgnoreCase(value)) {
            return HttpAuthenticationType.BASIC;
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Convert an enum of type HttpAuthenticationType to a string.
    *
    * @param value The value to convert to a string.
    * @return The enum value as a string.
    */
     static String httpAuthenticationTypeToString(HttpAuthenticationType value) {
        if (value == HttpAuthenticationType.NOTSPECIFIED) {
            return "NotSpecified";
        }
        if (value == HttpAuthenticationType.CLIENTCERTIFICATE) {
            return "ClientCertificate";
        }
        if (value == HttpAuthenticationType.ACTIVEDIRECTORYOAUTH) {
            return "ActiveDirectoryOAuth";
        }
        if (value == HttpAuthenticationType.BASIC) {
            return "Basic";
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Parse enum values for type JobActionType.
    *
    * @param value The value to parse.
    * @return The enum value.
    */
     static JobActionType parseJobActionType(String value) {
        if ("http".equalsIgnoreCase(value)) {
            return JobActionType.HTTP;
        }
        if ("https".equalsIgnoreCase(value)) {
            return JobActionType.HTTPS;
        }
        if ("storageQueue".equalsIgnoreCase(value)) {
            return JobActionType.STORAGEQUEUE;
        }
        if ("serviceBusQueue".equalsIgnoreCase(value)) {
            return JobActionType.SERVICEBUSQUEUE;
        }
        if ("serviceBusTopic".equalsIgnoreCase(value)) {
            return JobActionType.SERVICEBUSTOPIC;
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Convert an enum of type JobActionType to a string.
    *
    * @param value The value to convert to a string.
    * @return The enum value as a string.
    */
     static String jobActionTypeToString(JobActionType value) {
        if (value == JobActionType.HTTP) {
            return "http";
        }
        if (value == JobActionType.HTTPS) {
            return "https";
        }
        if (value == JobActionType.STORAGEQUEUE) {
            return "storageQueue";
        }
        if (value == JobActionType.SERVICEBUSQUEUE) {
            return "serviceBusQueue";
        }
        if (value == JobActionType.SERVICEBUSTOPIC) {
            return "serviceBusTopic";
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Parse enum values for type JobHistoryActionName.
    *
    * @param value The value to parse.
    * @return The enum value.
    */
     static JobHistoryActionName parseJobHistoryActionName(String value) {
        if ("MainAction".equalsIgnoreCase(value)) {
            return JobHistoryActionName.MAINACTION;
        }
        if ("ErrorAction".equalsIgnoreCase(value)) {
            return JobHistoryActionName.ERRORACTION;
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Convert an enum of type JobHistoryActionName to a string.
    *
    * @param value The value to convert to a string.
    * @return The enum value as a string.
    */
     static String jobHistoryActionNameToString(JobHistoryActionName value) {
        if (value == JobHistoryActionName.MAINACTION) {
            return "MainAction";
        }
        if (value == JobHistoryActionName.ERRORACTION) {
            return "ErrorAction";
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Parse enum values for type JobHistoryStatus.
    *
    * @param value The value to parse.
    * @return The enum value.
    */
     static JobHistoryStatus parseJobHistoryStatus(String value) {
        if ("completed".equalsIgnoreCase(value)) {
            return JobHistoryStatus.COMPLETED;
        }
        if ("failed".equalsIgnoreCase(value)) {
            return JobHistoryStatus.FAILED;
        }
        if ("postponed".equalsIgnoreCase(value)) {
            return JobHistoryStatus.POSTPONED;
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Convert an enum of type JobHistoryStatus to a string.
    *
    * @param value The value to convert to a string.
    * @return The enum value as a string.
    */
     static String jobHistoryStatusToString(JobHistoryStatus value) {
        if (value == JobHistoryStatus.COMPLETED) {
            return "completed";
        }
        if (value == JobHistoryStatus.FAILED) {
            return "failed";
        }
        if (value == JobHistoryStatus.POSTPONED) {
            return "postponed";
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Parse enum values for type JobRecurrenceFrequency.
    *
    * @param value The value to parse.
    * @return The enum value.
    */
     static JobRecurrenceFrequency parseJobRecurrenceFrequency(String value) {
        if ("minute".equalsIgnoreCase(value)) {
            return JobRecurrenceFrequency.MINUTE;
        }
        if ("hour".equalsIgnoreCase(value)) {
            return JobRecurrenceFrequency.HOUR;
        }
        if ("day".equalsIgnoreCase(value)) {
            return JobRecurrenceFrequency.DAY;
        }
        if ("week".equalsIgnoreCase(value)) {
            return JobRecurrenceFrequency.WEEK;
        }
        if ("month".equalsIgnoreCase(value)) {
            return JobRecurrenceFrequency.MONTH;
        }
        if ("year".equalsIgnoreCase(value)) {
            return JobRecurrenceFrequency.YEAR;
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Convert an enum of type JobRecurrenceFrequency to a string.
    *
    * @param value The value to convert to a string.
    * @return The enum value as a string.
    */
     static String jobRecurrenceFrequencyToString(JobRecurrenceFrequency value) {
        if (value == JobRecurrenceFrequency.MINUTE) {
            return "minute";
        }
        if (value == JobRecurrenceFrequency.HOUR) {
            return "hour";
        }
        if (value == JobRecurrenceFrequency.DAY) {
            return "day";
        }
        if (value == JobRecurrenceFrequency.WEEK) {
            return "week";
        }
        if (value == JobRecurrenceFrequency.MONTH) {
            return "month";
        }
        if (value == JobRecurrenceFrequency.YEAR) {
            return "year";
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Parse enum values for type JobScheduleDay.
    *
    * @param value The value to parse.
    * @return The enum value.
    */
     static JobScheduleDay parseJobScheduleDay(String value) {
        if ("monday".equalsIgnoreCase(value)) {
            return JobScheduleDay.MONDAY;
        }
        if ("tuesday".equalsIgnoreCase(value)) {
            return JobScheduleDay.TUESDAY;
        }
        if ("wednesday".equalsIgnoreCase(value)) {
            return JobScheduleDay.WEDNESDAY;
        }
        if ("thursday".equalsIgnoreCase(value)) {
            return JobScheduleDay.THURSDAY;
        }
        if ("friday".equalsIgnoreCase(value)) {
            return JobScheduleDay.FRIDAY;
        }
        if ("saturday".equalsIgnoreCase(value)) {
            return JobScheduleDay.SATURDAY;
        }
        if ("sunday".equalsIgnoreCase(value)) {
            return JobScheduleDay.SUNDAY;
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Convert an enum of type JobScheduleDay to a string.
    *
    * @param value The value to convert to a string.
    * @return The enum value as a string.
    */
     static String jobScheduleDayToString(JobScheduleDay value) {
        if (value == JobScheduleDay.MONDAY) {
            return "monday";
        }
        if (value == JobScheduleDay.TUESDAY) {
            return "tuesday";
        }
        if (value == JobScheduleDay.WEDNESDAY) {
            return "wednesday";
        }
        if (value == JobScheduleDay.THURSDAY) {
            return "thursday";
        }
        if (value == JobScheduleDay.FRIDAY) {
            return "friday";
        }
        if (value == JobScheduleDay.SATURDAY) {
            return "saturday";
        }
        if (value == JobScheduleDay.SUNDAY) {
            return "sunday";
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Parse enum values for type JobServiceBusAuthenticationType.
    *
    * @param value The value to parse.
    * @return The enum value.
    */
     static JobServiceBusAuthenticationType parseJobServiceBusAuthenticationType(String value) {
        if ("NotSpecified".equalsIgnoreCase(value)) {
            return JobServiceBusAuthenticationType.NOTSPECIFIED;
        }
        if ("SharedAccessKey".equalsIgnoreCase(value)) {
            return JobServiceBusAuthenticationType.SHAREDACCESSKEY;
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Convert an enum of type JobServiceBusAuthenticationType to a string.
    *
    * @param value The value to convert to a string.
    * @return The enum value as a string.
    */
     static String jobServiceBusAuthenticationTypeToString(JobServiceBusAuthenticationType value) {
        if (value == JobServiceBusAuthenticationType.NOTSPECIFIED) {
            return "NotSpecified";
        }
        if (value == JobServiceBusAuthenticationType.SHAREDACCESSKEY) {
            return "SharedAccessKey";
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Parse enum values for type JobServiceBusTransportType.
    *
    * @param value The value to parse.
    * @return The enum value.
    */
     static JobServiceBusTransportType parseJobServiceBusTransportType(String value) {
        if ("NotSpecified".equalsIgnoreCase(value)) {
            return JobServiceBusTransportType.NOTSPECIFIED;
        }
        if ("NetMessaging".equalsIgnoreCase(value)) {
            return JobServiceBusTransportType.NETMESSAGING;
        }
        if ("AMQP".equalsIgnoreCase(value)) {
            return JobServiceBusTransportType.AMQP;
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Convert an enum of type JobServiceBusTransportType to a string.
    *
    * @param value The value to convert to a string.
    * @return The enum value as a string.
    */
     static String jobServiceBusTransportTypeToString(JobServiceBusTransportType value) {
        if (value == JobServiceBusTransportType.NOTSPECIFIED) {
            return "NotSpecified";
        }
        if (value == JobServiceBusTransportType.NETMESSAGING) {
            return "NetMessaging";
        }
        if (value == JobServiceBusTransportType.AMQP) {
            return "AMQP";
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Parse enum values for type JobState.
    *
    * @param value The value to parse.
    * @return The enum value.
    */
     static JobState parseJobState(String value) {
        if ("enabled".equalsIgnoreCase(value)) {
            return JobState.ENABLED;
        }
        if ("disabled".equalsIgnoreCase(value)) {
            return JobState.DISABLED;
        }
        if ("faulted".equalsIgnoreCase(value)) {
            return JobState.FAULTED;
        }
        if ("completed".equalsIgnoreCase(value)) {
            return JobState.COMPLETED;
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Convert an enum of type JobState to a string.
    *
    * @param value The value to convert to a string.
    * @return The enum value as a string.
    */
     static String jobStateToString(JobState value) {
        if (value == JobState.ENABLED) {
            return "enabled";
        }
        if (value == JobState.DISABLED) {
            return "disabled";
        }
        if (value == JobState.FAULTED) {
            return "faulted";
        }
        if (value == JobState.COMPLETED) {
            return "completed";
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Parse enum values for type RetryType.
    *
    * @param value The value to parse.
    * @return The enum value.
    */
     static RetryType parseRetryType(String value) {
        if ("none".equalsIgnoreCase(value)) {
            return RetryType.NONE;
        }
        if ("fixed".equalsIgnoreCase(value)) {
            return RetryType.FIXED;
        }
        throw new IllegalArgumentException("value");
    }
    
    /**
    * Convert an enum of type RetryType to a string.
    *
    * @param value The value to convert to a string.
    * @return The enum value as a string.
    */
     static String retryTypeToString(RetryType value) {
        if (value == RetryType.NONE) {
            return "none";
        }
        if (value == RetryType.FIXED) {
            return "fixed";
        }
        throw new IllegalArgumentException("value");
    }
}
