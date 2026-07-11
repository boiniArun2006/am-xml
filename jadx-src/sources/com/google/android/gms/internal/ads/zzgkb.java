package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgkb {
    private final zzatr zza;
    private final long zzb;
    private final long zzc;
    private final String zzd;

    private zzgkb(zzatr zzatrVar, long j2, long j3, String str) {
        this.zza = zzatrVar;
        this.zzb = j2;
        this.zzc = j3;
        this.zzd = str;
    }

    final /* synthetic */ String zzd() {
        return this.zzd;
    }

    final /* synthetic */ String zzb(Map map) {
        return zzgca.zza((byte[]) this.zza.zzd(this.zzb, Optional.of(map)), true);
    }

    final /* synthetic */ void zzc(Map map) throws zzatt, zzatp {
        this.zza.zzd(this.zzc, Optional.of(map));
    }

    static /* synthetic */ zzgkb zza(zzatr zzatrVar, byte[] bArr) throws zzatt, zzatp {
        zzatrVar.zza();
        zzatrVar.zzb(bArr);
        List list = (List) zzatrVar.zzc(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        zzatrVar.zzd(jLongValue, Optional.empty());
        return new zzgkb(zzatrVar, jLongValue2, jLongValue3, "3.825731049.".concat(zzgca.zza(zzatu.zza(), false)));
    }
}
