package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfrd extends com.google.android.gms.ads.internal.client.zzcj {
    private final zzfrj zza;
    private final zzfqw zzb;

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zzl(zzbtt zzbttVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zze(List list, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        this.zza.zza(list, zzceVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzf(String str) {
        return this.zza.zzb(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    @Nullable
    public final zzcaz zzg(String str) {
        return this.zza.zzc(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzh(String str) {
        return this.zza.zzd(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    @Nullable
    public final zzbex zzi(String str) {
        return this.zza.zze(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzj(String str) {
        return this.zza.zzf(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzbx zzk(String str) {
        return this.zza.zzg(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzm(String str, com.google.android.gms.ads.internal.client.zzft zzftVar, @Nullable com.google.android.gms.ads.internal.client.zzch zzchVar) {
        return this.zzb.zza(str, zzftVar, zzchVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzbx zzo(String str) {
        return this.zzb.zze(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    @Nullable
    public final zzbex zzp(String str) {
        return this.zzb.zzd(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    @Nullable
    public final zzcaz zzq(String str) {
        return this.zzb.zzc(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final Bundle zzs(int i2) {
        Map mapZzh = this.zzb.zzh(i2);
        Bundle bundle = new Bundle();
        for (Map.Entry entry : mapZzh.entrySet()) {
            bundle.putByteArray((String) entry.getKey(), SafeParcelableSerializer.serializeToBytes((com.google.android.gms.ads.internal.client.zzft) entry.getValue()));
        }
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zzv(int i2) {
        this.zzb.zzj(i2);
    }

    zzfrd(zzfrj zzfrjVar, zzfqw zzfqwVar) {
        this.zza = zzfrjVar;
        this.zzb = zzfqwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzn(int i2, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i2);
        if (adFormat == null) {
            return false;
        }
        return this.zzb.zzb(adFormat, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzft zzr(int i2, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i2);
        if (adFormat == null) {
            return null;
        }
        return this.zzb.zzf(adFormat, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final int zzt(int i2, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i2);
        if (adFormat == null) {
            return 0;
        }
        return this.zzb.zzg(adFormat, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzu(int i2, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i2);
        if (adFormat == null) {
            return false;
        }
        return this.zzb.zzi(adFormat, str);
    }
}
