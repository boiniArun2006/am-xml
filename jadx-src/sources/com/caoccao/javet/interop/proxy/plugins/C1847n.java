package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;

/* JADX INFO: renamed from: com.caoccao.javet.interop.proxy.plugins.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final /* synthetic */ class C1847n implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final /* synthetic */ Object f51943O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f51944n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f51945t;

    public /* synthetic */ C1847n(V8Runtime v8Runtime, String str, Object obj) {
        this.f51944n = v8Runtime;
        this.f51945t = str;
        this.f51943O = obj;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return BaseJavetProxyPlugin.t(this.f51944n, this.f51945t, this.f51943O, v8ValueArr);
    }
}
