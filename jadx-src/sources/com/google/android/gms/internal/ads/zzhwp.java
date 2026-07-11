package com.google.android.gms.internal.ads;

import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzhwp extends zzhwo {
    private static final int[] zzc = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    private int zzd;
    private final int[] zze;

    public zzhwp(int i2, byte[] bArr) {
        this.zza = bArr;
        this.zze = zzc;
        this.zzd = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f1, code lost:
    
        if (r2 == 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f3, code lost:
    
        if (r2 == 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f5, code lost:
    
        if (r2 == 3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f7, code lost:
    
        if (r2 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fa, code lost:
    
        r1 = r9 + 1;
        r5[r9] = (byte) (r8 >> 10);
        r9 = r9 + 2;
        r5[r1] = (byte) (r8 >> 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0109, code lost:
    
        r5[r9] = (byte) (r8 >> 4);
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0111, code lost:
    
        r17.zzd = r2;
        r17.zzb = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0115, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [int] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(byte[] bArr, int i2, int i3, boolean z2) {
        boolean z3;
        ?? r2;
        ?? r22;
        int i5 = this.zzd;
        boolean z4 = false;
        if (i5 == 6) {
            return false;
        }
        byte[] bArr2 = this.zza;
        int[] iArr = this.zze;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        ?? r23 = i5;
        while (true) {
            if (i7 >= i3) {
                z3 = z4;
                r2 = r23;
                break;
            }
            if (r23 != 0) {
                z3 = z4;
                r22 = r23;
            } else {
                while (true) {
                    int i10 = i7 + 4;
                    if (i10 > i3) {
                        z3 = z4;
                        break;
                    }
                    z3 = z4;
                    i8 = (iArr[bArr[i7] & UByte.MAX_VALUE] << 18) | (iArr[bArr[i7 + 1] & UByte.MAX_VALUE] << 12) | (iArr[bArr[i7 + 2] & UByte.MAX_VALUE] << 6) | iArr[bArr[i7 + 3] & UByte.MAX_VALUE];
                    if (i8 < 0) {
                        break;
                    }
                    bArr2[i9 + 2] = (byte) i8;
                    bArr2[i9 + 1] = (byte) (i8 >> 8);
                    bArr2[i9] = (byte) (i8 >> 16);
                    i9 += 3;
                    z4 = z3;
                    i7 = i10;
                }
                if (i7 >= i3) {
                    r2 = z3;
                    break;
                }
                r22 = z3;
            }
            int i11 = i7 + 1;
            int i12 = iArr[bArr[i7] & UByte.MAX_VALUE];
            if (r22 != 0) {
                if (r22 == 1) {
                    if (i12 < 0) {
                        if (i12 != -1) {
                            break;
                        }
                    }
                    i12 |= i8 << 6;
                    r22++;
                } else if (r22 == 2) {
                    if (i12 < 0) {
                        if (i12 == -2) {
                            bArr2[i9] = (byte) (i8 >> 4);
                            i9++;
                            r22 = 4;
                        } else if (i12 != -1) {
                            break;
                        }
                    }
                    i12 |= i8 << 6;
                    r22++;
                } else if (r22 != 3) {
                    if (r22 != 4) {
                        if (r22 == 5 && i12 != -1) {
                            break;
                        }
                    } else if (i12 == -2) {
                        r22++;
                    } else if (i12 != -1) {
                        break;
                    }
                } else if (i12 >= 0) {
                    i12 |= i8 << 6;
                    bArr2[i9 + 2] = (byte) i12;
                    bArr2[i9 + 1] = (byte) (i12 >> 8);
                    bArr2[i9] = (byte) (i12 >> 16);
                    i9 += 3;
                    r22 = z3;
                } else if (i12 == -2) {
                    bArr2[i9 + 1] = (byte) (i8 >> 2);
                    bArr2[i9] = (byte) (i8 >> 10);
                    i9 += 2;
                    r22 = 5;
                } else if (i12 != -1) {
                    break;
                }
                i8 = i12;
            } else if (i12 >= 0) {
                r22++;
                i8 = i12;
            } else if (i12 != -1) {
                break;
            }
            i7 = i11;
            z4 = z3;
            r23 = r22;
        }
        this.zzd = 6;
        return z3;
    }
}
