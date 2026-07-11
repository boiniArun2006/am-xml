package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.virtual.V8VirtualIterator;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final /* synthetic */ class gW implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f51901n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Map f51902t;

    public /* synthetic */ gW(V8Runtime v8Runtime, Map map) {
        this.f51901n = v8Runtime;
        this.f51902t = map;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return BaseJavetProxyPlugin.PROXY_CONVERTER.toV8Value(this.f51901n, new V8VirtualIterator(this.f51902t.values().iterator()));
    }
}
