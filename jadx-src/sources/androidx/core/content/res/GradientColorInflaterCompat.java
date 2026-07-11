package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.core.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@RestrictTo
final class GradientColorInflaterCompat {
    private static Shader.TileMode nr(int i2) {
        return i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    private static ColorStops n(ColorStops colorStops, int i2, int i3, boolean z2, int i5) {
        return colorStops != null ? colorStops : z2 ? new ColorStops(i2, i5, i3) : new ColorStops(i2, i3);
    }

    static Shader rl(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayIk = TypedArrayUtils.Ik(resources, theme, attributeSet, R.styleable.te);
        float fMUb = TypedArrayUtils.mUb(typedArrayIk, xmlPullParser, "startX", R.styleable.s7N, 0.0f);
        float fMUb2 = TypedArrayUtils.mUb(typedArrayIk, xmlPullParser, "startY", R.styleable.wTp, 0.0f);
        float fMUb3 = TypedArrayUtils.mUb(typedArrayIk, xmlPullParser, "endX", R.styleable.f36189v, 0.0f);
        float fMUb4 = TypedArrayUtils.mUb(typedArrayIk, xmlPullParser, "endY", R.styleable.rV9, 0.0f);
        float fMUb5 = TypedArrayUtils.mUb(typedArrayIk, xmlPullParser, "centerX", R.styleable.f36183e, 0.0f);
        float fMUb6 = TypedArrayUtils.mUb(typedArrayIk, xmlPullParser, "centerY", R.styleable.f36181X, 0.0f);
        int iGh = TypedArrayUtils.gh(typedArrayIk, xmlPullParser, "type", R.styleable.E2, 0);
        int iJ2 = TypedArrayUtils.J2(typedArrayIk, xmlPullParser, "startColor", R.styleable.iF, 0);
        boolean zCk = TypedArrayUtils.ck(xmlPullParser, "centerColor");
        int iJ22 = TypedArrayUtils.J2(typedArrayIk, xmlPullParser, "centerColor", R.styleable.nHg, 0);
        int iJ23 = TypedArrayUtils.J2(typedArrayIk, xmlPullParser, "endColor", R.styleable.fD, 0);
        int iGh2 = TypedArrayUtils.gh(typedArrayIk, xmlPullParser, "tileMode", R.styleable.f36177N, 0);
        float fMUb7 = TypedArrayUtils.mUb(typedArrayIk, xmlPullParser, "gradientRadius", R.styleable.f36180T, 0.0f);
        typedArrayIk.recycle();
        ColorStops colorStopsN = n(t(resources, xmlPullParser, attributeSet, theme), iJ2, iJ23, zCk, iJ22);
        if (iGh != 1) {
            return iGh != 2 ? new LinearGradient(fMUb, fMUb2, fMUb3, fMUb4, colorStopsN.f36367n, colorStopsN.rl, nr(iGh2)) : new SweepGradient(fMUb5, fMUb6, colorStopsN.f36367n, colorStopsN.rl);
        }
        if (fMUb7 > 0.0f) {
            return new RadialGradient(fMUb5, fMUb6, fMUb7, colorStopsN.f36367n, colorStopsN.rl, nr(iGh2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        return new androidx.core.content.res.GradientColorInflaterCompat.ColorStops(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ColorStops t(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayIk = TypedArrayUtils.Ik(resources, theme, attributeSet, R.styleable.bzg);
                int i2 = R.styleable.Xw;
                boolean zHasValue = typedArrayIk.hasValue(i2);
                int i3 = R.styleable.jB;
                boolean zHasValue2 = typedArrayIk.hasValue(i3);
                if (!zHasValue || !zHasValue2) {
                    break;
                }
                int color = typedArrayIk.getColor(i2, 0);
                float f3 = typedArrayIk.getFloat(i3, 0.0f);
                typedArrayIk.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f3));
            }
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    static final class ColorStops {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final int[] f36367n;
        final float[] rl;

        ColorStops(List list, List list2) {
            int size = list.size();
            this.f36367n = new int[size];
            this.rl = new float[size];
            for (int i2 = 0; i2 < size; i2++) {
                this.f36367n[i2] = ((Integer) list.get(i2)).intValue();
                this.rl[i2] = ((Float) list2.get(i2)).floatValue();
            }
        }

        ColorStops(int i2, int i3) {
            this.f36367n = new int[]{i2, i3};
            this.rl = new float[]{0.0f, 1.0f};
        }

        ColorStops(int i2, int i3, int i5) {
            this.f36367n = new int[]{i2, i3, i5};
            this.rl = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
