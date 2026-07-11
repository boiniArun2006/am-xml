package com.alightcreative.widget;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface QJ {

    public static final class j {
        public static /* synthetic */ void n(QJ qj, oXP oxp, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selected");
            }
            if ((i2 & 1) != 0) {
                oxp = oXP.f47461n;
            }
            qj.n(oxp);
        }
    }

    void J2(int i2);

    void KN(Bitmap bitmap);

    void O(Drawable drawable);

    void Uo();

    void n(oXP oxp);

    void nr(int i2);

    void rl(String str);

    void t(Function0 function0);

    void xMQ(int i2);
}
