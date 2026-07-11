package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzaup {
    public int zza;
    public zzauk zzb;
    public zzaty zzc;
    public zzaub zzd;

    zzaup() {
        this(new zzaub(1));
    }

    private final long zzg() throws zzaum, zzauo {
        int i2 = ((((~1246322141) & 272302173) | 1841378864) + ((1246322141 & 825937997) | 658822930)) - (-1823634633);
        int i3 = 1600766768 % 649830540;
        int i5 = ((((~680326130) & 1378702392) | 3315809) + ((680326130 & 1913472410) | 739293607)) - 2048099035;
        int i7 = 1743768897 % 152059765;
        int i8 = ((((~973294814) & 1252035530) | 51191353) + ((973294814 & 1755616710) | 889459732)) - 1494176168;
        int i9 = 1861701682 % 1196748250;
        int i10 = ((((~29116548) & 174422021) | 84710160) + ((29116548 & (-1973327347)) | (-1266641286))) - (-1891729929);
        int i11 = 2091729405 % 1207774949;
        int i12 = ((((~80201211) & 1629524354) | 38778411) + ((80201211 & 1977746312) | 382371455)) - 1921480783;
        int i13 = 1050760512 % 184320788;
        int i14 = 0;
        long j2 = 0;
        while (i14 < (i2 ^ i3)) {
            try {
                zzaty zzatyVar = this.zzc;
                zzauk zzaukVar = this.zzb;
                int i15 = i2;
                int i16 = this.zza;
                int i17 = i3;
                this.zza = i16 + 1;
                byte bZza = zzatyVar.zza(zzaukVar, i16);
                int i18 = i8 ^ i9;
                j2 |= ((long) ((i5 ^ i7) & bZza)) << i14;
                if (i14 == i18) {
                    if (bZza > 1) {
                        throw new zzaum();
                    }
                    i14 = i18;
                }
                if ((bZza & (i10 ^ i11)) == 0) {
                    return (j2 >>> 1) ^ (-(1 & j2));
                }
                i14 += i12 ^ i13;
                i2 = i15;
                i3 = i17;
            } catch (IndexOutOfBoundsException e2) {
                throw new zzauo(e2);
            }
        }
        throw new zzaum();
    }

    private static final void zzh(long j2) throws zzaun {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j3 = jArr[0];
        long j4 = jArr[1];
        long j5 = jArr[2];
        long j6 = jArr[3];
        long j7 = jArr[4];
        long j9 = jArr[5];
        if (j2 % ((jArr[6] + (((((~j3) & j4) | j5) + ((j3 & j6) | j7)) - j9)) ^ (jArr[7] % 477127367)) != 0) {
            throw new zzaun();
        }
    }

    public final void zza(long j2) throws zzaun, zzauo {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j3 = jArr[0];
        long j4 = jArr[1];
        long j5 = jArr[2];
        long j6 = jArr[3];
        long j7 = jArr[4];
        long j9 = jArr[5];
        long j10 = jArr[6];
        long j11 = jArr[7];
        zzh(j2);
        long j12 = j2 / ((j10 + (((((~j3) & j4) | j5) + ((j3 & j6) | j7)) - j9)) ^ (j11 % 899334107));
        if (j12 < 0 || j12 > this.zzb.zza.length) {
            throw new zzauo();
        }
        this.zza = (int) j12;
    }

    public final long zzb() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        return ((long) this.zza) * ((jArr[6] + (((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7)) ^ (jArr[7] % 1780695788));
    }

    public final long zzc() throws zzauo {
        try {
            zzaty zzatyVar = this.zzc;
            zzauk zzaukVar = this.zzb;
            this.zza = this.zza + 1;
            return zzatyVar.zza(zzaukVar, r2);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzauo(e2);
        }
    }

    public final int zzd() throws zzauo {
        int i2 = ((((~413360099) & 1621678468) | 84323740) + ((413360099 & 1621644360) | 385888249)) - 1513564466;
        int i3 = 1609416931 % 1031126087;
        int i5 = ((((~978587665) & 1228171537) | 1025392332) + ((978587665 & 1075859857) | 983056096)) - (-1589113644);
        int i7 = 1723578341 % 672563970;
        int i8 = ((((~1163384280) & 546336857) | 505597090) + ((1163384280 & 546323033) | 358992768)) - 1346988633;
        int i9 = 1124734562 % 530406424;
        int i10 = ((((~217161528) & 116398273) | 202500381) + ((217161528 & 316821712) | 269928733)) - 410012058;
        int i11 = 529302443 % 418646579;
        try {
            zzaty zzatyVar = this.zzc;
            zzauk zzaukVar = this.zzb;
            int i12 = this.zza;
            this.zza = i12 + 1;
            int i13 = i2 ^ i3;
            int iZza = zzatyVar.zza(zzaukVar, i12) & i13;
            zzaty zzatyVar2 = this.zzc;
            zzauk zzaukVar2 = this.zzb;
            int i14 = this.zza;
            this.zza = i14 + 1;
            int iZza2 = iZza | ((zzatyVar2.zza(zzaukVar2, i14) & i13) << (i5 ^ i7));
            zzaty zzatyVar3 = this.zzc;
            zzauk zzaukVar3 = this.zzb;
            int i15 = this.zza;
            this.zza = i15 + 1;
            int iZza3 = iZza2 | ((i13 & zzatyVar3.zza(zzaukVar3, i15)) << (i8 ^ i9));
            zzaty zzatyVar4 = this.zzc;
            zzauk zzaukVar4 = this.zzb;
            int i16 = this.zza;
            this.zza = i16 + 1;
            return iZza3 | (zzatyVar4.zza(zzaukVar4, i16) << (i10 ^ i11));
        } catch (IndexOutOfBoundsException e2) {
            throw new zzauo(e2);
        }
    }

    public final long zze() throws zzaum, zzauo {
        return zzg();
    }

    public final zzauk zzf(long j2) throws zzaun, zzauo {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        int i12 = i10 + ((((i3 & (~i2)) | i5) + ((i2 & i7) | i8)) - i9);
        zzh(zzb() + j2);
        int i13 = this.zza;
        long j3 = i13;
        zzauk zzaukVar = this.zzb;
        long j4 = (j2 >> ((i11 % 774318984) ^ i12)) + j3;
        if (j4 > zzaukVar.zza.length || j4 < j3) {
            throw new zzauo();
        }
        try {
            int i14 = (int) j4;
            zzauk zzaukVarZzb = this.zzc.zzb(zzaukVar, i13, i14);
            this.zza = i14;
            return zzaukVarZzb;
        } catch (IndexOutOfBoundsException e2) {
            throw new AssertionError(zzaui.zza("CEiv6BFfPnitUE+D"), e2);
        }
    }

    public zzaup(zzaub zzaubVar) {
        this(zzauk.zzb, 0, new zzatz());
        this.zzd = zzaubVar;
    }

    private zzaup(zzauk zzaukVar, int i2, zzaty zzatyVar) {
        this.zzb = zzaukVar;
        this.zza = i2;
        this.zzc = zzatyVar;
    }

    public zzaup(zzauk zzaukVar, int i2, zzaty zzatyVar, zzaub zzaubVar) {
        this(zzaukVar, i2, zzatyVar);
        this.zzd = zzaubVar;
    }
}
