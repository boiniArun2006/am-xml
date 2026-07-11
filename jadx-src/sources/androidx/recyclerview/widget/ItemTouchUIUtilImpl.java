package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.R;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class ItemTouchUIUtilImpl implements ItemTouchUIUtil {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final ItemTouchUIUtil f41102n = new ItemTouchUIUtilImpl();

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void nr(Canvas canvas, RecyclerView recyclerView, View view, float f3, float f4, int i2, boolean z2) {
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void rl(View view) {
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void n(View view) {
        int i2 = R.id.f40961n;
        Object tag = view.getTag(i2);
        if (tag instanceof Float) {
            ViewCompat.fcU(view, ((Float) tag).floatValue());
        }
        view.setTag(i2, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public void t(Canvas canvas, RecyclerView recyclerView, View view, float f3, float f4, int i2, boolean z2) {
        if (z2) {
            int i3 = R.id.f40961n;
            if (view.getTag(i3) == null) {
                Float fValueOf = Float.valueOf(ViewCompat.XQ(view));
                ViewCompat.fcU(view, O(recyclerView, view) + 1.0f);
                view.setTag(i3, fValueOf);
            }
        }
        view.setTranslationX(f3);
        view.setTranslationY(f4);
    }

    ItemTouchUIUtilImpl() {
    }

    private static float O(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f3 = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            if (childAt != view) {
                float fXQ = ViewCompat.XQ(childAt);
                if (fXQ > f3) {
                    f3 = fXQ;
                }
            }
        }
        return f3;
    }
}
