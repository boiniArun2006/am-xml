package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzyb implements zzagh {
    private boolean zzB;
    private final zzxw zza;

    @Nullable
    private final zzto zzd;

    @Nullable
    private final zztj zze;

    @Nullable
    private zzya zzf;

    @Nullable
    private zzv zzg;

    @Nullable
    private zzth zzh;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzw;

    @Nullable
    private zzv zzz;
    private final zzxx zzb = new zzxx();
    private int zzi = 1000;
    private long[] zzj = new long[1000];
    private long[] zzk = new long[1000];
    private long[] zzn = new long[1000];
    private int[] zzm = new int[1000];
    private int[] zzl = new int[1000];
    private zzagg[] zzo = new zzagg[1000];
    private final zzyi zzc = new zzyi(zzxy.zza);
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private long zzv = Long.MIN_VALUE;
    private boolean zzy = true;
    private boolean zzx = true;
    private boolean zzA = true;

    private final synchronized void zzA() {
        this.zzs = 0;
        this.zza.zzb();
    }

    private final synchronized int zzB(zzlh zzlhVar, zzih zzihVar, boolean z2, boolean z3, zzxx zzxxVar) {
        try {
            zzihVar.zzd = false;
            if (!zzH()) {
                if (!z3 && !this.zzw) {
                    zzv zzvVar = this.zzz;
                    if (zzvVar == null || (!z2 && zzvVar == this.zzg)) {
                        return -3;
                    }
                    zzI(zzvVar, zzlhVar);
                    return -5;
                }
                zzihVar.zzg(4);
                zzihVar.zze = Long.MIN_VALUE;
                return -4;
            }
            zzv zzvVar2 = ((zzxz) this.zzc.zza(this.zzq + this.zzs)).zza;
            if (!z2 && zzvVar2 == this.zzg) {
                int iZzM = zzM(this.zzs);
                if (!zzJ(iZzM)) {
                    zzihVar.zzd = true;
                    return -3;
                }
                zzihVar.zzg(this.zzm[iZzM]);
                if (this.zzs == this.zzp - 1 && (z3 || this.zzw)) {
                    zzihVar.zzh(536870912);
                }
                zzihVar.zze = this.zzn[iZzM];
                zzxxVar.zza = this.zzl[iZzM];
                zzxxVar.zzb = this.zzk[iZzM];
                zzxxVar.zzc = this.zzo[iZzM];
                return -4;
            }
            zzI(zzvVar2, zzlhVar);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean zzC(zzv zzvVar) {
        try {
            this.zzy = false;
            if (Objects.equals(zzvVar, this.zzz)) {
                return false;
            }
            zzyi zzyiVar = this.zzc;
            if (zzyiVar.zzf() || !((zzxz) zzyiVar.zzc()).zza.equals(zzvVar)) {
                this.zzz = zzvVar;
            } else {
                this.zzz = ((zzxz) zzyiVar.zzc()).zza;
            }
            boolean z2 = this.zzA;
            zzv zzvVar2 = this.zzz;
            this.zzA = z2 & zzas.zzd(zzvVar2.zzo, zzvVar2.zzk);
            this.zzB = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized long zzD(long j2, boolean z2, boolean z3) throws Throwable {
        Throwable th;
        try {
            try {
                int i2 = this.zzp;
                if (i2 != 0) {
                    long[] jArr = this.zzn;
                    int i3 = this.zzr;
                    if (j2 >= jArr[i3]) {
                        if (z3) {
                            try {
                                int i5 = this.zzs;
                                if (i5 != i2) {
                                    i2 = i5 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int iZzK = zzK(i3, i2, j2, false);
                        if (iZzK != -1) {
                            return zzL(iZzK);
                        }
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private final synchronized long zzE() {
        int i2 = this.zzp;
        if (i2 == 0) {
            return -1L;
        }
        return zzL(i2);
    }

    private final void zzF() {
        if (this.zzh != null) {
            this.zzh = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzG(long j2, int i2, long j3, int i3, @Nullable zzagg zzaggVar) {
        try {
            int i5 = this.zzp;
            if (i5 > 0) {
                int iZzM = zzM(i5 - 1);
                zzgrc.zza(this.zzk[iZzM] + ((long) this.zzl[iZzM]) <= j3);
            }
            this.zzw = (536870912 & i2) != 0;
            this.zzv = Math.max(this.zzv, j2);
            int iZzM2 = zzM(this.zzp);
            this.zzn[iZzM2] = j2;
            this.zzk[iZzM2] = j3;
            this.zzl[iZzM2] = i3;
            this.zzm[iZzM2] = i2;
            this.zzo[iZzM2] = zzaggVar;
            this.zzj[iZzM2] = 0;
            zzyi zzyiVar = this.zzc;
            if (zzyiVar.zzf() || !((zzxz) zzyiVar.zzc()).zza.equals(this.zzz)) {
                zzv zzvVar = this.zzz;
                if (zzvVar == null) {
                    throw null;
                }
                zzyiVar.zzb(this.zzq + this.zzp, new zzxz(zzvVar, zztn.zzb, null));
            }
            int i7 = this.zzp + 1;
            this.zzp = i7;
            int i8 = this.zzi;
            if (i7 == i8) {
                int i9 = i8 + 1000;
                long[] jArr = new long[i9];
                long[] jArr2 = new long[i9];
                long[] jArr3 = new long[i9];
                int[] iArr = new int[i9];
                int[] iArr2 = new int[i9];
                zzagg[] zzaggVarArr = new zzagg[i9];
                int i10 = this.zzr;
                int i11 = i8 - i10;
                System.arraycopy(this.zzk, i10, jArr2, 0, i11);
                System.arraycopy(this.zzn, this.zzr, jArr3, 0, i11);
                System.arraycopy(this.zzm, this.zzr, iArr, 0, i11);
                System.arraycopy(this.zzl, this.zzr, iArr2, 0, i11);
                System.arraycopy(this.zzo, this.zzr, zzaggVarArr, 0, i11);
                System.arraycopy(this.zzj, this.zzr, jArr, 0, i11);
                int i12 = this.zzr;
                System.arraycopy(this.zzk, 0, jArr2, i11, i12);
                System.arraycopy(this.zzn, 0, jArr3, i11, i12);
                System.arraycopy(this.zzm, 0, iArr, i11, i12);
                System.arraycopy(this.zzl, 0, iArr2, i11, i12);
                System.arraycopy(this.zzo, 0, zzaggVarArr, i11, i12);
                System.arraycopy(this.zzj, 0, jArr, i11, i12);
                this.zzk = jArr2;
                this.zzn = jArr3;
                this.zzm = iArr;
                this.zzl = iArr2;
                this.zzo = zzaggVarArr;
                this.zzj = jArr;
                this.zzr = 0;
                this.zzi = i9;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean zzH() {
        return this.zzs != this.zzp;
    }

    private final int zzK(int i2, int i3, long j2, boolean z2) {
        int i5 = -1;
        for (int i7 = 0; i7 < i3; i7++) {
            long j3 = this.zzn[i2];
            if (j3 > j2) {
                break;
            }
            if (!z2 || (this.zzm[i2] & 1) != 0) {
                if (j3 == j2) {
                    return i7;
                }
                i5 = i7;
            }
            i2++;
            if (i2 == this.zzi) {
                i2 = 0;
            }
        }
        return i5;
    }

    private final int zzM(int i2) {
        int i3 = this.zzr + i2;
        int i5 = this.zzi;
        return i3 < i5 ? i3 : i3 - i5;
    }

    @CallSuper
    public final void zzf() {
        zzg(true);
        zzF();
    }

    public final void zzh(long j2) {
        this.zzt = j2;
    }

    public final int zzi() {
        return this.zzq + this.zzp;
    }

    public final int zzl() {
        return this.zzq;
    }

    public final int zzm() {
        return this.zzq + this.zzs;
    }

    @Nullable
    public final synchronized zzv zzn() {
        if (this.zzy) {
            return null;
        }
        return this.zzz;
    }

    public final synchronized long zzo() {
        return this.zzv;
    }

    public final synchronized boolean zzp() {
        return this.zzw;
    }

    @CallSuper
    public final synchronized boolean zzq(boolean z2) {
        boolean z3 = true;
        if (zzH()) {
            if (((zzxz) this.zzc.zza(this.zzq + this.zzs)).zza != this.zzg) {
                return true;
            }
            return zzJ(zzM(this.zzs));
        }
        if (!z2 && !this.zzw) {
            zzv zzvVar = this.zzz;
            if (zzvVar == null) {
                z3 = false;
            } else if (zzvVar == this.zzg) {
                return false;
            }
        }
        return z3;
    }

    public final synchronized boolean zzs(int i2) {
        zzA();
        int i3 = this.zzq;
        if (i2 >= i3 && i2 <= this.zzp + i3) {
            this.zzt = Long.MIN_VALUE;
            this.zzs = i2 - i3;
            return true;
        }
        return false;
    }

    public final synchronized boolean zzt(long j2, boolean z2) {
        Throwable th;
        zzyb zzybVar;
        long j3;
        int iZzK;
        try {
            try {
                zzA();
                int i2 = this.zzs;
                int iZzM = zzM(i2);
                if (zzH() && j2 >= this.zzn[iZzM]) {
                    if (j2 > this.zzv) {
                        if (z2) {
                            z2 = true;
                        }
                    }
                    if (this.zzA) {
                        try {
                            int i3 = this.zzp - i2;
                            int i5 = 0;
                            while (true) {
                                if (i5 < i3) {
                                    if (this.zzn[iZzM] >= j2) {
                                        zzybVar = this;
                                        j3 = j2;
                                        iZzK = i5;
                                        break;
                                    }
                                    iZzM++;
                                    if (iZzM == this.zzi) {
                                        iZzM = 0;
                                    }
                                    i5++;
                                } else if (z2) {
                                    j3 = j2;
                                    iZzK = i3;
                                    zzybVar = this;
                                } else {
                                    zzybVar = this;
                                    j3 = j2;
                                    iZzK = -1;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } else {
                        zzybVar = this;
                        j3 = j2;
                        iZzK = zzybVar.zzK(iZzM, this.zzp - i2, j3, true);
                    }
                    if (iZzK != -1) {
                        zzybVar.zzt = j3;
                        zzybVar.zzs += iZzK;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized int zzu(long j2, boolean z2) {
        Throwable th;
        try {
            try {
                int i2 = this.zzs;
                int iZzM = zzM(i2);
                if (!zzH() || j2 < this.zzn[iZzM]) {
                    return 0;
                }
                if (j2 <= this.zzv || !z2) {
                    int iZzK = zzK(iZzM, this.zzp - i2, j2, true);
                    if (iZzK == -1) {
                        return 0;
                    }
                    return iZzK;
                }
                try {
                    return this.zzp - i2;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        throw th;
    }

    public final synchronized void zzv(int i2) {
        boolean z2 = false;
        if (i2 >= 0) {
            try {
                if (this.zzs + i2 <= this.zzp) {
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzgrc.zza(z2);
        this.zzs += i2;
    }

    public final void zzy(@Nullable zzya zzyaVar) {
        this.zzf = zzyaVar;
    }

    private final void zzI(zzv zzvVar, zzlh zzlhVar) {
        zzv zzvVar2 = this.zzg;
        zzq zzqVar = zzvVar2 == null ? null : zzvVar2.zzs;
        this.zzg = zzvVar;
        zzq zzqVar2 = zzvVar.zzs;
        zzto zztoVar = this.zzd;
        zzlhVar.zzb = zzvVar.zzb(zztoVar.zzb(zzvVar));
        zzlhVar.zza = this.zzh;
        if (zzvVar2 == null || !Objects.equals(zzqVar, zzqVar2)) {
            zzth zzthVarZza = zztoVar.zza(this.zze, zzvVar);
            this.zzh = zzthVarZza;
            zzlhVar.zza = zzthVarZza;
        }
    }

    private final boolean zzJ(int i2) {
        if (this.zzh == null) {
            return true;
        }
        int i3 = this.zzm[i2];
        return false;
    }

    @GuardedBy
    private final long zzL(int i2) {
        long j2 = this.zzu;
        long jMax = Long.MIN_VALUE;
        if (i2 != 0) {
            int iZzM = zzM(i2 - 1);
            for (int i3 = 0; i3 < i2; i3++) {
                jMax = Math.max(jMax, this.zzn[iZzM]);
                if ((this.zzm[iZzM] & 1) != 0) {
                    break;
                }
                iZzM--;
                if (iZzM == -1) {
                    iZzM = this.zzi - 1;
                }
            }
        }
        this.zzu = Math.max(j2, jMax);
        this.zzp -= i2;
        int i5 = this.zzq + i2;
        this.zzq = i5;
        int i7 = this.zzr + i2;
        this.zzr = i7;
        int i8 = this.zzi;
        if (i7 >= i8) {
            this.zzr = i7 - i8;
        }
        int i9 = this.zzs - i2;
        this.zzs = i9;
        if (i9 < 0) {
            this.zzs = 0;
        }
        this.zzc.zzd(i5);
        if (this.zzp != 0) {
            return this.zzk[this.zzr];
        }
        int i10 = this.zzr;
        if (i10 == 0) {
            i10 = this.zzi;
        }
        int i11 = i10 - 1;
        return this.zzk[i11] + ((long) this.zzl[i11]);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzb(zzj zzjVar, int i2, boolean z2, int i3) throws IOException {
        return this.zza.zzg(zzjVar, i2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzd(zzer zzerVar, int i2, int i3) {
        this.zza.zzh(zzerVar, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j2, int i2, int i3, int i5, @Nullable zzagg zzaggVar) {
        if (this.zzx) {
            if ((i2 & 1) == 0) {
                return;
            } else {
                this.zzx = false;
            }
        }
        if (this.zzA) {
            if (j2 < this.zzt) {
                return;
            }
            if ((i2 & 1) == 0) {
                if (!this.zzB) {
                    zzee.zzc("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzz)));
                    this.zzB = true;
                }
                i2 |= 1;
            }
        }
        int i7 = i2;
        zzG(j2, i7, (this.zza.zzf() - ((long) i3)) - ((long) i5), i3, zzaggVar);
    }

    @CallSuper
    public final void zzg(boolean z2) {
        this.zza.zza();
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzx = true;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = Long.MIN_VALUE;
        this.zzw = false;
        this.zzc.zze();
        if (z2) {
            this.zzz = null;
            this.zzy = true;
            this.zzA = true;
        }
    }

    @CallSuper
    public final void zzk() throws IOException {
        zzth zzthVar = this.zzh;
        if (zzthVar != null) {
            throw zzthVar.zza();
        }
    }

    @CallSuper
    public final int zzr(zzlh zzlhVar, zzih zzihVar, int i2, boolean z2) {
        boolean z3 = (i2 & 2) != 0;
        zzxx zzxxVar = this.zzb;
        int iZzB = zzB(zzlhVar, zzihVar, z3, z2, zzxxVar);
        if (iZzB != -4) {
            return iZzB;
        }
        if (!zzihVar.zzb()) {
            int i3 = i2 & 1;
            if ((i2 & 4) == 0) {
                if (i3 != 0) {
                    this.zza.zzd(zzihVar, zzxxVar);
                    return -4;
                }
                this.zza.zzc(zzihVar, zzxxVar);
            } else if (i3 != 0) {
                return -4;
            }
            this.zzs++;
        }
        return -4;
    }

    public final void zzw(long j2, boolean z2, boolean z3) {
        this.zza.zze(zzD(j2, false, z3));
    }

    public final void zzx() {
        this.zza.zze(zzE());
    }

    protected zzyb(zzaan zzaanVar, @Nullable zzto zztoVar, @Nullable zztj zztjVar) {
        this.zzd = zztoVar;
        this.zze = zztjVar;
        this.zza = new zzxw(zzaanVar);
    }

    @CallSuper
    public final void zzj() {
        zzx();
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzz(zzv zzvVar) {
        boolean zZzC = zzC(zzvVar);
        zzya zzyaVar = this.zzf;
        if (zzyaVar != null && zZzC) {
            zzyaVar.zzy(zzvVar);
        }
    }
}
