package yc;

import QmE.j;
import android.os.Bundle;
import com.applovin.sdk.AppLovinEventParameters;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class giR {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final S.n f75994n = new S.n(1500);

    /* JADX INFO: Access modifiers changed from: private */
    public static final String O(boolean z2, float f3, boolean z3) {
        return "logPreviewZoomEvent: " + z2 + " / " + f3 + " / " + z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(QmE.iF iFVar, final boolean z2, final float f3, final boolean z3) {
        XoT.C.Uo(iFVar, new Function0() { // from class: yc.I7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return giR.O(z2, f3, z3);
            }
        });
        Bundle bundle = new Bundle();
        bundle.putString("type", z2 ? "gesture" : "button");
        bundle.putFloat(AppLovinEventParameters.REVENUE_AMOUNT, f3);
        bundle.putBoolean("selection", z3);
        Unit unit = Unit.INSTANCE;
        iFVar.n(new j.fuX("preview_zoom", bundle));
        return Unit.INSTANCE;
    }

    public static final void t(final QmE.iF iFVar, final boolean z2, final float f3, final boolean z3) {
        Intrinsics.checkNotNullParameter(iFVar, "<this>");
        f75994n.nr(new Function0() { // from class: yc.nr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return giR.nr(iFVar, z2, f3, z3);
            }
        });
    }
}
