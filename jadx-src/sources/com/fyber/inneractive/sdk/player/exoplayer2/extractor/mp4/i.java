package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f55205a = z.a("vide");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f55206b = z.a("soun");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f55207c = z.a("text");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f55208d = z.a("sbtl");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f55209e = z.a("subt");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f55210f = z.a("clcp");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f55211g = z.a("cenc");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f55212h = z.a("meta");

    /* JADX WARN: Removed duplicated region for block: B:365:0x06b1 A[PHI: r25 r27 r33
      0x06b1: PHI (r25v7 int) = (r25v5 int), (r25v5 int), (r25v9 int) binds: [B:370:0x06cb, B:372:0x06d8, B:364:0x06aa] A[DONT_GENERATE, DONT_INLINE]
      0x06b1: PHI (r27v4 boolean) = (r27v2 boolean), (r27v2 boolean), (r27v6 boolean) binds: [B:370:0x06cb, B:372:0x06d8, B:364:0x06aa] A[DONT_GENERATE, DONT_INLINE]
      0x06b1: PHI (r33v3 byte[]) = (r33v1 byte[]), (r33v1 byte[]), (r33v5 byte[]) binds: [B:370:0x06cb, B:372:0x06d8, B:364:0x06aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x07bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s a(a aVar, b bVar, long j2, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, boolean z2) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        long jK;
        int i2;
        int i3;
        int iB;
        int i5;
        a aVarB;
        s sVar;
        Pair pairCreate;
        b bVarC;
        long j3;
        int i7;
        int i8;
        int i9;
        boolean z3;
        int i10;
        List list;
        int iO;
        int iRound;
        int iM;
        int i11;
        int iIntValue;
        boolean z4;
        String str;
        int i12;
        String str2;
        int i13;
        String str3;
        long j4;
        List listSingletonList;
        int i14 = 8;
        a aVarB2 = aVar.b(c.f55130F);
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = aVarB2.c(c.f55146T).P0;
        nVar.e(16);
        int iB2 = nVar.b();
        boolean z5 = true;
        int i15 = iB2 == f55206b ? 1 : iB2 == f55205a ? 2 : (iB2 == f55207c || iB2 == f55208d || iB2 == f55209e || iB2 == f55210f) ? 3 : iB2 == f55212h ? 4 : -1;
        if (i15 == -1) {
            return null;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = aVar.c(c.f55142P).P0;
        nVar2.e(8);
        int iB3 = (nVar2.b() >> 24) & 255;
        nVar2.e(nVar2.f56207b + (iB3 == 0 ? 8 : 16));
        int iB4 = nVar2.b();
        nVar2.e(nVar2.f56207b + 4);
        int i16 = nVar2.f56207b;
        int i17 = iB3 == 0 ? 4 : 8;
        int i18 = 0;
        while (true) {
            if (i18 >= i17) {
                nVar2.e(nVar2.f56207b + i17);
                break;
            }
            if (nVar2.f56206a[i16 + i18] != -1) {
                jK = iB3 == 0 ? nVar2.k() : nVar2.n();
                if (jK == 0) {
                    break;
                }
            } else {
                i18++;
            }
        }
        jK = -9223372036854775807L;
        nVar2.e(nVar2.f56207b + 16);
        int iB5 = nVar2.b();
        int iB6 = nVar2.b();
        nVar2.e(nVar2.f56207b + 4);
        int iB7 = nVar2.b();
        int iB8 = nVar2.b();
        int i19 = 3;
        if (iB5 == 0 && iB6 == 65536 && iB7 == -65536 && iB8 == 0) {
            i3 = 90;
        } else if (iB5 == 0 && iB6 == -65536 && iB7 == 65536 && iB8 == 0) {
            i3 = 270;
        } else {
            if (iB5 != -65536 || iB6 != 0 || iB7 != 0 || iB8 != -65536) {
                i2 = 0;
                long j5 = j2 != -9223372036854775807L ? jK : j2;
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = bVar.P0;
                nVar3.e(8);
                int iB9 = nVar3.b();
                int i20 = c.f55153b;
                nVar3.e(nVar3.f56207b + (((iB9 >> 24) & 255) != 0 ? 8 : 16));
                long jK2 = nVar3.k();
                long jA = j5 != -9223372036854775807L ? z.a(j5, 1000000L, jK2) : -9223372036854775807L;
                long j6 = jK2;
                a aVarB3 = aVarB2.b(c.f55131G).b(c.f55132H);
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = aVarB2.c(c.f55145S).P0;
                nVar4.e(8);
                int iB10 = (nVar4.b() >> 24) & 255;
                nVar4.e(nVar4.f56207b + (iB10 != 0 ? 8 : 16));
                long jK3 = nVar4.k();
                nVar4.e(nVar4.f56207b + (iB10 != 0 ? 4 : 8));
                int iO2 = nVar4.o();
                Pair pairCreate2 = Pair.create(Long.valueOf(jK3), "" + ((char) (((iO2 >> 10) & 31) + 96)) + ((char) (((iO2 >> 5) & 31) + 96)) + ((char) ((iO2 & 31) + 96)));
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar5 = aVarB3.c(c.f55147U).P0;
                String str4 = (String) pairCreate2.second;
                nVar5.e(12);
                iB = nVar5.b();
                f fVar = new f(iB);
                i5 = 0;
                while (i5 < iB) {
                    int i21 = nVar5.f56207b;
                    int iB11 = nVar5.b();
                    int i22 = i14;
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(iB11 > 0 ? z5 : false, "childAtomSize should be positive");
                    int iB12 = nVar5.b();
                    if (iB12 == c.f55154c || iB12 == c.f55156d || iB12 == c.a0 || iB12 == c.f55166l0 || iB12 == c.f55157e || iB12 == c.f55158f || iB12 == c.f55159g || iB12 == c.f55137K0 || iB12 == c.L0) {
                        j3 = j6;
                        i7 = iB;
                        nVar5.e(i21 + 16);
                        nVar5.e(nVar5.f56207b + 16);
                        int iO3 = nVar5.o();
                        int iO4 = nVar5.o();
                        nVar5.e(nVar5.f56207b + 50);
                        int i23 = nVar5.f56207b;
                        if (iB12 == c.a0) {
                            iB12 = a(nVar5, i21, iB11, fVar, i5);
                            nVar5.e(i23);
                        }
                        float fM = 1.0f;
                        int i24 = -1;
                        boolean z6 = false;
                        String str5 = null;
                        List listSingletonList2 = null;
                        byte[] bArrCopyOfRange = null;
                        while (i23 - i21 < iB11) {
                            nVar5.e(i23);
                            int i25 = nVar5.f56207b;
                            int iB13 = nVar5.b();
                            if (iB13 == 0 && nVar5.f56207b - i21 == iB11) {
                                break;
                            }
                            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(iB13 > 0, "childAtomSize should be positive");
                            int iB14 = nVar5.b();
                            int i26 = i23;
                            if (iB14 == c.f55134I) {
                                if (str5 != null) {
                                    throw new IllegalStateException();
                                }
                                nVar5.e(i25 + 8);
                                com.fyber.inneractive.sdk.player.exoplayer2.video.a aVarA = com.fyber.inneractive.sdk.player.exoplayer2.video.a.a(nVar5);
                                list = aVarA.f56261a;
                                fVar.f55195c = aVarA.f56262b;
                                if (!z6) {
                                    fM = aVarA.f56265e;
                                }
                                str5 = "video/avc";
                            } else if (iB14 != c.f55135J) {
                                if (iB14 == c.M0) {
                                    if (str5 != null) {
                                        throw new IllegalStateException();
                                    }
                                    str5 = iB12 == c.f55137K0 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                } else if (iB14 == c.f55161h) {
                                    if (str5 != null) {
                                        throw new IllegalStateException();
                                    }
                                    str5 = "video/3gpp";
                                } else if (iB14 != c.f55136K) {
                                    if (iB14 != c.j0) {
                                        if (iB14 == c.I0) {
                                            int i27 = i25 + 8;
                                            while (i27 - i25 < iB13) {
                                                nVar5.e(i27);
                                                int iB15 = nVar5.b();
                                                i9 = iB12;
                                                z3 = z6;
                                                if (nVar5.b() == c.J0) {
                                                    bArrCopyOfRange = Arrays.copyOfRange(nVar5.f56206a, i27, iB15 + i27);
                                                    i10 = i19;
                                                } else {
                                                    i27 += iB15;
                                                    iB12 = i9;
                                                    z6 = z3;
                                                }
                                            }
                                            i9 = iB12;
                                            i10 = i19;
                                            bArrCopyOfRange = null;
                                        } else {
                                            i9 = iB12;
                                            z3 = z6;
                                            if (iB14 == c.f55133H0) {
                                                int iJ = nVar5.j();
                                                nVar5.e(nVar5.f56207b + 3);
                                                if (iJ == 0) {
                                                    int iJ2 = nVar5.j();
                                                    if (iJ2 == 0) {
                                                        i10 = i19;
                                                        z6 = z3;
                                                        i24 = 0;
                                                    } else if (iJ2 == 1) {
                                                        i10 = i19;
                                                        z6 = z3;
                                                        i24 = 1;
                                                    } else if (iJ2 != 2) {
                                                        i10 = i19;
                                                        if (iJ2 == i10) {
                                                            i24 = i10;
                                                        }
                                                    } else {
                                                        i10 = i19;
                                                        z6 = z3;
                                                        i24 = 2;
                                                    }
                                                } else {
                                                    i10 = i19;
                                                }
                                            }
                                        }
                                        z6 = z3;
                                        break;
                                    }
                                    nVar5.e(i25 + 8);
                                    i9 = iB12;
                                    fM = nVar5.m() / nVar5.m();
                                    i10 = i19;
                                    z6 = true;
                                    i19 = i10;
                                    i23 = i26 + iB13;
                                    iB12 = i9;
                                } else {
                                    if (str5 != null) {
                                        throw new IllegalStateException();
                                    }
                                    Pair pairA = a(i25, nVar5);
                                    str5 = (String) pairA.first;
                                    listSingletonList2 = Collections.singletonList((byte[]) pairA.second);
                                }
                                i9 = iB12;
                                i10 = i19;
                                i19 = i10;
                                i23 = i26 + iB13;
                                iB12 = i9;
                            } else {
                                if (str5 != null) {
                                    throw new IllegalStateException();
                                }
                                nVar5.e(i25 + 8);
                                com.fyber.inneractive.sdk.player.exoplayer2.video.d dVarA = com.fyber.inneractive.sdk.player.exoplayer2.video.d.a(nVar5);
                                list = dVarA.f56271a;
                                fVar.f55195c = dVarA.f56272b;
                                str5 = "video/hevc";
                            }
                            i9 = iB12;
                            listSingletonList2 = list;
                            i10 = i19;
                            i19 = i10;
                            i23 = i26 + iB13;
                            iB12 = i9;
                        }
                        i8 = i19;
                        if (str5 != null) {
                            fVar.f55194b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(iB4), str5, -1, iO3, iO4, listSingletonList2, i2, fM, bArrCopyOfRange, i24, null, dVar);
                        }
                    } else {
                        if (iB12 == c.f55163j || iB12 == c.b0 || iB12 == c.f55169o || iB12 == c.f55171q || iB12 == c.f55174s || iB12 == c.f55177v || iB12 == c.f55175t || iB12 == c.f55176u || iB12 == c.y0 || iB12 == c.z0 || iB12 == c.f55167m || iB12 == c.f55168n || iB12 == c.f55164k || iB12 == c.O0) {
                            nVar5.e(i21 + 16);
                            if (z2) {
                                iO = nVar5.o();
                                nVar5.e(nVar5.f56207b + 6);
                            } else {
                                nVar5.e(nVar5.f56207b + 8);
                                iO = 0;
                            }
                            if (iO == 0 || iO == 1) {
                                j3 = j6;
                                int iO5 = nVar5.o();
                                nVar5.e(nVar5.f56207b + 6);
                                byte[] bArr = nVar5.f56206a;
                                int i28 = nVar5.f56207b;
                                int i29 = i28 + 1;
                                nVar5.f56207b = i29;
                                int i30 = (bArr[i28] & UByte.MAX_VALUE) << 8;
                                nVar5.f56207b = i28 + 2;
                                int i31 = i30 | (bArr[i29] & UByte.MAX_VALUE);
                                nVar5.f56207b = i28 + 4;
                                if (iO == 1) {
                                    nVar5.e(i28 + 20);
                                }
                                iRound = i31;
                                iM = iO5;
                            } else if (iO == 2) {
                                nVar5.e(nVar5.f56207b + 16);
                                j3 = j6;
                                iRound = (int) Math.round(Double.longBitsToDouble(nVar5.g()));
                                iM = nVar5.m();
                                nVar5.e(nVar5.f56207b + 20);
                            }
                            int i32 = nVar5.f56207b;
                            if (iB12 == c.b0) {
                                iB12 = a(nVar5, i21, iB11, fVar, i5);
                                nVar5.e(i32);
                            }
                            int i33 = i32;
                            byte[] bArr2 = null;
                            int i34 = iM;
                            int i35 = iRound;
                            String str6 = iB12 == c.f55169o ? "audio/ac3" : iB12 == c.f55171q ? "audio/eac3" : iB12 == c.f55174s ? "audio/vnd.dts" : (iB12 == c.f55175t || iB12 == c.f55176u) ? "audio/vnd.dts.hd" : iB12 == c.f55177v ? "audio/vnd.dts.hd;profile=lbr" : iB12 == c.y0 ? "audio/3gpp" : iB12 == c.z0 ? "audio/amr-wb" : (iB12 == c.f55167m || iB12 == c.f55168n) ? "audio/raw" : iB12 == c.f55164k ? "audio/mpeg" : iB12 == c.O0 ? "audio/alac" : null;
                            while (i33 - i21 < iB11) {
                                nVar5.e(i33);
                                int iB16 = nVar5.b();
                                int i36 = i35;
                                com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(iB16 > 0, "childAtomSize should be positive");
                                int iB17 = nVar5.b();
                                int i37 = i34;
                                int i38 = c.f55136K;
                                int i39 = iB;
                                if (iB17 == i38) {
                                    i11 = i36;
                                    iIntValue = i37;
                                    z4 = false;
                                    str = str6;
                                } else if (z2 && iB17 == c.f55165l) {
                                    str = str6;
                                    i11 = i36;
                                    iIntValue = i37;
                                    z4 = false;
                                } else {
                                    if (iB17 == c.f55170p) {
                                        nVar5.e(i33 + 8);
                                        String string = Integer.toString(iB4);
                                        int i40 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f54542b[(nVar5.j() & 192) >> 6];
                                        int iJ3 = nVar5.j();
                                        int i41 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f54544d[(iJ3 & 56) >> 3];
                                        if ((iJ3 & 4) != 0) {
                                            i41++;
                                        }
                                        fVar.f55194b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(string, "audio/ac3", -1, -1, i41, i40, null, dVar, str4);
                                    } else if (iB17 == c.f55172r) {
                                        nVar5.e(i33 + 8);
                                        String string2 = Integer.toString(iB4);
                                        nVar5.e(nVar5.f56207b + 2);
                                        int i42 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f54542b[(nVar5.j() & 192) >> 6];
                                        int iJ4 = nVar5.j();
                                        int i43 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f54544d[(iJ4 & 14) >> 1];
                                        if ((iJ4 & 1) != 0) {
                                            i43++;
                                        }
                                        fVar.f55194b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(string2, "audio/eac3", -1, -1, i43, i42, null, dVar, str4);
                                    } else {
                                        if (iB17 == c.f55178w) {
                                            String str7 = str6;
                                            i11 = i36;
                                            iIntValue = i37;
                                            str = str7;
                                            fVar.f55194b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(iB4), str7, -1, -1, iIntValue, i11, null, dVar, str4);
                                        } else {
                                            str = str6;
                                            i11 = i36;
                                            iIntValue = i37;
                                            if (iB17 == c.O0) {
                                                byte[] bArr3 = new byte[iB16];
                                                nVar5.e(i33);
                                                nVar5.a(bArr3, 0, iB16);
                                                i12 = iB16;
                                                bArr2 = bArr3;
                                                str2 = str;
                                                i33 += i12;
                                                str6 = str2;
                                                i34 = iIntValue;
                                                i35 = i11;
                                                iB = i39;
                                            }
                                        }
                                        i12 = iB16;
                                        str2 = str;
                                        i33 += i12;
                                        str6 = str2;
                                        i34 = iIntValue;
                                        i35 = i11;
                                        iB = i39;
                                    }
                                    str = str6;
                                    i12 = iB16;
                                    i11 = i36;
                                    iIntValue = i37;
                                    str2 = str;
                                    i33 += i12;
                                    str6 = str2;
                                    i34 = iIntValue;
                                    i35 = i11;
                                    iB = i39;
                                }
                                if (iB17 != i38) {
                                    int i44 = nVar5.f56207b;
                                    while (true) {
                                        if (i44 - i33 >= iB16) {
                                            i12 = iB16;
                                            i13 = -1;
                                            break;
                                        }
                                        nVar5.e(i44);
                                        int iB18 = nVar5.b();
                                        i12 = iB16;
                                        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(iB18 > 0 ? true : z4, "childAtomSize should be positive");
                                        int i45 = i44;
                                        if (nVar5.b() == c.f55136K) {
                                            i13 = i45;
                                            break;
                                        }
                                        i44 = i45 + iB18;
                                        iB16 = i12;
                                    }
                                } else {
                                    i12 = iB16;
                                    i13 = i33;
                                }
                                if (i13 != -1) {
                                    Pair pairA2 = a(i13, nVar5);
                                    str2 = (String) pairA2.first;
                                    bArr2 = (byte[]) pairA2.second;
                                    if ("audio/mp4a-latm".equals(str2)) {
                                        Pair pairA3 = com.fyber.inneractive.sdk.player.exoplayer2.util.d.a(bArr2);
                                        int iIntValue2 = ((Integer) pairA3.first).intValue();
                                        iIntValue = ((Integer) pairA3.second).intValue();
                                        i11 = iIntValue2;
                                    }
                                } else {
                                    str2 = str;
                                }
                                i33 += i12;
                                str6 = str2;
                                i34 = iIntValue;
                                i35 = i11;
                                iB = i39;
                            }
                            int i46 = i35;
                            int i47 = i34;
                            i7 = iB;
                            String str8 = str6;
                            if (fVar.f55194b == null && str8 != null) {
                                String str9 = str4;
                                str4 = str9;
                                fVar.f55194b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(iB4), str8, -1, -1, i47, i46, "audio/raw".equals(str8) ? 2 : -1, -1, -1, bArr2 == null ? null : Collections.singletonList(bArr2), dVar, 0, str9, null);
                            }
                            i8 = i19;
                        } else {
                            int i48 = c.k0;
                            if (iB12 == i48 || iB12 == c.u0 || iB12 == c.v0 || iB12 == c.w0 || iB12 == c.f55180x0) {
                                nVar5.e(i21 + 16);
                                String str10 = "application/ttml+xml";
                                if (iB12 == i48) {
                                    str3 = str10;
                                    j4 = Long.MAX_VALUE;
                                    listSingletonList = null;
                                    String str11 = str4;
                                    str4 = str11;
                                    fVar.f55194b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(iB4), str3, 0, str11, -1, dVar, j4, listSingletonList);
                                } else if (iB12 == c.u0) {
                                    int i49 = iB11 - 16;
                                    byte[] bArr4 = new byte[i49];
                                    nVar5.a(bArr4, 0, i49);
                                    listSingletonList = Collections.singletonList(bArr4);
                                    str3 = "application/x-quicktime-tx3g";
                                    j4 = Long.MAX_VALUE;
                                    String str112 = str4;
                                    str4 = str112;
                                    fVar.f55194b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(iB4), str3, 0, str112, -1, dVar, j4, listSingletonList);
                                } else {
                                    if (iB12 == c.v0) {
                                        str10 = "application/x-mp4-vtt";
                                    } else if (iB12 == c.w0) {
                                        str3 = "application/ttml+xml";
                                        j4 = 0;
                                        listSingletonList = null;
                                        String str1122 = str4;
                                        str4 = str1122;
                                        fVar.f55194b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(iB4), str3, 0, str1122, -1, dVar, j4, listSingletonList);
                                    } else {
                                        if (iB12 != c.f55180x0) {
                                            throw new IllegalStateException();
                                        }
                                        fVar.f55196d = 1;
                                        str10 = "application/x-mp4-cea-608";
                                    }
                                    str3 = str10;
                                    j4 = Long.MAX_VALUE;
                                    listSingletonList = null;
                                    String str11222 = str4;
                                    str4 = str11222;
                                    fVar.f55194b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(iB4), str3, 0, str11222, -1, dVar, j4, listSingletonList);
                                }
                            } else if (iB12 == c.N0) {
                                fVar.f55194b = com.fyber.inneractive.sdk.player.exoplayer2.o.a(Integer.toString(iB4), "application/x-camera-motion", dVar);
                            }
                        }
                        j3 = j6;
                        i7 = iB;
                        i8 = i19;
                    }
                    nVar5.e(i21 + iB11);
                    i5++;
                    j6 = j3;
                    i19 = i8;
                    i14 = i22;
                    iB = i7;
                    z5 = true;
                }
                int i50 = i14;
                long j7 = j6;
                aVarB = aVar.b(c.f55143Q);
                if (aVarB != null || (bVarC = aVarB.c(c.f55144R)) == null) {
                    sVar = null;
                    pairCreate = Pair.create(null, null);
                } else {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar6 = bVarC.P0;
                    nVar6.e(i50);
                    int iB19 = (nVar6.b() >> 24) & 255;
                    int iM2 = nVar6.m();
                    long[] jArr = new long[iM2];
                    long[] jArr2 = new long[iM2];
                    for (int i51 = 0; i51 < iM2; i51++) {
                        jArr[i51] = iB19 == 1 ? nVar6.n() : nVar6.k();
                        jArr2[i51] = iB19 == 1 ? nVar6.g() : nVar6.b();
                        byte[] bArr5 = nVar6.f56206a;
                        int i52 = nVar6.f56207b;
                        int i53 = i52 + 1;
                        nVar6.f56207b = i53;
                        int i54 = (bArr5[i52] & UByte.MAX_VALUE) << 8;
                        nVar6.f56207b = i52 + 2;
                        if (((short) ((bArr5[i53] & UByte.MAX_VALUE) | i54)) != 1) {
                            throw new IllegalArgumentException("Unsupported media rate.");
                        }
                        nVar6.e(i52 + 4);
                    }
                    pairCreate = Pair.create(jArr, jArr2);
                    sVar = null;
                }
                return fVar.f55194b != null ? sVar : new s(iB4, i15, ((Long) pairCreate2.first).longValue(), j7, jA, fVar.f55194b, fVar.f55196d, fVar.f55193a, fVar.f55195c, (long[]) pairCreate.first, (long[]) pairCreate.second);
            }
            i3 = 180;
        }
        i2 = i3;
        if (j2 != -9223372036854775807L) {
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar32 = bVar.P0;
        nVar32.e(8);
        int iB92 = nVar32.b();
        int i202 = c.f55153b;
        nVar32.e(nVar32.f56207b + (((iB92 >> 24) & 255) != 0 ? 8 : 16));
        long jK22 = nVar32.k();
        if (j5 != -9223372036854775807L) {
        }
        long j62 = jK22;
        a aVarB32 = aVarB2.b(c.f55131G).b(c.f55132H);
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar42 = aVarB2.c(c.f55145S).P0;
        nVar42.e(8);
        int iB102 = (nVar42.b() >> 24) & 255;
        nVar42.e(nVar42.f56207b + (iB102 != 0 ? 8 : 16));
        long jK32 = nVar42.k();
        nVar42.e(nVar42.f56207b + (iB102 != 0 ? 4 : 8));
        int iO22 = nVar42.o();
        Pair pairCreate22 = Pair.create(Long.valueOf(jK32), "" + ((char) (((iO22 >> 10) & 31) + 96)) + ((char) (((iO22 >> 5) & 31) + 96)) + ((char) ((iO22 & 31) + 96)));
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar52 = aVarB32.c(c.f55147U).P0;
        String str42 = (String) pairCreate22.second;
        nVar52.e(12);
        iB = nVar52.b();
        f fVar2 = new f(iB);
        i5 = 0;
        while (i5 < iB) {
        }
        int i502 = i14;
        long j72 = j62;
        aVarB = aVar.b(c.f55143Q);
        if (aVarB != null) {
            sVar = null;
            pairCreate = Pair.create(null, null);
        }
        if (fVar2.f55194b != null) {
        }
    }

    public static int a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i2, int i3, f fVar, int i5) {
        int i7 = nVar.f56207b;
        while (true) {
            if (i7 - i2 >= i3) {
                return 0;
            }
            nVar.e(i7);
            int iB = nVar.b();
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(iB > 0, "childAtomSize should be positive");
            if (nVar.b() == c.f55149W) {
                int i8 = i7 + 8;
                Pair pairCreate = null;
                boolean z2 = false;
                Integer numValueOf = null;
                t tVar = null;
                while (i8 - i7 < iB) {
                    nVar.e(i8);
                    int iB2 = nVar.b();
                    int iB3 = nVar.b();
                    if (iB3 == c.f55155c0) {
                        numValueOf = Integer.valueOf(nVar.b());
                    } else if (iB3 == c.f55150X) {
                        nVar.e(nVar.f56207b + 4);
                        z2 = nVar.b() == f55211g;
                    } else if (iB3 == c.f55151Y) {
                        int i9 = i8 + 8;
                        while (true) {
                            if (i9 - i8 >= iB2) {
                                tVar = null;
                                break;
                            }
                            nVar.e(i9);
                            int iB4 = nVar.b();
                            if (nVar.b() == c.f55152Z) {
                                nVar.e(nVar.f56207b + 6);
                                nVar.j();
                                int iJ = nVar.j();
                                byte[] bArr = new byte[16];
                                nVar.a(bArr, 0, 16);
                                tVar = new t(iJ, bArr);
                                break;
                            }
                            i9 += iB4;
                        }
                    }
                    i8 += iB2;
                }
                if (z2) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(numValueOf != null, "frma atom is mandatory");
                    com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(tVar != null, "schi->tenc atom is mandatory");
                    pairCreate = Pair.create(numValueOf, tVar);
                }
                if (pairCreate != null) {
                    fVar.f55193a[i5] = (t) pairCreate.second;
                    return ((Integer) pairCreate.first).intValue();
                }
            }
            i7 += iB;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair a(int i2, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        String str;
        nVar.e(i2 + 12);
        nVar.e(nVar.f56207b + 1);
        a(nVar);
        nVar.e(nVar.f56207b + 2);
        int iJ = nVar.j();
        if ((iJ & 128) != 0) {
            nVar.e(nVar.f56207b + 2);
        }
        if ((iJ & 64) != 0) {
            nVar.e(nVar.f56207b + nVar.o());
        }
        if ((iJ & 32) != 0) {
            nVar.e(nVar.f56207b + 2);
        }
        nVar.e(nVar.f56207b + 1);
        a(nVar);
        int iJ2 = nVar.j();
        if (iJ2 == 32) {
            str = "video/mp4v-es";
        } else if (iJ2 == 33) {
            str = "video/avc";
        } else if (iJ2 == 35) {
            str = "video/hevc";
        } else if (iJ2 != 64) {
            str = null;
            if (iJ2 == 107) {
                return Pair.create("audio/mpeg", null);
            }
            if (iJ2 == 165) {
                str = "audio/ac3";
            } else if (iJ2 == 166) {
                str = "audio/eac3";
            } else {
                switch (iJ2) {
                    case 102:
                    case 103:
                    case 104:
                        str = "audio/mp4a-latm";
                        break;
                    default:
                        switch (iJ2) {
                            case 169:
                            case 172:
                                return Pair.create("audio/vnd.dts", null);
                            case 170:
                            case 171:
                                return Pair.create("audio/vnd.dts.hd", null);
                        }
                }
            }
        }
        nVar.e(nVar.f56207b + 12);
        nVar.e(nVar.f56207b + 1);
        int iA = a(nVar);
        byte[] bArr = new byte[iA];
        nVar.a(bArr, 0, iA);
        return Pair.create(str, bArr);
    }

    public static int a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int iJ = nVar.j();
        int i2 = iJ & 127;
        while ((iJ & 128) == 128) {
            iJ = nVar.j();
            i2 = (i2 << 7) | (iJ & 127);
        }
        return i2;
    }
}
