package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzftp implements zzfti {
    private static zzftp zza;
    private float zzb = 0.0f;
    private zzftd zzc;
    private zzfth zzd;

    public zzftp(zzfte zzfteVar, zzfta zzftaVar) {
    }

    public static zzftp zza() {
        if (zza == null) {
            zza = new zzftp(new zzfte(), new zzfta());
        }
        return zza;
    }

    public final float zzg() {
        return this.zzb;
    }

    public final void zzb(Context context) {
        this.zzc = new zzftd(new Handler(), context, new zzfsz(), this);
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    public final void zzd(boolean z2) {
        if (z2) {
            zzfur.zzb().zzc();
        } else {
            zzfur.zzb().zze();
        }
    }

    public final void zzf(float f3) {
        this.zzb = f3;
        if (this.zzd == null) {
            this.zzd = zzfth.zza();
        }
        Iterator it = this.zzd.zzf().iterator();
        while (it.hasNext()) {
            ((zzfsn) it.next()).zzg().zzo(f3);
        }
    }

    public final void zzc() {
        zzftg.zza().zzg(this);
        zzftg.zza().zze();
        zzfur.zzb().zzc();
        this.zzc.zza();
    }

    public final void zze() {
        zzfur.zzb().zzd();
        zzftg.zza().zzf();
        this.zzc.zzb();
    }
}
