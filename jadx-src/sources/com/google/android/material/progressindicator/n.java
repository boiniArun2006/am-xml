package com.google.android.material.progressindicator;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class n {
    public int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f59122O;
    public int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f59123n;
    public int nr;
    public int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f59124t = new int[0];

    private void nr(Context context, TypedArray typedArray) {
        int i2 = Rxk.o.f8853a;
        if (typedArray.hasValue(i2)) {
            this.nr = typedArray.getColor(i2, -1);
            return;
        }
        this.nr = this.f59124t[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f3 = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.nr = W3.j.n(this.nr, (int) (f3 * 255.0f));
    }

    private void t(Context context, TypedArray typedArray) {
        int i2 = Rxk.o.f8831M;
        if (!typedArray.hasValue(i2)) {
            this.f59124t = new int[]{W3.j.rl(context, Rxk.n.qie, -1)};
            return;
        }
        if (typedArray.peekValue(i2).type != 1) {
            this.f59124t = new int[]{typedArray.getColor(i2, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i2, -1));
        this.f59124t = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    void O() {
        if (this.Uo < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }

    public boolean n() {
        return this.J2 != 0;
    }

    public boolean rl() {
        return this.f59122O != 0;
    }

    protected n(Context context, AttributeSet attributeSet, int i2, int i3) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(Rxk.Ml.f8761z);
        TypedArray typedArrayXMQ = eO.xMQ(context, attributeSet, Rxk.o.eF, i2, i3, new int[0]);
        this.f59123n = X4.w6.t(context, typedArrayXMQ, Rxk.o.f8822GR, dimensionPixelSize);
        this.rl = Math.min(X4.w6.t(context, typedArrayXMQ, Rxk.o.f8824I, 0), this.f59123n / 2);
        this.f59122O = typedArrayXMQ.getInt(Rxk.o.f8825J, 0);
        this.J2 = typedArrayXMQ.getInt(Rxk.o.f8817E, 0);
        this.Uo = typedArrayXMQ.getDimensionPixelSize(Rxk.o.f8819FX, 0);
        t(context, typedArrayXMQ);
        nr(context, typedArrayXMQ);
        typedArrayXMQ.recycle();
    }
}
