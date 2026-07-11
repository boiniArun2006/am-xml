package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzdp extends zzcr {
    static final zzcr zza = new zzdp(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    private zzdp(Object obj, Object[] objArr, int i2) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // com.google.android.gms.internal.play_billing.zzcr, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i2 = this.zzd;
            Object[] objArr = this.zzb;
            if (i2 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int iZza = zzcg.zza(obj.hashCode());
                        while (true) {
                            int i3 = iZza & length;
                            int i5 = bArr[i3] & UByte.MAX_VALUE;
                            if (i5 == 255) {
                                break;
                            }
                            if (obj.equals(objArr[i5])) {
                                obj2 = objArr[i5 ^ 1];
                                break;
                            }
                            iZza = i3 + 1;
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int iZza2 = zzcg.zza(obj.hashCode());
                        while (true) {
                            int i7 = iZza2 & length2;
                            char c2 = (char) sArr[i7];
                            if (c2 == 65535) {
                                break;
                            }
                            if (obj.equals(objArr[c2])) {
                                obj2 = objArr[c2 ^ 1];
                                break;
                            }
                            iZza2 = i7 + 1;
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int iZza3 = zzcg.zza(obj.hashCode());
                        while (true) {
                            int i8 = iZza3 & length3;
                            int i9 = iArr[i8];
                            if (i9 == -1) {
                                break;
                            }
                            if (obj.equals(objArr[i9])) {
                                obj2 = objArr[i9 ^ 1];
                                break;
                            }
                            iZza3 = i8 + 1;
                        }
                    }
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b1  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzdp zzg(int i2, Object[] objArr, zzcq zzcqVar) {
        boolean z2;
        int i3;
        char c2;
        ?? r3;
        char c4;
        short[] sArr;
        boolean z3;
        int i5;
        ?? r16;
        boolean z4;
        boolean z5;
        int i7 = i2;
        Object[] objArrCopyOf = objArr;
        if (i7 == 0) {
            return (zzdp) zza;
        }
        zzcp zzcpVar = null;
        ?? r32 = 0;
        zzcp zzcpVar2 = null;
        zzcp zzcpVar3 = null;
        boolean z6 = false;
        int i8 = 1;
        if (i7 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            zzbw.zzb(obj, obj2);
            return new zzdp(null, objArrCopyOf, 1);
        }
        zzbe.zzb(i7, objArrCopyOf.length >> 1, "index");
        int iZzh = zzcv.zzh(i7);
        char c5 = 2;
        if (i7 != 1) {
            int i9 = iZzh - 1;
            if (iZzh <= 128) {
                byte[] bArr = new byte[iZzh];
                Arrays.fill(bArr, (byte) -1);
                int i10 = 0;
                int i11 = 0;
                while (i10 < i7) {
                    int i12 = i11 + i11;
                    int i13 = i10 + i10;
                    Object obj3 = objArrCopyOf[i13];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArrCopyOf[i13 ^ i8];
                    Objects.requireNonNull(obj4);
                    zzbw.zzb(obj3, obj4);
                    int iZza = zzcg.zza(obj3.hashCode());
                    while (true) {
                        int i14 = iZza & i9;
                        z3 = z6;
                        i5 = i8;
                        int i15 = bArr[i14] & UByte.MAX_VALUE;
                        if (i15 == 255) {
                            bArr[i14] = (byte) i12;
                            if (i11 < i10) {
                                objArrCopyOf[i12] = obj3;
                                objArrCopyOf[i12 ^ 1] = obj4;
                            }
                            i11++;
                        } else {
                            if (obj3.equals(objArrCopyOf[i15 == true ? 1 : 0])) {
                                int i16 = ~i15;
                                Object obj5 = objArrCopyOf[i16 == true ? 1 : 0];
                                Objects.requireNonNull(obj5);
                                zzcp zzcpVar4 = new zzcp(obj3, obj4, obj5);
                                objArrCopyOf[i16 == true ? 1 : 0] = obj4;
                                zzcpVar2 = zzcpVar4;
                                break;
                            }
                            iZza = i14 + 1;
                            z6 = z3;
                            i8 = i5;
                        }
                    }
                    i10++;
                    z6 = z3;
                    i8 = i5;
                }
                z2 = z6;
                i3 = i8;
                if (i11 == i7) {
                    r32 = bArr;
                    z5 = z2;
                } else {
                    sArr = new Object[3];
                    sArr[z2 ? 1 : 0] = bArr;
                    sArr[i3] = Integer.valueOf(i11);
                    sArr[2] = zzcpVar2;
                    r32 = sArr;
                    z5 = z2;
                }
            } else {
                z2 = false;
                i3 = 1;
                if (iZzh <= 32768) {
                    sArr = new short[iZzh];
                    Arrays.fill(sArr, (short) -1);
                    int i17 = 0;
                    for (int i18 = 0; i18 < i7; i18++) {
                        int i19 = i17 + i17;
                        int i20 = i18 + i18;
                        Object obj6 = objArrCopyOf[i20];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArrCopyOf[i20 ^ 1];
                        Objects.requireNonNull(obj7);
                        zzbw.zzb(obj6, obj7);
                        int iZza2 = zzcg.zza(obj6.hashCode());
                        while (true) {
                            int i21 = iZza2 & i9;
                            char c6 = (char) sArr[i21];
                            if (c6 == 65535) {
                                sArr[i21] = (short) i19;
                                if (i17 < i18) {
                                    objArrCopyOf[i19] = obj6;
                                    objArrCopyOf[i19 ^ 1] = obj7;
                                }
                                i17++;
                            } else {
                                if (obj6.equals(objArrCopyOf[c6])) {
                                    int i22 = c6 ^ 1;
                                    Object obj8 = objArrCopyOf[i22 == true ? 1 : 0];
                                    Objects.requireNonNull(obj8);
                                    zzcp zzcpVar5 = new zzcp(obj6, obj7, obj8);
                                    objArrCopyOf[i22 == true ? 1 : 0] = obj7;
                                    zzcpVar3 = zzcpVar5;
                                    break;
                                }
                                iZza2 = i21 + 1;
                            }
                        }
                    }
                    if (i17 == i7) {
                        r32 = sArr;
                        z5 = z2;
                    } else {
                        r32 = new Object[]{sArr, Integer.valueOf(i17), zzcpVar3};
                        z5 = z2;
                    }
                } else {
                    int[] iArr = new int[iZzh];
                    Arrays.fill(iArr, -1);
                    int i23 = 0;
                    int i24 = 0;
                    while (i23 < i7) {
                        int i25 = i24 + i24;
                        int i26 = i23 + i23;
                        Object obj9 = objArrCopyOf[i26];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i26 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzbw.zzb(obj9, obj10);
                        int iZza3 = zzcg.zza(obj9.hashCode());
                        while (true) {
                            int i27 = iZza3 & i9;
                            int i28 = iArr[i27];
                            if (i28 == -1) {
                                iArr[i27] = i25;
                                if (i24 < i23) {
                                    objArrCopyOf[i25] = obj9;
                                    objArrCopyOf[i25 ^ 1] = obj10;
                                }
                                i24++;
                                c4 = c5;
                            } else {
                                c4 = c5;
                                if (obj9.equals(objArrCopyOf[i28])) {
                                    int i29 = i28 ^ 1;
                                    Object obj11 = objArrCopyOf[i29];
                                    Objects.requireNonNull(obj11);
                                    zzcp zzcpVar6 = new zzcp(obj9, obj10, obj11);
                                    objArrCopyOf[i29] = obj10;
                                    zzcpVar = zzcpVar6;
                                    break;
                                }
                                iZza3 = i27 + 1;
                                c5 = c4;
                            }
                        }
                        i23++;
                        c5 = c4;
                    }
                    c2 = c5;
                    if (i24 == i7) {
                        r3 = iArr;
                        r16 = z2;
                    } else {
                        Object[] objArr2 = new Object[3];
                        objArr2[0] = iArr;
                        objArr2[1] = Integer.valueOf(i24);
                        objArr2[c2] = zzcpVar;
                        r3 = objArr2;
                        r16 = z2;
                    }
                }
            }
            z4 = r3 instanceof Object[];
            ?? r33 = r3;
            if (z4) {
                Object[] objArr3 = (Object[]) r3;
                zzcp zzcpVar7 = (zzcp) objArr3[c2];
                if (zzcqVar == null) {
                    throw zzcpVar7.zza();
                }
                zzcqVar.zzc = zzcpVar7;
                Object obj12 = objArr3[r16];
                int iIntValue = ((Integer) objArr3[i3]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r33 = obj12;
                i7 = iIntValue;
            }
            return new zzdp(r33, objArrCopyOf, i7);
        }
        Object obj13 = objArrCopyOf[0];
        Objects.requireNonNull(obj13);
        Object obj14 = objArrCopyOf[1];
        Objects.requireNonNull(obj14);
        zzbw.zzb(obj13, obj14);
        z5 = false;
        i7 = 1;
        i3 = 1;
        c2 = 2;
        r3 = r32;
        r16 = z5;
        z4 = r3 instanceof Object[];
        ?? r332 = r3;
        if (z4) {
        }
        return new zzdp(r332, objArrCopyOf, i7);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcr
    final zzcj zza() {
        return new zzdo(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcr
    final zzcv zzd() {
        return new zzdm(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcr
    final zzcv zze() {
        return new zzdn(this, new zzdo(this.zzb, 0, this.zzd));
    }
}
