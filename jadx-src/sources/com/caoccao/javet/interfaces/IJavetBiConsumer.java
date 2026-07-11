package com.caoccao.javet.interfaces;

import com.caoccao.javet.values.V8Value;
import java.lang.Throwable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@FunctionalInterface
public interface IJavetBiConsumer<T1 extends V8Value, T2 extends V8Value, E extends Throwable> {
    void accept(T1 t12, T2 t22) throws Throwable;
}
