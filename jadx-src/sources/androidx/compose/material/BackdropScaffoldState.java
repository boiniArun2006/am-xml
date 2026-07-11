package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Stable;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Stable
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u00013BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0013R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR$\u0010%\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010$R\u001a\u0010*\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u0011\u0010-\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u00100\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00102\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010/¨\u00064"}, d2 = {"Landroidx/compose/material/BackdropScaffoldState;", "", "Landroidx/compose/material/BackdropValue;", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "<init>", "(Landroidx/compose/material/BackdropValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;)V", "Landroidx/compose/ui/unit/Density;", "mUb", "()Landroidx/compose/ui/unit/Density;", "", "gh", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rl", c.f62177j, "Lkotlin/jvm/functions/Function1;", "nr", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/material/SnackbarHostState;", "J2", "()Landroidx/compose/material/SnackbarHostState;", "Landroidx/compose/material/AnchoredDraggableState;", "t", "Landroidx/compose/material/AnchoredDraggableState;", "()Landroidx/compose/material/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/ui/unit/Density;", "getDensity$material_release", "qie", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "O", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "nestedScrollConnection", "Uo", "()Landroidx/compose/material/BackdropValue;", "targetValue", "xMQ", "()Z", "isRevealed", "KN", "isConcealed", "Companion", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BackdropScaffoldState {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final NestedScrollConnection nestedScrollConnection;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Function1 confirmValueChange;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Density density;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final SnackbarHostState snackbarHostState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final AnchoredDraggableState anchoredDraggableState;

    /* JADX INFO: renamed from: androidx.compose.material.BackdropScaffoldState$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material/BackdropValue;", "it", "", c.f62177j, "(Landroidx/compose/material/BackdropValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    final class AnonymousClass1 extends Lambda implements Function1<BackdropValue, Boolean> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final AnonymousClass1 f21385n = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(BackdropValue backdropValue) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\u0010\u0012\u0002\b\u00030\u000f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/BackdropScaffoldState$Companion;", "", "<init>", "()V", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "Landroidx/compose/material/BackdropValue;", "", "confirmStateChange", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/BackdropScaffoldState;", c.f62177j, "(Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/ui/unit/Density;)Landroidx/compose/runtime/saveable/Saver;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver n(final AnimationSpec animationSpec, final Function1 confirmStateChange, final SnackbarHostState snackbarHostState, final Density density) {
            return SaverKt.n(new Function2<SaverScope, BackdropScaffoldState, BackdropValue>() { // from class: androidx.compose.material.BackdropScaffoldState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final BackdropValue invoke(SaverScope saverScope, BackdropScaffoldState backdropScaffoldState) {
                    return (BackdropValue) backdropScaffoldState.getAnchoredDraggableState().o();
                }
            }, new Function1<BackdropValue, BackdropScaffoldState>() { // from class: androidx.compose.material.BackdropScaffoldState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final BackdropScaffoldState invoke(BackdropValue backdropValue) {
                    return BackdropScaffoldKt.nr(backdropValue, density, animationSpec, confirmStateChange, snackbarHostState);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Density mUb() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on BackdropScaffoldState (" + this + ") was not set. Did you use BackdropScaffoldState with the BackdropScaffold composable?").toString());
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }

    public final boolean KN() {
        return this.anchoredDraggableState.o() == BackdropValue.f21393n;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final NestedScrollConnection getNestedScrollConnection() {
        return this.nestedScrollConnection;
    }

    public final BackdropValue Uo() {
        return (BackdropValue) this.anchoredDraggableState.aYN();
    }

    public final Object gh(Continuation continuation) {
        Object objUo = AnchoredDraggableKt.Uo(this.anchoredDraggableState, BackdropValue.f21394t, 0.0f, continuation, 2, null);
        return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final Function1 getConfirmValueChange() {
        return this.confirmValueChange;
    }

    public final void qie(Density density) {
        this.density = density;
    }

    public final Object rl(Continuation continuation) {
        Object objUo = AnchoredDraggableKt.Uo(this.anchoredDraggableState, BackdropValue.f21393n, 0.0f, continuation, 2, null);
        return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final AnchoredDraggableState getAnchoredDraggableState() {
        return this.anchoredDraggableState;
    }

    public final boolean xMQ() {
        return this.anchoredDraggableState.o() == BackdropValue.f21394t;
    }

    public BackdropScaffoldState(BackdropValue backdropValue, AnimationSpec animationSpec, Function1 function1, SnackbarHostState snackbarHostState) {
        this.confirmValueChange = function1;
        this.snackbarHostState = snackbarHostState;
        AnchoredDraggableState anchoredDraggableState = new AnchoredDraggableState(backdropValue, new Function1<Float, Float>() { // from class: androidx.compose.material.BackdropScaffoldState$anchoredDraggableState$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f3) {
                return n(f3.floatValue());
            }

            public final Float n(float f3) {
                return Float.valueOf(this.f21390n.mUb().l(BackdropScaffoldKt.f21260t));
            }
        }, new Function0<Float>() { // from class: androidx.compose.material.BackdropScaffoldState$anchoredDraggableState$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(this.f21391n.mUb().l(BackdropScaffoldKt.rl));
            }
        }, animationSpec, function1);
        this.anchoredDraggableState = anchoredDraggableState;
        this.nestedScrollConnection = BackdropScaffoldKt.J2(anchoredDraggableState, Orientation.f16969n);
    }
}
