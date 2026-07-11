package com.caoccao.javet.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class SimpleList {
    public static <T> List<T> of() {
        return new ArrayList();
    }

    @SafeVarargs
    public static <T> List<T> of(T... tArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, tArr);
        return arrayList;
    }

    private SimpleList() {
    }
}
