package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\";\u0010\n\u001a)\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\"<\u0010\r\u001a)\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0000*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "colorSpace", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/AnimationVector4D;", c.f62177j, "Lkotlin/jvm/functions/Function1;", "ColorToVector", "Landroidx/compose/ui/graphics/Color$Companion;", "(Landroidx/compose/ui/graphics/Color$Companion;)Lkotlin/jvm/functions/Function1;", "VectorConverter", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ColorVectorConverterKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Function1 f15142n = new Function1<ColorSpace, TwoWayConverter<Color, AnimationVector4D>>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final TwoWayConverter invoke(final ColorSpace colorSpace) {
            return VectorConvertersKt.n(new Function1<Color, AnimationVector4D>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ AnimationVector4D invoke(Color color) {
                    return n(color.getValue());
                }

                public final AnimationVector4D n(long j2) {
                    long jGh = Color.gh(j2, ColorSpaces.f31604n.fD());
                    return new AnimationVector4D(Color.ck(jGh), Color.Z(jGh), Color.o(jGh), Color.Ik(jGh));
                }
            }, new Function1<AnimationVector4D, Color>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Color invoke(AnimationVector4D animationVector4D) {
                    return Color.xMQ(n(animationVector4D));
                }

                public final long n(AnimationVector4D animationVector4D) {
                    float v2 = animationVector4D.getV2();
                    float f3 = 0.0f;
                    if (v2 < 0.0f) {
                        v2 = 0.0f;
                    }
                    float f4 = 1.0f;
                    if (v2 > 1.0f) {
                        v2 = 1.0f;
                    }
                    float v3 = animationVector4D.getV3();
                    float f5 = -0.5f;
                    if (v3 < -0.5f) {
                        v3 = -0.5f;
                    }
                    float f6 = 0.5f;
                    if (v3 > 0.5f) {
                        v3 = 0.5f;
                    }
                    float v4 = animationVector4D.getV4();
                    if (v4 >= -0.5f) {
                        f5 = v4;
                    }
                    if (f5 <= 0.5f) {
                        f6 = f5;
                    }
                    float v1 = animationVector4D.getV1();
                    if (v1 >= 0.0f) {
                        f3 = v1;
                    }
                    if (f3 <= 1.0f) {
                        f4 = f3;
                    }
                    return Color.gh(ColorKt.n(v2, v3, f6, f4, ColorSpaces.f31604n.fD()), colorSpace);
                }
            });
        }
    };

    public static final Function1 n(Color.Companion companion) {
        return f15142n;
    }
}
