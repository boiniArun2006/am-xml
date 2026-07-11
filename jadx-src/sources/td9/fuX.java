package td9;

import QmE.iF;
import android.content.Context;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeKt;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt;
import ga6.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class fuX implements lej {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f73548n;
    private final kgE.fuX rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final iF f73549t;
    public static final j nr = new j(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f73547O = 8;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public fuX(Context context, kgE.fuX iapManager, iF eventLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f73548n = context;
        this.rl = iapManager;
        this.f73549t = eventLogger;
    }

    @Override // td9.lej
    public Object n(Continuation continuation) {
        return M3.j.rl(M3.n.rl(x0X.w6.n(new Function0() { // from class: td9.CN3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fuX.t(this.f73505n);
            }
        }), j.w6.J2, j.EnumC0949j.f67611O, null, null, 12, null), this.f73549t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(fuX fux) {
        com.alightcreative.app.motion.fonts.CN3.nY();
        VisualEffectKt.initVisualEffects(fux.f73548n, "effects", fux.rl);
        LiveShapeKt.initLiveShapes(fux.f73548n, "shapes");
        return Unit.INSTANCE;
    }
}
