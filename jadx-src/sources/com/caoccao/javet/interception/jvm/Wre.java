package com.caoccao.javet.interception.jvm;

import com.caoccao.javet.interception.jvm.JavetJVMInterceptor;
import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final /* synthetic */ class Wre implements IJavetDirectCallable.NoThisAndResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ JavetJVMInterceptor.BaseJavetPackage f51593n;

    public /* synthetic */ Wre(JavetJVMInterceptor.BaseJavetPackage baseJavetPackage) {
        this.f51593n = baseJavetPackage;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndResult
    public final V8Value call(V8Value[] v8ValueArr) {
        return JavetJVMInterceptor.BaseJavetPackage.gh(this.f51593n, v8ValueArr);
    }
}
