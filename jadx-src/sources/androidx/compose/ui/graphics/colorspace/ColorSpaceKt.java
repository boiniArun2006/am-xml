package androidx.compose.ui.graphics.colorspace;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.Connector;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0011\u001a*\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a(\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a%\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a?\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a?\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0018\u0010\u0017\u001aO\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aO\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001d\u0010\u001c\u001a?\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001e\u0010\u0017\u001a?\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001f\u0010\u0017\u001a\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010$\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020#2\u0006\u0010\u0012\u001a\u00020#H\u0000¢\u0006\u0004\b$\u0010%\u001a\u0017\u0010'\u001a\u00020#2\u0006\u0010&\u001a\u00020#H\u0000¢\u0006\u0004\b'\u0010(\u001a\u001f\u0010+\u001a\u00020#2\u0006\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020#H\u0000¢\u0006\u0004\b+\u0010,\u001a\u001f\u0010-\u001a\u00020#2\u0006\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020#H\u0000¢\u0006\u0004\b-\u0010,\u001a\u001f\u0010.\u001a\u00020#2\u0006\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020#H\u0000¢\u0006\u0004\b.\u0010,\u001a'\u00102\u001a\u00020#2\u0006\u0010/\u001a\u00020#2\u0006\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020#H\u0000¢\u0006\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "source", "destination", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "intent", "Landroidx/compose/ui/graphics/colorspace/Connector;", "mUb", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)Landroidx/compose/ui/graphics/colorspace/Connector;", "KN", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "adaptation", "t", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/Adaptation;)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "x", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "d", "g", "HI", "(DDDDDD)D", "Ik", "e", InneractiveMediationDefs.GENDER_FEMALE, "ck", "(DDDDDDDD)D", "r", c.f62177j, "rl", "", "J2", "(Landroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/WhitePoint;)Z", "", "Uo", "([F[F)Z", "m", "gh", "([F)[F", "lhs", "rhs", "qie", "([F[F)[F", "ty", "az", "matrix", "srcWhitePoint", "dstWhitePoint", "O", "([F[F[F)[F", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 2 Connector.kt\nandroidx/compose/ui/graphics/colorspace/ConnectorKt\n+ 3 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,717:1\n326#2:718\n679#3:719\n1#4:720\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n*L\n401#1:718\n401#1:719\n401#1:720\n*E\n"})
public final class ColorSpaceKt {
    public static final double HI(double d2, double d4, double d5, double d6, double d7, double d8) {
        return d2 >= d7 * d6 ? (Math.pow(d2, 1.0d / d8) - d5) / d4 : d2 / d6;
    }

    public static final boolean J2(WhitePoint whitePoint, WhitePoint whitePoint2) {
        if (whitePoint == whitePoint2) {
            return true;
        }
        return Math.abs(whitePoint.getX() - whitePoint2.getX()) < 0.001f && Math.abs(whitePoint.getY() - whitePoint2.getY()) < 0.001f;
    }

    public static final boolean Uo(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (Float.compare(fArr[i2], fArr2[i2]) != 0 && Math.abs(fArr[i2] - fArr2[i2]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final float[] az(float[] fArr, float[] fArr2) {
        float f3 = fArr[0];
        float f4 = fArr2[0] * f3;
        float f5 = fArr[1];
        float f6 = fArr2[1] * f5;
        float f7 = fArr[2];
        return new float[]{f4, f6, fArr2[2] * f7, fArr2[3] * f3, fArr2[4] * f5, fArr2[5] * f7, f3 * fArr2[6], f5 * fArr2[7], f7 * fArr2[8]};
    }

    public static final double ck(double d2, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        return d2 >= d7 * d6 ? (Math.pow(d2 - d8, 1.0d / d10) - d5) / d4 : (d2 - d9) / d6;
    }

    public static final float[] ty(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f3 = fArr2[0];
        float f4 = fArr2[1];
        float f5 = fArr2[2];
        fArr2[0] = (fArr[0] * f3) + (fArr[3] * f4) + (fArr[6] * f5);
        fArr2[1] = (fArr[1] * f3) + (fArr[4] * f4) + (fArr[7] * f5);
        fArr2[2] = (fArr[2] * f3) + (fArr[5] * f4) + (fArr[8] * f5);
        return fArr2;
    }

    public static final double Ik(double d2, double d4, double d5, double d6, double d7, double d8) {
        return d2 >= d7 ? Math.pow((d4 * d2) + d5, d8) : d6 * d2;
    }

    public static final float[] gh(float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[3];
        float f5 = fArr[6];
        float f6 = fArr[1];
        float f7 = fArr[4];
        float f8 = fArr[7];
        float f9 = fArr[2];
        float f10 = fArr[5];
        float f11 = fArr[8];
        float f12 = (f7 * f11) - (f8 * f10);
        float f13 = (f8 * f9) - (f6 * f11);
        float f14 = (f6 * f10) - (f7 * f9);
        float f15 = (f3 * f12) + (f4 * f13) + (f5 * f14);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f12 / f15;
        fArr2[1] = f13 / f15;
        fArr2[2] = f14 / f15;
        fArr2[3] = ((f5 * f10) - (f4 * f11)) / f15;
        fArr2[4] = ((f11 * f3) - (f5 * f9)) / f15;
        fArr2[5] = ((f9 * f4) - (f10 * f3)) / f15;
        fArr2[6] = ((f4 * f8) - (f5 * f7)) / f15;
        fArr2[7] = ((f5 * f6) - (f8 * f3)) / f15;
        fArr2[8] = ((f3 * f7) - (f4 * f6)) / f15;
        return fArr2;
    }

    private static final Connector mUb(ColorSpace colorSpace, ColorSpace colorSpace2, int i2) {
        if (colorSpace == colorSpace2) {
            return Connector.INSTANCE.t(colorSpace);
        }
        long jUo = colorSpace.getModel();
        ColorModel.Companion companion = ColorModel.INSTANCE;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (!ColorModel.J2(jUo, companion.rl()) || !ColorModel.J2(colorSpace2.getModel(), companion.rl())) {
            return new Connector(colorSpace, colorSpace2, i2, defaultConstructorMarker);
        }
        Intrinsics.checkNotNull(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        Intrinsics.checkNotNull(colorSpace2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        return new Connector.RgbConnector((Rgb) colorSpace, (Rgb) colorSpace2, i2, defaultConstructorMarker);
    }

    public static final double n(double d2, double d4, double d5, double d6, double d7, double d8) {
        return Math.copySign(HI(d2 < 0.0d ? -d2 : d2, d4, d5, d6, d7, d8), d2);
    }

    public static /* synthetic */ ColorSpace nr(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            adaptation = Adaptation.INSTANCE.n();
        }
        return t(colorSpace, whitePoint, adaptation);
    }

    public static final float[] qie(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f3 = fArr[0] * fArr2[0];
        float f4 = fArr[3];
        float f5 = fArr2[1];
        float f6 = fArr[6];
        float f7 = fArr2[2];
        fArr3[0] = f3 + (f4 * f5) + (f6 * f7);
        float f8 = fArr[1];
        float f9 = fArr2[0];
        float f10 = fArr[4];
        float f11 = fArr[7];
        fArr3[1] = (f8 * f9) + (f5 * f10) + (f11 * f7);
        float f12 = fArr[2] * f9;
        float f13 = fArr[5];
        float f14 = f12 + (fArr2[1] * f13);
        float f15 = fArr[8];
        fArr3[2] = f14 + (f7 * f15);
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = f17 + (f4 * f18);
        float f20 = fArr2[5];
        fArr3[3] = f19 + (f6 * f20);
        float f21 = fArr[1];
        float f22 = fArr2[3];
        fArr3[4] = (f21 * f22) + (f10 * f18) + (f11 * f20);
        float f23 = fArr[2];
        fArr3[5] = (f22 * f23) + (f13 * fArr2[4]) + (f20 * f15);
        float f24 = f16 * fArr2[6];
        float f25 = fArr[3];
        float f26 = fArr2[7];
        float f27 = f24 + (f25 * f26);
        float f28 = fArr2[8];
        fArr3[6] = f27 + (f6 * f28);
        float f29 = fArr2[6];
        fArr3[7] = (f21 * f29) + (fArr[4] * f26) + (f11 * f28);
        fArr3[8] = (f23 * f29) + (fArr[5] * fArr2[7]) + (f15 * f28);
        return fArr3;
    }

    public static final double r(double d2, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        return d2 >= d7 ? Math.pow((d4 * d2) + d5, d10) + d8 : (d6 * d2) + d9;
    }

    public static final double rl(double d2, double d4, double d5, double d6, double d7, double d8) {
        return Math.copySign(Ik(d2 < 0.0d ? -d2 : d2, d4, d5, d6, d7, d8), d2);
    }

    public static /* synthetic */ Connector xMQ(ColorSpace colorSpace, ColorSpace colorSpace2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            colorSpace2 = ColorSpaces.f31604n.X();
        }
        if ((i3 & 2) != 0) {
            i2 = RenderIntent.INSTANCE.rl();
        }
        return KN(colorSpace, colorSpace2, i2);
    }

    public static final Connector KN(ColorSpace colorSpace, ColorSpace colorSpace2, int i2) {
        int iNr = colorSpace.getId();
        int iNr2 = colorSpace2.getId();
        if ((iNr | iNr2) < 0) {
            return mUb(colorSpace, colorSpace2, i2);
        }
        MutableIntObjectMap mutableIntObjectMapN = ConnectorKt.n();
        int i3 = iNr | (iNr2 << 6) | (i2 << 12);
        Object objRl = mutableIntObjectMapN.rl(i3);
        if (objRl == null) {
            objRl = mUb(colorSpace, colorSpace2, i2);
            mutableIntObjectMapN.r(i3, objRl);
        }
        return (Connector) objRl;
    }

    public static final float[] O(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArrTy = ty(fArr, fArr2);
        float[] fArrTy2 = ty(fArr, fArr3);
        return qie(gh(fArr), az(new float[]{fArrTy2[0] / fArrTy[0], fArrTy2[1] / fArrTy[1], fArrTy2[2] / fArrTy[2]}, fArr));
    }

    public static final ColorSpace t(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation) {
        if (ColorModel.J2(colorSpace.getModel(), ColorModel.INSTANCE.rl())) {
            Intrinsics.checkNotNull(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) colorSpace;
            if (!J2(rgb.getWhitePoint(), whitePoint)) {
                return new Rgb(rgb, qie(O(adaptation.getTransform(), rgb.getWhitePoint().t(), whitePoint.t()), rgb.getTransform()), whitePoint);
            }
        }
        return colorSpace;
    }
}
