package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.proxy.IJavetDirectProxyHandler;
import java.lang.Exception;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class BaseJavetDirectProxyHandler<T extends IJavetDirectProxyHandler<E>, E extends Exception> extends BaseJavetProxyHandler<T, E> {
    public BaseJavetDirectProxyHandler(V8Runtime v8Runtime, T t3) {
        super(v8Runtime, t3);
        t3.setV8Runtime(v8Runtime);
    }
}
