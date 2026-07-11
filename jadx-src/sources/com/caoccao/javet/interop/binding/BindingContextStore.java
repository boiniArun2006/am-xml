package com.caoccao.javet.interop.binding;

import com.caoccao.javet.utils.ThreadSafeMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class BindingContextStore {
    private static final ThreadSafeMap<Class<?>, BindingContext> bindingContextMap = new ThreadSafeMap<>();

    public static ThreadSafeMap<Class<?>, BindingContext> getMap() {
        return bindingContextMap;
    }

    private BindingContextStore() {
    }
}
