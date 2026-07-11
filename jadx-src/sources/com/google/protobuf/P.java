package com.google.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class P {
    private static final Md FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final Md LITE_SCHEMA = new Zs();

    static Md full() {
        return FULL_SCHEMA;
    }

    static Md lite() {
        return LITE_SCHEMA;
    }

    private static Md loadSchemaForFullRuntime() {
        try {
            return (Md) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    P() {
    }
}
