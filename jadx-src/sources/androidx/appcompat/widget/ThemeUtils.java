package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class ThemeUtils {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadLocal f14379n = new ThreadLocal();
    static final int[] rl = {-16842910};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final int[] f14380t = {R.attr.state_focused};
    static final int[] nr = {R.attr.state_activated};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    static final int[] f14378O = {R.attr.state_pressed};
    static final int[] J2 = {R.attr.state_checked};
    static final int[] Uo = {R.attr.state_selected};
    static final int[] KN = {-16842919, -16842908};
    static final int[] xMQ = new int[0];
    private static final int[] mUb = new int[1];

    private static TypedValue J2() {
        ThreadLocal threadLocal = f14379n;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList O(Context context, int i2) {
        int[] iArr = mUb;
        iArr[0] = i2;
        TintTypedArray tintTypedArrayXQ = TintTypedArray.XQ(context, null, iArr);
        try {
            return tintTypedArrayXQ.t(0);
        } finally {
            tintTypedArrayXQ.aYN();
        }
    }

    public static void n(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(androidx.appcompat.R.styleable.qm);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.Po6)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int t(Context context, int i2) {
        int[] iArr = mUb;
        iArr[0] = i2;
        TintTypedArray tintTypedArrayXQ = TintTypedArray.XQ(context, null, iArr);
        try {
            return tintTypedArrayXQ.rl(0, 0);
        } finally {
            tintTypedArrayXQ.aYN();
        }
    }

    static int nr(Context context, int i2, float f3) {
        return ColorUtils.ck(t(context, i2), Math.round(Color.alpha(r0) * f3));
    }

    public static int rl(Context context, int i2) {
        ColorStateList colorStateListO = O(context, i2);
        if (colorStateListO != null && colorStateListO.isStateful()) {
            return colorStateListO.getColorForState(rl, colorStateListO.getDefaultColor());
        }
        TypedValue typedValueJ2 = J2();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueJ2, true);
        return nr(context, i2, typedValueJ2.getFloat());
    }
}
