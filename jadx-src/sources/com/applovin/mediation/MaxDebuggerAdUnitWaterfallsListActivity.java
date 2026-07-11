package com.applovin.mediation;

import android.view.MotionEvent;
import com.applovin.impl.AbstractActivityC1795p;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class MaxDebuggerAdUnitWaterfallsListActivity extends AbstractActivityC1795p {
    @Override // com.applovin.impl.AbstractActivityC1795p, com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(h.f63161a, me);
        return super.dispatchTouchEvent(me);
    }
}
