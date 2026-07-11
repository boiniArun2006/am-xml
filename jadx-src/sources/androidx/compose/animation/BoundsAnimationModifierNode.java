package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@ExperimentalSharedTransitionApi
@StabilityInferred
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00126\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\f0\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u000f*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010\"\u001a\u00020!*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/RR\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\f0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00107R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"Landroidx/compose/animation/BoundsAnimationModifierNode;", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/layout/LookaheadScope;", "lookaheadScope", "Landroidx/compose/animation/BoundsTransform;", "boundsTransform", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "animatedSize", "Landroidx/compose/ui/unit/Constraints;", "constraints", "onChooseMeasureConstraints", "", "animateMotionFrameOfReference", "<init>", "(Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/animation/BoundsTransform;Lkotlin/jvm/functions/Function2;Z)V", "lookaheadSize", "Qu", "(J)Z", "", "c", "()V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadCoordinates", "t1J", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/LayoutCoordinates;)Z", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/layout/MeasureResult;", "Bu", "(Landroidx/compose/ui/layout/ApproachMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "v", "Landroidx/compose/ui/layout/LookaheadScope;", "NC9", "()Landroidx/compose/ui/layout/LookaheadScope;", "W1c", "(Landroidx/compose/ui/layout/LookaheadScope;)V", "Xw", "Landroidx/compose/animation/BoundsTransform;", "getBoundsTransform", "()Landroidx/compose/animation/BoundsTransform;", "poH", "(Landroidx/compose/animation/BoundsTransform;)V", "jB", "Lkotlin/jvm/functions/Function2;", "getOnChooseMeasureConstraints", "()Lkotlin/jvm/functions/Function2;", CmcdConfiguration.KEY_PLAYBACK_RATE, "(Lkotlin/jvm/functions/Function2;)V", "U", "Z", "W5k", "()Z", "ex", "(Z)V", "P5", "directManipulationParentsDirty", "Landroidx/compose/animation/BoundsTransformDeferredAnimation;", "M7", "Landroidx/compose/animation/BoundsTransformDeferredAnimation;", "boundsAnimation", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimateBoundsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/BoundsAnimationModifierNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,444:1\n153#2:445\n61#3:446\n54#3:447\n63#3:449\n59#3:450\n85#4:448\n90#4:451\n*S KotlinDebug\n*F\n+ 1 AnimateBoundsModifier.kt\nandroidx/compose/animation/BoundsAnimationModifierNode\n*L\n238#1:445\n254#1:446\n254#1:447\n254#1:449\n254#1:450\n254#1:448\n254#1:451\n*E\n"})
public final class BoundsAnimationModifierNode extends Modifier.Node implements ApproachLayoutModifierNode {

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private boolean animateMotionFrameOfReference;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private BoundsTransform boundsTransform;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private Function2 onChooseMeasureConstraints;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private LookaheadScope lookaheadScope;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private boolean directManipulationParentsDirty = true;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private final BoundsTransformDeferredAnimation boundsAnimation = new BoundsTransformDeferredAnimation();

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        this.directManipulationParentsDirty = true;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public MeasureResult Bu(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2) {
        long jO = this.boundsAnimation.getCurrentSize() == 9205357640488583168L ? IntSizeKt.O(approachMeasureScope.Uf()) : this.boundsAnimation.getCurrentSize();
        Rect rectO = this.boundsAnimation.O();
        if (rectO != null) {
            jO = rectO.Ik();
        }
        long jT2 = IntSizeKt.t(jO);
        long value = ((Constraints) this.onChooseMeasureConstraints.invoke(IntSize.rl(jT2), Constraints.n(j2))).getValue();
        final Placeable placeableDR0 = measurable.dR0(value);
        long jNr = ConstraintsKt.nr(value, jT2);
        return MeasureScope.ER(approachMeasureScope, (int) (jNr >> 32), (int) (jNr & 4294967295L), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.BoundsAnimationModifierNode$approachMeasure$1
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
                long jZ;
                Rect rectO2 = this.f15130n.boundsAnimation.O();
                LookaheadScope lookaheadScope = this.f15130n.getLookaheadScope();
                BoundsAnimationModifierNode boundsAnimationModifierNode = this.f15130n;
                LayoutCoordinates layoutCoordinatesNr = placementScope.nr();
                Offset offsetNr = layoutCoordinatesNr != null ? Offset.nr(lookaheadScope.o(placementScope).e(layoutCoordinatesNr, Offset.INSTANCE.t(), boundsAnimationModifierNode.getAnimateMotionFrameOfReference())) : null;
                if (rectO2 != null) {
                    this.f15130n.boundsAnimation.KN(rectO2.Z(), rectO2.Ik());
                    jZ = rectO2.Z();
                } else {
                    Rect rectT = this.f15130n.boundsAnimation.t();
                    jZ = rectT != null ? rectT.Z() : Offset.INSTANCE.t();
                }
                long jCk = offsetNr != null ? Offset.ck(jZ, offsetNr.getPackedValue()) : Offset.INSTANCE.t();
                Placeable.PlacementScope.xMQ(placementScope, placeableDR0, Math.round(Float.intBitsToFloat((int) (jCk >> 32))), Math.round(Float.intBitsToFloat((int) (jCk & 4294967295L))), 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: NC9, reason: from getter */
    public final LookaheadScope getLookaheadScope() {
        return this.lookaheadScope;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public boolean Qu(long lookaheadSize) {
        this.boundsAnimation.gh(IntSizeKt.O(lookaheadSize));
        return !this.boundsAnimation.J2();
    }

    public final void W1c(LookaheadScope lookaheadScope) {
        this.lookaheadScope = lookaheadScope;
    }

    /* JADX INFO: renamed from: W5k, reason: from getter */
    public final boolean getAnimateMotionFrameOfReference() {
        return this.animateMotionFrameOfReference;
    }

    public final void ex(boolean z2) {
        this.animateMotionFrameOfReference = z2;
    }

    public final void poH(BoundsTransform boundsTransform) {
        this.boundsTransform = boundsTransform;
    }

    public final void pr(Function2 function2) {
        this.onChooseMeasureConstraints = function2;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public boolean t1J(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
        this.boundsAnimation.mUb(this.lookaheadScope, placementScope, Xli(), this.directManipulationParentsDirty, this.animateMotionFrameOfReference, this.boundsTransform);
        this.directManipulationParentsDirty = this.animateMotionFrameOfReference;
        return !this.boundsAnimation.J2();
    }

    public BoundsAnimationModifierNode(LookaheadScope lookaheadScope, BoundsTransform boundsTransform, Function2 function2, boolean z2) {
        this.lookaheadScope = lookaheadScope;
        this.boundsTransform = boundsTransform;
        this.onChooseMeasureConstraints = function2;
        this.animateMotionFrameOfReference = z2;
    }
}
