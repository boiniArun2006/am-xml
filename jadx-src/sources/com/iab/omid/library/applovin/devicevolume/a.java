package com.iab.omid.library.applovin.devicevolume;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class a {
    public float a(int i2, int i3) {
        if (i3 <= 0 || i2 <= 0) {
            return 0.0f;
        }
        float f3 = i2 / i3;
        if (f3 > 1.0f) {
            return 1.0f;
        }
        return f3;
    }
}
