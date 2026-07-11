package etI;

import Do.j;
import Gg.r;
import bF.aC;
import hay.qz;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import veW.eO;
import veW.s4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class w6 implements I28 {
    private static final Logger J2 = Logger.getLogger(s4.class.getName());

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Do.j f63891O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final r f63892n;
    private final ePt.Ml nr;
    private final Executor rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final hay.I28 f63893t;

    public static /* synthetic */ Object rl(w6 w6Var, eO eOVar, veW.Dsr dsr) {
        w6Var.nr.te(eOVar, dsr);
        w6Var.f63892n.n(eOVar, 1);
        return null;
    }

    @Override // etI.I28
    public void n(final eO eOVar, final veW.Dsr dsr, final aC aCVar) {
        this.rl.execute(new Runnable() { // from class: etI.j
            @Override // java.lang.Runnable
            public final void run() {
                w6.t(this.f63887n, eOVar, aCVar, dsr);
            }
        });
    }

    public w6(Executor executor, hay.I28 i28, r rVar, ePt.Ml ml, Do.j jVar) {
        this.rl = executor;
        this.f63893t = i28;
        this.f63892n = rVar;
        this.nr = ml;
        this.f63891O = jVar;
    }

    public static /* synthetic */ void t(final w6 w6Var, final eO eOVar, aC aCVar, veW.Dsr dsr) {
        w6Var.getClass();
        try {
            qz qzVar = w6Var.f63893t.get(eOVar.rl());
            if (qzVar == null) {
                String str = String.format("Transport backend '%s' is not registered", eOVar.rl());
                J2.warning(str);
                aCVar.n(new IllegalArgumentException(str));
            } else {
                final veW.Dsr dsrRl = qzVar.rl(dsr);
                w6Var.f63891O.rl(new j.InterfaceC0070j() { // from class: etI.n
                    @Override // Do.j.InterfaceC0070j
                    public final Object execute() {
                        return w6.rl(this.f63889n, eOVar, dsrRl);
                    }
                });
                aCVar.n(null);
            }
        } catch (Exception e2) {
            J2.warning("Error scheduling event " + e2.getMessage());
            aCVar.n(e2);
        }
    }
}
