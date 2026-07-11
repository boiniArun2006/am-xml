package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0007\u0010\u0018\"\u0004\b\u0010\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInteropFilter;", "Landroidx/compose/ui/input/pointer/PointerInputModifier;", "<init>", "()V", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", c.f62177j, "Lkotlin/jvm/functions/Function1;", "rl", "()Lkotlin/jvm/functions/Function1;", "O", "(Lkotlin/jvm/functions/Function1;)V", "onTouchEvent", "Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "value", "t", "Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "getRequestDisallowInterceptTouchEvent", "()Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "J2", "(Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;)V", "requestDisallowInterceptTouchEvent", "Z", "()Z", "(Z)V", "disallowIntercept", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "LPV", "()Landroidx/compose/ui/input/pointer/PointerInputFilter;", "pointerInputFilter", "DispatchToViewState", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PointerInteropFilter implements PointerInputModifier {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final PointerInputFilter pointerInputFilter = new PointerInteropFilter$pointerInputFilter$1(this);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean disallowIntercept;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public Function1 onTouchEvent;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class DispatchToViewState {
        private static final /* synthetic */ DispatchToViewState[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f32113r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final DispatchToViewState f32112n = new DispatchToViewState("Unknown", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final DispatchToViewState f32114t = new DispatchToViewState("Dispatching", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final DispatchToViewState f32111O = new DispatchToViewState("NotDispatching", 2);

        private static final /* synthetic */ DispatchToViewState[] n() {
            return new DispatchToViewState[]{f32112n, f32114t, f32111O};
        }

        public static DispatchToViewState valueOf(String str) {
            return (DispatchToViewState) Enum.valueOf(DispatchToViewState.class, str);
        }

        public static DispatchToViewState[] values() {
            return (DispatchToViewState[]) J2.clone();
        }

        static {
            DispatchToViewState[] dispatchToViewStateArrN = n();
            J2 = dispatchToViewStateArrN;
            f32113r = EnumEntriesKt.enumEntries(dispatchToViewStateArrN);
        }

        private DispatchToViewState(String str, int i2) {
        }
    }

    public final void J2(RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent) {
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent2 = this.requestDisallowInterceptTouchEvent;
        if (requestDisallowInterceptTouchEvent2 != null) {
            requestDisallowInterceptTouchEvent2.rl(null);
        }
        this.requestDisallowInterceptTouchEvent = requestDisallowInterceptTouchEvent;
        if (requestDisallowInterceptTouchEvent == null) {
            return;
        }
        requestDisallowInterceptTouchEvent.rl(this);
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputModifier
    /* JADX INFO: renamed from: LPV, reason: from getter */
    public PointerInputFilter getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    public final void O(Function1 function1) {
        this.onTouchEvent = function1;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getDisallowIntercept() {
        return this.disallowIntercept;
    }

    public final Function1 rl() {
        Function1 function1 = this.onTouchEvent;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("onTouchEvent");
        return null;
    }

    public final void t(boolean z2) {
        this.disallowIntercept = z2;
    }
}
