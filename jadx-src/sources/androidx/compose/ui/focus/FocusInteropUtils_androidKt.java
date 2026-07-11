package androidx.compose.ui.focus;

import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0014\u001a\u00020\u0013*\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"", "androidDirection", "Landroidx/compose/ui/focus/FocusDirection;", "nr", "(I)Landroidx/compose/ui/focus/FocusDirection;", "t", "(I)Ljava/lang/Integer;", "androidLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "O", "(I)Landroidx/compose/ui/unit/LayoutDirection;", "Landroid/view/View;", "view", "Landroidx/compose/ui/geometry/Rect;", c.f62177j, "(Landroid/view/View;Landroid/view/View;)Landroidx/compose/ui/geometry/Rect;", "direction", "Landroid/graphics/Rect;", "rect", "", "rl", "(Landroid/view/View;Ljava/lang/Integer;Landroid/graphics/Rect;)Z", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FocusInteropUtils_androidKt {
    public static final FocusDirection nr(int i2) {
        if (i2 == 1) {
            return FocusDirection.xMQ(FocusDirection.INSTANCE.J2());
        }
        if (i2 == 2) {
            return FocusDirection.xMQ(FocusDirection.INSTANCE.O());
        }
        if (i2 == 17) {
            return FocusDirection.xMQ(FocusDirection.INSTANCE.nr());
        }
        if (i2 == 33) {
            return FocusDirection.xMQ(FocusDirection.INSTANCE.KN());
        }
        if (i2 == 66) {
            return FocusDirection.xMQ(FocusDirection.INSTANCE.Uo());
        }
        if (i2 != 130) {
            return null;
        }
        return FocusDirection.xMQ(FocusDirection.INSTANCE.n());
    }

    public static final LayoutDirection O(int i2) {
        if (i2 == 0) {
            return LayoutDirection.f34160n;
        }
        if (i2 != 1) {
            return null;
        }
        return LayoutDirection.f34161t;
    }

    public static final Rect n(View view, View view2) {
        FocusInteropUtils.Companion companion = FocusInteropUtils.INSTANCE;
        view.getLocationInWindow(companion.n());
        int i2 = companion.n()[0];
        int i3 = companion.n()[1];
        view2.getLocationInWindow(companion.n());
        float f3 = i2 - companion.n()[0];
        float f4 = i3 - companion.n()[1];
        return new Rect(f3, f4, view.getWidth() + f3, view.getHeight() + f4);
    }

    public static final boolean rl(View view, Integer num, android.graphics.Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final Integer t(int i2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.qie(i2, companion.KN())) {
            return 33;
        }
        if (FocusDirection.qie(i2, companion.n())) {
            return 130;
        }
        if (FocusDirection.qie(i2, companion.nr())) {
            return 17;
        }
        if (FocusDirection.qie(i2, companion.Uo())) {
            return 66;
        }
        if (FocusDirection.qie(i2, companion.O())) {
            return 2;
        }
        return FocusDirection.qie(i2, companion.J2()) ? 1 : null;
    }
}
