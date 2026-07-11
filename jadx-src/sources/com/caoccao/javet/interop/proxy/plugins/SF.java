package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.utils.V8ValueUtils;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final /* synthetic */ class SF implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f51802n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Set f51803t;

    public /* synthetic */ SF(V8Runtime v8Runtime, Set set) {
        this.f51802n = v8Runtime;
        this.f51803t = set;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return V8ValueUtils.createV8ValueSet(this.f51802n, this.f51803t.toArray());
    }
}
