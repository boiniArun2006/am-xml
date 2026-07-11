package com.caoccao.javet.interception;

import com.caoccao.javet.exceptions.JavetException;
import com.caoccao.javet.interfaces.IJavetInterceptor;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.values.reference.IV8ValueObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class BaseJavetInterceptor implements IJavetInterceptor {
    protected V8Runtime v8Runtime;

    @Override // com.caoccao.javet.interfaces.IJavetInterceptor
    public abstract boolean register(IV8ValueObject... iV8ValueObjectArr) throws JavetException;

    @Override // com.caoccao.javet.interfaces.IJavetInterceptor
    public abstract boolean unregister(IV8ValueObject... iV8ValueObjectArr) throws JavetException;

    public V8Runtime getV8Runtime() {
        return this.v8Runtime;
    }

    public BaseJavetInterceptor(V8Runtime v8Runtime) {
        this.v8Runtime = v8Runtime;
    }
}
