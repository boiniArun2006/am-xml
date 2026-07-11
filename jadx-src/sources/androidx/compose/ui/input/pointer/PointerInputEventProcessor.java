package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "positionCalculator", "", "isInBounds", "Landroidx/compose/ui/input/pointer/ProcessResult;", "rl", "(Landroidx/compose/ui/input/pointer/PointerInputEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;Z)I", "", "t", "()V", c.f62177j, "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/input/pointer/HitPathTracker;", "Landroidx/compose/ui/input/pointer/HitPathTracker;", "hitPathTracker", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "pointerInputChangeEventProducer", "Landroidx/compose/ui/node/HitTestResult;", "nr", "Landroidx/compose/ui/node/HitTestResult;", "hitResult", "O", "Z", "isProcessing", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PointerInputEventProcessor {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean isProcessing;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LayoutNode root;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final HitPathTracker hitPathTracker;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final PointerInputChangeEventProducer pointerInputChangeEventProducer = new PointerInputChangeEventProducer();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final HitTestResult hitResult = new HitTestResult();

    public final void n() {
        this.hitPathTracker.t();
    }

    public final int rl(PointerInputEvent pointerEvent, PositionCalculator positionCalculator, boolean isInBounds) {
        boolean z2;
        if (this.isProcessing) {
            return PointerInputEventProcessorKt.n(false, false);
        }
        boolean z3 = true;
        try {
            this.isProcessing = true;
            InternalPointerEvent internalPointerEventRl = this.pointerInputChangeEventProducer.rl(pointerEvent, positionCalculator);
            int iTy = internalPointerEventRl.getChanges().ty();
            for (int i2 = 0; i2 < iTy; i2++) {
                PointerInputChange pointerInputChange = (PointerInputChange) internalPointerEventRl.getChanges().HI(i2);
                if (!pointerInputChange.getPressed() && !pointerInputChange.getPreviousPressed()) {
                }
                z2 = false;
                break;
            }
            z2 = true;
            int iTy2 = internalPointerEventRl.getChanges().ty();
            for (int i3 = 0; i3 < iTy2; i3++) {
                PointerInputChange pointerInputChange2 = (PointerInputChange) internalPointerEventRl.getChanges().HI(i3);
                if (z2 || PointerEventKt.rl(pointerInputChange2)) {
                    LayoutNode.i(this.root, pointerInputChange2.getPosition(), this.hitResult, pointerInputChange2.getType(), false, 8, null);
                    if (!this.hitResult.isEmpty()) {
                        this.hitPathTracker.rl(pointerInputChange2.getId(), this.hitResult, PointerEventKt.rl(pointerInputChange2));
                        this.hitResult.clear();
                    }
                }
            }
            boolean zNr = this.hitPathTracker.nr(internalPointerEventRl, isInBounds);
            if (internalPointerEventRl.getSuppressMovementConsumption()) {
                z3 = false;
            } else {
                int iTy3 = internalPointerEventRl.getChanges().ty();
                for (int i5 = 0; i5 < iTy3; i5++) {
                    PointerInputChange pointerInputChange3 = (PointerInputChange) internalPointerEventRl.getChanges().HI(i5);
                    if (PointerEventKt.gh(pointerInputChange3) && pointerInputChange3.ck()) {
                        break;
                    }
                }
                z3 = false;
            }
            int iN = PointerInputEventProcessorKt.n(zNr, z3);
            this.isProcessing = false;
            return iN;
        } catch (Throwable th) {
            this.isProcessing = false;
            throw th;
        }
    }

    public final void t() {
        if (this.isProcessing) {
            return;
        }
        this.pointerInputChangeEventProducer.n();
        this.hitPathTracker.O();
    }

    public PointerInputEventProcessor(LayoutNode layoutNode) {
        this.root = layoutNode;
        this.hitPathTracker = new HitPathTracker(layoutNode.r());
    }
}
