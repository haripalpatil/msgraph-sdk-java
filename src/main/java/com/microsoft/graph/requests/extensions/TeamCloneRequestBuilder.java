// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import java.util.EnumSet;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.generated.ClonableTeamParts;
import com.microsoft.graph.models.generated.TeamVisibilityType;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseTeamCloneRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Team Clone Request Builder.
 */
public class TeamCloneRequestBuilder extends BaseTeamCloneRequestBuilder implements ITeamCloneRequestBuilder {

    /**
     * The request builder for this TeamClone
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param displayName the displayName
     * @param description the description
     * @param mailNickname the mailNickname
     * @param classification the classification
     * @param visibility the visibility
     * @param partsToClone the partsToClone
     */
    public TeamCloneRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String displayName, final String description, final String mailNickname, final String classification, final TeamVisibilityType visibility, final EnumSet<ClonableTeamParts> partsToClone) {
        super(requestUrl, client, requestOptions, displayName, description, mailNickname, classification, visibility, partsToClone);
    }
}
