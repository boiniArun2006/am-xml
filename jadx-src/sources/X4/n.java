package X4;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class n {
    public static TypedValue n(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static TypedValue J2(View view, int i2) {
        return O(view.getContext(), i2, view.getClass().getCanonicalName());
    }

    public static TypedValue O(Context context, int i2, String str) {
        TypedValue typedValueN = n(context, i2);
        if (typedValueN != null) {
            return typedValueN;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static int nr(Context context, int i2, String str) {
        return O(context, i2, str).data;
    }

    public static boolean rl(Context context, int i2, boolean z2) {
        TypedValue typedValueN = n(context, i2);
        if (typedValueN != null && typedValueN.type == 18) {
            if (typedValueN.data != 0) {
                return true;
            }
            return false;
        }
        return z2;
    }

    public static int t(Context context, int i2, int i3) {
        TypedValue typedValueN = n(context, i2);
        if (typedValueN != null && typedValueN.type == 16) {
            return typedValueN.data;
        }
        return i3;
    }
}
