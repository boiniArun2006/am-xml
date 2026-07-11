package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Stack;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class p implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i, com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f55288p = z.a("qt  ");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f55293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f55294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f55295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f55296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.n f55297i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f55298j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f55299k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f55300l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o[] f55301m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f55302n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f55303o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55291c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Stack f55292d = new Stack();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55289a = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(com.fyber.inneractive.sdk.player.exoplayer2.util.l.f56198a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55290b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(4);

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f55302n;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return r.a(bVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:406:0x0993, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0997, code lost:
    
        if (r2.f55293e == 2) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0999, code lost:
    
        r2.f55293e = 0;
        r2.f55296h = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x099e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j2) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        int i2;
        int i3;
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar;
        s sVarA;
        e hVar;
        boolean z2;
        long j3;
        int iM;
        int iM2;
        int iM3;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar;
        int i5;
        long j4;
        a aVar;
        ArrayList arrayList;
        long[] jArr;
        int[] iArr;
        int[] iArr2;
        long[] jArr2;
        int i7;
        long j5;
        long[] jArr3;
        int i8;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar;
        v vVar;
        v vVar2;
        int i9;
        int i10;
        long[] jArr4;
        int i11;
        int i12;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar2;
        p pVar;
        int i13;
        long jMax;
        int i14;
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar2;
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o oVarB;
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o oVarA;
        int iJ;
        p pVar2 = this;
        int i15 = 8;
        while (true) {
            int i16 = 0;
            if (pVar2.f55292d.isEmpty() || ((a) pVar2.f55292d.peek()).P0 != j2) {
                break;
            }
            a aVar2 = (a) pVar2.f55292d.pop();
            if (aVar2.f55183a == c.f55127C) {
                ArrayList arrayList2 = new ArrayList();
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar3 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.m();
                b bVarC = aVar2.c(c.A0);
                int i17 = 12;
                if (bVarC != null) {
                    boolean z3 = pVar2.f55303o;
                    int i18 = i.f55205a;
                    if (!z3) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = bVarC.P0;
                        nVar2.e(i15);
                        while (true) {
                            int i19 = nVar2.f56208c;
                            int i20 = nVar2.f56207b;
                            if (i19 - i20 < i15) {
                                break;
                            }
                            int iB = nVar2.b();
                            if (nVar2.b() == c.B0) {
                                nVar2.e(i20);
                                int i21 = i20 + iB;
                                nVar2.e(nVar2.f56207b + i17);
                                while (true) {
                                    int i22 = nVar2.f56207b;
                                    if (i22 >= i21) {
                                        break;
                                    }
                                    int iB2 = nVar2.b();
                                    i2 = i15;
                                    if (nVar2.b() == c.C0) {
                                        nVar2.e(i22);
                                        int i23 = i22 + iB2;
                                        nVar2.e(nVar2.f56207b + 8);
                                        ArrayList arrayList3 = new ArrayList();
                                        while (true) {
                                            int i24 = nVar2.f56207b;
                                            if (i24 >= i23) {
                                                break;
                                            }
                                            int i25 = n.f55258a;
                                            int iB3 = nVar2.b() + i24;
                                            int iB4 = nVar2.b();
                                            int i26 = (iB4 >> 24) & 255;
                                            if (i26 == 169 || i26 == 65533) {
                                                int i27 = 16777215 & iB4;
                                                if (i27 == n.f55260c) {
                                                    oVarB = n.a(iB4, nVar2);
                                                } else if (i27 == n.f55258a || i27 == n.f55259b) {
                                                    oVarB = n.b(iB4, nVar2, "TIT2");
                                                } else if (i27 == n.f55265h || i27 == n.f55266i) {
                                                    oVarB = n.b(iB4, nVar2, "TCOM");
                                                } else if (i27 == n.f55261d) {
                                                    oVarB = n.b(iB4, nVar2, "TDRC");
                                                } else if (i27 == n.f55262e) {
                                                    oVarB = n.b(iB4, nVar2, "TPE1");
                                                } else if (i27 == n.f55263f) {
                                                    oVarB = n.b(iB4, nVar2, "TSSE");
                                                } else if (i27 == n.f55264g) {
                                                    oVarB = n.b(iB4, nVar2, "TALB");
                                                } else if (i27 == n.f55267j) {
                                                    oVarB = n.b(iB4, nVar2, "USLT");
                                                } else if (i27 == n.f55268k) {
                                                    oVarB = n.b(iB4, nVar2, "TCON");
                                                } else {
                                                    if (i27 == n.f55271n) {
                                                        oVarB = n.b(iB4, nVar2, "TIT1");
                                                    }
                                                    Log.d("MetadataUtil", "Skipped unknown metadata entry: " + c.a(iB4));
                                                    nVar2.e(iB3);
                                                    oVarA = null;
                                                }
                                                oVarA = oVarB;
                                            } else {
                                                try {
                                                    if (iB4 == n.f55270m) {
                                                        nVar2.e(nVar2.f56207b + 4);
                                                        if (nVar2.b() == c.F0) {
                                                            nVar2.e(nVar2.f56207b + 8);
                                                            iJ = nVar2.j();
                                                        } else {
                                                            Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
                                                            iJ = -1;
                                                        }
                                                        if (iJ > 0) {
                                                            String[] strArr = n.f55257D;
                                                            String str = iJ <= strArr.length ? strArr[iJ - 1] : null;
                                                            if (str != null) {
                                                                oVarA = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s("TCON", null, str);
                                                            } else {
                                                                Log.w("MetadataUtil", "Failed to parse standard genre code");
                                                                oVarA = null;
                                                            }
                                                        }
                                                    } else {
                                                        if (iB4 == n.f55272o) {
                                                            oVarB = n.a(iB4, nVar2, "TPOS");
                                                        } else if (iB4 == n.f55273p) {
                                                            oVarB = n.a(iB4, nVar2, "TRCK");
                                                        } else if (iB4 == n.f55274q) {
                                                            oVarB = n.a(iB4, "TBPM", nVar2, true, false);
                                                        } else if (iB4 == n.f55275r) {
                                                            oVarB = n.a(iB4, "TCMP", nVar2, true, true);
                                                        } else if (iB4 == n.f55269l) {
                                                            oVarA = n.a(nVar2);
                                                        } else if (iB4 == n.f55276s) {
                                                            oVarB = n.b(iB4, nVar2, "TPE2");
                                                        } else if (iB4 == n.f55277t) {
                                                            oVarB = n.b(iB4, nVar2, "TSOT");
                                                        } else if (iB4 == n.f55278u) {
                                                            oVarB = n.b(iB4, nVar2, "TSO2");
                                                        } else if (iB4 == n.f55279v) {
                                                            oVarB = n.b(iB4, nVar2, "TSOA");
                                                        } else if (iB4 == n.f55280w) {
                                                            oVarB = n.b(iB4, nVar2, "TSOP");
                                                        } else if (iB4 == n.f55281x) {
                                                            oVarB = n.b(iB4, nVar2, "TSOC");
                                                        } else if (iB4 == n.f55282y) {
                                                            oVarB = n.a(iB4, "ITUNESADVISORY", nVar2, false, false);
                                                        } else if (iB4 == n.f55283z) {
                                                            oVarB = n.a(iB4, "ITUNESGAPLESS", nVar2, false, true);
                                                        } else if (iB4 == n.f55254A) {
                                                            oVarB = n.b(iB4, nVar2, "TVSHOWSORT");
                                                        } else if (iB4 == n.f55255B) {
                                                            oVarB = n.b(iB4, nVar2, "TVSHOW");
                                                        } else {
                                                            if (iB4 == n.f55256C) {
                                                                oVarB = n.b(iB3, nVar2);
                                                            }
                                                            Log.d("MetadataUtil", "Skipped unknown metadata entry: " + c.a(iB4));
                                                            nVar2.e(iB3);
                                                            oVarA = null;
                                                        }
                                                        oVarA = oVarB;
                                                    }
                                                } finally {
                                                    nVar2.e(iB3);
                                                }
                                            }
                                            if (oVarA != null) {
                                                arrayList3.add(oVarA);
                                            }
                                        }
                                        i3 = -1;
                                        if (!arrayList3.isEmpty()) {
                                            bVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.b(arrayList3);
                                        }
                                    } else {
                                        nVar2.e(nVar2.f56207b + (iB2 - 8));
                                        i15 = i2;
                                    }
                                }
                            } else {
                                nVar2.e(nVar2.f56207b + (iB - 8));
                                i15 = i15;
                                i17 = 12;
                            }
                        }
                    } else {
                        i2 = i15;
                        i3 = -1;
                        bVar2 = null;
                        if (bVar2 != null) {
                            mVar3.a(bVar2);
                        }
                        bVar = bVar2;
                    }
                } else {
                    i2 = i15;
                    i3 = -1;
                    bVar = null;
                }
                long j6 = -9223372036854775807L;
                long j7 = Long.MAX_VALUE;
                int i28 = 0;
                while (i28 < aVar2.f55124R0.size()) {
                    a aVar3 = (a) aVar2.f55124R0.get(i28);
                    if (aVar3.f55183a == c.f55129E && (sVarA = i.a(aVar3, aVar2.c(c.f55128D), -9223372036854775807L, (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null, pVar2.f55303o)) != null) {
                        a aVarB = aVar3.b(c.f55130F).b(c.f55131G).b(c.f55132H);
                        b bVarC2 = aVarB.c(c.q0);
                        if (bVarC2 != null) {
                            hVar = new g(bVarC2);
                        } else {
                            b bVarC3 = aVarB.c(c.f55173r0);
                            if (bVarC3 == null) {
                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Track has no sample table size information");
                            }
                            hVar = new h(bVarC3);
                        }
                        int iA = hVar.a();
                        if (iA == 0) {
                            i8 = i28;
                            j4 = j6;
                            aVar = aVar2;
                            arrayList = arrayList2;
                            mVar = mVar3;
                            j3 = j7;
                            vVar2 = new v(new long[i16], new int[i16], 0, new long[i16], new int[i16]);
                        } else {
                            b bVarC4 = aVarB.c(c.s0);
                            if (bVarC4 == null) {
                                bVarC4 = aVarB.c(c.t0);
                                z2 = 1;
                            } else {
                                z2 = i16;
                            }
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = bVarC4.P0;
                            int i29 = i16;
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = aVarB.c(c.p0).P0;
                            j3 = j7;
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar5 = aVarB.c(c.m0).P0;
                            b bVarC5 = aVarB.c(c.n0);
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar6 = bVarC5 != null ? bVarC5.P0 : null;
                            e eVar = hVar;
                            b bVarC6 = aVarB.c(c.o0);
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar7 = bVarC6 != null ? bVarC6.P0 : null;
                            d dVar = new d(nVar4, nVar3, z2);
                            nVar5.e(12);
                            int iM4 = nVar5.m() - 1;
                            int iM5 = nVar5.m();
                            int iM6 = nVar5.m();
                            if (nVar7 != null) {
                                nVar7.e(12);
                                iM = nVar7.m();
                            } else {
                                iM = i29;
                            }
                            if (nVar6 != null) {
                                nVar6.e(12);
                                iM3 = nVar6.m();
                                if (iM3 > 0) {
                                    iM2 = nVar6.m() - 1;
                                } else {
                                    iM2 = i3;
                                    nVar6 = null;
                                }
                            } else {
                                iM2 = i3;
                                iM3 = i29;
                            }
                            if (eVar.c()) {
                                nVar = nVar6;
                                if ("audio/raw".equals(sVarA.f55310f.f55858f) && iM4 == 0 && iM == 0 && iM3 == 0) {
                                    i5 = 1;
                                }
                                if (i5 != 0) {
                                    long[] jArr5 = new long[iA];
                                    int[] iArr3 = new int[iA];
                                    long[] jArr6 = new long[iA];
                                    int[] iArr4 = new int[iA];
                                    int i30 = iM3;
                                    int iM7 = iM2;
                                    aVar = aVar2;
                                    arrayList = arrayList2;
                                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar8 = nVar7;
                                    long j9 = 0;
                                    j5 = 0;
                                    int i31 = i29;
                                    int i32 = i31;
                                    int i33 = i32;
                                    int iM8 = i33;
                                    int iB5 = iM8;
                                    while (i33 < iA) {
                                        while (i31 == 0) {
                                            if (!dVar.a()) {
                                                throw new IllegalStateException();
                                            }
                                            long j10 = j6;
                                            long j11 = dVar.f55187d;
                                            i31 = dVar.f55186c;
                                            j9 = j11;
                                            j6 = j10;
                                        }
                                        long j12 = j6;
                                        if (nVar8 != null) {
                                            while (iM8 == 0 && iM > 0) {
                                                iM8 = nVar8.m();
                                                iB5 = nVar8.b();
                                                iM--;
                                            }
                                            iM8--;
                                        }
                                        int i34 = iB5;
                                        jArr5[i33] = j9;
                                        int iB6 = eVar.b();
                                        iArr3[i33] = iB6;
                                        if (iB6 > i32) {
                                            i32 = iB6;
                                        }
                                        int i35 = i31;
                                        jArr6[i33] = j5 + ((long) i34);
                                        iArr4[i33] = nVar == null ? 1 : i29;
                                        if (i33 == iM7) {
                                            iArr4[i33] = 1;
                                            i30--;
                                            if (i30 > 0) {
                                                iM7 = nVar.m() - 1;
                                            }
                                        }
                                        j5 += (long) iM6;
                                        iM5--;
                                        if (iM5 == 0 && iM4 > 0) {
                                            iM4--;
                                            iM5 = nVar5.m();
                                            iM6 = nVar5.m();
                                        }
                                        j9 += (long) iArr3[i33];
                                        i31 = i35 - 1;
                                        i33++;
                                        iB5 = i34;
                                        j6 = j12;
                                    }
                                    j4 = j6;
                                    if (iM8 != 0) {
                                        throw new IllegalArgumentException();
                                    }
                                    while (iM > 0) {
                                        if (nVar8.m() != 0) {
                                            throw new IllegalArgumentException();
                                        }
                                        nVar8.b();
                                        iM--;
                                    }
                                    if (i30 != 0 || iM5 != 0 || i31 != 0 || iM4 != 0) {
                                        Log.w("AtomParsers", "Inconsistent stbl box for track " + sVarA.f55305a + ": remainingSynchronizationSamples " + i30 + ", remainingSamplesAtTimestampDelta " + iM5 + ", remainingSamplesInChunk " + i31 + ", remainingTimestampDeltaChanges " + iM4);
                                    }
                                    i7 = i32;
                                    iArr = iArr4;
                                    iArr2 = iArr3;
                                    jArr2 = jArr6;
                                    jArr = jArr5;
                                } else {
                                    j4 = j6;
                                    aVar = aVar2;
                                    arrayList = arrayList2;
                                    int i36 = dVar.f55184a;
                                    long[] jArr7 = new long[i36];
                                    int[] iArr5 = new int[i36];
                                    while (dVar.a()) {
                                        int i37 = dVar.f55185b;
                                        jArr7[i37] = dVar.f55187d;
                                        iArr5[i37] = dVar.f55186c;
                                    }
                                    int iB7 = eVar.b();
                                    long j13 = iM6;
                                    int i38 = 8192 / iB7;
                                    int i39 = i29;
                                    int i40 = i39;
                                    while (i39 < i36) {
                                        int i41 = iArr5[i39];
                                        int i42 = z.f56234a;
                                        i40 += ((i41 + i38) - 1) / i38;
                                        i39++;
                                    }
                                    long[] jArr8 = new long[i40];
                                    int[] iArr6 = new int[i40];
                                    long[] jArr9 = new long[i40];
                                    int[] iArr7 = new int[i40];
                                    int i43 = i29;
                                    int i44 = i43;
                                    int i45 = i44;
                                    int i46 = i45;
                                    while (i43 < i36) {
                                        int i47 = iArr5[i43];
                                        long j14 = jArr7[i43];
                                        int[] iArr8 = iArr5;
                                        int i48 = i47;
                                        int i49 = i36;
                                        int i50 = i44;
                                        int i51 = i43;
                                        int i52 = i46;
                                        while (i48 > 0) {
                                            int iMin = Math.min(i38, i48);
                                            jArr8[i45] = j14;
                                            int i53 = i48;
                                            int i54 = iB7 * iMin;
                                            iArr6[i45] = i54;
                                            int iMax = Math.max(i52, i54);
                                            jArr9[i45] = ((long) i50) * j13;
                                            iArr7[i45] = 1;
                                            j14 += (long) iArr6[i45];
                                            i50 += iMin;
                                            i48 = i53 - iMin;
                                            i45++;
                                            i52 = iMax;
                                        }
                                        int i55 = i51 + 1;
                                        i44 = i50;
                                        i46 = i52;
                                        i43 = i55;
                                        iArr5 = iArr8;
                                        i36 = i49;
                                    }
                                    jArr = jArr8;
                                    iArr = iArr7;
                                    iArr2 = iArr6;
                                    jArr2 = jArr9;
                                    i7 = i46;
                                    j5 = 0;
                                }
                                jArr3 = sVarA.f55313i;
                                if (jArr3 == null && (mVar3.f54985a == (i9 = i3) || mVar3.f54986b == i9)) {
                                    if (jArr3.length == 1 && sVarA.f55306b == 1 && jArr2.length >= 2) {
                                        long j15 = sVarA.f55314j[i29];
                                        long jA = z.a(jArr3[i29], sVarA.f55307c, sVarA.f55308d) + j15;
                                        long j16 = jArr2[i29];
                                        if (j16 <= j15 && j15 < jArr2[1] && jArr2[jArr2.length - 1] < jA && jA <= j5) {
                                            long j17 = j5 - jA;
                                            long jA2 = z.a(j15 - j16, sVarA.f55310f.f55871s, sVarA.f55307c);
                                            long jA3 = z.a(j17, sVarA.f55310f.f55871s, sVarA.f55307c);
                                            if ((jA2 != 0 || jA3 != 0) && jA2 <= 2147483647L && jA3 <= 2147483647L) {
                                                mVar3.f54985a = (int) jA2;
                                                mVar3.f54986b = (int) jA3;
                                                z.a(jArr2, sVarA.f55307c);
                                                vVar = new v(jArr, iArr2, i7, jArr2, iArr);
                                            }
                                            i8 = i28;
                                            mVar = mVar3;
                                        }
                                    } else {
                                        long[] jArr10 = jArr2;
                                        long[] jArr11 = sVarA.f55313i;
                                        if (jArr11.length != 1) {
                                            i10 = 1;
                                        } else if (jArr11[i29] == 0) {
                                            for (int i56 = i29; i56 < jArr10.length; i56++) {
                                                jArr10[i56] = z.a(jArr10[i56] - sVarA.f55314j[i29], 1000000L, sVarA.f55307c);
                                            }
                                            vVar = new v(jArr, iArr2, i7, jArr10, iArr);
                                            i8 = i28;
                                            mVar = mVar3;
                                        } else {
                                            i10 = 1;
                                        }
                                        long[] jArr12 = jArr;
                                        int[] iArr9 = iArr2;
                                        int[] iArr10 = iArr;
                                        boolean z4 = sVarA.f55306b == i10 ? 1 : i29;
                                        int i57 = i29;
                                        int i58 = i57;
                                        int i59 = i58;
                                        int i60 = i59;
                                        while (true) {
                                            long[] jArr13 = sVarA.f55313i;
                                            if (i57 >= jArr13.length) {
                                                break;
                                            }
                                            long j18 = sVarA.f55314j[i57];
                                            if (j18 != -1) {
                                                int i61 = i60;
                                                mVar2 = mVar3;
                                                long jA4 = z.a(jArr13[i57], sVarA.f55307c, sVarA.f55308d);
                                                i12 = i57;
                                                int iA2 = z.a(jArr10, j18, true, true);
                                                int iA3 = z.a(jArr10, j18 + jA4, z4, i29);
                                                int i62 = (iA3 - iA2) + i58;
                                                i60 = i61 | (i59 != iA2 ? 1 : 0);
                                                i58 = i62;
                                                i59 = iA3;
                                            } else {
                                                i12 = i57;
                                                mVar2 = mVar3;
                                            }
                                            i57 = i12 + 1;
                                            mVar3 = mVar2;
                                            i29 = 0;
                                        }
                                        mVar = mVar3;
                                        int i63 = i60 | (i58 != iA ? 1 : 0);
                                        long[] jArr14 = i63 != 0 ? new long[i58] : jArr12;
                                        int[] iArr11 = i63 != 0 ? new int[i58] : iArr9;
                                        if (i63 != 0) {
                                            i7 = 0;
                                        }
                                        int[] iArr12 = i63 != 0 ? new int[i58] : iArr10;
                                        long[] jArr15 = new long[i58];
                                        long j19 = 0;
                                        int i64 = i7;
                                        int i65 = 0;
                                        int i66 = 0;
                                        while (true) {
                                            long[] jArr16 = sVarA.f55313i;
                                            int i67 = i63;
                                            if (i65 >= jArr16.length) {
                                                break;
                                            }
                                            int i68 = i28;
                                            long j20 = sVarA.f55314j[i65];
                                            long j21 = jArr16[i65];
                                            if (j20 != -1) {
                                                long jA5 = z.a(j21, sVarA.f55307c, sVarA.f55308d) + j20;
                                                i11 = i65;
                                                jArr4 = jArr15;
                                                int iA4 = z.a(jArr10, j20, true, true);
                                                int iA5 = z.a(jArr10, jA5, z4, false);
                                                if (i67 != 0) {
                                                    int i69 = iA5 - iA4;
                                                    System.arraycopy(jArr12, iA4, jArr14, i66, i69);
                                                    System.arraycopy(iArr9, iA4, iArr11, i66, i69);
                                                    System.arraycopy(iArr10, iA4, iArr12, i66, i69);
                                                }
                                                int i70 = i64;
                                                while (iA4 < iA5) {
                                                    long j22 = j20;
                                                    jArr4[i66] = z.a(j19, 1000000L, sVarA.f55308d) + z.a(jArr10[iA4] - j22, 1000000L, sVarA.f55307c);
                                                    if (i67 != 0 && iArr11[i66] > i70) {
                                                        i70 = iArr9[iA4];
                                                    }
                                                    i66++;
                                                    iA4++;
                                                    j20 = j22;
                                                }
                                                i64 = i70;
                                            } else {
                                                jArr4 = jArr15;
                                                i11 = i65;
                                            }
                                            j19 += j21;
                                            i65 = i11 + 1;
                                            i63 = i67;
                                            jArr15 = jArr4;
                                            i28 = i68;
                                        }
                                        i8 = i28;
                                        long[] jArr17 = jArr15;
                                        boolean z5 = false;
                                        for (int i71 = 0; i71 < iArr12.length && !z5; i71++) {
                                            z5 |= (iArr12[i71] & 1) != 0;
                                        }
                                        if (!z5) {
                                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("The edited sample sequence does not contain a sync sample.");
                                        }
                                        vVar2 = new v(jArr14, iArr11, i64, jArr17, iArr12);
                                    }
                                    i28 = i13 + 1;
                                    pVar2 = pVar;
                                    j6 = jMax;
                                    mVar3 = mVar;
                                    aVar2 = aVar;
                                    i16 = 0;
                                    i3 = -1;
                                } else {
                                    i8 = i28;
                                    long[] jArr18 = jArr2;
                                    mVar = mVar3;
                                    long[] jArr19 = jArr;
                                    int[] iArr13 = iArr2;
                                    int[] iArr14 = iArr;
                                    z.a(jArr18, sVarA.f55307c);
                                    vVar = new v(jArr19, iArr13, i7, jArr18, iArr14);
                                }
                                vVar2 = vVar;
                            } else {
                                nVar = nVar6;
                            }
                            i5 = i29;
                            if (i5 != 0) {
                            }
                            jArr3 = sVarA.f55313i;
                            if (jArr3 == null) {
                                i8 = i28;
                                long[] jArr182 = jArr2;
                                mVar = mVar3;
                                long[] jArr192 = jArr;
                                int[] iArr132 = iArr2;
                                int[] iArr142 = iArr;
                                z.a(jArr182, sVarA.f55307c);
                                vVar = new v(jArr192, iArr132, i7, jArr182, iArr142);
                                vVar2 = vVar;
                            }
                            i28 = i13 + 1;
                            pVar2 = pVar;
                            j6 = jMax;
                            mVar3 = mVar;
                            aVar2 = aVar;
                            i16 = 0;
                            i3 = -1;
                        }
                        if (vVar2.f55336a != 0) {
                            pVar = this;
                            int i72 = i8;
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = pVar.f55300l.a(i72, sVarA.f55306b);
                            o oVar = new o(sVarA, vVar2, gVarA);
                            int i73 = vVar2.f55339d + 30;
                            com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = sVarA.f55310f;
                            String str2 = oVar2.f55853a;
                            String str3 = oVar2.f55857e;
                            String str4 = oVar2.f55858f;
                            String str5 = oVar2.f55855c;
                            int i74 = oVar2.f55854b;
                            int i75 = oVar2.f55862j;
                            int i76 = oVar2.f55863k;
                            float f3 = oVar2.f55864l;
                            int i77 = oVar2.f55865m;
                            i13 = i72;
                            float f4 = oVar2.f55866n;
                            byte[] bArr = oVar2.f55868p;
                            int i78 = oVar2.f55867o;
                            com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar = oVar2.f55869q;
                            int i79 = oVar2.f55870r;
                            int i80 = oVar2.f55871s;
                            int i81 = oVar2.f55872t;
                            int i82 = oVar2.f55873u;
                            int i83 = oVar2.f55874v;
                            int i84 = oVar2.f55876x;
                            String str6 = oVar2.f55877y;
                            int i85 = oVar2.f55878z;
                            long j23 = oVar2.f55875w;
                            com.fyber.inneractive.sdk.player.exoplayer2.o oVar3 = new com.fyber.inneractive.sdk.player.exoplayer2.o(str2, str3, str4, str5, i74, i73, i75, i76, f3, i77, f4, bArr, i78, cVar, i79, i80, i81, i82, i83, i84, str6, i85, j23, oVar2.f55860h, oVar2.f55861i, oVar2.f55856d);
                            if (sVarA.f55306b == 1) {
                                com.fyber.inneractive.sdk.player.exoplayer2.extractor.m mVar4 = mVar;
                                int i86 = mVar4.f54985a;
                                if (i86 != -1 && (i14 = mVar4.f54986b) != -1) {
                                    oVar3 = new com.fyber.inneractive.sdk.player.exoplayer2.o(str2, str3, str4, str5, i74, i73, i75, i76, f3, i77, f4, bArr, i78, cVar, i79, i80, i81, i86, i14, i84, str6, i85, j23, oVar3.f55860h, oVar3.f55861i, oVar3.f55856d);
                                }
                                if (bVar != null) {
                                    mVar = mVar4;
                                    oVar3 = new com.fyber.inneractive.sdk.player.exoplayer2.o(oVar3.f55853a, oVar3.f55857e, oVar3.f55858f, oVar3.f55855c, oVar3.f55854b, oVar3.f55859g, oVar3.f55862j, oVar3.f55863k, oVar3.f55864l, oVar3.f55865m, oVar3.f55866n, oVar3.f55868p, oVar3.f55867o, oVar3.f55869q, oVar3.f55870r, oVar3.f55871s, oVar3.f55872t, oVar3.f55873u, oVar3.f55874v, oVar3.f55876x, oVar3.f55877y, oVar3.f55878z, oVar3.f55875w, oVar3.f55860h, oVar3.f55861i, bVar);
                                } else {
                                    mVar = mVar4;
                                }
                            }
                            gVarA.a(oVar3);
                            jMax = Math.max(j4, sVarA.f55309e);
                            arrayList2 = arrayList;
                            arrayList2.add(oVar);
                            long j24 = vVar2.f55337b[0];
                            j7 = j24 < j3 ? j24 : j3;
                        }
                        i28 = i13 + 1;
                        pVar2 = pVar;
                        j6 = jMax;
                        mVar3 = mVar;
                        aVar2 = aVar;
                        i16 = 0;
                        i3 = -1;
                    } else {
                        i8 = i28;
                        j4 = j6;
                        aVar = aVar2;
                        arrayList = arrayList2;
                        mVar = mVar3;
                        j3 = j7;
                    }
                    pVar = this;
                    j7 = j3;
                    arrayList2 = arrayList;
                    jMax = j4;
                    i13 = i8;
                    i28 = i13 + 1;
                    pVar2 = pVar;
                    j6 = jMax;
                    mVar3 = mVar;
                    aVar2 = aVar;
                    i16 = 0;
                    i3 = -1;
                }
                long j25 = j6;
                p pVar3 = pVar2;
                pVar3.f55302n = j25;
                pVar3.f55301m = (o[]) arrayList2.toArray(new o[arrayList2.size()]);
                pVar3.f55300l.b();
                pVar3.f55300l.a(pVar3);
                pVar3.f55292d.clear();
                pVar3.f55293e = 2;
            } else {
                i2 = i15;
                p pVar4 = pVar2;
                if (!pVar4.f55292d.isEmpty()) {
                    ((a) pVar4.f55292d.peek()).f55124R0.add(aVar2);
                }
                pVar2 = pVar4;
            }
            i15 = i2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f55300l = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j2, long j3) {
        int i2;
        this.f55292d.clear();
        this.f55296h = 0;
        this.f55298j = 0;
        this.f55299k = 0;
        if (j2 == 0) {
            this.f55293e = 0;
            this.f55296h = 0;
            return;
        }
        o[] oVarArr = this.f55301m;
        if (oVarArr != null) {
            for (o oVar : oVarArr) {
                v vVar = oVar.f55285b;
                int iA = z.a(vVar.f55340e, j3, false);
                while (true) {
                    i2 = -1;
                    if (iA < 0) {
                        iA = -1;
                        break;
                    } else if ((vVar.f55341f[iA] & 1) != 0) {
                        break;
                    } else {
                        iA--;
                    }
                }
                if (iA != -1) {
                    i2 = iA;
                    break;
                    break;
                }
                iA = z.a(vVar.f55340e, j3, true, false);
                while (iA < vVar.f55340e.length) {
                    if ((vVar.f55341f[iA] & 1) != 0) {
                        i2 = iA;
                        break;
                    }
                    iA++;
                }
                oVar.f55287d = i2;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, EOFException {
        o[] oVarArr;
        boolean z2;
        while (true) {
            int i2 = this.f55293e;
            boolean z3 = false;
            if (i2 == 0) {
                if (this.f55296h == 0) {
                    if (!bVar.b(this.f55291c.f56206a, 0, 8, true)) {
                        return -1;
                    }
                    this.f55296h = 8;
                    this.f55291c.e(0);
                    this.f55295g = this.f55291c.k();
                    this.f55294f = this.f55291c.b();
                }
                if (this.f55295g == 1) {
                    bVar.b(this.f55291c.f56206a, 8, 8, false);
                    this.f55296h += 8;
                    this.f55295g = this.f55291c.n();
                }
                int i3 = this.f55294f;
                if (i3 != c.f55127C && i3 != c.f55129E && i3 != c.f55130F && i3 != c.f55131G && i3 != c.f55132H && i3 != c.f55143Q) {
                    if (i3 != c.f55145S && i3 != c.f55128D && i3 != c.f55146T && i3 != c.f55147U && i3 != c.m0 && i3 != c.n0 && i3 != c.o0 && i3 != c.f55144R && i3 != c.p0 && i3 != c.q0 && i3 != c.f55173r0 && i3 != c.s0 && i3 != c.t0 && i3 != c.f55142P && i3 != c.f55153b && i3 != c.A0) {
                        this.f55297i = null;
                        this.f55293e = 1;
                    } else if (this.f55296h == 8) {
                        long j2 = this.f55295g;
                        if (j2 <= 2147483647L) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n((int) j2);
                            this.f55297i = nVar;
                            System.arraycopy(this.f55291c.f56206a, 0, nVar.f56206a, 0, 8);
                            this.f55293e = 1;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    long j3 = (bVar.f54726c + this.f55295g) - ((long) this.f55296h);
                    this.f55292d.add(new a(this.f55294f, j3));
                    if (this.f55295g == this.f55296h) {
                        c(j3);
                    } else {
                        this.f55293e = 0;
                        this.f55296h = 0;
                    }
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException();
                    }
                    long j4 = Long.MAX_VALUE;
                    int i5 = -1;
                    int i7 = 0;
                    while (true) {
                        oVarArr = this.f55301m;
                        if (i7 >= oVarArr.length) {
                            break;
                        }
                        o oVar2 = oVarArr[i7];
                        int i8 = oVar2.f55287d;
                        v vVar = oVar2.f55285b;
                        if (i8 != vVar.f55336a) {
                            long j5 = vVar.f55337b[i8];
                            if (j5 < j4) {
                                i5 = i7;
                                j4 = j5;
                            }
                        }
                        i7++;
                    }
                    if (i5 == -1) {
                        return -1;
                    }
                    o oVar3 = oVarArr[i5];
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = oVar3.f55286c;
                    int i9 = oVar3.f55287d;
                    v vVar2 = oVar3.f55285b;
                    long j6 = vVar2.f55337b[i9];
                    int i10 = vVar2.f55338c[i9];
                    if (oVar3.f55284a.f55311g == 1) {
                        j6 += 8;
                        i10 -= 8;
                    }
                    long j7 = (j6 - bVar.f54726c) + ((long) this.f55298j);
                    if (j7 >= 0 && j7 < 262144) {
                        bVar.a((int) j7);
                        int i11 = oVar3.f55284a.f55315k;
                        if (i11 == 0) {
                            while (true) {
                                int i12 = this.f55298j;
                                if (i12 >= i10) {
                                    break;
                                }
                                int iA = rVar.a(bVar, i10 - i12, false);
                                this.f55298j += iA;
                                this.f55299k -= iA;
                            }
                        } else {
                            byte[] bArr = this.f55290b.f56206a;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i13 = 4 - i11;
                            while (this.f55298j < i10) {
                                int i14 = this.f55299k;
                                if (i14 == 0) {
                                    bVar.b(this.f55290b.f56206a, i13, i11, false);
                                    this.f55290b.e(0);
                                    this.f55299k = this.f55290b.m();
                                    this.f55289a.e(0);
                                    rVar.a(4, this.f55289a);
                                    this.f55298j += 4;
                                    i10 += i13;
                                } else {
                                    int iA2 = rVar.a(bVar, i14, false);
                                    this.f55298j += iA2;
                                    this.f55299k -= iA2;
                                }
                            }
                        }
                        int i15 = i10;
                        v vVar3 = oVar3.f55285b;
                        rVar.a(vVar3.f55340e[i9], vVar3.f55341f[i9], i15, 0, null);
                        oVar3.f55287d++;
                        this.f55298j = 0;
                        this.f55299k = 0;
                        return 0;
                    }
                    oVar.f55356a = j6;
                    return 1;
                }
                long j9 = this.f55295g;
                int i16 = this.f55296h;
                long j10 = j9 - ((long) i16);
                long j11 = bVar.f54726c + j10;
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f55297i;
                if (nVar2 != null) {
                    bVar.b(nVar2.f56206a, i16, (int) j10, false);
                    if (this.f55294f == c.f55153b) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f55297i;
                        nVar3.e(8);
                        if (nVar3.b() != f55288p) {
                            nVar3.e(nVar3.f56207b + 4);
                            while (nVar3.f56208c - nVar3.f56207b > 0) {
                                if (nVar3.b() == f55288p) {
                                    z2 = true;
                                    break;
                                }
                            }
                            z2 = false;
                            this.f55303o = z2;
                        } else {
                            z2 = true;
                            this.f55303o = z2;
                        }
                    } else if (!this.f55292d.isEmpty()) {
                        ((a) this.f55292d.peek()).Q0.add(new b(this.f55294f, this.f55297i));
                    }
                } else if (j10 < 262144) {
                    bVar.a((int) j10);
                } else {
                    oVar.f55356a = j11;
                    z3 = true;
                }
                c(j11);
                if (z3 && this.f55293e != 2) {
                    return 1;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j2) {
        int i2;
        long j3 = Long.MAX_VALUE;
        for (o oVar : this.f55301m) {
            v vVar = oVar.f55285b;
            int iA = z.a(vVar.f55340e, j2, false);
            while (true) {
                i2 = -1;
                if (iA < 0) {
                    iA = -1;
                    break;
                }
                if ((vVar.f55341f[iA] & 1) != 0) {
                    break;
                }
                iA--;
            }
            if (iA != -1) {
                i2 = iA;
                break;
            }
            iA = z.a(vVar.f55340e, j2, true, false);
            while (iA < vVar.f55340e.length) {
                if ((vVar.f55341f[iA] & 1) != 0) {
                    i2 = iA;
                    break;
                }
                iA++;
            }
            long j4 = vVar.f55337b[i2];
            if (j4 < j3) {
                j3 = j4;
            }
        }
        return j3;
    }
}
