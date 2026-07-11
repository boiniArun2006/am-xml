package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathParser;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a$\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aC\u0010\u0016\u001a\u00020\u0000*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\b*\u00020\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a1\u0010\u001a\u001a\u00020\u0013*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a9\u0010\u001d\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#\u001a9\u0010$\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b$\u0010\u001e\u001a9\u0010%\u001a\u00020\u001c*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0018\u00010\u0011R\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b%\u0010\u001e\"\u0014\u0010'\u001a\u00020\u00008\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"", "id", "Landroidx/compose/ui/graphics/StrokeCap;", "defValue", "rl", "(II)I", "Landroidx/compose/ui/graphics/StrokeJoin;", "t", "Lorg/xmlpull/v1/XmlPullParser;", "", "nr", "(Lorg/xmlpull/v1/XmlPullParser;)Z", "Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "Landroid/content/res/Resources;", "res", "Landroid/util/AttributeSet;", "attrs", "Landroid/content/res/Resources$Theme;", "theme", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "builder", "nestedGroups", "Uo", "(Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Landroidx/compose/ui/graphics/vector/ImageVector$Builder;I)I", "mUb", "(Lorg/xmlpull/v1/XmlPullParser;)Lorg/xmlpull/v1/XmlPullParser;", c.f62177j, "(Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "", "xMQ", "(Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;Landroidx/compose/ui/graphics/vector/ImageVector$Builder;)V", "Landroidx/core/content/res/ComplexColorCompat;", "complexColor", "Landroidx/compose/ui/graphics/Brush;", "O", "(Landroidx/core/content/res/ComplexColorCompat;)Landroidx/compose/ui/graphics/Brush;", "J2", "KN", "I", "FILL_TYPE_WINDING", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nXmlVectorParser.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,693:1\n1#2:694\n123#3:695\n123#3:696\n*S KotlinDebug\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n*L\n234#1:695\n235#1:696\n*E\n"})
public final class XmlVectorParser_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f31946n = 0;

    public static final void J2(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.f31942n;
        TypedArray typedArrayGh = androidVectorParser.gh(resources, theme, attributeSet, androidVectorResources.rl());
        String strXMQ = androidVectorParser.xMQ(typedArrayGh, androidVectorResources.t());
        if (strXMQ == null) {
            strXMQ = "";
        }
        String str = strXMQ;
        String strXMQ2 = androidVectorParser.xMQ(typedArrayGh, androidVectorResources.nr());
        List listNr = strXMQ2 == null ? VectorKt.nr() : PathParser.rl(androidVectorParser.pathParser, strXMQ2, null, 2, null);
        typedArrayGh.recycle();
        ImageVector.Builder.rl(builder, str, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, listNr, 254, null);
    }

    public static final void KN(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.f31942n;
        TypedArray typedArrayGh = androidVectorParser.gh(resources, theme, attributeSet, androidVectorResources.O());
        float fUo = androidVectorParser.Uo(typedArrayGh, "rotation", androidVectorResources.xMQ(), 0.0f);
        float fRl = androidVectorParser.rl(typedArrayGh, androidVectorResources.Uo(), 0.0f);
        float fRl2 = androidVectorParser.rl(typedArrayGh, androidVectorResources.KN(), 0.0f);
        float fUo2 = androidVectorParser.Uo(typedArrayGh, "scaleX", androidVectorResources.mUb(), 1.0f);
        float fUo3 = androidVectorParser.Uo(typedArrayGh, "scaleY", androidVectorResources.gh(), 1.0f);
        float fUo4 = androidVectorParser.Uo(typedArrayGh, "translateX", androidVectorResources.qie(), 0.0f);
        float fUo5 = androidVectorParser.Uo(typedArrayGh, "translateY", androidVectorResources.az(), 0.0f);
        String strXMQ = androidVectorParser.xMQ(typedArrayGh, androidVectorResources.J2());
        if (strXMQ == null) {
            strXMQ = "";
        }
        typedArrayGh.recycle();
        builder.n(strXMQ, fUo, fRl, fRl2, fUo2, fUo3, fUo4, fUo5, VectorKt.nr());
    }

    public static final ImageVector.Builder n(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet) throws XmlPullParserException {
        long jUo;
        int iNY;
        ColorStateList colorStateListO;
        AndroidVectorResources androidVectorResources = AndroidVectorResources.f31942n;
        TypedArray typedArrayGh = androidVectorParser.gh(resources, theme, attributeSet, androidVectorResources.e());
        boolean zNr = androidVectorParser.nr(typedArrayGh, "autoMirrored", androidVectorResources.n(), false);
        float fUo = androidVectorParser.Uo(typedArrayGh, "viewportWidth", androidVectorResources.T(), 0.0f);
        float fUo2 = androidVectorParser.Uo(typedArrayGh, "viewportHeight", androidVectorResources.X(), 0.0f);
        if (fUo <= 0.0f) {
            throw new XmlPullParserException(typedArrayGh.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (fUo2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayGh.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float fN = androidVectorParser.n(typedArrayGh, androidVectorResources.N(), 0.0f);
        float fN2 = androidVectorParser.n(typedArrayGh, androidVectorResources.ty(), 0.0f);
        if (typedArrayGh.hasValue(androidVectorResources.fD())) {
            TypedValue typedValue = new TypedValue();
            typedArrayGh.getValue(androidVectorResources.fD(), typedValue);
            jUo = (typedValue.type == 2 || (colorStateListO = androidVectorParser.O(typedArrayGh, theme, "tint", androidVectorResources.fD())) == null) ? Color.INSTANCE.Uo() : ColorKt.rl(colorStateListO.getDefaultColor());
        } else {
            jUo = Color.INSTANCE.Uo();
        }
        long j2 = jUo;
        int iT = androidVectorParser.t(typedArrayGh, androidVectorResources.E2(), -1);
        if (iT == -1) {
            iNY = BlendMode.INSTANCE.nY();
        } else if (iT == 3) {
            iNY = BlendMode.INSTANCE.te();
        } else if (iT == 5) {
            iNY = BlendMode.INSTANCE.nY();
        } else if (iT != 9) {
            switch (iT) {
                case 14:
                    iNY = BlendMode.INSTANCE.Ik();
                    break;
                case 15:
                    iNY = BlendMode.INSTANCE.S();
                    break;
                case 16:
                    iNY = BlendMode.INSTANCE.Z();
                    break;
                default:
                    iNY = BlendMode.INSTANCE.nY();
                    break;
            }
        } else {
            iNY = BlendMode.INSTANCE.ViF();
        }
        int i2 = iNY;
        float fKN = Dp.KN(fN / resources.getDisplayMetrics().density);
        float fKN2 = Dp.KN(fN2 / resources.getDisplayMetrics().density);
        typedArrayGh.recycle();
        return new ImageVector.Builder(null, fKN, fKN2, fUo, fUo2, j2, i2, zNr, 1, null);
    }

    private static final int rl(int i2, int i3) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i3 : StrokeCap.INSTANCE.t() : StrokeCap.INSTANCE.rl() : StrokeCap.INSTANCE.n();
    }

    private static final int t(int i2, int i3) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i3 : StrokeJoin.INSTANCE.n() : StrokeJoin.INSTANCE.t() : StrokeJoin.INSTANCE.rl();
    }

    public static final void xMQ(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.f31942n;
        TypedArray typedArrayGh = androidVectorParser.gh(resources, theme, attributeSet, androidVectorResources.HI());
        if (!TypedArrayUtils.ck(androidVectorParser.getXmlParser(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String strXMQ = androidVectorParser.xMQ(typedArrayGh, androidVectorResources.r());
        if (strXMQ == null) {
            strXMQ = "";
        }
        String str = strXMQ;
        String strXMQ2 = androidVectorParser.xMQ(typedArrayGh, androidVectorResources.o());
        List listNr = strXMQ2 == null ? VectorKt.nr() : PathParser.rl(androidVectorParser.pathParser, strXMQ2, null, 2, null);
        ComplexColorCompat complexColorCompatJ2 = androidVectorParser.J2(typedArrayGh, theme, "fillColor", androidVectorResources.Ik(), 0);
        float fUo = androidVectorParser.Uo(typedArrayGh, "fillAlpha", androidVectorResources.ck(), 1.0f);
        int iRl = rl(androidVectorParser.KN(typedArrayGh, "strokeLineCap", androidVectorResources.S(), -1), StrokeCap.INSTANCE.n());
        int iT = t(androidVectorParser.KN(typedArrayGh, "strokeLineJoin", androidVectorResources.WPU(), -1), StrokeJoin.INSTANCE.n());
        float fUo2 = androidVectorParser.Uo(typedArrayGh, "strokeMiterLimit", androidVectorResources.aYN(), 1.0f);
        ComplexColorCompat complexColorCompatJ22 = androidVectorParser.J2(typedArrayGh, theme, "strokeColor", androidVectorResources.XQ(), 0);
        float fUo3 = androidVectorParser.Uo(typedArrayGh, "strokeAlpha", androidVectorResources.Z(), 1.0f);
        float fUo4 = androidVectorParser.Uo(typedArrayGh, "strokeWidth", androidVectorResources.ViF(), 1.0f);
        float fUo5 = androidVectorParser.Uo(typedArrayGh, "trimPathEnd", androidVectorResources.nY(), 1.0f);
        float fUo6 = androidVectorParser.Uo(typedArrayGh, "trimPathOffset", androidVectorResources.te(), 0.0f);
        float fUo7 = androidVectorParser.Uo(typedArrayGh, "trimPathStart", androidVectorResources.iF(), 0.0f);
        int iKN = androidVectorParser.KN(typedArrayGh, "fillType", androidVectorResources.g(), f31946n);
        typedArrayGh.recycle();
        builder.t(listNr, iKN == 0 ? PathFillType.INSTANCE.rl() : PathFillType.INSTANCE.n(), str, O(complexColorCompatJ2), fUo, O(complexColorCompatJ22), fUo3, fUo4, iRl, iT, fUo2, fUo7, fUo5, fUo6);
    }

    private static final Brush O(ComplexColorCompat complexColorCompat) {
        if (!complexColorCompat.qie()) {
            return null;
        }
        Shader shaderJ2 = complexColorCompat.J2();
        if (shaderJ2 != null) {
            return BrushKt.n(shaderJ2);
        }
        return new SolidColor(ColorKt.rl(complexColorCompat.O()), null);
    }

    public static final int Uo(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ImageVector.Builder builder, int i2) throws XmlPullParserException {
        int eventType = androidVectorParser.getXmlParser().getEventType();
        if (eventType != 2) {
            if (eventType == 3 && Intrinsics.areEqual("group", androidVectorParser.getXmlParser().getName())) {
                int i3 = i2 + 1;
                for (int i5 = 0; i5 < i3; i5++) {
                    builder.Uo();
                }
                return 0;
            }
            return i2;
        }
        String name = androidVectorParser.getXmlParser().getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1649314686) {
                if (iHashCode != 3433509) {
                    if (iHashCode == 98629247 && name.equals("group")) {
                        KN(androidVectorParser, resources, theme, attributeSet, builder);
                        return i2;
                    }
                    return i2;
                }
                if (name.equals(JavetError.PARAMETER_PATH)) {
                    xMQ(androidVectorParser, resources, theme, attributeSet, builder);
                    return i2;
                }
                return i2;
            }
            if (name.equals("clip-path")) {
                J2(androidVectorParser, resources, theme, attributeSet, builder);
                return i2 + 1;
            }
            return i2;
        }
        return i2;
    }

    public static final XmlPullParser mUb(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static final boolean nr(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 1 || (xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3)) {
            return true;
        }
        return false;
    }
}
