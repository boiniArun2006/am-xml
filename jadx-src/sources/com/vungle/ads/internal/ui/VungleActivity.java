package com.vungle.ads.internal.ui;

import android.view.MotionEvent;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0011¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/ui/VungleActivity;", "Lcom/vungle/ads/internal/ui/AdActivity;", "()V", "canRotate", "", "canRotate$vungle_ads_release", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VungleActivity extends AdActivity {
    @Override // com.vungle.ads.internal.ui.AdActivity
    @VisibleForTesting
    public boolean canRotate$vungle_ads_release() {
        return true;
    }

    @Override // com.vungle.ads.internal.ui.AdActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(h.f63164d, me);
        return super.dispatchTouchEvent(me);
    }
}
