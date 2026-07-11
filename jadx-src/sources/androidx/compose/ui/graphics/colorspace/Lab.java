package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u0010\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "id", "<init>", "(Ljava/lang/String;I)V", "component", "", "J2", "(I)F", "O", "", "v", "qie", "([F)[F", "v0", "v1", "v2", "", "mUb", "(FFF)J", "az", "(FFF)F", "x", "y", "z", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "colorSpace", "Landroidx/compose/ui/graphics/Color;", "ty", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "rl", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,133:1\n65#2,10:134\n65#2,10:144\n65#2,10:154\n65#2,10:164\n65#2,10:174\n65#2,10:187\n65#2,10:197\n65#2,10:207\n65#2,10:217\n65#2,10:227\n65#2,10:237\n65#2,10:247\n65#2,10:257\n53#3,3:184\n*S KotlinDebug\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n*L\n39#1:134,10\n40#1:144,10\n41#1:154,10\n58#1:164,10\n59#1:174,10\n70#1:187,10\n71#1:197,10\n98#1:207,10\n99#1:217,10\n100#1:227,10\n119#1:237,10\n120#1:247,10\n121#1:257,10\n66#1:184,3\n*E\n"})
public final class Lab extends ColorSpace {
    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float J2(int component) {
        return component == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float O(int component) {
        return component == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float az(float v0, float v1, float v2) {
        if (v0 < 0.0f) {
            v0 = 0.0f;
        }
        if (v0 > 100.0f) {
            v0 = 100.0f;
        }
        if (v2 < -128.0f) {
            v2 = -128.0f;
        }
        if (v2 > 128.0f) {
            v2 = 128.0f;
        }
        float f3 = ((v0 + 16.0f) / 116.0f) - (v2 * 0.005f);
        return (f3 > 0.20689656f ? f3 * f3 * f3 : 0.12841855f * (f3 - 0.13793103f)) * Illuminant.f31613n.t()[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long mUb(float v0, float v1, float v2) {
        if (v0 < 0.0f) {
            v0 = 0.0f;
        }
        if (v0 > 100.0f) {
            v0 = 100.0f;
        }
        if (v1 < -128.0f) {
            v1 = -128.0f;
        }
        if (v1 > 128.0f) {
            v1 = 128.0f;
        }
        float f3 = (v0 + 16.0f) / 116.0f;
        float f4 = (v1 * 0.002f) + f3;
        float f5 = f4 > 0.20689656f ? f4 * f4 * f4 : (f4 - 0.13793103f) * 0.12841855f;
        float f6 = f3 > 0.20689656f ? f3 * f3 * f3 : (f3 - 0.13793103f) * 0.12841855f;
        Illuminant illuminant = Illuminant.f31613n;
        return (((long) Float.floatToRawIntBits(f6 * illuminant.t()[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f5 * illuminant.t()[0])) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] qie(float[] v2) {
        float f3 = v2[0];
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 100.0f) {
            f3 = 100.0f;
        }
        v2[0] = f3;
        float f4 = v2[1];
        if (f4 < -128.0f) {
            f4 = -128.0f;
        }
        if (f4 > 128.0f) {
            f4 = 128.0f;
        }
        v2[1] = f4;
        float f5 = v2[2];
        float f6 = f5 >= -128.0f ? f5 : -128.0f;
        float f7 = f6 <= 128.0f ? f6 : 128.0f;
        v2[2] = f7;
        float f8 = (f3 + 16.0f) / 116.0f;
        float f9 = (f4 * 0.002f) + f8;
        float f10 = f8 - (f7 * 0.005f);
        float f11 = f9 > 0.20689656f ? f9 * f9 * f9 : (f9 - 0.13793103f) * 0.12841855f;
        float f12 = f8 > 0.20689656f ? f8 * f8 * f8 : (f8 - 0.13793103f) * 0.12841855f;
        float f13 = f10 > 0.20689656f ? f10 * f10 * f10 : (f10 - 0.13793103f) * 0.12841855f;
        Illuminant illuminant = Illuminant.f31613n;
        v2[0] = f11 * illuminant.t()[0];
        v2[1] = f12 * illuminant.t()[1];
        v2[2] = f13 * illuminant.t()[2];
        return v2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] rl(float[] v2) {
        float f3 = v2[0];
        Illuminant illuminant = Illuminant.f31613n;
        float f4 = f3 / illuminant.t()[0];
        float f5 = v2[1] / illuminant.t()[1];
        float f6 = v2[2] / illuminant.t()[2];
        float fCbrt = f4 > 0.008856452f ? (float) Math.cbrt(f4) : (f4 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f5 > 0.008856452f ? (float) Math.cbrt(f5) : (f5 * 7.787037f) + 0.13793103f;
        float fCbrt3 = f6 > 0.008856452f ? (float) Math.cbrt(f6) : (f6 * 7.787037f) + 0.13793103f;
        float f7 = (116.0f * fCbrt2) - 16.0f;
        float f8 = (fCbrt - fCbrt2) * 500.0f;
        float f9 = (fCbrt2 - fCbrt3) * 200.0f;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > 100.0f) {
            f7 = 100.0f;
        }
        v2[0] = f7;
        if (f8 < -128.0f) {
            f8 = -128.0f;
        }
        if (f8 > 128.0f) {
            f8 = 128.0f;
        }
        v2[1] = f8;
        if (f9 < -128.0f) {
            f9 = -128.0f;
        }
        v2[2] = f9 <= 128.0f ? f9 : 128.0f;
        return v2;
    }

    public Lab(String str, int i2) {
        super(str, ColorModel.INSTANCE.n(), i2, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long ty(float x2, float y2, float z2, float a2, ColorSpace colorSpace) {
        Illuminant illuminant = Illuminant.f31613n;
        float f3 = x2 / illuminant.t()[0];
        float f4 = y2 / illuminant.t()[1];
        float f5 = z2 / illuminant.t()[2];
        float fCbrt = f3 > 0.008856452f ? (float) Math.cbrt(f3) : (f3 * 7.787037f) + 0.13793103f;
        float fCbrt2 = f4 > 0.008856452f ? (float) Math.cbrt(f4) : (f4 * 7.787037f) + 0.13793103f;
        float f6 = (116.0f * fCbrt2) - 16.0f;
        float f7 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f5 > 0.008856452f ? (float) Math.cbrt(f5) : (f5 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > 100.0f) {
            f6 = 100.0f;
        }
        if (f7 < -128.0f) {
            f7 = -128.0f;
        }
        if (f7 > 128.0f) {
            f7 = 128.0f;
        }
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        return ColorKt.n(f6, f7, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, a2, colorSpace);
    }
}
