package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final /* synthetic */ class xU implements IJavetDirectCallable.ThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f52026n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Set f52027t;

    public /* synthetic */ xU(V8Runtime v8Runtime, Set set) {
        this.f52026n = v8Runtime;
        this.f52027t = set;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.ThisAndResult
    public final V8Value call(V8Value v8Value, V8Value[] v8ValueArr) {
        return JavetProxyPluginSet.mUb(this.f52026n, this.f52027t, v8Value, v8ValueArr);
    }
}
