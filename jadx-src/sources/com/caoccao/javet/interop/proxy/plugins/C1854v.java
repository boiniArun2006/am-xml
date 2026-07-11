package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: com.caoccao.javet.interop.proxy.plugins.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final /* synthetic */ class C1854v implements IJavetDirectCallable.ThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f52010n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List f52011t;

    public /* synthetic */ C1854v(V8Runtime v8Runtime, List list) {
        this.f52010n = v8Runtime;
        this.f52011t = list;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.ThisAndResult
    public final V8Value call(V8Value v8Value, V8Value[] v8ValueArr) {
        return JavetProxyPluginList.U(this.f52010n, this.f52011t, v8Value, v8ValueArr);
    }
}
