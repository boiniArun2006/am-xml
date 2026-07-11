package androidx.constraintlayout.compose;

import android.os.Handler;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.layout.Measurable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\"\u0010%\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintSetForInlineDsl;", "Landroidx/constraintlayout/compose/ConstraintSet;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "scope", "<init>", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;)V", "Landroidx/constraintlayout/compose/State;", "state", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "", c.f62177j, "(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V", "", "rl", "(Ljava/util/List;)Z", "t", "()V", "O", "nr", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "gh", "()Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "observer", "J2", "Z", "getKnownDirty", "()Z", "az", "(Z)V", "knownDirty", "Lkotlin/Function1;", "r", "Lkotlin/jvm/functions/Function1;", "onCommitAffectingConstrainLambdas", "", "Landroidx/constraintlayout/compose/ConstraintLayoutParentData;", "o", "Ljava/util/List;", "previousDatas", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintSetForInlineDsl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,2303:1\n69#2,6:2304\n*S KotlinDebug\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintSetForInlineDsl\n*L\n544#1:2304,6\n*E\n"})
public final class ConstraintSetForInlineDsl implements ConstraintSet, RememberObserver {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ConstraintLayoutScope scope;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Handler handler;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateObserver observer = new SnapshotStateObserver(new ConstraintSetForInlineDsl$observer$1(this));

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private boolean knownDirty = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Function1 onCommitAffectingConstrainLambdas = new Function1<Unit, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$onCommitAffectingConstrainLambdas$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            n(unit);
            return Unit.INSTANCE;
        }

        public final void n(Unit unit) {
            this.f34520n.az(true);
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final List previousDatas = new ArrayList();

    @Override // androidx.compose.runtime.RememberObserver
    public void nr() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void O() {
        this.observer.XQ();
        this.observer.gh();
    }

    public final void az(boolean z2) {
        this.knownDirty = z2;
    }

    /* JADX INFO: renamed from: gh, reason: from getter */
    public final ConstraintLayoutScope getScope() {
        return this.scope;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public void n(final State state, final List measurables) {
        this.previousDatas.clear();
        this.observer.ck(Unit.INSTANCE, this.onCommitAffectingConstrainLambdas, new Function0<Unit>() { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$applyTo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                List list = measurables;
                ConstraintSetForInlineDsl constraintSetForInlineDsl = this;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object objJ2 = ((Measurable) list.get(i2)).J2();
                    ConstraintLayoutParentData constraintLayoutParentData = objJ2 instanceof ConstraintLayoutParentData ? (ConstraintLayoutParentData) objJ2 : null;
                    if (constraintLayoutParentData != null) {
                        ConstrainedLayoutReference ref = constraintLayoutParentData.getRef();
                        constraintLayoutParentData.getConstrain().invoke(new ConstrainScope(ref.getId(), constraintSetForInlineDsl.getScope().rl(ref)));
                    }
                    constraintSetForInlineDsl.previousDatas.add(constraintLayoutParentData);
                }
                this.getScope().n(state);
            }
        });
        this.knownDirty = false;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public boolean rl(List measurables) {
        if (this.knownDirty || measurables.size() != this.previousDatas.size()) {
            return true;
        }
        int size = measurables.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object objJ2 = ((Measurable) measurables.get(i2)).J2();
            if (!Intrinsics.areEqual(objJ2 instanceof ConstraintLayoutParentData ? (ConstraintLayoutParentData) objJ2 : null, this.previousDatas.get(i2))) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void t() {
        this.observer.Z();
    }

    public ConstraintSetForInlineDsl(ConstraintLayoutScope constraintLayoutScope) {
        this.scope = constraintLayoutScope;
    }
}
