package com.applovin.creative;

import android.view.MotionEvent;
import com.applovin.impl.o1;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class MaxCreativeDebuggerDisplayedAdActivity extends o1 {
    @Override // com.applovin.impl.o1, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(h.f63161a, me);
        return super.dispatchTouchEvent(me);
    }
}
