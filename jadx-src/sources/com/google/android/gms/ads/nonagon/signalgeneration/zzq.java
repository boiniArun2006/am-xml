package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzq {

    @Nullable
    private final QueryInfo zza;
    private final String zzb;
    private final long zzc;
    private final int zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);

    @Nullable
    public final QueryInfo zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzd;
    }

    public final boolean zze() {
        return this.zze.get();
    }

    public final void zzf() {
        this.zze.set(true);
    }

    public zzq(@Nullable QueryInfo queryInfo, String str, long j2, int i2) {
        this.zza = queryInfo;
        this.zzb = str;
        this.zzc = j2;
        this.zzd = i2;
    }

    public final boolean zzc() {
        if (this.zzc <= com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()) {
            return true;
        }
        return false;
    }
}
