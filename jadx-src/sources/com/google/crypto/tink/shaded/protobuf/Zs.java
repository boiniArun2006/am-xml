package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
abstract class Zs {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final psW f59943n = t();
    private static final psW rl = new Md();

    static psW n() {
        return f59943n;
    }

    static psW rl() {
        return rl;
    }

    private static psW t() {
        try {
            return (psW) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
