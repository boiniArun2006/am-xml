package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.RestrictTo;
import androidx.core.R;
import androidx.core.math.MathUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public final class ColorStateListInflaterCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadLocal f36357n = new ThreadLocal();

    private static int Uo(int i2, float f3, float f4) {
        boolean z2 = f4 >= 0.0f && f4 <= 100.0f;
        if (f3 == 1.0f && !z2) {
            return i2;
        }
        int iRl = MathUtils.rl((int) ((Color.alpha(i2) * f3) + 0.5f), 0, 255);
        if (z2) {
            CamColor camColorT = CamColor.t(i2);
            i2 = CamColor.az(camColorT.mUb(), camColorT.xMQ(), f4);
        }
        return (i2 & 16777215) | (iRl << 24);
    }

    private static TypedArray KN(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ColorStateList O(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        Resources resources2 = resources;
        int i2 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrN = new int[20];
        int i3 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i2 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayKN = KN(resources2, theme, attributeSet, R.styleable.rl);
                int i5 = R.styleable.f36188t;
                int resourceId = typedArrayKN.getResourceId(i5, -1);
                if (resourceId == -1 || J2(resources2, resourceId)) {
                    color = typedArrayKN.getColor(i5, -65281);
                } else {
                    try {
                        color = n(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayKN.getColor(R.styleable.f36188t, -65281);
                    }
                }
                int i7 = R.styleable.nr;
                float f3 = 1.0f;
                if (typedArrayKN.hasValue(i7)) {
                    f3 = typedArrayKN.getFloat(i7, 1.0f);
                } else {
                    int i8 = R.styleable.J2;
                    if (typedArrayKN.hasValue(i8)) {
                        f3 = typedArrayKN.getFloat(i8, 1.0f);
                    }
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    int i9 = R.styleable.f36178O;
                    float f4 = typedArrayKN.hasValue(i9) ? typedArrayKN.getFloat(i9, -1.0f) : typedArrayKN.getFloat(R.styleable.Uo, -1.0f);
                    typedArrayKN.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr2 = new int[attributeCount];
                    int i10 = 0;
                    for (int i11 = 0; i11 < attributeCount; i11++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.f36140n && attributeNameResource != R.attr.rl) {
                            int i12 = i10 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr2[i10] = attributeNameResource;
                            i10 = i12;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i10);
                    iArrN = GrowingArrayUtils.n(iArrN, i3, Uo(color, f3, f4));
                    iArr = (int[][]) GrowingArrayUtils.rl(iArr, i3, iArrTrimStateSet);
                    i3++;
                }
            }
            i2 = 1;
            resources2 = resources;
        }
        int[] iArr3 = new int[i3];
        int[][] iArr4 = new int[i3][];
        System.arraycopy(iArrN, 0, iArr3, 0, i3);
        System.arraycopy(iArr, 0, iArr4, 0, i3);
        return new ColorStateList(iArr4, iArr3);
    }

    private static TypedValue t() {
        ThreadLocal threadLocal = f36357n;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static boolean J2(Resources resources, int i2) {
        TypedValue typedValueT = t();
        resources.getValue(i2, typedValueT, true);
        int i3 = typedValueT.type;
        if (i3 >= 28 && i3 <= 31) {
            return true;
        }
        return false;
    }

    public static ColorStateList n(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return rl(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList nr(Resources resources, int i2, Resources.Theme theme) {
        try {
            return n(resources, resources.getXml(i2), theme);
        } catch (Exception e2) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
            return null;
        }
    }

    public static ColorStateList rl(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return O(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }
}
