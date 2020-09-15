// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsAccrIntMRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Accr Int MRequest Builder.
 */
public interface IWorkbookFunctionsAccrIntMRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsAccrIntMRequest
     *
     * @return the IWorkbookFunctionsAccrIntMRequest instance
     */
    IWorkbookFunctionsAccrIntMRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsAccrIntMRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsAccrIntMRequest instance
     */
    IWorkbookFunctionsAccrIntMRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
