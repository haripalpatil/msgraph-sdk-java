// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookTableItemAtRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Table Item At Request Builder.
 */
public interface IWorkbookTableItemAtRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookTableItemAtRequest
     *
     * @return the IWorkbookTableItemAtRequest instance
     */
    IWorkbookTableItemAtRequest buildRequest();

    /**
     * Creates the IWorkbookTableItemAtRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableItemAtRequest instance
     */
    IWorkbookTableItemAtRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IWorkbookTableColumnCollectionRequestBuilder columns();

    IWorkbookTableColumnRequestBuilder columns(final String id);

    IWorkbookTableRowCollectionRequestBuilder rows();

    IWorkbookTableRowRequestBuilder rows(final String id);

    /**
     * Gets the request builder for WorkbookTableSort
     *
     * @return the IWorkbookTableSortRequestBuilder instance
     */
    IWorkbookTableSortRequestBuilder sort();

    /**
     * Gets the request builder for WorkbookWorksheet
     *
     * @return the IWorkbookWorksheetRequestBuilder instance
     */
    IWorkbookWorksheetRequestBuilder worksheet();
}
