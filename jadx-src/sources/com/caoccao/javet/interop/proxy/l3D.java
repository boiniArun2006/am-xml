package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final /* synthetic */ class l3D implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ JavetDirectProxyFunctionHandler f51659n;

    public /* synthetic */ l3D(JavetDirectProxyFunctionHandler javetDirectProxyFunctionHandler) {
        this.f51659n = javetDirectProxyFunctionHandler;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return JavetDirectProxyFunctionHandler.mUb(this.f51659n, v8ValueArr);
    }
}
