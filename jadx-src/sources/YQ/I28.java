package YQ;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.Window;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class I28 {

    static final class j implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ View f12089n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f12090t;

        j(View view, long j2) {
            this.f12089n = view;
            this.f12090t = j2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f12089n.isAttachedToWindow()) {
                this.f12089n.setVisibility(0);
                View view = this.f12089n;
                Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, (view.getLeft() + this.f12089n.getRight()) / 2, (this.f12089n.getTop() + this.f12089n.getBottom()) / 2, 0.0f, Math.max(this.f12089n.getWidth(), this.f12089n.getHeight()));
                animatorCreateCircularReveal.setDuration(this.f12090t);
                animatorCreateCircularReveal.start();
            }
        }
    }

    public static final void n(View circularRevealed, long j2) {
        Intrinsics.checkNotNullParameter(circularRevealed, "$this$circularRevealed");
        circularRevealed.setVisibility(4);
        circularRevealed.post(new j(circularRevealed, j2));
    }

    public static final void nr(View visible, boolean z2) {
        Intrinsics.checkNotNullParameter(visible, "$this$visible");
        visible.setVisibility(z2 ? 0 : 8);
    }

    public static final int rl(View getStatusBarHeight, boolean z2) {
        Intrinsics.checkNotNullParameter(getStatusBarHeight, "$this$getStatusBarHeight");
        Rect rect = new Rect();
        Context context = getStatusBarHeight.getContext();
        if (!(context instanceof Activity) || !z2) {
            return 0;
        }
        Window window = ((Activity) context).getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "context.window");
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    public static final Point t(View getViewPointOnScreen) {
        Intrinsics.checkNotNullParameter(getViewPointOnScreen, "$this$getViewPointOnScreen");
        int[] iArr = {0, 0};
        getViewPointOnScreen.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }
}
