package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final /* synthetic */ class dip implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f51878n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List f51879t;

    public /* synthetic */ dip(V8Runtime v8Runtime, List list) {
        this.f51878n = v8Runtime;
        this.f51879t = list;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return JavetProxyPluginList.T(this.f51878n, this.f51879t, v8ValueArr);
    }
}
