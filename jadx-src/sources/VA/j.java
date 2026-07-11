package VA;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j {
    public static final Pair n(DSG.j jVar, View container) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(container, "container");
        return new Pair(Float.valueOf(container.getWidth() * jVar.rl()), Float.valueOf(container.getHeight() * jVar.t()));
    }

    public static final DSG.j rl(View view, float f3, float f4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return new DSG.j(RangesKt.coerceIn(f3 / view.getWidth(), 0.0f, 1.0f), RangesKt.coerceIn(f4 / view.getHeight(), 0.0f, 1.0f));
    }

    public static final void t(View view, float f3, float f4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        int width3 = (int) (view.getWidth() / 2.0f);
        int height3 = (int) (view.getHeight() / 2.0f);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = RangesKt.coerceAtMost(RangesKt.coerceAtLeast((int) ((f3 - width3) - viewGroup.getPaddingLeft()), 0), (width - width2) - viewGroup.getPaddingRight());
        layoutParams2.topMargin = RangesKt.coerceAtMost(RangesKt.coerceAtLeast((int) ((f4 - height3) - viewGroup.getPaddingTop()), 0), ((height - height2) - viewGroup.getPaddingBottom()) - viewGroup.getPaddingTop());
        view.setLayoutParams(layoutParams2);
    }
}
