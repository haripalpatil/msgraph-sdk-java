// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Range Request Builder.
 */
public interface IBaseWorkbookRangeRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     */
    IWorkbookRangeRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     */
    IWorkbookRangeRequest buildRequest(final java.util.List<Option> requestOptions);

    /**
     * Gets the request builder for WorkbookRangeFormat.
     */
    IWorkbookRangeFormatRequestBuilder getFormat();

    /**
     * Gets the request builder for WorkbookRangeSort.
     */
    IWorkbookRangeSortRequestBuilder getSort();

    /**
     * Gets the request builder for WorkbookWorksheet.
     */
    IWorkbookWorksheetRequestBuilder getWorksheet();
    IWorkbookRangeClearRequestBuilder getClear(final String applyTo);
    IWorkbookRangeDeleteRequestBuilder getDelete(final String shift);
    IWorkbookRangeInsertRequestBuilder getInsert(final String shift);
    IWorkbookRangeMergeRequestBuilder getMerge(final Boolean across);
    IWorkbookRangeUnmergeRequestBuilder getUnmerge();
    IWorkbookRangeBoundingRectRequestBuilder getBoundingRect(final String anotherRange);
    IWorkbookRangeCellRequestBuilder getCell(final Integer row, final Integer column);
    IWorkbookRangeColumnRequestBuilder getColumn(final Integer column);
    IWorkbookRangeColumnsAfterRequestBuilder getColumnsAfter();
    IWorkbookRangeColumnsAfterRequestBuilder getColumnsAfter(final Integer count);
    IWorkbookRangeColumnsBeforeRequestBuilder getColumnsBefore();
    IWorkbookRangeColumnsBeforeRequestBuilder getColumnsBefore(final Integer count);
    IWorkbookRangeEntireColumnRequestBuilder getEntireColumn();
    IWorkbookRangeEntireRowRequestBuilder getEntireRow();
    IWorkbookRangeIntersectionRequestBuilder getIntersection(final String anotherRange);
    IWorkbookRangeLastCellRequestBuilder getLastCell();
    IWorkbookRangeLastColumnRequestBuilder getLastColumn();
    IWorkbookRangeLastRowRequestBuilder getLastRow();
    IWorkbookRangeOffsetRangeRequestBuilder getOffsetRange(final Integer rowOffset, final Integer columnOffset);
    IWorkbookRangeResizedRangeRequestBuilder getResizedRange(final Integer deltaRows, final Integer deltaColumns);
    IWorkbookRangeRowRequestBuilder getRow(final Integer row);
    IWorkbookRangeRowsAboveRequestBuilder getRowsAbove();
    IWorkbookRangeRowsAboveRequestBuilder getRowsAbove(final Integer count);
    IWorkbookRangeRowsBelowRequestBuilder getRowsBelow();
    IWorkbookRangeRowsBelowRequestBuilder getRowsBelow(final Integer count);
    IWorkbookRangeUsedRangeRequestBuilder getUsedRange();
    IWorkbookRangeUsedRangeRequestBuilder getUsedRange(final Boolean valuesOnly);
    IWorkbookRangeVisibleViewRequestBuilder getVisibleView();

}