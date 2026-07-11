package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final /* synthetic */ class Md implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ JavetReflectionProxyFunctionHandler f51635n;

    public /* synthetic */ Md(JavetReflectionProxyFunctionHandler javetReflectionProxyFunctionHandler) {
        this.f51635n = javetReflectionProxyFunctionHandler;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return JavetReflectionProxyFunctionHandler.Ik(this.f51635n, v8ValueArr);
    }
}
