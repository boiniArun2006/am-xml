package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.utils.V8ValueUtils;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final /* synthetic */ class FOg implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f51705n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Map f51706t;

    public /* synthetic */ FOg(V8Runtime v8Runtime, Map map) {
        this.f51705n = v8Runtime;
        this.f51706t = map;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return V8ValueUtils.createV8ValueMap(this.f51705n, this.f51706t);
    }
}
