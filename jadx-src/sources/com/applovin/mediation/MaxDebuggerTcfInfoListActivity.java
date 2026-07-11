package com.applovin.mediation;

import android.view.MotionEvent;
import com.applovin.impl.y6;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class MaxDebuggerTcfInfoListActivity extends y6 {
    @Override // com.applovin.impl.y6, com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(h.f63161a, me);
        return super.dispatchTouchEvent(me);
    }
}
