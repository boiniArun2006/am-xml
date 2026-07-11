package com.caoccao.javet.interception.logging;

import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final /* synthetic */ class Wre implements IJavetDirectCallable.NoThisAndNoResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BaseJavetConsoleInterceptor f51606n;

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndNoResult
    public final void call(V8Value[] v8ValueArr) {
        this.f51606n.consoleWarn(v8ValueArr);
    }
}
