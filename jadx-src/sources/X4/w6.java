package X4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.TintTypedArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class w6 {
    public static int t(Context context, TypedArray typedArray, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i2, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i2, i3);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i3);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    static int J2(TypedArray typedArray, int i2, int i3) {
        if (typedArray.hasValue(i2)) {
            return i2;
        }
        return i3;
    }

    public static boolean KN(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static float O(Context context) {
        return context.getResources().getConfiguration().fontScale;
    }

    public static Ml Uo(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0) {
            return new Ml(context, resourceId);
        }
        return null;
    }

    public static ColorStateList n(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList colorStateListN;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0 && (colorStateListN = AppCompatResources.n(context, resourceId)) != null) {
            return colorStateListN;
        }
        return typedArray.getColorStateList(i2);
    }

    public static Drawable nr(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable drawableRl;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0 && (drawableRl = AppCompatResources.rl(context, resourceId)) != null) {
            return drawableRl;
        }
        return typedArray.getDrawable(i2);
    }

    public static ColorStateList rl(Context context, TintTypedArray tintTypedArray, int i2) {
        int iTy;
        ColorStateList colorStateListN;
        if (tintTypedArray.o(i2) && (iTy = tintTypedArray.ty(i2, 0)) != 0 && (colorStateListN = AppCompatResources.n(context, iTy)) != null) {
            return colorStateListN;
        }
        return tintTypedArray.t(i2);
    }

    public static boolean xMQ(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 2.0f) {
            return true;
        }
        return false;
    }
}
