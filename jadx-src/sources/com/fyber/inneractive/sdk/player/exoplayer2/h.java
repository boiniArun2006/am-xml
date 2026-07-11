package com.fyber.inneractive.sdk.player.exoplayer2;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.s f55708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f55709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.v[] f55710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean[] f55711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f55712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f55713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f55714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f55715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f55716i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f55717j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f55718k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f55719l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j f55720m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a[] f55721n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a[] f55722o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i f55723p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f55724q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.u f55725r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j f55726s;

    public final long a(long j2, boolean z2, boolean[] zArr) {
        int i2;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h hVar = this.f55720m.f56010b;
        for (int i3 = 0; i3 < hVar.f56006a; i3++) {
            this.f55711d[i3] = !z2 && this.f55720m.a(this.f55726s, i3);
        }
        long jA = this.f55708a.a((com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[]) hVar.f56007b.clone(), this.f55711d, this.f55710c, zArr, j2);
        this.f55726s = this.f55720m;
        this.f55717j = false;
        int i5 = 0;
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.source.v[] vVarArr = this.f55710c;
            if (i5 >= vVarArr.length) {
                c cVar = this.f55724q;
                a[] aVarArr = this.f55721n;
                z zVar = this.f55720m.f56009a;
                cVar.f54695f = 0;
                for (int i7 = 0; i7 < aVarArr.length; i7++) {
                    if (hVar.f56007b[i7] != null) {
                        int i8 = cVar.f54695f;
                        int i9 = aVarArr[i7].f54527a;
                        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f56234a;
                        if (i9 == 0) {
                            i2 = 16777216;
                        } else if (i9 == 1) {
                            i2 = 3538944;
                        } else if (i9 == 2) {
                            i2 = 13107200;
                        } else {
                            if (i9 != 3 && i9 != 4) {
                                throw new IllegalStateException();
                            }
                            i2 = 131072;
                        }
                        cVar.f54695f = i8 + i2;
                    }
                }
                cVar.f54690a.a(cVar.f54695f);
                return jA;
            }
            if (vVarArr[i5] != null) {
                if (hVar.f56007b[i5] == null) {
                    throw new IllegalStateException();
                }
                this.f55717j = true;
            } else if (hVar.f56007b[i5] != null) {
                throw new IllegalStateException();
            }
            i5++;
        }
    }

    public h(a[] aVarArr, a[] aVarArr2, long j2, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i iVar, c cVar, com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar, Object obj, int i2, boolean z2, long j3) {
        this.f55721n = aVarArr;
        this.f55722o = aVarArr2;
        this.f55712e = j2;
        this.f55723p = iVar;
        this.f55724q = cVar;
        this.f55725r = uVar;
        obj.getClass();
        this.f55709b = obj;
        this.f55713f = i2;
        this.f55715h = z2;
        this.f55714g = j3;
        this.f55710c = new com.fyber.inneractive.sdk.player.exoplayer2.source.v[aVarArr.length];
        this.f55711d = new boolean[aVarArr.length];
        this.f55708a = uVar.a(i2, cVar.f54690a, j3);
    }

    public final void a() {
        try {
            this.f55725r.a(this.f55708a);
        } catch (RuntimeException e2) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e2);
        }
    }
}
