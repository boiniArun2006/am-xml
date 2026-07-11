package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzoi {
    private static final zzoi zza = new zzoi(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzoi(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z2;
    }

    public static zzoi zza() {
        return zza;
    }

    static zzoi zzb() {
        return new zzoi(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzoi)) {
            return false;
        }
        zzoi zzoiVar = (zzoi) obj;
        int i2 = this.zzb;
        if (i2 == zzoiVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzoiVar.zzc;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzoiVar.zzd;
                    int i5 = this.zzb;
                    for (int i7 = 0; i7 < i5; i7++) {
                        if (objArr[i7].equals(objArr2[i7])) {
                        }
                    }
                    return true;
                }
                if (iArr[i3] != iArr2[i3]) {
                    break;
                }
                i3++;
            }
        }
        return false;
    }

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzf(zzou zzouVar) throws IOException {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzouVar.zzv(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    final void zzj(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zznn.zzb(sb, i2, String.valueOf(this.zzc[i3] >>> 3), this.zzd[i3]);
        }
    }

    private zzoi() {
        this(0, new int[8], new Object[8], true);
    }

    static zzoi zzc(zzoi zzoiVar, zzoi zzoiVar2) {
        int i2 = zzoiVar.zzb + zzoiVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzoiVar.zzc, i2);
        System.arraycopy(zzoiVar2.zzc, 0, iArrCopyOf, zzoiVar.zzb, zzoiVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzoiVar.zzd, i2);
        System.arraycopy(zzoiVar2.zzd, 0, objArrCopyOf, zzoiVar.zzb, zzoiVar2.zzb);
        return new zzoi(i2, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zzm(int i2) {
        int[] iArr = this.zzc;
        if (i2 > iArr.length) {
            int i3 = this.zzb;
            int i5 = i3 + (i3 / 2);
            if (i5 >= i2) {
                i2 = i5;
            }
            if (i2 < 8) {
                i2 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i2);
            this.zzd = Arrays.copyOf(this.zzd, i2);
        }
    }

    public final int hashCode() {
        int i2 = this.zzb;
        int i3 = i2 + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i5 = 17;
        for (int i7 = 0; i7 < i2; i7++) {
            i5 = (i5 * 31) + iArr[i7];
        }
        int i8 = ((i3 * 31) + i5) * 31;
        Object[] objArr = this.zzd;
        int i9 = this.zzb;
        for (int i10 = 0; i10 < i9; i10++) {
            iHashCode = (iHashCode * 31) + objArr[i10].hashCode();
        }
        return i8 + iHashCode;
    }

    final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzg(zzou zzouVar) throws IOException {
        if (this.zzb != 0) {
            for (int i2 = 0; i2 < this.zzb; i2++) {
                int i3 = this.zzc[i2];
                Object obj = this.zzd[i2];
                int i5 = i3 & 7;
                int i7 = i3 >>> 3;
                if (i5 == 0) {
                    zzouVar.zzc(i7, ((Long) obj).longValue());
                } else if (i5 == 1) {
                    zzouVar.zzj(i7, ((Long) obj).longValue());
                } else if (i5 == 2) {
                    zzouVar.zzn(i7, (zzlg) obj);
                } else if (i5 == 3) {
                    zzouVar.zzt(i7);
                    ((zzoi) obj).zzg(zzouVar);
                    zzouVar.zzu(i7);
                } else {
                    if (i5 != 5) {
                        throw new RuntimeException(new zzmp("Protocol message tag had invalid wire type."));
                    }
                    zzouVar.zzk(i7, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int iZzz = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i5 = this.zzc[i3] >>> 3;
            zzlg zzlgVar = (zzlg) this.zzd[i3];
            int iZzz2 = zzll.zzz(8);
            int iZzz3 = zzll.zzz(16) + zzll.zzz(i5);
            int iZzz4 = zzll.zzz(24);
            int iZzc = zzlgVar.zzc();
            iZzz += iZzz2 + iZzz2 + iZzz3 + iZzz4 + zzll.zzz(iZzc) + iZzc;
        }
        this.zze = iZzz;
        return iZzz;
    }

    public final int zzi() {
        int iZzz;
        int iZzA;
        int iZzz2;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i5 = 0; i5 < this.zzb; i5++) {
            int i7 = this.zzc[i5];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.zzd[i5]).getClass();
                    iZzz2 = zzll.zzz(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int i10 = i8 << 3;
                    zzlg zzlgVar = (zzlg) this.zzd[i5];
                    int iZzz3 = zzll.zzz(i10);
                    int iZzc = zzlgVar.zzc();
                    iZzz2 = iZzz3 + zzll.zzz(iZzc) + iZzc;
                } else if (i9 == 3) {
                    int iZzz4 = zzll.zzz(i8 << 3);
                    iZzz = iZzz4 + iZzz4;
                    iZzA = ((zzoi) this.zzd[i5]).zzi();
                } else {
                    if (i9 != 5) {
                        throw new IllegalStateException(new zzmp("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i5]).getClass();
                    iZzz2 = zzll.zzz(i8 << 3) + 4;
                }
                i3 += iZzz2;
            } else {
                int i11 = i8 << 3;
                long jLongValue = ((Long) this.zzd[i5]).longValue();
                iZzz = zzll.zzz(i11);
                iZzA = zzll.zzA(jLongValue);
            }
            iZzz2 = iZzz + iZzA;
            i3 += iZzz2;
        }
        this.zze = i3;
        return i3;
    }

    final zzoi zzl(zzoi zzoiVar) {
        if (zzoiVar.equals(zza)) {
            return this;
        }
        zze();
        int i2 = this.zzb + zzoiVar.zzb;
        zzm(i2);
        System.arraycopy(zzoiVar.zzc, 0, this.zzc, this.zzb, zzoiVar.zzb);
        System.arraycopy(zzoiVar.zzd, 0, this.zzd, this.zzb, zzoiVar.zzb);
        this.zzb = i2;
        return this;
    }

    final void zzk(int i2, Object obj) {
        zze();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i3 = this.zzb;
        iArr[i3] = i2;
        this.zzd[i3] = obj;
        this.zzb = i3 + 1;
    }
}
