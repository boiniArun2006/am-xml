package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import java.io.EOFException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class u implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f55656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f55657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f55658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f55659g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.v f55653a = new com.fyber.inneractive.sdk.player.exoplayer2.util.v(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f55655c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f55654b = new SparseArray();

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        byte[] bArr = new byte[14];
        bVar.a(bArr, 0, 14, false);
        if (442 != (((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        bVar.a(bArr[13] & 7, false);
        bVar.a(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & UByte.MAX_VALUE) << 16) | ((bArr[1] & UByte.MAX_VALUE) << 8)) | (bArr[2] & UByte.MAX_VALUE));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f55659g = jVar;
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j2, long j3) {
        this.f55653a.f56232c = -9223372036854775807L;
        for (int i2 = 0; i2 < this.f55654b.size(); i2++) {
            t tVar = (t) this.f55654b.valueAt(i2);
            tVar.f55651f = false;
            tVar.f55646a.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        h qVar;
        if (!bVar.a(this.f55655c.f56206a, 0, 4, true)) {
            return -1;
        }
        this.f55655c.e(0);
        int iB = this.f55655c.b();
        if (iB == 441) {
            return -1;
        }
        if (iB == 442) {
            bVar.a(this.f55655c.f56206a, 0, 10, false);
            this.f55655c.e(9);
            bVar.a((this.f55655c.j() & 7) + 14);
            return 0;
        }
        if (iB == 443) {
            bVar.a(this.f55655c.f56206a, 0, 2, false);
            this.f55655c.e(0);
            bVar.a(this.f55655c.o() + 6);
            return 0;
        }
        if (((iB & (-256)) >> 8) != 1) {
            bVar.a(1);
            return 0;
        }
        int i2 = iB & 255;
        t tVar = (t) this.f55654b.get(i2);
        if (!this.f55656d) {
            if (tVar == null) {
                boolean z2 = this.f55657e;
                h jVar = null;
                if (!z2 && i2 == 189) {
                    qVar = new b(null);
                    this.f55657e = true;
                } else if (!z2 && (iB & 224) == 192) {
                    qVar = new q(null);
                    this.f55657e = true;
                } else {
                    if (!this.f55658f && (iB & 240) == 224) {
                        jVar = new j();
                        this.f55658f = true;
                    }
                    if (jVar != null) {
                        jVar.a(this.f55659g, new e0(Integer.MIN_VALUE, i2, 256));
                        tVar = new t(jVar, this.f55653a);
                        this.f55654b.put(i2, tVar);
                    }
                }
                jVar = qVar;
                if (jVar != null) {
                }
            }
            if ((this.f55657e && this.f55658f) || bVar.f54726c > 1048576) {
                this.f55656d = true;
                this.f55659g.b();
            }
        }
        bVar.a(this.f55655c.f56206a, 0, 2, false);
        this.f55655c.e(0);
        int iO = this.f55655c.o() + 6;
        if (tVar == null) {
            bVar.a(iO);
        } else {
            this.f55655c.c(iO);
            bVar.b(this.f55655c.f56206a, 0, iO, false);
            this.f55655c.e(6);
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f55655c;
            nVar.a(tVar.f55648c.f56202a, 0, 3);
            tVar.f55648c.b(0);
            tVar.f55648c.c(8);
            tVar.f55649d = tVar.f55648c.b();
            tVar.f55650e = tVar.f55648c.b();
            tVar.f55648c.c(6);
            nVar.a(tVar.f55648c.f56202a, 0, tVar.f55648c.a(8));
            tVar.f55648c.b(0);
            tVar.f55652g = 0L;
            if (tVar.f55649d) {
                tVar.f55648c.c(4);
                long jA = ((long) tVar.f55648c.a(3)) << 30;
                tVar.f55648c.c(1);
                long jA2 = jA | ((long) (tVar.f55648c.a(15) << 15));
                tVar.f55648c.c(1);
                long jA3 = jA2 | ((long) tVar.f55648c.a(15));
                tVar.f55648c.c(1);
                if (!tVar.f55651f && tVar.f55650e) {
                    tVar.f55648c.c(4);
                    long jA4 = ((long) tVar.f55648c.a(3)) << 30;
                    tVar.f55648c.c(1);
                    long jA5 = jA4 | ((long) (tVar.f55648c.a(15) << 15));
                    tVar.f55648c.c(1);
                    long jA6 = jA5 | ((long) tVar.f55648c.a(15));
                    tVar.f55648c.c(1);
                    tVar.f55647b.b(jA6);
                    tVar.f55651f = true;
                }
                tVar.f55652g = tVar.f55647b.b(jA3);
            }
            tVar.f55646a.a(true, tVar.f55652g);
            tVar.f55646a.a(nVar);
            tVar.f55646a.b();
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f55655c;
            nVar2.d(nVar2.a());
        }
        return 0;
    }
}
