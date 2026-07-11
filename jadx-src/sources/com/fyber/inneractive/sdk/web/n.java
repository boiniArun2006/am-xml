package com.fyber.inneractive.sdk.web;

import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class n implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/web/n;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        CreativeInfoManager.onViewTouched(com.safedk.android.utils.h.f63176p, view, motionEvent);
        return safedk_n_onTouch_3d559b545db00b2b44ecd25d1ef89cb7(view, motionEvent);
    }

    public boolean safedk_n_onTouch_3d559b545db00b2b44ecd25d1ef89cb7(View p0, MotionEvent p1) {
        return true;
    }
}
