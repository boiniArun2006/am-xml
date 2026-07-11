package com.google.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class O {
    private static final OU FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final OU LITE_SCHEMA = new C1924p();

    static OU full() {
        return FULL_SCHEMA;
    }

    static OU lite() {
        return LITE_SCHEMA;
    }

    private static OU loadSchemaForFullRuntime() {
        try {
            return (OU) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    O() {
    }
}
