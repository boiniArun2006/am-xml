package com.google.android.material.datepicker;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class w6 {
    static String J2(long j2) {
        return Xo.gh(Locale.getDefault()).format(new Date(j2));
    }

    static String KN(long j2, Locale locale) {
        return Xo.qie(locale).format(new Date(j2));
    }

    static String O(Context context, int i2) {
        if (Xo.Uo().get(1) == i2) {
            return String.format(context.getString(Rxk.aC.f8780o), Integer.valueOf(i2));
        }
        return String.format(context.getString(Rxk.aC.f8777Z), Integer.valueOf(i2));
    }

    static String Uo(long j2) {
        return KN(j2, Locale.getDefault());
    }

    static String n(Context context, long j2, boolean z2, boolean z3, boolean z4) {
        String strNr = nr(j2);
        if (z2) {
            strNr = String.format(context.getString(Rxk.aC.f8776S), strNr);
        }
        if (z3) {
            return String.format(context.getString(Rxk.aC.XQ), strNr);
        }
        if (z4) {
            return String.format(context.getString(Rxk.aC.f8781r), strNr);
        }
        return strNr;
    }

    static String nr(long j2) {
        if (xMQ(j2)) {
            return rl(j2);
        }
        return Uo(j2);
    }

    static String rl(long j2) {
        return t(j2, Locale.getDefault());
    }

    static String t(long j2, Locale locale) {
        return Xo.nr(locale).format(new Date(j2));
    }

    private static boolean xMQ(long j2) {
        Calendar calendarUo = Xo.Uo();
        Calendar calendarXMQ = Xo.xMQ();
        calendarXMQ.setTimeInMillis(j2);
        if (calendarUo.get(1) == calendarXMQ.get(1)) {
            return true;
        }
        return false;
    }
}
