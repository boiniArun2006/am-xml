package androidx.compose.foundation;

import GJW.C;
import GJW.O;
import GJW.xuv;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.ui.focus.Focusability;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000 &2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001QB3\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u001aJ\u001b\u0010!\u001a\u00020\r*\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\u00020\r*\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010\u001aJ\u000f\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b)\u0010\u001aJ\u0017\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00105\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010L\u001a\u0004\u0018\u00010I8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006R"}, d2 = {"Landroidx/compose/foundation/FocusableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/focus/Focusability;", "focusability", "Lkotlin/Function1;", "", "", "onFocusChange", "<init>", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/focus/FocusState;", "previousState", "currentState", "jE", "(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", "Landroidx/compose/ui/layout/PinnableContainer;", "kC", "()Landroidx/compose/ui/layout/PinnableContainer;", "ZwA", "()V", "isFocused", "Vd", "(Z)V", "GT", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "b", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/Interaction;)V", "eOa", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "FX", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "kQ", "UhV", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "P5", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "jB", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "U", "Lkotlin/jvm/functions/Function1;", "Z", "lRt", "()Z", "shouldAutoInvalidate", "Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "M7", "Landroidx/compose/foundation/interaction/FocusInteraction$Focus;", "focusedInteraction", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "p5", "Landroidx/compose/ui/layout/PinnableContainer$PinnedHandle;", "pinnedHandle", "eF", "Landroidx/compose/ui/layout/LayoutCoordinates;", "globalLayoutCoordinates", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "E", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "focusTargetNode", "Lkotlin/Function0;", "M", "Lkotlin/jvm/functions/Function0;", "requestFocus", "Landroidx/compose/foundation/FocusedBoundsObserverNode;", "WKb", "()Landroidx/compose/foundation/FocusedBoundsObserverNode;", "focusedBoundsObserver", "", "Nxk", "()Ljava/lang/Object;", "traverseKey", "TraverseKey", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FocusableNode extends DelegatingNode implements SemanticsModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode, ObserverModifierNode, TraversableNode {

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final FocusTargetModifierNode focusTargetNode;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private Function0 requestFocus;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private FocusInteraction.Focus focusedInteraction;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final Function1 onFocusChange;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private LayoutCoordinates globalLayoutCoordinates;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private MutableInteractionSource interactionSource;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private PinnableContainer.PinnedHandle pinnedHandle;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private static final TraverseKey f16114FX = new TraverseKey(null);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f16113B = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/FocusableNode$TraverseKey;", "", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class TraverseKey {
        public /* synthetic */ TraverseKey(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TraverseKey() {
        }
    }

    public /* synthetic */ FocusableNode(MutableInteractionSource mutableInteractionSource, int i2, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, i2, function1);
    }

    public /* synthetic */ FocusableNode(MutableInteractionSource mutableInteractionSource, int i2, Function1 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, (i3 & 2) != 0 ? Focusability.INSTANCE.n() : i2, (i3 & 4) != 0 ? null : function1, null);
    }

    private final void GT() {
        FocusInteraction.Focus focus;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null && (focus = this.focusedInteraction) != null) {
            mutableInteractionSource.rl(new FocusInteraction.Unfocus(focus));
        }
        this.focusedInteraction = null;
    }

    private final void Vd(boolean isFocused) {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            if (!isFocused) {
                FocusInteraction.Focus focus = this.focusedInteraction;
                if (focus != null) {
                    b(mutableInteractionSource, new FocusInteraction.Unfocus(focus));
                    this.focusedInteraction = null;
                    return;
                }
                return;
            }
            FocusInteraction.Focus focus2 = this.focusedInteraction;
            if (focus2 != null) {
                b(mutableInteractionSource, new FocusInteraction.Unfocus(focus2));
                this.focusedInteraction = null;
            }
            FocusInteraction.Focus focus3 = new FocusInteraction.Focus();
            b(mutableInteractionSource, focus3);
            this.focusedInteraction = focus3;
        }
    }

    private final void ZwA() {
        FocusedBoundsObserverNode focusedBoundsObserverNodeWKb;
        LayoutCoordinates layoutCoordinates = this.globalLayoutCoordinates;
        if (layoutCoordinates != null) {
            Intrinsics.checkNotNull(layoutCoordinates);
            if (!layoutCoordinates.nr() || (focusedBoundsObserverNodeWKb = WKb()) == null) {
                return;
            }
            focusedBoundsObserverNodeWKb.UR(this.globalLayoutCoordinates);
        }
    }

    private final PinnableContainer kC() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ObserverModifierNodeKt.n(this, new Function0<Unit>() { // from class: androidx.compose.foundation.FocusableNode$retrievePinnableContainer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                objectRef.element = CompositionLocalConsumerModifierNodeKt.n(this, PinnableContainerKt.n());
            }
        });
        return (PinnableContainer) objectRef.element;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void FX(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.dR0(semanticsPropertyReceiver, this.focusTargetNode.ijL().n());
        if (this.requestFocus == null) {
            this.requestFocus = new Function0<Boolean>() { // from class: androidx.compose.foundation.FocusableNode$applySemantics$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(FocusTargetModifierNode.mYa(this.f16118n.focusTargetNode, 0, 1, null));
                }
            };
        }
        SemanticsPropertiesKt.M7(semanticsPropertyReceiver, null, this.requestFocus, 1, null);
    }

    @Override // androidx.compose.ui.node.TraversableNode
    /* JADX INFO: renamed from: Nxk */
    public Object getTraverseKey() {
        return f16114FX;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void P5(LayoutCoordinates coordinates) {
        this.globalLayoutCoordinates = coordinates;
        if (this.focusTargetNode.ijL().n()) {
            if (coordinates.nr()) {
                ZwA();
                return;
            }
            FocusedBoundsObserverNode focusedBoundsObserverNodeWKb = WKb();
            if (focusedBoundsObserverNodeWKb != null) {
                focusedBoundsObserverNodeWKb.UR(null);
            }
        }
    }

    public final void eOa(MutableInteractionSource interactionSource) {
        if (Intrinsics.areEqual(this.interactionSource, interactionSource)) {
            return;
        }
        GT();
        this.interactionSource = interactionSource;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void kQ() {
        PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
        if (pinnedHandle != null) {
            pinnedHandle.release();
        }
        this.pinnedHandle = null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: lRt, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    private final FocusedBoundsObserverNode WKb() {
        if (getIsAttached()) {
            TraversableNode traversableNodeN = TraversableNodeKt.n(this, FocusedBoundsObserverNode.INSTANCE);
            if (traversableNodeN instanceof FocusedBoundsObserverNode) {
                return (FocusedBoundsObserverNode) traversableNodeN;
            }
        }
        return null;
    }

    private final void b(final MutableInteractionSource mutableInteractionSource, final Interaction interaction) {
        O oInvokeOnCompletion;
        if (getIsAttached()) {
            xuv xuvVar = (xuv) Xli().getCoroutineContext().get(xuv.nr);
            if (xuvVar != null) {
                oInvokeOnCompletion = xuvVar.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.foundation.FocusableNode$emitWithFallback$handler$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th) {
                        mutableInteractionSource.rl(interaction);
                    }
                });
            } else {
                oInvokeOnCompletion = null;
            }
            C.nr(Xli(), null, null, new FocusableNode$emitWithFallback$1(mutableInteractionSource, interaction, oInvokeOnCompletion, null), 3, null);
            return;
        }
        mutableInteractionSource.rl(interaction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jE(FocusState previousState, FocusState currentState) {
        boolean zN;
        if (!getIsAttached() || (zN = currentState.n()) == previousState.n()) {
            return;
        }
        Function1 function1 = this.onFocusChange;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(zN));
        }
        PinnableContainer.PinnedHandle pinnedHandleN = null;
        if (zN) {
            C.nr(Xli(), null, null, new FocusableNode$onFocusStateChange$1(this, null), 3, null);
            PinnableContainer pinnableContainerKC = kC();
            if (pinnableContainerKC != null) {
                pinnedHandleN = pinnableContainerKC.n();
            }
            this.pinnedHandle = pinnedHandleN;
            ZwA();
        } else {
            PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.pinnedHandle = null;
            FocusedBoundsObserverNode focusedBoundsObserverNodeWKb = WKb();
            if (focusedBoundsObserverNodeWKb != null) {
                focusedBoundsObserverNodeWKb.UR(null);
            }
        }
        SemanticsModifierNodeKt.rl(this);
        Vd(zN);
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void UhV() {
        PinnableContainer.PinnedHandle pinnedHandleN;
        PinnableContainer pinnableContainerKC = kC();
        if (this.focusTargetNode.ijL().n()) {
            PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            if (pinnableContainerKC != null) {
                pinnedHandleN = pinnableContainerKC.n();
            } else {
                pinnedHandleN = null;
            }
            this.pinnedHandle = pinnedHandleN;
        }
    }

    private FocusableNode(MutableInteractionSource mutableInteractionSource, int i2, Function1 function1) {
        this.interactionSource = mutableInteractionSource;
        this.onFocusChange = function1;
        this.focusTargetNode = (FocusTargetModifierNode) UR(FocusTargetModifierNodeKt.n(i2, new FocusableNode$focusTargetNode$1(this)));
    }
}
