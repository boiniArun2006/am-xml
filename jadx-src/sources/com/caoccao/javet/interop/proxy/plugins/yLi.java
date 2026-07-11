package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final /* synthetic */ class yLi implements IJavetDirectCallable.ThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f52036n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List f52037t;

    public /* synthetic */ yLi(V8Runtime v8Runtime, List list) {
        this.f52036n = v8Runtime;
        this.f52037t = list;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.ThisAndResult
    public final V8Value call(V8Value v8Value, V8Value[] v8ValueArr) {
        return JavetProxyPluginList.Z(this.f52036n, this.f52037t, v8Value, v8ValueArr);
    }
}
