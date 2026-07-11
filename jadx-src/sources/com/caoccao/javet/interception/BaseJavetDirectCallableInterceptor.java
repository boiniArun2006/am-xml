package com.caoccao.javet.interception;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class BaseJavetDirectCallableInterceptor extends BaseJavetInterceptor implements IJavetDirectCallable {
    public BaseJavetDirectCallableInterceptor(V8Runtime v8Runtime) {
        super(v8Runtime);
    }
}
