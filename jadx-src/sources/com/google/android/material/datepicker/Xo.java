package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static AtomicReference f58935n = new AtomicReference();

    static Calendar xMQ() {
        return mUb(null);
    }

    private static TimeZone J2() {
        return DesugarTimeZone.getTimeZone("UTC");
    }

    private static android.icu.util.TimeZone KN() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    static Pl O() {
        Pl pl = (Pl) f58935n.get();
        return pl == null ? Pl.t() : pl;
    }

    static DateFormat gh(Locale locale) {
        return rl("yMMMM", locale);
    }

    static DateFormat nr(Locale locale) {
        return rl("MMMMEEEEd", locale);
    }

    static DateFormat qie(Locale locale) {
        return rl("yMMMMEEEEd", locale);
    }

    static Calendar Uo() {
        Calendar calendarN = O().n();
        calendarN.set(11, 0);
        calendarN.set(12, 0);
        calendarN.set(13, 0);
        calendarN.set(14, 0);
        calendarN.setTimeZone(J2());
        return calendarN;
    }

    static Calendar mUb(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(J2());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    static long n(long j2) {
        Calendar calendarXMQ = xMQ();
        calendarXMQ.setTimeInMillis(j2);
        return t(calendarXMQ).getTimeInMillis();
    }

    private static DateFormat rl(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(KN());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    static Calendar t(Calendar calendar) {
        Calendar calendarMUb = mUb(calendar);
        Calendar calendarXMQ = xMQ();
        calendarXMQ.set(calendarMUb.get(1), calendarMUb.get(2), calendarMUb.get(5));
        return calendarXMQ;
    }
}
