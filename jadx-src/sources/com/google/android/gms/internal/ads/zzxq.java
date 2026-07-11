package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzxq implements zzwi, zzaex, zzaax, zzabc, zzya {
    private static final Map zzb;
    private static final zzv zzc;
    private boolean zzA;
    private zzxp zzB;
    private zzafy zzC;
    private long zzD;
    private boolean zzE;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private long zzL;
    private boolean zzN;
    private int zzO;
    private boolean zzP;
    private boolean zzQ;
    private final Uri zzd;
    private final zzhb zze;
    private final zzto zzf;
    private final zzwu zzg;
    private final zztj zzh;
    private final zzxi zzi;
    private final zzaan zzj;
    private final long zzk;
    private final long zzl;
    private final zzxd zzn;

    @Nullable
    private zzwh zzs;

    @Nullable
    private zzaic zzt;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;
    private final zzabf zzm = new zzabf("ProgressiveMediaPeriod");
    private final zzdq zzo = new zzdq(zzdn.zza);
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzxm
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.zza.zzD();
        }
    };
    private final Runnable zzq = new Runnable() { // from class: com.google.android.gms.internal.ads.zzxj
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.zza.zzE();
        }
    };
    private final Handler zzr = zzfj.zzc(null);
    private zzxo[] zzw = new zzxo[0];
    private zzyb[] zzv = new zzyb[0];
    private zzxg[] zzu = new zzxg[0];
    private long zzM = -9223372036854775807L;
    private int zzF = 1;

    private final boolean zzT() {
        return this.zzH || zzZ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final void zzD() {
        int i2;
        if (this.zzQ || this.zzy || !this.zzx || this.zzC == null) {
            return;
        }
        for (zzyb zzybVar : this.zzv) {
            if (zzybVar.zzn() == null) {
                return;
            }
        }
        this.zzo.zzb();
        int length = this.zzv.length;
        zzbg[] zzbgVarArr = new zzbg[length];
        boolean[] zArr = new boolean[length];
        for (int i3 = 0; i3 < length; i3++) {
            zzv zzvVarZzn = this.zzv[i3].zzn();
            zzvVarZzn.getClass();
            String str = zzvVarZzn.zzo;
            boolean zZza = zzas.zza(str);
            boolean z2 = zZza || zzas.zzb(str);
            zArr[i3] = z2;
            this.zzz = z2 | this.zzz;
            this.zzA = this.zzl != -9223372036854775807L && length == 1 && zzas.zzc(str);
            zzaic zzaicVar = this.zzt;
            if (zzaicVar != null) {
                if (zZza || this.zzw[i3].zzb) {
                    zzap zzapVar = zzvVarZzn.zzl;
                    zzap zzapVar2 = zzapVar == null ? new zzap(-9223372036854775807L, zzaicVar) : zzapVar.zzg(zzaicVar);
                    zzt zztVarZza = zzvVarZzn.zza();
                    zztVarZza.zzk(zzapVar2);
                    zzvVarZzn = zztVarZza.zzM();
                }
                if (zZza && zzvVarZzn.zzh == -1 && zzvVarZzn.zzi == -1 && (i2 = zzaicVar.zza) != -1) {
                    zzt zztVarZza2 = zzvVarZzn.zza();
                    zztVarZza2.zzh(i2);
                    zzvVarZzn = zztVarZza2.zzM();
                }
            }
            zzv zzvVarZzb = zzvVarZzn.zzb(this.zzf.zzb(zzvVarZzn));
            zzbgVarArr[i3] = new zzbg(Integer.toString(i3), zzvVarZzb);
            this.zzI = zzvVarZzb.zzu | this.zzI;
        }
        this.zzB = new zzxp(new zzyn(zzbgVarArr), zArr);
        if (this.zzA && this.zzD == -9223372036854775807L) {
            this.zzD = this.zzl;
            this.zzC = new zzxe(this, this.zzC);
        }
        this.zzi.zzb(this.zzD, this.zzC, this.zzE);
        this.zzy = true;
        zzwh zzwhVar = this.zzs;
        zzwhVar.getClass();
        zzwhVar.zzp(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long zzY(boolean z2) {
        int i2 = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            zzyb[] zzybVarArr = this.zzv;
            if (i2 >= zzybVarArr.length) {
                return jMax;
            }
            if (!z2) {
                zzxp zzxpVar = this.zzB;
                zzxpVar.getClass();
                if (zzxpVar.zzc[i2]) {
                    jMax = Math.max(jMax, zzybVarArr[i2].zzo());
                }
            }
            i2++;
        }
    }

    private final boolean zzZ() {
        return this.zzM != -9223372036854775807L;
    }

    final /* synthetic */ void zzG() {
        this.zzK = true;
    }

    final /* synthetic */ long zzI(boolean z2) {
        return zzY(true);
    }

    final /* synthetic */ long zzL() {
        return this.zzk;
    }

    final /* synthetic */ Runnable zzM() {
        return this.zzq;
    }

    final /* synthetic */ Handler zzN() {
        return this.zzr;
    }

    final /* synthetic */ zzaic zzO() {
        return this.zzt;
    }

    final /* synthetic */ void zzP(zzaic zzaicVar) {
        this.zzt = zzaicVar;
    }

    final /* synthetic */ long zzQ() {
        return this.zzD;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final void zzg(long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzn() {
        return this.zzm.zze() && this.zzo.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zzv() {
        this.zzx = true;
        this.zzr.post(this.zzp);
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(map);
        zzt zztVar = new zzt();
        zztVar.zza("icy");
        zztVar.zzm("application/x-icy");
        zzc = zztVar.zzM();
    }

    private final zzagh zzU(zzxo zzxoVar) {
        int length = this.zzv.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (zzxoVar.equals(this.zzw[i2])) {
                return this.zzv[i2];
            }
        }
        if (this.zzx) {
            int i3 = zzxoVar.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 55);
            sb.append("Extractor added new track (id=");
            sb.append(i3);
            sb.append(") after finishing tracks.");
            zzee.zzc("ProgressiveMediaPeriod", sb.toString());
            return new zzaer();
        }
        zzyb zzybVar = new zzyb(this.zzj, this.zzf, this.zzh);
        zzxg zzxgVar = new zzxg(zzybVar);
        zzybVar.zzy(this);
        int i5 = length + 1;
        zzxo[] zzxoVarArr = (zzxo[]) Arrays.copyOf(this.zzw, i5);
        zzxoVarArr[length] = zzxoVar;
        String str = zzfj.zza;
        this.zzw = zzxoVarArr;
        zzyb[] zzybVarArr = (zzyb[]) Arrays.copyOf(this.zzv, i5);
        zzybVarArr[length] = zzybVar;
        this.zzv = zzybVarArr;
        zzxg[] zzxgVarArr = (zzxg[]) Arrays.copyOf(this.zzu, i5);
        zzxgVarArr[length] = zzxgVar;
        this.zzu = zzxgVarArr;
        return zzxgVar;
    }

    private final void zzW() {
        zzxh zzxhVar = new zzxh(this, this.zzd, this.zze, this.zzn, this, this.zzo);
        if (this.zzy) {
            zzgrc.zzi(zzZ());
            long j2 = this.zzD;
            if (j2 != -9223372036854775807L && this.zzM > j2) {
                this.zzP = true;
                this.zzM = -9223372036854775807L;
                return;
            }
            zzafy zzafyVar = this.zzC;
            zzafyVar.getClass();
            zzxhVar.zzd(zzafyVar.zzc(this.zzM).zza.zzc, this.zzM);
            for (zzyb zzybVar : this.zzv) {
                zzybVar.zzh(this.zzM);
            }
            this.zzM = -9223372036854775807L;
        }
        this.zzO = zzX();
        this.zzm.zzd(zzxhVar, this, zzaaw.zza(this.zzF));
    }

    private final int zzX() {
        int iZzi = 0;
        for (zzyb zzybVar : this.zzv) {
            iZzi += zzybVar.zzi();
        }
        return iZzi;
    }

    private final void zzaa() {
        zzgrc.zzi(this.zzy);
        this.zzB.getClass();
        this.zzC.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final /* bridge */ /* synthetic */ void zzA(zzabb zzabbVar, long j2, long j3, boolean z2) {
        zzxh zzxhVar = (zzxh) zzabbVar;
        zzhy zzhyVarZzf = zzxhVar.zzf();
        zzwb zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzhyVarZzf.zzg(), zzhyVarZzf.zzh(), j2, j3, zzhyVarZzf.zzf());
        zzxhVar.zze();
        this.zzg.zzf(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)));
        if (z2) {
            return;
        }
        for (zzyb zzybVar : this.zzv) {
            zzybVar.zzg(false);
        }
        if (this.zzJ > 0) {
            zzwh zzwhVar = this.zzs;
            zzwhVar.getClass();
            zzwhVar.zzs(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final /* bridge */ /* synthetic */ void zzB(zzabb zzabbVar, long j2, long j3) {
        zzxh zzxhVar = (zzxh) zzabbVar;
        if (this.zzD == -9223372036854775807L && this.zzC != null) {
            long jZzY = zzY(true);
            long j4 = jZzY == Long.MIN_VALUE ? 0L : jZzY + 10000;
            this.zzD = j4;
            this.zzi.zzb(j4, this.zzC, this.zzE);
        }
        zzhy zzhyVarZzf = zzxhVar.zzf();
        zzwb zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzhyVarZzf.zzg(), zzhyVarZzf.zzh(), j2, j3, zzhyVarZzf.zzf());
        zzxhVar.zze();
        this.zzg.zze(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)));
        this.zzP = true;
        zzwh zzwhVar = this.zzs;
        zzwhVar.getClass();
        zzwhVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final /* bridge */ /* synthetic */ void zzC(zzabb zzabbVar, long j2, long j3, int i2) {
        zzwb zzwbVar;
        zzxh zzxhVar = (zzxh) zzabbVar;
        zzhy zzhyVarZzf = zzxhVar.zzf();
        if (i2 == 0) {
            long jZze = zzxhVar.zze();
            zzhf zzhfVarZzh = zzxhVar.zzh();
            zzwbVar = new zzwb(jZze, zzhfVarZzh, zzhfVarZzh.zza, Collections.EMPTY_MAP, j2, 0L, 0L);
        } else {
            zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzhyVarZzf.zzg(), zzhyVarZzf.zzh(), j2, j3, zzhyVarZzf.zzf());
        }
        this.zzg.zzd(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)), i2);
    }

    final /* synthetic */ void zzE() {
        if (this.zzQ) {
            return;
        }
        zzwh zzwhVar = this.zzs;
        zzwhVar.getClass();
        zzwhVar.zzs(this);
    }

    final /* synthetic */ void zzF(zzafy zzafyVar) {
        this.zzC = this.zzt == null ? zzafyVar : new zzafx(-9223372036854775807L, 0L);
        this.zzD = zzafyVar.zza();
        boolean z2 = false;
        if (!this.zzK && zzafyVar.zza() == -9223372036854775807L) {
            z2 = true;
        }
        this.zzE = z2;
        this.zzF = true == z2 ? 7 : 1;
        if (this.zzy) {
            this.zzi.zzb(this.zzD, zzafyVar, z2);
        } else {
            zzD();
        }
    }

    final /* synthetic */ void zzH() {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG();
            }
        });
    }

    public final void zza() {
        if (this.zzy) {
            for (zzyb zzybVar : this.zzv) {
                zzybVar.zzj();
            }
        }
        this.zzm.zzg(this);
        this.zzr.removeCallbacksAndMessages(null);
        this.zzs = null;
        this.zzQ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzb(zzwh zzwhVar, long j2) {
        this.zzs = zzwhVar;
        this.zzo.zza();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzf(long j2, boolean z2) {
        if (this.zzA) {
            return;
        }
        zzaa();
        if (zzZ()) {
            return;
        }
        boolean[] zArr = this.zzB.zzc;
        int length = this.zzv.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.zzv[i2].zzw(j2, false, zArr[i2]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zzh() {
        if (this.zzI) {
            this.zzI = false;
        } else {
            if (!this.zzH) {
                return -9223372036854775807L;
            }
            if (!this.zzP && zzX() <= this.zzO) {
                return -9223372036854775807L;
            }
            this.zzH = false;
        }
        return this.zzL;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzwi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzk(long j2, zzmt zzmtVar) {
        long j3;
        boolean z2;
        zzaa();
        if (!this.zzC.zzb()) {
            return 0L;
        }
        zzafw zzafwVarZzc = this.zzC.zzc(j2);
        zzafz zzafzVar = zzafwVarZzc.zza;
        zzafz zzafzVar2 = zzafwVarZzc.zzb;
        long j4 = zzmtVar.zzd;
        if (j4 == 0) {
            if (zzmtVar.zze == 0) {
                return j2;
            }
            j4 = 0;
        }
        String str = zzfj.zza;
        long j5 = j2 - j4;
        long j6 = Long.MAX_VALUE;
        long j7 = (((j4 ^ j2) > 0L ? 1 : ((j4 ^ j2) == 0L ? 0 : -1)) >= 0) | (((j2 ^ j5) > 0L ? 1 : ((j2 ^ j5) == 0L ? 0 : -1)) >= 0) ? j5 : ((j5 >>> 63) ^ 1) + Long.MAX_VALUE;
        long j9 = Long.MIN_VALUE;
        if (j7 == Long.MIN_VALUE) {
            if (j5 == Long.MIN_VALUE) {
                j5 = Long.MIN_VALUE;
                if (j7 == Long.MAX_VALUE) {
                }
            }
        } else if (j7 == Long.MAX_VALUE) {
            j7 = j5 != Long.MAX_VALUE ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        long j10 = zzmtVar.zze;
        long j11 = j2 + j10;
        long j12 = (((j2 ^ j11) > 0L ? 1 : ((j2 ^ j11) == 0L ? 0 : -1)) >= 0) | (((j10 ^ j2) > 0L ? 1 : ((j10 ^ j2) == 0L ? 0 : -1)) < 0) ? j11 : ((j11 >>> 63) ^ 1) + Long.MAX_VALUE;
        if (j12 == Long.MIN_VALUE) {
            if (j11 == Long.MIN_VALUE) {
            }
            j3 = zzafzVar.zzb;
            z2 = j7 > j3 && j3 <= j6;
            long j13 = zzafzVar2.zzb;
            boolean z3 = j7 > j13 && j13 <= j6;
            if (z2 || !z3) {
                if (!z2) {
                    return z3 ? j13 : j7;
                }
                return j3;
            }
            if (Math.abs(j3 - j2) <= Math.abs(j13 - j2)) {
                return j3;
            }
        } else {
            j9 = j11;
        }
        if (j12 == Long.MAX_VALUE) {
            int i2 = (j9 > Long.MAX_VALUE ? 1 : (j9 == Long.MAX_VALUE ? 0 : -1));
        } else {
            j6 = j12;
        }
        j3 = zzafzVar.zzb;
        if (j7 > j3) {
        }
        long j132 = zzafzVar2.zzb;
        if (j7 > j132) {
        }
        if (z2) {
        }
        if (!z2) {
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        if (this.zzP) {
            return false;
        }
        zzabf zzabfVar = this.zzm;
        if (zzabfVar.zzb() || this.zzN) {
            return false;
        }
        if (this.zzy && this.zzJ == 0) {
            return false;
        }
        boolean zZza = this.zzo.zza();
        if (zzabfVar.zze()) {
            return zZza;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzo() {
        for (zzyb zzybVar : this.zzv) {
            zzybVar.zzf();
        }
        this.zzn.zzb();
    }

    final void zzq(int i2) throws IOException {
        this.zzv[i2].zzk();
        zzr();
    }

    final void zzr() throws IOException {
        this.zzm.zzh(zzaaw.zza(this.zzF));
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final zzagh zzu(int i2, int i3) {
        return zzU(new zzxo(i2, false));
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zzw(final zzafy zzafyVar) {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzF(zzafyVar);
            }
        });
    }

    final zzagh zzx() {
        return zzU(new zzxo(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzya
    public final void zzy(zzv zzvVar) {
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzaax
    public final /* bridge */ /* synthetic */ zzaaz zzz(zzabb zzabbVar, long j2, long j3, IOException iOException, int i2) {
        long jMin;
        zzaaz zzaazVarZza;
        zzafy zzafyVar;
        zzxh zzxhVar = (zzxh) zzabbVar;
        zzhy zzhyVarZzf = zzxhVar.zzf();
        zzwb zzwbVar = new zzwb(zzxhVar.zze(), zzxhVar.zzh(), zzhyVarZzf.zzg(), zzhyVarZzf.zzh(), j2, j3, zzhyVarZzf.zzf());
        zzxhVar.zzg();
        String str = zzfj.zza;
        if ((iOException instanceof zzat) || (iOException instanceof FileNotFoundException) || (iOException instanceof zzhp) || (iOException instanceof zzabe)) {
            jMin = -9223372036854775807L;
            break;
        }
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof zzhc) && ((zzhc) cause).zza == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i2 - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            zzaazVarZza = zzabf.zzb;
        } else {
            int iZzX = zzX();
            boolean z2 = iZzX > this.zzO;
            if (this.zzK || !((zzafyVar = this.zzC) == null || zzafyVar.zza() == -9223372036854775807L)) {
                this.zzO = iZzX;
            } else {
                boolean z3 = this.zzy;
                if (!z3 || zzT()) {
                    this.zzH = z3;
                    this.zzL = 0L;
                    this.zzO = 0;
                    for (zzyb zzybVar : this.zzv) {
                        zzybVar.zzg(false);
                    }
                    zzxhVar.zzd(0L, 0L);
                } else {
                    this.zzN = true;
                    zzaazVarZza = zzabf.zza;
                }
            }
            zzaazVarZza = zzabf.zza(z2, jMin);
        }
        boolean zZza = zzaazVarZza.zza();
        this.zzg.zzg(zzwbVar, new zzwg(1, -1, null, 0, null, zzfj.zzp(zzxhVar.zzg()), zzfj.zzp(this.zzD)), iOException, true ^ zZza);
        if (!zZza) {
            zzxhVar.zze();
        }
        return zzaazVarZza;
    }

    public zzxq(Uri uri, zzhb zzhbVar, zzxd zzxdVar, zzto zztoVar, zztj zztjVar, zzaaw zzaawVar, zzwu zzwuVar, zzxi zzxiVar, zzaan zzaanVar, @Nullable String str, int i2, boolean z2, int i3, @Nullable zzv zzvVar, long j2, @Nullable zzabl zzablVar) {
        this.zzd = uri;
        this.zze = zzhbVar;
        this.zzf = zztoVar;
        this.zzh = zztjVar;
        this.zzg = zzwuVar;
        this.zzi = zzxiVar;
        this.zzj = zzaanVar;
        this.zzk = i2;
        this.zzn = zzxdVar;
        this.zzl = j2;
    }

    private final void zzR(int i2) {
        zzaa();
        zzxp zzxpVar = this.zzB;
        boolean[] zArr = zzxpVar.zzd;
        if (!zArr[i2]) {
            zzv zzvVarZza = zzxpVar.zza.zza(i2).zza(0);
            this.zzg.zzh(new zzwg(1, zzas.zzf(zzvVarZza.zzo), zzvVarZza, 0, null, zzfj.zzp(this.zzL), -9223372036854775807L));
            zArr[i2] = true;
        }
    }

    private final void zzS(int i2) {
        zzaa();
        if (this.zzN) {
            if ((!this.zzz || this.zzB.zzb[i2]) && !this.zzv[i2].zzq(false)) {
                this.zzM = 0L;
                this.zzN = false;
                this.zzH = true;
                this.zzL = 0L;
                this.zzO = 0;
                for (zzyb zzybVar : this.zzv) {
                    zzybVar.zzg(false);
                }
                zzwh zzwhVar = this.zzs;
                zzwhVar.getClass();
                zzwhVar.zzs(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final void zzc() throws IOException {
        zzr();
        if (this.zzP && !this.zzy) {
            throw zzat.zzb("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final zzyn zzd() {
        zzaa();
        return this.zzB.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final long zze(zzaac[] zzaacVarArr, boolean[] zArr, zzyc[] zzycVarArr, boolean[] zArr2, long j2) {
        boolean z2;
        zzaac zzaacVar;
        boolean z3;
        boolean z4;
        zzaa();
        zzxp zzxpVar = this.zzB;
        zzyn zzynVar = zzxpVar.zza;
        boolean[] zArr3 = zzxpVar.zzc;
        int i2 = this.zzJ;
        int i3 = 0;
        for (int i5 = 0; i5 < zzaacVarArr.length; i5++) {
            zzyc zzycVar = zzycVarArr[i5];
            if (zzycVar != null && (zzaacVarArr[i5] == null || !zArr[i5])) {
                int iZza = ((zzxn) zzycVar).zza();
                zzgrc.zzi(zArr3[iZza]);
                this.zzJ--;
                zArr3[iZza] = false;
                zzycVarArr[i5] = null;
            }
        }
        if (!this.zzG ? !(j2 == 0 || this.zzA) : i2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        for (int i7 = 0; i7 < zzaacVarArr.length; i7++) {
            if (zzycVarArr[i7] == null && (zzaacVar = zzaacVarArr[i7]) != null) {
                if (zzaacVar.zze() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zzgrc.zzi(z3);
                if (zzaacVar.zzf(0) == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zzgrc.zzi(z4);
                int iZzb = zzynVar.zzb(zzaacVar.zza());
                zzgrc.zzi(!zArr3[iZzb]);
                this.zzJ++;
                zArr3[iZzb] = true;
                this.zzI = zzaacVar.zzc().zzu | this.zzI;
                zzycVarArr[i7] = new zzxn(this, iZzb);
                zArr2[i7] = true;
                if (!z2) {
                    zzyb zzybVar = this.zzv[iZzb];
                    if (zzybVar.zzm() != 0 && !zzybVar.zzt(j2, true)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
        }
        if (this.zzJ == 0) {
            this.zzN = false;
            this.zzH = false;
            this.zzI = false;
            zzabf zzabfVar = this.zzm;
            if (zzabfVar.zze()) {
                zzyb[] zzybVarArr = this.zzv;
                int length = zzybVarArr.length;
                while (i3 < length) {
                    zzybVarArr[i3].zzx();
                    i3++;
                }
                zzabfVar.zzf();
            } else {
                this.zzP = false;
                for (zzyb zzybVar2 : this.zzv) {
                    zzybVar2.zzg(false);
                }
            }
        } else if (z2) {
            j2 = zzj(j2);
            while (i3 < zzycVarArr.length) {
                if (zzycVarArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.zzG = true;
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        long jZzY;
        zzaa();
        if (this.zzP || this.zzJ == 0) {
            return Long.MIN_VALUE;
        }
        if (zzZ()) {
            return this.zzM;
        }
        if (this.zzz) {
            int length = this.zzv.length;
            jZzY = Long.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2++) {
                zzxp zzxpVar = this.zzB;
                if (zzxpVar.zzb[i2] && zzxpVar.zzc[i2] && !this.zzv[i2].zzp()) {
                    jZzY = Math.min(jZzY, this.zzv[i2].zzo());
                }
            }
        } else {
            jZzY = Long.MAX_VALUE;
        }
        if (jZzY == Long.MAX_VALUE) {
            jZzY = zzY(false);
        }
        if (jZzY == Long.MIN_VALUE) {
            return this.zzL;
        }
        return jZzY;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    @Override // com.google.android.gms.internal.ads.zzwi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzj(long j2) {
        zzabf zzabfVar;
        boolean zZzt;
        zzaa();
        boolean[] zArr = this.zzB.zzb;
        if (true != this.zzC.zzb()) {
            j2 = 0;
        }
        this.zzH = false;
        long j3 = this.zzL;
        this.zzL = j2;
        if (zzZ()) {
            this.zzM = j2;
            return j2;
        }
        if (this.zzF != 7 && (this.zzP || this.zzm.zze())) {
            int length = this.zzv.length;
            for (int i2 = 0; i2 < length; i2++) {
                zzyb zzybVar = this.zzv[i2];
                if (this.zzu[i2].zzf() && (zzybVar.zzm() != 0 || j3 != j2)) {
                    if (this.zzA) {
                        zZzt = zzybVar.zzs(zzybVar.zzl());
                    } else {
                        zZzt = zzybVar.zzt(j2, this.zzP);
                    }
                    if (!zZzt && (zArr[i2] || !this.zzz)) {
                        this.zzN = false;
                        this.zzM = j2;
                        this.zzP = false;
                        this.zzI = false;
                        zzabfVar = this.zzm;
                        if (!zzabfVar.zze()) {
                        }
                    }
                }
            }
        } else {
            this.zzN = false;
            this.zzM = j2;
            this.zzP = false;
            this.zzI = false;
            zzabfVar = this.zzm;
            if (!zzabfVar.zze()) {
                for (zzyb zzybVar2 : this.zzv) {
                    zzybVar2.zzx();
                }
                zzabfVar.zzf();
                return j2;
            }
            zzabfVar.zzc();
            for (zzyb zzybVar3 : this.zzv) {
                zzybVar3.zzg(false);
            }
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzwi, com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        return zzi();
    }

    final boolean zzp(int i2) {
        if (!zzT() && this.zzv[i2].zzq(this.zzP)) {
            return true;
        }
        return false;
    }

    final int zzs(int i2, zzlh zzlhVar, zzih zzihVar, int i3) {
        if (zzT()) {
            return -3;
        }
        zzR(i2);
        int iZzr = this.zzv[i2].zzr(zzlhVar, zzihVar, i3, this.zzP);
        if (iZzr == -3) {
            zzS(i2);
        }
        return iZzr;
    }

    final int zzt(int i2, long j2) {
        if (zzT()) {
            return 0;
        }
        zzR(i2);
        zzyb zzybVar = this.zzv[i2];
        int iZzu = zzybVar.zzu(j2, this.zzP);
        zzybVar.zzv(iZzu);
        if (iZzu == 0) {
            zzS(i2);
            return 0;
        }
        return iZzu;
    }
}
