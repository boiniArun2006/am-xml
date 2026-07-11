package com.fyber.inneractive.sdk.flow.vast;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public enum e {
    BITRATE_NOT_IN_RANGE(1),
    UNSUPPORTED_MIME_TYPE(2),
    UNSUPPORTED_DELIVERY(3),
    UNSECURED_VIDEO_URL(4),
    VERTICAL_VIDEO_EXPECTED(5),
    FILTERED_BY_APP_OR_UNIT(6),
    NO_CONTENT(7);

    int value;

    e(int i2) {
        this.value = i2;
    }
}
