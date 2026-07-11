package com.caoccao.javet.exceptions;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class JavetException extends Exception {
    protected JavetError error;
    protected Map<String, Object> parameters;

    public JavetException(JavetError javetError) {
        this(javetError, null, null);
    }

    public JavetException(JavetError javetError, Map<String, Object> map) {
        this(javetError, map, null);
    }

    public JavetError getError() {
        return this.error;
    }

    public Map<String, Object> getParameters() {
        return this.parameters;
    }

    public JavetException(JavetError javetError, Throwable th) {
        this(javetError, null, th);
    }

    public JavetException(JavetError javetError, Map<String, Object> map, Throwable th) {
        super(javetError.getMessage(map), th);
        this.error = javetError;
        this.parameters = map;
    }
}
