package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Stable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 #2\u00020\u0001:\u00012BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0015\u0010\u0012J\"\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\rH\u0080@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\rH\u0080@¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR(\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010*\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\u0016\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0011\u0010-\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b,\u0010\u001eR\u0011\u0010/\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b.\u0010\u001eR\u0011\u00101\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b0\u0010\u001e¨\u00063"}, d2 = {"Landroidx/compose/material3/SheetState;", "", "", "skipPartiallyExpanded", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/material3/SheetValue;", "initialValue", "Lkotlin/Function1;", "confirmValueChange", "skipHiddenState", "<init>", "(ZLandroidx/compose/ui/unit/Density;Landroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;Z)V", "", "ty", "()F", "", "t", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "az", "ck", "gh", "targetValue", "velocity", c.f62177j, "(Landroidx/compose/material3/SheetValue;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "HI", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Z", "xMQ", "()Z", "rl", "KN", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "nr", "()Landroidx/compose/material3/internal/AnchoredDraggableState;", "setAnchoredDraggableState$material3_release", "(Landroidx/compose/material3/internal/AnchoredDraggableState;)V", "anchoredDraggableState", "O", "()Landroidx/compose/material3/SheetValue;", "currentValue", "mUb", "qie", "isVisible", "J2", "hasExpandedState", "Uo", "hasPartiallyExpandedState", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SheetState {

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean skipPartiallyExpanded;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final boolean skipHiddenState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private AnchoredDraggableState anchoredDraggableState;

    /* JADX INFO: renamed from: androidx.compose.material3.SheetState$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/SheetValue;", "it", "", c.f62177j, "(Landroidx/compose/material3/SheetValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    final class AnonymousClass1 extends Lambda implements Function1<SheetValue, Boolean> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final AnonymousClass1 f27536n = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SheetValue sheetValue) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/SheetState$Companion;", "", "<init>", "()V", "", "skipPartiallyExpanded", "Lkotlin/Function1;", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "Landroidx/compose/ui/unit/Density;", "density", "skipHiddenState", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/SheetState;", c.f62177j, "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/unit/Density;Z)Landroidx/compose/runtime/saveable/Saver;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver n(final boolean skipPartiallyExpanded, final Function1 confirmValueChange, final Density density, final boolean skipHiddenState) {
            return SaverKt.n(new Function2<SaverScope, SheetState, SheetValue>() { // from class: androidx.compose.material3.SheetState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final SheetValue invoke(SaverScope saverScope, SheetState sheetState) {
                    return sheetState.O();
                }
            }, new Function1<SheetValue, SheetState>() { // from class: androidx.compose.material3.SheetState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final SheetState invoke(SheetValue sheetValue) {
                    return new SheetState(skipPartiallyExpanded, density, sheetValue, confirmValueChange, skipHiddenState);
                }
            });
        }
    }

    public static /* synthetic */ Object rl(SheetState sheetState, SheetValue sheetValue, float f3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = sheetState.anchoredDraggableState.S();
        }
        return sheetState.n(sheetValue, f3, continuation);
    }

    public final Object HI(float f3, Continuation continuation) throws Throwable {
        Object objX = this.anchoredDraggableState.X(f3, continuation);
        return objX == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objX : Unit.INSTANCE;
    }

    public final boolean J2() {
        return this.anchoredDraggableState.HI().nr(SheetValue.Expanded);
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final boolean getSkipHiddenState() {
        return this.skipHiddenState;
    }

    public final SheetValue O() {
        return (SheetValue) this.anchoredDraggableState.o();
    }

    public final boolean Uo() {
        return this.anchoredDraggableState.HI().nr(SheetValue.PartiallyExpanded);
    }

    public final Object az(Continuation continuation) {
        if (this.skipPartiallyExpanded) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        Object objRl = rl(this, SheetValue.PartiallyExpanded, 0.0f, continuation, 2, null);
        return objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRl : Unit.INSTANCE;
    }

    public final Object gh(Continuation continuation) {
        if (this.skipHiddenState) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        Object objRl = rl(this, SheetValue.Hidden, 0.0f, continuation, 2, null);
        return objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRl : Unit.INSTANCE;
    }

    public final SheetValue mUb() {
        return (SheetValue) this.anchoredDraggableState.aYN();
    }

    public final Object n(SheetValue sheetValue, float f3, Continuation continuation) throws Throwable {
        Object objJ2 = AnchoredDraggableKt.J2(this.anchoredDraggableState, sheetValue, f3, continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final AnchoredDraggableState getAnchoredDraggableState() {
        return this.anchoredDraggableState;
    }

    public final boolean qie() {
        return this.anchoredDraggableState.o() != SheetValue.Hidden;
    }

    public final Object t(Continuation continuation) {
        Object objUo = AnchoredDraggableKt.Uo(this.anchoredDraggableState, SheetValue.Expanded, 0.0f, continuation, 2, null);
        return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : Unit.INSTANCE;
    }

    public final float ty() {
        return this.anchoredDraggableState.g();
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final boolean getSkipPartiallyExpanded() {
        return this.skipPartiallyExpanded;
    }

    public SheetState(boolean z2, final Density density, SheetValue sheetValue, Function1 function1, boolean z3) {
        this.skipPartiallyExpanded = z2;
        this.skipHiddenState = z3;
        if (z2 && sheetValue == SheetValue.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if (!z3 || sheetValue != SheetValue.Hidden) {
            this.anchoredDraggableState = new AnchoredDraggableState(sheetValue, new Function1<Float, Float>() { // from class: androidx.compose.material3.SheetState$anchoredDraggableState$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Float invoke(Float f3) {
                    return n(f3.floatValue());
                }

                public final Float n(float f3) {
                    return Float.valueOf(density.l(Dp.KN(56)));
                }
            }, new Function0<Float>() { // from class: androidx.compose.material3.SheetState$anchoredDraggableState$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Float invoke() {
                    return Float.valueOf(density.l(Dp.KN(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE)));
                }
            }, SheetDefaultsKt.rl, function1);
            return;
        }
        throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
    }

    public final Object ck(Continuation continuation) {
        SheetValue sheetValue;
        if (Uo()) {
            sheetValue = SheetValue.PartiallyExpanded;
        } else {
            sheetValue = SheetValue.Expanded;
        }
        Object objRl = rl(this, sheetValue, 0.0f, continuation, 2, null);
        if (objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objRl;
        }
        return Unit.INSTANCE;
    }
}
