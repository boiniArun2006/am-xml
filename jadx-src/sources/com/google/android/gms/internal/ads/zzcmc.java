package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzcmc {
    private final VersionInfoParcel zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    /* synthetic */ zzcmc(zzcmb zzcmbVar, byte[] bArr) {
        this.zza = zzcmbVar.zzd();
        this.zzb = zzcmbVar.zze();
        this.zzd = zzcmbVar.zzg();
        this.zzc = zzcmbVar.zzf();
    }

    final Context zza() {
        return this.zzb;
    }

    final Context zzb() {
        return this.zzb;
    }

    final WeakReference zzc() {
        return this.zzd;
    }

    final VersionInfoParcel zzd() {
        return this.zza;
    }

    final zzbjy zzh() {
        return new zzbjy(this.zzb);
    }

    final long zzi() {
        return this.zzc;
    }

    static int zzj() {
        return ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzT)).intValue();
    }

    final zzclz zzf() {
        return new zzclz(this.zzb, this.zza);
    }

    public final com.google.android.gms.ads.internal.zzk zzg() {
        return new com.google.android.gms.ads.internal.zzk(this.zzb, this.zza);
    }

    final String zze() {
        return com.google.android.gms.ads.internal.zzt.zzc().zze(this.zzb, this.zza.afmaVersion);
    }
}
