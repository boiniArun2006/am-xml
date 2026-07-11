package com.bendingspoons.secretmenu.ui.overlay.view;

import TFv.Wre;
import android.view.MotionEvent;
import androidx.view.ComponentActivity;
import androidx.view.Lifecycle;
import com.bendingspoons.secretmenu.ui.overlay.view.InvisibleOverlayView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n implements InvisibleOverlayView.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final GRR.j f51567n;
    private final Wre rl;

    public n(GRR.j touchManager, Wre floatingButtonState) {
        Intrinsics.checkNotNullParameter(touchManager, "touchManager");
        Intrinsics.checkNotNullParameter(floatingButtonState, "floatingButtonState");
        this.f51567n = touchManager;
        this.rl = floatingButtonState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr(ComponentActivity componentActivity, n nVar) {
        quY.j.n(componentActivity, nVar, nVar.rl);
        return Unit.INSTANCE;
    }

    @Override // com.bendingspoons.secretmenu.ui.overlay.view.InvisibleOverlayView.j
    public boolean onTouch(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f51567n.onTouchEvent(event);
        return true;
    }

    public final void t(final ComponentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity.getLifecycleRegistry().getState().rl(Lifecycle.State.J2)) {
            quY.j.n(activity, this, this.rl);
        }
        activity.getLifecycleRegistry().n(new Gn.j(new Function0() { // from class: Gn.I28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.bendingspoons.secretmenu.ui.overlay.view.n.nr(activity, this);
            }
        }, new Function0() { // from class: Gn.Wre
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.bendingspoons.secretmenu.ui.overlay.view.n.O(activity);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(ComponentActivity componentActivity) {
        quY.j.rl(componentActivity);
        return Unit.INSTANCE;
    }
}
