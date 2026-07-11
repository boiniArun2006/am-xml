package com.caoccao.javet.utils;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class SimpleSet {
    public static <T> Set<T> of() {
        return new HashSet();
    }

    @SafeVarargs
    public static <T> Set<T> of(T... tArr) {
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, tArr);
        return hashSet;
    }

    private SimpleSet() {
    }
}
