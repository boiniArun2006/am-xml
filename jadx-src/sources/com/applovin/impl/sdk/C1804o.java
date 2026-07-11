package com.applovin.impl.sdk;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.v2;
import com.applovin.impl.x4;

/* JADX INFO: renamed from: com.applovin.impl.sdk.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class C1804o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f50447b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f50448a;

    public static void a(boolean z2) {
        f50447b = z2;
    }

    public static void c(String str, String str2, Throwable th) {
        if (!f50447b || a()) {
            Log.e("AppLovinSdk", "[" + str + "] " + str2, th);
        }
    }

    public static void h(String str, String str2) {
        c(str, str2, null);
    }

    public void b(String str, String str2) {
        a(str, str2, null);
    }

    public void d(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    public void k(String str, String str2) {
        d(str, str2, null);
    }

    private void a(String str) {
        v2 v2Var = new v2();
        v2Var.a().a(str).a();
        g("AppLovinSdk", v2Var.toString());
    }

    public static void b(String str, String str2, Throwable th) {
        C1802k c1802k = C1802k.C0;
        if (c1802k == null) {
            return;
        }
        c1802k.O();
        if (a()) {
            C1802k.C0.O().a(str, str2, th);
        }
    }

    public static void g(String str, String str2) {
        if (!f50447b || a()) {
            Log.d("AppLovinSdk", "[" + str + "] " + str2);
        }
    }

    public static void i(String str, String str2) {
        if (!f50447b || a()) {
            Log.i("AppLovinSdk", "[" + str + "] " + str2);
        }
    }

    public static void j(String str, String str2) {
        if (!f50447b || a()) {
            Log.w("AppLovinSdk", "[" + str + "] " + str2);
        }
    }

    public static void l(String str, String str2) {
        C1802k c1802k = C1802k.C0;
        if (c1802k == null) {
            return;
        }
        c1802k.O();
        if (a()) {
            C1802k.C0.O().k(str, str2);
        }
    }

    public void d(String str, String str2, Throwable th) {
        Log.w("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    public void f(String str, String str2) {
        int iIntValue;
        if (a(this.f50448a) && !TextUtils.isEmpty(str2) && (iIntValue = ((Integer) this.f50448a.a(x4.f50837r)).intValue()) > 0) {
            int length = str2.length();
            int i2 = ((length + iIntValue) - 1) / iIntValue;
            for (int i3 = 0; i3 < i2; i3++) {
                int i5 = i3 * iIntValue;
                a(str, str2.substring(i5, Math.min(length, i5 + iIntValue)));
            }
        }
    }

    C1804o(C1802k c1802k) {
        this.f50448a = c1802k;
        a("SDK Session Begin");
    }

    public static void c(String str, String str2) {
        b(str, str2, null);
    }

    public static void e(String str, String str2) {
        g(str, str2);
    }

    public void a(String str, Throwable th) {
        for (Throwable th2 : th.getSuppressed()) {
            b(str, th2.toString());
        }
    }

    public void a(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    public void a(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", "[" + str + "] " + str2, th);
    }

    public static boolean a() {
        return a(C1802k.C0);
    }

    public static boolean a(C1802k c1802k) {
        return c1802k != null && c1802k.o0().c();
    }
}
