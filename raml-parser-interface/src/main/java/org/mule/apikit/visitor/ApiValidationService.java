/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.apikit.visitor;

import org.mule.apikit.validation.ApiValidationResult;

import java.util.List;

public interface ApiValidationService {

  ApiValidationService validate(String resource);

  ApiValidationService validate(String resourceContent, String resource);

  List<ApiValidationResult> getErrors();

  List<ApiValidationResult> getWarnings();
}
