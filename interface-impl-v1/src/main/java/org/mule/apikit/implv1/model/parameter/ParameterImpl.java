/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.apikit.implv1.model.parameter;

import static org.mule.apikit.implv1.MetadataResolver.resolve;
import static org.mule.apikit.implv1.MetadataResolver.stringType;

import org.mule.apikit.model.parameter.Parameter;
import org.mule.metadata.api.model.MetadataType;

import java.util.HashMap;
import java.util.Map;

import org.raml.model.parameter.AbstractParam;

public class ParameterImpl implements Parameter {

  AbstractParam parameter;

  public ParameterImpl(AbstractParam parameter) {
    this.parameter = parameter;
  }

  public boolean isRequired() {
    return parameter.isRequired();
  }

  public String getDefaultValue() {
    return parameter.getDefaultValue();
  }

  public boolean isRepeat() {
    return parameter.isRepeat();
  }

  public boolean isArray() {
    // only available in RAML 1.0+
    return false;
  }

  public boolean validate(String s) {
    return parameter.validate(s);
  }

  public String message(String s) {
    return parameter.message(s);
  }

  public String getDisplayName() {
    return parameter.getDisplayName();
  }

  public String getDescription() {
    return parameter.getDescription();
  }

  public String getExample() {
    return parameter.getExample();
  }

  @Override
  public Map<String, String> getExamples() {
    return new HashMap<>();
  }

  public Object getInstance() {
    return parameter;
  }

  @Override
  public MetadataType getMetadata() {
    return resolve(parameter).orElse(stringType());
  }

  @Override
  public boolean isScalar() {
    return true;
  }

  @Override
  public boolean isFacetArray(String facet) {
    return false;
  }

  @Override
  public String surroundWithQuotesIfNeeded(String value) {
    return value;
  }

}
