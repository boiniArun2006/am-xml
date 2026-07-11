package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzms {
    public static final zzms zza = new zzms(new zzmr());
    public final zzgup zzb;

    @Nullable
    @FloatRange
    public final Double zzc = null;

    @Nullable
    @FloatRange
    public final Double zzd = null;
    public final boolean zze = true;
    public final boolean zzf = true;
    public final boolean zzi = true;
    public final boolean zzg = true;
    public final boolean zzh = true;

    private zzms(zzmr zzmrVar) {
        this.zzb = zzmrVar.zza();
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof zzms) && this.zzb.equals(((zzms) obj).zzb);
    }

    public final int hashCode() {
        zzgup zzgupVar = this.zzb;
        Boolean bool = Boolean.TRUE;
        return Objects.hash(zzgupVar, null, null, bool, bool, bool, bool, bool);
    }
}
