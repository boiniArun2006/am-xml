package androidx.compose.material3;

import GJW.C;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u001c\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0014\u00105\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/material3/ClockDialNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/material3/AnalogTimePickerState;", "state", "", "autoSwitchToMinute", "Landroidx/compose/material3/TimePickerSelectionMode;", "selection", "<init>", "(Landroidx/compose/material3/AnalogTimePickerState;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/IntSize;", "size", "", "HI", "(J)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "bounds", "C", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "lNy", "()V", "eOa", "(Landroidx/compose/material3/AnalogTimePickerState;ZI)V", "jB", "Landroidx/compose/material3/AnalogTimePickerState;", "U", "Z", "P5", "I", "", "M7", "F", "offsetX", "p5", "offsetY", "Landroidx/compose/ui/unit/IntOffset;", "eF", "J", TtmlNode.CENTER, "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "E", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pointerInputTapNode", "M", "pointerInputDragNode", "kC", "()F", "maxDist", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/ClockDialNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2008:1\n1#2:2009\n*E\n"})
public final class ClockDialNode extends DelegatingNode implements PointerInputModifierNode, CompositionLocalConsumerModifierNode, LayoutAwareModifierNode {

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final SuspendingPointerInputModifierNode pointerInputTapNode;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final SuspendingPointerInputModifierNode pointerInputDragNode;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata */
    private float offsetX;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private int selection;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private boolean autoSwitchToMinute;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata */
    private long center;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private AnalogTimePickerState state;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata */
    private float offsetY;

    public /* synthetic */ ClockDialNode(AnalogTimePickerState analogTimePickerState, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(analogTimePickerState, z2, i2);
    }

    private ClockDialNode(AnalogTimePickerState analogTimePickerState, boolean z2, int i2) {
        this.state = analogTimePickerState;
        this.autoSwitchToMinute = z2;
        this.selection = i2;
        this.center = IntOffset.INSTANCE.rl();
        this.pointerInputTapNode = (SuspendingPointerInputModifierNode) UR(SuspendingPointerInputFilterKt.rl(new ClockDialNode$pointerInputTapNode$1(this, null)));
        this.pointerInputDragNode = (SuspendingPointerInputModifierNode) UR(SuspendingPointerInputFilterKt.rl(new ClockDialNode$pointerInputDragNode$1(this, null)));
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void C(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        this.pointerInputTapNode.C(pointerEvent, pass, bounds);
        this.pointerInputDragNode.C(pointerEvent, pass, bounds);
    }

    public final void eOa(AnalogTimePickerState state, boolean autoSwitchToMinute, int selection) {
        this.state = state;
        this.autoSwitchToMinute = autoSwitchToMinute;
        if (TimePickerSelectionMode.J2(this.selection, selection)) {
            return;
        }
        this.selection = selection;
        C.nr(Xli(), null, null, new ClockDialNode$updateNode$1(state, null), 3, null);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void lNy() {
        this.pointerInputTapNode.lNy();
        this.pointerInputDragNode.lNy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float kC() {
        return DelegatableNodeKt.gh(this).l(TimePickerKt.KN);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void HI(long size) {
        this.center = IntSizeKt.rl(size);
    }
}
