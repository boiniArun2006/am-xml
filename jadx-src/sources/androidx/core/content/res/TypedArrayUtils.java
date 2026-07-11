package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.RestrictTo;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class TypedArrayUtils {
    public static TypedArray Ik(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    private static ColorStateList KN(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static boolean ck(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int n(Context context, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? i2 : i3;
    }

    public static CharSequence[] HI(TypedArray typedArray, int i2, int i3) {
        CharSequence[] textArray = typedArray.getTextArray(i2);
        if (textArray == null) {
            return typedArray.getTextArray(i3);
        }
        return textArray;
    }

    public static int J2(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, int i3) {
        if (!ck(xmlPullParser, str)) {
            return i3;
        }
        return typedArray.getColor(i2, i3);
    }

    public static boolean O(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, boolean z2) {
        if (!ck(xmlPullParser, str)) {
            return z2;
        }
        return typedArray.getBoolean(i2, z2);
    }

    public static ColorStateList Uo(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2) {
        if (ck(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i3 = typedValue.type;
            if (i3 != 2) {
                if (i3 >= 28 && i3 <= 31) {
                    return KN(typedValue);
                }
                return ColorStateListInflaterCompat.nr(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            }
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i2 + ": " + typedValue);
        }
        return null;
    }

    public static String az(TypedArray typedArray, int i2, int i3) {
        String string = typedArray.getString(i2);
        if (string == null) {
            return typedArray.getString(i3);
        }
        return string;
    }

    public static int gh(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, int i3) {
        if (!ck(xmlPullParser, str)) {
            return i3;
        }
        return typedArray.getInt(i2, i3);
    }

    public static float mUb(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, float f3) {
        if (!ck(xmlPullParser, str)) {
            return f3;
        }
        return typedArray.getFloat(i2, f3);
    }

    public static int nr(TypedArray typedArray, int i2, int i3, int i5) {
        return typedArray.getInt(i2, typedArray.getInt(i3, i5));
    }

    public static int qie(TypedArray typedArray, int i2, int i3, int i5) {
        return typedArray.getResourceId(i2, typedArray.getResourceId(i3, i5));
    }

    public static boolean rl(TypedArray typedArray, int i2, int i3, boolean z2) {
        return typedArray.getBoolean(i2, typedArray.getBoolean(i3, z2));
    }

    public static Drawable t(TypedArray typedArray, int i2, int i3) {
        Drawable drawable = typedArray.getDrawable(i2);
        if (drawable == null) {
            return typedArray.getDrawable(i3);
        }
        return drawable;
    }

    public static CharSequence ty(TypedArray typedArray, int i2, int i3) {
        CharSequence text = typedArray.getText(i2);
        if (text == null) {
            return typedArray.getText(i3);
        }
        return text;
    }

    public static ComplexColorCompat xMQ(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2, int i3) {
        if (ck(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i5 = typedValue.type;
            if (i5 >= 28 && i5 <= 31) {
                return ComplexColorCompat.rl(typedValue.data);
            }
            ComplexColorCompat complexColorCompatUo = ComplexColorCompat.Uo(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            if (complexColorCompatUo != null) {
                return complexColorCompatUo;
            }
        }
        return ComplexColorCompat.rl(i3);
    }
}
