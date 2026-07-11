package td9;

import QmE.iF;
import ga6.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class M implements lej {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final kgE.fuX f73527n;
    private final iF rl;

    public M(kgE.fuX iapManager, iF eventLogger) {
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f73527n = iapManager;
        this.rl = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(M m2) {
        m2.f73527n.n();
        return Unit.INSTANCE;
    }

    @Override // td9.lej
    public Object n(Continuation continuation) {
        return M3.j.rl(M3.n.rl(x0X.w6.n(new Function0() { // from class: td9.iwV
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return M.t(this.f73551n);
            }
        }), j.w6.J2, j.EnumC0949j.f67611O, null, null, 12, null), this.rl);
    }
}
