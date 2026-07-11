package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.flow.v0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class InneractiveAdRequest extends v0 {
    public static final double FLOOR_PRICE_MAX_VALUE = 400000.0d;
    public static final double FLOOR_PRICE_MIN_VALUE = 0.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f53518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s0 f53519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Double f53520e;

    public Double getFloorPrice() {
        return this.f53520e;
    }

    public s0 getSelectedUnitConfig() {
        return this.f53519d;
    }

    public String getSpotId() {
        return this.f53518c;
    }

    public void setSelectedUnitConfig(s0 s0Var) {
        this.f53519d = s0Var;
    }

    public InneractiveAdRequest(String str) {
        this.f53518c = str;
    }

    @Deprecated
    public boolean getMuteVideo() {
        return InneractiveAdManager.getMuteVideo();
    }

    @Deprecated
    public InneractiveUserConfig getUserParams() {
        return InneractiveAdManager.getUserParams();
    }

    public void setFloorPrice(double d2) {
        double dMax = 0.0d;
        if (!Double.isNaN(d2)) {
            dMax = Math.max(0.0d, Math.min(d2, 400000.0d));
        }
        if (dMax != d2) {
            IAlog.f("Invalid floor price: %.2f — adjusted to %.2f.", Double.valueOf(d2), Double.valueOf(dMax));
        }
        this.f53520e = Double.valueOf(dMax);
    }

    @Deprecated
    public void setMuteVideo(boolean z2) {
        InneractiveAdManager.setMuteVideo(z2);
    }

    @Deprecated
    public void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        InneractiveAdManager.setUserParams(inneractiveUserConfig);
    }
}
