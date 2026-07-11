package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class C1925z {
    static final Class<?> EXTENSION_REGISTRY_CLASS = reflectExtensionRegistry();
    static final String FULL_REGISTRY_CLASS_NAME = "com.google.protobuf.ExtensionRegistry";

    public static QJ create() {
        QJ qjInvokeSubclassFactory = invokeSubclassFactory("newInstance");
        return qjInvokeSubclassFactory != null ? qjInvokeSubclassFactory : new QJ();
    }

    public static QJ createEmpty() {
        QJ qjInvokeSubclassFactory = invokeSubclassFactory("getEmptyRegistry");
        return qjInvokeSubclassFactory != null ? qjInvokeSubclassFactory : QJ.EMPTY_REGISTRY_LITE;
    }

    private static final QJ invokeSubclassFactory(String str) {
        Class<?> cls = EXTENSION_REGISTRY_CLASS;
        if (cls == null) {
            return null;
        }
        try {
            return (QJ) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static boolean isFullRegistry(QJ qj) {
        Class<?> cls = EXTENSION_REGISTRY_CLASS;
        return cls != null && cls.isAssignableFrom(qj.getClass());
    }

    static Class<?> reflectExtensionRegistry() {
        try {
            return Class.forName(FULL_REGISTRY_CLASS_NAME);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    C1925z() {
    }
}
