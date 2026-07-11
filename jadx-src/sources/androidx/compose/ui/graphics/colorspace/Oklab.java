package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0010\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Oklab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "id", "<init>", "(Ljava/lang/String;I)V", "component", "", "J2", "(I)F", "O", "", "v", "qie", "([F)[F", "v0", "v1", "v2", "", "mUb", "(FFF)J", "az", "(FFF)F", "x", "y", "z", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "colorSpace", "Landroidx/compose/ui/graphics/Color;", "ty", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "rl", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOklab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,172:1\n65#2,10:173\n65#2,10:183\n65#2,10:193\n65#2,10:203\n65#2,10:213\n65#2,10:223\n65#2,10:241\n65#2,10:251\n65#2,10:261\n638#3:233\n653#3:234\n668#3:235\n638#3:236\n653#3:237\n638#3:271\n653#3:272\n668#3:273\n668#3:274\n638#3:275\n653#3:276\n668#3:277\n638#3:278\n653#3:279\n668#3:280\n53#4,3:238\n*S KotlinDebug\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n*L\n39#1:173,10\n40#1:183,10\n41#1:193,10\n53#1:203,10\n54#1:213,10\n55#1:223,10\n72#1:241,10\n73#1:251,10\n74#1:261,10\n57#1:233\n58#1:234\n59#1:235\n65#1:236\n66#1:237\n76#1:271\n77#1:272\n78#1:273\n84#1:274\n96#1:275\n97#1:276\n98#1:277\n104#1:278\n105#1:279\n106#1:280\n68#1:238,3\n*E\n"})
public final class Oklab extends ColorSpace {
    private static final float[] J2;
    private static final float[] KN;
    private static final float[] Uo;
    private static final float[] xMQ;

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float J2(int component) {
        return component == 0 ? 0.0f : -0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float O(int component) {
        return component == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float az(float v0, float v1, float v2) {
        if (v0 < 0.0f) {
            v0 = 0.0f;
        }
        if (v0 > 1.0f) {
            v0 = 1.0f;
        }
        if (v1 < -0.5f) {
            v1 = -0.5f;
        }
        if (v1 > 0.5f) {
            v1 = 0.5f;
        }
        if (v2 < -0.5f) {
            v2 = -0.5f;
        }
        float f3 = v2 <= 0.5f ? v2 : 0.5f;
        float[] fArr = xMQ;
        float f4 = (fArr[0] * v0) + (fArr[3] * v1) + (fArr[6] * f3);
        float f5 = (fArr[1] * v0) + (fArr[4] * v1) + (fArr[7] * f3);
        float f6 = (fArr[2] * v0) + (fArr[5] * v1) + (fArr[8] * f3);
        float f7 = f4 * f4 * f4;
        float f8 = f5 * f5 * f5;
        float[] fArr2 = KN;
        return (fArr2[2] * f7) + (fArr2[5] * f8) + (fArr2[8] * f6 * f6 * f6);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long mUb(float v0, float v1, float v2) {
        if (v0 < 0.0f) {
            v0 = 0.0f;
        }
        if (v0 > 1.0f) {
            v0 = 1.0f;
        }
        if (v1 < -0.5f) {
            v1 = -0.5f;
        }
        if (v1 > 0.5f) {
            v1 = 0.5f;
        }
        if (v2 < -0.5f) {
            v2 = -0.5f;
        }
        float f3 = v2 <= 0.5f ? v2 : 0.5f;
        float[] fArr = xMQ;
        float f4 = (fArr[0] * v0) + (fArr[3] * v1) + (fArr[6] * f3);
        float f5 = (fArr[1] * v0) + (fArr[4] * v1) + (fArr[7] * f3);
        float f6 = (fArr[2] * v0) + (fArr[5] * v1) + (fArr[8] * f3);
        float f7 = f4 * f4 * f4;
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float[] fArr2 = KN;
        return (((long) Float.floatToRawIntBits(((fArr2[0] * f7) + (fArr2[3] * f8)) + (fArr2[6] * f9))) << 32) | (((long) Float.floatToRawIntBits((fArr2[1] * f7) + (fArr2[4] * f8) + (fArr2[7] * f9))) & 4294967295L);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] qie(float[] v2) {
        float f3 = v2[0];
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        v2[0] = f3;
        float f4 = v2[1];
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        if (f4 > 0.5f) {
            f4 = 0.5f;
        }
        v2[1] = f4;
        float f5 = v2[2];
        float f6 = f5 >= -0.5f ? f5 : -0.5f;
        v2[2] = f6 <= 0.5f ? f6 : 0.5f;
        ColorSpaceKt.ty(xMQ, v2);
        float f7 = v2[0];
        v2[0] = f7 * f7 * f7;
        float f8 = v2[1];
        v2[1] = f8 * f8 * f8;
        float f9 = v2[2];
        v2[2] = f9 * f9 * f9;
        ColorSpaceKt.ty(KN, v2);
        return v2;
    }

    static {
        float[] transform = Adaptation.INSTANCE.n().getTransform();
        Illuminant illuminant = Illuminant.f31613n;
        float[] fArrQie = ColorSpaceKt.qie(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, ColorSpaceKt.O(transform, illuminant.rl().t(), illuminant.O().t()));
        J2 = fArrQie;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        Uo = fArr;
        KN = ColorSpaceKt.gh(fArrQie);
        xMQ = ColorSpaceKt.gh(fArr);
    }

    public Oklab(String str, int i2) {
        super(str, ColorModel.INSTANCE.n(), i2, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] rl(float[] v2) {
        ColorSpaceKt.ty(J2, v2);
        v2[0] = MathHelpersKt.n(v2[0]);
        v2[1] = MathHelpersKt.n(v2[1]);
        v2[2] = MathHelpersKt.n(v2[2]);
        ColorSpaceKt.ty(Uo, v2);
        return v2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long ty(float x2, float y2, float z2, float a2, ColorSpace colorSpace) {
        float[] fArr = J2;
        float f3 = (fArr[0] * x2) + (fArr[3] * y2) + (fArr[6] * z2);
        float f4 = (fArr[1] * x2) + (fArr[4] * y2) + (fArr[7] * z2);
        float f5 = (fArr[2] * x2) + (fArr[5] * y2) + (fArr[8] * z2);
        float fN = MathHelpersKt.n(f3);
        float fN2 = MathHelpersKt.n(f4);
        float fN3 = MathHelpersKt.n(f5);
        float[] fArr2 = Uo;
        return ColorKt.n((fArr2[0] * fN) + (fArr2[3] * fN2) + (fArr2[6] * fN3), (fArr2[1] * fN) + (fArr2[4] * fN2) + (fArr2[7] * fN3), (fArr2[2] * fN) + (fArr2[5] * fN2) + (fArr2[8] * fN3), a2, colorSpace);
    }
}
