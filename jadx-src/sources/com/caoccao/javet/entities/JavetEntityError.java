package com.caoccao.javet.entities;

import com.caoccao.javet.enums.V8ValueErrorType;
import com.caoccao.javet.interfaces.IJavetEntityError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class JavetEntityError implements IJavetEntityError {
    protected final Map<String, Object> context = new HashMap();
    protected String detailedMessage;
    protected String message;
    protected String stack;
    protected V8ValueErrorType type;

    @Override // com.caoccao.javet.interfaces.IJavetEntityError
    public Map<String, Object> getContext() {
        return this.context;
    }

    @Override // com.caoccao.javet.interfaces.IJavetEntityError
    public String getDetailedMessage() {
        return this.detailedMessage;
    }

    @Override // com.caoccao.javet.interfaces.IJavetEntityError
    public String getMessage() {
        return this.message;
    }

    @Override // com.caoccao.javet.interfaces.IJavetEntityError
    public String getStack() {
        return this.stack;
    }

    @Override // com.caoccao.javet.interfaces.IJavetEntityError
    public V8ValueErrorType getType() {
        return this.type;
    }

    @Override // com.caoccao.javet.interfaces.IJavetEntityError
    public void setDetailedMessage(String str) {
        this.detailedMessage = str;
    }

    @Override // com.caoccao.javet.interfaces.IJavetEntityError
    public void setMessage(String str) {
        this.message = str;
    }

    @Override // com.caoccao.javet.interfaces.IJavetEntityError
    public void setStack(String str) {
        this.stack = str;
    }

    @Override // com.caoccao.javet.interfaces.IJavetEntityError
    public void setType(V8ValueErrorType v8ValueErrorType) {
        this.type = v8ValueErrorType;
    }

    public JavetEntityError(V8ValueErrorType v8ValueErrorType, String str, String str2, String str3) {
        this.detailedMessage = str2;
        this.message = str;
        this.stack = str3;
        this.type = v8ValueErrorType;
    }
}
