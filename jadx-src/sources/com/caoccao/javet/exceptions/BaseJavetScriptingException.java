package com.caoccao.javet.exceptions;

import com.caoccao.javet.utils.SimpleMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class BaseJavetScriptingException extends JavetException {
    protected JavetScriptingError scriptingError;

    protected BaseJavetScriptingException(JavetError javetError, JavetScriptingError javetScriptingError, Throwable th) {
        super(javetError, SimpleMap.of("message", javetScriptingError.getDetailedMessage(), JavetError.PARAMETER_RESOURCE_NAME, javetScriptingError.getResourceName(), JavetError.PARAMETER_SOURCE_LINE, javetScriptingError.getSourceLine(), JavetError.PARAMETER_LINE_NUMBER, Integer.valueOf(javetScriptingError.getLineNumber()), JavetError.PARAMETER_START_COLUMN, Integer.valueOf(javetScriptingError.getStartColumn()), JavetError.PARAMETER_END_COLUMN, Integer.valueOf(javetScriptingError.getEndColumn()), JavetError.PARAMETER_START_POSITION, Integer.valueOf(javetScriptingError.getStartPosition()), JavetError.PARAMETER_END_POSITION, Integer.valueOf(javetScriptingError.getEndPosition())), th);
        this.scriptingError = javetScriptingError;
    }

    public JavetScriptingError getScriptingError() {
        return this.scriptingError;
    }
}
