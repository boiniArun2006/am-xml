package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzev {
    final /* synthetic */ zzfa zza;
    private final int zzb;

    @Nullable
    private Object zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;

    public final void zza() {
        zzfa zzfaVar = this.zza;
        if (zzfaVar.zzd().zzh() != 2 || !zzfaVar.zzd().zzk() || zzfaVar.zzd().zzi() != 0) {
            if (this.zzh) {
                zzfaVar.zzg().zzk(1);
            }
            this.zzh = false;
            return;
        }
        zzbf zzbfVarZzq = zzfaVar.zzd().zzq();
        Object objZzf = zzbfVarZzq.zzg() ? null : zzbfVarZzq.zzf(zzfaVar.zzd().zzr());
        zzbb zzbbVarZzd = zzfaVar.zzd();
        zzbb zzbbVarZzd2 = zzfaVar.zzd();
        zzbb zzbbVarZzd3 = zzfaVar.zzd();
        zzbb zzbbVarZzd4 = zzfaVar.zzd();
        int iZzy = zzbbVarZzd.zzy();
        int iZzz = zzbbVarZzd2.zzz();
        long jZzv = zzbbVarZzd3.zzv();
        long jMax = Math.max(0L, zzfaVar.zzd().zzw() - Math.max(0L, jZzv - zzbbVarZzd4.zzu()));
        if (objZzf != null && iZzy == -1) {
            zzbfVarZzq.zzo(objZzf, zzfaVar.zzf());
            jZzv -= zzfj.zzp(0L);
            iZzy = -1;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzh && Objects.equals(objZzf, this.zzc) && iZzy == this.zzd && iZzz == this.zze && jZzv == this.zzf && jMax == this.zzg) {
            long j2 = jElapsedRealtime - this.zzi;
            int i2 = this.zzb;
            if (j2 >= i2) {
                zzfaVar.zze().zza(new zzfb(1, i2));
                return;
            }
            return;
        }
        this.zzh = true;
        this.zzi = jElapsedRealtime;
        this.zzc = objZzf;
        this.zzd = iZzy;
        this.zze = iZzz;
        this.zzf = jZzv;
        this.zzg = jMax;
        zzfaVar.zzg().zzk(1);
        zzfaVar.zzg().zzi(1, this.zzb);
    }

    public zzev(zzfa zzfaVar, int i2) {
        Objects.requireNonNull(zzfaVar);
        this.zza = zzfaVar;
        this.zzb = i2;
    }
}
