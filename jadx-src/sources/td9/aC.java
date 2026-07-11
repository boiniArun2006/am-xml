package td9;

import QmE.iF;
import android.app.Application;
import android.content.Context;
import com.facebook.appevents.Xo;
import ga6.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class aC implements lej {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f73543n;
    private final iF rl;

    public aC(Context context, iF eventLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f73543n = context;
        this.rl = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(aC aCVar) {
        com.facebook.s4.v(aCVar.f73543n);
        Xo.j jVar = com.facebook.appevents.Xo.rl;
        Context context = aCVar.f73543n;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Application");
        jVar.n((Application) context);
        return Unit.INSTANCE;
    }

    @Override // td9.lej
    public Object n(Continuation continuation) {
        return M3.j.rl(M3.n.rl(x0X.w6.n(new Function0() { // from class: td9.Dsr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return aC.t(this.f73507n);
            }
        }), j.w6.J2, j.EnumC0949j.f67611O, null, null, 12, null), this.rl);
    }
}
