package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzarq {
    private final String zza;
    private final String zzb;

    public zzarq(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzarq.class == obj.getClass()) {
            zzarq zzarqVar = (zzarq) obj;
            if (TextUtils.equals(this.zza, zzarqVar.zza) && TextUtils.equals(this.zzb, zzarqVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
