package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzkv {
    public int zza;
    public long zzb;
    public Object zzc;
    public final zzlq zzd;
    public int zze;

    zzkv() {
        int i2 = zzlq.zzb;
        int i3 = zznt.zza;
        this.zzd = zzlq.zza;
    }

    zzkv(zzlq zzlqVar) {
        zzlqVar.getClass();
        this.zzd = zzlqVar;
    }

    static /* synthetic */ String zza(int i2, int i3, byte b2, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + b2 + String.valueOf(i2).length());
        sb.append(str);
        sb.append(i3);
        sb.append(str2);
        sb.append(i2);
        return sb.toString();
    }
}
