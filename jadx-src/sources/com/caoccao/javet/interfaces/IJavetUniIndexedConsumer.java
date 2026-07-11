package com.caoccao.javet.interfaces;

import com.caoccao.javet.values.V8Value;
import java.lang.Throwable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@FunctionalInterface
public interface IJavetUniIndexedConsumer<T extends V8Value, E extends Throwable> {
    void accept(int i2, T t3) throws Throwable;
}
