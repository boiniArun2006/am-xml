package td9;

import QmE.iF;
import android.content.Context;
import ga6.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ln.l3D;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Ln implements lej {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f73518n;
    private final iF rl;

    public Ln(Context context, iF eventLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f73518n = context;
        this.rl = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Ln ln2) {
        Context context = ln2.f73518n;
        l3D.j jVarXMQ = ln.l3D.f70504v.xMQ(context);
        jVarXMQ.jB(ln.Pl.f70469n);
        Hwc.w6.t(context, jVarXMQ.n());
        return Unit.INSTANCE;
    }

    @Override // td9.lej
    public Object n(Continuation continuation) {
        return M3.j.rl(M3.n.rl(x0X.w6.n(new Function0() { // from class: td9.qf
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ln.t(this.f73568n);
            }
        }), j.w6.J2, j.EnumC0949j.f67611O, null, null, 12, null), this.rl);
    }
}
