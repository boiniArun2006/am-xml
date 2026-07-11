package com.alightcreative.app.motion.activities;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class L0y {
    static /* synthetic */ String rl(String str, Locale locale, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            locale = Locale.ENGLISH;
        }
        return n(str, locale);
    }

    private static final String n(String str, Locale locale) {
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
