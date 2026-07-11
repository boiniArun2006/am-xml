package androidx.compose.animation.core;

import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition.TransitionAnimationState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.media3.exoplayer.RendererCapabilities;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001ae\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0007*\u00020\u0006*\u00020\u00022\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aA\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "label", "Landroidx/compose/animation/core/InfiniteTransition;", "t", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/InfiniteTransition;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "initialValue", "targetValue", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "animationSpec", "Landroidx/compose/runtime/State;", "rl", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "", c.f62177j, "(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,345:1\n1247#2,6:346\n1247#2,6:352\n1247#2,6:358\n1247#2,6:364\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n*L\n46#1:346,6\n247#1:352,6\n251#1:358,6\n264#1:364,6\n*E\n"})
public final class InfiniteTransitionKt {
    public static final State n(InfiniteTransition infiniteTransition, float f3, float f4, InfiniteRepeatableSpec infiniteRepeatableSpec, String str, Composer composer, int i2, int i3) {
        if ((i3 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (ComposerKt.v()) {
            ComposerKt.p5(-644770905, i2, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:296)");
        }
        int i5 = i2 << 3;
        State stateRl = rl(infiniteTransition, Float.valueOf(f3), Float.valueOf(f4), VectorConvertersKt.xMQ(FloatCompanionObject.INSTANCE), infiniteRepeatableSpec, str2, composer, (i2 & 1022) | (57344 & i5) | (i5 & 458752), 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return stateRl;
    }

    public static final State rl(InfiniteTransition infiniteTransition, Object obj, Object obj2, TwoWayConverter twoWayConverter, InfiniteRepeatableSpec infiniteRepeatableSpec, String str, Composer composer, int i2, int i3) {
        final InfiniteTransition infiniteTransition2;
        final Object obj3;
        final Object obj4;
        final InfiniteRepeatableSpec infiniteRepeatableSpec2;
        if ((i3 & 16) != 0) {
            str = qUrazMnwDskFs.ybMpDyJ;
        }
        String str2 = str;
        if (ComposerKt.v()) {
            ComposerKt.p5(-1062847727, i2, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:245)");
        }
        Object objIF = composer.iF();
        Composer.Companion companion = Composer.INSTANCE;
        if (objIF == companion.n()) {
            infiniteTransition2 = infiniteTransition;
            obj3 = obj;
            obj4 = obj2;
            infiniteRepeatableSpec2 = infiniteRepeatableSpec;
            InfiniteTransition.TransitionAnimationState transitionAnimationState = infiniteTransition2.new TransitionAnimationState(obj3, obj4, twoWayConverter, infiniteRepeatableSpec2, str2);
            composer.o(transitionAnimationState);
            objIF = transitionAnimationState;
        } else {
            infiniteTransition2 = infiniteTransition;
            obj3 = obj;
            obj4 = obj2;
            infiniteRepeatableSpec2 = infiniteRepeatableSpec;
        }
        final InfiniteTransition.TransitionAnimationState transitionAnimationState2 = (InfiniteTransition.TransitionAnimationState) objIF;
        boolean z2 = true;
        boolean z3 = ((((i2 & 112) ^ 48) > 32 && composer.E2(obj3)) || (i2 & 48) == 32) | ((((i2 & 896) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && composer.E2(obj4)) || (i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256);
        if ((((57344 & i2) ^ 24576) <= 16384 || !composer.E2(infiniteRepeatableSpec2)) && (i2 & 24576) != 16384) {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        Object objIF2 = composer.iF();
        if (z4 || objIF2 == companion.n()) {
            objIF2 = new Function0<Unit>() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (Intrinsics.areEqual(obj3, transitionAnimationState2.getInitialValue()) && Intrinsics.areEqual(obj4, transitionAnimationState2.getTargetValue())) {
                        return;
                    }
                    transitionAnimationState2.N(obj3, obj4, infiniteRepeatableSpec2);
                }
            };
            composer.o(objIF2);
        }
        EffectsKt.KN((Function0) objIF2, composer, 0);
        boolean zE2 = composer.E2(infiniteTransition2);
        Object objIF3 = composer.iF();
        if (zE2 || objIF3 == companion.n()) {
            objIF3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    infiniteTransition2.J2(transitionAnimationState2);
                    final InfiniteTransition infiniteTransition3 = infiniteTransition2;
                    final InfiniteTransition.TransitionAnimationState transitionAnimationState3 = transitionAnimationState2;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void n() {
                            infiniteTransition3.qie(transitionAnimationState3);
                        }
                    };
                }
            };
            composer.o(objIF3);
        }
        EffectsKt.rl(transitionAnimationState2, (Function1) objIF3, composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return transitionAnimationState2;
    }

    public static final InfiniteTransition t(String str, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(1013651573, i2, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        Object objIF = composer.iF();
        if (objIF == Composer.INSTANCE.n()) {
            objIF = new InfiniteTransition(str);
            composer.o(objIF);
        }
        InfiniteTransition infiniteTransition = (InfiniteTransition) objIF;
        infiniteTransition.az(composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return infiniteTransition;
    }
}
