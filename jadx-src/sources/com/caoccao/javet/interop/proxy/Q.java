package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final /* synthetic */ class Q implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ JavetDirectProxyFunctionHandler f51640n;

    public /* synthetic */ Q(JavetDirectProxyFunctionHandler javetDirectProxyFunctionHandler) {
        this.f51640n = javetDirectProxyFunctionHandler;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return JavetDirectProxyFunctionHandler.xMQ(this.f51640n, v8ValueArr);
    }
}
