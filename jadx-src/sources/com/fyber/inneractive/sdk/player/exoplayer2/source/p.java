package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.controller.b0;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class p implements s, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j, com.fyber.inneractive.sdk.player.exoplayer2.upstream.x, com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f55937A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f55939C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f55941E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f55942F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f55943G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f55944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f55945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f55947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f55948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f55949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f55950g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f55953j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r f55959p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.q f55960q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f55961r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f55962s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f55963t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f55964u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f55965v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public z f55966w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f55967x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean[] f55968y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean[] f55969z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f55951h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 f55952i = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0("Loader:ExtractorMediaPeriod");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.e f55954k = new com.fyber.inneractive.sdk.player.exoplayer2.util.e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f55955l = new i(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f55956m = new j(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f55957n = new Handler();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f55940D = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SparseArray f55958o = new SparseArray();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f55938B = -1;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j2, long j3, boolean z2) {
        m mVar = (m) zVar;
        if (this.f55938B == -1) {
            this.f55938B = mVar.f55930i;
        }
        if (z2 || this.f55965v <= 0) {
            return;
        }
        int size = this.f55958o.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f55958o.valueAt(i2)).a(this.f55968y[i2]);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) this.f55959p;
        lVar.getClass();
        lVar.f55745f.obtainMessage(9, this).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final boolean b(long j2) {
        boolean z2 = false;
        if (this.f55942F || (this.f55962s && this.f55965v == 0)) {
            return false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = this.f55954k;
        synchronized (eVar) {
            if (!eVar.f56179a) {
                eVar.f56179a = true;
                eVar.notifyAll();
                z2 = true;
            }
        }
        if (this.f55952i.a()) {
            return z2;
        }
        i();
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long c() {
        long jMax;
        if (this.f55942F) {
            return Long.MIN_VALUE;
        }
        long j2 = this.f55940D;
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        int i2 = 0;
        if (this.f55937A) {
            int size = this.f55958o.size();
            jMax = Long.MAX_VALUE;
            while (i2 < size) {
                if (this.f55969z[i2]) {
                    jMax = Math.min(jMax, ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f55958o.valueAt(i2)).d());
                }
                i2++;
            }
        } else {
            int size2 = this.f55958o.size();
            jMax = Long.MIN_VALUE;
            while (i2 < size2) {
                jMax = Math.max(jMax, ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f55958o.valueAt(i2)).d());
                i2++;
            }
        }
        return jMax == Long.MIN_VALUE ? this.f55939C : jMax;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final void d() throws IOException {
        this.f55952i.b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public final void e() {
        this.f55957n.post(this.f55955l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        if (this.f55965v == 0) {
            return Long.MIN_VALUE;
        }
        return c();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long g() {
        if (!this.f55964u) {
            return -9223372036854775807L;
        }
        this.f55964u = false;
        return this.f55939C;
    }

    public final int h() {
        int size = this.f55958o.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.e eVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f55958o.valueAt(i3)).f54780c;
            i2 += eVar.f54744j + eVar.f54743i;
        }
        return i2;
    }

    public final void i() {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.q qVar;
        m mVar = new m(this, this.f55944a, this.f55945b, this.f55953j, this.f55954k);
        if (this.f55962s) {
            long j2 = this.f55940D;
            if (j2 == -9223372036854775807L) {
                throw new IllegalStateException();
            }
            long j3 = this.f55967x;
            if (j3 != -9223372036854775807L && j2 >= j3) {
                this.f55942F = true;
                this.f55940D = -9223372036854775807L;
                return;
            }
            long jA = this.f55960q.a(j2);
            long j4 = this.f55940D;
            mVar.f55926e.f55356a = jA;
            mVar.f55929h = j4;
            mVar.f55928g = true;
            this.f55940D = -9223372036854775807L;
        }
        this.f55941E = h();
        int i2 = this.f55946c;
        if (i2 == -1) {
            i2 = (this.f55962s && this.f55938B == -1 && ((qVar = this.f55960q) == null || qVar.c() == -9223372036854775807L)) ? 6 : 3;
        }
        int i3 = i2;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 b0Var = this.f55952i;
        b0Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.y yVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.y(b0Var, looperMyLooper, mVar, this, i3, SystemClock.elapsedRealtime());
        if (b0Var.f56016b != null) {
            throw new IllegalStateException();
        }
        b0Var.f56016b = yVar;
        yVar.f56167e = null;
        b0Var.f56015a.execute(yVar);
    }

    public p(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] iVarArr, int i2, Handler handler, b0 b0Var, t tVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar) {
        this.f55944a = uri;
        this.f55945b = hVar;
        this.f55946c = i2;
        this.f55947d = handler;
        this.f55948e = b0Var;
        this.f55949f = tVar;
        this.f55950g = bVar;
        this.f55953j = new n(iVarArr, this);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j2, long j3) {
        m mVar = (m) zVar;
        if (this.f55938B == -1) {
            this.f55938B = mVar.f55930i;
        }
        this.f55942F = true;
        if (this.f55967x == -9223372036854775807L) {
            int size = this.f55958o.size();
            long jMax = Long.MIN_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                jMax = Math.max(jMax, ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f55958o.valueAt(i2)).d());
            }
            long j4 = jMax == Long.MIN_VALUE ? 0L : 10000 + jMax;
            this.f55967x = j4;
            this.f55949f.a(new x(j4, j4, 0L, 0L, this.f55960q.a(), false), null);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) this.f55959p;
        lVar.getClass();
        lVar.f55745f.obtainMessage(9, this).sendToTarget();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void b() {
        this.f55961r = true;
        this.f55957n.post(this.f55955l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j2, long j3, IOException iOException) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.q qVar;
        m mVar = (m) zVar;
        if (this.f55938B == -1) {
            this.f55938B = mVar.f55930i;
        }
        Handler handler = this.f55947d;
        if (handler != null && this.f55948e != null) {
            handler.post(new l(this, iOException));
        }
        if ((iOException instanceof a0) || (iOException instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.v)) {
            return 3;
        }
        if ((iOException instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.u) && iOException.getCause() != null && ((iOException.getCause() instanceof MalformedURLException) || (iOException.getCause() instanceof UnknownHostException))) {
            return 3;
        }
        int i2 = h() > this.f55941E ? 1 : 0;
        if (this.f55938B == -1 && ((qVar = this.f55960q) == null || qVar.c() == -9223372036854775807L)) {
            this.f55939C = 0L;
            this.f55964u = this.f55962s;
            int size = this.f55958o.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f55958o.valueAt(i3)).a(!this.f55962s || this.f55968y[i3]);
            }
            mVar.f55926e.f55356a = 0L;
            mVar.f55929h = 0L;
            mVar.f55928g = true;
        }
        this.f55941E = h();
        return i2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final void a(r rVar) {
        this.f55959p = rVar;
        com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = this.f55954k;
        synchronized (eVar) {
            if (!eVar.f56179a) {
                eVar.f56179a = true;
                eVar.notifyAll();
            }
        }
        i();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final z a() {
        return this.f55966w;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, v[] vVarArr, boolean[] zArr2, long j2) {
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar;
        if (this.f55962s) {
            for (int i2 = 0; i2 < bVarArr.length; i2++) {
                v vVar = vVarArr[i2];
                if (vVar != null && (bVarArr[i2] == null || !zArr[i2])) {
                    int i3 = ((o) vVar).f55935a;
                    boolean[] zArr3 = this.f55968y;
                    if (zArr3[i3]) {
                        this.f55965v--;
                        zArr3[i3] = false;
                        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f55958o.valueAt(i3)).b();
                        vVarArr[i2] = null;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            boolean z2 = false;
            for (int i5 = 0; i5 < bVarArr.length; i5++) {
                if (vVarArr[i5] == null && (bVar = bVarArr[i5]) != null) {
                    int[] iArr = bVar.f55999c;
                    if (iArr.length == 1) {
                        if (iArr[0] == 0) {
                            z zVar = this.f55966w;
                            y yVar = bVar.f55997a;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= zVar.f55989a) {
                                    i7 = -1;
                                    break;
                                }
                                if (zVar.f55990b[i7] == yVar) {
                                    break;
                                }
                                i7++;
                            }
                            boolean[] zArr4 = this.f55968y;
                            if (!zArr4[i7]) {
                                this.f55965v++;
                                zArr4[i7] = true;
                                vVarArr[i5] = new o(this, i7);
                                zArr2[i5] = true;
                                z2 = true;
                            } else {
                                throw new IllegalStateException();
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
            if (!this.f55963t) {
                int size = this.f55958o.size();
                for (int i8 = 0; i8 < size; i8++) {
                    if (!this.f55968y[i8]) {
                        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f55958o.valueAt(i8)).b();
                    }
                }
            }
            if (this.f55965v == 0) {
                this.f55964u = false;
                if (this.f55952i.a()) {
                    this.f55952i.f56016b.a(false);
                }
            } else if (!this.f55963t ? j2 != 0 : z2) {
                j2 = a(j2);
                for (int i9 = 0; i9 < vVarArr.length; i9++) {
                    if (vVarArr[i9] != null) {
                        zArr2[i9] = true;
                    }
                }
            }
            this.f55963t = true;
            return j2;
        }
        throw new IllegalStateException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.s
    public final long a(long j2) {
        if (!this.f55960q.a()) {
            j2 = 0;
        }
        this.f55939C = j2;
        int size = this.f55958o.size();
        boolean zA = !(this.f55940D != -9223372036854775807L);
        for (int i2 = 0; zA && i2 < size; i2++) {
            if (this.f55968y[i2]) {
                zA = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f55958o.valueAt(i2)).a(false, j2);
            }
        }
        if (!zA) {
            this.f55940D = j2;
            this.f55942F = false;
            if (this.f55952i.a()) {
                this.f55952i.f56016b.a(false);
            } else {
                for (int i3 = 0; i3 < size; i3++) {
                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f55958o.valueAt(i3)).a(this.f55968y[i3]);
                }
            }
        }
        this.f55964u = false;
        return j2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a(int i2, int i3) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f55958o.get(i2);
        if (gVar != null) {
            return gVar;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.g(this.f55950g);
        gVar2.f54791n = this;
        this.f55958o.put(i2, gVar2);
        return gVar2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.q qVar) {
        this.f55960q = qVar;
        this.f55957n.post(this.f55955l);
    }
}
