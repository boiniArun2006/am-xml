package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class u0 extends j0 implements VideoContentListener {
    protected boolean isOverlayOutside = true;

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onCompleted() {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/flow/u0;->onCompleted()V");
        CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.h.f63176p, "fyber exo-player");
        safedk_u0_onCompleted_fc2fad99162a16a2c1f8313850fb03d3();
    }

    public boolean isOverlayOutside() {
        return this.isOverlayOutside;
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onPlayerError() {
        InneractiveContentController.EventsListener eventsListener = this.mEventsListener;
        if (eventsListener != null) {
            ((VideoContentListener) eventsListener).onPlayerError();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onProgress(int i2, int i3) {
        InneractiveContentController.EventsListener eventsListener = this.mEventsListener;
        if (eventsListener != null) {
            ((VideoContentListener) eventsListener).onProgress(i2, i3);
        }
    }

    public void safedk_u0_onCompleted_fc2fad99162a16a2c1f8313850fb03d3() {
        InneractiveContentController.EventsListener eventsListener = this.mEventsListener;
        if (eventsListener != null) {
            ((VideoContentListener) eventsListener).onCompleted();
        }
    }

    public u0 setOverlayOutside(boolean z2) {
        this.isOverlayOutside = z2;
        return this;
    }
}
