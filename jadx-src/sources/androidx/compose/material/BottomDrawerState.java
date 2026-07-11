package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
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
@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001(B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\"\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0011\u0010'\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Landroidx/compose/material/BottomDrawerState;", "", "Landroidx/compose/material/BottomDrawerValue;", "initialValue", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "<init>", "(Landroidx/compose/material/BottomDrawerValue;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;)V", "KN", "()F", "", c.f62177j, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "rl", "(Landroidx/compose/material/BottomDrawerValue;)Z", "Landroidx/compose/material/AnchoredDraggableState;", "Landroidx/compose/material/AnchoredDraggableState;", "t", "()Landroidx/compose/material/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "O", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "nestedScrollConnection", "J2", "()Landroidx/compose/material/BottomDrawerValue;", "targetValue", "nr", "currentValue", "Uo", "()Z", "isOpen", "Companion", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BottomDrawerState {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AnchoredDraggableState anchoredDraggableState;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final NestedScrollConnection nestedScrollConnection;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int nr = 8;

    /* JADX INFO: renamed from: androidx.compose.material.BottomDrawerState$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material/BottomDrawerValue;", "it", "", c.f62177j, "(Landroidx/compose/material/BottomDrawerValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    final class AnonymousClass1 extends Lambda implements Function1<BottomDrawerValue, Boolean> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final AnonymousClass1 f21418n = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(BottomDrawerValue bottomDrawerValue) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/material/BottomDrawerState$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function1;", "Landroidx/compose/material/BottomDrawerValue;", "", "confirmStateChange", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/BottomDrawerState;", c.f62177j, "(Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;)Landroidx/compose/runtime/saveable/Saver;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver n(final Density density, final Function1 confirmStateChange, final AnimationSpec animationSpec) {
            return SaverKt.n(new Function2<SaverScope, BottomDrawerState, BottomDrawerValue>() { // from class: androidx.compose.material.BottomDrawerState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final BottomDrawerValue invoke(SaverScope saverScope, BottomDrawerState bottomDrawerState) {
                    return (BottomDrawerValue) bottomDrawerState.getAnchoredDraggableState().o();
                }
            }, new Function1<BottomDrawerValue, BottomDrawerState>() { // from class: androidx.compose.material.BottomDrawerState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final BottomDrawerState invoke(BottomDrawerValue bottomDrawerValue) {
                    return new BottomDrawerState(bottomDrawerValue, density, confirmStateChange, animationSpec);
                }
            });
        }
    }

    public final BottomDrawerValue J2() {
        return (BottomDrawerValue) this.anchoredDraggableState.aYN();
    }

    public final float KN() {
        return this.anchoredDraggableState.g();
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    public final boolean Uo() {
        return this.anchoredDraggableState.o() != BottomDrawerValue.f21426n;
    }

    public final Object n(Continuation continuation) {
        Object objUo = AnchoredDraggableKt.Uo(this.anchoredDraggableState, BottomDrawerValue.f21426n, 0.0f, continuation, 2, null);
        return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : Unit.INSTANCE;
    }

    public final BottomDrawerValue nr() {
        return (BottomDrawerValue) this.anchoredDraggableState.o();
    }

    public final boolean rl(BottomDrawerValue value) {
        return ((Boolean) this.anchoredDraggableState.getConfirmValueChange().invoke(value)).booleanValue();
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final AnchoredDraggableState getAnchoredDraggableState() {
        return this.anchoredDraggableState;
    }

    public BottomDrawerState(BottomDrawerValue bottomDrawerValue, final Density density, Function1 function1, AnimationSpec animationSpec) {
        AnchoredDraggableState anchoredDraggableState = new AnchoredDraggableState(bottomDrawerValue, new Function1<Float, Float>() { // from class: androidx.compose.material.BottomDrawerState$anchoredDraggableState$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f3) {
                return n(f3.floatValue());
            }

            public final Float n(float f3) {
                return Float.valueOf(density.l(DrawerKt.rl));
            }
        }, new Function0<Float>() { // from class: androidx.compose.material.BottomDrawerState$anchoredDraggableState$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(density.l(DrawerKt.f21852t));
            }
        }, animationSpec, function1);
        this.anchoredDraggableState = anchoredDraggableState;
        this.nestedScrollConnection = DrawerKt.nr(anchoredDraggableState);
    }
}
