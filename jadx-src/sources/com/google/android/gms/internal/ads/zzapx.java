package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzapx implements zzaeu {
    private final int zza;
    private final List zzb;
    private final zzer zzc;
    private final SparseIntArray zzd;
    private final zzaqa zze;
    private final zzamd zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzapt zzj;
    private zzaps zzk;
    private zzaex zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    static {
        int i2 = zzapw.zza;
    }

    @Deprecated
    public zzapx() {
        this(1, 1, zzamd.zza, new zzfg(0L), new zzaok(0), 112800);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    final /* synthetic */ List zzh() {
        return this.zzb;
    }

    final /* synthetic */ zzaqa zzi() {
        return this.zze;
    }

    final /* synthetic */ SparseArray zzj() {
        return this.zzg;
    }

    final /* synthetic */ SparseBooleanArray zzk() {
        return this.zzh;
    }

    final /* synthetic */ SparseBooleanArray zzl() {
        return this.zzi;
    }

    final /* synthetic */ zzaex zzm() {
        return this.zzl;
    }

    final /* synthetic */ int zzn() {
        return this.zzm;
    }

    final /* synthetic */ void zzo(int i2) {
        this.zzm = i2;
    }

    final /* synthetic */ void zzp(boolean z2) {
        this.zzn = true;
    }

    final /* synthetic */ void zzq(int i2) {
        this.zzr = i2;
    }

    public zzapx(int i2, int i3, zzamd zzamdVar, zzfg zzfgVar, zzaqa zzaqaVar, int i5) {
        this.zze = zzaqaVar;
        this.zza = i3;
        this.zzf = zzamdVar;
        this.zzb = Collections.singletonList(zzfgVar);
        this.zzc = new zzer(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzapt(112800);
        this.zzl = zzaex.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArrayZza = zzaqaVar.zza();
        int size = sparseArrayZza.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.zzg.put(sparseArrayZza.keyAt(i7), (zzaqc) sparseArrayZza.valueAt(i7));
        }
        this.zzg.put(0, new zzapo(new zzapu(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzaev zzaevVar) throws IOException {
        byte[] bArrZzi = this.zzc.zzi();
        zzael zzaelVar = (zzael) zzaevVar;
        zzaelVar.zzh(bArrZzi, 0, 940, false);
        int i2 = 0;
        while (i2 < 188) {
            for (int i3 = 0; i3 < 5; i3++) {
                if (bArrZzi[(i3 * 188) + i2] != 71) {
                    break;
                }
            }
            zzaelVar.zze(i2, false);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        if (this.zza == 0) {
            zzaexVar = new zzamg(zzaexVar, this.zzf);
        }
        this.zzl = zzaexVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x019c  */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        long j2;
        long j3;
        long jZzo = zzaevVar.zzo();
        if (this.zzn) {
            if (jZzo != -1) {
                zzapt zzaptVar = this.zzj;
                if (!zzaptVar.zza()) {
                    return zzaptVar.zzb(zzaevVar, zzafvVar, this.zzr);
                }
            }
            if (this.zzo) {
                j2 = -1;
                j3 = 0;
            } else {
                this.zzo = true;
                zzapt zzaptVar2 = this.zzj;
                if (zzaptVar2.zzc() != -9223372036854775807L) {
                    j2 = -1;
                    j3 = 0;
                    zzaps zzapsVar = new zzaps(zzaptVar2.zzd(), zzaptVar2.zzc(), jZzo, this.zzr, 112800);
                    this.zzk = zzapsVar;
                    this.zzl.zzw(zzapsVar.zza());
                } else {
                    j2 = -1;
                    j3 = 0;
                    this.zzl.zzw(new zzafx(zzaptVar2.zzc(), 0L));
                }
            }
            if (this.zzp) {
                this.zzp = false;
                zze(j3, j3);
                if (zzaevVar.zzn() != j3) {
                    zzafvVar.zza = j3;
                    return 1;
                }
            }
            zzaps zzapsVar2 = this.zzk;
            if (zzapsVar2 != null && zzapsVar2.zzc()) {
                return zzapsVar2.zzd(zzaevVar, zzafvVar);
            }
        } else {
            j2 = -1;
        }
        zzer zzerVar = this.zzc;
        byte[] bArrZzi = zzerVar.zzi();
        if (9400 - zzerVar.zzg() < 188) {
            int iZzd = zzerVar.zzd();
            if (iZzd > 0) {
                System.arraycopy(bArrZzi, zzerVar.zzg(), bArrZzi, 0, iZzd);
            }
            zzerVar.zzb(bArrZzi, iZzd);
        }
        while (zzerVar.zzd() < 188) {
            int iZze = zzerVar.zze();
            int iZza = zzaevVar.zza(bArrZzi, iZze, 9400 - iZze);
            if (iZza == -1) {
                int i2 = 0;
                while (true) {
                    SparseArray sparseArray = this.zzg;
                    if (i2 >= sparseArray.size()) {
                        return -1;
                    }
                    zzaqc zzaqcVar = (zzaqc) sparseArray.valueAt(i2);
                    if (zzaqcVar instanceof zzapg) {
                        zzapg zzapgVar = (zzapg) zzaqcVar;
                        if (zzapgVar.zzd(false)) {
                            zzapgVar.zzc(new zzer(), 1);
                        }
                    }
                    i2++;
                }
            } else {
                zzerVar.zzf(iZze + iZza);
            }
        }
        int iZzg = zzerVar.zzg();
        int iZze2 = zzerVar.zze();
        int iZza2 = zzaqd.zza(zzerVar.zzi(), iZzg, iZze2);
        zzerVar.zzh(iZza2);
        int i3 = iZza2 + 188;
        if (i3 > iZze2) {
            this.zzq += iZza2 - iZzg;
        } else {
            this.zzq = 0;
        }
        int iZze3 = zzerVar.zze();
        if (i3 > iZze3) {
            return 0;
        }
        int iZzB = zzerVar.zzB();
        if ((8388608 & iZzB) != 0) {
            zzerVar.zzh(i3);
            return 0;
        }
        int i5 = (4194304 & iZzB) != 0 ? 1 : 0;
        int i7 = iZzB & 32;
        int i8 = (iZzB >> 8) & 8191;
        zzaqc zzaqcVar2 = (iZzB & 16) != 0 ? (zzaqc) this.zzg.get(i8) : null;
        if (zzaqcVar2 == null) {
            zzerVar.zzh(i3);
            return 0;
        }
        int i9 = iZzB & 15;
        SparseIntArray sparseIntArray = this.zzd;
        int i10 = sparseIntArray.get(i8, i9 - 1);
        sparseIntArray.put(i8, i9);
        if (i10 == i9) {
            zzerVar.zzh(i3);
            return 0;
        }
        if (i9 != ((i10 + 1) & 15)) {
            zzaqcVar2.zzb();
        }
        if (i7 != 0) {
            int iZzs = zzerVar.zzs();
            i5 |= (zzerVar.zzs() & 64) != 0 ? 2 : 0;
            zzerVar.zzk(iZzs - 1);
        }
        boolean z2 = this.zzn;
        if (z2 || !this.zzi.get(i8, false)) {
            zzerVar.zzf(i3);
            zzaqcVar2.zzc(zzerVar, i5);
            zzerVar.zzf(iZze3);
            if (!z2) {
                if (this.zzn && jZzo != j2) {
                    this.zzp = true;
                }
            }
        }
        zzerVar.zzh(i3);
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(long j2, long j3) {
        zzaps zzapsVar;
        List list = this.zzb;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzfg zzfgVar = (zzfg) list.get(i2);
            if (zzfgVar.zzc() != -9223372036854775807L) {
                long jZza = zzfgVar.zza();
                if (jZza != -9223372036854775807L && jZza != 0 && jZza != j3) {
                    zzfgVar.zzd(j3);
                }
            }
        }
        if (j3 != 0 && (zzapsVar = this.zzk) != null) {
            zzapsVar.zzb(j3);
        }
        this.zzc.zza(0);
        this.zzd.clear();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.zzg;
            if (i3 >= sparseArray.size()) {
                this.zzq = 0;
                return;
            } else {
                ((zzaqc) sparseArray.valueAt(i3)).zzb();
                i3++;
            }
        }
    }
}
