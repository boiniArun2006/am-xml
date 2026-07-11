package com.facebook.imagepipeline.producers;

import bA.C1653C;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class RzR {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final RzR f52513n = new RzR();

    public static final int n(int i2) {
        return (int) (i2 * 1.3333334f);
    }

    public static final boolean rl(int i2, int i3, dX.CN3 cn3) {
        return cn3 == null ? ((float) n(i2)) >= 2048.0f && n(i3) >= 2048 : n(i2) >= cn3.f63505n && n(i3) >= cn3.rl;
    }

    public static final boolean t(C1653C c1653c, dX.CN3 cn3) {
        if (c1653c == null) {
            return false;
        }
        int iM = c1653c.m();
        return (iM == 90 || iM == 270) ? rl(c1653c.getHeight(), c1653c.getWidth(), cn3) : rl(c1653c.getWidth(), c1653c.getHeight(), cn3);
    }

    private RzR() {
    }
}
