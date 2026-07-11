package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"androidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "", "xMQ", "()V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "KN", "(Landroidx/compose/ui/input/pointer/PointerEvent;)V", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "O", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "nr", "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "rl", "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "state", "", "t", "()Z", "shareWithSiblings", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,339:1\n102#2,2:340\n34#2,6:342\n104#2:348\n87#2,2:349\n34#2,6:351\n89#2:357\n102#2,2:358\n34#2,6:360\n104#2:366\n34#2,6:367\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n*L\n216#1:340,2\n216#1:342,6\n216#1:348\n231#1:349,2\n231#1:351,6\n231#1:357\n269#1:358,2\n269#1:360,6\n269#1:366\n304#1:367,6\n*E\n"})
public final class PointerInteropFilter$pointerInputFilter$1 extends PointerInputFilter {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private PointerInteropFilter.DispatchToViewState state = PointerInteropFilter.DispatchToViewState.f32112n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ PointerInteropFilter f32115t;

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public boolean t() {
        return true;
    }

    PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.f32115t = pointerInteropFilter;
    }

    private final void xMQ() {
        this.state = PointerInteropFilter.DispatchToViewState.f32112n;
        this.f32115t.t(false);
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public void nr() {
        if (this.state == PointerInteropFilter.DispatchToViewState.f32114t) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            final PointerInteropFilter pointerInteropFilter = this.f32115t;
            PointerInteropUtils_androidKt.n(jUptimeMillis, new Function1<MotionEvent, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$onCancel$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                    n(motionEvent);
                    return Unit.INSTANCE;
                }

                public final void n(MotionEvent motionEvent) {
                    pointerInteropFilter.rl().invoke(motionEvent);
                }
            });
            xMQ();
        }
    }

    private final void KN(PointerEvent pointerEvent) {
        List changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((PointerInputChange) changes.get(i2)).ck()) {
                if (this.state == PointerInteropFilter.DispatchToViewState.f32114t) {
                    LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
                    if (layoutCoordinates != null) {
                        long jXg = layoutCoordinates.xg(Offset.INSTANCE.t());
                        final PointerInteropFilter pointerInteropFilter = this.f32115t;
                        PointerInteropUtils_androidKt.rl(pointerEvent, jXg, new Function1<MotionEvent, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$2
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                                n(motionEvent);
                                return Unit.INSTANCE;
                            }

                            public final void n(MotionEvent motionEvent) {
                                pointerInteropFilter.rl().invoke(motionEvent);
                            }
                        });
                    } else {
                        throw new IllegalStateException("layoutCoordinates not set");
                    }
                }
                this.state = PointerInteropFilter.DispatchToViewState.f32111O;
                return;
            }
        }
        LayoutCoordinates layoutCoordinates2 = getLayoutCoordinates();
        if (layoutCoordinates2 != null) {
            long jXg2 = layoutCoordinates2.xg(Offset.INSTANCE.t());
            final PointerInteropFilter pointerInteropFilter2 = this.f32115t;
            PointerInteropUtils_androidKt.t(pointerEvent, jXg2, new Function1<MotionEvent, Unit>() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1$dispatchToView$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                    n(motionEvent);
                    return Unit.INSTANCE;
                }

                public final void n(MotionEvent motionEvent) {
                    PointerInteropFilter.DispatchToViewState dispatchToViewState;
                    if (motionEvent.getActionMasked() == 0) {
                        PointerInteropFilter$pointerInputFilter$1 pointerInteropFilter$pointerInputFilter$1 = this.f32117n;
                        if (((Boolean) pointerInteropFilter2.rl().invoke(motionEvent)).booleanValue()) {
                            dispatchToViewState = PointerInteropFilter.DispatchToViewState.f32114t;
                        } else {
                            dispatchToViewState = PointerInteropFilter.DispatchToViewState.f32111O;
                        }
                        pointerInteropFilter$pointerInputFilter$1.state = dispatchToViewState;
                        return;
                    }
                    pointerInteropFilter2.rl().invoke(motionEvent);
                }
            });
            if (this.state == PointerInteropFilter.DispatchToViewState.f32114t) {
                int size2 = changes.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((PointerInputChange) changes.get(i3)).n();
                }
                InternalPointerEvent internalPointerEvent = pointerEvent.getInternalPointerEvent();
                if (internalPointerEvent != null) {
                    internalPointerEvent.O(!this.f32115t.getDisallowIntercept());
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("layoutCoordinates not set");
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public void O(PointerEvent pointerEvent, PointerEventPass pass, long bounds) {
        boolean z2;
        List changes = pointerEvent.getChanges();
        if (!this.f32115t.getDisallowIntercept()) {
            int size = changes.size();
            for (int i2 = 0; i2 < size; i2++) {
                PointerInputChange pointerInputChange = (PointerInputChange) changes.get(i2);
                if (PointerEventKt.rl(pointerInputChange) || PointerEventKt.nr(pointerInputChange)) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = true;
            break;
        }
        if (this.state != PointerInteropFilter.DispatchToViewState.f32111O) {
            if (pass == PointerEventPass.f32078n && z2) {
                KN(pointerEvent);
            }
            if (pass == PointerEventPass.f32077O && !z2) {
                KN(pointerEvent);
            }
        }
        if (pass == PointerEventPass.f32077O) {
            int size2 = changes.size();
            for (int i3 = 0; i3 < size2; i3++) {
                if (!PointerEventKt.nr((PointerInputChange) changes.get(i3))) {
                    return;
                }
            }
            xMQ();
        }
    }
}
