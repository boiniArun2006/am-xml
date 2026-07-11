package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f59915n;
    private static final Class rl = n("libcore.io.Memory");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final boolean f59916t;

    static {
        f59916t = (f59915n || n("org.robolectric.Robolectric") == null) ? false : true;
    }

    static Class rl() {
        return rl;
    }

    static boolean t() {
        if (f59915n) {
            return true;
        }
        return (rl == null || f59916t) ? false : true;
    }

    private static Class n(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
