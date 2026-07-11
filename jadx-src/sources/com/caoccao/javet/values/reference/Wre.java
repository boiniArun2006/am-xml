package com.caoccao.javet.values.reference;

import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.IV8ValuePromise;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final /* synthetic */ class Wre implements IJavetDirectCallable.NoThisAndNoResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ IV8ValuePromise.IListener f52062n;

    public /* synthetic */ Wre(IV8ValuePromise.IListener iListener) {
        this.f52062n = iListener;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndNoResult
    public final void call(V8Value[] v8ValueArr) {
        this.f52062n.onCatch(v8ValueArr[0]);
    }
}
