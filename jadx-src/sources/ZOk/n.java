package ZOk;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.core.graphics.ColorUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f12388n = true;
    private static final int[] rl = {R.attr.state_pressed};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[] f12389t = {R.attr.state_hovered, R.attr.state_focused};
    private static final int[] nr = {R.attr.state_focused};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int[] f12387O = {R.attr.state_hovered};
    private static final int[] J2 = {R.attr.state_selected, R.attr.state_pressed};
    private static final int[] Uo = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};
    private static final int[] KN = {R.attr.state_selected, R.attr.state_focused};
    private static final int[] xMQ = {R.attr.state_selected, R.attr.state_hovered};
    private static final int[] mUb = {R.attr.state_selected};
    private static final int[] gh = {R.attr.state_enabled, R.attr.state_pressed};
    static final String qie = n.class.getSimpleName();

    public static boolean O(int[] iArr) {
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z2 = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z3 = true;
            }
        }
        return z2 && z3;
    }

    public static ColorStateList nr(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(gh, 0)) != 0) {
            Log.w(qie, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static ColorStateList n(ColorStateList colorStateList) {
        if (f12388n) {
            int[] iArr = nr;
            return new ColorStateList(new int[][]{mUb, iArr, StateSet.NOTHING}, new int[]{t(colorStateList, J2), t(colorStateList, iArr), t(colorStateList, rl)});
        }
        int[] iArr2 = J2;
        int[] iArr3 = Uo;
        int[] iArr4 = KN;
        int[] iArr5 = xMQ;
        int[] iArr6 = rl;
        int[] iArr7 = f12389t;
        int[] iArr8 = nr;
        int[] iArr9 = f12387O;
        return new ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, mUb, iArr6, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{t(colorStateList, iArr2), t(colorStateList, iArr3), t(colorStateList, iArr4), t(colorStateList, iArr5), 0, t(colorStateList, iArr6), t(colorStateList, iArr7), t(colorStateList, iArr8), t(colorStateList, iArr9), 0});
    }

    private static int t(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f12388n ? rl(colorForState) : colorForState;
    }

    private static int rl(int i2) {
        return ColorUtils.ck(i2, Math.min(Color.alpha(i2) * 2, 255));
    }
}
