package com.fyber.inneractive.sdk.flow.endcard;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public enum l {
    Default(1),
    Fmp(2),
    Companion(3);

    private final int mPriority;

    public final int a() {
        return this.mPriority;
    }

    l(int i2) {
        this.mPriority = i2;
    }
}
