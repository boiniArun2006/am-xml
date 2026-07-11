package com.caoccao.javet.interfaces;

import java.lang.Throwable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@FunctionalInterface
public interface IJavetBiFunction<T1, T2, R, E extends Throwable> {
    R apply(T1 t12, T2 t22) throws Throwable;
}
