package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzmd {
    private static final zzwk zzu = new zzwk(new Object(), -1);
    public final zzbf zza;
    public final zzwk zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;

    @Nullable
    public final zziw zzf;
    public final boolean zzg;
    public final zzyn zzh;
    public final zzaak zzi;
    public final List zzj;
    public final zzwk zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzav zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzmd(zzbf zzbfVar, zzwk zzwkVar, long j2, long j3, int i2, @Nullable zziw zziwVar, boolean z2, zzyn zzynVar, zzaak zzaakVar, List list, zzwk zzwkVar2, boolean z3, int i3, int i5, zzav zzavVar, long j4, long j5, long j6, long j7, boolean z4) {
        this.zza = zzbfVar;
        this.zzb = zzwkVar;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = i2;
        this.zzf = zziwVar;
        this.zzg = z2;
        this.zzh = zzynVar;
        this.zzi = zzaakVar;
        this.zzj = list;
        this.zzk = zzwkVar2;
        this.zzl = z3;
        this.zzm = i3;
        this.zzn = i5;
        this.zzo = zzavVar;
        this.zzq = j4;
        this.zzr = j5;
        this.zzs = j6;
        this.zzt = j7;
    }

    public static zzwk zzb() {
        return zzu;
    }

    @CheckResult
    public final zzmd zzd(zzbf zzbfVar) {
        return new zzmd(zzbfVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzmd zze(int i2) {
        return new zzmd(this.zza, this.zzb, this.zzc, this.zzd, i2, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzmd zzf(@Nullable zziw zziwVar) {
        return new zzmd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zziwVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzmd zzg(boolean z2) {
        return new zzmd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, z2, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzmd zzh(zzwk zzwkVar) {
        return new zzmd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzwkVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzmd zzi(boolean z2, int i2, int i3) {
        return new zzmd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z2, i2, i3, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzj() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }

    public static zzmd zza(zzaak zzaakVar) {
        zzbf zzbfVar = zzbf.zza;
        zzwk zzwkVar = zzu;
        return new zzmd(zzbfVar, zzwkVar, -9223372036854775807L, 0L, 1, null, false, zzyn.zza, zzaakVar, zzguf.zzi(), zzwkVar, false, 1, 0, zzav.zza, 0L, 0L, 0L, 0L, false);
    }

    @CheckResult
    public final zzmd zzc(zzwk zzwkVar, long j2, long j3, long j4, long j5, zzyn zzynVar, zzaak zzaakVar, List list) {
        zzwk zzwkVar2 = this.zzk;
        boolean z2 = this.zzl;
        int i2 = this.zzm;
        int i3 = this.zzn;
        zzav zzavVar = this.zzo;
        long j6 = this.zzq;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new zzmd(this.zza, zzwkVar, j3, j4, this.zze, this.zzf, this.zzg, zzynVar, zzaakVar, list, zzwkVar2, z2, i2, i3, zzavVar, j6, j5, j2, jElapsedRealtime, false);
    }
}
