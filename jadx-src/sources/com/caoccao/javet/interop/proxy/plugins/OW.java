package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.virtual.V8VirtualIterator;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final /* synthetic */ class OW implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f51767n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Set f51768t;

    public /* synthetic */ OW(V8Runtime v8Runtime, Set set) {
        this.f51767n = v8Runtime;
        this.f51768t = set;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return BaseJavetProxyPlugin.PROXY_CONVERTER.toV8Value(this.f51767n, new V8VirtualIterator(this.f51768t.iterator()));
    }
}
