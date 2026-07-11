package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.os.Looper;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.t;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.v;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.y;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.z;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class h implements x, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f54960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f54961b = new b0("HlsPlaylistTracker:MediaPlaylist");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f54962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f54963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f54964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f54965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f54966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f54967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f54968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IOException f54969j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f54970k;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(z zVar, long j2, long j3, boolean z2) {
        d0 d0Var = (d0) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f54970k.f54979i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f56086a;
        long j4 = d0Var.f56091f;
        if (fVar.f55914b != null) {
            fVar.f55913a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.c(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j2, j3, j4));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f54968i = false;
        b();
    }

    public h(k kVar, a aVar, long j2) {
        this.f54970k = kVar;
        this.f54960a = aVar;
        this.f54966g = j2;
        this.f54962c = new d0(kVar.f54971a.f54796a.a(), com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(kVar.f54980j.f54934a, aVar.f54904a), kVar.f54972b);
    }

    public final void b() {
        this.f54967h = 0L;
        if (this.f54968i || this.f54961b.a()) {
            return;
        }
        b0 b0Var = this.f54961b;
        d0 d0Var = this.f54962c;
        int i2 = this.f54970k.f54973c;
        b0Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException();
        }
        y yVar = new y(b0Var, looperMyLooper, d0Var, this, i2, SystemClock.elapsedRealtime());
        if (b0Var.f56016b != null) {
            throw new IllegalStateException();
        }
        b0Var.f56016b = yVar;
        yVar.f56167e = null;
        b0Var.f56015a.execute(yVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(z zVar, long j2, long j3) {
        d0 d0Var = (d0) zVar;
        e eVar = d0Var.f56089d;
        if (eVar instanceof d) {
            a((d) eVar);
            com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f54970k.f54979i;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f56086a;
            long j4 = d0Var.f56091f;
            if (fVar.f55914b != null) {
                fVar.f55913a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.b(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j2, j3, j4));
                return;
            }
            return;
        }
        this.f54969j = new r("Loaded playlist has unexpected type.");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final int a(z zVar, long j2, long j3, IOException iOException) {
        int i2;
        IOException iOException2 = iOException;
        d0 d0Var = (d0) zVar;
        boolean z2 = iOException2 instanceof r;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f54970k.f54979i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f56086a;
        long j4 = d0Var.f56091f;
        if (fVar.f55914b != null) {
            iOException2 = iOException;
            fVar.f55913a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.d(fVar, kVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j2, j3, j4, iOException, z2));
        }
        if (z2) {
            return 3;
        }
        if ((iOException2 instanceof v) && ((i2 = ((v) iOException2).f56160a) == 404 || i2 == 410)) {
            a();
            k kVar2 = this.f54970k;
            if (kVar2.f54981k != this.f54960a) {
                return 2;
            }
            List list = kVar2.f54980j.f54906b;
            int size = list.size();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            for (int i3 = 0; i3 < size; i3++) {
                h hVar = (h) kVar2.f54974d.get(list.get(i3));
                if (jElapsedRealtime > hVar.f54967h) {
                    kVar2.f54981k = hVar.f54960a;
                    hVar.b();
                    return 2;
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(d dVar) {
        long j2;
        long j3;
        long j4;
        int i2;
        d dVar2;
        long j5;
        int i3;
        com.fyber.inneractive.sdk.player.exoplayer2.source.x xVar;
        long j6;
        int size;
        int size2;
        d dVar3 = this.f54963d;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f54964e = jElapsedRealtime;
        k kVar = this.f54970k;
        kVar.getClass();
        if (dVar3 != null) {
            int i5 = dVar.f54925g;
            int i7 = dVar3.f54925g;
            if (i5 <= i7 && (i5 < i7 || ((size = dVar.f54931m.size()) <= (size2 = dVar3.f54931m.size()) && (size != size2 || !dVar.f54928j || dVar3.f54928j)))) {
                dVar2 = (!dVar.f54928j || dVar3.f54928j) ? dVar3 : new d(dVar3.f54920b, dVar3.f54934a, dVar3.f54921c, dVar3.f54922d, dVar3.f54923e, dVar3.f54924f, dVar3.f54925g, dVar3.f54926h, dVar3.f54927i, true, dVar3.f54929k, dVar3.f54930l, dVar3.f54931m, dVar3.f54932n);
            }
            this.f54963d = dVar2;
            if (dVar2 == dVar3) {
                this.f54969j = null;
                this.f54965f = jElapsedRealtime;
                k kVar2 = this.f54970k;
                a aVar = this.f54960a;
                if (aVar == kVar2.f54981k) {
                    if (kVar2.f54982l == null) {
                        kVar2.f54983m = !dVar2.f54928j;
                    }
                    kVar2.f54982l = dVar2;
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j jVar = kVar2.f54976f;
                    jVar.getClass();
                    long j7 = dVar2.f54921c;
                    if (jVar.f54865d.f54983m) {
                        long j9 = dVar2.f54928j ? dVar2.f54922d + dVar2.f54933o : -9223372036854775807L;
                        List list = dVar2.f54931m;
                        if (j7 != -9223372036854775807L) {
                            i3 = 0;
                        } else if (!list.isEmpty()) {
                            i3 = 0;
                            j7 = ((c) list.get(Math.max(0, list.size() - 3))).f54914d;
                        } else {
                            i3 = 0;
                            j6 = 0;
                            xVar = new com.fyber.inneractive.sdk.player.exoplayer2.source.x(j9, dVar2.f54933o, dVar2.f54922d, j6, true, !dVar2.f54928j);
                        }
                        j6 = j7;
                        xVar = new com.fyber.inneractive.sdk.player.exoplayer2.source.x(j9, dVar2.f54933o, dVar2.f54922d, j6, true, !dVar2.f54928j);
                    } else {
                        i3 = 0;
                        long j10 = j7 == -9223372036854775807L ? 0L : j7;
                        long j11 = dVar2.f54922d;
                        long j12 = dVar2.f54933o;
                        xVar = new com.fyber.inneractive.sdk.player.exoplayer2.source.x(j11 + j12, j12, j11, j10, true, false);
                    }
                    t tVar = jVar.f54866e;
                    b bVar = jVar.f54865d.f54980j;
                    tVar.a(xVar, new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g());
                } else {
                    i3 = 0;
                }
                int size3 = kVar2.f54977g.size();
                for (int i8 = i3; i8 < size3; i8++) {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i iVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i) kVar2.f54977g.get(i8);
                    if (iVar.f54858m != null) {
                        l lVar = (l) iVar.f54855j;
                        lVar.getClass();
                        lVar.f55745f.obtainMessage(9, iVar).sendToTarget();
                    } else {
                        n[] nVarArr = iVar.f54859n;
                        int length = nVarArr.length;
                        for (int i9 = i3; i9 < length; i9++) {
                            n nVar = nVarArr[i9];
                            if (!nVar.f54884o) {
                                nVar.b(nVar.f54892w);
                            }
                        }
                    }
                }
                j5 = (aVar != kVar2.f54981k || dVar2.f54928j) ? -9223372036854775807L : this.f54963d.f54927i;
            } else if (!dVar2.f54928j) {
                if (jElapsedRealtime - this.f54965f > com.fyber.inneractive.sdk.player.exoplayer2.b.a(dVar2.f54927i) * 3.5d) {
                    String str = this.f54960a.f54904a;
                    this.f54969j = new j();
                    a();
                } else if (dVar.f54931m.size() + dVar.f54925g < this.f54963d.f54925g) {
                    String str2 = this.f54960a.f54904a;
                    this.f54969j = new i();
                }
                j5 = this.f54963d.f54927i / 2;
            }
            if (j5 == -9223372036854775807L) {
                this.f54968i = this.f54970k.f54975e.postDelayed(this, com.fyber.inneractive.sdk.player.exoplayer2.b.a(j5));
                return;
            }
            return;
        }
        dVar.getClass();
        if (dVar.f54929k) {
            j2 = dVar.f54922d;
        } else {
            d dVar4 = kVar.f54982l;
            j2 = dVar4 != null ? dVar4.f54922d : 0L;
            if (dVar3 != null) {
                int size4 = dVar3.f54931m.size();
                int i10 = dVar.f54925g - dVar3.f54925g;
                List list2 = dVar3.f54931m;
                c cVar = i10 < list2.size() ? (c) list2.get(i10) : null;
                if (cVar != null) {
                    j3 = dVar3.f54922d;
                    j4 = cVar.f54914d;
                } else if (size4 == dVar.f54925g - dVar3.f54925g) {
                    j3 = dVar3.f54922d;
                    j4 = dVar3.f54933o;
                }
                j2 = j3 + j4;
            }
        }
        long j13 = j2;
        if (dVar.f54923e) {
            i2 = dVar.f54924f;
        } else {
            d dVar5 = kVar.f54982l;
            i2 = dVar5 != null ? dVar5.f54924f : 0;
            if (dVar3 != null) {
                int i11 = dVar.f54925g - dVar3.f54925g;
                List list3 = dVar3.f54931m;
                c cVar2 = i11 < list3.size() ? (c) list3.get(i11) : null;
                if (cVar2 != null) {
                    i2 = (dVar3.f54924f + cVar2.f54913c) - ((c) dVar.f54931m.get(0)).f54913c;
                }
            }
        }
        dVar2 = new d(dVar.f54920b, dVar.f54934a, dVar.f54921c, j13, true, i2, dVar.f54925g, dVar.f54926h, dVar.f54927i, dVar.f54928j, dVar.f54929k, dVar.f54930l, dVar.f54931m, dVar.f54932n);
        this.f54963d = dVar2;
        if (dVar2 == dVar3) {
        }
        if (j5 == -9223372036854775807L) {
        }
    }

    public final void a() {
        this.f54967h = SystemClock.elapsedRealtime() + 60000;
        k kVar = this.f54970k;
        a aVar = this.f54960a;
        int size = kVar.f54977g.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i iVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i) kVar.f54977g.get(i2);
            for (n nVar : iVar.f54859n) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f fVar = nVar.f54872c;
                int iA = fVar.f54811f.a(aVar.f54905b);
                if (iA != -1) {
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = fVar.f54821p;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= bVar.f55998b) {
                            i3 = -1;
                            break;
                        } else if (bVar.f55999c[i3] == iA) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i3 != -1) {
                        fVar.f54821p.a(i3);
                    }
                }
            }
            if (iVar.f54858m != null) {
                l lVar = (l) iVar.f54855j;
                lVar.getClass();
                lVar.f55745f.obtainMessage(9, iVar).sendToTarget();
            } else {
                for (n nVar2 : iVar.f54859n) {
                    if (!nVar2.f54884o) {
                        nVar2.b(nVar2.f54892w);
                    }
                }
            }
        }
    }
}
