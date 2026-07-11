package com.facebook.imageutils;

import android.graphics.ColorSpace;
import kotlin.Pair;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ColorSpace f52657n;
    private final Pair rl;

    public final ColorSpace n() {
        return this.f52657n;
    }

    public final Pair rl() {
        return this.rl;
    }

    public Wre(int i2, int i3, ColorSpace colorSpace) {
        Pair pair;
        this.f52657n = colorSpace;
        if (i2 != -1 && i3 != -1) {
            pair = new Pair(Integer.valueOf(i2), Integer.valueOf(i3));
        } else {
            pair = null;
        }
        this.rl = pair;
    }
}
