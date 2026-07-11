package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final /* synthetic */ class RVT implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Set f51795n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f51796t;

    public /* synthetic */ RVT(Set set, V8Runtime v8Runtime) {
        this.f51795n = set;
        this.f51796t = v8Runtime;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return JavetProxyPluginSet.nr(this.f51795n, this.f51796t, v8ValueArr);
    }
}
