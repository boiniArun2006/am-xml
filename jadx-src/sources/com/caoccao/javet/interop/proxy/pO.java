package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final /* synthetic */ class pO implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ JavetReflectionProxyObjectHandler f51667n;

    public /* synthetic */ pO(JavetReflectionProxyObjectHandler javetReflectionProxyObjectHandler) {
        this.f51667n = javetReflectionProxyObjectHandler;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return JavetReflectionProxyObjectHandler.ty(this.f51667n, v8ValueArr);
    }
}
