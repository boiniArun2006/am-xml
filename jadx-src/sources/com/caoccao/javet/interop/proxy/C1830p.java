package com.caoccao.javet.interop.proxy;

import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;

/* JADX INFO: renamed from: com.caoccao.javet.interop.proxy.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final /* synthetic */ class C1830p implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ JavetReflectionProxyObjectHandler f51666n;

    public /* synthetic */ C1830p(JavetReflectionProxyObjectHandler javetReflectionProxyObjectHandler) {
        this.f51666n = javetReflectionProxyObjectHandler;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return JavetReflectionProxyObjectHandler.qie(this.f51666n, v8ValueArr);
    }
}
