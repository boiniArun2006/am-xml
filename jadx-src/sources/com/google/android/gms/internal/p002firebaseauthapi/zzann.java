package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzann {
    private static final zzann zza = new zzann(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzann() {
        this(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzann)) {
            return false;
        }
        zzann zzannVar = (zzann) obj;
        int i2 = this.zzb;
        if (i2 == zzannVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzannVar.zzc;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzannVar.zzd;
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

    public final int zza() {
        int iZze;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i5 = 0; i5 < this.zzb; i5++) {
            int i7 = this.zzc[i5];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 == 0) {
                iZze = zzakg.zze(i8, ((Long) this.zzd[i5]).longValue());
            } else if (i9 == 1) {
                iZze = zzakg.zza(i8, ((Long) this.zzd[i5]).longValue());
            } else if (i9 == 2) {
                iZze = zzakg.zza(i8, (zzajp) this.zzd[i5]);
            } else if (i9 == 3) {
                iZze = (zzakg.zzi(i8) << 1) + ((zzann) this.zzd[i5]).zza();
            } else {
                if (i9 != 5) {
                    throw new IllegalStateException(zzalf.zza());
                }
                iZze = zzakg.zzc(i8, ((Integer) this.zzd[i5]).intValue());
            }
            i3 += iZze;
        }
        this.zze = i3;
        return i3;
    }

    public final int zzb() {
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int iZzb = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            iZzb += zzakg.zzb(this.zzc[i3] >>> 3, (zzajp) this.zzd[i3]);
        }
        this.zze = iZzb;
        return iZzb;
    }

    private zzann(int i2, int[] iArr, Object[] objArr, boolean z2) {
        this.zze = -1;
        this.zzb = i2;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z2;
    }

    public static zzann zzc() {
        return zza;
    }

    static zzann zzd() {
        return new zzann();
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final int hashCode() {
        int i2 = this.zzb;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i5 = 17;
        for (int i7 = 0; i7 < i2; i7++) {
            i5 = (i5 * 31) + iArr[i7];
        }
        int i8 = (i3 + i5) * 31;
        Object[] objArr = this.zzd;
        int i9 = this.zzb;
        for (int i10 = 0; i10 < i9; i10++) {
            iHashCode = (iHashCode * 31) + objArr[i10].hashCode();
        }
        return i8 + iHashCode;
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzb(zzaof zzaofVar) throws IOException {
        if (this.zzb == 0) {
            return;
        }
        if (zzaofVar.zza() == 1) {
            for (int i2 = 0; i2 < this.zzb; i2++) {
                zza(this.zzc[i2], this.zzd[i2], zzaofVar);
            }
            return;
        }
        for (int i3 = this.zzb - 1; i3 >= 0; i3--) {
            zza(this.zzc[i3], this.zzd[i3], zzaofVar);
        }
    }

    final zzann zza(zzann zzannVar) {
        if (zzannVar.equals(zza)) {
            return this;
        }
        zzf();
        int i2 = this.zzb + zzannVar.zzb;
        zza(i2);
        System.arraycopy(zzannVar.zzc, 0, this.zzc, this.zzb, zzannVar.zzb);
        System.arraycopy(zzannVar.zzd, 0, this.zzd, this.zzb, zzannVar.zzb);
        this.zzb = i2;
        return this;
    }

    static zzann zza(zzann zzannVar, zzann zzannVar2) {
        int i2 = zzannVar.zzb + zzannVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzannVar.zzc, i2);
        System.arraycopy(zzannVar2.zzc, 0, iArrCopyOf, zzannVar.zzb, zzannVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzannVar.zzd, i2);
        System.arraycopy(zzannVar2.zzd, 0, objArrCopyOf, zzannVar.zzb, zzannVar2.zzb);
        return new zzann(i2, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zza(int i2) {
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

    final void zza(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zzamh.zza(sb, i2, String.valueOf(this.zzc[i3] >>> 3), this.zzd[i3]);
        }
    }

    final void zza(int i2, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i3 = this.zzb;
        iArr[i3] = i2;
        this.zzd[i3] = obj;
        this.zzb = i3 + 1;
    }

    final void zza(zzaof zzaofVar) throws IOException {
        if (zzaofVar.zza() == 2) {
            for (int i2 = this.zzb - 1; i2 >= 0; i2--) {
                zzaofVar.zza(this.zzc[i2] >>> 3, this.zzd[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.zzb; i3++) {
            zzaofVar.zza(this.zzc[i3] >>> 3, this.zzd[i3]);
        }
    }

    private static void zza(int i2, Object obj, zzaof zzaofVar) throws IOException {
        int i3 = i2 >>> 3;
        int i5 = i2 & 7;
        if (i5 == 0) {
            zzaofVar.zzb(i3, ((Long) obj).longValue());
            return;
        }
        if (i5 == 1) {
            zzaofVar.zza(i3, ((Long) obj).longValue());
            return;
        }
        if (i5 == 2) {
            zzaofVar.zza(i3, (zzajp) obj);
            return;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                zzaofVar.zzb(i3, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzalf.zza());
        }
        if (zzaofVar.zza() == 1) {
            zzaofVar.zzb(i3);
            ((zzann) obj).zzb(zzaofVar);
            zzaofVar.zza(i3);
        } else {
            zzaofVar.zza(i3);
            ((zzann) obj).zzb(zzaofVar);
            zzaofVar.zzb(i3);
        }
    }
}
