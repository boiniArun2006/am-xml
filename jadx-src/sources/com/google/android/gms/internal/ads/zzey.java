package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzey {
    final /* synthetic */ zzfa zza;
    private final int zzb;

    @Nullable
    private Object zzc;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;

    public final void zza() {
        long jZzt;
        zzfa zzfaVar = this.zza;
        zzbf zzbfVarZzq = zzfaVar.zzd().zzq();
        Object objZzf = zzbfVarZzq.zzg() ? null : zzbfVarZzq.zzf(zzfaVar.zzd().zzr());
        zzbb zzbbVarZzd = zzfaVar.zzd();
        zzbb zzbbVarZzd2 = zzfaVar.zzd();
        zzbb zzbbVarZzd3 = zzfaVar.zzd();
        int iZzy = zzbbVarZzd.zzy();
        int iZzz = zzbbVarZzd2.zzz();
        long jZzu = zzbbVarZzd3.zzu();
        if (objZzf == null || iZzy != -1) {
            jZzt = iZzy != -1 ? zzfaVar.zzd().zzt() : -9223372036854775807L;
        } else {
            zzbfVarZzq.zzo(objZzf, zzfaVar.zzf());
            jZzu -= zzfj.zzp(0L);
            jZzt = zzfj.zzp(zzfaVar.zzf().zzd);
            iZzy = -1;
        }
        boolean zZza = zzfaVar.zzd().zza();
        if (!zZza || jZzt == -9223372036854775807L || jZzu < jZzt) {
            zzfaVar.zzg().zzk(3);
            if (zZza && jZzt != -9223372036854775807L) {
                zzfaVar.zzg().zzi(3, (int) Math.ceil((jZzt - jZzu) / zzfaVar.zzd().zzn().zzb));
            }
            this.zzf = false;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzf && Objects.equals(objZzf, this.zzc) && iZzy == this.zzd && iZzz == this.zze) {
            long j2 = jElapsedRealtime - this.zzg;
            int i2 = this.zzb;
            if (j2 >= i2) {
                zzfaVar.zze().zza(new zzfb(3, i2));
                return;
            }
            return;
        }
        this.zzf = true;
        this.zzg = jElapsedRealtime;
        this.zzc = objZzf;
        this.zzd = iZzy;
        this.zze = iZzz;
        zzfaVar.zzg().zzk(3);
        zzfaVar.zzg().zzi(3, this.zzb);
    }

    public zzey(zzfa zzfaVar, int i2) {
        Objects.requireNonNull(zzfaVar);
        this.zza = zzfaVar;
        this.zzb = i2;
    }
}
