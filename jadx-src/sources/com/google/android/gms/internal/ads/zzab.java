package com.google.android.gms.internal.ads;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class zzab {

    @IntRange
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final boolean zze;
    public final boolean zzf;

    /* synthetic */ zzab(zzaa zzaaVar, byte[] bArr) {
        this(zzaaVar);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzab)) {
            return false;
        }
        long j2 = ((zzab) obj).zza;
        return true;
    }

    public final int hashCode() {
        return ((int) (-9223372034707292160L)) * 923521;
    }

    static {
        new zzab(new zzaa());
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    private zzab(zzaa zzaaVar) {
        String str = zzfj.zza;
        this.zza = 0L;
        this.zzb = Long.MIN_VALUE;
        this.zzc = false;
        this.zzd = false;
        this.zze = false;
        this.zzf = false;
    }
}
