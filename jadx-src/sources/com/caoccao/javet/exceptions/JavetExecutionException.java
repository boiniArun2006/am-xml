package com.caoccao.javet.exceptions;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class JavetExecutionException extends BaseJavetScriptingException {
    /* JADX WARN: Illegal instructions before constructor call */
    public JavetExecutionException(JavetScriptingError javetScriptingError, Throwable th) {
        JavetError javetError = JavetError.ExecutionFailure;
        Objects.requireNonNull(javetScriptingError);
        super(javetError, javetScriptingError, th);
    }
}
