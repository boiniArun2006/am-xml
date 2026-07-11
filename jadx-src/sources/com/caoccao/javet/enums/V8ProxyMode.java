package com.caoccao.javet.enums;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public enum V8ProxyMode {
    Class,
    Function,
    Object;

    public static boolean isClassMode(Class<?> cls) {
        if (!cls.isPrimitive() && !cls.isAnnotation() && !cls.isInterface() && !cls.isArray()) {
            return true;
        }
        return false;
    }
}
