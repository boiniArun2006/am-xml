package com.google.android.material.carousel;

import android.content.Context;
import com.google.android.material.carousel.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class I28 {
    static float mUb(float f3, float f4, float f5, int i2) {
        return i2 > 0 ? f4 + (f5 / 2.0f) : f3;
    }

    static Wre nr(Context context, float f3, float f4, j jVar, int i2) {
        return i2 == 1 ? t(context, f3, f4, jVar) : O(context, f3, f4, jVar);
    }

    static float rl(float f3, float f4, int i2) {
        return i2 > 0 ? f3 + (f4 / 2.0f) : f3;
    }

    static int xMQ(int[] iArr) {
        int i2 = Integer.MIN_VALUE;
        for (int i3 : iArr) {
            if (i3 > i2) {
                i2 = i3;
            }
        }
        return i2;
    }

    static float n(float f3, float f4, int i2) {
        return f3 + (Math.max(0, i2 - 1) * f4);
    }

    static Wre t(Context context, float f3, float f4, j jVar) {
        float f5;
        float f6;
        float fMin = Math.min(J2(context) + f3, jVar.J2);
        float f7 = fMin / 2.0f;
        float f8 = 0.0f - f7;
        float fRl = rl(0.0f, jVar.rl, jVar.f58796t);
        float fMUb = mUb(0.0f, n(fRl, jVar.rl, (int) Math.floor(jVar.f58796t / 2.0f)), jVar.rl, jVar.f58796t);
        float fRl2 = rl(fMUb, jVar.f58794O, jVar.nr);
        float fMUb2 = mUb(fMUb, n(fRl2, jVar.f58794O, (int) Math.floor(jVar.nr / 2.0f)), jVar.f58794O, jVar.nr);
        float fRl3 = rl(fMUb2, jVar.J2, jVar.Uo);
        float fMUb3 = mUb(fMUb2, n(fRl3, jVar.J2, jVar.Uo), jVar.J2, jVar.Uo);
        float fRl4 = rl(fMUb3, jVar.f58794O, jVar.nr);
        float fRl5 = rl(mUb(fMUb3, n(fRl4, jVar.f58794O, (int) Math.ceil(jVar.nr / 2.0f)), jVar.f58794O, jVar.nr), jVar.rl, jVar.f58796t);
        float f9 = f7 + f4;
        float fRl6 = Ml.rl(fMin, jVar.J2, f3);
        float fRl7 = Ml.rl(jVar.rl, jVar.J2, f3);
        float fRl8 = Ml.rl(jVar.f58794O, jVar.J2, f3);
        Wre.n nVarN = new Wre.n(jVar.J2, f4).n(f8, fRl6, fMin);
        if (jVar.f58796t > 0) {
            f5 = 2.0f;
            f6 = f9;
            nVarN.Uo(fRl, fRl7, jVar.rl, (int) Math.floor(r7 / 2.0f));
        } else {
            f5 = 2.0f;
            f6 = f9;
        }
        if (jVar.nr > 0) {
            nVarN.Uo(fRl2, fRl8, jVar.f58794O, (int) Math.floor(r4 / f5));
        }
        nVarN.KN(fRl3, 0.0f, jVar.J2, jVar.Uo, true);
        if (jVar.nr > 0) {
            nVarN.Uo(fRl4, fRl8, jVar.f58794O, (int) Math.ceil(r4 / f5));
        }
        if (jVar.f58796t > 0) {
            nVarN.Uo(fRl5, fRl7, jVar.rl, (int) Math.ceil(r0 / f5));
        }
        nVarN.n(f6, fRl6, fMin);
        return nVarN.xMQ();
    }

    static float J2(Context context) {
        return context.getResources().getDimension(Rxk.Ml.f8758r);
    }

    static float KN(Context context) {
        return context.getResources().getDimension(Rxk.Ml.f8750Z);
    }

    static Wre O(Context context, float f3, float f4, j jVar) {
        float fMin = Math.min(J2(context) + f3, jVar.J2);
        float f5 = fMin / 2.0f;
        float f6 = 0.0f - f5;
        float fRl = rl(0.0f, jVar.J2, jVar.Uo);
        float fMUb = mUb(0.0f, n(fRl, jVar.J2, jVar.Uo), jVar.J2, jVar.Uo);
        float fRl2 = rl(fMUb, jVar.f58794O, jVar.nr);
        float fRl3 = rl(mUb(fMUb, fRl2, jVar.f58794O, jVar.nr), jVar.rl, jVar.f58796t);
        float f7 = f5 + f4;
        float fRl4 = Ml.rl(fMin, jVar.J2, f3);
        float fRl5 = Ml.rl(jVar.rl, jVar.J2, f3);
        float fRl6 = Ml.rl(jVar.f58794O, jVar.J2, f3);
        Wre.n nVarKN = new Wre.n(jVar.J2, f4).n(f6, fRl4, fMin).KN(fRl, 0.0f, jVar.J2, jVar.Uo, true);
        if (jVar.nr > 0) {
            nVarKN.rl(fRl2, fRl6, jVar.f58794O);
        }
        int i2 = jVar.f58796t;
        if (i2 > 0) {
            nVarKN.Uo(fRl3, fRl5, jVar.rl, i2);
        }
        nVarKN.n(f7, fRl4, fMin);
        return nVarKN.xMQ();
    }

    static float Uo(Context context) {
        return context.getResources().getDimension(Rxk.Ml.f8757o);
    }
}
