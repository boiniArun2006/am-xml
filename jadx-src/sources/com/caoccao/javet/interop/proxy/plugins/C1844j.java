package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;

/* JADX INFO: renamed from: com.caoccao.javet.interop.proxy.plugins.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final /* synthetic */ class C1844j implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f51920n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f51921t;

    public /* synthetic */ C1844j(Object obj, V8Runtime v8Runtime) {
        this.f51920n = obj;
        this.f51921t = v8Runtime;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return BaseJavetProxyPlugin.rl(this.f51920n, this.f51921t, v8ValueArr);
    }
}
