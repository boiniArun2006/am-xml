package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003CDEB'\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0014\u001a\u00020\u0011*\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R1\u00100\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000b8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R,\u00107\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b02018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R*\u0010>\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010\r\u001a\u00020\u000b8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b?\u0010-R\u0014\u0010A\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010@R\u0014\u0010B\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010@\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H²\u0006\u0014\u0010G\u001a\u00020F\"\u0004\b\u0000\u0010\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "S", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/core/Transition;", "transition", "Landroidx/compose/ui/Alignment;", "contentAlignment", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/unit/IntSize;", "fullSize", "currentSize", "Landroidx/compose/ui/unit/IntOffset;", "Uo", "(JJ)J", "Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "rl", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/animation/SizeTransform;)Landroidx/compose/animation/ContentTransform;", "contentTransform", "Landroidx/compose/ui/Modifier;", "KN", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", c.f62177j, "Landroidx/compose/animation/core/Transition;", "HI", "()Landroidx/compose/animation/core/Transition;", "Landroidx/compose/ui/Alignment;", "gh", "()Landroidx/compose/ui/Alignment;", "Ik", "(Landroidx/compose/ui/Alignment;)V", "t", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection$animation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "r", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "<set-?>", "nr", "Landroidx/compose/runtime/MutableState;", "az", "()J", "o", "(J)V", "measuredSize", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/State;", "O", "Landroidx/collection/MutableScatterMap;", "ty", "()Landroidx/collection/MutableScatterMap;", "targetSizeMap", "J2", "Landroidx/compose/runtime/State;", "getAnimatedSize$animation_release", "()Landroidx/compose/runtime/State;", "ck", "(Landroidx/compose/runtime/State;)V", "animatedSize", "qie", "()Ljava/lang/Object;", "initialState", "targetState", "ChildData", "SizeModifierElement", "SizeModifierNode", "", "shouldAnimateSize", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,958:1\n1#2:959\n85#3:960\n113#3,2:961\n85#3:975\n113#3,2:976\n1247#4,6:963\n1247#4,6:969\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl\n*L\n546#1:960\n546#1:961,2\n558#1:975\n558#1:976,2\n558#1:963,6\n571#1:969,6\n*E\n"})
public final class AnimatedContentTransitionScopeImpl<S> implements AnimatedContentTransitionScope<S> {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private State animatedSize;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Transition transition;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private Alignment contentAlignment;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableState measuredSize = SnapshotStateKt__SnapshotStateKt.O(IntSize.rl(IntSize.INSTANCE.n()), null, 2, null);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableScatterMap targetSizeMap = ScatterMapKt.t();

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u0007*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0005¨\u0006\u0010"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData;", "Landroidx/compose/ui/layout/ParentDataModifier;", "", "isTarget", "<init>", "(Z)V", "Landroidx/compose/ui/unit/Density;", "", "parentData", "Xw", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;", "<set-?>", c.f62177j, "Landroidx/compose/runtime/MutableState;", "()Z", "rl", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,958:1\n85#2:959\n113#2,2:960\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData\n*L\n592#1:959\n592#1:960,2\n*E\n"})
    public static final class ChildData implements ParentDataModifier {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final MutableState isTarget;

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public Object Xw(Density density, Object obj) {
            return this;
        }

        public final boolean n() {
            return ((Boolean) this.isTarget.getValue()).booleanValue();
        }

        public final void rl(boolean z2) {
            this.isTarget.setValue(Boolean.valueOf(z2));
        }

        public ChildData(boolean z2) {
            this.isTarget = SnapshotStateKt__SnapshotStateKt.O(Boolean.valueOf(z2), null, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002BE\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004R\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR/\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004R\b\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;", "S", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode;", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "sizeAnimation", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "scope", "<init>", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "t", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode;", "", "hashCode", "()I", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "node", "", "O", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode;)V", c.f62177j, "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/runtime/State;", "getSizeTransform", "()Landroidx/compose/runtime/State;", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "getScope", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class SizeModifierElement<S> extends ModifierNodeElement<SizeModifierNode<S>> {

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private final AnimatedContentTransitionScopeImpl scope;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final Transition.DeferredAnimation sizeAnimation;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final State sizeTransform;

        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public void rl(SizeModifierNode node) {
            node.W1c(this.sizeAnimation);
            node.pr(this.sizeTransform);
            node.poH(this.scope);
        }

        public boolean equals(Object other) {
            if (!(other instanceof SizeModifierElement)) {
                return false;
            }
            SizeModifierElement sizeModifierElement = (SizeModifierElement) other;
            return Intrinsics.areEqual(sizeModifierElement.sizeAnimation, this.sizeAnimation) && Intrinsics.areEqual(sizeModifierElement.sizeTransform, this.sizeTransform);
        }

        public int hashCode() {
            int iHashCode = this.scope.hashCode() * 31;
            Transition.DeferredAnimation deferredAnimation = this.sizeAnimation;
            return ((iHashCode + (deferredAnimation != null ? deferredAnimation.hashCode() : 0)) * 31) + this.sizeTransform.hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public SizeModifierNode n() {
            return new SizeModifierNode(this.sizeAnimation, this.sizeTransform, this.scope);
        }

        public SizeModifierElement(Transition.DeferredAnimation deferredAnimation, State state, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
            this.sizeAnimation = deferredAnimation;
            this.sizeTransform = state;
            this.scope = animatedContentTransitionScopeImpl;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002BE\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003R\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u001b\u001a\u00020\u001a*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR:\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003R\b\u0012\u0004\u0012\u00028\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b/\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode;", "S", "Landroidx/compose/animation/LayoutModifierNodeWithPassThroughIntrinsics;", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "sizeAnimation", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/SizeTransform;", "sizeTransform", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "scope", "<init>", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "default", "ex", "(J)J", "", "kQ", "()V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "nr", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "v", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "W1c", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", "Xw", "Landroidx/compose/runtime/State;", "NC9", "()Landroidx/compose/runtime/State;", CmcdConfiguration.KEY_PLAYBACK_RATE, "(Landroidx/compose/runtime/State;)V", "jB", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "W5k", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "poH", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "U", "J", "lastSize", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,958:1\n30#2:959\n30#2:961\n30#2:963\n30#2:965\n80#3:960\n80#3:962\n80#3:964\n80#3:966\n85#3:968\n90#3:970\n54#4:967\n59#4:969\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierNode\n*L\n657#1:959\n660#1:961\n661#1:963\n663#1:965\n657#1:960\n660#1:962\n661#1:964\n663#1:966\n689#1:968\n689#1:970\n689#1:967\n689#1:969\n*E\n"})
    static final class SizeModifierNode<S> extends LayoutModifierNodeWithPassThroughIntrinsics {

        /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
        private long lastSize = AnimatedContentKt.f14940n;

        /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
        private State sizeTransform;

        /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
        private AnimatedContentTransitionScopeImpl scope;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        private Transition.DeferredAnimation sizeAnimation;

        /* JADX INFO: Access modifiers changed from: private */
        public final long ex(long j2) {
            return IntSize.O(this.lastSize, AnimatedContentKt.f14940n) ? j2 : this.lastSize;
        }

        /* JADX INFO: renamed from: NC9, reason: from getter */
        public final State getSizeTransform() {
            return this.sizeTransform;
        }

        public final void W1c(Transition.DeferredAnimation deferredAnimation) {
            this.sizeAnimation = deferredAnimation;
        }

        /* JADX INFO: renamed from: W5k, reason: from getter */
        public final AnimatedContentTransitionScopeImpl getScope() {
            return this.scope;
        }

        public final void poH(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
            this.scope = animatedContentTransitionScopeImpl;
        }

        public final void pr(State state) {
            this.sizeTransform = state;
        }

        public SizeModifierNode(Transition.DeferredAnimation deferredAnimation, State state, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
            this.sizeAnimation = deferredAnimation;
            this.sizeTransform = state;
            this.scope = animatedContentTransitionScopeImpl;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void kQ() {
            super.kQ();
            this.lastSize = AnimatedContentKt.f14940n;
        }

        @Override // androidx.compose.ui.node.LayoutModifierNode
        public MeasureResult nr(MeasureScope measureScope, Measurable measurable, long j2) {
            final long packedValue;
            final Placeable placeableDR0 = measurable.dR0(j2);
            if (measureScope.Org()) {
                packedValue = IntSize.t((((long) placeableDR0.getWidth()) << 32) | (((long) placeableDR0.getHeight()) & 4294967295L));
            } else if (this.sizeAnimation == null) {
                packedValue = IntSize.t((((long) placeableDR0.getWidth()) << 32) | (((long) placeableDR0.getHeight()) & 4294967295L));
                this.lastSize = IntSize.t((((long) placeableDR0.getWidth()) << 32) | (((long) placeableDR0.getHeight()) & 4294967295L));
            } else {
                final long jT2 = IntSize.t((((long) placeableDR0.getWidth()) << 32) | (((long) placeableDR0.getHeight()) & 4294967295L));
                Transition.DeferredAnimation deferredAnimation = this.sizeAnimation;
                Intrinsics.checkNotNull(deferredAnimation);
                State stateN = deferredAnimation.n(new Function1<Transition.Segment<S>, FiniteAnimationSpec<IntSize>>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final FiniteAnimationSpec invoke(Transition.Segment segment) {
                        long jN;
                        long jN2;
                        FiniteAnimationSpec finiteAnimationSpecRl;
                        if (Intrinsics.areEqual(segment.getInitialState(), this.f15001n.getScope().getInitialState())) {
                            jN = this.f15001n.ex(jT2);
                        } else {
                            State state = (State) this.f15001n.getScope().getTargetSizeMap().O(segment.getInitialState());
                            if (state != null) {
                                jN = ((IntSize) state.getValue()).getPackedValue();
                            } else {
                                jN = IntSize.INSTANCE.n();
                            }
                        }
                        State state2 = (State) this.f15001n.getScope().getTargetSizeMap().O(segment.getTargetState());
                        if (state2 != null) {
                            jN2 = ((IntSize) state2.getValue()).getPackedValue();
                        } else {
                            jN2 = IntSize.INSTANCE.n();
                        }
                        SizeTransform sizeTransform = (SizeTransform) this.f15001n.getSizeTransform().getValue();
                        if (sizeTransform != null && (finiteAnimationSpecRl = sizeTransform.rl(jN, jN2)) != null) {
                            return finiteAnimationSpecRl;
                        }
                        return AnimationSpecKt.qie(0.0f, 400.0f, null, 5, null);
                    }
                }, new Function1<S, IntSize>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final long n(Object obj) {
                        if (Intrinsics.areEqual(obj, this.f15003n.getScope().getInitialState())) {
                            return this.f15003n.ex(jT2);
                        }
                        State state = (State) this.f15003n.getScope().getTargetSizeMap().O(obj);
                        return state != null ? ((IntSize) state.getValue()).getPackedValue() : IntSize.INSTANCE.n();
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ IntSize invoke(Object obj) {
                        return IntSize.rl(n(obj));
                    }
                });
                this.scope.ck(stateN);
                packedValue = ((IntSize) stateN.getValue()).getPackedValue();
                this.lastSize = ((IntSize) stateN.getValue()).getPackedValue();
            }
            return MeasureScope.ER(measureScope, (int) (packedValue >> 32), (int) (packedValue & 4294967295L), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1
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
                    Placeable.PlacementScope.gh(placementScope, placeableDR0, this.f14999n.getScope().getContentAlignment().n(IntSize.t((((long) placeableDR0.getWidth()) << 32) | (((long) placeableDR0.getHeight()) & 4294967295L)), packedValue, LayoutDirection.f34160n), 0.0f, 2, null);
                }
            }, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long qie() {
        State state = this.animatedSize;
        return state != null ? ((IntSize) state.getValue()).getPackedValue() : az();
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final Transition getTransition() {
        return this.transition;
    }

    public void Ik(Alignment alignment) {
        this.contentAlignment = alignment;
    }

    public final long az() {
        return ((IntSize) this.measuredSize.getValue()).getPackedValue();
    }

    public final void ck(State state) {
        this.animatedSize = state;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public Alignment getContentAlignment() {
        return this.contentAlignment;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    /* JADX INFO: renamed from: n */
    public Object getTargetState() {
        return this.transition.HI().getTargetState();
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    /* JADX INFO: renamed from: nr */
    public Object getInitialState() {
        return this.transition.HI().getInitialState();
    }

    public final void o(long j2) {
        this.measuredSize.setValue(IntSize.rl(j2));
    }

    public final void r(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    public final MutableScatterMap getTargetSizeMap() {
        return this.targetSizeMap;
    }

    public AnimatedContentTransitionScopeImpl(Transition transition, Alignment alignment, LayoutDirection layoutDirection) {
        this.transition = transition;
        this.contentAlignment = alignment;
        this.layoutDirection = layoutDirection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long Uo(long fullSize, long currentSize) {
        return getContentAlignment().n(fullSize, currentSize, LayoutDirection.f34160n);
    }

    private static final void mUb(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    private static final boolean xMQ(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public final Modifier KN(ContentTransform contentTransform, Composer composer, int i2) {
        Modifier modifier;
        Object objRl;
        if (ComposerKt.v()) {
            ComposerKt.p5(93755870, i2, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:556)");
        }
        boolean zP5 = composer.p5(this);
        Object objIF = composer.iF();
        Transition.DeferredAnimation deferredAnimationO = null;
        if (zP5 || objIF == Composer.INSTANCE.n()) {
            objIF = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
            composer.o(objIF);
        }
        MutableState mutableState = (MutableState) objIF;
        State stateCk = SnapshotStateKt.ck(contentTransform.getSizeTransform(), composer, 0);
        if (Intrinsics.areEqual(this.transition.xMQ(), this.transition.Ik())) {
            mUb(mutableState, false);
        } else if (stateCk.getValue() != null) {
            mUb(mutableState, true);
        }
        if (xMQ(mutableState)) {
            composer.eF(249676467);
            deferredAnimationO = androidx.compose.animation.core.TransitionKt.O(this.transition, VectorConvertersKt.KN(IntSize.INSTANCE), null, composer, 0, 2);
            boolean zP52 = composer.p5(deferredAnimationO);
            Object objIF2 = composer.iF();
            if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                SizeTransform sizeTransform = (SizeTransform) stateCk.getValue();
                if (sizeTransform != null && !sizeTransform.getClip()) {
                    objRl = Modifier.INSTANCE;
                } else {
                    objRl = ClipKt.rl(Modifier.INSTANCE);
                }
                objIF2 = objRl;
                composer.o(objIF2);
            }
            modifier = (Modifier) objIF2;
            composer.Xw();
        } else {
            composer.eF(249942509);
            composer.Xw();
            this.animatedSize = null;
            modifier = Modifier.INSTANCE;
        }
        Modifier modifierZmq = modifier.Zmq(new SizeModifierElement(deferredAnimationO, stateCk, this));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return modifierZmq;
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public ContentTransform rl(ContentTransform contentTransform, SizeTransform sizeTransform) {
        contentTransform.O(sizeTransform);
        return contentTransform;
    }
}
