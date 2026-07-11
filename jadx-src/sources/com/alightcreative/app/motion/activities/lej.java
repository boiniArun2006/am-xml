package com.alightcreative.app.motion.activities;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class lej {
    static /* synthetic */ String J2(String str, Locale locale, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            locale = Locale.ENGLISH;
        }
        return O(str, locale);
    }

    public static final String n(long j2, boolean z2) {
        if (j2 >= 1024) {
            return j2 < 1048576 ? nr(j2, 1024L, "kbps", z2) : j2 < 1073741824 ? nr(j2, 1048576L, "mbps", z2) : nr(j2, 1073741824L, "gbps", z2);
        }
        return j2 + "bps";
    }

    private static final String nr(long j2, long j3, String str, boolean z2) {
        long j4 = j2 / j3;
        long j5 = ((j2 - (j4 * j3)) * ((long) 10)) / j3;
        if ((j5 <= 0 || j4 >= 1000) && !z2) {
            return j4 + str;
        }
        return j4 + "." + j5 + str;
    }

    public static final String rl(long j2, boolean z2) {
        if (j2 >= 1024) {
            return j2 < 1048576 ? nr(j2, 1024L, "KB", z2) : j2 < 1073741824 ? nr(j2, 1048576L, "MB", z2) : nr(j2, 1073741824L, "GB", z2);
        }
        return j2 + "b";
    }

    public static /* synthetic */ String t(long j2, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return rl(j2, z2);
    }

    private static final String O(String str, Locale locale) {
        String upperCase;
        String string;
        Character chFirstOrNull = StringsKt.firstOrNull(str);
        if (chFirstOrNull != null && (string = chFirstOrNull.toString()) != null) {
            upperCase = string.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        return upperCase + StringsKt.drop(str, 1);
    }
}
