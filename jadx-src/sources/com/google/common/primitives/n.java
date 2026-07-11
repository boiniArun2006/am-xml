package com.google.common.primitives;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class n {
    public static boolean n(char[] cArr, char c2) {
        for (char c4 : cArr) {
            if (c4 == c2) {
                return true;
            }
        }
        return false;
    }
}
