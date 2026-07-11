package com.alightcreative.app.motion.scene.repeat;

import WJ.phkN.HFAkacKHsU;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.easing.CubicBezierEasing;
import com.alightcreative.app.motion.scene.ColorRange;
import com.alightcreative.app.motion.scene.GeometryKt;
import com.alightcreative.app.motion.scene.Keyable;
import com.alightcreative.app.motion.scene.KeyableKt;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.rendering.RenderEnvironment;
import com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue;
import com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n\u001ak\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122K\u0010\u0013\u001aG\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\r0\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"TFX_SHAPE_RAMP", "", "TFX_SHAPE_SQUARE", "TFX_SHAPE_SMOOTH", "TFX_SHAPE_TRIANGLE", "computeRepeatBlend", "Lcom/alightcreative/app/motion/scene/ColorRange;", "blend", "", "baseColor", "Lcom/alightcreative/app/motion/scene/SolidColor;", "blendColor", "repeatWithEasing", "", JavetError.PARAMETER_COUNT, "repeatEffect", "Lcom/alightcreative/app/motion/scene/visualeffect/KeyableVisualEffectRef;", "env", "Lcom/alightcreative/app/motion/scene/rendering/RenderEnvironment;", FileUploadManager.f61572j, "Lkotlin/Function3;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "index", "baseProgress", "interpProgress", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRepeatEasing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatEasing.kt\ncom/alightcreative/app/motion/scene/repeat/RepeatEasingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
public final class RepeatEasingKt {
    private static final int TFX_SHAPE_RAMP = 0;
    private static final int TFX_SHAPE_SMOOTH = 2;
    private static final int TFX_SHAPE_SQUARE = 1;
    private static final int TFX_SHAPE_TRIANGLE = 3;

    public static final ColorRange computeRepeatBlend(float f3, SolidColor baseColor, SolidColor blendColor) {
        SolidColor solidColorMix;
        Intrinsics.checkNotNullParameter(baseColor, "baseColor");
        Intrinsics.checkNotNullParameter(blendColor, "blendColor");
        if (f3 <= 0.0f) {
            solidColorMix = baseColor;
        } else if (f3 <= 1.0f) {
            solidColorMix = GeometryKt.mix(baseColor, blendColor, f3);
        } else {
            baseColor = GeometryKt.mix(baseColor, blendColor, f3 - 1.0f);
            solidColorMix = blendColor;
        }
        return new ColorRange(baseColor, solidColorMix);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void repeatWithEasing(int i2, KeyableVisualEffectRef repeatEffect, RenderEnvironment env, Function3<? super Integer, ? super Float, ? super Float, Unit> action) {
        float f3;
        float f4;
        int i3;
        List list;
        float f5;
        List list2;
        float f6;
        float f7;
        float fCoerceIn;
        float f8;
        float f9;
        float f10;
        Keyable<Float> floatValue;
        Keyable<Float> floatValue2;
        Keyable<Float> floatValue3;
        Keyable<Float> floatValue4;
        Keyable<Float> floatValue5;
        Keyable<Float> floatValue6;
        Keyable<Float> floatValue7;
        int i5 = i2;
        Intrinsics.checkNotNullParameter(repeatEffect, "repeatEffect");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(action, "action");
        KeyableUserParameterValue keyableUserParameterValue = repeatEffect.getParameters().get(TtmlNode.START);
        float fFloatValue = (keyableUserParameterValue == null || (floatValue7 = keyableUserParameterValue.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue7, env)).floatValue();
        KeyableUserParameterValue keyableUserParameterValue2 = repeatEffect.getParameters().get(TtmlNode.END);
        float fFloatValue2 = (keyableUserParameterValue2 == null || (floatValue6 = keyableUserParameterValue2.getFloatValue()) == null) ? 1.0f : ((Number) KeyableKt.valueAtTime(floatValue6, env)).floatValue();
        KeyableUserParameterValue keyableUserParameterValue3 = repeatEffect.getParameters().get("phase");
        float fFloatValue3 = (keyableUserParameterValue3 == null || (floatValue5 = keyableUserParameterValue3.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue5, env)).floatValue();
        KeyableUserParameterValue keyableUserParameterValue4 = repeatEffect.getParameters().get("shape");
        int intValue = keyableUserParameterValue4 != null ? keyableUserParameterValue4.getIntValue() : 0;
        KeyableUserParameterValue keyableUserParameterValue5 = repeatEffect.getParameters().get("seed");
        float fFloatValue4 = (keyableUserParameterValue5 == null || (floatValue4 = keyableUserParameterValue5.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue4, env)).floatValue();
        KeyableUserParameterValue keyableUserParameterValue6 = repeatEffect.getParameters().get(HFAkacKHsU.qMEhbQUSnDYUsuM);
        boolean booleanValue = keyableUserParameterValue6 != null ? keyableUserParameterValue6.getBooleanValue() : false;
        KeyableUserParameterValue keyableUserParameterValue7 = repeatEffect.getParameters().get("invert");
        boolean booleanValue2 = keyableUserParameterValue7 != null ? keyableUserParameterValue7.getBooleanValue() : false;
        KeyableUserParameterValue keyableUserParameterValue8 = repeatEffect.getParameters().get("easeIn");
        float fFloatValue5 = (keyableUserParameterValue8 == null || (floatValue3 = keyableUserParameterValue8.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue3, env)).floatValue();
        KeyableUserParameterValue keyableUserParameterValue9 = repeatEffect.getParameters().get("easeOut");
        float fFloatValue6 = (keyableUserParameterValue9 == null || (floatValue2 = keyableUserParameterValue9.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue2, env)).floatValue();
        KeyableUserParameterValue keyableUserParameterValue10 = repeatEffect.getParameters().get("overlap");
        float fFloatValue7 = ((keyableUserParameterValue10 == null || (floatValue = keyableUserParameterValue10.getFloatValue()) == null) ? 0.0f : ((Number) KeyableKt.valueAtTime(floatValue, env)).floatValue()) + 1.0f;
        float f11 = i5;
        float f12 = 1.0f;
        float f13 = 1;
        float f14 = ((2 * fFloatValue7) + f11) - f13;
        float f15 = 1.0f / f14;
        if (booleanValue) {
            f3 = fFloatValue;
            f4 = f11;
            list = CollectionsKt.shuffled(CollectionsKt.toList(RangesKt.until(0, i5)), new Random((long) (15234322 + (35432882176L * fFloatValue4))));
            i3 = 0;
        } else {
            f3 = fFloatValue;
            f4 = f11;
            i3 = 0;
            list = CollectionsKt.toList(RangesKt.until(0, i5));
        }
        while (i3 < i5) {
            float fIntValue = ((((Number) list.get(i3)).intValue() + fFloatValue7) / f14) + fFloatValue3;
            float f16 = f15 * fFloatValue7;
            float f17 = fIntValue + (f16 / 2.0f);
            if (intValue == TFX_SHAPE_SQUARE) {
                f5 = fFloatValue7;
                list2 = list;
                f7 = f12;
                float fCoerceIn2 = RangesKt.coerceIn((fIntValue - f3) / f16, 0.0f, f7);
                float fCoerceIn3 = RangesKt.coerceIn((fFloatValue2 - fIntValue) / f16, 0.0f, f7);
                fCoerceIn = f3 < fFloatValue2 ? Math.min(fCoerceIn2, fCoerceIn3) : f7 - Math.max(fCoerceIn2, fCoerceIn3);
                f6 = 0.0f;
            } else {
                f5 = fFloatValue7;
                list2 = list;
                if (intValue == TFX_SHAPE_SMOOTH) {
                    if (f17 >= f3 && f17 <= fFloatValue2) {
                        double d2 = 2;
                        fCoerceIn = (float) Math.pow(2.71828d, (-Math.pow(((((double) ((f17 - f3) / (fFloatValue2 - f3))) - 0.5d) * d2) * 3.141592653589793d, d2)) / 2.0d);
                    } else {
                        fCoerceIn = 0.0f;
                    }
                    f6 = 0.0f;
                    f7 = 1.0f;
                } else if (intValue == TFX_SHAPE_TRIANGLE) {
                    if (f17 >= f3 && f17 <= fFloatValue2) {
                        float f18 = (f17 - f3) / (fFloatValue2 - f3);
                        fCoerceIn = f18 < 0.5f ? f18 * 2.0f : (f13 - f18) * 2.0f;
                    }
                    f6 = 0.0f;
                    f7 = 1.0f;
                } else if (intValue == TFX_SHAPE_RAMP) {
                    f6 = 0.0f;
                    f7 = 1.0f;
                    fCoerceIn = (f17 - f3) / RangesKt.coerceIn(fFloatValue2 - f3, 0.0f, 1.0f);
                } else {
                    f6 = 0.0f;
                    f7 = 1.0f;
                    fCoerceIn = 0.0f;
                }
            }
            float f19 = i5 <= 1 ? f6 : i3 / (f4 - f7);
            if (fFloatValue5 == f6 && fFloatValue6 == f6) {
                f9 = f19;
                f8 = 1.0f;
                f10 = f6;
            } else {
                f8 = 1.0f;
                f9 = f19;
                f10 = 0.0f;
                fCoerceIn = new CubicBezierEasing(Math.max(fFloatValue5 / 2.0f, f6), Math.max((-fFloatValue5) / 2.0f, f6), 1.0f - Math.max(f6, fFloatValue6 / 2.0f), 1.0f - Math.max(0.0f, (-fFloatValue6) / 2.0f)).interpolate(fCoerceIn);
            }
            if (booleanValue2) {
                fCoerceIn = f8 - fCoerceIn;
            }
            float f20 = f8;
            action.invoke(Integer.valueOf(i3), Float.valueOf(f9), Float.valueOf(RangesKt.coerceIn(fCoerceIn, f10, f20)));
            i3++;
            i5 = i2;
            f12 = f20;
            fFloatValue7 = f5;
            list = list2;
        }
    }
}
