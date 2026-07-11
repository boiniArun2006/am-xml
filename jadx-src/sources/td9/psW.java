package td9;

import QmE.iF;
import android.content.Context;
import ga6.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class psW implements lej {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f73567n;
    private final iF rl;

    public psW(Context context, iF eventLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f73567n = context;
        this.rl = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(psW psw) {
        lfy.j.n(psw.f73567n, "alight-nanovg");
        lfy.j.n(psw.f73567n, "alight-giflib");
        return Unit.INSTANCE;
    }

    @Override // td9.lej
    public Object n(Continuation continuation) {
        return M3.j.rl(M3.n.rl(x0X.w6.n(new Function0() { // from class: td9.K
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return psW.t(this.f73517n);
            }
        }), j.w6.J2, j.EnumC0949j.f67611O, null, null, 12, null), this.rl);
    }
}
