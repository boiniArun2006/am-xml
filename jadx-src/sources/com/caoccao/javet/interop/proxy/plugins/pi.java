package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final /* synthetic */ class pi implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List f51966n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f51967t;

    public /* synthetic */ pi(List list, V8Runtime v8Runtime) {
        this.f51966n = list;
        this.f51967t = v8Runtime;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return JavetProxyPluginList.wTp(this.f51966n, this.f51967t, v8ValueArr);
    }
}
