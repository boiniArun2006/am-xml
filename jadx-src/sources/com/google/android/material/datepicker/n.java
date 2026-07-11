package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class n {
    final j J2;
    final Paint KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final j f58949O;
    final j Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final j f58950n;
    final j nr;
    final j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final j f58951t;

    n(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(X4.n.nr(context, Rxk.n.ViF, I28.class.getCanonicalName()), Rxk.o.Yq);
        this.f58950n = j.n(context, typedArrayObtainStyledAttributes.getResourceId(Rxk.o.kR, 0));
        this.Uo = j.n(context, typedArrayObtainStyledAttributes.getResourceId(Rxk.o.f11, 0));
        this.rl = j.n(context, typedArrayObtainStyledAttributes.getResourceId(Rxk.o.cAB, 0));
        this.f58951t = j.n(context, typedArrayObtainStyledAttributes.getResourceId(Rxk.o.yUZ, 0));
        ColorStateList colorStateListN = X4.w6.n(context, typedArrayObtainStyledAttributes, Rxk.o.Bha);
        this.nr = j.n(context, typedArrayObtainStyledAttributes.getResourceId(Rxk.o.YE, 0));
        this.f58949O = j.n(context, typedArrayObtainStyledAttributes.getResourceId(Rxk.o.H6M, 0));
        this.J2 = j.n(context, typedArrayObtainStyledAttributes.getResourceId(Rxk.o.hu, 0));
        Paint paint = new Paint();
        this.KN = paint;
        paint.setColor(colorStateListN.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
