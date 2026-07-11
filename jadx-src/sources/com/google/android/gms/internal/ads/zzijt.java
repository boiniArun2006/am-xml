package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzijt extends zzijy {
    final String zza;

    public zzijt(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzijy
    public final void zza(String str) {
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
