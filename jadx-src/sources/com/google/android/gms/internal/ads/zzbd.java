package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzbd {

    @Nullable
    public Object zza;

    @Nullable
    public Object zzb;
    public int zzc;
    public long zzd;
    public long zze;
    public boolean zzf;
    public zzc zzg = zzc.zza;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbd.class.equals(obj.getClass())) {
            zzbd zzbdVar = (zzbd) obj;
            if (Objects.equals(this.zza, zzbdVar.zza) && Objects.equals(this.zzb, zzbdVar.zzb) && this.zzc == zzbdVar.zzc && this.zzd == zzbdVar.zzd && this.zzf == zzbdVar.zzf && Objects.equals(this.zzg, zzbdVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final zzbd zza(@Nullable Object obj, @Nullable Object obj2, int i2, long j2, long j3, zzc zzcVar, boolean z2) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = i2;
        this.zzd = j2;
        this.zze = 0L;
        this.zzg = zzcVar;
        this.zzf = z2;
        return this;
    }

    public final int zzf(long j2) {
        return -1;
    }

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final int hashCode() {
        Object obj = this.zza;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzb;
        int iHashCode2 = ((((iHashCode + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.zzc;
        long j2 = this.zzd;
        return (((((iHashCode2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 961) + (this.zzf ? 1 : 0)) * 31) + this.zzg.hashCode();
    }

    public final int zzb() {
        int i2 = this.zzg.zzb;
        return 0;
    }

    public final long zzc(int i2) {
        long j2 = this.zzg.zza(i2).zza;
        return 0L;
    }

    public final int zzd(int i2) {
        return this.zzg.zza(i2).zza(-1);
    }

    public final int zze(long j2) {
        this.zzg.zzb(-1);
        return -1;
    }

    public final int zzg(int i2) {
        return this.zzg.zza(i2).zzb;
    }

    public final long zzh(int i2, int i3) {
        zza zzaVarZza = this.zzg.zza(i2);
        if (zzaVarZza.zzb != -1) {
            return zzaVarZza.zzf[i3];
        }
        return -9223372036854775807L;
    }

    public final long zzj() {
        long j2 = this.zzg.zzc;
        return 0L;
    }

    public final boolean zzk(int i2) {
        boolean z2 = this.zzg.zza(i2).zzj;
        return false;
    }

    public final boolean zzi(int i2) {
        zzb();
        if (i2 == -1) {
            this.zzg.zzb(-1);
            return false;
        }
        return false;
    }
}
