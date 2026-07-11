package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final /* synthetic */ class yht implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f52040n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f52041t;

    public /* synthetic */ yht(V8Runtime v8Runtime, Object obj) {
        this.f52040n = v8Runtime;
        this.f52041t = obj;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return BaseJavetProxyPlugin.OBJECT_CONVERTER.toV8Value(this.f52040n, this.f52041t);
    }
}
