package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;

/* JADX INFO: renamed from: com.caoccao.javet.interop.proxy.plugins.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final /* synthetic */ class C1852t implements IJavetDirectCallable.ThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f51993n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f51994t;

    public /* synthetic */ C1852t(V8Runtime v8Runtime, Object obj) {
        this.f51993n = v8Runtime;
        this.f51994t = obj;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.ThisAndResult
    public final V8Value call(V8Value v8Value, V8Value[] v8ValueArr) {
        return JavetProxyPluginArray.g(this.f51993n, this.f51994t, v8Value, v8ValueArr);
    }
}
