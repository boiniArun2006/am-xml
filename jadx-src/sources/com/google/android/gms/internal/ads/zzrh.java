package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzrh extends Exception {
    public zzrh(long j2, long j3) {
        StringBuilder sb = new StringBuilder(String.valueOf(j3).length() + 63 + String.valueOf(j2).length());
        sb.append("Unexpected audio track timestamp discontinuity: expected ");
        sb.append(j3);
        sb.append(", got ");
        sb.append(j2);
        super(sb.toString());
    }
}
