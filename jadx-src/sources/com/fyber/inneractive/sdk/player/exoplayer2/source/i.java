package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f55916a;

    public i(p pVar) {
        this.f55916a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f55916a;
        if (pVar.f55943G || pVar.f55962s || pVar.f55960q == null || !pVar.f55961r) {
            return;
        }
        int size = pVar.f55958o.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar.f55958o.valueAt(i2)).e() == null) {
                return;
            }
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = pVar.f55954k;
        synchronized (eVar) {
            eVar.f56179a = false;
        }
        y[] yVarArr = new y[size];
        pVar.f55969z = new boolean[size];
        pVar.f55968y = new boolean[size];
        pVar.f55967x = pVar.f55960q.c();
        int i3 = 0;
        while (true) {
            boolean z2 = true;
            if (i3 >= size) {
                pVar.f55966w = new z(yVarArr);
                pVar.f55962s = true;
                t tVar = pVar.f55949f;
                long j2 = pVar.f55967x;
                tVar.a(new x(j2, j2, 0L, 0L, pVar.f55960q.a(), false), null);
                ((com.fyber.inneractive.sdk.player.exoplayer2.l) pVar.f55959p).f55745f.obtainMessage(8, pVar).sendToTarget();
                return;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.o oVarE = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar.f55958o.valueAt(i3)).e();
            yVarArr[i3] = new y(oVarE);
            String str = oVarE.f55858f;
            if (!"video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str)) && !"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
                z2 = false;
            }
            pVar.f55969z[i3] = z2;
            pVar.f55937A = z2 | pVar.f55937A;
            i3++;
        }
    }
}
