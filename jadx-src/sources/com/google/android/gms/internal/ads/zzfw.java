package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class zzfw {
    public final int zzd;

    public static String zze(int i2) {
        char c2 = (char) ((i2 >> 24) & 255);
        int length = String.valueOf(c2).length();
        char c4 = (char) ((i2 >> 16) & 255);
        int length2 = String.valueOf(c4).length();
        char c5 = (char) ((i2 >> 8) & 255);
        char c6 = (char) (i2 & 255);
        StringBuilder sb = new StringBuilder(length + length2 + String.valueOf(c5).length() + String.valueOf(c6).length());
        sb.append(c2);
        sb.append(c4);
        sb.append(c5);
        sb.append(c6);
        return sb.toString();
    }

    public String toString() {
        return zze(this.zzd);
    }
}
