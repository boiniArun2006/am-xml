package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.node.ModifierNodeElement;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@ExperimentalSharedTransitionApi
@StabilityInferred
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dRG\u0010)\u001a2\u0012\u0013\u0012\u00110 ¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0013\u0012\u00110$¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020$0\u001f8\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010.\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Landroidx/compose/animation/BoundsAnimationElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/BoundsAnimationModifierNode;", "t", "()Landroidx/compose/animation/BoundsAnimationModifierNode;", "node", "", "O", "(Landroidx/compose/animation/BoundsAnimationModifierNode;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/layout/LookaheadScope;", c.f62177j, "Landroidx/compose/ui/layout/LookaheadScope;", "getLookaheadScope", "()Landroidx/compose/ui/layout/LookaheadScope;", "lookaheadScope", "Landroidx/compose/animation/BoundsTransform;", "Landroidx/compose/animation/BoundsTransform;", "getBoundsTransform", "()Landroidx/compose/animation/BoundsTransform;", "boundsTransform", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "animatedSize", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/jvm/functions/Function2;", "getResolveMeasureConstraints", "()Lkotlin/jvm/functions/Function2;", "resolveMeasureConstraints", "J2", "Z", "getAnimateMotionFrameOfReference", "()Z", "animateMotionFrameOfReference", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BoundsAnimationElement extends ModifierNodeElement<BoundsAnimationModifierNode> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata and from toString */
    private final boolean animateMotionFrameOfReference;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function2 resolveMeasureConstraints;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final LookaheadScope lookaheadScope;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final BoundsTransform boundsTransform;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoundsAnimationElement)) {
            return false;
        }
        BoundsAnimationElement boundsAnimationElement = (BoundsAnimationElement) other;
        return Intrinsics.areEqual(this.lookaheadScope, boundsAnimationElement.lookaheadScope) && Intrinsics.areEqual(this.boundsTransform, boundsAnimationElement.boundsTransform) && Intrinsics.areEqual(this.resolveMeasureConstraints, boundsAnimationElement.resolveMeasureConstraints) && this.animateMotionFrameOfReference == boundsAnimationElement.animateMotionFrameOfReference;
    }

    public int hashCode() {
        return (((((this.lookaheadScope.hashCode() * 31) + this.boundsTransform.hashCode()) * 31) + this.resolveMeasureConstraints.hashCode()) * 31) + Boolean.hashCode(this.animateMotionFrameOfReference);
    }

    public String toString() {
        return "BoundsAnimationElement(lookaheadScope=" + this.lookaheadScope + ", boundsTransform=" + this.boundsTransform + ", resolveMeasureConstraints=" + this.resolveMeasureConstraints + ", animateMotionFrameOfReference=" + this.animateMotionFrameOfReference + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void rl(BoundsAnimationModifierNode node) {
        node.W1c(this.lookaheadScope);
        node.poH(this.boundsTransform);
        node.pr(this.resolveMeasureConstraints);
        node.ex(this.animateMotionFrameOfReference);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public BoundsAnimationModifierNode n() {
        return new BoundsAnimationModifierNode(this.lookaheadScope, this.boundsTransform, this.resolveMeasureConstraints, this.animateMotionFrameOfReference);
    }
}
