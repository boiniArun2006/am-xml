package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.player.exoplayer2.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f56004a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseBooleanArray f56005b = new SparseBooleanArray();

    /* JADX WARN: Removed duplicated region for block: B:103:0x01de A[PHI: r30
      0x01de: PHI (r30v7 int) = (r30v5 int), (r30v9 int) binds: [B:102:0x01dc, B:95:0x01cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e2 A[PHI: r30
      0x01e2: PHI (r30v6 int) = (r30v5 int), (r30v9 int) binds: [B:104:0x01e0, B:97:0x01cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bd  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j a(com.fyber.inneractive.sdk.player.exoplayer2.a[] aVarArr, z zVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        int[][] iArr;
        int i5;
        boolean z4;
        c cVar;
        int[][][] iArr2;
        int i7;
        int i8;
        y yVar;
        ArrayList arrayList;
        int i9;
        boolean zA;
        boolean z5;
        int i10;
        int i11;
        int i12;
        boolean z6;
        int[] iArr3;
        boolean z7 = true;
        int[] iArr4 = new int[aVarArr.length + 1];
        int length = aVarArr.length + 1;
        y[][] yVarArr = new y[length][];
        int[][][] iArr5 = new int[aVarArr.length + 1][][];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = zVar.f55989a;
            yVarArr[i13] = new y[i14];
            iArr5[i13] = new int[i14][];
        }
        int length2 = aVarArr.length;
        int[] iArr6 = new int[length2];
        for (int i15 = 0; i15 < length2; i15++) {
            aVarArr[i15].getClass();
            iArr6[i15] = 4;
        }
        int i16 = 0;
        while (i16 < zVar.f55989a) {
            y yVar2 = zVar.f55990b[i16];
            int length3 = aVarArr.length;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                if (i17 >= aVarArr.length) {
                    z6 = z7;
                    break;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.a aVar = aVarArr[i17];
                int i19 = 0;
                while (i19 < yVar2.f55985a) {
                    o oVar = yVar2.f55986b[i19];
                    z6 = z7;
                    com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c cVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c) aVar;
                    cVar2.getClass();
                    try {
                        int iB = cVar2.b(cVar2.f55786h, oVar) & 3;
                        if (iB > i18) {
                            if (iB == 3) {
                                length3 = i17;
                                break;
                            }
                            i18 = iB;
                            length3 = i17;
                        }
                        i19++;
                        z7 = z6;
                    } catch (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.f e2) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e2);
                    }
                }
                i17++;
            }
            if (length3 == aVarArr.length) {
                iArr3 = new int[yVar2.f55985a];
            } else {
                com.fyber.inneractive.sdk.player.exoplayer2.a aVar2 = aVarArr[length3];
                int[] iArr7 = new int[yVar2.f55985a];
                for (int i20 = 0; i20 < yVar2.f55985a; i20++) {
                    o oVar2 = yVar2.f55986b[i20];
                    com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c cVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c) aVar2;
                    cVar3.getClass();
                    try {
                        iArr7[i20] = cVar3.b(cVar3.f55786h, oVar2);
                    } catch (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.f e3) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e3);
                    }
                }
                iArr3 = iArr7;
            }
            int i21 = iArr4[length3];
            yVarArr[length3][i21] = yVar2;
            iArr5[length3][i21] = iArr3;
            iArr4[length3] = i21 + 1;
            i16++;
            z7 = z6;
        }
        boolean z9 = z7;
        z[] zVarArr = new z[aVarArr.length];
        int[] iArr8 = new int[aVarArr.length];
        for (int i22 = 0; i22 < aVarArr.length; i22++) {
            int i23 = iArr4[i22];
            zVarArr[i22] = new z((y[]) Arrays.copyOf(yVarArr[i22], i23));
            iArr5[i22] = (int[][]) Arrays.copyOf(iArr5[i22], i23);
            iArr8[i22] = aVarArr[i22].f54527a;
        }
        new z((y[]) Arrays.copyOf(yVarArr[aVarArr.length], iArr4[aVarArr.length]));
        int length4 = aVarArr.length;
        b[] bVarArr = new b[length4];
        c cVar4 = (c) ((d) this).f56003c.get();
        int i24 = 0;
        boolean z10 = false;
        while (i24 < length4) {
            if (2 == aVarArr[i24].f54527a) {
                if (z10) {
                    cVar = cVar4;
                    iArr2 = iArr5;
                    i7 = i24;
                } else {
                    z zVar2 = zVarArr[i24];
                    int[][] iArr9 = iArr5[i24];
                    cVar4.getClass();
                    y yVar3 = null;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = -1;
                    int i29 = -1;
                    while (i25 < zVar2.f55989a) {
                        y yVar4 = zVar2.f55990b[i25];
                        c cVar5 = cVar4;
                        ArrayList arrayList2 = new ArrayList(yVar4.f55985a);
                        int[][][] iArr10 = iArr5;
                        for (int i30 = 0; i30 < yVar4.f55985a; i30++) {
                            arrayList2.add(Integer.valueOf(i30));
                        }
                        int[] iArr11 = iArr9[i25];
                        int i31 = i27;
                        int i32 = i28;
                        int i33 = i24;
                        int iB2 = i32;
                        int i34 = i29;
                        z zVar3 = zVar2;
                        int i35 = i34;
                        y yVar5 = yVar3;
                        int i36 = 0;
                        while (i36 < yVar4.f55985a) {
                            int i37 = i36;
                            if (d.a(iArr11[i36], z9)) {
                                o oVar3 = yVar4.f55986b[i37];
                                if (arrayList2.contains(Integer.valueOf(i37))) {
                                    int i38 = oVar3.f55862j;
                                    yVar = yVar4;
                                    arrayList = arrayList2;
                                    boolean z11 = (i38 == -1 || i38 <= Integer.MAX_VALUE) && ((i11 = oVar3.f55863k) == -1 || i11 <= Integer.MAX_VALUE) && ((i12 = oVar3.f55854b) == -1 || i12 <= Integer.MAX_VALUE);
                                    i9 = !z11 ? 2 : 1;
                                    boolean z12 = z11;
                                    zA = d.a(iArr11[i37], false);
                                    if (zA) {
                                        i9 += 1000;
                                    }
                                    z5 = i9 <= i31;
                                    if (i9 != i31) {
                                        if (oVar3.b() != iB2) {
                                            int iB3 = oVar3.b();
                                            i8 = i31;
                                            i10 = -1;
                                            if (iB3 != -1) {
                                                i10 = iB2 == -1 ? 1 : iB3 - iB2;
                                            } else if (iB2 == -1) {
                                                i10 = 0;
                                            }
                                            z5 = zA || !z12 ? i10 < 0 : i10 > 0;
                                        } else {
                                            i8 = i31;
                                            i10 = -1;
                                            int i39 = oVar3.f55854b;
                                            if (i39 == -1) {
                                                if (i35 == -1) {
                                                }
                                            } else if (i35 != -1) {
                                                i10 = i39 - i35;
                                            }
                                            if (zA) {
                                            }
                                        }
                                        i36 = i37 + 1;
                                        yVar4 = yVar;
                                        arrayList2 = arrayList;
                                        z9 = true;
                                    } else {
                                        i8 = i31;
                                    }
                                    if (!z5) {
                                        i35 = oVar3.f55854b;
                                        iB2 = oVar3.b();
                                        i31 = i9;
                                        i26 = i37;
                                        yVar5 = yVar;
                                    }
                                    i36 = i37 + 1;
                                    yVar4 = yVar;
                                    arrayList2 = arrayList;
                                    z9 = true;
                                } else {
                                    yVar = yVar4;
                                    arrayList = arrayList2;
                                }
                                if (!z11) {
                                }
                                boolean z122 = z11;
                                zA = d.a(iArr11[i37], false);
                                if (zA) {
                                }
                                if (i9 <= i31) {
                                }
                                if (i9 != i31) {
                                }
                                if (!z5) {
                                }
                                i36 = i37 + 1;
                                yVar4 = yVar;
                                arrayList2 = arrayList;
                                z9 = true;
                            } else {
                                i8 = i31;
                                yVar = yVar4;
                                arrayList = arrayList2;
                            }
                            i31 = i8;
                            i36 = i37 + 1;
                            yVar4 = yVar;
                            arrayList2 = arrayList;
                            z9 = true;
                        }
                        int i40 = i31;
                        i25++;
                        i28 = iB2;
                        i24 = i33;
                        i29 = i35;
                        zVar2 = zVar3;
                        cVar4 = cVar5;
                        iArr5 = iArr10;
                        yVar3 = yVar5;
                        i27 = i40;
                        z9 = true;
                    }
                    cVar = cVar4;
                    iArr2 = iArr5;
                    i7 = i24;
                    e eVar = yVar3 == null ? null : new e(yVar3, i26);
                    bVarArr[i7] = eVar;
                    z10 = eVar != null;
                }
                int i41 = zVarArr[i7].f55989a;
            } else {
                cVar = cVar4;
                iArr2 = iArr5;
                i7 = i24;
            }
            i24 = i7 + 1;
            cVar4 = cVar;
            iArr5 = iArr2;
            z9 = true;
        }
        c cVar6 = cVar4;
        int[][][] iArr12 = iArr5;
        boolean z13 = false;
        boolean z14 = false;
        int i42 = 0;
        while (i42 < length4) {
            int i43 = aVarArr[i42].f54527a;
            if (i43 != 1) {
                if (i43 == 2) {
                    z2 = z13;
                    i2 = length4;
                    z3 = z14;
                } else if (i43 != 3) {
                    z zVar4 = zVarArr[i42];
                    int[][] iArr13 = iArr12[i42];
                    cVar6.getClass();
                    y yVar6 = null;
                    int i44 = 0;
                    int i45 = 0;
                    int i46 = 0;
                    while (i44 < zVar4.f55989a) {
                        y yVar7 = zVar4.f55990b[i44];
                        int[] iArr14 = iArr13[i44];
                        boolean z15 = z13;
                        int i47 = length4;
                        int i48 = 0;
                        while (i48 < yVar7.f55985a) {
                            int i49 = i48;
                            if (d.a(iArr14[i48], true)) {
                                int i50 = (yVar7.f55986b[i49].f55876x & 1) != 0 ? 2 : 1;
                                z4 = z14;
                                if (d.a(iArr14[i49], false)) {
                                    i50 += 1000;
                                }
                                if (i50 > i46) {
                                    i46 = i50;
                                    yVar6 = yVar7;
                                    i45 = i49;
                                }
                            } else {
                                z4 = z14;
                            }
                            i48 = i49 + 1;
                            z14 = z4;
                        }
                        i44++;
                        z13 = z15;
                        length4 = i47;
                    }
                    z2 = z13;
                    i2 = length4;
                    z3 = z14;
                    bVarArr[i42] = yVar6 == null ? null : new e(yVar6, i45);
                } else {
                    z2 = z13;
                    i2 = length4;
                    z3 = z14;
                    if (!z2) {
                        z zVar5 = zVarArr[i42];
                        int[][] iArr15 = iArr12[i42];
                        cVar6.getClass();
                        y yVar8 = null;
                        int i51 = 0;
                        int i52 = 0;
                        int i53 = 0;
                        while (i51 < zVar5.f55989a) {
                            y yVar9 = zVar5.f55990b[i51];
                            int[] iArr16 = iArr15[i51];
                            y yVar10 = yVar8;
                            int i54 = 0;
                            while (i54 < yVar9.f55985a) {
                                z zVar6 = zVar5;
                                if (d.a(iArr16[i54], true)) {
                                    int i55 = yVar9.f55986b[i54].f55876x;
                                    boolean z16 = (i55 & 1) != 0;
                                    boolean z17 = (i55 & 2) != 0;
                                    if (!z16) {
                                        i5 = z17 ? 1 : 3;
                                        iArr = iArr15;
                                    }
                                    iArr = iArr15;
                                    if (d.a(iArr16[i54], false)) {
                                        i5 += 1000;
                                    }
                                    if (i5 > i53) {
                                        i53 = i5;
                                        i52 = i54;
                                        yVar10 = yVar9;
                                    }
                                } else {
                                    iArr = iArr15;
                                }
                                i54++;
                                zVar5 = zVar6;
                                iArr15 = iArr;
                            }
                            i51++;
                            yVar8 = yVar10;
                        }
                        e eVar2 = yVar8 == null ? null : new e(yVar8, i52);
                        bVarArr[i42] = eVar2;
                        z14 = z3;
                        z13 = eVar2 != null;
                    }
                }
                z13 = z2;
                z14 = z3;
            } else {
                z2 = z13;
                i2 = length4;
                z3 = z14;
                if (z3) {
                    z13 = z2;
                    z14 = z3;
                } else {
                    z zVar7 = zVarArr[i42];
                    int[][] iArr17 = iArr12[i42];
                    cVar6.getClass();
                    int i56 = 0;
                    int i57 = 0;
                    int i58 = -1;
                    int i59 = -1;
                    while (i56 < zVar7.f55989a) {
                        y yVar11 = zVar7.f55990b[i56];
                        int[] iArr18 = iArr17[i56];
                        int i60 = i59;
                        int i61 = 0;
                        while (i61 < yVar11.f55985a) {
                            int[][] iArr19 = iArr17;
                            if (d.a(iArr18[i61], true)) {
                                o oVar4 = yVar11.f55986b[i61];
                                int i62 = iArr18[i61];
                                i3 = i56;
                                int i63 = (oVar4.f55876x & 1) != 0 ? 2 : 1;
                                if (d.a(i62, false)) {
                                    i63 += 1000;
                                }
                                if (i63 > i57) {
                                    i57 = i63;
                                    i58 = i61;
                                    i60 = i3;
                                }
                            } else {
                                i3 = i56;
                            }
                            i61++;
                            i56 = i3;
                            iArr17 = iArr19;
                        }
                        i56++;
                        i59 = i60;
                    }
                    e eVar3 = i59 == -1 ? null : new e(zVar7.f55990b[i59], i58);
                    bVarArr[i42] = eVar3;
                    z14 = eVar3 != null;
                    z13 = z2;
                }
            }
            i42++;
            length4 = i2;
        }
        for (int i64 = 0; i64 < aVarArr.length; i64++) {
            if (this.f56005b.get(i64)) {
                bVarArr[i64] = null;
            } else {
                z zVar8 = zVarArr[i64];
                Map map = (Map) this.f56004a.get(i64);
                if (!(map != null && map.containsKey(zVar8))) {
                    continue;
                } else {
                    if (((Map) this.f56004a.get(i64)).get(zVar8) != null) {
                        throw new ClassCastException();
                    }
                    bVarArr[i64] = null;
                }
            }
        }
        f fVar = new f(zVarArr);
        t[] tVarArr = new t[aVarArr.length];
        for (int i65 = 0; i65 < aVarArr.length; i65++) {
            tVarArr[i65] = bVarArr[i65] != null ? t.f55992b : null;
        }
        return new j(zVar, new h(bVarArr), fVar, tVarArr);
    }
}
