package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f58783n;
    private float rl;

    static int[] n(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = iArr[i2] * 2;
        }
        return iArr2;
    }

    static float rl(float f3, float f4, float f5) {
        return 1.0f - ((f3 - f5) / (f4 - f5));
    }

    boolean J2() {
        return true;
    }

    abstract boolean KN(n nVar, int i2);

    abstract Wre Uo(n nVar, View view);

    void O(Context context) {
        float fKN = this.f58783n;
        if (fKN <= 0.0f) {
            fKN = I28.KN(context);
        }
        this.f58783n = fKN;
        float fUo = this.rl;
        if (fUo <= 0.0f) {
            fUo = I28.Uo(context);
        }
        this.rl = fUo;
    }

    public float nr() {
        return this.f58783n;
    }

    public float t() {
        return this.rl;
    }
}
