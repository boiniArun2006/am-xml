package com.google.android.gms.internal.ads;

import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzent {
    private final zzfkd zza;
    private final zzdvm zzb;
    private final zzdxz zzc;

    public zzent(zzfkd zzfkdVar, zzdvm zzdvmVar, zzdxz zzdxzVar) {
        this.zza = zzfkdVar;
        this.zzb = zzdvmVar;
        this.zzc = zzdxzVar;
    }

    public final void zza(zzfiu zzfiuVar, zzfir zzfirVar, int i2, zzekk zzekkVar, long j2) {
        zzdvl zzdvlVarZzc;
        zzdxy zzdxyVarZza = this.zzc.zza();
        zzdxyVarZza.zza(zzfiuVar);
        zzdxyVarZza.zzb(zzfirVar);
        zzdxyVarZza.zzc(FileUploadManager.f61572j, "adapter_status");
        zzdxyVarZza.zzc("adapter_l", String.valueOf(j2));
        zzdxyVarZza.zzc("sc", Integer.toString(i2));
        if (zzekkVar != null) {
            zzdxyVarZza.zzc("arec", Integer.toString(zzekkVar.zzb().zza));
            String strZza = this.zza.zza(zzekkVar.getMessage());
            if (strZza != null) {
                zzdxyVarZza.zzc("areec", strZza);
            }
        }
        zzdvm zzdvmVar = this.zzb;
        Iterator it = zzfirVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzdvlVarZzc = null;
                break;
            } else {
                zzdvlVarZzc = zzdvmVar.zzc((String) it.next());
                if (zzdvlVarZzc != null) {
                    break;
                }
            }
        }
        if (zzdvlVarZzc != null) {
            zzdxyVarZza.zzc("ancn", zzdvlVarZzc.zza);
            zzbwh zzbwhVar = zzdvlVarZzc.zzb;
            if (zzbwhVar != null) {
                zzdxyVarZza.zzc("adapter_v", zzbwhVar.toString());
            }
            zzbwh zzbwhVar2 = zzdvlVarZzc.zzc;
            if (zzbwhVar2 != null) {
                zzdxyVarZza.zzc("adapter_sv", zzbwhVar2.toString());
            }
        }
        zzdxyVarZza.zzd();
    }
}
