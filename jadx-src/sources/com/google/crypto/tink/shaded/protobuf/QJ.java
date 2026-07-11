package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class QJ {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final eO f59927n = new C1906z();
    private static final eO rl = t();

    static eO n() {
        eO eOVar = rl;
        if (eOVar != null) {
            return eOVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static eO rl() {
        return f59927n;
    }

    private static eO t() {
        try {
            return (eO) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
