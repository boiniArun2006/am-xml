package com.caoccao.javet.interfaces;

import com.caoccao.javet.values.V8Value;
import java.lang.Throwable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@FunctionalInterface
public interface IJavetUniConsumer<T extends V8Value, E extends Throwable> {
    void accept(T t3) throws Throwable;
}
