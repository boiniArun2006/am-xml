package com.fyber.inneractive.sdk.renderers;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public enum m {
    BANNER_WIDTH(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE),
    BANNER_HEIGHT(50),
    BANNER_TABLET_HEIGHT(90),
    BANNER_TABLET_WIDTH(728),
    RECTANGLE_HEIGHT(250),
    RECTANGLE_WIDTH(com.safedk.android.internal.d.f62986a);

    final int value;

    m(int i2) {
        this.value = i2;
    }
}
