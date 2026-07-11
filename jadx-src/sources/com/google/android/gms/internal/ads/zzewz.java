package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzewz implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzewz(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzewz zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzewz(zzikpVar, zzikpVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgup zzgupVarZzi;
        zzexx zzexxVarZzb = ((zzexz) this.zza).zzb();
        Context contextZza = ((zzcmj) this.zzb).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmP)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            zzgupVarZzi = com.google.android.gms.ads.internal.util.zzs.zzG(contextZza) ? zzgup.zzi(zzexxVarZzb) : zzgup.zzh();
        }
        zziko.zzb(zzgupVarZzi);
        return zzgupVarZzi;
    }
}
