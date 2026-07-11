package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.TouchBoundsExpansion;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B%\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ*\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\u000fJ\u000f\u0010!\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u000fJ\u001a\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"H&ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b&\u0010'R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u0010\u0006\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010'R*\u0010\b\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010;\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00105R\u0016\u0010?\u001a\u0004\u0018\u00010<8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u001a\u0010C\u001a\u00020@8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bA\u0010B\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Landroidx/compose/ui/input/pointer/HoverIconModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/input/pointer/PointerIcon;", "icon", "", "overrideDescendants", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "dpTouchBoundsExpansion", "<init>", "(Landroidx/compose/ui/input/pointer/PointerIcon;ZLandroidx/compose/ui/node/DpTouchBoundsExpansion;)V", "", "WKb", "()V", "ZwA", "W5k", "W1c", CmcdConfiguration.KEY_PLAYBACK_RATE, "()Landroidx/compose/ui/input/pointer/HoverIconModifierNode;", "poH", "ni", "ex", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "C", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "lNy", "Sax", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "b", "(I)Z", "NC9", "(Landroidx/compose/ui/input/pointer/PointerIcon;)V", "v", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "getDpTouchBoundsExpansion", "()Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "jE", "(Landroidx/compose/ui/node/DpTouchBoundsExpansion;)V", "value", "Xw", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getIcon", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "kC", "jB", "Z", "GT", "()Z", "eOa", "(Z)V", "U", "cursorInBoundsOfNode", "Landroidx/compose/ui/input/pointer/PointerIconService;", "Vd", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "pointerIconService", "Landroidx/compose/ui/node/TouchBoundsExpansion;", "X4T", "()J", "touchBoundsExpansion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPointerIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/HoverIconModifierNode\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n102#2,2:423\n34#2,6:425\n104#2:431\n1#3:432\n*S KotlinDebug\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/HoverIconModifierNode\n*L\n253#1:423,2\n253#1:425,6\n253#1:431\n*E\n"})
public abstract class HoverIconModifierNode extends Modifier.Node implements TraversableNode, PointerInputModifierNode, CompositionLocalConsumerModifierNode {

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private boolean cursorInBoundsOfNode;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private PointerIcon icon;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private boolean overrideDescendants;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private DpTouchBoundsExpansion dpTouchBoundsExpansion;

    public /* synthetic */ HoverIconModifierNode(PointerIcon pointerIcon, boolean z2, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(pointerIcon, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? null : dpTouchBoundsExpansion);
    }

    private final void WKb() {
        this.cursorInBoundsOfNode = true;
        W1c();
    }

    public abstract void NC9(PointerIcon icon);

    public abstract boolean b(int pointerType);

    public HoverIconModifierNode(PointerIcon pointerIcon, boolean z2, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
        this.icon = pointerIcon;
        this.overrideDescendants = z2;
    }

    private final void W1c() {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        if (!this.overrideDescendants) {
            TraversableNodeKt.J2(this, new Function1<HoverIconModifierNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final TraversableNode.Companion.TraverseDescendantsAction invoke(HoverIconModifierNode hoverIconModifierNode) {
                    if (hoverIconModifierNode.cursorInBoundsOfNode) {
                        booleanRef.element = false;
                        return TraversableNode.Companion.TraverseDescendantsAction.f32651O;
                    }
                    return TraversableNode.Companion.TraverseDescendantsAction.f32652n;
                }
            });
        }
        if (booleanRef.element) {
            W5k();
        }
    }

    private final void ZwA() {
        if (this.cursorInBoundsOfNode) {
            this.cursorInBoundsOfNode = false;
            if (getIsAttached()) {
                ex();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ex() {
        Unit unit;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TraversableNodeKt.nr(this, new Function1<HoverIconModifierNode, Boolean>() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(HoverIconModifierNode hoverIconModifierNode) {
                if (objectRef.element == 0 && hoverIconModifierNode.cursorInBoundsOfNode) {
                    objectRef.element = hoverIconModifierNode;
                } else if (objectRef.element != 0 && hoverIconModifierNode.getOverrideDescendants() && hoverIconModifierNode.cursorInBoundsOfNode) {
                    objectRef.element = hoverIconModifierNode;
                }
                return Boolean.TRUE;
            }
        });
        HoverIconModifierNode hoverIconModifierNode = (HoverIconModifierNode) objectRef.element;
        if (hoverIconModifierNode != null) {
            hoverIconModifierNode.W5k();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            NC9(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final HoverIconModifierNode ni() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TraversableNodeKt.nr(this, new Function1<HoverIconModifierNode, Boolean>() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$findOverridingAncestorNode$1
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(HoverIconModifierNode hoverIconModifierNode) {
                if (hoverIconModifierNode.getOverrideDescendants() && hoverIconModifierNode.cursorInBoundsOfNode) {
                    objectRef.element = hoverIconModifierNode;
                }
                return Boolean.TRUE;
            }
        });
        return (HoverIconModifierNode) objectRef.element;
    }

    private final void poH() {
        HoverIconModifierNode hoverIconModifierNodePr;
        if (this.cursorInBoundsOfNode) {
            if (this.overrideDescendants || (hoverIconModifierNodePr = pr()) == null) {
                hoverIconModifierNodePr = this;
            }
            hoverIconModifierNodePr.W5k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final HoverIconModifierNode pr() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TraversableNodeKt.J2(this, new Function1<HoverIconModifierNode, TraversableNode.Companion.TraverseDescendantsAction>() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode$findDescendantNodeWithCursorInBounds$1
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(HoverIconModifierNode hoverIconModifierNode) {
                TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.f32652n;
                if (hoverIconModifierNode.cursorInBoundsOfNode) {
                    objectRef.element = hoverIconModifierNode;
                    if (hoverIconModifierNode.getOverrideDescendants()) {
                        return TraversableNode.Companion.TraverseDescendantsAction.f32654t;
                    }
                }
                return traverseDescendantsAction;
            }
        });
        return (HoverIconModifierNode) objectRef.element;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void C(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        if (pass == PointerEventPass.f32080t) {
            List changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (b(((PointerInputChange) changes.get(i2)).getType())) {
                    int type = pointerEvent.getType();
                    PointerEventType.Companion companion = PointerEventType.INSTANCE;
                    if (PointerEventType.mUb(type, companion.n())) {
                        WKb();
                        return;
                    } else {
                        if (PointerEventType.mUb(pointerEvent.getType(), companion.rl())) {
                            ZwA();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: GT, reason: from getter */
    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public long X4T() {
        DpTouchBoundsExpansion dpTouchBoundsExpansion = this.dpTouchBoundsExpansion;
        return dpTouchBoundsExpansion != null ? dpTouchBoundsExpansion.n(DelegatableNodeKt.gh(this)) : TouchBoundsExpansion.INSTANCE.rl();
    }

    public final void eOa(boolean z2) {
        if (this.overrideDescendants != z2) {
            this.overrideDescendants = z2;
            if (z2) {
                if (this.cursorInBoundsOfNode) {
                    W5k();
                }
            } else if (this.cursorInBoundsOfNode) {
                poH();
            }
        }
    }

    public final void jE(DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
    }

    public final void kC(PointerIcon pointerIcon) {
        if (Intrinsics.areEqual(this.icon, pointerIcon)) {
            return;
        }
        this.icon = pointerIcon;
        if (this.cursorInBoundsOfNode) {
            W1c();
        }
    }

    private final void W5k() {
        PointerIcon pointerIcon;
        HoverIconModifierNode hoverIconModifierNodeNi = ni();
        if (hoverIconModifierNodeNi == null || (pointerIcon = hoverIconModifierNodeNi.icon) == null) {
            pointerIcon = this.icon;
        }
        NC9(pointerIcon);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void Sax() {
        ZwA();
        super.Sax();
    }

    protected final PointerIconService Vd() {
        return (PointerIconService) CompositionLocalConsumerModifierNodeKt.n(this, CompositionLocalsKt.ty());
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void lNy() {
        ZwA();
    }
}
