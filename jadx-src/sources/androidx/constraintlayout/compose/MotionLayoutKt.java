package androidx.constraintlayout.compose;

import ILs.CN3;
import ILs.aC;
import android.os.Build;
import android.view.View;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a¤\u0001\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u001c\u0010\u001b\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0084\u0001\u0010 \u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u001c\u0010\u001b\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a¥\u0001\u0010-\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u001e\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u001c\u0010\u001b\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\n0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0001¢\u0006\u0004\b-\u0010.\u001ac\u00108\u001a\u0002072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0/2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\"2\u0006\u0010&\u001a\u0002022\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b8\u00109\u001a!\u0010:\u001a\u00020\n2\u0006\u00104\u001a\u0002032\b\u0010(\u001a\u0004\u0018\u00010'H\u0001¢\u0006\u0004\b:\u0010;\u001a\u0017\u0010<\u001a\u0002032\u0006\u0010\u001e\u001a\u00020\u0005H\u0001¢\u0006\u0004\b<\u0010=\u001a;\u0010?\u001a\u00020\u0007*\u00020\u00072\u0006\u00106\u001a\u0002052\u0006\u0010>\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)H\u0001¢\u0006\u0004\b?\u0010@\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B²\u0006\u000e\u0010#\u001a\u00020\"8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010$\u001a\u00020\"8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010A\u001a\u00020)8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/constraintlayout/compose/MotionScene;", "motionScene", "", "constraintSetName", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "finishedAnimationListener", "Landroidx/constraintlayout/compose/DebugFlags;", "debugFlags", "", "optimizationLevel", "Landroidx/compose/runtime/MutableState;", "contentTracker", "Landroidx/compose/ui/node/Ref;", "Landroidx/constraintlayout/compose/CompositionSource;", "compositionSource", "Landroidx/constraintlayout/compose/InvalidationStrategy;", "invalidationStrategy", "Lkotlin/Function1;", "Landroidx/constraintlayout/compose/MotionLayoutScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", AppLovinEventTypes.USER_VIEWED_CONTENT, "t", "(Landroidx/constraintlayout/compose/MotionScene;Ljava/lang/String;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/MutableState;Landroidx/compose/ui/node/Ref;Landroidx/constraintlayout/compose/InvalidationStrategy;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "progress", "transitionName", "rl", "(Landroidx/constraintlayout/compose/MotionScene;FLjava/lang/String;IILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/node/Ref;Landroidx/constraintlayout/compose/InvalidationStrategy;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Landroidx/constraintlayout/compose/ConstraintSet;", TtmlNode.START, TtmlNode.END, "Landroidx/constraintlayout/compose/Transition;", "transition", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "informationReceiver", "", "showBounds", "showPaths", "showKeyPositions", c.f62177j, "(Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;FLandroidx/constraintlayout/compose/LayoutInformationReceiver;IZZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/node/Ref;Landroidx/constraintlayout/compose/InvalidationStrategy;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/State;", "constraintSetStart", "constraintSetEnd", "Landroidx/constraintlayout/compose/TransitionImpl;", "Landroidx/compose/runtime/MutableFloatState;", "motionProgress", "Landroidx/constraintlayout/compose/MotionMeasurer;", "measurer", "Landroidx/compose/ui/layout/MeasurePolicy;", "o", "(Landroidx/compose/runtime/State;Landroidx/compose/ui/node/Ref;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/TransitionImpl;Landroidx/compose/runtime/MutableFloatState;Landroidx/constraintlayout/compose/MotionMeasurer;ILandroidx/constraintlayout/compose/InvalidationStrategy;)Landroidx/compose/ui/layout/MeasurePolicy;", "mUb", "(Landroidx/compose/runtime/MutableFloatState;Landroidx/constraintlayout/compose/LayoutInformationReceiver;Landroidx/compose/runtime/Composer;I)V", "Ik", "(FLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/MutableFloatState;", "scaleFactor", "r", "(Landroidx/compose/ui/Modifier;Landroidx/constraintlayout/compose/MotionMeasurer;FZZZ)Landroidx/compose/ui/Modifier;", "animateToEnd", "constraintlayout-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMotionLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1651:1\n1225#2,6:1652\n1225#2,3:1658\n1228#2,3:1662\n1225#2,6:1665\n1225#2,6:1671\n1225#2,6:1677\n1225#2,6:1683\n1225#2,6:1689\n1225#2,6:1695\n1225#2,6:1701\n1225#2,6:1707\n1225#2,6:1713\n1225#2,6:1719\n1225#2,6:1725\n1225#2,6:1731\n1225#2,6:1737\n1225#2,6:1743\n1225#2,6:1749\n1225#2,6:1755\n1225#2,6:1761\n1225#2,6:1767\n1225#2,6:1773\n1225#2,6:1779\n1225#2,6:1787\n1225#2,6:1793\n1225#2,6:1799\n1225#2,6:1805\n1225#2,6:1812\n1225#2,6:1818\n1225#2,6:1824\n1225#2,6:1830\n1#3:1661\n77#4:1785\n77#4:1786\n77#4:1811\n81#5:1836\n107#5,2:1837\n81#5:1839\n107#5,2:1840\n81#5:1842\n107#5,2:1843\n*S KotlinDebug\n*F\n+ 1 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutKt\n*L\n146#1:1652,6\n147#1:1658,3\n147#1:1662,3\n256#1:1665,6\n257#1:1671,6\n382#1:1677,6\n383#1:1683,6\n435#1:1689,6\n438#1:1695,6\n443#1:1701,6\n448#1:1707,6\n457#1:1713,6\n458#1:1719,6\n461#1:1725,6\n465#1:1731,6\n467#1:1737,6\n469#1:1743,6\n472#1:1749,6\n474#1:1755,6\n526#1:1761,6\n529#1:1767,6\n534#1:1773,6\n582#1:1779,6\n593#1:1787,6\n594#1:1793,6\n596#1:1799,6\n609#1:1805,6\n676#1:1812,6\n1028#1:1818,6\n1048#1:1824,6\n1049#1:1830,6\n591#1:1785\n592#1:1786\n655#1:1811\n457#1:1836\n457#1:1837,2\n458#1:1839\n458#1:1840,2\n467#1:1842\n467#1:1843,2\n*E\n"})
public final class MotionLayoutKt {
    public static final void n(final ConstraintSet constraintSet, final ConstraintSet constraintSet2, final Transition transition, final float f3, final LayoutInformationReceiver layoutInformationReceiver, final int i2, final boolean z2, final boolean z3, final boolean z4, final Modifier modifier, final MutableState mutableState, final Ref ref, final InvalidationStrategy invalidationStrategy, final Function3 function3, Composer composer, final int i3, final int i5) {
        int i7;
        ConstraintSet constraintSet3;
        int i8;
        int i9;
        TransitionImpl transitionImpl;
        Composer composer2;
        boolean z5;
        boolean z6;
        boolean z7;
        Composer composerKN = composer.KN(-657259923);
        if ((i3 & 6) == 0) {
            i7 = (composerKN.p5(constraintSet) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            constraintSet3 = constraintSet2;
            i7 |= composerKN.p5(constraintSet3) ? 32 : 16;
        } else {
            constraintSet3 = constraintSet2;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.p5(transition) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i7 |= composerKN.rl(f3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i7 |= (32768 & i3) == 0 ? composerKN.p5(layoutInformationReceiver) : composerKN.E2(layoutInformationReceiver) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i8 = i2;
            i7 |= composerKN.t(i8) ? 131072 : 65536;
        } else {
            i8 = i2;
        }
        if ((i3 & 1572864) == 0) {
            i7 |= composerKN.n(z2) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i7 |= composerKN.n(z3) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i7 |= composerKN.n(z4) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
            i7 |= composerKN.p5(modifier) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i9 = i5 | (composerKN.p5(mutableState) ? 4 : 2);
        } else {
            i9 = i5;
        }
        if ((i5 & 48) == 0) {
            i9 |= (i5 & 64) == 0 ? composerKN.p5(ref) : composerKN.E2(ref) ? 32 : 16;
        }
        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i9 |= composerKN.E2(invalidationStrategy) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i9 |= composerKN.E2(function3) ? 2048 : 1024;
        }
        int i10 = i9;
        if ((i7 & 306783379) == 306783378 && (i10 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-657259923, i7, i10, "androidx.constraintlayout.compose.MotionLayoutCore (MotionLayout.kt:577)");
            }
            int i11 = i7 >> 9;
            MutableFloatState mutableFloatStateIk = Ik(f3, composerKN, i11 & 14);
            TransitionImpl transitionImplN = transition instanceof TransitionImpl ? (TransitionImpl) transition : null;
            if (transitionImplN == null) {
                transitionImplN = TransitionImpl.INSTANCE.n();
            }
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotLongStateKt.n(0L);
                composerKN.o(objIF);
            }
            MutableLongState mutableLongState = (MutableLongState) objIF;
            mutableLongState.rl();
            if (layoutInformationReceiver != null) {
                layoutInformationReceiver.o(mutableLongState);
            }
            mUb(mutableFloatStateIk, layoutInformationReceiver, composerKN, i11 & 112);
            Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
            LayoutDirection layoutDirection = (LayoutDirection) composerKN.ty(CompositionLocalsKt.az());
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = new MotionMeasurer(density);
                composerKN.o(objIF2);
            }
            final MotionMeasurer motionMeasurer = (MotionMeasurer) objIF2;
            Object objIF3 = composerKN.iF();
            if (objIF3 == companion.n()) {
                objIF3 = new MotionLayoutScope(motionMeasurer, mutableFloatStateIk);
                composerKN.o(objIF3);
            }
            final MotionLayoutScope motionLayoutScope = (MotionLayoutScope) objIF3;
            boolean z9 = ((i7 & 14) == 4) | ((i7 & 112) == 32) | ((i7 & 896) == 256);
            Object objIF4 = composerKN.iF();
            if (z9 || objIF4 == companion.n()) {
                transitionImpl = transitionImplN;
                motionMeasurer.iF(constraintSet, constraintSet3, layoutDirection, transitionImpl, mutableFloatStateIk.n());
                objIF4 = Boolean.TRUE;
                composerKN.o(objIF4);
            } else {
                transitionImpl = transitionImplN;
            }
            ((Boolean) objIF4).getClass();
            composerKN.eF(-487863565);
            if (invalidationStrategy.getOnObservedStateChange() != null) {
                Snapshot.Companion companion2 = Snapshot.INSTANCE;
                boolean z10 = ((i10 & 14) == 4) | ((i10 & 112) == 32 || ((i10 & 64) != 0 && composerKN.E2(ref)));
                Object objIF5 = composerKN.iF();
                if (z10 || objIF5 == companion.n()) {
                    objIF5 = new Function1<Object, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$8$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void n(Object obj) {
                            mutableState.setValue(Unit.INSTANCE);
                            if (ref.getValue() == CompositionSource.Unknown) {
                                ref.rl(CompositionSource.Content);
                            }
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                            n(obj);
                            return Unit.INSTANCE;
                        }
                    };
                    composerKN.o(objIF5);
                }
                Snapshot.Companion.KN(companion2, (Function1) objIF5, null, invalidationStrategy.getOnObservedStateChange(), 2, null);
            }
            composerKN.Xw();
            composer2 = composerKN;
            MeasurePolicy measurePolicyO = o(mutableState, ref, constraintSet, constraintSet2, transitionImpl, mutableFloatStateIk, motionMeasurer, i8, invalidationStrategy);
            motionMeasurer.t(layoutInformationReceiver);
            MotionLayoutDebugFlags forcedDrawDebug = layoutInformationReceiver != null ? layoutInformationReceiver.getForcedDrawDebug() : null;
            float forcedScaleFactor = motionMeasurer.getForcedScaleFactor();
            if (forcedDrawDebug == null || forcedDrawDebug == MotionLayoutDebugFlags.UNKNOWN) {
                z5 = z2;
                z6 = z3;
                z7 = z4;
            } else {
                z5 = forcedDrawDebug == MotionLayoutDebugFlags.SHOW_ALL;
                z6 = z5;
                z7 = z6;
            }
            composer2.eF(-487805395);
            boolean z11 = Build.VERSION.SDK_INT >= 30 && Api30Impl.n((View) composer2.ty(AndroidCompositionLocals_androidKt.gh()));
            composer2.Xw();
            Modifier modifierT = MotionDragHandlerKt.t(r(modifier, motionMeasurer, forcedScaleFactor, z11 ? true : z5, z6, z7), transition == null ? TransitionImpl.INSTANCE.n() : transition, mutableFloatStateIk, motionMeasurer);
            boolean zE2 = composer2.E2(motionMeasurer);
            Object objIF6 = composer2.iF();
            if (zE2 || objIF6 == companion.n()) {
                objIF6 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$9$1
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
                composer2.o(objIF6);
            }
            LayoutKt.n(SemanticsModifierKt.nr(modifierT, false, (Function1) objIF6, 1, null), ComposableLambdaKt.nr(1008059664, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$10
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i12) {
                    if ((i12 & 3) == 2 && composer3.xMQ()) {
                        composer3.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1008059664, i12, -1, "androidx.constraintlayout.compose.MotionLayoutCore.<anonymous> (MotionLayout.kt:677)");
                    }
                    function3.invoke(motionLayoutScope, composer3, 0);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }, composer2, 54), measurePolicyO, composer2, 48, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$11
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i12) {
                    MotionLayoutKt.n(constraintSet, constraintSet2, transition, f3, layoutInformationReceiver, i2, z2, z3, z4, modifier, mutableState, ref, invalidationStrategy, function3, composer3, RecomposeScopeImplKt.n(i3 | 1), RecomposeScopeImplKt.n(i5));
                }
            });
        }
    }

    public static final MeasurePolicy o(final androidx.compose.runtime.State state, final Ref ref, final ConstraintSet constraintSet, final ConstraintSet constraintSet2, final TransitionImpl transitionImpl, final MutableFloatState mutableFloatState, final MotionMeasurer motionMeasurer, final int i2, final InvalidationStrategy invalidationStrategy) {
        return new MeasurePolicy() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$motionLayoutMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public final MeasureResult rl(MeasureScope measureScope, final List list, long j2) {
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                state.getValue();
                MotionMeasurer motionMeasurer2 = motionMeasurer;
                LayoutDirection layoutDirection = measureScope.getLayoutDirection();
                ConstraintSet constraintSet3 = constraintSet;
                ConstraintSet constraintSet4 = constraintSet2;
                TransitionImpl transitionImpl2 = transitionImpl;
                int i3 = i2;
                float fN = mutableFloatState.n();
                CompositionSource compositionSource = (CompositionSource) ref.getValue();
                if (compositionSource == null) {
                    compositionSource = CompositionSource.Unknown;
                }
                long jE = motionMeasurer2.e(j2, layoutDirection, constraintSet3, constraintSet4, transitionImpl2, list, linkedHashMap, i3, fN, compositionSource, invalidationStrategy.getShouldInvalidate());
                ref.rl(CompositionSource.Unknown);
                int iUo = IntSize.Uo(jE);
                int iJ2 = IntSize.J2(jE);
                final MotionMeasurer motionMeasurer3 = motionMeasurer;
                return MeasureScope.ER(measureScope, iUo, iJ2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$motionLayoutMeasurePolicy$1.1
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

    public static final void rl(final MotionScene motionScene, final float f3, final String str, final int i2, final int i3, final Modifier modifier, final MutableState mutableState, final Ref ref, final InvalidationStrategy invalidationStrategy, final Function3 function3, Composer composer, final int i5) {
        int i7;
        float f4;
        int i8;
        int i9;
        Function3 function32;
        String strN;
        String strRl;
        Composer composer2;
        Composer composerKN = composer.KN(1160212844);
        if ((i5 & 6) == 0) {
            i7 = (composerKN.p5(motionScene) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            f4 = f3;
            i7 |= composerKN.rl(f4) ? 32 : 16;
        } else {
            f4 = f3;
        }
        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.p5(str) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i8 = i2;
            i7 |= composerKN.t(i8) ? 2048 : 1024;
        } else {
            i8 = i2;
        }
        if ((i5 & 24576) == 0) {
            i9 = i3;
            i7 |= composerKN.t(i9) ? 16384 : 8192;
        } else {
            i9 = i3;
        }
        if ((196608 & i5) == 0) {
            i7 |= composerKN.p5(modifier) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i7 |= composerKN.p5(mutableState) ? 1048576 : 524288;
        }
        if ((12582912 & i5) == 0) {
            i7 |= (16777216 & i5) == 0 ? composerKN.p5(ref) : composerKN.E2(ref) ? 8388608 : 4194304;
        }
        if ((100663296 & i5) == 0) {
            i7 |= composerKN.E2(invalidationStrategy) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((805306368 & i5) == 0) {
            function32 = function3;
            i7 |= composerKN.E2(function32) ? 536870912 : 268435456;
        } else {
            function32 = function3;
        }
        if ((i7 & 306783379) == 306783378 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1160212844, i7, -1, "androidx.constraintlayout.compose.MotionLayoutCore (MotionLayout.kt:523)");
            }
            int i10 = i7 & 14;
            boolean z2 = ((i7 & 896) == 256) | (i10 == 4);
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = motionScene.gh(str);
                composerKN.o(objIF);
            }
            Transition transition = (Transition) objIF;
            boolean zP5 = (i10 == 4) | composerKN.p5(transition);
            Object objIF2 = composerKN.iF();
            if (zP5 || objIF2 == Composer.INSTANCE.n()) {
                if (transition == null || (strN = transition.n()) == null) {
                    strN = TtmlNode.START;
                }
                objIF2 = motionScene.t(strN);
                composerKN.o(objIF2);
            }
            ConstraintSet constraintSet = (ConstraintSet) objIF2;
            boolean zP52 = (i10 == 4) | composerKN.p5(transition);
            Object objIF3 = composerKN.iF();
            if (zP52 || objIF3 == Composer.INSTANCE.n()) {
                if (transition == null || (strRl = transition.rl()) == null) {
                    strRl = TtmlNode.END;
                }
                objIF3 = motionScene.t(strRl);
                composerKN.o(objIF3);
            }
            ConstraintSet constraintSet2 = (ConstraintSet) objIF3;
            if (constraintSet == null || constraintSet2 == null) {
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            n(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer3, int i11) {
                            MotionLayoutKt.rl(motionScene, f3, str, i2, i3, modifier, mutableState, ref, invalidationStrategy, function3, composer3, RecomposeScopeImplKt.n(i5 | 1));
                        }
                    });
                    return;
                }
                return;
            }
            composer2 = composerKN;
            int i11 = ((i7 << 6) & 465920) | ((i7 << 12) & 1879048192);
            int i12 = i7 >> 18;
            n(constraintSet, constraintSet2, transition, f4, motionScene instanceof LayoutInformationReceiver ? (LayoutInformationReceiver) motionScene : null, i8, DebugFlags.nr(i9), DebugFlags.J2(i3), DebugFlags.O(i3), modifier, mutableState, ref, invalidationStrategy, function32, composer2, i11, (i12 & 14) | (Ref.rl << 3) | (i12 & 112) | (i12 & 896) | (i12 & 7168));
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh2 = composer2.gh();
        if (scopeUpdateScopeGh2 != null) {
            scopeUpdateScopeGh2.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    n(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer3, int i13) {
                    MotionLayoutKt.rl(motionScene, f3, str, i2, i3, modifier, mutableState, ref, invalidationStrategy, function3, composer3, RecomposeScopeImplKt.n(i5 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(final MotionScene motionScene, final String str, final AnimationSpec animationSpec, Modifier modifier, Function0 function0, int i2, int i3, final MutableState mutableState, final Ref ref, final InvalidationStrategy invalidationStrategy, final Function3 function3, Composer composer, final int i5, final int i7, final int i8) {
        int i9;
        Modifier modifier2;
        int i10;
        Function0 function02;
        int i11;
        int i12;
        int i13;
        final int i14;
        int i15;
        int i16;
        Object objIF;
        Composer.Companion companion;
        boolean zNr;
        Object objIF2;
        Transition transition;
        boolean zNr2;
        Object objIF3;
        ConstraintSet constraintSet;
        boolean zNr3;
        Object objIF4;
        ScopeUpdateScope scopeUpdateScopeGh;
        int i17;
        Transition transition2;
        LayoutInformationReceiver layoutInformationReceiver;
        int i18;
        Animatable animatable;
        LayoutInformationReceiver layoutInformationReceiver2;
        Function0 function03;
        Composer composer2;
        final Modifier modifier3;
        final Function0 function04;
        final int i19;
        int i20;
        CN3 cn3;
        ScopeUpdateScope scopeUpdateScopeGh2;
        Composer composerKN = composer.KN(1132252061);
        if ((i8 & 1) != 0) {
            i9 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i9 = (composerKN.p5(motionScene) ? 4 : 2) | i5;
        } else {
            i9 = i5;
        }
        if ((i8 & 2) != 0) {
            i9 |= 48;
        } else if ((i5 & 48) == 0) {
            i9 |= composerKN.p5(str) ? 32 : 16;
        }
        if ((i8 & 4) != 0) {
            i9 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i9 |= composerKN.E2(animationSpec) ? 256 : 128;
        }
        int i21 = i8 & 8;
        if (i21 != 0) {
            i9 |= 3072;
        } else {
            if ((i5 & 3072) == 0) {
                modifier2 = modifier;
                i9 |= composerKN.p5(modifier2) ? 2048 : 1024;
            }
            i10 = i8 & 16;
            if (i10 == 0) {
                i9 |= 24576;
            } else {
                if ((i5 & 24576) == 0) {
                    function02 = function0;
                    i9 |= composerKN.E2(function02) ? 16384 : 8192;
                }
                i11 = i8 & 32;
                if (i11 != 0) {
                    i9 |= 196608;
                    i12 = i2;
                } else {
                    i12 = i2;
                    if ((i5 & 196608) == 0) {
                        i9 |= composerKN.t(i12) ? 131072 : 65536;
                    }
                }
                i13 = i8 & 64;
                if (i13 != 0) {
                    i9 |= 1572864;
                    i14 = i3;
                } else {
                    i14 = i3;
                    if ((i5 & 1572864) == 0) {
                        i9 |= composerKN.t(i14) ? 1048576 : 524288;
                    }
                }
                if ((i8 & 128) != 0) {
                    i9 |= 12582912;
                } else {
                    if ((i5 & 12582912) == 0) {
                        i9 |= composerKN.p5(mutableState) ? 8388608 : 4194304;
                    }
                    if ((i8 & 256) == 0) {
                        i9 |= 100663296;
                    } else if ((i5 & 100663296) == 0) {
                        i9 |= (134217728 & i5) == 0 ? composerKN.p5(ref) : composerKN.E2(ref) ? C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
                    }
                    if ((i8 & 512) != 0) {
                        if ((805306368 & i5) == 0) {
                            i9 |= composerKN.E2(invalidationStrategy) ? 536870912 : 268435456;
                        }
                        if ((i8 & 1024) != 0) {
                            i15 = i10;
                            i16 = i7 | 6;
                        } else if ((i7 & 6) == 0) {
                            i15 = i10;
                            i16 = i7 | (composerKN.E2(function3) ? 4 : 2);
                        } else {
                            i15 = i10;
                            i16 = i7;
                        }
                        if ((i9 & 306783379) == 306783378 && (i16 & 3) == 2 && composerKN.xMQ()) {
                            composerKN.wTp();
                            i19 = i12;
                            modifier3 = modifier2;
                            composer2 = composerKN;
                            function04 = function02;
                        } else {
                            Modifier modifier4 = i21 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i15 != 0) {
                                function02 = null;
                            }
                            int iN = i11 == 0 ? DebugFlags.INSTANCE.n() : i12;
                            if (i13 != 0) {
                                i14 = 257;
                            }
                            final int i22 = i14;
                            if (ComposerKt.v()) {
                                ComposerKt.p5(1132252061, i9, i16, "androidx.constraintlayout.compose.MotionLayoutCore (MotionLayout.kt:433)");
                            }
                            objIF = composerKN.iF();
                            companion = Composer.INSTANCE;
                            if (objIF == companion.n()) {
                                objIF = SnapshotLongStateKt.n(0L);
                                composerKN.o(objIF);
                            }
                            MutableLongState mutableLongState = (MutableLongState) objIF;
                            int i23 = i16;
                            int i24 = i9 & 14;
                            zNr = (i24 != 4) | composerKN.nr(mutableLongState.rl());
                            objIF2 = composerKN.iF();
                            if (!zNr || objIF2 == companion.n()) {
                                objIF2 = motionScene.gh("default");
                                composerKN.o(objIF2);
                            }
                            transition = (Transition) objIF2;
                            final Modifier modifier5 = modifier4;
                            zNr2 = (i24 != 4) | composerKN.nr(mutableLongState.rl());
                            objIF3 = composerKN.iF();
                            if (!zNr2 || objIF3 == companion.n()) {
                                if (transition != null || (strN = transition.n()) == null) {
                                    String strN = TtmlNode.START;
                                }
                                objIF3 = motionScene.t(strN);
                                composerKN.o(objIF3);
                            }
                            constraintSet = (ConstraintSet) objIF3;
                            int i25 = i9;
                            zNr3 = composerKN.nr(mutableLongState.rl()) | (i24 != 4);
                            objIF4 = composerKN.iF();
                            if (!zNr3 || objIF4 == companion.n()) {
                                if (transition != null || (strRl = transition.rl()) == null) {
                                    String strRl = TtmlNode.END;
                                }
                                objIF4 = motionScene.t(strRl);
                                composerKN.o(objIF4);
                            }
                            ConstraintSet constraintSet2 = (ConstraintSet) objIF4;
                            if (constraintSet != null || constraintSet2 == null) {
                                final Function0 function05 = function02;
                                if (ComposerKt.v()) {
                                    ComposerKt.M7();
                                }
                                scopeUpdateScopeGh = composerKN.gh();
                                if (scopeUpdateScopeGh == null) {
                                    final int i26 = iN;
                                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            n(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void n(Composer composer3, int i27) {
                                            MotionLayoutKt.t(motionScene, str, animationSpec, modifier5, function05, i26, i22, mutableState, ref, invalidationStrategy, function3, composer3, RecomposeScopeImplKt.n(i5 | 1), RecomposeScopeImplKt.n(i7), i8);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            boolean z2 = i24 == 4;
                            Object objIF5 = composerKN.iF();
                            if (z2 || objIF5 == companion.n()) {
                                MutableState mutableStateO = SnapshotStateKt__SnapshotStateKt.O(constraintSet, null, 2, null);
                                composerKN.o(mutableStateO);
                                objIF5 = mutableStateO;
                            }
                            MutableState mutableState2 = (MutableState) objIF5;
                            boolean z3 = i24 == 4;
                            Object objIF6 = composerKN.iF();
                            if (z3 || objIF6 == companion.n()) {
                                MutableState mutableStateO2 = SnapshotStateKt__SnapshotStateKt.O(constraintSet2, null, 2, null);
                                composerKN.o(mutableStateO2);
                                objIF6 = mutableStateO2;
                            }
                            MutableState mutableState3 = (MutableState) objIF6;
                            boolean z4 = (i24 == 4) | ((i25 & 112) == 32);
                            Object objIF7 = composerKN.iF();
                            if (z4 || objIF7 == companion.n()) {
                                ConstraintSet constraintSetT = str != null ? motionScene.t(str) : null;
                                composerKN.o(constraintSetT);
                                objIF7 = constraintSetT;
                            }
                            final ConstraintSet constraintSet3 = (ConstraintSet) objIF7;
                            Object objIF8 = composerKN.iF();
                            if (objIF8 == companion.n()) {
                                i17 = i25;
                                transition2 = transition;
                                objIF8 = AnimatableKt.rl(0.0f, 0.0f, 2, null);
                                composerKN.o(objIF8);
                            } else {
                                i17 = i25;
                                transition2 = transition;
                            }
                            Animatable animatable2 = (Animatable) objIF8;
                            boolean z5 = i24 == 4;
                            Object objIF9 = composerKN.iF();
                            if (z5 || objIF9 == companion.n()) {
                                objIF9 = SnapshotStateKt__SnapshotStateKt.O(Boolean.TRUE, null, 2, null);
                                composerKN.o(objIF9);
                            }
                            MutableState mutableState4 = (MutableState) objIF9;
                            Object objIF10 = composerKN.iF();
                            if (objIF10 == companion.n()) {
                                layoutInformationReceiver = null;
                                objIF10 = aC.rl(-1, null, null, 6, null);
                                composerKN.o(objIF10);
                            } else {
                                layoutInformationReceiver = null;
                            }
                            final CN3 cn32 = (CN3) objIF10;
                            composerKN.eF(-488018941);
                            if (constraintSet3 != null) {
                                boolean zE2 = composerKN.E2(cn32) | composerKN.p5(constraintSet3);
                                Object objIF11 = composerKN.iF();
                                if (zE2 || objIF11 == companion.n()) {
                                    objIF11 = new Function0<Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$2$1
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
                                            cn32.nr(constraintSet3);
                                        }
                                    };
                                    composerKN.o(objIF11);
                                }
                                EffectsKt.KN((Function0) objIF11, composerKN, 0);
                                boolean zE22 = composerKN.E2(cn32) | composerKN.p5(mutableState4) | composerKN.p5(mutableState2) | composerKN.p5(mutableState3) | composerKN.E2(animatable2) | composerKN.E2(animationSpec) | ((i17 & 57344) == 16384);
                                Object objIF12 = composerKN.iF();
                                if (zE22 || objIF12 == companion.n()) {
                                    Function0 function06 = function02;
                                    layoutInformationReceiver2 = null;
                                    i20 = i24;
                                    animatable = animatable2;
                                    cn3 = cn32;
                                    i18 = i17;
                                    MotionLayoutKt$MotionLayoutCore$3$1 motionLayoutKt$MotionLayoutCore$3$1 = new MotionLayoutKt$MotionLayoutCore$3$1(cn3, animatable, animationSpec, function06, mutableState4, mutableState2, mutableState3, null);
                                    function03 = function06;
                                    composerKN.o(motionLayoutKt$MotionLayoutCore$3$1);
                                    objIF12 = motionLayoutKt$MotionLayoutCore$3$1;
                                } else {
                                    animatable = animatable2;
                                    function03 = function02;
                                    layoutInformationReceiver2 = null;
                                    cn3 = cn32;
                                    i20 = i24;
                                    i18 = i17;
                                }
                                EffectsKt.nr(motionScene, cn3, (Function2) objIF12, composerKN, i20);
                            } else {
                                i18 = i17;
                                animatable = animatable2;
                                layoutInformationReceiver2 = layoutInformationReceiver;
                                function03 = function02;
                            }
                            composerKN.Xw();
                            ConstraintSet constraintSetNr = nr(mutableState2);
                            ConstraintSet constraintSetJ2 = J2(mutableState3);
                            float fFloatValue = ((Number) animatable.ty()).floatValue();
                            if (motionScene instanceof LayoutInformationReceiver) {
                                layoutInformationReceiver2 = (LayoutInformationReceiver) motionScene;
                            }
                            int i27 = ((i18 >> 3) & 458752) | ((i18 << 18) & 1879048192);
                            int i28 = i18 >> 21;
                            composer2 = composerKN;
                            n(constraintSetNr, constraintSetJ2, transition2, fFloatValue, layoutInformationReceiver2, i22, DebugFlags.nr(iN), DebugFlags.J2(iN), DebugFlags.O(iN), modifier5, mutableState, ref, invalidationStrategy, function3, composer2, i27, (i28 & 896) | (i28 & 14) | (Ref.rl << 3) | (i28 & 112) | ((i23 << 9) & 7168));
                            i14 = i22;
                            modifier3 = modifier5;
                            if (ComposerKt.v()) {
                                ComposerKt.M7();
                            }
                            function04 = function03;
                            i19 = iN;
                        }
                        scopeUpdateScopeGh2 = composer2.gh();
                        if (scopeUpdateScopeGh2 != null) {
                            scopeUpdateScopeGh2.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    n(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void n(Composer composer3, int i29) {
                                    MotionLayoutKt.t(motionScene, str, animationSpec, modifier3, function04, i19, i14, mutableState, ref, invalidationStrategy, function3, composer3, RecomposeScopeImplKt.n(i5 | 1), RecomposeScopeImplKt.n(i7), i8);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                    if ((i8 & 1024) != 0) {
                    }
                    if ((i9 & 306783379) == 306783378) {
                        if (i21 == 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i13 != 0) {
                        }
                        final int i222 = i14;
                        if (ComposerKt.v()) {
                        }
                        objIF = composerKN.iF();
                        companion = Composer.INSTANCE;
                        if (objIF == companion.n()) {
                        }
                        MutableLongState mutableLongState2 = (MutableLongState) objIF;
                        int i232 = i16;
                        int i242 = i9 & 14;
                        zNr = (i242 != 4) | composerKN.nr(mutableLongState2.rl());
                        objIF2 = composerKN.iF();
                        if (!zNr) {
                            objIF2 = motionScene.gh("default");
                            composerKN.o(objIF2);
                            transition = (Transition) objIF2;
                            final Modifier modifier52 = modifier4;
                            zNr2 = (i242 != 4) | composerKN.nr(mutableLongState2.rl());
                            objIF3 = composerKN.iF();
                            if (!zNr2) {
                                if (transition != null) {
                                    String strN2 = TtmlNode.START;
                                    objIF3 = motionScene.t(strN2);
                                    composerKN.o(objIF3);
                                    constraintSet = (ConstraintSet) objIF3;
                                    int i252 = i9;
                                    zNr3 = composerKN.nr(mutableLongState2.rl()) | (i242 != 4);
                                    objIF4 = composerKN.iF();
                                    if (!zNr3) {
                                        if (transition != null) {
                                            String strRl2 = TtmlNode.END;
                                            objIF4 = motionScene.t(strRl2);
                                            composerKN.o(objIF4);
                                            ConstraintSet constraintSet22 = (ConstraintSet) objIF4;
                                            if (constraintSet != null) {
                                            }
                                            final Function0 function052 = function02;
                                            if (ComposerKt.v()) {
                                            }
                                            scopeUpdateScopeGh = composerKN.gh();
                                            if (scopeUpdateScopeGh == null) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    scopeUpdateScopeGh2 = composer2.gh();
                    if (scopeUpdateScopeGh2 != null) {
                    }
                }
                if ((i8 & 256) == 0) {
                }
                if ((i8 & 512) != 0) {
                }
                if ((i8 & 1024) != 0) {
                }
                if ((i9 & 306783379) == 306783378) {
                }
                scopeUpdateScopeGh2 = composer2.gh();
                if (scopeUpdateScopeGh2 != null) {
                }
            }
            function02 = function0;
            i11 = i8 & 32;
            if (i11 != 0) {
            }
            i13 = i8 & 64;
            if (i13 != 0) {
            }
            if ((i8 & 128) != 0) {
            }
            if ((i8 & 256) == 0) {
            }
            if ((i8 & 512) != 0) {
            }
            if ((i8 & 1024) != 0) {
            }
            if ((i9 & 306783379) == 306783378) {
            }
            scopeUpdateScopeGh2 = composer2.gh();
            if (scopeUpdateScopeGh2 != null) {
            }
        }
        modifier2 = modifier;
        i10 = i8 & 16;
        if (i10 == 0) {
        }
        function02 = function0;
        i11 = i8 & 32;
        if (i11 != 0) {
        }
        i13 = i8 & 64;
        if (i13 != 0) {
        }
        if ((i8 & 128) != 0) {
        }
        if ((i8 & 256) == 0) {
        }
        if ((i8 & 512) != 0) {
        }
        if ((i8 & 1024) != 0) {
        }
        if ((i9 & 306783379) == 306783378) {
        }
        scopeUpdateScopeGh2 = composer2.gh();
        if (scopeUpdateScopeGh2 != null) {
        }
    }

    public static final MutableFloatState Ik(float f3, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1721363510, i2, -1, "androidx.constraintlayout.compose.createAndUpdateMotionProgress (MotionLayout.kt:1046)");
        }
        Object objIF = composer.iF();
        Composer.Companion companion = Composer.INSTANCE;
        if (objIF == companion.n()) {
            objIF = PrimitiveSnapshotStateKt.n(f3);
            composer.o(objIF);
        }
        MutableFloatState mutableFloatState = (MutableFloatState) objIF;
        Object objIF2 = composer.iF();
        Object obj = objIF2;
        if (objIF2 == companion.n()) {
            Ref.FloatRef floatRef = new Ref.FloatRef();
            floatRef.element = f3;
            composer.o(floatRef);
            obj = floatRef;
        }
        Ref.FloatRef floatRef2 = (Ref.FloatRef) obj;
        if (floatRef2.element != f3) {
            floatRef2.element = f3;
            mutableFloatState.Z(f3);
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return mutableFloatState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstraintSet J2(MutableState mutableState) {
        return (ConstraintSet) mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean KN(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(MutableState mutableState, ConstraintSet constraintSet) {
        mutableState.setValue(constraintSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(MutableState mutableState, ConstraintSet constraintSet) {
        mutableState.setValue(constraintSet);
    }

    public static final void mUb(final MutableFloatState mutableFloatState, final LayoutInformationReceiver layoutInformationReceiver, Composer composer, final int i2) {
        int i3;
        boolean zE2;
        int i5;
        int i7;
        Composer composerKN = composer.KN(1501096015);
        if ((i2 & 6) == 0) {
            if (composerKN.p5(mutableFloatState)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                zE2 = composerKN.p5(layoutInformationReceiver);
            } else {
                zE2 = composerKN.E2(layoutInformationReceiver);
            }
            if (zE2) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1501096015, i3, -1, "androidx.constraintlayout.compose.UpdateWithForcedIfNoUserChange (MotionLayout.kt:1019)");
            }
            if (layoutInformationReceiver == null) {
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$UpdateWithForcedIfNoUserChange$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            n(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void n(Composer composer2, int i8) {
                            MotionLayoutKt.mUb(mutableFloatState, layoutInformationReceiver, composer2, RecomposeScopeImplKt.n(i2 | 1));
                        }
                    });
                    return;
                }
                return;
            }
            float fN = mutableFloatState.n();
            float forcedProgress = layoutInformationReceiver.getForcedProgress();
            Object objIF = composerKN.iF();
            Object obj = objIF;
            if (objIF == Composer.INSTANCE.n()) {
                androidx.compose.ui.node.Ref ref = new androidx.compose.ui.node.Ref();
                ref.rl(Float.valueOf(fN));
                composerKN.o(ref);
                obj = ref;
            }
            androidx.compose.ui.node.Ref ref2 = (androidx.compose.ui.node.Ref) obj;
            if (!Float.isNaN(forcedProgress) && Intrinsics.areEqual((Float) ref2.getValue(), fN)) {
                mutableFloatState.Z(forcedProgress);
            } else {
                layoutInformationReceiver.ty();
            }
            ref2.rl(Float.valueOf(fN));
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh2 = composerKN.gh();
        if (scopeUpdateScopeGh2 != null) {
            scopeUpdateScopeGh2.n(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$UpdateWithForcedIfNoUserChange$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    n(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer2, int i8) {
                    MotionLayoutKt.mUb(mutableFloatState, layoutInformationReceiver, composer2, RecomposeScopeImplKt.n(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstraintSet nr(MutableState mutableState) {
        return (ConstraintSet) mutableState.getValue();
    }

    public static final Modifier r(Modifier modifier, final MotionMeasurer motionMeasurer, float f3, final boolean z2, final boolean z3, final boolean z4) {
        if (!Float.isNaN(f3)) {
            modifier = ScaleKt.n(modifier, f3);
        }
        if (!z2 && !z4 && !z3) {
            return modifier;
        }
        return DrawModifierKt.rl(modifier, new Function1<DrawScope, Unit>() { // from class: androidx.constraintlayout.compose.MotionLayoutKt$motionDebug$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                n(drawScope);
                return Unit.INSTANCE;
            }

            public final void n(DrawScope drawScope) {
                motionMeasurer.WPU(drawScope, z2, z3, z4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }
}
