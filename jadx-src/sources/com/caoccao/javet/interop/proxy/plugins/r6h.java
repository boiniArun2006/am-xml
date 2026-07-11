package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final /* synthetic */ class r6h implements IJavetDirectCallable.ThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f51982n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Map f51983t;

    public /* synthetic */ r6h(V8Runtime v8Runtime, Map map) {
        this.f51982n = v8Runtime;
        this.f51983t = map;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.ThisAndResult
    public final V8Value call(V8Value v8Value, V8Value[] v8ValueArr) {
        return JavetProxyPluginMap.xMQ(this.f51982n, this.f51983t, v8Value, v8ValueArr);
    }
}
