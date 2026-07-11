package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzezs implements zzfav {
    private zzgah zza;
    private zzgah zzb;
    private boolean zzc;
    private boolean zzd;
    private final boolean zze = false;
    private final boolean zzf;

    public zzezs(zzgah zzgahVar, zzgah zzgahVar2, boolean z2, boolean z3, boolean z4) {
        this.zza = zzgahVar;
        this.zzb = zzgahVar2;
        this.zzc = z2;
        this.zzd = z3;
        this.zzf = z4;
    }

    public zzezs(boolean z2) {
        this.zzf = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.google.android.gms.internal.ads.zzfav
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        if (this.zze) {
            return;
        }
        Bundle bundleZza = zzfjz.zza(bundle, "pii");
        boolean z2 = this.zzf;
        if (!z2) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdR)).booleanValue()) {
                if (z2) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdT)).booleanValue()) {
                        if (this.zza.zzc()) {
                            bundleZza.putString("paidv1_id_android", this.zza.zza());
                            bundleZza.putLong("paidv1_creation_time_android", this.zza.zzb());
                        }
                    }
                }
            }
        }
        if (!z2) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdS)).booleanValue()) {
                if (z2) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdU)).booleanValue()) {
                        if (this.zzb.zzc()) {
                            bundleZza.putString("paidv2_id_android", this.zzb.zza());
                            bundleZza.putLong("paidv2_creation_time_android", this.zzb.zzb());
                        }
                        bundleZza.putBoolean("paidv2_pub_option_android", this.zzc);
                        bundleZza.putBoolean("paidv2_user_option_android", this.zzd);
                    }
                }
            }
        }
        if (bundleZza.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", bundleZza);
    }
}
