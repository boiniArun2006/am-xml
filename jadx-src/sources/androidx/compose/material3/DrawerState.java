package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Stable
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u00016B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR&\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R/\u0010+\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\t8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u000b\"\u0004\b)\u0010*R\u0011\u0010.\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u00100\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0011\u00103\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00105\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b4\u0010\u0017¨\u00067"}, d2 = {"Landroidx/compose/material3/DrawerState;", "", "Landroidx/compose/material3/DrawerValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "<init>", "(Landroidx/compose/material3/DrawerValue;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/unit/Density;", "gh", "()Landroidx/compose/ui/unit/Density;", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "velocity", "", "rl", "(Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nr", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "qie", "()F", "Landroidx/compose/material3/internal/AnchoredDraggableState;", c.f62177j, "Landroidx/compose/material3/internal/AnchoredDraggableState;", "O", "()Landroidx/compose/material3/internal/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", "getOffset$annotations", "()V", "offset", "<set-?>", "t", "Landroidx/compose/runtime/MutableState;", "KN", "az", "(Landroidx/compose/ui/unit/Density;)V", "density", "mUb", "()Z", "isOpen", "xMQ", "isClosed", "Uo", "()Landroidx/compose/material3/DrawerValue;", "currentValue", "J2", "currentOffset", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1167:1\n81#2:1168\n107#2,2:1169\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/DrawerState\n*L\n235#1:1168\n235#1:1169,2\n*E\n"})
public final class DrawerState {

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AnchoredDraggableState anchoredDraggableState;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final State offset = new State<Float>() { // from class: androidx.compose.material3.DrawerState$offset$1
        @Override // androidx.compose.runtime.State
        public Float getValue() {
            return Float.valueOf(this.f25706n.getAnchoredDraggableState().WPU());
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableState density = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);

    /* JADX INFO: renamed from: androidx.compose.material3.DrawerState$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/DrawerValue;", "it", "", c.f62177j, "(Landroidx/compose/material3/DrawerValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    final class AnonymousClass1 extends Lambda implements Function1<DrawerValue, Boolean> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final AnonymousClass1 f25693n = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(DrawerValue drawerValue) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/material3/DrawerState$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/material3/DrawerValue;", "", "confirmStateChange", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DrawerState;", c.f62177j, "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver n(final Function1 confirmStateChange) {
            return SaverKt.n(new Function2<SaverScope, DrawerState, DrawerValue>() { // from class: androidx.compose.material3.DrawerState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final DrawerValue invoke(SaverScope saverScope, DrawerState drawerState) {
                    return drawerState.Uo();
                }
            }, new Function1<DrawerValue, DrawerState>() { // from class: androidx.compose.material3.DrawerState$Companion$Saver$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final DrawerState invoke(DrawerValue drawerValue) {
                    return new DrawerState(drawerValue, confirmStateChange);
                }
            });
        }
    }

    private final Object rl(DrawerValue drawerValue, AnimationSpec animationSpec, float f3, Continuation continuation) throws Throwable {
        Object objGh = AnchoredDraggableState.gh(this.anchoredDraggableState, drawerValue, null, new DrawerState$animateTo$3(this, f3, animationSpec, null), continuation, 2, null);
        return objGh == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objGh : Unit.INSTANCE;
    }

    static /* synthetic */ Object t(DrawerState drawerState, DrawerValue drawerValue, AnimationSpec animationSpec, float f3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = NavigationDrawerKt.nr;
        }
        if ((i2 & 4) != 0) {
            f3 = drawerState.anchoredDraggableState.S();
        }
        return drawerState.rl(drawerValue, animationSpec, f3, continuation);
    }

    public final float J2() {
        return this.anchoredDraggableState.WPU();
    }

    public final Density KN() {
        return (Density) this.density.getValue();
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final AnchoredDraggableState getAnchoredDraggableState() {
        return this.anchoredDraggableState;
    }

    public final DrawerValue Uo() {
        return (DrawerValue) this.anchoredDraggableState.o();
    }

    public final void az(Density density) {
        this.density.setValue(density);
    }

    public final Object nr(Continuation continuation) {
        Object objT = t(this, DrawerValue.Closed, null, 0.0f, continuation, 6, null);
        return objT == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : Unit.INSTANCE;
    }

    public final float qie() {
        return this.anchoredDraggableState.g();
    }

    public DrawerState(DrawerValue drawerValue, Function1 function1) {
        this.anchoredDraggableState = new AnchoredDraggableState(drawerValue, new Function1<Float, Float>() { // from class: androidx.compose.material3.DrawerState$anchoredDraggableState$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f3) {
                return n(f3.floatValue());
            }

            public final Float n(float f3) {
                return Float.valueOf(f3 * NavigationDrawerKt.f26480n);
            }
        }, new Function0<Float>() { // from class: androidx.compose.material3.DrawerState$anchoredDraggableState$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(this.f25697n.gh().l(NavigationDrawerKt.rl));
            }
        }, NavigationDrawerKt.nr, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Density gh() {
        Density densityKN = KN();
        if (densityKN != null) {
            return densityKN;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the ModalNavigationDrawer or DismissibleNavigationDrawer composables?").toString());
    }

    public final boolean mUb() {
        if (Uo() == DrawerValue.Open) {
            return true;
        }
        return false;
    }

    public final boolean xMQ() {
        if (Uo() == DrawerValue.Closed) {
            return true;
        }
        return false;
    }
}
