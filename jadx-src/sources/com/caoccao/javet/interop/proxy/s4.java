package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final /* synthetic */ class s4 implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ JavetDirectProxyFunctionHandler f52055n;

    public /* synthetic */ s4(JavetDirectProxyFunctionHandler javetDirectProxyFunctionHandler) {
        this.f52055n = javetDirectProxyFunctionHandler;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return JavetDirectProxyFunctionHandler.qie(this.f52055n, v8ValueArr);
    }
}
