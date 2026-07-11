package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.media3.exoplayer.RendererCapabilities;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001ac\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0013R\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u0010*\u00020\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aC\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0001\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001ao\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001e\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u0010*\u00020\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00028\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001f\u0010 \u001ak\u0010$\u001a\u00020#\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u0010*\u00020\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001c\u0010\"\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020!R\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00028\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cH\u0003¢\u0006\u0004\b$\u0010%\"$\u0010)\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030'\u0012\u0004\u0012\u00020#0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010(\"\u001b\u0010/\u001a\u00020*8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "targetState", "", "label", "Landroidx/compose/animation/core/Transition;", "mUb", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/TransitionState;", "transitionState", "KN", "(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/MutableTransitionState;", "xMQ", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "S", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "O", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;", "initialState", "childLabel", "nr", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/Transition;", "initialValue", "targetValue", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "Landroidx/compose/runtime/State;", "J2", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "transitionAnimation", "", c.f62177j, "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function1;", "Landroidx/compose/animation/core/SeekableTransitionState;", "Lkotlin/jvm/functions/Function1;", "SeekableTransitionStateTotalDurationChanged", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "rl", "Lkotlin/Lazy;", "Uo", "()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "SeekableStateObserver", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2141:1\n1832#1,7:2214\n1832#1,7:2221\n1832#1,7:2228\n1832#1,7:2235\n1832#1,7:2242\n1832#1,7:2249\n1832#1,7:2256\n1832#1,7:2263\n1247#2,6:2142\n1247#2,6:2148\n1247#2,6:2154\n1247#2,6:2160\n1247#2,6:2166\n1247#2,6:2172\n1247#2,6:2178\n1247#2,6:2184\n1247#2,6:2190\n1247#2,6:2196\n1247#2,6:2202\n1247#2,6:2208\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1925#1:2214,7\n1955#1:2221,7\n1985#1:2228,7\n2015#1:2235,7\n2049#1:2242,7\n2079#1:2249,7\n2110#1:2256,7\n2140#1:2263,7\n88#1:2142,6\n90#1:2148,6\n806#1:2154,6\n808#1:2160,6\n819#1:2166,6\n1733#1:2172,6\n1734#1:2178,6\n1762#1:2184,6\n1776#1:2190,6\n1780#1:2196,6\n1851#1:2202,6\n1865#1:2208,6\n*E\n"})
public final class TransitionKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Function1 f15689n = new Function1<SeekableTransitionState<?>, Unit>() { // from class: androidx.compose.animation.core.TransitionKt$SeekableTransitionStateTotalDurationChanged$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SeekableTransitionState<?> seekableTransitionState) {
            n(seekableTransitionState);
            return Unit.INSTANCE;
        }

        public final void n(SeekableTransitionState seekableTransitionState) {
            seekableTransitionState.v();
        }
    };
    private static final Lazy rl = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<SnapshotStateObserver>() { // from class: androidx.compose.animation.core.TransitionKt$SeekableStateObserver$2
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final SnapshotStateObserver invoke() {
            SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new Function1<Function0<? extends Unit>, Unit>() { // from class: androidx.compose.animation.core.TransitionKt$SeekableStateObserver$2.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
                    n(function0);
                    return Unit.INSTANCE;
                }

                public final void n(Function0 function0) {
                    function0.invoke();
                }
            });
            snapshotStateObserver.Z();
            return snapshotStateObserver;
        }
    });

    public static final State J2(final Transition transition, Object obj, Object obj2, FiniteAnimationSpec finiteAnimationSpec, TwoWayConverter twoWayConverter, String str, Composer composer, int i2) {
        Object obj3;
        if (ComposerKt.v()) {
            ComposerKt.p5(-304821198, i2, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1848)");
        }
        int i3 = i2 & 14;
        int i5 = i3 ^ 6;
        boolean z2 = true;
        boolean z3 = (i5 > 4 && composer.p5(transition)) || (i2 & 6) == 4;
        Object objIF = composer.iF();
        if (z3 || objIF == Composer.INSTANCE.n()) {
            obj3 = obj2;
            Object transitionAnimationState = new Transition.TransitionAnimationState(obj, AnimationStateKt.xMQ(twoWayConverter, obj3), twoWayConverter, str);
            composer.o(transitionAnimationState);
            objIF = transitionAnimationState;
        } else {
            obj3 = obj2;
        }
        final Transition.TransitionAnimationState transitionAnimationState2 = (Transition.TransitionAnimationState) objIF;
        int i7 = (i2 >> 3) & 8;
        int i8 = i2 << 3;
        n(transition, transitionAnimationState2, obj, obj3, finiteAnimationSpec, composer, (i7 << 9) | (i7 << 6) | i3 | (i8 & 896) | (i8 & 7168) | (57344 & i8));
        if ((i5 <= 4 || !composer.p5(transition)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean zP5 = composer.p5(transitionAnimationState2) | z2;
        Object objIF2 = composer.iF();
        if (zP5 || objIF2 == Composer.INSTANCE.n()) {
            objIF2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    transition.t(transitionAnimationState2);
                    final Transition transition2 = transition;
                    final Transition.TransitionAnimationState transitionAnimationState3 = transitionAnimationState2;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createTransitionAnimation$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void n() {
                            transition2.E2(transitionAnimationState3);
                        }
                    };
                }
            };
            composer.o(objIF2);
        }
        EffectsKt.rl(transitionAnimationState2, (Function1) objIF2, composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return transitionAnimationState2;
    }

    public static final Transition KN(TransitionState transitionState, String str, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(1643203617, i2, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:803)");
        }
        int i5 = (i2 & 14) ^ 6;
        boolean z2 = true;
        boolean z3 = (i5 > 4 && composer.p5(transitionState)) || (i2 & 6) == 4;
        Object objIF = composer.iF();
        if (z3 || objIF == Composer.INSTANCE.n()) {
            objIF = new Transition(transitionState, str);
            composer.o(objIF);
        }
        final Transition transition = (Transition) objIF;
        if (transitionState instanceof SeekableTransitionState) {
            composer.eF(1030829284);
            Object objN = transitionState.n();
            Object objRl = transitionState.rl();
            if ((i5 <= 4 || !composer.p5(transitionState)) && (i2 & 6) != 4) {
                z2 = false;
            }
            Object objIF2 = composer.iF();
            if (z2 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new TransitionKt$rememberTransition$1$1(transitionState, null);
                composer.o(objIF2);
            }
            EffectsKt.nr(objN, objRl, (Function2) objIF2, composer, 0);
            composer.Xw();
        } else {
            composer.eF(1031290843);
            transition.O(transitionState.rl(), composer, 0);
            composer.Xw();
        }
        boolean zP5 = composer.p5(transition);
        Object objIF3 = composer.iF();
        if (zP5 || objIF3 == Composer.INSTANCE.n()) {
            objIF3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$2$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final Transition transition2 = transition;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$rememberTransition$2$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void n() {
                            transition2.ViF();
                        }
                    };
                }
            };
            composer.o(objIF3);
        }
        EffectsKt.rl(transition, (Function1) objIF3, composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return transition;
    }

    public static final Transition.DeferredAnimation O(final Transition transition, TwoWayConverter twoWayConverter, String str, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(-1714122528, i2, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1731)");
        }
        int i5 = (i2 & 14) ^ 6;
        boolean z2 = true;
        boolean z3 = (i5 > 4 && composer.p5(transition)) || (i2 & 6) == 4;
        Object objIF = composer.iF();
        if (z3 || objIF == Composer.INSTANCE.n()) {
            objIF = new Transition.DeferredAnimation(twoWayConverter, str);
            composer.o(objIF);
        }
        final Transition.DeferredAnimation deferredAnimation = (Transition.DeferredAnimation) objIF;
        if ((i5 <= 4 || !composer.p5(transition)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean zE2 = composer.E2(deferredAnimation) | z2;
        Object objIF2 = composer.iF();
        if (zE2 || objIF2 == Composer.INSTANCE.n()) {
            objIF2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final Transition transition2 = transition;
                    final Transition.DeferredAnimation deferredAnimation2 = deferredAnimation;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void n() {
                            transition2.fD(deferredAnimation2);
                        }
                    };
                }
            };
            composer.o(objIF2);
        }
        EffectsKt.rl(deferredAnimation, (Function1) objIF2, composer, 0);
        if (transition.WPU()) {
            deferredAnimation.nr();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return deferredAnimation;
    }

    public static final SnapshotStateObserver Uo() {
        return (SnapshotStateObserver) rl.getValue();
    }

    public static final Transition mUb(Object obj, String str, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(2029166765, i2, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:86)");
        }
        Object objIF = composer.iF();
        Composer.Companion companion = Composer.INSTANCE;
        if (objIF == companion.n()) {
            objIF = new Transition(obj, str);
            composer.o(objIF);
        }
        final Transition transition = (Transition) objIF;
        transition.O(obj, composer, (i2 & 8) | 48 | (i2 & 14));
        Object objIF2 = composer.iF();
        if (objIF2 == companion.n()) {
            objIF2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final Transition transition2 = transition;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void n() {
                            transition2.ViF();
                        }
                    };
                }
            };
            composer.o(objIF2);
        }
        EffectsKt.rl(transition, (Function1) objIF2, composer, 54);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return transition;
    }

    public static final Transition xMQ(MutableTransitionState mutableTransitionState, String str, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.v()) {
            ComposerKt.p5(882913843, i2, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:856)");
        }
        Transition transitionKN = KN(mutableTransitionState, str, composer, i2 & 126, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return transitionKN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final Transition transition, final Transition.TransitionAnimationState transitionAnimationState, final Object obj, final Object obj2, final FiniteAnimationSpec finiteAnimationSpec, Composer composer, final int i2) {
        int i3;
        boolean z2;
        boolean zE2;
        int i5;
        boolean zE22;
        int i7;
        boolean zE23;
        int i8;
        int i9;
        int i10;
        Composer composerKN = composer.KN(867041821);
        if ((i2 & 6) == 0) {
            if (composerKN.p5(transition)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.p5(transitionAnimationState)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if ((i2 & 512) == 0) {
                zE23 = composerKN.p5(obj);
            } else {
                zE23 = composerKN.E2(obj);
            }
            if (zE23) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        }
        if ((i2 & 3072) == 0) {
            if ((i2 & 4096) == 0) {
                zE22 = composerKN.p5(obj2);
            } else {
                zE22 = composerKN.E2(obj2);
            }
            if (zE22) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 24576) == 0) {
            if ((32768 & i2) == 0) {
                zE2 = composerKN.p5(finiteAnimationSpec);
            } else {
                zE2 = composerKN.E2(finiteAnimationSpec);
            }
            if (zE2) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerKN.HI(z2, i3 & 1)) {
            if (ComposerKt.v()) {
                ComposerKt.p5(867041821, i3, -1, "androidx.compose.animation.core.UpdateInitialAndTargetValues (Transition.kt:1880)");
            }
            if (transition.WPU()) {
                transitionAnimationState.p5(obj, obj2, finiteAnimationSpec);
            } else {
                transitionAnimationState.E(obj2, finiteAnimationSpec);
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        } else {
            composerKN.wTp();
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.core.TransitionKt$UpdateInitialAndTargetValues$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i11) {
                    TransitionKt.n(transition, transitionAnimationState, obj, obj2, finiteAnimationSpec, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    public static final Transition nr(final Transition transition, Object obj, Object obj2, String str, Composer composer, int i2) {
        boolean z2;
        if (ComposerKt.v()) {
            ComposerKt.p5(-198307638, i2, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1773)");
        }
        int i3 = (i2 & 14) ^ 6;
        boolean z3 = true;
        if ((i3 > 4 && composer.p5(transition)) || (i2 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object objIF = composer.iF();
        if (z2 || objIF == Composer.INSTANCE.n()) {
            objIF = new Transition(new MutableTransitionState(obj), transition, transition.getLabel() + " > " + str);
            composer.o(objIF);
        }
        final Transition transition2 = (Transition) objIF;
        if ((i3 <= 4 || !composer.p5(transition)) && (i2 & 6) != 4) {
            z3 = false;
        }
        boolean zP5 = composer.p5(transition2) | z3;
        Object objIF2 = composer.iF();
        if (zP5 || objIF2 == Composer.INSTANCE.n()) {
            objIF2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    transition.nr(transition2);
                    final Transition transition3 = transition;
                    final Transition transition4 = transition2;
                    return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createChildTransitionInternal$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void n() {
                            transition3.e(transition4);
                        }
                    };
                }
            };
            composer.o(objIF2);
        }
        EffectsKt.rl(transition2, (Function1) objIF2, composer, 0);
        if (transition.WPU()) {
            transition2.T(obj, obj2, transition.getLastSeekedTimeNanos());
        } else {
            transition2.P5(obj2);
            transition2.wTp(false);
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return transition2;
    }
}
