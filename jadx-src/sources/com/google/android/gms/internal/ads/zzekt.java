package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzekt implements zzdmc {
    private final VersionInfoParcel zza;
    private final com.google.common.util.concurrent.Xo zzb;
    private final zzfir zzc;
    private final zzcjl zzd;
    private final zzfjk zze;
    private final zzbok zzf;
    private final boolean zzg;
    private final zzejf zzh;
    private final zzdxz zzi;

    zzekt(VersionInfoParcel versionInfoParcel, com.google.common.util.concurrent.Xo xo, zzfir zzfirVar, zzcjl zzcjlVar, zzfjk zzfjkVar, boolean z2, zzbok zzbokVar, zzejf zzejfVar, zzdxz zzdxzVar) {
        this.zza = versionInfoParcel;
        this.zzb = xo;
        this.zzc = zzfirVar;
        this.zzd = zzcjlVar;
        this.zze = zzfjkVar;
        this.zzg = z2;
        this.zzf = zzbokVar;
        this.zzh = zzejfVar;
        this.zzi = zzdxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    @Nullable
    public final zzfir zzb() {
        return this.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    @Override // com.google.android.gms.internal.ads.zzdmc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(boolean z2, Context context, zzdbs zzdbsVar) {
        zzcti zzctiVar = (zzcti) zzgzo.zzt(this.zzb);
        zzcjl zzcjlVar = this.zzd;
        zzcjlVar.zzag(true);
        boolean z3 = this.zzg;
        boolean zZzc = z3 ? this.zzf.zzc(true) : true;
        boolean z4 = z3 && this.zzf.zzd();
        float fZze = z3 ? this.zzf.zze() : 0.0f;
        zzfir zzfirVar = this.zzc;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZzc, true, z4, fZze, -1, z2, zzfirVar.zzO, false);
        if (zzdbsVar != null) {
            zzdbsVar.zzb();
        }
        com.google.android.gms.ads.internal.zzt.zzb();
        zzdlr zzdlrVarZzj = zzctiVar.zzj();
        int i2 = zzfirVar.zzQ;
        if (i2 == -1) {
            com.google.android.gms.ads.internal.client.zzx zzxVar = this.zze.zzk;
            if (zzxVar == null) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Error setting app open orientation; no targeting orientation available.");
            } else {
                int i5 = zzxVar.zza;
                if (i5 == 1) {
                    i2 = 7;
                } else if (i5 == 2) {
                    i2 = 6;
                }
            }
        }
        VersionInfoParcel versionInfoParcel = this.zza;
        String str = zzfirVar.zzB;
        zzfiw zzfiwVar = zzfirVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzdlrVarZzj, null, zzcjlVar, i2, versionInfoParcel, str, zzlVar, zzfiwVar.zzb, zzfiwVar.zza, this.zze.zzg, zzdbsVar, zzfirVar.zzb() ? this.zzh : null, zzcjlVar.zzn()), true, this.zzi);
    }
}
