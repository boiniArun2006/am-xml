package com.caoccao.javet.interop.binding;

import com.caoccao.javet.utils.ThreadSafeMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class ClassDescriptorStore {
    private static final ThreadSafeMap<Class<?>, ClassDescriptor> classMap = new ThreadSafeMap<>();
    private static final ThreadSafeMap<Class<?>, ClassDescriptor> objectMap = new ThreadSafeMap<>();

    public static ThreadSafeMap<Class<?>, ClassDescriptor> getClassMap() {
        return classMap;
    }

    public static ThreadSafeMap<Class<?>, ClassDescriptor> getObjectMap() {
        return objectMap;
    }

    private ClassDescriptorStore() {
    }
}
