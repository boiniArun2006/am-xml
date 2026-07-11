package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final /* synthetic */ class xMz implements IJavetDirectCallable.ThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f52023n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List f52024t;

    public /* synthetic */ xMz(V8Runtime v8Runtime, List list) {
        this.f52023n = v8Runtime;
        this.f52024t = list;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.ThisAndResult
    public final V8Value call(V8Value v8Value, V8Value[] v8ValueArr) {
        return JavetProxyPluginList.az(this.f52023n, this.f52024t, v8Value, v8ValueArr);
    }
}
