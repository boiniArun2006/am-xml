package W3;

import X4.n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class j {
    public static boolean KN(int i2) {
        return i2 != 0 && ColorUtils.J2(i2) > 0.5d;
    }

    private static int qie(Context context, TypedValue typedValue) {
        int i2 = typedValue.resourceId;
        return i2 != 0 ? ContextCompat.getColor(context, i2) : typedValue.data;
    }

    public static Integer J2(Context context, int i2) {
        TypedValue typedValueN = n.n(context, i2);
        if (typedValueN != null) {
            return Integer.valueOf(qie(context, typedValueN));
        }
        return null;
    }

    public static int O(View view, int i2, int i3) {
        return rl(view.getContext(), i2, i3);
    }

    public static ColorStateList Uo(Context context, int i2) {
        TypedValue typedValueN = n.n(context, i2);
        if (typedValueN == null) {
            return null;
        }
        int i3 = typedValueN.resourceId;
        if (i3 != 0) {
            return ContextCompat.getColorStateList(context, i3);
        }
        int i5 = typedValueN.data;
        if (i5 == 0) {
            return null;
        }
        return ColorStateList.valueOf(i5);
    }

    public static int gh(View view, int i2, int i3, float f3) {
        return mUb(nr(view, i2), nr(view, i3), f3);
    }

    public static int mUb(int i2, int i3, float f3) {
        return xMQ(i2, ColorUtils.ck(i3, Math.round(Color.alpha(i3) * f3)));
    }

    public static int n(int i2, int i3) {
        return ColorUtils.ck(i2, (Color.alpha(i2) * i3) / 255);
    }

    public static int nr(View view, int i2) {
        return qie(view.getContext(), n.J2(view, i2));
    }

    public static int rl(Context context, int i2, int i3) {
        Integer numJ2 = J2(context, i2);
        if (numJ2 != null) {
            return numJ2.intValue();
        }
        return i3;
    }

    public static int t(Context context, int i2, String str) {
        return qie(context, n.O(context, i2, str));
    }

    public static int xMQ(int i2, int i3) {
        return ColorUtils.gh(i3, i2);
    }
}
