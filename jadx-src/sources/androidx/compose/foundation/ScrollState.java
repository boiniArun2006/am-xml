package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Stable
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001@B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b¢\u0006\u0002\b\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bR+\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0005R+\u0010$\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\"\u0010 \"\u0004\b#\u0010\u0005R\u001a\u0010*\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001eR\u0016\u0010/\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010.R\u0014\u00102\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001b\u00107\u001a\u0002038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b0\u00106R\u001b\u00109\u001a\u0002038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b,\u00106R$\u0010=\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u00028F@@X\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010 \"\u0004\b<\u0010\u0005R\u0014\u0010>\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u00106¨\u0006A"}, d2 = {"Landroidx/compose/foundation/ScrollState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "initial", "<init>", "(I)V", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "O", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", "rl", "(F)F", "value", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "gh", "(ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "HI", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<set-?>", c.f62177j, "Landroidx/compose/runtime/MutableIntState;", "ty", "()I", "Ik", "getViewportSize", "r", "viewportSize", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "t", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "qie", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "Landroidx/compose/runtime/MutableIntState;", "nr", "_maxValueState", "F", "accumulator", "J2", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollableState", "", "Uo", "Landroidx/compose/runtime/State;", "()Z", "canScrollForward", "KN", "canScrollBackward", "newMax", "az", "ck", "maxValue", "isScrollInProgress", "xMQ", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollState\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,485:1\n78#2:486\n107#2,2:487\n78#2:497\n107#2,2:498\n602#3,8:489\n85#4:500\n85#4:501\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollState\n*L\n90#1:486\n90#1:487,2\n109#1:497\n109#1:498,2\n98#1:489,8\n153#1:500\n155#1:501\n*E\n"})
public final class ScrollState implements ScrollableState {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private float accumulator;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableIntState value;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver mUb = SaverKt.n(new Function2<SaverScope, ScrollState, Integer>() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(SaverScope saverScope, ScrollState scrollState) {
            return Integer.valueOf(scrollState.ty());
        }
    }, new Function1<Integer, ScrollState>() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ ScrollState invoke(Integer num) {
            return n(num.intValue());
        }

        public final ScrollState n(int i2) {
            return new ScrollState(i2);
        }
    });

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableIntState viewportSize = SnapshotIntStateKt.n(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableInteractionSource internalInteractionSource = InteractionSourceKt.n();

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private MutableIntState _maxValueState = SnapshotIntStateKt.n(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final ScrollableState scrollableState = ScrollableStateKt.n(new Function1<Float, Float>() { // from class: androidx.compose.foundation.ScrollState$scrollableState$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f3) {
            return n(f3.floatValue());
        }

        public final Float n(float f3) {
            float fTy = this.f16284n.ty() + f3 + this.f16284n.accumulator;
            float fCoerceIn = RangesKt.coerceIn(fTy, 0.0f, this.f16284n.az());
            boolean z2 = fTy == fCoerceIn;
            float fTy2 = fCoerceIn - this.f16284n.ty();
            int iRound = Math.round(fTy2);
            ScrollState scrollState = this.f16284n;
            scrollState.Ik(scrollState.ty() + iRound);
            this.f16284n.accumulator = fTy2 - iRound;
            if (!z2) {
                f3 = fTy2;
            }
            return Float.valueOf(f3);
        }
    });

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final State canScrollForward = SnapshotStateKt.O(new Function0<Boolean>() { // from class: androidx.compose.foundation.ScrollState$canScrollForward$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f16283n.ty() < this.f16283n.az());
        }
    });

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final State canScrollBackward = SnapshotStateKt.O(new Function0<Boolean>() { // from class: androidx.compose.foundation.ScrollState$canScrollBackward$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f16282n.ty() > 0);
        }
    });

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/ScrollState$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/ScrollState;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", c.f62177j, "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver n() {
            return ScrollState.mUb;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ik(int i2) {
        this.value.KN(i2);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean J2() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object O(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object objO = this.scrollableState.O(mutatePriority, function2, continuation);
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : Unit.INSTANCE;
    }

    public final int az() {
        return this._maxValueState.J2();
    }

    public final void ck(int i2) {
        this._maxValueState.KN(i2);
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot snapshotNr = companion.nr();
        Function1 function1Uo = snapshotNr != null ? snapshotNr.Uo() : null;
        Snapshot snapshotO = companion.O(snapshotNr);
        try {
            if (ty() > i2) {
                Ik(i2);
            }
            Unit unit = Unit.INSTANCE;
            companion.az(snapshotNr, snapshotO, function1Uo);
        } catch (Throwable th) {
            companion.az(snapshotNr, snapshotO, function1Uo);
            throw th;
        }
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean nr() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final void r(int i2) {
        this.viewportSize.KN(i2);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float rl(float delta) {
        return this.scrollableState.rl(delta);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean t() {
        return this.scrollableState.t();
    }

    public final int ty() {
        return this.value.J2();
    }

    public ScrollState(int i2) {
        this.value = SnapshotIntStateKt.n(i2);
    }

    public final Object HI(int i2, Continuation continuation) {
        return ScrollExtensionsKt.rl(this, i2 - ty(), continuation);
    }

    public final Object gh(int i2, AnimationSpec animationSpec, Continuation continuation) {
        Object objN = ScrollExtensionsKt.n(this, i2 - ty(), animationSpec, continuation);
        if (objN == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objN;
        }
        return Unit.INSTANCE;
    }
}
