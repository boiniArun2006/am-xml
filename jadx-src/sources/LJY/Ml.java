package LJY;

import LJY.n;
import TFv.Wre;
import TFv.rv6;
import android.content.Context;
import androidx.view.ComponentActivity;
import bH.CN3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ml implements n {
    @Override // LJY.n
    public void n(final ComponentActivity activity, final CN3 secretMenu, rv6 developmentDeviceFlow, Wre floatingButtonState, n.C0204n config) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(secretMenu, "secretMenu");
        Intrinsics.checkNotNullParameter(developmentDeviceFlow, "developmentDeviceFlow");
        Intrinsics.checkNotNullParameter(floatingButtonState, "floatingButtonState");
        Intrinsics.checkNotNullParameter(config, "config");
        new com.bendingspoons.secretmenu.ui.overlay.view.n(GRR.j.f3542n.n(developmentDeviceFlow, config, new GRR.w6() { // from class: LJY.w6
            @Override // GRR.w6
            public final void n() {
                Ml.t(secretMenu, activity);
            }
        }), floatingButtonState).t(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(CN3 cn3, ComponentActivity componentActivity) {
        Context baseContext = componentActivity.getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
        cn3.rl(baseContext);
    }
}
