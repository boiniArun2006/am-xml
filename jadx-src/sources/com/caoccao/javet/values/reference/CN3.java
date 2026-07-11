package com.caoccao.javet.values.reference;

import com.caoccao.javet.interop.callback.IJavetDirectCallable;
import com.caoccao.javet.values.V8Value;
import com.caoccao.javet.values.reference.IV8ValuePromise;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final /* synthetic */ class CN3 implements IJavetDirectCallable.NoThisAndNoResult, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ IV8ValuePromise.IListener f52060n;

    public /* synthetic */ CN3(IV8ValuePromise.IListener iListener) {
        this.f52060n = iListener;
    }

    @Override // com.caoccao.javet.interop.callback.IJavetDirectCallable.NoThisAndNoResult
    public final void call(V8Value[] v8ValueArr) {
        this.f52060n.onFulfilled(v8ValueArr[0]);
    }
}
