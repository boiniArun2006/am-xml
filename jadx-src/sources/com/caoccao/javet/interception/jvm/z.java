package com.caoccao.javet.interception.jvm;

import com.caoccao.javet.interception.jvm.JavetJVMInterceptor;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final /* synthetic */ class z implements IJavetDirectCallable.NoThisAndNoResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ JavetJVMInterceptor.JavetV8 f51603n;

    public /* synthetic */ z(JavetJVMInterceptor.JavetV8 javetV8) {
        this.f51603n = javetV8;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndNoResult
    public final void call(V8Value[] v8ValueArr) {
        this.f51603n.v8Runtime.lowMemoryNotification();
    }
}
