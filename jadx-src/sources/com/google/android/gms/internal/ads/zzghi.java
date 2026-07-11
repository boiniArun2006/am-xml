package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzghi {
    private final Context zza;
    private final zzgoe zzb;
    private final zzgfe zzc;
    private final String zzd;

    public final String zza(boolean z2, long j2) {
        String string;
        zzgoc zzgocVarZza = this.zzb.zza(55);
        try {
            try {
                try {
                    zzgocVarZza.zza();
                    zzaxp zzaxpVarZza = zzaxq.zza();
                    zzaxpVarZza.zzb(this.zzd);
                    zzaxpVarZza.zza("0.825731049");
                    zzaxpVarZza.zzd(this.zza.getPackageName());
                    zzaxpVarZza.zzc(System.currentTimeMillis() / 1000);
                    zzaxpVarZza.zzf((System.currentTimeMillis() - j2) / 1000);
                    try {
                        zzaxpVarZza.zze(r0.getPackageManager().getPackageInfo(r0.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                        zzaxpVarZza.zze(-1L);
                    }
                    zzgfe zzgfeVar = this.zzc;
                    if (!zzgfeVar.zzc()) {
                        zzgfeVar.zza();
                    }
                    zzaxw zzaxwVarZzf = zzgfeVar.zzf(((zzaxq) zzaxpVarZza.zzbu()).zzaN(), null);
                    zzaxwVarZzf.zzc(5);
                    zzaxwVarZzf.zzd(2);
                    string = zzgca.zza(((zzaxx) zzaxwVarZzf.zzbu()).zzaN(), true);
                } catch (UnsupportedEncodingException e2) {
                    zzgocVarZza.zzb(e2);
                    string = Integer.toString(7);
                }
                zzgocVarZza.zzc();
                return string;
            } catch (Throwable th) {
                zzgocVarZza.zzb(th);
                throw th;
            }
        } catch (Throwable th2) {
            zzgocVarZza.zzc();
            throw th2;
        }
    }

    zzghi(Context context, zzgoe zzgoeVar, zzgfe zzgfeVar, zzgbf zzgbfVar) {
        this.zza = context;
        this.zzb = zzgoeVar;
        this.zzc = zzgfeVar;
        this.zzd = zzgbfVar.zzb();
    }
}
