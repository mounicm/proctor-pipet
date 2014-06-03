package com.indeed.proctor.service;

import java.util.Map;

/**
 * JSON configuration file that describes the extraction of context variables and identifiers and also the
 * conversion type of context variables.
 */
public class JsonServiceConfig {
    private Map<String, JsonContextVarConfig> context;
    private Map<String, JsonVarConfig> identifiers;

    public Map<String, JsonContextVarConfig> getContext() {
        return context;
    }

    public void setContext(Map<String, JsonContextVarConfig> context) {
        this.context = context;
    }

    public Map<String, JsonVarConfig> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(Map<String, JsonVarConfig> identifiers) {
        this.identifiers = identifiers;
    }
}