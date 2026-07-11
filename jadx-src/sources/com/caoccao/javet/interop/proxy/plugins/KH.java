package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final /* synthetic */ class KH implements IJavetDirectCallable.ThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f51740n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f51741t;

    public /* synthetic */ KH(V8Runtime v8Runtime, Object obj) {
        this.f51740n = v8Runtime;
        this.f51741t = obj;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.ThisAndResult
    public final V8Value call(V8Value v8Value, V8Value[] v8ValueArr) {
        return JavetProxyPluginArray.XQ(this.f51740n, this.f51741t, v8Value, v8ValueArr);
    }
}
