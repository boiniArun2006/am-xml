package td9;

import QmE.iF;
import android.content.Context;
import ga6.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Pl implements lej {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f73534n;
    private final iF rl;

    public Pl(Context context, iF eventLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f73534n = context;
        this.rl = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Pl pl) {
        com.google.firebase.Wre.o(pl.f73534n);
        Dh.I28 i28Nr = Dh.I28.nr();
        Intrinsics.checkNotNullExpressionValue(i28Nr, "getInstance(...)");
        i28Nr.J2(V3I.n.rl());
        return Unit.INSTANCE;
    }

    @Override // td9.lej
    public Object n(Continuation continuation) {
        return M3.j.rl(M3.n.rl(x0X.w6.n(new Function0() { // from class: td9.qz
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Pl.t(this.f73569n);
            }
        }), j.w6.J2, j.EnumC0949j.f67611O, null, null, 12, null), this.rl);
    }
}
