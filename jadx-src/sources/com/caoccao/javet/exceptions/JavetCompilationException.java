package com.caoccao.javet.exceptions;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class JavetCompilationException extends BaseJavetScriptingException {
    /* JADX WARN: Illegal instructions before constructor call */
    public JavetCompilationException(JavetScriptingError javetScriptingError, Throwable th) {
        JavetError javetError = JavetError.CompilationFailure;
        Objects.requireNonNull(javetScriptingError);
        super(javetError, javetScriptingError, th);
    }
}
