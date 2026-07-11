package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.MediaPeriodQueue;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzlq {
    private final zzmx zzc;
    private final zzdx zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzjg zzh;

    @Nullable
    private zzln zzi;

    @Nullable
    private zzln zzj;

    @Nullable
    private zzln zzk;

    @Nullable
    private zzln zzl;

    @Nullable
    private zzln zzm;
    private int zzn;

    @Nullable
    private Object zzo;
    private long zzp;
    private final zzky zzr;
    private final zzbd zza = new zzbd();
    private final zzbe zzb = new zzbe();
    private List zzq = new ArrayList();

    private final long zzC(Object obj) {
        for (int i2 = 0; i2 < this.zzq.size(); i2++) {
            zzln zzlnVar = (zzln) this.zzq.get(i2);
            if (zzlnVar.zzb.equals(obj)) {
                return zzlnVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private static final boolean zzL(zzwk zzwkVar) {
        return !zzwkVar.zzb() && zzwkVar.zze == -1;
    }

    public final boolean zzd(zzwi zzwiVar) {
        zzln zzlnVar = this.zzl;
        return zzlnVar != null && zzlnVar.zza == zzwiVar;
    }

    public final boolean zze(zzwi zzwiVar) {
        zzln zzlnVar = this.zzm;
        return zzlnVar != null && zzlnVar.zza == zzwiVar;
    }

    @Nullable
    public final zzln zzk() {
        return this.zzl;
    }

    @Nullable
    public final zzln zzl() {
        return this.zzm;
    }

    @Nullable
    public final zzln zzm() {
        return this.zzi;
    }

    @Nullable
    public final zzln zzn() {
        return this.zzj;
    }

    @Nullable
    public final zzln zzo() {
        return this.zzk;
    }

    @Nullable
    public final zzln zzu(zzwi zzwiVar) {
        for (int i2 = 0; i2 < this.zzq.size(); i2++) {
            zzln zzlnVar = (zzln) this.zzq.get(i2);
            if (zzlnVar.zza == zzwiVar) {
                return zzlnVar;
            }
        }
        return null;
    }

    private final void zzB() {
        int i2 = zzguf.zzd;
        final zzguc zzgucVar = new zzguc();
        for (zzln zzlnVarZzp = this.zzi; zzlnVarZzp != null; zzlnVarZzp = zzlnVarZzp.zzp()) {
            zzgucVar.zzf(zzlnVarZzp.zzg.zza);
        }
        zzln zzlnVar = this.zzj;
        final zzwk zzwkVar = zzlnVar == null ? null : zzlnVar.zzg.zza;
        this.zzd.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgucVar, zzwkVar);
            }
        });
    }

    private final int zzD(zzbf zzbfVar) {
        zzbf zzbfVar2;
        zzln zzlnVarZzp = this.zzi;
        if (zzlnVarZzp == null) {
            return 0;
        }
        int iZze = zzbfVar.zze(zzlnVarZzp.zzb);
        while (true) {
            zzbfVar2 = zzbfVar;
            iZze = zzbfVar2.zzl(iZze, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzlnVarZzp.getClass();
                if (zzlnVarZzp.zzp() == null || zzlnVarZzp.zzg.zzh) {
                    break;
                }
                zzlnVarZzp = zzlnVarZzp.zzp();
            }
            zzln zzlnVarZzp2 = zzlnVarZzp.zzp();
            if (iZze == -1 || zzlnVarZzp2 == null || zzbfVar2.zze(zzlnVarZzp2.zzb) != iZze) {
                break;
            }
            zzlnVarZzp = zzlnVarZzp2;
            zzbfVar = zzbfVar2;
        }
        int iZzs = zzs(zzlnVarZzp);
        zzlnVarZzp.zzg = zzx(zzbfVar2, zzlnVarZzp.zzg);
        return iZzs;
    }

    @Nullable
    private final zzlo zzE(zzbf zzbfVar, zzln zzlnVar, long j2) {
        zzbf zzbfVar2;
        long j3;
        zzbf zzbfVar3;
        zzbd zzbdVar;
        zzbe zzbeVar;
        Object obj;
        long j4;
        long j5;
        long j6;
        zzlo zzloVar = zzlnVar.zzg;
        long jZza = zzlnVar.zza();
        long j7 = zzloVar.zze;
        long j9 = (jZza + j7) - j2;
        if (!zzloVar.zzh) {
            zzwk zzwkVar = zzloVar.zza;
            Object obj2 = zzwkVar.zza;
            zzbd zzbdVar2 = this.zza;
            zzbfVar.zzo(obj2, zzbdVar2);
            if (!zzwkVar.zzb()) {
                int i2 = zzwkVar.zze;
                if (i2 != -1) {
                    zzbdVar2.zzi(i2);
                }
                int iZzd = zzbdVar2.zzd(i2);
                zzbdVar2.zzk(i2);
                if (iZzd != zzbdVar2.zzg(i2)) {
                    return zzG(zzbfVar, obj2, i2, iZzd, j7, zzwkVar.zzd, false);
                }
                zzK(zzbfVar, obj2, i2);
                return zzH(zzbfVar, obj2, 0L, j7, zzwkVar.zzd, false);
            }
            int i3 = zzwkVar.zzb;
            if (zzbdVar2.zzg(i3) == -1) {
                return null;
            }
            int iZza = zzbdVar2.zzg.zza(i3).zza(zzwkVar.zzc);
            if (iZza < 0) {
                return zzG(zzbfVar, obj2, i3, iZza, zzloVar.zzc, zzwkVar.zzd, false);
            }
            long jLongValue = zzloVar.zzc;
            if (jLongValue == -9223372036854775807L) {
                Pair pairZzn = zzbfVar.zzn(this.zzb, zzbdVar2, zzbdVar2.zzc, -9223372036854775807L, Math.max(0L, j9));
                zzbfVar2 = zzbfVar;
                if (pairZzn == null) {
                    return null;
                }
                jLongValue = ((Long) pairZzn.second).longValue();
                j3 = -9223372036854775807L;
            } else {
                zzbfVar2 = zzbfVar;
                j3 = jLongValue;
            }
            zzK(zzbfVar2, obj2, i3);
            return zzH(zzbfVar2, obj2, Math.max(0L, jLongValue), j3, zzwkVar.zzd, false);
        }
        zzwk zzwkVar2 = zzloVar.zza;
        Object obj3 = zzwkVar2.zza;
        int iZze = zzbfVar.zze(obj3);
        int i5 = this.zzf;
        boolean z2 = this.zzg;
        zzbe zzbeVar2 = this.zzb;
        zzbd zzbdVar3 = this.zza;
        long j10 = 0;
        int iZzl = zzbfVar.zzl(iZze, zzbdVar3, zzbeVar2, i5, z2);
        if (iZzl == -1) {
            return null;
        }
        int i7 = zzbfVar.zzd(iZzl, zzbdVar3, true).zzc;
        Object obj4 = zzbdVar3.zzb;
        obj4.getClass();
        long j11 = zzwkVar2.zzd;
        if (zzbfVar.zzb(i7, zzbeVar2, 0L).zzn == iZzl) {
            Pair pairZzn2 = zzbfVar.zzn(zzbeVar2, zzbdVar3, i7, -9223372036854775807L, Math.max(0L, j9));
            if (pairZzn2 == null) {
                return null;
            }
            Object obj5 = pairZzn2.first;
            long jLongValue2 = ((Long) pairZzn2.second).longValue();
            zzln zzlnVarZzp = zzlnVar.zzp();
            if (zzlnVarZzp == null || !zzlnVarZzp.zzb.equals(obj5)) {
                long jZzC = zzC(obj5);
                if (jZzC == -1) {
                    jZzC = this.zze;
                    this.zze = 1 + jZzC;
                }
                j6 = jZzC;
            } else {
                j6 = zzlnVarZzp.zzg.zza.zzd;
            }
            zzbfVar3 = zzbfVar;
            zzbeVar = zzbeVar2;
            zzbdVar = zzbdVar3;
            j4 = jLongValue2;
            obj = obj5;
            j5 = j6;
            j10 = -9223372036854775807L;
        } else {
            zzbfVar3 = zzbfVar;
            zzbdVar = zzbdVar3;
            zzbeVar = zzbeVar2;
            obj = obj4;
            j4 = 0;
            j5 = j11;
        }
        zzwk zzwkVarZzA = zzA(zzbfVar3, obj, j4, j5, zzbeVar, zzbdVar);
        long j12 = j4;
        zzbd zzbdVar4 = zzbdVar;
        if (j10 != -9223372036854775807L && zzloVar.zzc != -9223372036854775807L) {
            zzbfVar3.zzo(obj3, zzbdVar4).zzb();
            int i8 = zzbdVar4.zzg.zzd;
        }
        return zzF(zzbfVar3, zzwkVarZzA, j10, j12);
    }

    private final zzlo zzF(zzbf zzbfVar, zzwk zzwkVar, long j2, long j3) {
        Object obj = zzwkVar.zza;
        zzbfVar.zzo(obj, this.zza);
        return zzwkVar.zzb() ? zzG(zzbfVar, obj, zzwkVar.zzb, zzwkVar.zzc, j2, zzwkVar.zzd, false) : zzH(zzbfVar, obj, j3, j2, zzwkVar.zzd, false);
    }

    private final zzlo zzG(zzbf zzbfVar, Object obj, int i2, int i3, long j2, long j3, boolean z2) {
        zzwk zzwkVar = new zzwk(obj, i2, i3, j3);
        Object obj2 = zzwkVar.zza;
        int i5 = zzwkVar.zzb;
        int i7 = zzwkVar.zzc;
        zzbd zzbdVar = this.zza;
        long jZzh = zzbfVar.zzo(obj2, zzbdVar).zzh(i5, i7);
        if (i3 == zzbdVar.zzd(i2)) {
            zzbdVar.zzj();
        }
        zzbdVar.zzk(i5);
        long jMax = 0;
        if (jZzh != -9223372036854775807L && jZzh <= 0) {
            jMax = Math.max(0L, (-1) + jZzh);
        }
        return new zzlo(zzwkVar, jMax, j2, -9223372036854775807L, jZzh, false, false, false, false, false);
    }

    private final zzlo zzH(zzbf zzbfVar, Object obj, long j2, long j3, long j4, boolean z2) {
        long j5;
        long j6;
        long j7;
        long jMax = j2;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        int iZzf = zzbdVar.zzf(jMax);
        if (iZzf == -1) {
            zzbdVar.zzb();
        } else {
            zzbdVar.zzk(iZzf);
        }
        zzwk zzwkVar = new zzwk(obj, j4, iZzf);
        boolean zZzL = zzL(zzwkVar);
        boolean zZzI = zzI(zzbfVar, zzwkVar);
        boolean zZzJ = zzJ(zzbfVar, zzwkVar, zZzL);
        if (iZzf != -1) {
            zzbdVar.zzk(iZzf);
        }
        if (iZzf != -1) {
            zzbdVar.zzi(iZzf);
        }
        if (iZzf != -1) {
            zzbdVar.zzc(iZzf);
            j5 = 0;
        } else {
            j5 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L) {
            j7 = j5;
            j6 = j7;
        } else {
            j6 = zzbdVar.zzd;
            j7 = -9223372036854775807L;
        }
        if (j6 != -9223372036854775807L && jMax >= j6) {
            jMax = Math.max(0L, j6 - 1);
        }
        return new zzlo(zzwkVar, jMax, j3, j7, j6, false, false, zZzL, zZzI, zZzJ);
    }

    private final boolean zzJ(zzbf zzbfVar, zzwk zzwkVar, boolean z2) {
        int iZze = zzbfVar.zze(zzwkVar.zza);
        zzbd zzbdVar = this.zza;
        int i2 = zzbfVar.zzd(iZze, zzbdVar, false).zzc;
        zzbe zzbeVar = this.zzb;
        return !zzbfVar.zzb(i2, zzbeVar, 0L).zzi && zzbfVar.zzl(iZze, zzbdVar, zzbeVar, this.zzf, this.zzg) == -1 && z2;
    }

    private final long zzK(zzbf zzbfVar, Object obj, int i2) {
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        zzbdVar.zzc(i2);
        long j2 = zzbdVar.zzg.zza(i2).zzi;
        return 0L;
    }

    public final int zza(zzbf zzbfVar, int i2) {
        this.zzf = i2;
        return zzD(zzbfVar);
    }

    public final int zzb(zzbf zzbfVar, boolean z2) {
        this.zzg = z2;
        return zzD(zzbfVar);
    }

    public final void zzc(zzbf zzbfVar, zzjg zzjgVar) {
        this.zzh = zzjgVar;
        long j2 = zzjgVar.zzb;
        zzj();
    }

    public final void zzf(long j2) {
        zzln zzlnVar = this.zzl;
        if (zzlnVar != null) {
            zzlnVar.zzi(j2);
        }
    }

    public final boolean zzg() {
        zzln zzlnVar = this.zzl;
        if (zzlnVar != null) {
            return !zzlnVar.zzg.zzj && zzlnVar.zzd() && this.zzl.zzg.zze != -9223372036854775807L && this.zzn < 100;
        }
        return true;
    }

    @Nullable
    public final zzlo zzh(long j2, zzmd zzmdVar) {
        zzln zzlnVar = this.zzl;
        return zzlnVar == null ? zzF(zzmdVar.zza, zzmdVar.zzb, zzmdVar.zzc, zzmdVar.zzs) : zzE(zzmdVar.zza, zzlnVar, j2);
    }

    public final zzln zzi(zzlo zzloVar) {
        zzln zzlnVarZza;
        zzln zzlnVar = this.zzl;
        long jZza = zzlnVar == null ? MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US : (zzlnVar.zza() + zzlnVar.zzg.zze) - zzloVar.zzb;
        int i2 = 0;
        while (true) {
            if (i2 >= this.zzq.size()) {
                zzlnVarZza = null;
                break;
            }
            zzlo zzloVar2 = ((zzln) this.zzq.get(i2)).zzg;
            long j2 = zzloVar2.zze;
            long j3 = zzloVar.zze;
            if ((j2 == -9223372036854775807L || j2 == j3) && zzloVar2.zzb == zzloVar.zzb && zzloVar2.zza.equals(zzloVar.zza)) {
                zzlnVarZza = (zzln) this.zzq.remove(i2);
                break;
            }
            i2++;
        }
        if (zzlnVarZza == null) {
            zzlnVarZza = this.zzr.zza(zzloVar, jZza);
        } else {
            zzlnVarZza.zzg = zzloVar;
            zzlnVarZza.zzb(jZza);
        }
        zzln zzlnVar2 = this.zzl;
        if (zzlnVar2 != null) {
            zzlnVar2.zzo(zzlnVarZza);
        } else {
            this.zzi = zzlnVarZza;
            this.zzj = zzlnVarZza;
            this.zzk = zzlnVarZza;
        }
        this.zzo = null;
        this.zzl = zzlnVarZza;
        this.zzn++;
        zzB();
        return zzlnVarZza;
    }

    public final void zzj() {
        if (this.zzq.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.zzq.size(); i2++) {
            ((zzln) this.zzq.get(i2)).zzn();
        }
        this.zzq = arrayList;
        this.zzm = null;
        zzt();
    }

    public final zzln zzp() {
        zzln zzlnVar = this.zzk;
        zzln zzlnVar2 = this.zzj;
        if (zzlnVar == zzlnVar2) {
            zzlnVar2.getClass();
            this.zzk = zzlnVar2.zzp();
        }
        zzlnVar2.getClass();
        this.zzj = zzlnVar2.zzp();
        zzB();
        zzln zzlnVar3 = this.zzj;
        zzlnVar3.getClass();
        return zzlnVar3;
    }

    public final zzln zzq() {
        zzln zzlnVar = this.zzk;
        zzlnVar.getClass();
        this.zzk = zzlnVar.zzp();
        zzB();
        zzln zzlnVar2 = this.zzk;
        zzlnVar2.getClass();
        return zzlnVar2;
    }

    @Nullable
    public final zzln zzr() {
        zzln zzlnVar = this.zzi;
        if (zzlnVar == null) {
            return null;
        }
        if (zzlnVar == this.zzj) {
            this.zzj = zzlnVar.zzp();
        }
        if (zzlnVar == this.zzk) {
            this.zzk = zzlnVar.zzp();
        }
        zzlnVar.zzn();
        int i2 = this.zzn - 1;
        this.zzn = i2;
        if (i2 == 0) {
            this.zzl = null;
            zzln zzlnVar2 = this.zzi;
            this.zzo = zzlnVar2.zzb;
            this.zzp = zzlnVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzp();
        zzB();
        return this.zzi;
    }

    public final void zzt() {
        zzln zzlnVar = this.zzm;
        if (zzlnVar == null || zzlnVar.zze()) {
            this.zzm = null;
            for (int i2 = 0; i2 < this.zzq.size(); i2++) {
                zzln zzlnVar2 = (zzln) this.zzq.get(i2);
                if (!zzlnVar2.zze()) {
                    this.zzm = zzlnVar2;
                    return;
                }
            }
        }
    }

    public final void zzv() {
        if (this.zzn == 0) {
            return;
        }
        zzln zzlnVarZzp = this.zzi;
        zzlnVarZzp.getClass();
        this.zzo = zzlnVarZzp.zzb;
        this.zzp = zzlnVarZzp.zzg.zza.zzd;
        while (zzlnVarZzp != null) {
            zzlnVarZzp.zzn();
            zzlnVarZzp = zzlnVarZzp.zzp();
        }
        this.zzi = null;
        this.zzl = null;
        this.zzj = null;
        this.zzk = null;
        this.zzn = 0;
        zzB();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x009d, code lost:
    
        return zzs(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzw(zzbf zzbfVar, long j2, long j3, long j4) {
        zzlo zzloVarZzx;
        boolean z2;
        zzln zzlnVarZzp = this.zzi;
        zzln zzlnVar = null;
        while (true) {
            int i2 = 0;
            if (zzlnVarZzp == null) {
                return 0;
            }
            zzlo zzloVar = zzlnVarZzp.zzg;
            if (zzlnVar == null) {
                zzloVarZzx = zzx(zzbfVar, zzloVar);
            } else {
                zzlo zzloVarZzE = zzE(zzbfVar, zzlnVar, j2);
                if (zzloVarZzE == null || zzloVar.zzb != zzloVarZzE.zzb || !zzloVar.zza.equals(zzloVarZzE.zza)) {
                    break;
                }
                zzloVarZzx = zzloVarZzE;
            }
            zzlnVarZzp.zzg = zzloVarZzx.zzb(zzloVar.zzc);
            long j5 = zzloVar.zze;
            long j6 = zzloVarZzx.zze;
            if (j5 != j6) {
                zzlnVarZzp.zzs();
                long jZza = j6 == -9223372036854775807L ? Long.MAX_VALUE : j6 + zzlnVarZzp.zza();
                if (zzlnVarZzp == this.zzj) {
                    boolean z3 = zzlnVarZzp.zzg.zzg;
                    z2 = j3 == Long.MIN_VALUE || j3 >= jZza;
                }
                boolean z4 = zzlnVarZzp == this.zzk && (j4 == Long.MIN_VALUE || j4 >= jZza);
                int iZzs = zzs(zzlnVarZzp);
                if (iZzs != 0) {
                    return iZzs;
                }
                if (j5 == -9223372036854775807L) {
                    j5 = -9223372036854775807L;
                }
                if (z2 && j5 != -9223372036854775807L) {
                    i2 = 1;
                }
                return z4 ? i2 | 2 : i2;
            }
            zzlnVar = zzlnVarZzp;
            zzlnVarZzp = zzlnVarZzp.zzp();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzlo zzx(zzbf zzbfVar, zzlo zzloVar) {
        long j2;
        long jZzh;
        long j3;
        long j4;
        int i2;
        zzwk zzwkVar = zzloVar.zza;
        boolean zZzL = zzL(zzwkVar);
        boolean zZzI = zzI(zzbfVar, zzwkVar);
        boolean zZzJ = zzJ(zzbfVar, zzwkVar, zZzL);
        Object obj = zzwkVar.zza;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        if (zzwkVar.zzb() || (i2 = zzwkVar.zze) == -1) {
            j2 = -9223372036854775807L;
        } else {
            zzbdVar.zzc(i2);
            j2 = 0;
        }
        if (zzwkVar.zzb()) {
            jZzh = zzbdVar.zzh(zzwkVar.zzb, zzwkVar.zzc);
        } else {
            if (j2 != -9223372036854775807L) {
                j3 = 0;
                j4 = 0;
                if (zzwkVar.zzb()) {
                    int i3 = zzwkVar.zze;
                    if (i3 != -1) {
                        zzbdVar.zzk(i3);
                    }
                } else {
                    zzbdVar.zzk(zzwkVar.zzb);
                }
                return new zzlo(zzwkVar, zzloVar.zzb, zzloVar.zzc, j4, j3, false, false, zZzL, zZzI, zZzJ);
            }
            jZzh = zzbdVar.zzd;
        }
        j3 = jZzh;
        j4 = j2;
        if (zzwkVar.zzb()) {
        }
        return new zzlo(zzwkVar, zzloVar.zzb, zzloVar.zzc, j4, j3, false, false, zZzL, zZzI, zZzJ);
    }

    public final zzwk zzy(zzbf zzbfVar, Object obj, long j2) {
        long jZzC;
        int iZze;
        zzbd zzbdVar = this.zza;
        int i2 = zzbfVar.zzo(obj, zzbdVar).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (iZze = zzbfVar.zze(obj2)) == -1 || zzbfVar.zzd(iZze, zzbdVar, false).zzc != i2) {
            zzln zzlnVarZzp = this.zzi;
            while (true) {
                if (zzlnVarZzp == null) {
                    zzln zzlnVarZzp2 = this.zzi;
                    while (true) {
                        if (zzlnVarZzp2 != null) {
                            int iZze2 = zzbfVar.zze(zzlnVarZzp2.zzb);
                            if (iZze2 != -1 && zzbfVar.zzd(iZze2, zzbdVar, false).zzc == i2) {
                                jZzC = zzlnVarZzp2.zzg.zza.zzd;
                                break;
                            }
                            zzlnVarZzp2 = zzlnVarZzp2.zzp();
                        } else {
                            jZzC = zzC(obj);
                            if (jZzC == -1) {
                                jZzC = this.zze;
                                this.zze = 1 + jZzC;
                                if (this.zzi == null) {
                                    this.zzo = obj;
                                    this.zzp = jZzC;
                                }
                            }
                        }
                    }
                } else {
                    if (zzlnVarZzp.zzb.equals(obj)) {
                        jZzC = zzlnVarZzp.zzg.zza.zzd;
                        break;
                    }
                    zzlnVarZzp = zzlnVarZzp.zzp();
                }
            }
        } else {
            jZzC = this.zzp;
        }
        long j3 = jZzC;
        zzbfVar.zzo(obj, zzbdVar);
        int i3 = zzbdVar.zzc;
        zzbe zzbeVar = this.zzb;
        zzbfVar.zzb(i3, zzbeVar, 0L);
        Object obj3 = obj;
        for (int iZze3 = zzbfVar.zze(obj); iZze3 >= zzbeVar.zzn; iZze3--) {
            zzbfVar.zzd(iZze3, zzbdVar, true);
            zzbdVar.zzb();
            if (zzbdVar.zze(zzbdVar.zzd) != -1) {
                Object obj4 = zzbdVar.zzb;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return zzA(zzbfVar, obj3, j2, j3, zzbeVar, zzbdVar);
    }

    final /* synthetic */ void zzz(zzguc zzgucVar, zzwk zzwkVar) {
        this.zzc.zzz(zzgucVar.zzi(), zzwkVar);
    }

    public zzlq(zzmx zzmxVar, zzdx zzdxVar, zzky zzkyVar, zzjg zzjgVar) {
        this.zzc = zzmxVar;
        this.zzd = zzdxVar;
        this.zzr = zzkyVar;
        this.zzh = zzjgVar;
    }

    private static zzwk zzA(zzbf zzbfVar, Object obj, long j2, long j3, zzbe zzbeVar, zzbd zzbdVar) {
        zzbfVar.zzo(obj, zzbdVar);
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzbfVar.zze(obj);
        zzbdVar.zzb();
        zzbfVar.zzo(obj, zzbdVar);
        int iZze = zzbdVar.zze(j2);
        if (iZze == -1) {
            return new zzwk(obj, j3, zzbdVar.zzf(j2));
        }
        return new zzwk(obj, iZze, zzbdVar.zzd(iZze), j3);
    }

    private final boolean zzI(zzbf zzbfVar, zzwk zzwkVar) {
        if (!zzL(zzwkVar)) {
            return false;
        }
        Object obj = zzwkVar.zza;
        int i2 = zzbfVar.zzo(obj, this.zza).zzc;
        if (zzbfVar.zzb(i2, this.zzb, 0L).zzo != zzbfVar.zze(obj)) {
            return false;
        }
        return true;
    }

    public final int zzs(zzln zzlnVar) {
        zzlnVar.getClass();
        int i2 = 0;
        if (zzlnVar.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzlnVar;
        while (zzlnVar.zzp() != null) {
            zzlnVar = zzlnVar.zzp();
            zzlnVar.getClass();
            if (zzlnVar == this.zzj) {
                zzln zzlnVar2 = this.zzi;
                this.zzj = zzlnVar2;
                this.zzk = zzlnVar2;
                i2 = 3;
            }
            if (zzlnVar == this.zzk) {
                this.zzk = this.zzj;
                i2 |= 2;
            }
            zzlnVar.zzn();
            this.zzn--;
        }
        zzln zzlnVar3 = this.zzl;
        zzlnVar3.getClass();
        zzlnVar3.zzo(null);
        zzB();
        return i2;
    }
}
