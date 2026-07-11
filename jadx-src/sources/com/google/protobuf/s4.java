package com.google.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class s4 {
    private static final l3D LITE_SCHEMA = new C1921c();
    private static final l3D FULL_SCHEMA = loadSchemaForFullRuntime();

    static l3D full() {
        l3D l3d = FULL_SCHEMA;
        if (l3d != null) {
            return l3d;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static l3D lite() {
        return LITE_SCHEMA;
    }

    private static l3D loadSchemaForFullRuntime() {
        try {
            return (l3D) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    s4() {
    }
}
