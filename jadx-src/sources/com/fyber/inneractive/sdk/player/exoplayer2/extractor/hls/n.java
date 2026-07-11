package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.q;
import com.fyber.inneractive.sdk.player.exoplayer2.source.w;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.y;
import com.fyber.inneractive.sdk.player.exoplayer2.util.v;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n implements x, w, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j, com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f54871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f54872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.b f54873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.o f54874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f54875f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f f54877h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f54883n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f54884o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f54885p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f54886q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f54887r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f54888s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z f54889t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f54890u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean[] f54891v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f54892w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f54893x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f54894y;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0 f54876g = new b0("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f54878i = new d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseArray f54879j = new SparseArray();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedList f54880k = new LinkedList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f54881l = new m(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Handler f54882m = new Handler();

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void a(q qVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(long j2) {
        long j3;
        h hVar;
        boolean z2;
        int size;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar;
        int i2;
        if (this.f54894y || this.f54876g.a()) {
            return false;
        }
        f fVar = this.f54872c;
        h hVar2 = this.f54880k.isEmpty() ? null : (h) this.f54880k.getLast();
        long j4 = this.f54893x;
        if (j4 == -9223372036854775807L) {
            j4 = j2;
        }
        d dVar = this.f54878i;
        int iA = hVar2 == null ? -1 : fVar.f54811f.a(hVar2.f55898c);
        fVar.f54816k = null;
        if (hVar2 != null) {
            Math.max(0L, hVar2.f55901f - j4);
        }
        fVar.f54821p.d();
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = fVar.f54821p;
        int i3 = bVar.f55999c[bVar.a()];
        boolean z3 = iA != i3;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = fVar.f54809d[i3];
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) fVar.f54810e.f54974d.get(aVar);
        if (hVar3.f54963d == null) {
            dVar.f54804c = aVar;
            fVar.f54816k = aVar;
            j3 = -9223372036854775807L;
        } else {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            h hVar4 = hVar2;
            long jMax = Math.max(30000L, com.fyber.inneractive.sdk.player.exoplayer2.b.a(hVar3.f54963d.f54933o));
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d dVar2 = hVar3.f54963d;
            if (dVar2.f54928j || (i2 = dVar2.f54920b) == 2 || i2 == 1 || hVar3.f54964e + jMax > jElapsedRealtime) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d dVarA = fVar.f54810e.a(aVar);
                if (hVar4 == null || z3) {
                    hVar = hVar4;
                    if (hVar != null) {
                        j4 = hVar.f55901f;
                    }
                    if (dVarA.f54928j) {
                        z2 = true;
                    } else {
                        z2 = true;
                        if (j4 > dVarA.f54922d + dVarA.f54933o) {
                            iA = i3;
                            size = dVarA.f54925g + dVarA.f54931m.size();
                        }
                    }
                    List list = dVarA.f54931m;
                    Long lValueOf = Long.valueOf(j4 - dVarA.f54922d);
                    boolean z4 = (!fVar.f54810e.f54983m || hVar == null) ? z2 : false;
                    int i5 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f56234a;
                    int iBinarySearch = Collections.binarySearch(list, lValueOf);
                    if (iBinarySearch < 0) {
                        iBinarySearch = -(iBinarySearch + 2);
                    } else {
                        while (true) {
                            int i7 = iBinarySearch - 1;
                            if (i7 < 0 || ((Comparable) list.get(i7)).compareTo(lValueOf) != 0) {
                                break;
                            }
                            iBinarySearch = i7;
                        }
                    }
                    if (z4) {
                        iBinarySearch = Math.max(0, iBinarySearch);
                    }
                    int i8 = dVarA.f54925g;
                    int i9 = iBinarySearch + i8;
                    if (i9 >= i8 || hVar == null) {
                        iA = i3;
                        size = i9;
                    } else {
                        aVar = fVar.f54809d[iA];
                        dVarA = fVar.f54810e.a(aVar);
                        size = hVar.f55904i + 1;
                    }
                } else {
                    hVar = hVar4;
                    iA = i3;
                    size = hVar.f55904i + 1;
                    z2 = true;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar2 = aVar;
                int i10 = dVarA.f54925g;
                if (size < i10) {
                    fVar.f54815j = new com.fyber.inneractive.sdk.player.exoplayer2.source.g();
                } else {
                    int i11 = size - i10;
                    if (i11 < dVarA.f54931m.size()) {
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c cVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c) dVarA.f54931m.get(i11);
                        if (cVar.f54915e) {
                            Uri uriA = com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(dVarA.f54934a, cVar.f54916f);
                            if (!uriA.equals(fVar.f54817l)) {
                                dVar.f54802a = new c(fVar.f54807b, new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uriA, 0L, 0L, -1L, null, 1), fVar.f54809d[iA].f54905b, fVar.f54821p.c(), fVar.f54821p.b(), fVar.f54814i, cVar.f54917g);
                            } else if (!com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(cVar.f54917g, fVar.f54819n)) {
                                fVar.a(uriA, cVar.f54917g, fVar.f54818m);
                            }
                        } else {
                            fVar.f54817l = null;
                            fVar.f54818m = null;
                            fVar.f54819n = null;
                            fVar.f54820o = null;
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c cVar2 = dVarA.f54930l;
                        if (cVar2 != null) {
                            Uri uriA2 = com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(dVarA.f54934a, cVar2.f54911a);
                            long j5 = cVar2.f54918h;
                            kVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uriA2, j5, j5, cVar2.f54919i, null, 0);
                        } else {
                            kVar = null;
                        }
                        long j6 = dVarA.f54922d + cVar.f54914d;
                        int i12 = dVarA.f54924f + cVar.f54913c;
                        o oVar = fVar.f54808c;
                        v vVar = (v) oVar.f54895a.get(i12);
                        if (vVar == null) {
                            vVar = new v(Long.MAX_VALUE);
                            oVar.f54895a.put(i12, vVar);
                        }
                        Uri uriA3 = com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(dVarA.f54934a, cVar.f54911a);
                        long j7 = cVar.f54918h;
                        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(uriA3, j7, j7, cVar.f54919i, null, 0);
                        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar5 = fVar.f54806a;
                        List list2 = fVar.f54812g;
                        int iC = fVar.f54821p.c();
                        Object objB = fVar.f54821p.b();
                        h hVar6 = hVar;
                        long j9 = j6 + cVar.f54912b;
                        boolean z5 = fVar.f54813h;
                        byte[] bArr = fVar.f54818m;
                        byte[] bArr2 = fVar.f54820o;
                        j3 = -9223372036854775807L;
                        dVar.f54802a = new h(hVar5, kVar2, kVar, aVar2, list2, iC, objB, j6, j9, size, i12, z5, vVar, hVar6, bArr, bArr2);
                    } else if (dVarA.f54928j) {
                        dVar.f54803b = z2;
                    } else {
                        dVar.f54804c = aVar2;
                        fVar.f54816k = aVar2;
                    }
                }
            }
            j3 = -9223372036854775807L;
        }
        d dVar3 = this.f54878i;
        boolean z6 = dVar3.f54803b;
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar3 = dVar3.f54802a;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar4 = dVar3.f54804c;
        dVar3.f54802a = null;
        dVar3.f54803b = false;
        dVar3.f54804c = null;
        if (z6) {
            this.f54894y = true;
            return true;
        }
        if (aVar3 == null) {
            if (aVar4 == null) {
                return false;
            }
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) this.f54871b.f54846a.f54974d.get(aVar4)).b();
            return false;
        }
        if (aVar3 instanceof h) {
            this.f54893x = j3;
            h hVar7 = (h) aVar3;
            hVar7.f54826D = this;
            int i13 = hVar7.f54829j;
            boolean z7 = hVar7.f54839t;
            this.f54887r = i13;
            for (int i14 = 0; i14 < this.f54879j.size(); i14++) {
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f54879j.valueAt(i14)).f54780c.f54752r = i13;
            }
            if (z7) {
                for (int i15 = 0; i15 < this.f54879j.size(); i15++) {
                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f54879j.valueAt(i15)).f54790m = true;
                }
            }
            this.f54880k.add(hVar7);
        }
        b0 b0Var = this.f54876g;
        int i16 = this.f54875f;
        b0Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException();
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        y yVar = new y(b0Var, looperMyLooper, aVar3, this, i16, jElapsedRealtime2);
        if (b0Var.f56016b != null) {
            throw new IllegalStateException();
        }
        b0Var.f56016b = yVar;
        yVar.f56167e = null;
        b0Var.f56015a.execute(yVar);
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar2 = this.f54877h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar3 = aVar3.f55896a;
        int i17 = aVar3.f55897b;
        int i18 = this.f54870a;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = aVar3.f55898c;
        int i19 = aVar3.f55899d;
        Object obj = aVar3.f55900e;
        long j10 = aVar3.f55901f;
        long j11 = aVar3.f55902g;
        if (fVar2.f55914b == null) {
            return true;
        }
        fVar2.f55913a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.a(fVar2, kVar3, i17, i18, oVar2, i19, obj, j10, j11, jElapsedRealtime2));
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j2, long j3, boolean z2) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f54877h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = aVar.f55896a;
        int i2 = aVar.f55897b;
        int i3 = this.f54870a;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.f55898c;
        int i5 = aVar.f55899d;
        Object obj = aVar.f55900e;
        long j4 = aVar.f55901f;
        long j5 = aVar.f55902g;
        long jC = aVar.c();
        if (fVar.f55914b != null) {
            fVar.f55913a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.c(fVar, kVar, i2, i3, oVar, i5, obj, j4, j5, j2, j3, jC));
        }
        if (z2) {
            return;
        }
        int size = this.f54879j.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f54879j.valueAt(i7)).a(this.f54891v[i7]);
        }
        i iVar = this.f54871b;
        iVar.getClass();
        if (iVar.f54858m == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.f54855j;
        lVar.getClass();
        lVar.f55745f.obtainMessage(9, iVar).sendToTarget();
    }

    public final void c(long j2) {
        this.f54892w = j2;
        this.f54893x = j2;
        this.f54894y = false;
        this.f54880k.clear();
        if (this.f54876g.a()) {
            this.f54876g.f56016b.a(false);
            return;
        }
        int size = this.f54879j.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f54879j.valueAt(i2)).a(this.f54891v[i2]);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public final void e() {
        this.f54882m.post(this.f54881l);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.w
    public final long f() {
        long j2 = this.f54893x;
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        if (this.f54894y) {
            return Long.MIN_VALUE;
        }
        return ((h) this.f54880k.getLast()).f55902g;
    }

    public final void h() {
        if (this.f54888s || this.f54884o || !this.f54883n) {
            return;
        }
        int size = this.f54879j.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f54879j.valueAt(i2)).e() == null) {
                return;
            }
        }
        int size2 = this.f54879j.size();
        int i3 = 0;
        char c2 = 0;
        int i5 = -1;
        while (true) {
            if (i3 >= size2) {
                break;
            }
            String str = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f54879j.valueAt(i3)).e().f55858f;
            char c4 = "video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 3 : "audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 2 : "text".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) ? (char) 1 : (char) 0;
            if (c4 > c2) {
                i5 = i3;
                c2 = c4;
            } else if (c4 == c2 && i5 != -1) {
                i5 = -1;
            }
            i3++;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.y yVar = this.f54872c.f54811f;
        int i7 = yVar.f55985a;
        this.f54890u = -1;
        this.f54891v = new boolean[size2];
        com.fyber.inneractive.sdk.player.exoplayer2.source.y[] yVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.source.y[size2];
        for (int i8 = 0; i8 < size2; i8++) {
            com.fyber.inneractive.sdk.player.exoplayer2.o oVarE = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f54879j.valueAt(i8)).e();
            if (i8 == i5) {
                com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.o[i7];
                for (int i9 = 0; i9 < i7; i9++) {
                    oVarArr[i9] = a(yVar.f55986b[i9], oVarE);
                }
                yVarArr[i8] = new com.fyber.inneractive.sdk.player.exoplayer2.source.y(oVarArr);
                this.f54890u = i8;
            } else {
                yVarArr[i8] = new com.fyber.inneractive.sdk.player.exoplayer2.source.y(a((c2 == 3 && "audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(oVarE.f55858f))) ? this.f54874e : null, oVarE));
            }
        }
        this.f54889t = new z(yVarArr);
        this.f54884o = true;
        i iVar = this.f54871b;
        int i10 = iVar.f54856k - 1;
        iVar.f54856k = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (n nVar : iVar.f54859n) {
            i11 += nVar.f54889t.f55989a;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.y[] yVarArr2 = new com.fyber.inneractive.sdk.player.exoplayer2.source.y[i11];
        int i12 = 0;
        for (n nVar2 : iVar.f54859n) {
            int i13 = nVar2.f54889t.f55989a;
            int i14 = 0;
            while (i14 < i13) {
                yVarArr2[i12] = nVar2.f54889t.f55990b[i14];
                i14++;
                i12++;
            }
        }
        iVar.f54858m = new z(yVarArr2);
        ((com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.f54855j).f55745f.obtainMessage(8, iVar).sendToTarget();
    }

    public n(int i2, i iVar, f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j2, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i3, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar2) {
        this.f54870a = i2;
        this.f54871b = iVar;
        this.f54872c = fVar;
        this.f54873d = bVar;
        this.f54874e = oVar;
        this.f54875f = i3;
        this.f54877h = fVar2;
        this.f54892w = j2;
        this.f54893x = j2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j2, long j3) {
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) zVar;
        f fVar = this.f54872c;
        fVar.getClass();
        if (aVar instanceof c) {
            c cVar = (c) aVar;
            fVar.f54814i = cVar.f54797i;
            fVar.a(cVar.f55896a.f56108a, cVar.f54800l, cVar.f54801m);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar2 = this.f54877h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = aVar.f55896a;
        int i2 = aVar.f55897b;
        int i3 = this.f54870a;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.f55898c;
        int i5 = aVar.f55899d;
        Object obj = aVar.f55900e;
        long j4 = aVar.f55901f;
        long j5 = aVar.f55902g;
        long jC = aVar.c();
        if (fVar2.f55914b != null) {
            fVar2.f55913a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.b(fVar2, kVar, i2, i3, oVar, i5, obj, j4, j5, j2, j3, jC));
        }
        if (!this.f54884o) {
            b(this.f54892w);
            return;
        }
        i iVar = this.f54871b;
        iVar.getClass();
        if (iVar.f54858m == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.f54855j;
        lVar.getClass();
        lVar.f55745f.obtainMessage(9, iVar).sendToTarget();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.z zVar, long j2, long j3, IOException iOException) {
        boolean z2;
        boolean z3;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar;
        boolean zA;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.v vVar;
        int i2;
        com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a) zVar;
        boolean z4 = aVar instanceof h;
        boolean z5 = !z4 || aVar.c() == 0;
        f fVar2 = this.f54872c;
        if (z5) {
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = fVar2.f54821p;
            int iA = fVar2.f54811f.a(aVar.f55898c);
            int i3 = 0;
            while (true) {
                if (i3 >= bVar.f55998b) {
                    i3 = -1;
                    break;
                }
                if (bVar.f55999c[i3] == iA) {
                    break;
                }
                i3++;
            }
            if ((iOException instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.v) && ((i2 = (vVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.v) iOException).f56160a) == 404 || i2 == 410)) {
                zA = bVar.a(i3);
                int i5 = vVar.f56160a;
                if (zA) {
                    StringBuilder sbA = l.a("Blacklisted: duration=60000, responseCode=", i5, ", format=");
                    sbA.append(bVar.f56000d[i3]);
                    Log.w("ChunkedTrackBlacklist", sbA.toString());
                } else {
                    StringBuilder sbA2 = l.a("Blacklisting failed (cannot blacklist last enabled track): responseCode=", i5, ", format=");
                    sbA2.append(bVar.f56000d[i3]);
                    Log.w("ChunkedTrackBlacklist", sbA2.toString());
                }
            } else {
                zA = false;
            }
            if (zA) {
                z2 = true;
            }
            if (z2) {
                z3 = false;
            } else {
                if (z4) {
                    if (((h) this.f54880k.removeLast()) == aVar) {
                        if (this.f54880k.isEmpty()) {
                            this.f54893x = this.f54892w;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                z3 = true;
            }
            fVar = this.f54877h;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = aVar.f55896a;
            int i7 = aVar.f55897b;
            int i8 = this.f54870a;
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar = aVar.f55898c;
            int i9 = aVar.f55899d;
            Object obj = aVar.f55900e;
            long j4 = aVar.f55901f;
            long j5 = aVar.f55902g;
            long jC = aVar.c();
            if (fVar.f55914b != null) {
                fVar.f55913a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.d(fVar, kVar, i7, i8, oVar, i9, obj, j4, j5, j2, j3, jC, iOException, z3));
            }
            if (z3) {
                return 0;
            }
            if (!this.f54884o) {
                b(this.f54892w);
                return 2;
            }
            i iVar = this.f54871b;
            iVar.getClass();
            if (iVar.f54858m == null) {
                return 2;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.l lVar = (com.fyber.inneractive.sdk.player.exoplayer2.l) iVar.f54855j;
            lVar.getClass();
            lVar.f55745f.obtainMessage(9, iVar).sendToTarget();
            return 2;
        }
        fVar2.getClass();
        z2 = false;
        if (z2) {
        }
        fVar = this.f54877h;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar2 = aVar.f55896a;
        int i72 = aVar.f55897b;
        int i82 = this.f54870a;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 = aVar.f55898c;
        int i92 = aVar.f55899d;
        Object obj2 = aVar.f55900e;
        long j42 = aVar.f55901f;
        long j52 = aVar.f55902g;
        long jC2 = aVar.c();
        if (fVar.f55914b != null) {
        }
        if (z3) {
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a(int i2, int i3) {
        if (this.f54879j.indexOfKey(i2) >= 0) {
            return (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f54879j.get(i2);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.g(this.f54873d);
        gVar.f54791n = this;
        gVar.f54780c.f54752r = this.f54887r;
        this.f54879j.put(i2, gVar);
        return gVar;
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.o a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar2) {
        String strA;
        if (oVar == null) {
            return oVar2;
        }
        int iC = com.fyber.inneractive.sdk.player.exoplayer2.util.i.c(oVar2.f55858f);
        if (iC == 1) {
            strA = a(oVar.f55855c, 1);
        } else {
            strA = iC == 2 ? a(oVar.f55855c, 2) : null;
        }
        return new com.fyber.inneractive.sdk.player.exoplayer2.o(oVar.f55853a, oVar2.f55857e, oVar2.f55858f, strA, oVar.f55854b, oVar2.f55859g, oVar.f55862j, oVar.f55863k, oVar2.f55864l, oVar2.f55865m, oVar2.f55866n, oVar2.f55868p, oVar2.f55867o, oVar2.f55869q, oVar2.f55870r, oVar2.f55871s, oVar2.f55872t, oVar2.f55873u, oVar2.f55874v, oVar.f55876x, oVar.f55877y, oVar2.f55878z, oVar2.f55875w, oVar2.f55860h, oVar2.f55861i, oVar2.f55856d);
    }

    public static String a(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("(\\s*,\\s*)|(\\s*$)");
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit) {
            if (i2 == com.fyber.inneractive.sdk.player.exoplayer2.util.i.c(com.fyber.inneractive.sdk.player.exoplayer2.util.i.a(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.j
    public final void b() {
        this.f54883n = true;
        this.f54882m.post(this.f54881l);
    }
}
