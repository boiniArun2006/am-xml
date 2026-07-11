package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.source.s;
import com.fyber.inneractive.sdk.player.exoplayer2.source.t;
import com.fyber.inneractive.sdk.player.exoplayer2.source.u;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.y;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f54862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f54863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f f54864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k f54865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t f54866e;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(t tVar) {
        if (this.f54865d != null) {
            throw new IllegalStateException();
        }
        Uri uri = this.f54862a;
        b bVar = this.f54863b;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k(uri, bVar, this.f54864c, this);
        this.f54865d = kVar;
        this.f54866e = tVar;
        d0 d0Var = new d0(bVar.f54796a.a(), uri, kVar.f54972b);
        b0 b0Var = kVar.f54978h;
        b0Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException();
        }
        y yVar = new y(b0Var, looperMyLooper, d0Var, kVar, 3, SystemClock.elapsedRealtime());
        if (b0Var.f56016b != null) {
            throw new IllegalStateException();
        }
        b0Var.f56016b = yVar;
        yVar.f56167e = null;
        b0Var.f56015a.execute(yVar);
    }

    public j(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, Handler handler, com.fyber.inneractive.sdk.player.controller.b0 b0Var) {
        b bVar = new b(gVar);
        this.f54862a = uri;
        this.f54863b = bVar;
        this.f54864c = new com.fyber.inneractive.sdk.player.exoplayer2.source.f(handler, b0Var);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void b() {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar = this.f54865d;
        if (kVar != null) {
            kVar.f54978h.a(null);
            Iterator it = kVar.f54974d.values().iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) it.next()).f54961b.a(null);
            }
            kVar.f54975e.removeCallbacksAndMessages(null);
            kVar.f54974d.clear();
            this.f54865d = null;
        }
        this.f54866e = null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a() throws IOException {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar = this.f54865d;
        kVar.f54978h.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = kVar.f54981k;
        if (aVar != null) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) kVar.f54974d.get(aVar);
            hVar.f54961b.b();
            IOException iOException = hVar.f54969j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final s a(int i2, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j2) {
        if (i2 == 0) {
            return new i(this.f54865d, this.f54863b, this.f54864c, bVar, j2);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(s sVar) {
        i iVar = (i) sVar;
        iVar.f54846a.f54977g.remove(iVar);
        iVar.f54853h.removeCallbacksAndMessages(null);
        n[] nVarArr = iVar.f54859n;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                int size = nVar.f54879j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f54879j.valueAt(i2)).b();
                }
                nVar.f54876g.a(null);
                nVar.f54882m.removeCallbacksAndMessages(null);
                nVar.f54888s = true;
            }
        }
    }
}
