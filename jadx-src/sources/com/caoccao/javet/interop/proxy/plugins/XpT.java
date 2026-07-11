package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.utils.V8ValueUtils;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final /* synthetic */ class XpT implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f51828n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List f51829t;

    public /* synthetic */ XpT(V8Runtime v8Runtime, List list) {
        this.f51828n = v8Runtime;
        this.f51829t = list;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return V8ValueUtils.createV8ValueArray(this.f51828n, this.f51829t.toArray());
    }
}
