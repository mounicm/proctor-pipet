package com.indeed.proctor.service.var;

import com.indeed.proctor.service.JsonVarConfig;
import com.indeed.proctor.service.Source;

/**
 * Abstract class representing a context variable or identifier, which is passed with ctx. or id. prefixes in
 * query parameters.
 */
public abstract class PrefixVariable {
    private final String varName;
    private final String prefix;
    private final Source source;
    private final String sourceKey;
    private final ExtractUtil.ValueExtractor extractor;

    public PrefixVariable(final String varName, final JsonVarConfig varConfig, final String prefix) {
        this.varName = varName;
        this.prefix = prefix;
        source = varConfig.getSource();
        // If the config didn't specify a source key, use the var name. This saves typing in the config file.
        sourceKey = (varConfig.getSourceKey() != null ? varConfig.getSourceKey() : varName);
        extractor = ExtractUtil.createValueExtractor(source, sourceKey, prefix);
    }

    public String getVarName() {
        return varName;
    }

    public String getPrefix() {
        return prefix;
    }

    public Source getSource() {
        return source;
    }

    public String getSourceKey() {
        return sourceKey;
    }

    public ExtractUtil.ValueExtractor getExtractor() {
        return extractor;
    }
}