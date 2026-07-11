package com.fyber.inneractive.sdk.util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class i1 {
    public static String a(String str, int i2) {
        if (i2 <= 0 || str.length() <= i2) {
            return str;
        }
        return str.substring(0, i2 - 3) + "...";
    }
}
