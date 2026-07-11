package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class l extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f56761a;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f63176p, this, me);
        return super.dispatchTouchEvent(me);
    }

    public l(Context context, float f3) {
        super(context);
        this.f56761a = f3;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int iMakeMeasureSpec;
        View.MeasureSpec.getMode(i2);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != 0 && (mode != Integer.MIN_VALUE || View.MeasureSpec.getSize(i3) <= 0)) {
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i3);
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            i3 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        } else {
            int size3 = View.MeasureSpec.getSize(i2);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            float f3 = this.f56761a;
            if (f3 != 0.0f) {
                i3 = View.MeasureSpec.makeMeasureSpec((int) (size3 * f3), 1073741824);
            }
            iMakeMeasureSpec = iMakeMeasureSpec2;
        }
        super.onMeasure(iMakeMeasureSpec, i3);
    }
}
