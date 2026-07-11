package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzehp implements zzdct, zzdbi {
    private static final Object zza = new Object();
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzehz zzd;

    public zzehp(zzehz zzehzVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzehzVar;
        this.zzc = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbi
    public final void zzdI(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final void zzg() {
        zzb(true);
    }

    private final void zzb(boolean z2) {
        int i2;
        int iIntValue;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhf)).booleanValue() && !this.zzc.zzx()) {
            Object obj = zza;
            synchronized (obj) {
                i2 = zzb;
                iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhg)).intValue();
            }
            if (i2 < iIntValue) {
                this.zzd.zza(z2);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }
}
