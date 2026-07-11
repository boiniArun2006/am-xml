package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
abstract class lej {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final qf f60016n = t();
    private static final qf rl = new Ln();

    static qf n() {
        return f60016n;
    }

    static qf rl() {
        return rl;
    }

    private static qf t() {
        try {
            return (qf) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
