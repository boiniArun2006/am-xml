package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzjk {
    private static final zzjk zza = new zzjk(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzjk(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z2;
    }

    public static zzjk zzc() {
        return zza;
    }

    static zzjk zzf() {
        return new zzjk(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzjk)) {
            return false;
        }
        zzjk zzjkVar = (zzjk) obj;
        int i2 = this.zzb;
        if (i2 == zzjkVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzjkVar.zzc;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzjkVar.zzd;
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

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzi(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zzio.zzb(sb, i2, String.valueOf(this.zzc[i3] >>> 3), this.zzd[i3]);
        }
    }

    final void zzk(zzjw zzjwVar) throws IOException {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzjwVar.zzw(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    private zzjk() {
        this(0, new int[8], new Object[8], true);
    }

    static zzjk zze(zzjk zzjkVar, zzjk zzjkVar2) {
        int i2 = zzjkVar.zzb + zzjkVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzjkVar.zzc, i2);
        System.arraycopy(zzjkVar2.zzc, 0, iArrCopyOf, zzjkVar.zzb, zzjkVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzjkVar.zzd, i2);
        System.arraycopy(zzjkVar2.zzd, 0, objArrCopyOf, zzjkVar.zzb, zzjkVar2.zzb);
        return new zzjk(i2, iArrCopyOf, objArrCopyOf, true);
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

    public final int zza() {
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
                    iZzz2 = zzgr.zzz(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int i10 = i8 << 3;
                    zzgk zzgkVar = (zzgk) this.zzd[i5];
                    int iZzz3 = zzgr.zzz(i10);
                    int iZzd = zzgkVar.zzd();
                    iZzz2 = iZzz3 + zzgr.zzz(iZzd) + iZzd;
                } else if (i9 == 3) {
                    int iZzz4 = zzgr.zzz(i8 << 3);
                    iZzz = iZzz4 + iZzz4;
                    iZzA = ((zzjk) this.zzd[i5]).zza();
                } else {
                    if (i9 != 5) {
                        throw new IllegalStateException(new zzhq("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i5]).getClass();
                    iZzz2 = zzgr.zzz(i8 << 3) + 4;
                }
                i3 += iZzz2;
            } else {
                int i11 = i8 << 3;
                long jLongValue = ((Long) this.zzd[i5]).longValue();
                iZzz = zzgr.zzz(i11);
                iZzA = zzgr.zzA(jLongValue);
            }
            iZzz2 = iZzz + iZzA;
            i3 += iZzz2;
        }
        this.zze = i3;
        return i3;
    }

    public final int zzb() {
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int iZzz = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i5 = this.zzc[i3] >>> 3;
            zzgk zzgkVar = (zzgk) this.zzd[i3];
            int iZzz2 = zzgr.zzz(8);
            int iZzz3 = zzgr.zzz(16) + zzgr.zzz(i5);
            int iZzz4 = zzgr.zzz(24);
            int iZzd = zzgkVar.zzd();
            iZzz += iZzz2 + iZzz2 + iZzz3 + iZzz4 + zzgr.zzz(iZzd) + iZzd;
        }
        this.zze = iZzz;
        return iZzz;
    }

    final zzjk zzd(zzjk zzjkVar) {
        if (zzjkVar.equals(zza)) {
            return this;
        }
        zzg();
        int i2 = this.zzb + zzjkVar.zzb;
        zzm(i2);
        System.arraycopy(zzjkVar.zzc, 0, this.zzc, this.zzb, zzjkVar.zzb);
        System.arraycopy(zzjkVar.zzd, 0, this.zzd, this.zzb, zzjkVar.zzb);
        this.zzb = i2;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzl(zzjw zzjwVar) throws IOException {
        if (this.zzb != 0) {
            for (int i2 = 0; i2 < this.zzb; i2++) {
                int i3 = this.zzc[i2];
                Object obj = this.zzd[i2];
                int i5 = i3 & 7;
                int i7 = i3 >>> 3;
                if (i5 == 0) {
                    zzjwVar.zzt(i7, ((Long) obj).longValue());
                } else if (i5 == 1) {
                    zzjwVar.zzm(i7, ((Long) obj).longValue());
                } else if (i5 == 2) {
                    zzjwVar.zzd(i7, (zzgk) obj);
                } else if (i5 == 3) {
                    zzjwVar.zzF(i7);
                    ((zzjk) obj).zzl(zzjwVar);
                    zzjwVar.zzh(i7);
                } else {
                    if (i5 != 5) {
                        throw new RuntimeException(new zzhq("Protocol message tag had invalid wire type."));
                    }
                    zzjwVar.zzk(i7, ((Integer) obj).intValue());
                }
            }
        }
    }

    final void zzj(int i2, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i3 = this.zzb;
        iArr[i3] = i2;
        this.zzd[i3] = obj;
        this.zzb = i3 + 1;
    }
}
