package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final /* synthetic */ class l3h implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f51932n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List f51933t;

    public /* synthetic */ l3h(V8Runtime v8Runtime, List list) {
        this.f51932n = v8Runtime;
        this.f51933t = list;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return JavetProxyPluginList.e(this.f51932n, this.f51933t, v8ValueArr);
    }
}
