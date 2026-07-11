package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f49644a = new a("Age Restricted User", z4.f51015r);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f49645b = new a("Has User Consent", z4.f51014q);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f49646c = new a("\"Do Not Sell\"", z4.f51016s);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f49647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final z4 f49648b;

        public Boolean b(Context context) {
            if (context != null) {
                return (Boolean) a5.a(this.f49648b, (Object) null, context);
            }
            C1804o.h("AppLovinSdk", "Failed to get value for key: " + this.f49648b);
            return null;
        }

        public String a() {
            return this.f49647a;
        }

        a(String str, z4 z4Var) {
            this.f49647a = str;
            this.f49648b = z4Var;
        }

        public String a(Context context) {
            Boolean boolB = b(context);
            return boolB != null ? boolB.toString() : "No value set";
        }
    }

    public static a a() {
        return f49646c;
    }

    public static a b() {
        return f49645b;
    }

    public static boolean a(boolean z2, Context context) {
        return a(z4.f51016s, Boolean.valueOf(z2), context);
    }

    public static boolean b(boolean z2, Context context) {
        return a(z4.f51014q, Boolean.valueOf(z2), context);
    }

    public static a c() {
        return f49644a;
    }

    public static String a(Context context) {
        return a(f49645b, context) + a(f49646c, context);
    }

    private static boolean a(z4 z4Var, Boolean bool, Context context) {
        if (context == null) {
            C1804o.h("AppLovinSdk", "Failed to update compliance value for key: " + z4Var);
            return false;
        }
        try {
            Boolean bool2 = (Boolean) a5.a(z4Var, (Object) null, context);
            a5.b(z4Var, bool, context);
            return bool2 == null || bool2 != bool;
        } catch (Throwable th) {
            C1804o.c("ComplianceManager", "Unable to update compliance", th);
            C1802k c1802k = C1802k.C0;
            if (c1802k != null) {
                c1802k.D().a("ComplianceManager", "updateCompliance", th);
            }
            return false;
        }
    }

    private static String a(a aVar, Context context) {
        return "\n" + aVar.f49647a + " - " + aVar.a(context);
    }
}
