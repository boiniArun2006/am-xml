package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.virtual.V8VirtualIterator;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final /* synthetic */ class vi implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f52013n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List f52014t;

    public /* synthetic */ vi(V8Runtime v8Runtime, List list) {
        this.f52013n = v8Runtime;
        this.f52014t = list;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return BaseJavetProxyPlugin.PROXY_CONVERTER.toV8Value(this.f52013n, new V8VirtualIterator(this.f52014t.iterator()));
    }
}
