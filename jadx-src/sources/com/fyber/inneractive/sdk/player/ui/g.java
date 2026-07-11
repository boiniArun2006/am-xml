package com.fyber.inneractive.sdk.player.ui;

import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import com.fyber.inneractive.sdk.util.v;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class g extends TextureView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f56434a;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.f63176p, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        s sVar = (s) v.a(this.f56434a);
        if (sVar instanceof i) {
            sVar = ((i) sVar).f56437z;
        }
        if (sVar != null) {
            i2 = View.MeasureSpec.makeMeasureSpec(sVar.f56514u.f57002a, 1073741824);
            i3 = View.MeasureSpec.makeMeasureSpec(sVar.f56514u.f57003b, 1073741824);
        }
        super.onMeasure(i2, i3);
    }

    public g(s sVar) {
        super(sVar.getContext());
        this.f56434a = new WeakReference(sVar);
    }
}
