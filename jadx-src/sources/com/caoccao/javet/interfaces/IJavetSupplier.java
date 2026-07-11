package com.caoccao.javet.interfaces;

import java.lang.Throwable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@FunctionalInterface
public interface IJavetSupplier<T, E extends Throwable> {
    T get() throws Throwable;
}
