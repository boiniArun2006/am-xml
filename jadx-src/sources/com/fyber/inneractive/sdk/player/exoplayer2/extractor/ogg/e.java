package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class e implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f55377a;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        boolean zA;
        boolean zEquals;
        try {
            g gVar = new g();
            if (gVar.a(bVar, true) && (gVar.f55384a & 2) == 2) {
                int iMin = Math.min(gVar.f55388e, 8);
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(iMin);
                bVar.a(nVar.f56206a, 0, iMin, false);
                nVar.e(0);
                if (nVar.f56208c - nVar.f56207b >= 5 && nVar.j() == 127 && nVar.k() == 1179402563) {
                    this.f55377a = new d();
                } else {
                    nVar.e(0);
                    try {
                        zA = s.a(1, nVar, true);
                    } catch (com.fyber.inneractive.sdk.player.exoplayer2.r unused) {
                        zA = false;
                    }
                    if (zA) {
                        this.f55377a = new o();
                    } else {
                        nVar.e(0);
                        int i2 = i.f55391o;
                        int i3 = nVar.f56208c - nVar.f56207b;
                        byte[] bArr = i.f55392p;
                        if (i3 < bArr.length) {
                            zEquals = false;
                        } else {
                            byte[] bArr2 = new byte[bArr.length];
                            nVar.a(bArr2, 0, bArr.length);
                            zEquals = Arrays.equals(bArr2, bArr);
                        }
                        if (zEquals) {
                            this.f55377a = new i();
                        }
                    }
                }
                return true;
            }
        } catch (com.fyber.inneractive.sdk.player.exoplayer2.r unused2) {
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(0, 1);
        jVar.b();
        l lVar = this.f55377a;
        lVar.f55398c = jVar;
        lVar.f55397b = gVarA;
        lVar.f55396a = new f();
        lVar.a(true);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j2, long j3) {
        l lVar = this.f55377a;
        f fVar = lVar.f55396a;
        g gVar = fVar.f55378a;
        gVar.f55384a = 0;
        gVar.f55385b = 0L;
        gVar.f55386c = 0;
        gVar.f55387d = 0;
        gVar.f55388e = 0;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = fVar.f55379b;
        nVar.f56207b = 0;
        nVar.f56208c = 0;
        fVar.f55380c = -1;
        fVar.f55382e = false;
        if (j2 == 0) {
            lVar.a(!lVar.f55407l);
        } else if (lVar.f55403h != 0) {
            lVar.f55400e = lVar.f55399d.c(j3);
            lVar.f55403h = 2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        l lVar = this.f55377a;
        int i2 = lVar.f55403h;
        if (i2 == 0) {
            boolean zA = true;
            while (zA) {
                if (!lVar.f55396a.a(bVar)) {
                    lVar.f55403h = 3;
                    return -1;
                }
                long j2 = bVar.f54726c;
                long j3 = lVar.f55401f;
                lVar.f55406k = j2 - j3;
                zA = lVar.a(lVar.f55396a.f55379b, j3, lVar.f55405j);
                if (zA) {
                    lVar.f55401f = bVar.f54726c;
                }
            }
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = lVar.f55405j.f55394a;
            lVar.f55404i = oVar2.f55871s;
            if (!lVar.f55408m) {
                lVar.f55397b.a(oVar2);
                lVar.f55408m = true;
            }
            c cVar = lVar.f55405j.f55395b;
            if (cVar != null) {
                lVar.f55399d = cVar;
            } else {
                long j4 = bVar.f54725b;
                if (j4 == -1) {
                    lVar.f55399d = new k();
                } else {
                    g gVar = lVar.f55396a.f55378a;
                    lVar.f55399d = new b(lVar.f55401f, j4, lVar, gVar.f55387d + gVar.f55388e, gVar.f55385b);
                }
            }
            lVar.f55405j = null;
            lVar.f55403h = 2;
            lVar.f55396a.a();
            return 0;
        }
        if (i2 == 1) {
            bVar.a((int) lVar.f55401f);
            lVar.f55403h = 2;
            return 0;
        }
        if (i2 == 2) {
            long jA = lVar.f55399d.a(bVar);
            if (jA >= 0) {
                oVar.f55356a = jA;
                return 1;
            }
            if (jA < -1) {
                lVar.a(-(jA + 2));
            }
            if (!lVar.f55407l) {
                lVar.f55398c.a(lVar.f55399d.b());
                lVar.f55407l = true;
            }
            if (lVar.f55406k <= 0 && !lVar.f55396a.a(bVar)) {
                lVar.f55403h = 3;
                return -1;
            }
            lVar.f55406k = 0L;
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = lVar.f55396a.f55379b;
            long jA2 = lVar.a(nVar);
            if (jA2 >= 0) {
                long j5 = lVar.f55402g;
                if (j5 + jA2 >= lVar.f55400e) {
                    long j6 = (j5 * 1000000) / ((long) lVar.f55404i);
                    lVar.f55397b.a(nVar.f56208c, nVar);
                    lVar.f55397b.a(j6, 1, nVar.f56208c, 0, null);
                    lVar.f55400e = -1L;
                }
            }
            lVar.f55402g += jA2;
            return 0;
        }
        throw new IllegalStateException();
    }
}
