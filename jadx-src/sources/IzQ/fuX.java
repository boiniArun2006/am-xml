package IzQ;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import androidx.core.graphics.PathParser;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.caoccao.javet.exceptions.JavetError;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class fuX {
    private static boolean O(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    public static TimeInterpolator Uo(Context context, int i2, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        return nr(strValueOf) ? t(strValueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
    }

    private static float n(String[] strArr, int i2) {
        float f3 = Float.parseFloat(strArr[i2]);
        if (f3 >= 0.0f && f3 <= 1.0f) {
            return f3;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f3);
    }

    private static boolean nr(String str) {
        return O(str, "cubic-bezier") || O(str, JavetError.PARAMETER_PATH);
    }

    private static TimeInterpolator t(String str) {
        if (!O(str, "cubic-bezier")) {
            if (O(str, JavetError.PARAMETER_PATH)) {
                return PathInterpolatorCompat.rl(PathParser.O(rl(str, JavetError.PARAMETER_PATH)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
        String[] strArrSplit = rl(str, "cubic-bezier").split(",");
        if (strArrSplit.length == 4) {
            return PathInterpolatorCompat.n(n(strArrSplit, 0), n(strArrSplit, 1), n(strArrSplit, 2), n(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    public static int J2(Context context, int i2, int i3) {
        return X4.n.t(context, i2, i3);
    }

    private static String rl(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }
}
