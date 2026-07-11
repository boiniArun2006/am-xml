package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final /* synthetic */ class ZI implements IJavetDirectCallable.ThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List f51842n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f51843t;

    public /* synthetic */ ZI(List list, V8Runtime v8Runtime) {
        this.f51842n = list;
        this.f51843t = v8Runtime;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.ThisAndResult
    public final V8Value call(V8Value v8Value, V8Value[] v8ValueArr) {
        return JavetProxyPluginList.fD(this.f51842n, this.f51843t, v8Value, v8ValueArr);
    }
}
