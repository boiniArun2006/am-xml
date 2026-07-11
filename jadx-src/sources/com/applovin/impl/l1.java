package com.applovin.impl;

import android.os.Looper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Thread f48864a = Looper.getMainLooper().getThread();

    public static void a(Throwable th) {
    }

    public static void a(Throwable th, String str, Object... objArr) {
    }

    public static boolean a(boolean z2) {
        return a(z2, "Assertion failed", new Object[0]);
    }

    public static boolean a(boolean z2, String str, Object... objArr) {
        if (!z2) {
            a(str, objArr);
        }
        return z2;
    }

    public static boolean a(Object obj) {
        return a(obj, "Null value not expected", new Object[0]);
    }

    public static boolean a(Object obj, String str, Object... objArr) {
        return a(obj != null, str, objArr);
    }

    public static void a(String str, Object... objArr) {
        a((Throwable) null, str, objArr);
    }
}
