package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzieq extends Exception {
    zzieq(int i2, int i3) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 32 + String.valueOf(i3).length());
        sb.append("Unpaired surrogate at index ");
        sb.append(i2);
        sb.append(" of ");
        sb.append(i3);
        super(sb.toString());
    }
}
