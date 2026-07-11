package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.interop.callback.JavetCallbackContext;
import java.lang.Exception;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class BaseJavetProxyHandler<T, E extends Exception> implements IJavetProxyHandler<T, E>, IJavetDirectCallable {
    protected JavetCallbackContext[] callbackContexts = null;
    protected T targetObject;
    protected V8Runtime v8Runtime;

    @Override // com.caoccao.javet.interop.proxy.IJavetProxyHandler
    public T getTargetObject() {
        return this.targetObject;
    }

    @Override // com.caoccao.javet.interop.proxy.IJavetProxyHandler
    public V8Runtime getV8Runtime() {
        return this.v8Runtime;
    }

    public BaseJavetProxyHandler(V8Runtime v8Runtime, T t3) {
        Objects.requireNonNull(t3);
        this.targetObject = t3;
        Objects.requireNonNull(v8Runtime);
        this.v8Runtime = v8Runtime;
    }
}
