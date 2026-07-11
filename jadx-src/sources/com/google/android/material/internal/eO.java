package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.TintTypedArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class eO {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f59017n = {Rxk.n.qie};
    private static final int[] rl = {Rxk.n.az};

    public static boolean Uo(Context context) {
        return X4.n.rl(context, Rxk.n.f8808o, false);
    }

    public static void n(Context context) {
        O(context, f59017n, "Theme.AppCompat");
    }

    private static void nr(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        boolean zJ2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Rxk.o.BUS, i2, i3);
        if (!typedArrayObtainStyledAttributes.getBoolean(Rxk.o.lwA, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zJ2 = typedArrayObtainStyledAttributes.getResourceId(Rxk.o.N4, -1) != -1;
        } else {
            zJ2 = J2(context, attributeSet, iArr, i2, i3, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zJ2) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void rl(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Rxk.o.BUS, i2, i3);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(Rxk.o.oeS, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z2) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(Rxk.n.f8804Z, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                t(context);
            }
        }
        n(context);
    }

    public static void t(Context context) {
        O(context, rl, "Theme.MaterialComponents");
    }

    private static boolean J2(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
        for (int i5 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i5, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    private static boolean KN(Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    private static void O(Context context, int[] iArr, String str) {
        if (KN(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    public static TintTypedArray mUb(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        rl(context, attributeSet, i2, i3);
        nr(context, attributeSet, iArr, i2, i3, iArr2);
        return TintTypedArray.S(context, attributeSet, iArr, i2, i3);
    }

    public static TypedArray xMQ(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        rl(context, attributeSet, i2, i3);
        nr(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }
}
