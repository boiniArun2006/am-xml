package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzieg {
    private static final zzieg zza = new zzieg(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzieg(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z2;
    }

    public static zzieg zza() {
        return zza;
    }

    static zzieg zzb() {
        return new zzieg();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzieg)) {
            return false;
        }
        zzieg zziegVar = (zzieg) obj;
        int i2 = this.zzb;
        if (i2 == zziegVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zziegVar.zzc;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zziegVar.zzd;
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

    final void zzf(zzieu zzieuVar) throws IOException {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzieuVar.zzv(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    final void zzj(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zzide.zzb(sb, i2, String.valueOf(this.zzc[i3] >>> 3), this.zzd[i3]);
        }
    }

    private zzieg() {
        this(0, new int[8], new Object[8], true);
    }

    static zzieg zzc(zzieg zziegVar, zzieg zziegVar2) {
        int i2 = zziegVar.zzb + zziegVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zziegVar.zzc, i2);
        System.arraycopy(zziegVar2.zzc, 0, iArrCopyOf, zziegVar.zzb, zziegVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zziegVar.zzd, i2);
        System.arraycopy(zziegVar2.zzd, 0, objArrCopyOf, zziegVar.zzb, zziegVar2.zzb);
        return new zzieg(i2, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zzn(int i2) {
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

    public final void zzg(zzieu zzieuVar) throws IOException {
        if (this.zzb != 0) {
            for (int i2 = 0; i2 < this.zzb; i2++) {
                int i3 = this.zzc[i2];
                Object obj = this.zzd[i2];
                int i5 = i3 & 7;
                int i7 = i3 >>> 3;
                if (i5 == 0) {
                    zzieuVar.zzc(i7, ((Long) obj).longValue());
                } else if (i5 == 1) {
                    zzieuVar.zzj(i7, ((Long) obj).longValue());
                } else if (i5 == 2) {
                    zzieuVar.zzn(i7, (zzian) obj);
                } else if (i5 == 3) {
                    zzieuVar.zzt(i7);
                    ((zzieg) obj).zzg(zzieuVar);
                    zzieuVar.zzu(i7);
                } else {
                    if (i5 != 5) {
                        throw new RuntimeException(new zzicf("Protocol message tag had invalid wire type."));
                    }
                    zzieuVar.zzk(i7, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int iZzA = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i5 = this.zzc[i3] >>> 3;
            zzian zzianVar = (zzian) this.zzd[i3];
            int iZzA2 = zziaw.zzA(8);
            int iZzA3 = zziaw.zzA(16) + zziaw.zzA(i5);
            int iZzA4 = zziaw.zzA(24);
            int iZzc = zzianVar.zzc();
            iZzA += iZzA2 + iZzA2 + iZzA3 + iZzA4 + zziaw.zzA(iZzc) + iZzc;
        }
        this.zze = iZzA;
        return iZzA;
    }

    public final int zzi() {
        int iZzA;
        int iZzB;
        int iZzA2;
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
                    iZzA2 = zziaw.zzA(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int i10 = i8 << 3;
                    zzian zzianVar = (zzian) this.zzd[i5];
                    int iZzA3 = zziaw.zzA(i10);
                    int iZzc = zzianVar.zzc();
                    iZzA2 = iZzA3 + zziaw.zzA(iZzc) + iZzc;
                } else if (i9 == 3) {
                    int iZzA4 = zziaw.zzA(i8 << 3);
                    iZzA = iZzA4 + iZzA4;
                    iZzB = ((zzieg) this.zzd[i5]).zzi();
                } else {
                    if (i9 != 5) {
                        throw new IllegalStateException(new zzicf("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i5]).getClass();
                    iZzA2 = zziaw.zzA(i8 << 3) + 4;
                }
                i3 += iZzA2;
            } else {
                int i11 = i8 << 3;
                long jLongValue = ((Long) this.zzd[i5]).longValue();
                iZzA = zziaw.zzA(i11);
                iZzB = zziaw.zzB(jLongValue);
            }
            iZzA2 = iZzA + iZzB;
            i3 += iZzA2;
        }
        this.zze = i3;
        return i3;
    }

    final zzieg zzm(zzieg zziegVar) {
        if (zziegVar.equals(zza)) {
            return this;
        }
        zze();
        int i2 = this.zzb + zziegVar.zzb;
        zzn(i2);
        System.arraycopy(zziegVar.zzc, 0, this.zzc, this.zzb, zziegVar.zzb);
        System.arraycopy(zziegVar.zzd, 0, this.zzd, this.zzb, zziegVar.zzb);
        this.zzb = i2;
        return this;
    }

    final void zzk(int i2, Object obj) {
        zze();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i3 = this.zzb;
        iArr[i3] = i2;
        this.zzd[i3] = obj;
        this.zzb = i3 + 1;
    }

    final boolean zzl(int i2, zziaq zziaqVar) throws IOException {
        int iZza;
        zze();
        int i3 = i2 & 7;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 5) {
                                zzk(i2, Integer.valueOf(zziaqVar.zzj()));
                                return true;
                            }
                            throw new zzicf("Protocol message tag had invalid wire type.");
                        }
                        zziaqVar.zzI();
                        return false;
                    }
                    zzieg zziegVar = new zzieg();
                    do {
                        iZza = zziaqVar.zza();
                        if (iZza == 0) {
                            break;
                        }
                    } while (zziegVar.zzl(iZza, zziaqVar));
                    zziaqVar.zzb(4 | ((i2 >>> 3) << 3));
                    zzk(i2, zziegVar);
                    return true;
                }
                zzk(i2, zziaqVar.zzn());
                return true;
            }
            zzk(i2, Long.valueOf(zziaqVar.zzi()));
            return true;
        }
        zzk(i2, Long.valueOf(zziaqVar.zzg()));
        return true;
    }
}
