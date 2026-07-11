package androidx.compose.animation.core;

import ILs.aC;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.exoplayer.RendererCapabilities;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aY\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aR\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0001\u001a\u00020\r2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u007f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0010\"\b\b\u0001\u0010\u0012*\u00020\u00112\u0006\u0010\u0001\u001a\u00028\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019\"\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019\"\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019\"\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019\"\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019\"\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006.²\u0006*\u0010,\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0010\"\b\b\u0001\u0010\u0012*\u00020\u00118\nX\u008a\u0084\u0002²\u0006\"\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0010\"\b\b\u0001\u0010\u0012*\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "visibilityThreshold", "", "label", "Lkotlin/Function1;", "", "finishedListener", "Landroidx/compose/runtime/State;", "nr", "(FLandroidx/compose/animation/core/AnimationSpec;FLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "t", "(FLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "O", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/SpringSpec;", c.f62177j, "Landroidx/compose/animation/core/SpringSpec;", "defaultAnimation", "rl", "dpDefaultSpring", "Landroidx/compose/ui/geometry/Size;", "sizeDefaultSpring", "Landroidx/compose/ui/geometry/Offset;", "offsetDefaultSpring", "Landroidx/compose/ui/geometry/Rect;", "rectDefaultSpring", "", "J2", "intDefaultSpring", "Landroidx/compose/ui/unit/IntOffset;", "Uo", "intOffsetDefaultSpring", "Landroidx/compose/ui/unit/IntSize;", "KN", "intSizeDefaultSpring", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "animSpec", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimateAsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,600:1\n1247#2,6:601\n1247#2,6:607\n1247#2,6:613\n1247#2,6:619\n1247#2,6:625\n1247#2,6:631\n1247#2,6:637\n1247#2,6:643\n85#3:649\n85#3:650\n*S KotlinDebug\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n*L\n71#1:601,6\n392#1:607,6\n398#1:613,6\n399#1:619,6\n415#1:625,6\n416#1:631,6\n417#1:637,6\n588#1:643,6\n400#1:649\n402#1:650\n*E\n"})
public final class AnimateAsStateKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final SpringSpec f15419n = AnimationSpecKt.qie(0.0f, 0.0f, null, 7, null);
    private static final SpringSpec rl = AnimationSpecKt.qie(0.0f, 0.0f, Dp.nr(VisibilityThresholdsKt.n(Dp.INSTANCE)), 3, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final SpringSpec f15420t = AnimationSpecKt.qie(0.0f, 0.0f, Size.t(VisibilityThresholdsKt.nr(Size.INSTANCE)), 3, null);
    private static final SpringSpec nr = AnimationSpecKt.qie(0.0f, 0.0f, Offset.nr(VisibilityThresholdsKt.t(Offset.INSTANCE)), 3, null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final SpringSpec f15418O = AnimationSpecKt.qie(0.0f, 0.0f, VisibilityThresholdsKt.Uo(Rect.INSTANCE), 3, null);
    private static final SpringSpec J2 = AnimationSpecKt.qie(0.0f, 0.0f, Integer.valueOf(VisibilityThresholdsKt.rl(IntCompanionObject.INSTANCE)), 3, null);
    private static final SpringSpec Uo = AnimationSpecKt.qie(0.0f, 0.0f, IntOffset.t(VisibilityThresholdsKt.O(IntOffset.INSTANCE)), 3, null);
    private static final SpringSpec KN = AnimationSpecKt.qie(0.0f, 0.0f, IntSize.rl(VisibilityThresholdsKt.J2(IntSize.INSTANCE)), 3, null);

    public static final State O(final Object obj, TwoWayConverter twoWayConverter, AnimationSpec animationSpec, Object obj2, String str, Function1 function1, Composer composer, int i2, int i3) {
        AnimationSpec animationSpecGh;
        ILs.CN3 cn3;
        if ((i3 & 4) != 0) {
            Object objIF = composer.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = AnimationSpecKt.qie(0.0f, 0.0f, null, 7, null);
                composer.o(objIF);
            }
            animationSpecGh = (SpringSpec) objIF;
        } else {
            animationSpecGh = animationSpec;
        }
        Object obj3 = (i3 & 8) != 0 ? null : obj2;
        String str2 = (i3 & 16) != 0 ? "ValueAnimation" : str;
        Function1 function12 = (i3 & 32) != 0 ? null : function1;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1994373980, i2, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:395)");
        }
        Object objIF2 = composer.iF();
        Composer.Companion companion = Composer.INSTANCE;
        if (objIF2 == companion.n()) {
            objIF2 = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
            composer.o(objIF2);
        }
        MutableState mutableState = (MutableState) objIF2;
        Object objIF3 = composer.iF();
        if (objIF3 == companion.n()) {
            objIF3 = new Animatable(obj, twoWayConverter, obj3, str2);
            composer.o(objIF3);
        }
        Animatable animatable = (Animatable) objIF3;
        State stateCk = SnapshotStateKt.ck(function12, composer, (i2 >> 15) & 14);
        if (obj3 != null && (animationSpecGh instanceof SpringSpec)) {
            SpringSpec springSpec = (SpringSpec) animationSpecGh;
            if (!Intrinsics.areEqual(springSpec.getVisibilityThreshold(), obj3)) {
                animationSpecGh = AnimationSpecKt.gh(springSpec.getDampingRatio(), springSpec.getStiffness(), obj3);
            }
        }
        State stateCk2 = SnapshotStateKt.ck(animationSpecGh, composer, 0);
        Object objIF4 = composer.iF();
        if (objIF4 == companion.n()) {
            objIF4 = aC.rl(-1, null, null, 6, null);
            composer.o(objIF4);
        }
        final ILs.CN3 cn32 = (ILs.CN3) objIF4;
        boolean zE2 = ((((i2 & 14) ^ 6) > 4 && composer.E2(obj)) || (i2 & 6) == 4) | composer.E2(cn32);
        Object objIF5 = composer.iF();
        if (zE2 || objIF5 == companion.n()) {
            objIF5 = new Function0<Unit>() { // from class: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$2$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    cn32.nr(obj);
                }
            };
            composer.o(objIF5);
        }
        EffectsKt.KN((Function0) objIF5, composer, 0);
        boolean zE22 = composer.E2(cn32) | composer.E2(animatable) | composer.p5(stateCk2) | composer.p5(stateCk);
        Object objIF6 = composer.iF();
        if (zE22 || objIF6 == companion.n()) {
            cn3 = cn32;
            Object animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(cn3, animatable, stateCk2, stateCk, null);
            composer.o(animateAsStateKt$animateValueAsState$3$1);
            objIF6 = animateAsStateKt$animateValueAsState$3$1;
        } else {
            cn3 = cn32;
        }
        EffectsKt.O(cn3, (Function2) objIF6, composer, 0);
        State stateUo = (State) mutableState.getValue();
        if (stateUo == null) {
            stateUo = animatable.Uo();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateUo;
    }

    public static final State nr(float f3, AnimationSpec animationSpec, float f4, String str, Function1 function1, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = f15419n;
        }
        if ((i3 & 4) != 0) {
            f4 = 0.01f;
        }
        if ((i3 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        Function1 function12 = (i3 & 16) != 0 ? null : function1;
        if (ComposerKt.v()) {
            ComposerKt.p5(668842840, i2, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:67)");
        }
        if (animationSpec == f15419n) {
            composer.eF(1125558999);
            boolean z2 = (((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.rl(f4)) || (i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256;
            Object objIF = composer.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = AnimationSpecKt.qie(0.0f, 0.0f, Float.valueOf(f4), 3, null);
                composer.o(objIF);
            }
            animationSpec = (SpringSpec) objIF;
            composer.Xw();
        } else {
            composer.eF(1125668925);
            composer.Xw();
        }
        AnimationSpec animationSpec2 = animationSpec;
        Float fValueOf = Float.valueOf(f3);
        TwoWayConverter twoWayConverterXMQ = VectorConvertersKt.xMQ(FloatCompanionObject.INSTANCE);
        Float fValueOf2 = Float.valueOf(f4);
        int i5 = i2 << 3;
        State stateO = O(fValueOf, twoWayConverterXMQ, animationSpec2, fValueOf2, str2, function12, composer, (i2 & 14) | (i5 & 7168) | (57344 & i5) | (i5 & 458752), 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateO;
    }

    public static final State t(float f3, AnimationSpec animationSpec, String str, Function1 function1, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = rl;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1407150062, i2, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:111)");
        }
        int i5 = i2 << 6;
        State stateO = O(Dp.nr(f3), VectorConvertersKt.O(Dp.INSTANCE), animationSpec2, null, str2, function12, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & i5) | (i5 & 458752), 8);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 J2(State state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnimationSpec Uo(State state) {
        return (AnimationSpec) state.getValue();
    }
}
