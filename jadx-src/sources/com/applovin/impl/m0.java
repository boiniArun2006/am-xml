package com.applovin.impl;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class m0 {
    public static int a(int i2, Context context) {
        if (o0.e()) {
            return context.getColor(i2);
        }
        return context.getResources().getColor(i2);
    }
}
