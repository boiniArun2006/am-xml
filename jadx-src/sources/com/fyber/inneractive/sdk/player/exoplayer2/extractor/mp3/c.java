package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class c implements i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f55100m = z.a("Xing");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f55101n = z.a("Info");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f55102o = z.a("VBRI");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55103a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f55107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f55108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f55109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.metadata.b f55110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f55111i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f55113k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f55114l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f55104b = new n(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f55105c = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.n();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f55106d = new m();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f55112j = -9223372036854775807L;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return a(bVar, true);
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, boolean z2) throws Throwable {
        int i2;
        int i3;
        int iA;
        int i5 = z2 ? 16384 : 131072;
        bVar.f54728e = 0;
        if (bVar.f54726c == 0) {
            int i7 = 0;
            while (true) {
                bVar.a(this.f55104b.f56206a, 0, 10, false);
                this.f55104b.e(0);
                if (this.f55104b.l() != com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n.f55843b) {
                    break;
                }
                n nVar = this.f55104b;
                nVar.e(nVar.f56207b + 3);
                int i8 = this.f55104b.i();
                int i9 = i8 + 10;
                if (this.f55110h == null) {
                    byte[] bArr = new byte[i9];
                    System.arraycopy(this.f55104b.f56206a, 0, bArr, 0, 10);
                    bVar.a(bArr, 10, i8, false);
                    com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVarA = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n(null).a(i9, bArr);
                    this.f55110h = bVarA;
                    if (bVarA != null) {
                        this.f55106d.a(bVarA);
                    }
                } else {
                    bVar.a(i8, false);
                }
                i7 += i9;
            }
            bVar.f54728e = 0;
            bVar.a(i7, false);
            i2 = (int) (bVar.f54726c + ((long) bVar.f54728e));
            if (!z2) {
                bVar.a(i2);
            }
            i3 = 0;
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i10 = i3;
        int i11 = i10;
        while (true) {
            if (!bVar.a(this.f55104b.f56206a, 0, 4, i3 > 0)) {
                break;
            }
            this.f55104b.e(0);
            int iB = this.f55104b.b();
            if ((i10 == 0 || ((-128000) & iB) == (((long) i10) & (-128000))) && (iA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(iB)) != -1) {
                i3++;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(iB, this.f55105c);
                    i10 = iB;
                }
                bVar.a(iA - 4, false);
            } else {
                int i12 = i11 + 1;
                if (i11 == i5) {
                    if (z2) {
                        return false;
                    }
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Searched too many bytes.");
                }
                if (z2) {
                    bVar.f54728e = 0;
                    bVar.a(i2 + i12, false);
                } else {
                    bVar.a(1);
                }
                i10 = 0;
                i11 = i12;
                i3 = 0;
            }
        }
        if (z2) {
            bVar.a(i2 + i11);
        } else {
            bVar.f54728e = 0;
        }
        this.f55109g = i10;
        return true;
    }

    public final a b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        bVar.a(this.f55104b.f56206a, 0, 4, false);
        this.f55104b.e(0);
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(this.f55104b.b(), this.f55105c);
        return new a(this.f55105c.f55354f, bVar.f54726c, bVar.f54725b);
    }

    public c(long j2) {
        this.f55103a = j2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.f55107e = jVar;
        this.f55108f = jVar.a(0, 1);
        this.f55107e.b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j2, long j3) {
        this.f55109g = 0;
        this.f55112j = -9223372036854775807L;
        this.f55113k = 0L;
        this.f55114l = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, o oVar) throws Throwable {
        long j2;
        long j3;
        int i2;
        b bVarB;
        int iM;
        e eVar;
        int iJ;
        long j4;
        long jMin;
        if (this.f55109g == 0) {
            try {
                a(bVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        int i3 = 1;
        if (this.f55111i == null) {
            n nVar = new n(this.f55105c.f55351c);
            bVar.a(nVar.f56206a, 0, this.f55105c.f55351c, false);
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar2 = this.f55105c;
            if ((nVar2.f55349a & 1) != 0) {
                i2 = nVar2.f55353e != 1 ? 36 : 21;
                if (nVar.f56208c < i2 + 4) {
                    nVar.e(i2);
                    int iB = nVar.b();
                    if (iB != f55100m && iB != f55101n) {
                        if (nVar.f56208c >= 40) {
                            nVar.e(36);
                            int iB2 = nVar.b();
                            int i5 = f55102o;
                            iB = iB2 == i5 ? i5 : 0;
                        }
                    }
                    if (iB != f55100m && iB != f55101n) {
                        if (iB == f55102o) {
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar3 = this.f55105c;
                            long j5 = bVar.f54726c;
                            j2 = 1000000;
                            long j6 = bVar.f54725b;
                            nVar.e(nVar.f56207b + 10);
                            int iB3 = nVar.b();
                            if (iB3 <= 0) {
                                j3 = 0;
                            } else {
                                j3 = 0;
                                int i7 = nVar3.f55352d;
                                long j7 = j6;
                                long jA = z.a(iB3, ((long) (i7 >= 32000 ? 1152 : 576)) * 1000000, i7);
                                int iO = nVar.o();
                                int iO2 = nVar.o();
                                int iO3 = nVar.o();
                                int i8 = 2;
                                nVar.e(nVar.f56207b + 2);
                                long j9 = j5 + ((long) nVar3.f55351c);
                                int i9 = iO + 1;
                                long[] jArr = new long[i9];
                                long[] jArr2 = new long[i9];
                                jArr[0] = 0;
                                jArr2[0] = j9;
                                int i10 = 1;
                                while (i10 < i9) {
                                    if (iO3 == i3) {
                                        iJ = nVar.j();
                                    } else if (iO3 == i8) {
                                        iJ = nVar.o();
                                    } else if (iO3 == 3) {
                                        iJ = nVar.l();
                                    } else if (iO3 == 4) {
                                        iJ = nVar.m();
                                    }
                                    int i11 = i9;
                                    j9 += (long) (iJ * iO2);
                                    int i12 = iO2;
                                    int i13 = iO3;
                                    jArr[i10] = (((long) i10) * jA) / ((long) iO);
                                    if (j7 == -1) {
                                        jMin = j9;
                                        j4 = j7;
                                    } else {
                                        j4 = j7;
                                        jMin = Math.min(j4, j9);
                                    }
                                    jArr2[i10] = jMin;
                                    i10++;
                                    j7 = j4;
                                    iO2 = i12;
                                    i9 = i11;
                                    iO3 = i13;
                                    i8 = 2;
                                    i3 = 1;
                                }
                                bVarB = new d(jArr, jArr2, jA);
                                bVar.a(this.f55105c.f55351c);
                            }
                            bVarB = null;
                            bVar.a(this.f55105c.f55351c);
                        } else {
                            j2 = 1000000;
                            j3 = 0;
                            bVar.f54728e = 0;
                            bVarB = null;
                        }
                    } else {
                        j2 = 1000000;
                        j3 = 0;
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar4 = this.f55105c;
                        long j10 = bVar.f54726c;
                        long j11 = bVar.f54725b;
                        int i14 = nVar4.f55355g;
                        int i15 = nVar4.f55352d;
                        long j12 = j10 + ((long) nVar4.f55351c);
                        int iB4 = nVar.b();
                        if ((iB4 & 1) != 1 || (iM = nVar.m()) == 0) {
                            bVarB = null;
                        } else {
                            long jA2 = z.a(iM, ((long) i14) * 1000000, i15);
                            if ((iB4 & 6) != 6) {
                                eVar = new e(j12, jA2, j11, null, 0L, 0);
                            } else {
                                long jM = nVar.m();
                                nVar.e(nVar.f56207b + 1);
                                long[] jArr3 = new long[99];
                                for (int i16 = 0; i16 < 99; i16++) {
                                    jArr3[i16] = nVar.j();
                                }
                                eVar = new e(j12, jA2, j11, jArr3, jM, nVar4.f55351c);
                            }
                            bVarB = eVar;
                        }
                        if (bVarB != null) {
                            m mVar = this.f55106d;
                            if (mVar.f54985a == -1 || mVar.f54986b == -1) {
                                bVar.f54728e = 0;
                                bVar.a(i2 + 141, false);
                                bVar.a(this.f55104b.f56206a, 0, 3, false);
                                this.f55104b.e(0);
                                m mVar2 = this.f55106d;
                                int iL = this.f55104b.l();
                                mVar2.getClass();
                                int i17 = iL >> 12;
                                int i18 = iL & 4095;
                                if (i17 > 0 || i18 > 0) {
                                    mVar2.f54985a = i17;
                                    mVar2.f54986b = i18;
                                }
                            }
                        }
                        bVar.a(this.f55105c.f55351c);
                        if (bVarB != null && !bVarB.a() && iB == f55101n) {
                            bVarB = b(bVar);
                        }
                    }
                    this.f55111i = bVarB;
                    if (bVarB == null) {
                        this.f55111i = b(bVar);
                    }
                    this.f55107e.a(this.f55111i);
                    r rVar = this.f55108f;
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar5 = this.f55105c;
                    String str = nVar5.f55350b;
                    int i19 = nVar5.f55353e;
                    int i20 = nVar5.f55352d;
                    m mVar3 = this.f55106d;
                    rVar.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, str, -1, 4096, i19, i20, -1, mVar3.f54985a, mVar3.f54986b, null, null, 0, null, this.f55110h));
                }
            } else {
                if (nVar2.f55353e == 1) {
                    i2 = 13;
                }
                if (nVar.f56208c < i2 + 4) {
                }
            }
        } else {
            j2 = 1000000;
            j3 = 0;
        }
        if (this.f55114l == 0) {
            bVar.f54728e = 0;
            if (!bVar.a(this.f55104b.f56206a, 0, 4, true)) {
                return -1;
            }
            this.f55104b.e(0);
            int iB5 = this.f55104b.b();
            if (((-128000) & iB5) == (((long) this.f55109g) & (-128000)) && com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(iB5) != -1) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(iB5, this.f55105c);
                if (this.f55112j == -9223372036854775807L) {
                    this.f55112j = this.f55111i.b(bVar.f54726c);
                    if (this.f55103a != -9223372036854775807L) {
                        this.f55112j = (this.f55103a - this.f55111i.b(j3)) + this.f55112j;
                    }
                }
                this.f55114l = this.f55105c.f55351c;
            } else {
                bVar.a(1);
                this.f55109g = 0;
                return 0;
            }
        }
        int iA = this.f55108f.a(bVar, this.f55114l, true);
        if (iA == -1) {
            return -1;
        }
        int i21 = this.f55114l - iA;
        this.f55114l = i21;
        if (i21 > 0) {
            return 0;
        }
        long j13 = this.f55112j;
        long j14 = this.f55113k * j2;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar6 = this.f55105c;
        this.f55108f.a((j14 / ((long) nVar6.f55352d)) + j13, 1, nVar6.f55351c, 0, null);
        this.f55113k += (long) this.f55105c.f55355g;
        this.f55114l = 0;
        return 0;
    }
}
