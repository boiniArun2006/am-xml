package td9;

import QmE.iF;
import com.vungle.ads.internal.signals.SignalManager;
import ga6.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Zs implements lej {
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f73541t = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final iF f73542n;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public Zs(iF eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f73542n = eventLogger;
    }

    @Override // td9.lej
    public Object n(Continuation continuation) {
        return M3.j.rl(M3.n.rl(x0X.w6.n(new Function0() { // from class: td9.Md
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Zs.t();
            }
        }), j.w6.f67628O, j.EnumC0949j.f67611O, null, null, 12, null), this.f73542n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (jCurrentTimeMillis - jVar.getLastAppExecution() > SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
            jVar.setLastAppExecution(jCurrentTimeMillis);
            jVar.setAppDay(jVar.getAppDay() + 1);
        }
        jVar.setSessionNumber(jVar.getSessionNumber() + 1);
        return Unit.INSTANCE;
    }
}
