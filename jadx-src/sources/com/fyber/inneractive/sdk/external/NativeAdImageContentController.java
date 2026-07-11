package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.j0;
import com.fyber.inneractive.sdk.flow.x;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class NativeAdImageContentController extends j0 {
    @Override // com.fyber.inneractive.sdk.flow.j0
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        x adContent = inneractiveAdSpot.getAdContent();
        if ((adContent instanceof NativeAdContent) && !adContent.isVideoAd()) {
            return true;
        }
        return false;
    }
}
