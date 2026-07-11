package quY;

import TFv.Wre;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import bH.Ml;
import bH.w6;
import com.bendingspoons.secretmenu.ui.overlay.view.InvisibleOverlayView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class j {
    public static final void n(Activity activity, InvisibleOverlayView.j touchListener, Wre floatingButtonState) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(touchListener, "touchListener");
        Intrinsics.checkNotNullParameter(floatingButtonState, "floatingButtonState");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        InvisibleOverlayView invisibleOverlayView = (InvisibleOverlayView) activity.getWindow().getDecorView().findViewById(w6.nr);
        if (invisibleOverlayView == null) {
            View viewInflate = activity.getLayoutInflater().inflate(Ml.rl, (ViewGroup) null);
            activity.addContentView(viewInflate, layoutParams);
            Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.bendingspoons.secretmenu.ui.overlay.view.InvisibleOverlayView");
            invisibleOverlayView = (InvisibleOverlayView) viewInflate;
        }
        invisibleOverlayView.setTouchListener(touchListener);
        invisibleOverlayView.setUpFloatingButton(floatingButtonState);
    }

    public static final void rl(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        InvisibleOverlayView invisibleOverlayView = (InvisibleOverlayView) activity.getWindow().getDecorView().findViewById(w6.nr);
        if (invisibleOverlayView != null) {
            ViewParent parent = invisibleOverlayView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(invisibleOverlayView);
            }
            invisibleOverlayView.nr();
        }
    }
}
