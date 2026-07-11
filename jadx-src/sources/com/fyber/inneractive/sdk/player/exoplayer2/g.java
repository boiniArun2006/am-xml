package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Looper;
import android.util.Log;
import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i f55689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h f55690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f55691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f55692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f55693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f55694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f55695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f55696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f55697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f55698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f55699k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f55700l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public x f55701m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f55702n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h f55703o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public s f55704p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i f55705q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f55706r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f55707s;

    public final void a(boolean z2) {
        if (this.f55697i != z2) {
            this.f55697i = z2;
            this.f55692d.f55745f.obtainMessage(1, z2 ? 1 : 0, 0).sendToTarget();
            Iterator it = this.f55693e.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).a(this.f55698j, z2);
            }
        }
    }

    public g(a[] aVarArr, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d dVar, c cVar) {
        Looper mainLooper;
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.4 [" + z.f56238e + "]");
        if (aVarArr.length > 0) {
            this.f55689a = dVar;
            this.f55697i = false;
            this.f55698j = 1;
            this.f55693e = new CopyOnWriteArraySet();
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h hVar = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h(new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[aVarArr.length]);
            this.f55690b = hVar;
            this.f55701m = x.f56320a;
            this.f55694f = new w();
            this.f55695g = new v();
            int i2 = com.fyber.inneractive.sdk.player.exoplayer2.source.z.f55988d;
            this.f55703o = hVar;
            this.f55704p = s.f55880d;
            if (Looper.myLooper() != null) {
                mainLooper = Looper.myLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            f fVar = new f(this, mainLooper);
            this.f55691c = fVar;
            i iVar = new i(0, 0L);
            this.f55705q = iVar;
            this.f55692d = new l(aVarArr, dVar, cVar, this.f55697i, fVar, iVar, this);
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(int i2, long j2) {
        long j3;
        if (i2 >= 0 && (this.f55701m.c() || i2 < this.f55701m.b())) {
            this.f55699k++;
            this.f55706r = i2;
            if (this.f55701m.c()) {
                j3 = 1000;
            } else {
                this.f55701m.a(i2, this.f55694f, 0L);
                long j4 = j2 == -9223372036854775807L ? this.f55694f.f56317e : j2;
                w wVar = this.f55694f;
                int i3 = wVar.f56315c;
                long j5 = wVar.f56319g;
                int i5 = b.f54688a;
                long j6 = (j4 == -9223372036854775807L ? -9223372036854775807L : j4 * 1000) + j5;
                j3 = 1000;
                long j7 = this.f55701m.a(i3, this.f55695g, false).f56245d;
                while (j7 != -9223372036854775807L && j6 >= j7 && i3 < this.f55694f.f56316d) {
                    j6 -= j7;
                    i3++;
                    j7 = this.f55701m.a(i3, this.f55695g, false).f56245d;
                }
            }
            if (j2 == -9223372036854775807L) {
                this.f55707s = 0L;
                this.f55692d.f55745f.obtainMessage(3, new j(this.f55701m, i2, -9223372036854775807L)).sendToTarget();
                return;
            }
            this.f55707s = j2;
            l lVar = this.f55692d;
            x xVar = this.f55701m;
            int i7 = b.f54688a;
            lVar.f55745f.obtainMessage(3, new j(xVar, i2, j2 != -9223372036854775807L ? j2 * j3 : -9223372036854775807L)).sendToTarget();
            Iterator it = this.f55693e.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).getClass();
            }
            return;
        }
        throw new q();
    }

    public final void a(e... eVarArr) {
        l lVar = this.f55692d;
        if (lVar.f55756q) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        } else {
            lVar.f55745f.obtainMessage(11, eVarArr).sendToTarget();
        }
    }

    public final int a() {
        if (!this.f55701m.c() && this.f55699k <= 0) {
            return this.f55701m.a(this.f55705q.f55727a, this.f55695g, false).f56244c;
        }
        return this.f55706r;
    }
}
