package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001.BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b\u0014\u0010\u0011J\"\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\nH\u0080@¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010#R\u0011\u0010'\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010)\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0011\u0010+\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b*\u0010\u001fR\u0014\u0010-\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001f¨\u0006/"}, d2 = {"Landroidx/compose/material/ModalBottomSheetState;", "", "Landroidx/compose/material/ModalBottomSheetValue;", "initialValue", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/Function1;", "", "confirmValueChange", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "isSkipHalfExpanded", "<init>", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/AnimationSpec;Z)V", "", "qie", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "KN", "xMQ", "t", "target", "velocity", c.f62177j, "(Landroidx/compose/material/ModalBottomSheetValue;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec$material_release", "()Landroidx/compose/animation/core/AnimationSpec;", "rl", "Z", "mUb", "()Z", "Landroidx/compose/material/AnchoredDraggableState;", "Landroidx/compose/material/AnchoredDraggableState;", "nr", "()Landroidx/compose/material/AnchoredDraggableState;", "anchoredDraggableState", "O", "()Landroidx/compose/material/ModalBottomSheetValue;", "currentValue", "Uo", "targetValue", "gh", "isVisible", "J2", "hasHalfExpandedState", "Companion", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ModalBottomSheetState {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AnimationSpec animationSpec;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final boolean isSkipHalfExpanded;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final AnchoredDraggableState anchoredDraggableState;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f22280O = 8;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u000f\u0012\u0002\b\u00030\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/material/ModalBottomSheetState$Companion;", "", "<init>", "()V", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "Landroidx/compose/material/ModalBottomSheetValue;", "", "confirmValueChange", "skipHalfExpanded", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/ModalBottomSheetState;", c.f62177j, "(Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/unit/Density;)Landroidx/compose/runtime/saveable/Saver;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver n(final AnimationSpec animationSpec, final Function1 confirmValueChange, final boolean skipHalfExpanded, final Density density) {
            return SaverKt.n(new Function2<SaverScope, ModalBottomSheetState, ModalBottomSheetValue>() { // from class: androidx.compose.material.ModalBottomSheetState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final ModalBottomSheetValue invoke(SaverScope saverScope, ModalBottomSheetState modalBottomSheetState) {
                    return modalBottomSheetState.O();
                }
            }, new Function1<ModalBottomSheetValue, ModalBottomSheetState>() { // from class: androidx.compose.material.ModalBottomSheetState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final ModalBottomSheetState invoke(ModalBottomSheetValue modalBottomSheetValue) {
                    return new ModalBottomSheetState(modalBottomSheetValue, density, confirmValueChange, animationSpec, skipHalfExpanded);
                }
            });
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModalBottomSheetValue.values().length];
            try {
                iArr[ModalBottomSheetValue.f22291n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, final Density density, Function1 function1, AnimationSpec animationSpec, boolean z2) {
        this.animationSpec = animationSpec;
        this.isSkipHalfExpanded = z2;
        this.anchoredDraggableState = new AnchoredDraggableState(modalBottomSheetValue, new Function1<Float, Float>() { // from class: androidx.compose.material.ModalBottomSheetState$anchoredDraggableState$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f3) {
                return n(f3.floatValue());
            }

            public final Float n(float f3) {
                return Float.valueOf(density.l(ModalBottomSheetKt.f22220n));
            }
        }, new Function0<Float>() { // from class: androidx.compose.material.ModalBottomSheetState$anchoredDraggableState$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(density.l(ModalBottomSheetKt.rl));
            }
        }, animationSpec, function1);
        if (z2 && modalBottomSheetValue == ModalBottomSheetValue.f22290O) {
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.");
        }
    }

    public static /* synthetic */ Object rl(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = modalBottomSheetState.anchoredDraggableState.S();
        }
        return modalBottomSheetState.n(modalBottomSheetValue, f3, continuation);
    }

    public final boolean J2() {
        return this.anchoredDraggableState.HI().nr(ModalBottomSheetValue.f22290O);
    }

    public final ModalBottomSheetValue O() {
        return (ModalBottomSheetValue) this.anchoredDraggableState.o();
    }

    public final ModalBottomSheetValue Uo() {
        return (ModalBottomSheetValue) this.anchoredDraggableState.aYN();
    }

    public final boolean gh() {
        return this.anchoredDraggableState.o() != ModalBottomSheetValue.f22291n;
    }

    /* JADX INFO: renamed from: mUb, reason: from getter */
    public final boolean getIsSkipHalfExpanded() {
        return this.isSkipHalfExpanded;
    }

    public final Object n(ModalBottomSheetValue modalBottomSheetValue, float f3, Continuation continuation) throws Throwable {
        Object objJ2 = AnchoredDraggableKt.J2(this.anchoredDraggableState, modalBottomSheetValue, f3, continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final AnchoredDraggableState getAnchoredDraggableState() {
        return this.anchoredDraggableState;
    }

    public final Object qie(Continuation continuation) {
        DraggableAnchors draggableAnchorsHI = this.anchoredDraggableState.HI();
        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.f22293t;
        boolean zNr = draggableAnchorsHI.nr(modalBottomSheetValue);
        if (WhenMappings.$EnumSwitchMapping$0[O().ordinal()] == 1) {
            if (J2()) {
                modalBottomSheetValue = ModalBottomSheetValue.f22290O;
            }
        } else if (!zNr) {
            modalBottomSheetValue = ModalBottomSheetValue.f22291n;
        }
        Object objRl = rl(this, modalBottomSheetValue, 0.0f, continuation, 2, null);
        return objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRl : Unit.INSTANCE;
    }

    public final Object t(Continuation continuation) {
        DraggableAnchors draggableAnchorsHI = this.anchoredDraggableState.HI();
        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.f22293t;
        if (!draggableAnchorsHI.nr(modalBottomSheetValue)) {
            return Unit.INSTANCE;
        }
        Object objRl = rl(this, modalBottomSheetValue, 0.0f, continuation, 2, null);
        return objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRl : Unit.INSTANCE;
    }

    public final Object xMQ(Continuation continuation) {
        Object objRl = rl(this, ModalBottomSheetValue.f22291n, 0.0f, continuation, 2, null);
        return objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRl : Unit.INSTANCE;
    }

    public final Object KN(Continuation continuation) {
        if (!J2()) {
            return Unit.INSTANCE;
        }
        Object objRl = rl(this, ModalBottomSheetValue.f22290O, 0.0f, continuation, 2, null);
        if (objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objRl;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, Density density, Function1 function1, AnimationSpec animationSpec, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(modalBottomSheetValue, density, (i2 & 4) != 0 ? new Function1<ModalBottomSheetValue, Boolean>() { // from class: androidx.compose.material.ModalBottomSheetState.1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(ModalBottomSheetValue modalBottomSheetValue2) {
                return Boolean.TRUE;
            }
        } : function1, (i2 & 8) != 0 ? ModalBottomSheetDefaults.f22218n.n() : animationSpec, (i2 & 16) != 0 ? false : z2);
    }
}
