// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointActivityPagesRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get Share Point Activity Pages Request Builder.
 */
public interface IReportRootGetSharePointActivityPagesRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetSharePointActivityPagesRequest
     *
     * @return the IReportRootGetSharePointActivityPagesRequest instance
     */
    IReportRootGetSharePointActivityPagesRequest buildRequest();

    /**
     * Creates the IReportRootGetSharePointActivityPagesRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSharePointActivityPagesRequest instance
     */
    IReportRootGetSharePointActivityPagesRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
