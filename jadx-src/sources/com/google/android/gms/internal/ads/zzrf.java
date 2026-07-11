package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzrf extends Exception {
    public final boolean zza;

    public zzrf(int i2, int i3, int i5, int i7, int i8, zzv zzvVar, boolean z2, @Nullable Exception exc) {
        String strValueOf = String.valueOf(zzvVar);
        int length = String.valueOf(i3).length();
        int length2 = String.valueOf(i5).length();
        int length3 = String.valueOf(i7).length();
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 2 + length3 + 2 + String.valueOf(i8).length() + 2 + strValueOf.length());
        sb.append("AudioTrack init failed 0 Config(");
        sb.append(i3);
        sb.append(", ");
        sb.append(i5);
        sb.append(", ");
        sb.append(i7);
        sb.append(", ");
        sb.append(i8);
        sb.append(") ");
        sb.append(strValueOf);
        sb.append("");
        super(sb.toString(), exc);
        this.zza = false;
    }
}
