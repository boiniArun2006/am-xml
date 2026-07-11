package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final Class f59917n = t();

    public static Xo n() {
        Xo xoRl = rl("getEmptyRegistry");
        return xoRl != null ? xoRl : Xo.nr;
    }

    private static final Xo rl(String str) {
        Class cls = f59917n;
        if (cls == null) {
            return null;
        }
        try {
            return (Xo) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class t() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
