package com.caoccao.javet.interop.engine.observers;

import com.caoccao.javet.interop.V8Runtime;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface IV8RuntimeObserver<R> {
    default R getResult() {
        return null;
    }

    void observe(V8Runtime v8Runtime);

    default void reset() {
    }
}
