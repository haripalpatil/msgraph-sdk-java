// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams Template Collection Request.
 */
public class TeamsTemplateCollectionRequest extends BaseCollectionRequest<TeamsTemplateCollectionResponse, ITeamsTemplateCollectionPage> implements ITeamsTemplateCollectionRequest {

    /**
     * The request builder for this collection of TeamsTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsTemplateCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsTemplateCollectionResponse.class, ITeamsTemplateCollectionPage.class);
    }

    public void get(final ICallback<ITeamsTemplateCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ITeamsTemplateCollectionPage get() throws ClientException {
        final TeamsTemplateCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final TeamsTemplate newTeamsTemplate, final ICallback<TeamsTemplate> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new TeamsTemplateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newTeamsTemplate, callback);
    }

    public TeamsTemplate post(final TeamsTemplate newTeamsTemplate) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TeamsTemplateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newTeamsTemplate);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITeamsTemplateCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (TeamsTemplateCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITeamsTemplateCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (TeamsTemplateCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ITeamsTemplateCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (TeamsTemplateCollectionRequest)this;
    }

    public ITeamsTemplateCollectionPage buildFromResponse(final TeamsTemplateCollectionResponse response) {
        final ITeamsTemplateCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TeamsTemplateCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final TeamsTemplateCollectionPage page = new TeamsTemplateCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}