package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final /* synthetic */ class o7q implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f51955n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f51956t;

    public /* synthetic */ o7q(V8Runtime v8Runtime, Object obj) {
        this.f51955n = v8Runtime;
        this.f51956t = obj;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return JavetProxyPluginArray.ty(this.f51955n, this.f51956t, v8ValueArr);
    }
}
