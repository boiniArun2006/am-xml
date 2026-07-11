package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzecl implements zzaqu {
    final /* synthetic */ zzecm zza;

    zzecl(zzecm zzecmVar) {
        Objects.requireNonNull(zzecmVar);
        this.zza = zzecmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqu
    public final void zza(int i2) {
        zzaqv zzaqvVarZzd;
        try {
            zzfpb zzfpbVarZza = zzfpc.zza();
            int i3 = 3;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            i3 = 7;
                        } else {
                            i3 = 6;
                        }
                    } else {
                        i3 = 5;
                    }
                } else {
                    i3 = 4;
                }
            }
            zzfpbVarZza.zzh(i3);
            if (i2 == 0 && (zzaqvVarZzd = this.zza.zzc().zzd()) != null) {
                zzfpbVarZza.zzb(zzaqvVarZzd.zzb());
                zzfpbVarZza.zzc(zzaqvVarZzd.zzc());
                zzfpbVarZza.zzd(zzaqvVarZzd.zzd());
                zzfpbVarZza.zze(zzaqvVarZzd.zze());
                zzfpbVarZza.zzf(zzaqvVarZzd.zzf());
                if (!TextUtils.isEmpty(zzaqvVarZzd.zza())) {
                    zzfpbVarZza.zza(zzaqvVarZzd.zza());
                }
                if (!TextUtils.isEmpty(zzaqvVarZzd.zzg())) {
                    zzfpbVarZza.zzg(zzaqvVarZzd.zzg());
                }
            }
            zzecm zzecmVar = this.zza;
            zzecmVar.zzc().zzc();
            zzdxz zzdxzVarZzd = zzecmVar.zzd();
            String strEncodeToString = Base64.encodeToString(((zzfpc) zzfpbVarZza.zzbu()).zzaN(), 1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfO)).booleanValue()) {
                zzdxy zzdxyVarZza = zzdxzVarZzd.zza();
                zzdxyVarZza.zzc(FileUploadManager.f61572j, "irda");
                zzdxyVarZza.zzc("irdd", strEncodeToString);
                zzdxyVarZza.zzf();
            }
            zzecmVar.zze().zzQ(true);
        } catch (Exception e2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfP)).booleanValue()) {
                zzecm zzecmVar2 = this.zza;
                if (zzecmVar2.zzb == null) {
                    zzecmVar2.zzb = zzbyp.zzc(zzecmVar2.zzb());
                }
                zzecmVar2.zzb.zzh(e2, "InstallReferrerUnsampled.onInstallReferrerSetupFinished");
                return;
            }
            zzecm zzecmVar3 = this.zza;
            if (zzecmVar3.zza == null) {
                zzecmVar3.zza = zzbyp.zza(zzecmVar3.zzb());
            }
            zzecmVar3.zza.zzh(e2, "InstallReferrer.onInstallReferrerSetupFinished");
        }
    }
}
