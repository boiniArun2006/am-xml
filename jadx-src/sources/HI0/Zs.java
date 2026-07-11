package HI0;

import QmE.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Zs {
    private static final rWZ.CN3 O(boolean z2) {
        return z2 ? rWZ.CN3.f73053n : rWZ.CN3.f73054t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr() {
        return Unit.INSTANCE;
    }

    public static final void rl(QmE.iF eventLogger, boolean z2, rWZ.fuX location, String[] strArr, rWZ.Dsr authType, Function0 onDenied, Function0 onGranted) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(authType, "authType");
        Intrinsics.checkNotNullParameter(onDenied, "onDenied");
        Intrinsics.checkNotNullParameter(onGranted, "onGranted");
        eventLogger.n(new j.pq(O(z2), authType, location, strArr));
        if (z2) {
            onGranted.invoke();
        } else {
            onDenied.invoke();
        }
    }

    public static /* synthetic */ void t(QmE.iF iFVar, boolean z2, rWZ.fuX fux, String[] strArr, rWZ.Dsr dsr, Function0 function0, Function0 function02, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            dsr = rWZ.Dsr.f73055O;
        }
        rWZ.Dsr dsr2 = dsr;
        if ((i2 & 32) != 0) {
            function0 = new Function0() { // from class: HI0.Md
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Zs.nr();
                }
            };
        }
        rl(iFVar, z2, fux, strArr, dsr2, function0, function02);
    }
}
