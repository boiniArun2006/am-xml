package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final /* synthetic */ class hQ implements IJavetDirectCallable.ThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f51908n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f51909t;

    public /* synthetic */ hQ(V8Runtime v8Runtime, Object obj) {
        this.f51908n = v8Runtime;
        this.f51909t = obj;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.ThisAndResult
    public final V8Value call(V8Value v8Value, V8Value[] v8ValueArr) {
        return JavetProxyPluginArray.r(this.f51908n, this.f51909t, v8Value, v8ValueArr);
    }
}
