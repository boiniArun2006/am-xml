package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class f extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f55688a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Looper looper) {
        super(looper);
        this.f55688a = gVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        g gVar = this.f55688a;
        gVar.getClass();
        switch (message.what) {
            case 0:
                gVar.f55700l--;
                return;
            case 1:
                gVar.f55698j = message.arg1;
                Iterator it = gVar.f55693e.iterator();
                while (it.hasNext()) {
                    ((b0) it.next()).a(gVar.f55698j, gVar.f55697i);
                }
                return;
            case 2:
                Iterator it2 = gVar.f55693e.iterator();
                while (it2.hasNext()) {
                    ((b0) it2.next()).getClass();
                }
                return;
            case 3:
                if (gVar.f55700l == 0) {
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j jVar = (com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j) message.obj;
                    gVar.f55696h = true;
                    z zVar = jVar.f56009a;
                    gVar.f55703o = jVar.f56010b;
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i iVar = gVar.f55689a;
                    Object obj = jVar.f56011c;
                    ((com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g) iVar).getClass();
                    Iterator it3 = gVar.f55693e.iterator();
                    while (it3.hasNext()) {
                        ((b0) it3.next()).getClass();
                    }
                    return;
                }
                return;
            case 4:
                int i2 = gVar.f55699k - 1;
                gVar.f55699k = i2;
                if (i2 == 0) {
                    gVar.f55705q = (i) message.obj;
                    if (message.arg1 != 0) {
                        Iterator it4 = gVar.f55693e.iterator();
                        while (it4.hasNext()) {
                            ((b0) it4.next()).getClass();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (gVar.f55699k == 0) {
                    gVar.f55705q = (i) message.obj;
                    Iterator it5 = gVar.f55693e.iterator();
                    while (it5.hasNext()) {
                        ((b0) it5.next()).getClass();
                    }
                    return;
                }
                return;
            case 6:
                k kVar = (k) message.obj;
                gVar.f55699k -= kVar.f55736d;
                if (gVar.f55700l == 0) {
                    gVar.f55701m = kVar.f55733a;
                    gVar.f55702n = kVar.f55734b;
                    gVar.f55705q = kVar.f55735c;
                    Iterator it6 = gVar.f55693e.iterator();
                    while (it6.hasNext()) {
                        ((b0) it6.next()).getClass();
                    }
                    return;
                }
                return;
            case 7:
                s sVar = (s) message.obj;
                if (gVar.f55704p.equals(sVar)) {
                    return;
                }
                gVar.f55704p = sVar;
                Iterator it7 = gVar.f55693e.iterator();
                while (it7.hasNext()) {
                    ((b0) it7.next()).getClass();
                }
                return;
            case 8:
                d dVar = (d) message.obj;
                for (b0 b0Var : gVar.f55693e) {
                    com.fyber.inneractive.sdk.player.controller.f fVar = (com.fyber.inneractive.sdk.player.controller.f) b0Var.f54426a.get();
                    if (fVar != null && (dVar.getCause() instanceof com.fyber.inneractive.sdk.player.exoplayer2.audio.n) && (b0Var.f54427b || (fVar.f54442D && fVar.f54439A))) {
                        fVar.f54450v = true;
                        g gVar2 = fVar.f54447s;
                        if (gVar2 != null) {
                            gVar2.f55692d.d();
                            gVar2.f55691c.removeCallbacksAndMessages(null);
                            fVar.f54447s = null;
                        }
                        fVar.a(false);
                        fVar.a(fVar.f54441C);
                        fVar.f54479i.post(new com.fyber.inneractive.sdk.player.controller.k(fVar, false));
                    } else if (fVar == null || !fVar.f54439A || b0Var.f54427b || !com.fyber.inneractive.sdk.player.cache.n.f54415f.f54418c || !com.fyber.inneractive.sdk.util.s.a() || fVar.f54443E >= fVar.f54444p) {
                        com.fyber.inneractive.sdk.player.mediaplayer.o oVar = new com.fyber.inneractive.sdk.player.mediaplayer.o(dVar, dVar.getCause() == null ? "empty" : dVar.getCause().getMessage());
                        IAlog.a("%sonPlayerError called with %s for sendErrorState", b0Var.a(), oVar);
                        com.fyber.inneractive.sdk.player.controller.f fVar2 = (com.fyber.inneractive.sdk.player.controller.f) com.fyber.inneractive.sdk.util.v.a(b0Var.f54426a);
                        if (fVar2 != null) {
                            fVar2.a(com.fyber.inneractive.sdk.player.enums.b.Error);
                            IAlog.a("%sonPlayerError called with: %s for onPlayerError", IAlog.a(fVar2), oVar);
                            fVar2.f54479i.post(new com.fyber.inneractive.sdk.player.controller.j(fVar2, oVar));
                            fVar2.k();
                        }
                    } else {
                        g gVar3 = fVar.f54447s;
                        if (gVar3 != null) {
                            gVar3.f55692d.d();
                            gVar3.f55691c.removeCallbacksAndMessages(null);
                            fVar.f54447s = null;
                        }
                        fVar.a(true);
                        fVar.a(fVar.f54441C);
                        fVar.f54443E++;
                        fVar.f54479i.post(new com.fyber.inneractive.sdk.player.controller.k(fVar, true));
                    }
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
