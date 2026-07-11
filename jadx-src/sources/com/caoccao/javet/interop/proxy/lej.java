package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final /* synthetic */ class lej implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ JavetReflectionProxyClassHandler f51661n;

    public /* synthetic */ lej(JavetReflectionProxyClassHandler javetReflectionProxyClassHandler) {
        this.f51661n = javetReflectionProxyClassHandler;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return JavetReflectionProxyClassHandler.KN(this.f51661n, v8ValueArr);
    }
}
