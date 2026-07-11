package androidx.compose.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\rJ\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\rJ\u0015\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b!\u0010\"R/\u0010+\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010#8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R+\u0010/\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b,\u0010\t\"\u0004\b-\u0010.R/\u00101\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010#8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010&\u001a\u0004\b%\u0010(\"\u0004\b0\u0010*R(\u00105\u001a\u0004\u0018\u00010\u000e2\b\u0010$\u001a\u0004\u0018\u00010\u000e8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b!\u00102\u001a\u0004\b3\u00104R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000e068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b7\u00109R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000b0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010@R\u0013\u0010B\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b<\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"Landroidx/compose/animation/SharedElement;", "", "key", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "scope", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/SharedTransitionScopeImpl;)V", "", "gh", "()Z", "qie", "", "o", "()V", "Landroidx/compose/animation/SharedElementInternalState;", "state", "Landroidx/compose/ui/geometry/Size;", "lookaheadSize", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "az", "(Landroidx/compose/animation/SharedElementInternalState;JJ)V", "Z", "ty", "sharedElementState", "rl", "(Landroidx/compose/animation/SharedElementInternalState;)V", "HI", c.f62177j, "Ljava/lang/Object;", "O", "()Ljava/lang/Object;", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "J2", "()Landroidx/compose/animation/SharedTransitionScopeImpl;", "Landroidx/compose/ui/geometry/Rect;", "<set-?>", "t", "Landroidx/compose/runtime/MutableState;", "mUb", "()Landroidx/compose/ui/geometry/Rect;", "r", "(Landroidx/compose/ui/geometry/Rect;)V", "_targetBounds", "nr", "Ik", "(Z)V", "foundMatch", "ck", "currentBounds", "Landroidx/compose/animation/SharedElementInternalState;", "xMQ", "()Landroidx/compose/animation/SharedElementInternalState;", "targetBoundsProvider", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Uo", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "states", "Lkotlin/Function1;", "KN", "Lkotlin/jvm/functions/Function1;", "updateMatch", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "observingVisibilityChange", "targetBounds", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSharedElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElement\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,247:1\n102#2,2:248\n34#2,6:250\n104#2:256\n34#2,6:267\n102#2,2:273\n34#2,6:275\n104#2:281\n52#2,6:282\n85#3:257\n113#3,2:258\n85#3:261\n113#3,2:262\n85#3:264\n113#3,2:265\n1#4:260\n*S KotlinDebug\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElement\n*L\n43#1:248,2\n43#1:250,6\n43#1:256\n96#1:267,6\n112#1:273,2\n112#1:275,6\n112#1:281\n124#1:282,6\n45#1:257\n45#1:258,2\n78#1:261\n78#1:262,2\n82#1:264\n82#1:265,2\n*E\n"})
public final class SharedElement {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private SharedElementInternalState targetBoundsProvider;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final SharedTransitionScopeImpl scope;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableState _targetBounds = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final MutableState foundMatch = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final MutableState currentBounds = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final SnapshotStateList states = SnapshotStateKt.J2();

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final Function1 updateMatch = new Function1<SharedElement, Unit>() { // from class: androidx.compose.animation.SharedElement$updateMatch$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SharedElement sharedElement) {
            n(sharedElement);
            return Unit.INSTANCE;
        }

        public final void n(SharedElement sharedElement) {
            this.f15289n.o();
        }
    };

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final Function0 observingVisibilityChange = new Function0<Unit>() { // from class: androidx.compose.animation.SharedElement$observingVisibilityChange$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f15288n.gh();
        }
    };

    private final void Ik(boolean z2) {
        this.foundMatch.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean gh() {
        SnapshotStateList snapshotStateList = this.states;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((SharedElementInternalState) snapshotStateList.get(i2)).Uo().J2()) {
                return true;
            }
        }
        return false;
    }

    private final Rect mUb() {
        return (Rect) this._targetBounds.getValue();
    }

    private final void r(Rect rect) {
        this._targetBounds.setValue(rect);
    }

    public final void HI(SharedElementInternalState sharedElementState) {
        this.states.remove(sharedElementState);
        if (!this.states.isEmpty()) {
            this.scope.az(this, this.updateMatch, this.observingVisibilityChange);
        } else {
            o();
            this.scope.KN(this);
        }
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final SharedTransitionScopeImpl getScope() {
        return this.scope;
    }

    public final Rect KN() {
        SharedElementInternalState sharedElementInternalState = this.targetBoundsProvider;
        r(sharedElementInternalState != null ? RectKt.t(sharedElementInternalState.J2(), sharedElementInternalState.mUb()) : null);
        return mUb();
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Object getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final SnapshotStateList getStates() {
        return this.states;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z() {
        SnapshotStateList snapshotStateList = this.states;
        int size = snapshotStateList.size() - 1;
        SharedElementInternalState sharedElementInternalState = null;
        if (size >= 0) {
            while (true) {
                int i2 = size - 1;
                SharedElementInternalState sharedElementInternalState2 = (SharedElementInternalState) snapshotStateList.get(size);
                if (sharedElementInternalState2.Uo().J2()) {
                    sharedElementInternalState = sharedElementInternalState2;
                }
                if (i2 < 0) {
                    break;
                } else {
                    size = i2;
                }
            }
        }
        if (Intrinsics.areEqual(sharedElementInternalState, this.targetBoundsProvider)) {
            return;
        }
        this.targetBoundsProvider = sharedElementInternalState;
        r(null);
    }

    public final void ck(Rect rect) {
        this.currentBounds.setValue(rect);
    }

    public final boolean nr() {
        return ((Boolean) this.foundMatch.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean qie() {
        SnapshotStateList snapshotStateList = this.states;
        int size = snapshotStateList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!((SharedElementInternalState) snapshotStateList.get(i2)).Uo().xMQ()) {
                i2++;
            } else if (nr()) {
                return true;
            }
        }
        return false;
    }

    public final void rl(SharedElementInternalState sharedElementState) {
        this.states.add(sharedElementState);
        this.scope.az(this, this.updateMatch, this.observingVisibilityChange);
    }

    public final Rect t() {
        return (Rect) this.currentBounds.getValue();
    }

    public final void ty() {
        Ik(this.states.size() > 1 && gh());
        r(null);
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final SharedElementInternalState getTargetBoundsProvider() {
        return this.targetBoundsProvider;
    }

    public SharedElement(Object obj, SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.key = obj;
        this.scope = sharedTransitionScopeImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void az(SharedElementInternalState state, long lookaheadSize, long topLeft) {
        Offset offsetNr;
        boolean zMUb;
        boolean zKN;
        if (state.Uo().J2()) {
            this.targetBoundsProvider = state;
            Rect rectMUb = mUb();
            Size sizeT = null;
            if (rectMUb != null) {
                offsetNr = Offset.nr(rectMUb.Z());
            } else {
                offsetNr = null;
            }
            if (offsetNr == null) {
                zMUb = false;
            } else {
                zMUb = Offset.mUb(offsetNr.getPackedValue(), topLeft);
            }
            if (zMUb) {
                Rect rectMUb2 = mUb();
                if (rectMUb2 != null) {
                    sizeT = Size.t(rectMUb2.Ik());
                }
                if (sizeT == null) {
                    zKN = false;
                } else {
                    zKN = Size.KN(sizeT.getPackedValue(), lookaheadSize);
                }
                if (zKN) {
                    return;
                }
            }
            Rect rectT = RectKt.t(topLeft, lookaheadSize);
            r(rectT);
            SnapshotStateList snapshotStateList = this.states;
            int size = snapshotStateList.size();
            for (int i2 = 0; i2 < size; i2++) {
                BoundsAnimation boundsAnimationUo = ((SharedElementInternalState) snapshotStateList.get(i2)).Uo();
                Rect rectT2 = t();
                Intrinsics.checkNotNull(rectT2);
                boundsAnimationUo.n(rectT2, rectT);
            }
        }
    }

    public final void o() {
        boolean zGh = gh();
        if (this.states.size() > 1 && zGh) {
            Ik(true);
        } else if (!this.scope.J2() || !zGh) {
            Ik(false);
        }
        if (!this.states.isEmpty()) {
            this.scope.az(this, this.updateMatch, this.observingVisibilityChange);
        }
    }
}
