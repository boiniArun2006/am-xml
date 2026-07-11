package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgid extends RuntimeException {
    zzgid(int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 3);
        sb.append("r: ");
        sb.append(i2);
        super(sb.toString());
    }
}
