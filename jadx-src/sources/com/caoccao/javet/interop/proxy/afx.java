package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final /* synthetic */ class afx implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ JavetDirectProxyObjectHandler f51649n;

    public /* synthetic */ afx(JavetDirectProxyObjectHandler javetDirectProxyObjectHandler) {
        this.f51649n = javetDirectProxyObjectHandler;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return JavetDirectProxyObjectHandler.J2(this.f51649n, v8ValueArr);
    }
}
