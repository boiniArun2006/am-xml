package com.caoccao.javet.interop.proxy.plugins;

import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.utils.V8ValueUtils;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final /* synthetic */ class A implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List f51668n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f51669t;

    public /* synthetic */ A(List list, V8Runtime v8Runtime) {
        this.f51668n = list;
        this.f51669t = v8Runtime;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return this.f51669t.createV8ValueString((String) this.f51668n.stream().map(new cA()).collect(Collectors.joining(V8ValueUtils.asString(v8ValueArr, 0, ""))));
    }
}
