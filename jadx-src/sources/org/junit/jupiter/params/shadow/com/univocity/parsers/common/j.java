package org.junit.jupiter.params.shadow.com.univocity.parsers.common;

import java.util.Arrays;
import pj.AbstractC2334j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
abstract class j extends RuntimeException {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f71592n;

    public static Object[] Uo(int i2, Object[] objArr) {
        if (objArr == null || i2 == 0) {
            return null;
        }
        return objArr;
    }

    protected abstract String n();

    protected abstract String rl();

    protected String xMQ(String str) {
        return str;
    }

    protected static String t(String str, String str2, Object obj) {
        if (obj == null || obj.toString().isEmpty() || ((obj instanceof Number) && ((Number) obj).intValue() < 0)) {
            return str;
        }
        String str3 = str2 + '=' + (obj.getClass().isArray() ? Arrays.toString((Object[]) obj) : String.valueOf(obj));
        if (str.isEmpty()) {
            return str3;
        }
        return str + ", " + str3;
    }

    protected String J2(Object obj) {
        return AbstractC2334j.rl(this.f71592n, obj);
    }

    protected Object[] KN(Object[] objArr) {
        return Uo(this.f71592n, objArr);
    }

    protected String O(CharSequence charSequence) {
        return nr(this.f71592n, charSequence);
    }

    public static String nr(int i2, CharSequence charSequence) {
        return AbstractC2334j.n(i2, charSequence);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = rl() + ": ";
        }
        String strN = n();
        if (strN != null && !strN.isEmpty()) {
            message = message + "\nInternal state when error was thrown: " + strN;
        }
        return xMQ(message);
    }
}
