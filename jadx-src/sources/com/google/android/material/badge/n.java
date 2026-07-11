package com.google.android.material.badge;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f58661n = false;

    public static void nr(Rect rect, float f3, float f4, float f5, float f6) {
        rect.set((int) (f3 - f5), (int) (f4 - f6), (int) (f3 + f5), (int) (f4 + f6));
    }

    public static void rl(j jVar, View view) {
        if (jVar == null) {
            return;
        }
        if (f58661n || jVar.xMQ() != null) {
            jVar.xMQ().setForeground(null);
        } else {
            view.getOverlay().remove(jVar);
        }
    }

    public static void t(j jVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        jVar.setBounds(rect);
        jVar.rV9(view, frameLayout);
    }

    public static void n(j jVar, View view, FrameLayout frameLayout) {
        t(jVar, view, frameLayout);
        if (jVar.xMQ() != null) {
            jVar.xMQ().setForeground(jVar);
        } else {
            if (!f58661n) {
                view.getOverlay().add(jVar);
                return;
            }
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }
}
