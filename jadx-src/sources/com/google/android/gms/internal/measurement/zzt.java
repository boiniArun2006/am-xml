package com.google.android.gms.internal.measurement;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzt extends zzai {
    private final zzr zza;

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao zza(zzg zzgVar, List list) {
        return zzao.zzf;
    }

    final /* synthetic */ zzr zzb() {
        return this.zza;
    }

    public zzt(zzr zzrVar) {
        super("internal.logger");
        this.zza = zzrVar;
        this.zze.put(CreativeInfo.f62442f, new zzs(this, false, true));
        this.zze.put("silent", new zzp(this, "silent"));
        ((zzai) this.zze.get("silent")).zzm(CreativeInfo.f62442f, new zzs(this, true, true));
        this.zze.put("unmonitored", new zzq(this, "unmonitored"));
        ((zzai) this.zze.get("unmonitored")).zzm(CreativeInfo.f62442f, new zzs(this, false, false));
    }
}
