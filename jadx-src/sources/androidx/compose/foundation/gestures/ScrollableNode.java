package androidx.compose.foundation.gestures;

import GJW.C;
import GJW.vd;
import android.view.KeyEvent;
import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.foundation.FocusedBoundsObserverNode;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.ui.focus.Focusability;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.events.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BO\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001cJO\u0010)\u001a\u00020\u00182=\u0010(\u001a9\b\u0001\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00180!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180&\u0012\u0006\u0012\u0004\u0018\u00010'0 H\u0096@¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u00182\u0006\u0010,\u001a\u00020+H\u0016ø\u0001\u0000¢\u0006\u0004\b-\u0010\u001aJ\u001a\u0010.\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b.\u0010\u001aJ\u000f\u0010/\u001a\u00020\rH\u0016¢\u0006\u0004\b/\u00100JU\u00101\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0018H\u0016¢\u0006\u0004\b3\u0010\u001cJ\u000f\u00104\u001a\u00020\u0018H\u0016¢\u0006\u0004\b4\u0010\u001cJ\u001a\u00107\u001a\u00020\r2\u0006\u00106\u001a\u000205H\u0016ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001a\u00109\u001a\u00020\r2\u0006\u00106\u001a\u000205H\u0016ø\u0001\u0000¢\u0006\u0004\b9\u00108J*\u0010@\u001a\u00020\u00182\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0016ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u0013\u0010C\u001a\u00020\u0018*\u00020BH\u0016¢\u0006\u0004\bC\u0010DR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010L\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u00100R\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cRH\u0010j\u001a4\u0012\u0013\u0012\u00110e¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(f\u0012\u0013\u0012\u00110e¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(g\u0012\u0004\u0012\u00020\r\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR4\u0010l\u001a \b\u0001\u0012\u0004\u0012\u00020+\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0&\u0012\u0006\u0012\u0004\u0018\u00010'\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010iR\u0018\u0010p\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010o\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006q"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableNode;", "Landroidx/compose/foundation/gestures/DragGestureNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/gestures/ScrollableState;", "state", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/gestures/BringIntoViewSpec;", "bringIntoViewSpec", "<init>", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "Landroidx/compose/ui/unit/Velocity;", "velocity", "", "q", "(J)V", "F6W", "()V", "ep", "Hq", "lvn", "Lkotlin/Function2;", "Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "dragDelta", "Lkotlin/coroutines/Continuation;", "", "forEachDelta", "eOa", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/geometry/Offset;", "startedPosition", "Yq", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "yUZ", "()Z", TtmlNode.TAG_P, "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)V", "c", "jB", "Landroidx/compose/ui/input/key/KeyEvent;", a.f62811a, "jO", "(Landroid/view/KeyEvent;)Z", "ub", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "C", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "FX", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "B", "Landroidx/compose/foundation/OverscrollEffect;", "J", "Landroidx/compose/foundation/gestures/FlingBehavior;", "D", "Z", "lRt", "shouldAutoInvalidate", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "nestedScrollDispatcher", "Landroidx/compose/foundation/gestures/ScrollableContainerNode;", "I", "Landroidx/compose/foundation/gestures/ScrollableContainerNode;", "scrollableContainerNode", "Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "GR", "Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "defaultFlingBehavior", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "Nxk", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "Y", "Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "nestedScrollConnection", "Landroidx/compose/foundation/gestures/ContentInViewNode;", "k", "Landroidx/compose/foundation/gestures/ContentInViewNode;", "contentInViewNode", "", "x", "y", "dR0", "Lkotlin/jvm/functions/Function2;", "scrollByAction", "z", "scrollByOffsetAction", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;", "piY", "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;", "mouseWheelScrollingLogic", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1037:1\n59#2:1038\n54#2:1044\n90#3:1039\n53#3,3:1041\n85#3:1045\n53#3,3:1047\n30#4:1040\n30#4:1046\n102#5,2:1050\n34#5,6:1052\n104#5:1058\n1#6:1059\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableNode\n*L\n445#1:1038\n456#1:1044\n445#1:1039\n454#1:1041,3\n456#1:1045\n465#1:1047,3\n454#1:1040\n465#1:1046\n495#1:1050,2\n495#1:1052,6\n495#1:1058\n*E\n"})
public final class ScrollableNode extends DragGestureNode implements KeyInputModifierNode, SemanticsModifierNode, CompositionLocalConsumerModifierNode {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    private OverscrollEffect overscrollEffect;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata */
    private final DefaultFlingBehavior defaultFlingBehavior;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final ScrollableContainerNode scrollableContainerNode;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata */
    private FlingBehavior flingBehavior;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    private final ScrollingLogic scrollingLogic;

    /* JADX INFO: renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private final ScrollableNestedScrollConnection nestedScrollConnection;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NestedScrollDispatcher nestedScrollDispatcher;

    /* JADX INFO: renamed from: dR0, reason: from kotlin metadata */
    private Function2 scrollByAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ContentInViewNode contentInViewNode;

    /* JADX INFO: renamed from: piY, reason: from kotlin metadata */
    private MouseWheelScrollingLogic mouseWheelScrollingLogic;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private Function2 scrollByOffsetAction;

    private final void lvn() {
        this.scrollByAction = null;
        this.scrollByOffsetAction = null;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public void Yq(long startedPosition) {
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    public boolean ub(KeyEvent event) {
        return false;
    }

    public ScrollableNode(ScrollableState scrollableState, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, Orientation orientation, boolean z2, boolean z3, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        super(ScrollableKt.f17010n, z2, mutableInteractionSource, orientation);
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.scrollableContainerNode = (ScrollableContainerNode) UR(new ScrollableContainerNode(z2));
        DefaultFlingBehavior defaultFlingBehavior = new DefaultFlingBehavior(SplineBasedDecayKt.t(ScrollableKt.nr), null, 2, null);
        this.defaultFlingBehavior = defaultFlingBehavior;
        OverscrollEffect overscrollEffect2 = this.overscrollEffect;
        FlingBehavior flingBehavior2 = this.flingBehavior;
        ScrollingLogic scrollingLogic = new ScrollingLogic(scrollableState, overscrollEffect2, flingBehavior2 == null ? defaultFlingBehavior : flingBehavior2, orientation, z3, nestedScrollDispatcher, new Function0<Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableNode$scrollingLogic$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(this.f17055n.getIsAttached());
            }
        });
        this.scrollingLogic = scrollingLogic;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic, z2);
        this.nestedScrollConnection = scrollableNestedScrollConnection;
        ContentInViewNode contentInViewNode = (ContentInViewNode) UR(new ContentInViewNode(orientation, scrollingLogic, z3, bringIntoViewSpec));
        this.contentInViewNode = contentInViewNode;
        UR(NestedScrollNodeKt.t(scrollableNestedScrollConnection, nestedScrollDispatcher));
        UR(FocusTargetModifierNodeKt.rl(Focusability.INSTANCE.rl(), null, 2, null));
        UR(new BringIntoViewResponderNode(contentInViewNode));
        UR(new FocusedBoundsObserverNode(new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.gestures.ScrollableNode.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                n(layoutCoordinates);
                return Unit.INSTANCE;
            }

            public final void n(LayoutCoordinates layoutCoordinates) {
                ScrollableNode.this.contentInViewNode.G(layoutCoordinates);
            }
        }));
    }

    private final void F6W() {
        if (this.mouseWheelScrollingLogic == null) {
            this.mouseWheelScrollingLogic = new MouseWheelScrollingLogic(this.scrollingLogic, AndroidScrollable_androidKt.n(this), new ScrollableNode$ensureMouseWheelScrollNodeInitialized$1(this), DelegatableNodeKt.gh(this));
        }
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.S(Xli());
        }
    }

    private final void Hq() {
        this.scrollByAction = new Function2<Float, Float, Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", f = "Scrollable.kt", i = {}, l = {518}, m = "invokeSuspend", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableNode$setScrollSemanticsActions$1$1\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1037:1\n30#2:1038\n53#3,3:1039\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableNode$setScrollSemanticsActions$1$1\n*L\n518#1:1038\n518#1:1039,3\n*E\n"})
            static final class AnonymousClass1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
                final /* synthetic */ float J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ float f17057O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f17058n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ ScrollableNode f17059t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ScrollableNode scrollableNode, float f3, float f4, Continuation continuation) {
                    super(2, continuation);
                    this.f17059t = scrollableNode;
                    this.f17057O = f3;
                    this.J2 = f4;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass1(this.f17059t, this.f17057O, this.J2, continuation);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(vd vdVar, Continuation continuation) {
                    return ((AnonymousClass1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
                    return invoke2(vdVar, (Continuation) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f17058n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        ScrollingLogic scrollingLogic = this.f17059t.scrollingLogic;
                        float f3 = this.f17057O;
                        float f4 = this.J2;
                        long jO = Offset.O((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
                        this.f17058n = 1;
                        if (ScrollableKt.qie(scrollingLogic, jO, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Boolean invoke(Float f3, Float f4) {
                return n(f3.floatValue(), f4.floatValue());
            }

            public final Boolean n(float f3, float f4) {
                C.nr(this.f17056n.Xli(), null, null, new AnonymousClass1(this.f17056n, f3, f4, null), 3, null);
                return Boolean.TRUE;
            }
        };
        this.scrollByOffsetAction = new ScrollableNode$setScrollSemanticsActions$2(this, null);
    }

    private final void q(long velocity) {
        C.nr(this.nestedScrollDispatcher.O(), null, null, new ScrollableNode$onWheelScrollStopped$1(this, velocity, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public void G(long velocity) {
        C.nr(this.nestedScrollDispatcher.O(), null, null, new ScrollableNode$onDragStopped$1(this, velocity, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public Object eOa(Function2 function2, Continuation continuation) {
        ScrollingLogic scrollingLogic = this.scrollingLogic;
        Object objNY = scrollingLogic.nY(MutatePriority.f16229t, new ScrollableNode$drag$2$1(function2, scrollingLogic, null), continuation);
        return objNY == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNY : Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: lRt, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public final void p(ScrollableState state, Orientation orientation, OverscrollEffect overscrollEffect, boolean enabled, boolean reverseDirection, FlingBehavior flingBehavior, MutableInteractionSource interactionSource, BringIntoViewSpec bringIntoViewSpec) {
        boolean z2;
        if (getEnabled() != enabled) {
            this.nestedScrollConnection.n(enabled);
            this.scrollableContainerNode.W5k(enabled);
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = z2;
        boolean zN = this.scrollingLogic.N(state, orientation, overscrollEffect, reverseDirection, flingBehavior == null ? this.defaultFlingBehavior : flingBehavior, this.nestedScrollDispatcher);
        this.contentInViewNode.kR(orientation, reverseDirection, bringIntoViewSpec);
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        H6M(ScrollableKt.f17010n, enabled, interactionSource, this.scrollingLogic.Z() ? Orientation.f16969n : Orientation.f16970t, zN);
        if (z3) {
            lvn();
            SemanticsModifierNodeKt.rl(this);
        }
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    /* JADX INFO: renamed from: yUZ */
    public boolean getStartDragImmediately() {
        return this.scrollingLogic.te();
    }

    private final void ep() {
        if (!getIsAttached()) {
            return;
        }
        this.defaultFlingBehavior.Uo(DelegatableNodeKt.gh(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object u2n(ScrollableNode scrollableNode, long j2, Continuation continuation) {
        scrollableNode.q(j2);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode, androidx.compose.ui.node.PointerInputModifierNode
    public void C(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        List changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (((Boolean) getCanDrag().invoke((PointerInputChange) changes.get(i2))).booleanValue()) {
                super.C(pointerEvent, pass, bounds);
                break;
            }
            i2++;
        }
        if (getEnabled()) {
            if (pass == PointerEventPass.f32078n && PointerEventType.mUb(pointerEvent.getType(), PointerEventType.INSTANCE.J2())) {
                F6W();
            }
            MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
            if (mouseWheelScrollingLogic != null) {
                mouseWheelScrollingLogic.XQ(pointerEvent, pass, bounds);
            }
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void FX(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (getEnabled() && (this.scrollByAction == null || this.scrollByOffsetAction == null)) {
            Hq();
        }
        Function2 function2 = this.scrollByAction;
        if (function2 != null) {
            SemanticsPropertiesKt.eF(semanticsPropertyReceiver, null, function2, 1, null);
        }
        Function2 function22 = this.scrollByOffsetAction;
        if (function22 != null) {
            SemanticsPropertiesKt.E(semanticsPropertyReceiver, function22);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        ep();
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.nY(DelegatableNodeKt.gh(this));
        }
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void jB() {
        lNy();
        ep();
        MouseWheelScrollingLogic mouseWheelScrollingLogic = this.mouseWheelScrollingLogic;
        if (mouseWheelScrollingLogic != null) {
            mouseWheelScrollingLogic.nY(DelegatableNodeKt.gh(this));
        }
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    public boolean jO(KeyEvent event) {
        float f3;
        long jO;
        float f4;
        if (getEnabled()) {
            long jN = KeyEvent_androidKt.n(event);
            Key.Companion companion = Key.INSTANCE;
            if ((Key.r(jN, companion.qie()) || Key.r(KeyEvent_androidKt.n(event), companion.az())) && KeyEventType.J2(KeyEvent_androidKt.rl(event), KeyEventType.INSTANCE.n()) && !KeyEvent_androidKt.O(event)) {
                if (this.scrollingLogic.Z()) {
                    int viewportSize = (int) (this.contentInViewNode.getViewportSize() & 4294967295L);
                    if (Key.r(KeyEvent_androidKt.n(event), companion.az())) {
                        f4 = viewportSize;
                    } else {
                        f4 = -viewportSize;
                    }
                    jO = Offset.O((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
                } else {
                    int viewportSize2 = (int) (this.contentInViewNode.getViewportSize() >> 32);
                    if (Key.r(KeyEvent_androidKt.n(event), companion.az())) {
                        f3 = viewportSize2;
                    } else {
                        f3 = -viewportSize2;
                    }
                    jO = Offset.O((((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                }
                C.nr(Xli(), null, null, new ScrollableNode$onKeyEvent$1(this, jO, null), 3, null);
                return true;
            }
            return false;
        }
        return false;
    }
}
