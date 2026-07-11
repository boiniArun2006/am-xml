package com.caoccao.javet.interception.jvm;

import com.caoccao.javet.interception.jvm.JavetJVMInterceptor;
import com.caoccao.javet.interop.V8Runtime;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final /* synthetic */ class j implements IJavetDirectCallable.GetterAndNoThis, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V8Runtime f51598n;

    public /* synthetic */ j(V8Runtime v8Runtime) {
        this.f51598n = v8Runtime;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.GetterAndNoThis
    public final V8Value get() {
        return new JavetJVMInterceptor.JavetV8(this.f51598n).toV8Value();
    }
}
