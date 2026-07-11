package androidx.compose.ui.platform;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", InneractiveMediationNameConsts.OTHER, "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "([F[F)Z", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInvertMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,81:1\n49#2:82\n49#2:83\n49#2:84\n49#2:85\n49#2:86\n49#2:87\n49#2:88\n49#2:89\n49#2:90\n49#2:91\n49#2:92\n49#2:93\n49#2:94\n49#2:95\n49#2:96\n49#2:97\n52#2,2:98\n52#2,2:100\n52#2,2:102\n52#2,2:104\n52#2,2:106\n52#2,2:108\n52#2,2:110\n52#2,2:112\n52#2,2:114\n52#2,2:116\n52#2,2:118\n52#2,2:120\n52#2,2:122\n52#2,2:124\n52#2,2:126\n52#2,2:128\n*S KotlinDebug\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n*L\n29#1:82\n30#1:83\n31#1:84\n32#1:85\n33#1:86\n34#1:87\n35#1:88\n36#1:89\n37#1:90\n38#1:91\n39#1:92\n40#1:93\n41#1:94\n42#1:95\n43#1:96\n44#1:97\n62#1:98,2\n63#1:100,2\n64#1:102,2\n65#1:104,2\n66#1:106,2\n67#1:108,2\n68#1:110,2\n69#1:112,2\n70#1:114,2\n71#1:116,2\n72#1:118,2\n73#1:120,2\n74#1:122,2\n75#1:124,2\n76#1:126,2\n77#1:128,2\n*E\n"})
public final class InvertMatrixKt {
    public static final boolean n(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f7 = fArr[4];
        float f8 = fArr[5];
        float f9 = fArr[6];
        float f10 = fArr[7];
        float f11 = fArr[8];
        float f12 = fArr[9];
        float f13 = fArr[10];
        float f14 = fArr[11];
        float f15 = fArr[12];
        float f16 = fArr[13];
        float f17 = fArr[14];
        float f18 = fArr[15];
        float f19 = (f3 * f8) - (f4 * f7);
        float f20 = (f3 * f9) - (f5 * f7);
        float f21 = (f3 * f10) - (f6 * f7);
        float f22 = (f4 * f9) - (f5 * f8);
        float f23 = (f4 * f10) - (f6 * f8);
        float f24 = (f5 * f10) - (f6 * f9);
        float f25 = (f11 * f16) - (f12 * f15);
        float f26 = (f11 * f17) - (f13 * f15);
        float f27 = (f11 * f18) - (f14 * f15);
        float f28 = (f12 * f17) - (f13 * f16);
        float f29 = (f12 * f18) - (f14 * f16);
        float f30 = (f13 * f18) - (f14 * f17);
        float f31 = (((((f19 * f30) - (f20 * f29)) + (f21 * f28)) + (f22 * f27)) - (f23 * f26)) + (f24 * f25);
        if (f31 != 0.0f) {
            float f32 = 1.0f / f31;
            fArr2[0] = (((f8 * f30) - (f9 * f29)) + (f10 * f28)) * f32;
            fArr2[1] = ((((-f4) * f30) + (f5 * f29)) - (f6 * f28)) * f32;
            fArr2[2] = (((f16 * f24) - (f17 * f23)) + (f18 * f22)) * f32;
            fArr2[3] = ((((-f12) * f24) + (f13 * f23)) - (f14 * f22)) * f32;
            float f33 = -f7;
            fArr2[4] = (((f33 * f30) + (f9 * f27)) - (f10 * f26)) * f32;
            fArr2[5] = (((f30 * f3) - (f5 * f27)) + (f6 * f26)) * f32;
            float f34 = -f15;
            fArr2[6] = (((f34 * f24) + (f17 * f21)) - (f18 * f20)) * f32;
            fArr2[7] = (((f24 * f11) - (f13 * f21)) + (f14 * f20)) * f32;
            fArr2[8] = (((f7 * f29) - (f8 * f27)) + (f10 * f25)) * f32;
            fArr2[9] = ((((-f3) * f29) + (f27 * f4)) - (f6 * f25)) * f32;
            fArr2[10] = (((f15 * f23) - (f16 * f21)) + (f18 * f19)) * f32;
            fArr2[11] = ((((-f11) * f23) + (f21 * f12)) - (f14 * f19)) * f32;
            fArr2[12] = (((f33 * f28) + (f8 * f26)) - (f9 * f25)) * f32;
            fArr2[13] = (((f3 * f28) - (f4 * f26)) + (f5 * f25)) * f32;
            fArr2[14] = (((f34 * f22) + (f16 * f20)) - (f17 * f19)) * f32;
            fArr2[15] = (((f11 * f22) - (f12 * f20)) + (f13 * f19)) * f32;
        }
        return !(f31 == 0.0f);
    }
}
