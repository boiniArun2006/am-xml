package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Wre extends n {
    public int KN;
    public int mUb;
    public int xMQ;

    public Wre(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Rxk.n.Uo);
    }

    public Wre(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, I28.f59083U);
    }

    public Wre(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(Rxk.Ml.dR0);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(Rxk.Ml.f8754k);
        TypedArray typedArrayXMQ = eO.xMQ(context, attributeSet, Rxk.o.Toy, i2, i3, new int[0]);
        this.KN = Math.max(X4.w6.t(context, typedArrayXMQ, Rxk.o.xzo, dimensionPixelSize), this.f59123n * 2);
        this.xMQ = X4.w6.t(context, typedArrayXMQ, Rxk.o.Th, dimensionPixelSize2);
        this.mUb = typedArrayXMQ.getInt(Rxk.o.wKp, 0);
        typedArrayXMQ.recycle();
        O();
    }
}
