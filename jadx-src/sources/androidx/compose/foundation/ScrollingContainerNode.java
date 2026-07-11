package androidx.compose.foundation;

import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableNode;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BW\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0018J]\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\b¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010)R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00106\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u0010\"R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010D\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00103R\u0016\u0010F\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010)¨\u0006G"}, d2 = {"Landroidx/compose/foundation/ScrollingContainerNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/foundation/gestures/ScrollableState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseScrolling", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "bringIntoViewSpec", "useLocalOverscrollFactory", "Landroidx/compose/foundation/OverscrollEffect;", "userProvidedOverscrollEffect", "<init>", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;ZLandroidx/compose/foundation/OverscrollEffect;)V", "", "Vd", "()V", "b", "()Landroidx/compose/foundation/OverscrollEffect;", "c", "Sax", "n1", "overscrollEffect", "ZwA", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/OverscrollEffect;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "WKb", "()Z", "UhV", "jB", "Landroidx/compose/foundation/gestures/ScrollableState;", "U", "Landroidx/compose/foundation/gestures/Orientation;", "P5", "Z", "M7", "p5", "Landroidx/compose/foundation/gestures/FlingBehavior;", "eF", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "E", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "M", "FX", "Landroidx/compose/foundation/OverscrollEffect;", "B", "lRt", "shouldAutoInvalidate", "Landroidx/compose/foundation/gestures/ScrollableNode;", "J", "Landroidx/compose/foundation/gestures/ScrollableNode;", "scrollableNode", "Landroidx/compose/ui/node/DelegatableNode;", "D", "Landroidx/compose/ui/node/DelegatableNode;", "overscrollNode", "Landroidx/compose/foundation/OverscrollFactory;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Landroidx/compose/foundation/OverscrollFactory;", "localOverscrollFactory", "I", "localOverscrollFactoryCreatedOverscrollEffect", "GR", "shouldReverseDirection", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScrollingContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollingContainer.kt\nandroidx/compose/foundation/ScrollingContainerNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,338:1\n1#2:339\n*E\n"})
final class ScrollingContainerNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, ObserverModifierNode {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private DelegatableNode overscrollNode;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private BringIntoViewSpec bringIntoViewSpec;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata */
    private OverscrollEffect userProvidedOverscrollEffect;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private boolean shouldReverseDirection;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private OverscrollEffect localOverscrollFactoryCreatedOverscrollEffect;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private ScrollableNode scrollableNode;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private boolean useLocalOverscrollFactory;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private boolean reverseScrolling;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private Orientation orientation;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private OverscrollFactory localOverscrollFactory;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private MutableInteractionSource interactionSource;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private ScrollableState state;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private FlingBehavior flingBehavior;

    private final void Vd() {
        DelegatableNode delegatableNode = this.overscrollNode;
        if (delegatableNode != null) {
            if (delegatableNode == null || delegatableNode.getNode().getIsAttached()) {
                return;
            }
            UR(delegatableNode);
            return;
        }
        if (this.useLocalOverscrollFactory) {
            ObserverModifierNodeKt.n(this, new Function0<Unit>() { // from class: androidx.compose.foundation.ScrollingContainerNode$attachOverscrollNodeIfNeeded$1
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
                    ScrollingContainerNode scrollingContainerNode = this.f16303n;
                    scrollingContainerNode.localOverscrollFactory = (OverscrollFactory) CompositionLocalConsumerModifierNodeKt.n(scrollingContainerNode, OverscrollKt.n());
                    ScrollingContainerNode scrollingContainerNode2 = this.f16303n;
                    OverscrollFactory overscrollFactory = scrollingContainerNode2.localOverscrollFactory;
                    scrollingContainerNode2.localOverscrollFactoryCreatedOverscrollEffect = overscrollFactory != null ? overscrollFactory.n() : null;
                }
            });
        }
        OverscrollEffect overscrollEffectB = b();
        if (overscrollEffectB != null) {
            DelegatableNode node = overscrollEffectB.getNode();
            if (node.getNode().getIsAttached()) {
                return;
            }
            this.overscrollNode = UR(node);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void Sax() {
        DelegatableNode delegatableNode = this.overscrollNode;
        if (delegatableNode != null) {
            ex(delegatableNode);
        }
    }

    public final boolean WKb() {
        LayoutDirection layoutDirectionTy = LayoutDirection.f34160n;
        if (getIsAttached()) {
            layoutDirectionTy = DelegatableNodeKt.ty(this);
        }
        return ScrollableDefaults.f17001n.rl(layoutDirectionTy, this.orientation, this.reverseScrolling);
    }

    public final void ZwA(ScrollableState state, Orientation orientation, boolean useLocalOverscrollFactory, OverscrollEffect overscrollEffect, boolean enabled, boolean reverseScrolling, FlingBehavior flingBehavior, MutableInteractionSource interactionSource, BringIntoViewSpec bringIntoViewSpec) {
        boolean z2;
        this.state = state;
        this.orientation = orientation;
        boolean z3 = true;
        if (this.useLocalOverscrollFactory != useLocalOverscrollFactory) {
            this.useLocalOverscrollFactory = useLocalOverscrollFactory;
            z2 = true;
        } else {
            z2 = false;
        }
        if (Intrinsics.areEqual(this.userProvidedOverscrollEffect, overscrollEffect)) {
            z3 = false;
        } else {
            this.userProvidedOverscrollEffect = overscrollEffect;
        }
        if (z2 || (z3 && !useLocalOverscrollFactory)) {
            DelegatableNode delegatableNode = this.overscrollNode;
            if (delegatableNode != null) {
                ex(delegatableNode);
            }
            this.overscrollNode = null;
            Vd();
        }
        this.enabled = enabled;
        this.reverseScrolling = reverseScrolling;
        this.flingBehavior = flingBehavior;
        this.interactionSource = interactionSource;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.shouldReverseDirection = WKb();
        ScrollableNode scrollableNode = this.scrollableNode;
        if (scrollableNode != null) {
            scrollableNode.p(state, orientation, b(), enabled, this.shouldReverseDirection, flingBehavior, interactionSource, bringIntoViewSpec);
        }
    }

    public final OverscrollEffect b() {
        return this.useLocalOverscrollFactory ? this.localOverscrollFactoryCreatedOverscrollEffect : this.userProvidedOverscrollEffect;
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: lRt, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public ScrollingContainerNode(ScrollableState scrollableState, Orientation orientation, boolean z2, boolean z3, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec, boolean z4, OverscrollEffect overscrollEffect) {
        this.state = scrollableState;
        this.orientation = orientation;
        this.enabled = z2;
        this.reverseScrolling = z3;
        this.flingBehavior = flingBehavior;
        this.interactionSource = mutableInteractionSource;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.useLocalOverscrollFactory = z4;
        this.userProvidedOverscrollEffect = overscrollEffect;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void UhV() {
        OverscrollFactory overscrollFactory = (OverscrollFactory) CompositionLocalConsumerModifierNodeKt.n(this, OverscrollKt.n());
        if (!Intrinsics.areEqual(overscrollFactory, this.localOverscrollFactory)) {
            this.localOverscrollFactory = overscrollFactory;
            this.localOverscrollFactoryCreatedOverscrollEffect = null;
            DelegatableNode delegatableNode = this.overscrollNode;
            if (delegatableNode != null) {
                ex(delegatableNode);
            }
            this.overscrollNode = null;
            Vd();
            ScrollableNode scrollableNode = this.scrollableNode;
            if (scrollableNode != null) {
                scrollableNode.p(this.state, this.orientation, b(), this.enabled, this.shouldReverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        this.shouldReverseDirection = WKb();
        Vd();
        if (this.scrollableNode == null) {
            this.scrollableNode = (ScrollableNode) UR(new ScrollableNode(this.state, b(), this.flingBehavior, this.orientation, this.enabled, this.shouldReverseDirection, this.interactionSource, this.bringIntoViewSpec));
        }
    }

    @Override // androidx.compose.ui.node.DelegatableNode
    public void n1() {
        boolean zWKb = WKb();
        if (this.shouldReverseDirection != zWKb) {
            this.shouldReverseDirection = zWKb;
            ZwA(this.state, this.orientation, this.useLocalOverscrollFactory, b(), this.enabled, this.reverseScrolling, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
        }
    }
}
