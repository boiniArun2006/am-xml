package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;

/* JADX INFO: renamed from: com.caoccao.javet.interop.proxy.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final /* synthetic */ class C1828m implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ JavetReflectionProxyFunctionHandler f51662n;

    public /* synthetic */ C1828m(JavetReflectionProxyFunctionHandler javetReflectionProxyFunctionHandler) {
        this.f51662n = javetReflectionProxyFunctionHandler;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return JavetReflectionProxyFunctionHandler.ck(this.f51662n, v8ValueArr);
    }
}
