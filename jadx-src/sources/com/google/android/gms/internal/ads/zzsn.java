package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzsn implements zzqa {
    final /* synthetic */ zzsw zza;
    private final zzql zzb;

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zza(long j2) {
        zzsw zzswVar = this.zza;
        if (equals(zzswVar.zzI()) && zzswVar.zzJ() != null) {
            ((zzsz) zzswVar.zzJ()).zza.zzaw().zzd(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzb() {
        zzmk zzmkVarZzaY;
        zzsw zzswVar = this.zza;
        if (equals(zzswVar.zzI()) && zzswVar.zzJ() != null && zzswVar.zzN() && (zzmkVarZzaY = ((zzsz) zzswVar.zzJ()).zza.zzaY()) != null) {
            zzmkVarZzaY.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzc() {
        zzsw zzswVar = this.zza;
        if (equals(zzswVar.zzI())) {
            zzswVar.zzM(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzd() {
        long jZzr;
        zzsw zzswVar = this.zza;
        if (equals(zzswVar.zzI()) && zzswVar.zzJ() != null) {
            if (zzswVar.zzK().zzj() != -1) {
                long jZzj = zzswVar.zzK().zzk().zze / zzswVar.zzK().zzj();
                zzqc zzqcVarZzL = zzswVar.zzL();
                zzqcVarZzL.getClass();
                jZzr = zzfj.zzr(jZzj, zzqcVarZzL.zzi());
            } else {
                jZzr = -9223372036854775807L;
            }
            ((zzsz) zzswVar.zzJ()).zza.zzaw().zze(zzswVar.zzK().zzk().zze, zzfj.zzp(jZzr), SystemClock.elapsedRealtime() - zzswVar.zzO());
        }
    }

    /* synthetic */ zzsn(zzsw zzswVar, zzql zzqlVar, byte[] bArr) {
        Objects.requireNonNull(zzswVar);
        this.zza = zzswVar;
        this.zzb = zzqlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zze() {
        zzsw.zza.getAndDecrement();
        zzsw zzswVar = this.zza;
        if (zzswVar.zzJ() != null) {
            zzql zzqlVar = this.zzb;
            ((zzsz) zzswVar.zzJ()).zza.zzaw().zzl(new zzrd(zzqlVar.zza, zzqlVar.zzb, zzqlVar.zzc, false, false, zzqlVar.zze));
        }
    }
}
