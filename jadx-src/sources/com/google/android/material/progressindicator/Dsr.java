package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    n f59080n;

    abstract int J2();

    abstract int O();

    abstract void n(Canvas canvas, Rect rect, float f3, boolean z2, boolean z3);

    abstract void nr(Canvas canvas, Paint paint, float f3, float f4, int i2, int i3, int i5);

    abstract void rl(Canvas canvas, Paint paint, int i2, int i3);

    abstract void t(Canvas canvas, Paint paint, j jVar, int i2);

    protected static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f59081n;
        int nr;
        float rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f59082t;

        protected j() {
        }
    }

    void Uo(Canvas canvas, Rect rect, float f3, boolean z2, boolean z3) {
        this.f59080n.O();
        n(canvas, rect, f3, z2, z3);
    }

    public Dsr(n nVar) {
        this.f59080n = nVar;
    }
}
