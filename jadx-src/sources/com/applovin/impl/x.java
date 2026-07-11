package com.applovin.impl;

import com.amazon.device.ads.DTBAdSize;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DTBAdSize f50729b;

    private enum a {
        VIDEO,
        DISPLAY,
        INTERSTITIAL
    }

    public DTBAdSize a() {
        return this.f50729b;
    }

    private a a(MaxAdFormat maxAdFormat) {
        return maxAdFormat.isAdViewAd() ? a.DISPLAY : a.INTERSTITIAL;
    }

    public x(String str, JSONObject jSONObject, MaxAdFormat maxAdFormat) {
        this.f50728a = str;
        this.f50729b = a(JsonUtils.getInt(jSONObject, "type", a(maxAdFormat).ordinal()), maxAdFormat, str);
    }

    private DTBAdSize a(int i2, MaxAdFormat maxAdFormat, String str) {
        try {
            if (a.VIDEO.ordinal() == i2) {
                return new DTBAdSize.DTBVideo(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 480, str);
            }
            if (a.DISPLAY.ordinal() == i2) {
                return new DTBAdSize(maxAdFormat.getSize().getWidth(), maxAdFormat.getSize().getHeight(), str);
            }
            if (a.INTERSTITIAL.ordinal() == i2) {
                return new DTBAdSize.DTBInterstitialAdSize(str);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
