package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlin.UByte;
import kotlin.UShort;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class zzau<K, V> extends zzan<K, V> {
    private static final zzan<Object, Object> zza = new zzau(null, new Object[0], 0);
    private final transient Object zzb;
    private final transient Object[] zzc;
    private final transient int zzd;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    final zzai<V> zza() {
        return new zzay(this.zzc, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    final boolean zzd() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d5  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <K, V> zzau<K, V> zza(int i2, Object[] objArr, zzaq<K, V> zzaqVar) {
        int iHighestOneBit;
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
            return (zzau) zza;
        }
        zzap zzapVar = null;
        ?? r32 = 0;
        zzap zzapVar2 = null;
        zzap zzapVar3 = null;
        boolean z6 = false;
        int i8 = 1;
        if (i7 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            zzag.zza(obj, obj2);
            return new zzau<>(null, objArrCopyOf, 1);
        }
        zzw.zzb(i7, objArrCopyOf.length >> 1);
        char c5 = 2;
        int iMax = Math.max(i7, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (((double) iHighestOneBit) * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
        } else {
            iHighestOneBit = 1073741824;
            zzw.zza(iMax < 1073741824, "collection too large");
        }
        if (i7 == 1) {
            Object obj3 = objArrCopyOf[0];
            Objects.requireNonNull(obj3);
            Object obj4 = objArrCopyOf[1];
            Objects.requireNonNull(obj4);
            zzag.zza(obj3, obj4);
            z5 = false;
            i3 = 1;
        } else {
            int i9 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i10 = 0;
                int i11 = 0;
                while (i10 < i7) {
                    int i12 = i10 * 2;
                    int i13 = i11 * 2;
                    Object obj5 = objArrCopyOf[i12];
                    Objects.requireNonNull(obj5);
                    Object obj6 = objArrCopyOf[i12 ^ i8];
                    Objects.requireNonNull(obj6);
                    zzag.zza(obj5, obj6);
                    int iZza = zzaf.zza(obj5.hashCode());
                    while (true) {
                        int i14 = iZza & i9;
                        z3 = z6;
                        i5 = i8;
                        int i15 = bArr[i14] & UByte.MAX_VALUE;
                        if (i15 == 255) {
                            bArr[i14] = (byte) i13;
                            if (i11 < i10) {
                                objArrCopyOf[i13] = obj5;
                                objArrCopyOf[i13 ^ 1] = obj6;
                            }
                            i11++;
                        } else {
                            if (obj5.equals(objArrCopyOf[i15 == true ? 1 : 0])) {
                                int i16 = ~i15;
                                Object obj7 = objArrCopyOf[i16 == true ? 1 : 0];
                                Objects.requireNonNull(obj7);
                                zzapVar2 = new zzap(obj5, obj6, obj7);
                                objArrCopyOf[i16 == true ? 1 : 0] = obj6;
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
                    c2 = 2;
                    r3 = bArr;
                    r16 = z2;
                    z4 = r3 instanceof Object[];
                    ?? r33 = r3;
                    if (z4) {
                        Object[] objArr2 = (Object[]) r3;
                        zzap zzapVar4 = (zzap) objArr2[c2];
                        if (zzaqVar == null) {
                            throw zzapVar4.zza();
                        }
                        zzaqVar.zza = zzapVar4;
                        Object obj8 = objArr2[r16];
                        int iIntValue = ((Integer) objArr2[i3]).intValue();
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue << 1);
                        r33 = obj8;
                        i7 = iIntValue;
                    }
                    return new zzau<>(r33, objArrCopyOf, i7);
                }
                sArr = new Object[3];
                sArr[z2 ? 1 : 0] = bArr;
                sArr[i3] = Integer.valueOf(i11);
                sArr[2] = zzapVar2;
                r32 = sArr;
                z5 = z2;
            } else {
                z2 = false;
                i3 = 1;
                if (iHighestOneBit > 32768) {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i17 = 0;
                    int i18 = 0;
                    while (i17 < i7) {
                        int i19 = i17 * 2;
                        int i20 = i18 * 2;
                        Object obj9 = objArrCopyOf[i19];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i19 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzag.zza(obj9, obj10);
                        int iZza2 = zzaf.zza(obj9.hashCode());
                        while (true) {
                            int i21 = iZza2 & i9;
                            int i22 = iArr[i21];
                            if (i22 == -1) {
                                iArr[i21] = i20;
                                if (i18 < i17) {
                                    objArrCopyOf[i20] = obj9;
                                    objArrCopyOf[i20 ^ 1] = obj10;
                                }
                                i18++;
                                c4 = c5;
                            } else {
                                c4 = c5;
                                if (obj9.equals(objArrCopyOf[i22])) {
                                    int i23 = i22 ^ 1;
                                    Object obj11 = objArrCopyOf[i23];
                                    Objects.requireNonNull(obj11);
                                    zzapVar = new zzap(obj9, obj10, obj11);
                                    objArrCopyOf[i23] = obj10;
                                    break;
                                }
                                iZza2 = i21 + 1;
                                c5 = c4;
                            }
                        }
                        i17++;
                        c5 = c4;
                    }
                    c2 = c5;
                    if (i18 == i7) {
                        r3 = iArr;
                        r16 = z2;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i18);
                        objArr3[c2] = zzapVar;
                        r3 = objArr3;
                        r16 = z2;
                    }
                    z4 = r3 instanceof Object[];
                    ?? r332 = r3;
                    if (z4) {
                    }
                    return new zzau<>(r332, objArrCopyOf, i7);
                }
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i24 = 0;
                for (int i25 = 0; i25 < i7; i25++) {
                    int i26 = i25 * 2;
                    int i27 = i24 * 2;
                    Object obj12 = objArrCopyOf[i26];
                    Objects.requireNonNull(obj12);
                    Object obj13 = objArrCopyOf[i26 ^ 1];
                    Objects.requireNonNull(obj13);
                    zzag.zza(obj12, obj13);
                    int iZza3 = zzaf.zza(obj12.hashCode());
                    while (true) {
                        int i28 = iZza3 & i9;
                        int i29 = sArr[i28] & UShort.MAX_VALUE;
                        if (i29 == 65535) {
                            sArr[i28] = (short) i27;
                            if (i24 < i25) {
                                objArrCopyOf[i27] = obj12;
                                objArrCopyOf[i27 ^ 1] = obj13;
                            }
                            i24++;
                        } else {
                            if (obj12.equals(objArrCopyOf[i29 == true ? 1 : 0])) {
                                int i30 = ~i29;
                                Object obj14 = objArrCopyOf[i30 == true ? 1 : 0];
                                Objects.requireNonNull(obj14);
                                zzapVar3 = new zzap(obj12, obj13, obj14);
                                objArrCopyOf[i30 == true ? 1 : 0] = obj13;
                                break;
                            }
                            iZza3 = i28 + 1;
                        }
                    }
                }
                if (i24 == i7) {
                    r32 = sArr;
                    z5 = z2;
                } else {
                    r32 = new Object[]{sArr, Integer.valueOf(i24), zzapVar3};
                    z5 = z2;
                }
            }
        }
        c2 = 2;
        r3 = r32;
        r16 = z5;
        z4 = r3 instanceof Object[];
        ?? r3322 = r3;
        if (z4) {
        }
        return new zzau<>(r3322, objArrCopyOf, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[EDGE_INSN: B:43:0x0009->B:4:0x0009 BREAK  A[LOOP:0: B:15:0x0037->B:21:0x004d], EDGE_INSN: B:45:0x0009->B:4:0x0009 BREAK  A[LOOP:1: B:25:0x0062->B:31:0x0079], EDGE_INSN: B:47:0x0009->B:4:0x0009 BREAK  A[LOOP:2: B:33:0x0088->B:42:0x00a0]] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V get(Object obj) {
        V v2;
        Object obj2 = this.zzb;
        Object[] objArr = this.zzc;
        int i2 = this.zzd;
        if (obj != null) {
            if (i2 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    v2 = (V) objArr[1];
                    Objects.requireNonNull(v2);
                } else {
                    v2 = null;
                }
            } else if (obj2 != null) {
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    int length = bArr.length - 1;
                    int iZza = zzaf.zza(obj.hashCode());
                    while (true) {
                        int i3 = iZza & length;
                        int i5 = bArr[i3] & UByte.MAX_VALUE;
                        if (i5 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i5])) {
                            v2 = (V) objArr[i5 ^ 1];
                            break;
                        }
                        iZza = i3 + 1;
                    }
                } else if (obj2 instanceof short[]) {
                    short[] sArr = (short[]) obj2;
                    int length2 = sArr.length - 1;
                    int iZza2 = zzaf.zza(obj.hashCode());
                    while (true) {
                        int i7 = iZza2 & length2;
                        int i8 = sArr[i7] & UShort.MAX_VALUE;
                        if (i8 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i8])) {
                            v2 = (V) objArr[i8 ^ 1];
                            break;
                        }
                        iZza2 = i7 + 1;
                    }
                } else {
                    int[] iArr = (int[]) obj2;
                    int length3 = iArr.length - 1;
                    int iZza3 = zzaf.zza(obj.hashCode());
                    while (true) {
                        int i9 = iZza3 & length3;
                        int i10 = iArr[i9];
                        if (i10 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i10])) {
                            v2 = (V) objArr[i10 ^ 1];
                            break;
                        }
                        iZza3 = i9 + 1;
                    }
                }
            }
        }
        if (v2 == null) {
            return null;
        }
        return v2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    final zzas<Map.Entry<K, V>> zzb() {
        return new zzat(this, this.zzc, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    final zzas<K> zzc() {
        return new zzav(this, new zzay(this.zzc, 0, this.zzd));
    }

    private zzau(Object obj, Object[] objArr, int i2) {
        this.zzb = obj;
        this.zzc = objArr;
        this.zzd = i2;
    }
}
