package Gg;

import Do.j;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f3708n;
    private final Do.j nr;
    private final ePt.Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final r f3709t;

    public static /* synthetic */ Object n(UGc uGc) {
        Iterator it = uGc.rl.nY().iterator();
        while (it.hasNext()) {
            uGc.f3709t.n((veW.eO) it.next(), 1);
        }
        return null;
    }

    public void t() {
        this.f3708n.execute(new Runnable() { // from class: Gg.c
            @Override // java.lang.Runnable
            public final void run() {
                UGc uGc = this.f3717n;
                uGc.nr.rl(new j.InterfaceC0070j() { // from class: Gg.s4
                    @Override // Do.j.InterfaceC0070j
                    public final Object execute() {
                        return UGc.n(uGc);
                    }
                });
            }
        });
    }

    UGc(Executor executor, ePt.Ml ml, r rVar, Do.j jVar) {
        this.f3708n = executor;
        this.rl = ml;
        this.f3709t = rVar;
        this.nr = jVar;
    }
}
