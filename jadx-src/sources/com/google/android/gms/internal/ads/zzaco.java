package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
public final class zzaco implements zzbt {
    private final Context zza;
    private final zzbs zzb;
    private final SparseArray zzc;
    private final boolean zzd;
    private final zzadr zze;
    private final zzdn zzf;
    private final CopyOnWriteArraySet zzg;
    private final long zzh;
    private final zzact zzi;
    private zzff zzj = new zzff(10);
    private zzv zzk;
    private zzdx zzl;

    @Nullable
    private Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    final /* synthetic */ void zzA(long j2) {
        this.zzq = j2;
    }

    public final void zza(int i2) {
        this.zzr = 1;
    }

    final /* synthetic */ void zzh() {
        this.zzn--;
    }

    final /* synthetic */ boolean zzs() {
        int i2 = this.zzr;
        return i2 != -1 && i2 == 0;
    }

    final /* synthetic */ boolean zzt() {
        return this.zzd;
    }

    final /* synthetic */ long zzu() {
        return this.zzh;
    }

    final /* synthetic */ zzact zzv() {
        return this.zzi;
    }

    final /* synthetic */ zzff zzw() {
        return this.zzj;
    }

    final /* synthetic */ void zzx(zzff zzffVar) {
        this.zzj = zzffVar;
    }

    final /* synthetic */ long zzy() {
        return this.zzp;
    }

    final /* synthetic */ long zzz() {
        return this.zzq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzi zzC(@Nullable zzi zziVar) {
        return (zziVar == null || !zziVar.zzf()) ? zzi.zza : zziVar;
    }

    public final zzadr zzb(int i2) {
        SparseArray sparseArray = this.zzc;
        if (zzfj.zza(sparseArray, 0)) {
            return (zzadr) sparseArray.get(0);
        }
        zzaci zzaciVar = new zzaci(this, this.zza, 0);
        this.zzg.add(zzaciVar);
        sparseArray.put(0, zzaciVar);
        return zzaciVar;
    }

    public final void zzc(Surface surface, zzes zzesVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzes) this.zzm.second).equals(zzesVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzesVar);
        zzesVar.zza();
        zzesVar.zzb();
    }

    public final void zzd() {
        zzes zzesVar = zzes.zza;
        zzesVar.zza();
        zzesVar.zzb();
        this.zzm = null;
    }

    public final void zze() {
        this.zze.zza();
    }

    public final void zzf() {
        this.zze.zzb();
    }

    public final void zzg() {
        if (this.zzo == 2) {
            return;
        }
        zzdx zzdxVar = this.zzl;
        if (zzdxVar != null) {
            zzdxVar.zzm(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062 A[Catch: zzdu -> 0x0031, TRY_LEAVE, TryCatch #0 {zzdu -> 0x0031, blocks: (B:7:0x0010, B:9:0x0015, B:11:0x001b, B:14:0x0023, B:18:0x0034, B:20:0x003a, B:23:0x0041, B:28:0x0062), top: B:38:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ boolean zzi(zzv zzvVar, int i2) throws zzadq {
        zzgrc.zzi(this.zzo == 0);
        zzi zziVarZzC = zzC(zzvVar.zzE);
        try {
            int i3 = zziVarZzC.zzd;
            if (i3 != 7) {
                if (zzdv.zzc(i3) && Build.VERSION.SDK_INT >= 29) {
                    Object[] objArr = {Integer.valueOf(i3)};
                    String str = zzfj.zza;
                    zzee.zzc("PlaybackVidGraphWrapper", String.format(Locale.US, "Color transfer %d is not supported. Falling back to OpenGl tone mapping.", objArr));
                    zziVarZzC = zzi.zza;
                } else if (i3 != 2 || i3 == 10) {
                    zziVarZzC = zzi.zza;
                }
            } else if (Build.VERSION.SDK_INT >= 34 || !zzdv.zzd()) {
                i3 = 7;
                if (zzdv.zzc(i3)) {
                    if (i3 != 2) {
                        zziVarZzC = zzi.zza;
                    }
                }
            } else {
                zzh zzhVarZzd = zziVarZzC.zzd();
                zzhVarZzd.zzc(6);
                zziVarZzC = zzhVarZzd.zzg();
            }
            zzi zziVar = zziVarZzC;
            zzdn zzdnVar = this.zzf;
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            final zzdx zzdxVarZzd = zzdnVar.zzd(looperMyLooper, null);
            this.zzl = zzdxVarZzd;
            try {
                zzbs zzbsVar = this.zzb;
                Context context = this.zza;
                zzl zzlVar = zzl.zzb;
                Objects.requireNonNull(zzdxVarZzd);
                zzbsVar.zza(context, zziVar, zzlVar, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzach
                    @Override // java.util.concurrent.Executor
                    public final /* synthetic */ void execute(Runnable runnable) {
                        zzdxVarZzd.zzn(runnable);
                    }
                }, 0L, false);
                throw null;
            } catch (zzbo e2) {
                throw new zzadq(e2, zzvVar);
            }
        } catch (zzdu e3) {
            throw new zzadq(e3, zzvVar);
        }
    }

    final /* synthetic */ boolean zzj(boolean z2) {
        return this.zze.zzh(false);
    }

    final /* synthetic */ void zzk() {
        this.zze.zzi();
    }

    final /* synthetic */ void zzl(long j2, long j3) throws zzadq {
        this.zze.zzv(j2, j3);
    }

    final /* synthetic */ void zzm(boolean z2) {
        if (this.zzo == 1) {
            this.zzn++;
            zzadr zzadrVar = this.zze;
            zzadrVar.zzg(z2);
            while (this.zzj.zzc() > 1) {
                this.zzj.zzd();
            }
            if (this.zzj.zzc() == 1) {
                zzacn zzacnVar = (zzacn) this.zzj.zzd();
                zzacnVar.getClass();
                zzadrVar.zzs(1, this.zzk, zzacnVar.zza, zzacnVar.zzb, zzguf.zzi());
            }
            this.zzp = -9223372036854775807L;
            if (z2) {
                this.zzq = -9223372036854775807L;
            }
            zzdx zzdxVar = this.zzl;
            zzdxVar.getClass();
            zzdxVar.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzacj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            });
        }
    }

    final /* synthetic */ void zzn(boolean z2) {
        this.zze.zzw(z2);
    }

    final /* synthetic */ void zzo() {
        this.zze.zzt();
    }

    final /* synthetic */ void zzp(zzacp zzacpVar) {
        this.zze.zzl(zzacpVar);
    }

    final /* synthetic */ void zzq(float f3) {
        this.zzi.zzc(f3);
        this.zze.zzm(f3);
    }

    final /* synthetic */ void zzr(int i2) {
        this.zze.zzr(i2);
    }

    /* synthetic */ zzaco(zzacg zzacgVar, byte[] bArr) {
        long j2;
        this.zza = zzacgVar.zze();
        zzbs zzbsVarZzg = zzacgVar.zzg();
        zzbsVarZzg.getClass();
        this.zzb = zzbsVarZzg;
        this.zzc = new SparseArray();
        zzguf.zzi();
        this.zzd = zzacgVar.zzh();
        zzdn zzdnVarZzi = zzacgVar.zzi();
        this.zzf = zzdnVarZzi;
        if (zzacgVar.zzj() != -9223372036854775807L) {
            j2 = -zzacgVar.zzj();
        } else {
            j2 = -9223372036854775807L;
        }
        this.zzh = j2;
        zzact zzactVarZzk = zzacgVar.zzk();
        this.zzi = zzactVarZzk;
        this.zze = new zzabt(zzacgVar.zzf(), zzactVarZzk, zzdnVarZzi);
        new zzacf(this);
        this.zzg = new CopyOnWriteArraySet();
        this.zzk = new zzt().zzM();
        this.zzp = -9223372036854775807L;
        this.zzq = -9223372036854775807L;
        this.zzr = -1;
        this.zzo = 0;
    }
}
