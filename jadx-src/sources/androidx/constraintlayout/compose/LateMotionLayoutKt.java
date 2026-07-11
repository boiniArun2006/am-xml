package androidx.constraintlayout.compose;

import ILs.CN3;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.common.C;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009a\u0001\u0010\u0017\u001a\u00020\n2\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0002\b\u0015H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001ae\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroidx/compose/runtime/MutableState;", "Landroidx/constraintlayout/compose/ConstraintSet;", TtmlNode.START, TtmlNode.END, "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "LILs/CN3;", "channel", "Landroidx/compose/runtime/State;", "", "contentTracker", "Landroidx/compose/ui/node/Ref;", "Landroidx/constraintlayout/compose/CompositionSource;", "compositionSource", "", "optimizationLevel", "Lkotlin/Function0;", "finishedAnimationListener", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, c.f62177j, "(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/animation/core/AnimationSpec;LILs/CN3;Landroidx/compose/runtime/State;Landroidx/compose/ui/node/Ref;ILkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "startProvider", "endProvider", "motionProgress", "Landroidx/constraintlayout/compose/MotionMeasurer;", "measurer", "Landroidx/compose/ui/layout/MeasurePolicy;", "rl", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/State;Landroidx/compose/ui/node/Ref;Landroidx/compose/runtime/State;Landroidx/constraintlayout/compose/MotionMeasurer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "constraintlayout-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLateMotionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LateMotionLayout.kt\nandroidx/constraintlayout/compose/LateMotionLayoutKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,149:1\n77#2:150\n1225#3,6:151\n1225#3,6:157\n1225#3,6:163\n1225#3,6:169\n1225#3,6:175\n1225#3,6:181\n1225#3,6:187\n1225#3,6:193\n*S KotlinDebug\n*F\n+ 1 LateMotionLayout.kt\nandroidx/constraintlayout/compose/LateMotionLayoutKt\n*L\n59#1:150\n60#1:151,6\n62#1:157,6\n63#1:163,6\n64#1:169,6\n70#1:175,6\n71#1:181,6\n81#1:187,6\n86#1:193,6\n*E\n"})
public final class LateMotionLayoutKt {
    public static final void n(final MutableState mutableState, final MutableState mutableState2, final AnimationSpec animationSpec, CN3 cn3, final androidx.compose.runtime.State state, final Ref ref, final int i2, final Function0 function0, final Modifier modifier, final Function2 function2, Composer composer, final int i3) {
        int i5;
        androidx.compose.runtime.State state2;
        int i7;
        Composer composer2;
        final CN3 cn32;
        Composer composerKN = composer.KN(688627412);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.p5(mutableState) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerKN.p5(mutableState2) ? 32 : 16;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(animationSpec) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerKN.E2(cn3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            state2 = state;
            i5 |= composerKN.p5(state2) ? 16384 : 8192;
        } else {
            state2 = state;
        }
        if ((196608 & i3) == 0) {
            i5 |= (i3 & 262144) == 0 ? composerKN.p5(ref) : composerKN.E2(ref) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i7 = i2;
            i5 |= composerKN.t(i7) ? 1048576 : 524288;
        } else {
            i7 = i2;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= composerKN.E2(function0) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= composerKN.p5(modifier) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i5 |= composerKN.E2(function2) ? 536870912 : 268435456;
        }
        if ((i5 & 306783379) == 306783378 && composerKN.xMQ()) {
            composerKN.wTp();
            cn32 = cn3;
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(688627412, i5, -1, "androidx.constraintlayout.compose.LateMotionLayout (LateMotionLayout.kt:57)");
            }
            Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = new MotionMeasurer(density);
                composerKN.o(objIF);
            }
            final MotionMeasurer motionMeasurer = (MotionMeasurer) objIF;
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = AnimatableKt.rl(0.0f, 0.0f, 2, null);
                composerKN.o(objIF2);
            }
            Animatable animatable = (Animatable) objIF2;
            Object objIF3 = composerKN.iF();
            if (objIF3 == companion.n()) {
                objIF3 = animatable.Uo();
                composerKN.o(objIF3);
            }
            androidx.compose.runtime.State state3 = (androidx.compose.runtime.State) objIF3;
            Object objIF4 = composerKN.iF();
            if (objIF4 == companion.n()) {
                objIF4 = SnapshotIntStateKt.n(1);
                composerKN.o(objIF4);
            }
            MutableIntState mutableIntState = (MutableIntState) objIF4;
            Object objIF5 = composerKN.iF();
            if (objIF5 == companion.n()) {
                objIF5 = new Function0<ConstraintSet>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$measurePolicy$1$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final ConstraintSet invoke() {
                        Object value = mutableState.getValue();
                        Intrinsics.checkNotNull(value);
                        return (ConstraintSet) value;
                    }
                };
                composerKN.o(objIF5);
            }
            Function0 function02 = (Function0) objIF5;
            Object objIF6 = composerKN.iF();
            if (objIF6 == companion.n()) {
                objIF6 = new Function0<ConstraintSet>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$measurePolicy$2$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final ConstraintSet invoke() {
                        Object value = mutableState2.getValue();
                        Intrinsics.checkNotNull(value);
                        return (ConstraintSet) value;
                    }
                };
                composerKN.o(objIF6);
            }
            int i8 = i5;
            MeasurePolicy measurePolicyRl = rl(function02, (Function0) objIF6, state2, ref, state3, motionMeasurer, i7);
            boolean zE2 = composerKN.E2(motionMeasurer);
            Object objIF7 = composerKN.iF();
            if (zE2 || objIF7 == companion.n()) {
                objIF7 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        n(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    public final void n(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        ToolingUtilsKt.n(semanticsPropertyReceiver, motionMeasurer);
                    }
                };
                composerKN.o(objIF7);
            }
            composer2 = composerKN;
            LayoutKt.n(SemanticsModifierKt.nr(modifier, false, (Function1) objIF7, 1, null), function2, measurePolicyRl, composer2, (i8 >> 24) & 112, 0);
            boolean zE22 = composer2.E2(cn3) | ((i8 & 14) == 4) | ((i8 & 112) == 32) | ((i8 & 458752) == 131072 || ((i8 & 262144) != 0 && composer2.E2(ref))) | composer2.E2(animatable) | composer2.E2(animationSpec) | ((i8 & 29360128) == 8388608);
            Object objIF8 = composer2.iF();
            if (zE22 || objIF8 == companion.n()) {
                LateMotionLayoutKt$LateMotionLayout$2$1 lateMotionLayoutKt$LateMotionLayout$2$1 = new LateMotionLayoutKt$LateMotionLayout$2$1(cn3, mutableIntState, mutableState, mutableState2, ref, animatable, animationSpec, function0, null);
                cn32 = cn3;
                composer2.o(lateMotionLayoutKt$LateMotionLayout$2$1);
                objIF8 = lateMotionLayoutKt$LateMotionLayout$2$1;
            } else {
                cn32 = cn3;
            }
            EffectsKt.O(cn32, (Function2) objIF8, composer2, (i8 >> 9) & 14);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i9) {
                    LateMotionLayoutKt.n(mutableState, mutableState2, animationSpec, cn32, state, ref, i2, function0, modifier, function2, composer3, RecomposeScopeImplKt.n(i3 | 1));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }
            });
        }
    }

    private static final MeasurePolicy rl(final Function0 function0, final Function0 function02, final androidx.compose.runtime.State state, final Ref ref, final androidx.compose.runtime.State state2, final MotionMeasurer motionMeasurer, final int i2) {
        return new MeasurePolicy() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$lateMotionLayoutMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final MeasureResult rl(MeasureScope measureScope, final List list, long j2) {
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                state.getValue();
                MotionMeasurer motionMeasurer2 = motionMeasurer;
                LayoutDirection layoutDirection = measureScope.getLayoutDirection();
                ConstraintSet constraintSet = (ConstraintSet) function0.invoke();
                ConstraintSet constraintSet2 = (ConstraintSet) function02.invoke();
                TransitionImpl transitionImplN = TransitionImpl.INSTANCE.n();
                int i3 = i2;
                float fFloatValue = ((Number) state2.getValue()).floatValue();
                CompositionSource compositionSource = (CompositionSource) ref.getValue();
                if (compositionSource == null) {
                    compositionSource = CompositionSource.Unknown;
                }
                long jE = motionMeasurer2.e(j2, layoutDirection, constraintSet, constraintSet2, transitionImplN, list, linkedHashMap, i3, fFloatValue, compositionSource, null);
                ref.rl(CompositionSource.Unknown);
                int iUo = IntSize.Uo(jE);
                int iJ2 = IntSize.J2(jE);
                final MotionMeasurer motionMeasurer3 = motionMeasurer;
                return MeasureScope.ER(measureScope, iUo, iJ2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.constraintlayout.compose.LateMotionLayoutKt$lateMotionLayoutMeasurePolicy$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        n(placementScope);
                        return Unit.INSTANCE;
                    }

                    public final void n(Placeable.PlacementScope placementScope) {
                        motionMeasurer3.Ik(placementScope, list, linkedHashMap);
                    }
                }, 4, null);
            }
        };
    }
}
