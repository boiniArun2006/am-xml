package com.fyber.inneractive.sdk.external;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public enum InneractiveMediationName {
    ADMOB("admob"),
    DFP(InneractiveMediationNameConsts.DFP),
    FYBER("fyber"),
    OTHER(InneractiveMediationNameConsts.OTHER);

    final String key;

    public String getKey() {
        return this.key;
    }

    InneractiveMediationName(String str) {
        this.key = str;
    }
}
