package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzll {
    public final long zza;
    public final float zzb;
    public final long zzc;

    /* synthetic */ zzll(zzlk zzlkVar, byte[] bArr) {
        this.zza = zzlkVar.zze();
        this.zzb = zzlkVar.zzf();
        this.zzc = zzlkVar.zzg();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzll)) {
            return false;
        }
        zzll zzllVar = (zzll) obj;
        return this.zza == zzllVar.zza && this.zzb == zzllVar.zzb && this.zzc == zzllVar.zzc;
    }

    public final zzlk zza() {
        return new zzlk(this, null);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc));
    }
}
