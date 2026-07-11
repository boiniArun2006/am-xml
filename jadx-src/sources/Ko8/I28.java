package Ko8;

import HI0.afx;
import QmE.iF;
import android.content.Context;
import ga6.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class I28 implements w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f5794n;
    private final iF rl;

    public I28(Context context, iF eventLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f5794n = context;
        this.rl = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(String str, I28 i28) {
        com.alightcreative.app.motion.persist.j.INSTANCE.getProjectEditTime().remove(str);
        afx.o(i28.f5794n, str).delete();
        afx.XQ(i28.f5794n, str).delete();
        afx.WPU(i28.f5794n, str).delete();
        return Unit.INSTANCE;
    }

    @Override // Ko8.w6
    public x0X.n n(final String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return M3.j.rl(M3.n.rl(x0X.w6.n(new Function0() { // from class: Ko8.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return I28.t(id, this);
            }
        }), j.w6.f67628O, j.EnumC0949j.f67618r, j.n.f67621O, null, 8, null), this.rl);
    }
}
