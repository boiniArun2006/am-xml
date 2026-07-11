package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.q;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class b implements i, q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f54757n = z.a("FLV");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f54762e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f54764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f54765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f54766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f54767j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f54768k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f54769l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f54770m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f54758a = new n(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f54759b = new n(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f54760c = new n(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f54761d = new n();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54763f = 1;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j2) {
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return false;
    }

    public final n b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        if (this.f54766i > this.f54761d.a()) {
            n nVar = this.f54761d;
            nVar.f56206a = new byte[Math.max(nVar.a() * 2, this.f54766i)];
            nVar.f56208c = 0;
            nVar.f56207b = 0;
        } else {
            this.f54761d.e(0);
        }
        this.f54761d.d(this.f54766i);
        bVar.b(this.f54761d.f56206a, 0, this.f54766i, false);
        return this.f54761d;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f54770m.f54771b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        bVar.a(this.f54758a.f56206a, 0, 3, false);
        this.f54758a.e(0);
        if (this.f54758a.l() != f54757n) {
            return false;
        }
        bVar.a(this.f54758a.f56206a, 0, 2, false);
        this.f54758a.e(0);
        if ((this.f54758a.o() & 250) != 0) {
            return false;
        }
        bVar.a(this.f54758a.f56206a, 0, 4, false);
        this.f54758a.e(0);
        int iB = this.f54758a.b();
        bVar.f54728e = 0;
        bVar.a(iB, false);
        bVar.a(this.f54758a.f56206a, 0, 4, false);
        this.f54758a.e(0);
        return this.f54758a.b() == 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.f54762e = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j2, long j3) {
        this.f54763f = 1;
        this.f54764g = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, o oVar) throws InterruptedException, r, EOFException {
        c cVar;
        f fVar;
        a aVar;
        while (true) {
            int i2 = this.f54763f;
            boolean z2 = true;
            if (i2 != 1) {
                if (i2 == 2) {
                    bVar.a(this.f54764g);
                    this.f54764g = 0;
                    this.f54763f = 3;
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        int i3 = this.f54765h;
                        if (i3 == 8 && (aVar = this.f54768k) != null) {
                            n nVarB = b(bVar);
                            long j2 = this.f54767j;
                            aVar.a(nVarB);
                            aVar.a(nVarB, j2);
                        } else if (i3 == 9 && (fVar = this.f54769l) != null) {
                            n nVarB2 = b(bVar);
                            long j3 = this.f54767j;
                            if (fVar.a(nVarB2)) {
                                fVar.a(nVarB2, j3);
                            }
                        } else if (i3 == 18 && (cVar = this.f54770m) != null) {
                            cVar.a(b(bVar), this.f54767j);
                        } else {
                            bVar.a(this.f54766i);
                            z2 = false;
                        }
                        this.f54764g = 4;
                        this.f54763f = 2;
                        if (z2) {
                            return 0;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (!bVar.b(this.f54760c.f56206a, 0, 11, true)) {
                        return -1;
                    }
                    this.f54760c.e(0);
                    this.f54765h = this.f54760c.j();
                    this.f54766i = this.f54760c.l();
                    this.f54767j = this.f54760c.l();
                    this.f54767j = (((long) (this.f54760c.j() << 24)) | this.f54767j) * 1000;
                    n nVar = this.f54760c;
                    nVar.e(nVar.f56207b + 3);
                    this.f54763f = 4;
                }
            } else {
                if (!bVar.b(this.f54759b.f56206a, 0, 9, true)) {
                    return -1;
                }
                this.f54759b.e(0);
                n nVar2 = this.f54759b;
                nVar2.e(nVar2.f56207b + 4);
                int iJ = this.f54759b.j();
                boolean z3 = (iJ & 4) != 0;
                boolean z4 = (iJ & 1) != 0;
                if (z3 && this.f54768k == null) {
                    this.f54768k = new a(this.f54762e.a(8, 1));
                }
                if (z4 && this.f54769l == null) {
                    this.f54769l = new f(this.f54762e.a(9, 2));
                }
                if (this.f54770m == null) {
                    this.f54770m = new c();
                }
                this.f54762e.b();
                this.f54762e.a(this);
                this.f54764g = this.f54759b.b() - 5;
                this.f54763f = 2;
            }
        }
    }
}
