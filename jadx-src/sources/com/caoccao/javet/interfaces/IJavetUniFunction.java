package com.caoccao.javet.interfaces;

import java.lang.Throwable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@FunctionalInterface
public interface IJavetUniFunction<T, R, E extends Throwable> {
    R apply(T t3) throws Throwable;
}
