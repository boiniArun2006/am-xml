package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "", "selectableId", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/Modifier;", "rl", "(Landroidx/compose/foundation/text/selection/SelectionRegistrar;JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SelectionControllerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier rl(final SelectionRegistrar selectionRegistrar, final long j2, final Function0 function0) {
        TextDragObserver textDragObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            private long lastPosition;

            /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
            private long dragTotalDistance;

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void n(long point) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void t() {
            }

            {
                Offset.Companion companion = Offset.INSTANCE;
                this.lastPosition = companion.t();
                this.dragTotalDistance = companion.t();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void nr(long delta) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) function0.invoke();
                if (layoutCoordinates != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j3 = j2;
                    if (layoutCoordinates.nr() && SelectionRegistrarKt.rl(selectionRegistrar2, j3)) {
                        long jIk = Offset.Ik(this.dragTotalDistance, delta);
                        this.dragTotalDistance = jIk;
                        long jIk2 = Offset.Ik(this.lastPosition, jIk);
                        if (selectionRegistrar2.J2(layoutCoordinates, jIk2, this.lastPosition, false, SelectionAdjustment.INSTANCE.HI(), true)) {
                            this.lastPosition = jIk2;
                            this.dragTotalDistance = Offset.INSTANCE.t();
                        }
                    }
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                if (SelectionRegistrarKt.rl(selectionRegistrar, j2)) {
                    selectionRegistrar.Uo();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                if (SelectionRegistrarKt.rl(selectionRegistrar, j2)) {
                    selectionRegistrar.Uo();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void rl(long startPoint) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) function0.invoke();
                if (layoutCoordinates != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    if (!layoutCoordinates.nr()) {
                        return;
                    }
                    selectionRegistrar2.xMQ(layoutCoordinates, startPoint, SelectionAdjustment.INSTANCE.HI(), true);
                    this.lastPosition = startPoint;
                }
                if (SelectionRegistrarKt.rl(selectionRegistrar, j2)) {
                    this.dragTotalDistance = Offset.INSTANCE.t();
                }
            }
        };
        return SelectionGesturesKt.az(Modifier.INSTANCE, new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            private long lastPosition = Offset.INSTANCE.t();

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public boolean O(long downPosition) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) function0.invoke();
                if (layoutCoordinates == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j3 = j2;
                if (!layoutCoordinates.nr()) {
                    return false;
                }
                if (selectionRegistrar2.J2(layoutCoordinates, downPosition, this.lastPosition, false, SelectionAdjustment.INSTANCE.az(), false)) {
                    this.lastPosition = downPosition;
                }
                return SelectionRegistrarKt.rl(selectionRegistrar2, j3);
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void n() {
                selectionRegistrar.Uo();
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public boolean nr(long dragPosition, SelectionAdjustment adjustment) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) function0.invoke();
                if (layoutCoordinates == null) {
                    return true;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j3 = j2;
                if (!layoutCoordinates.nr() || !SelectionRegistrarKt.rl(selectionRegistrar2, j3)) {
                    return false;
                }
                if (!selectionRegistrar2.J2(layoutCoordinates, dragPosition, this.lastPosition, false, adjustment, false)) {
                    return true;
                }
                this.lastPosition = dragPosition;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public boolean rl(long dragPosition) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) function0.invoke();
                if (layoutCoordinates == null) {
                    return true;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j3 = j2;
                if (!layoutCoordinates.nr() || !SelectionRegistrarKt.rl(selectionRegistrar2, j3)) {
                    return false;
                }
                if (!selectionRegistrar2.J2(layoutCoordinates, dragPosition, this.lastPosition, false, SelectionAdjustment.INSTANCE.az(), false)) {
                    return true;
                }
                this.lastPosition = dragPosition;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public boolean t(long downPosition, SelectionAdjustment adjustment) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) function0.invoke();
                if (layoutCoordinates == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j3 = j2;
                if (!layoutCoordinates.nr()) {
                    return false;
                }
                selectionRegistrar2.xMQ(layoutCoordinates, downPosition, adjustment, false);
                this.lastPosition = downPosition;
                return SelectionRegistrarKt.rl(selectionRegistrar2, j3);
            }
        }, textDragObserver);
    }
}
