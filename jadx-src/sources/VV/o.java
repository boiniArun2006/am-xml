package VV;

import GJW.ci;
import GJW.r;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class o implements C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final r f10967n = ci.t(null, 1, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final MutableState f10970t = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final MutableState f10965O = SnapshotStateKt__SnapshotStateKt.O(null, null, 2, null);
    private final State J2 = SnapshotStateKt.O(new w6());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final State f10969r = SnapshotStateKt.O(new j());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final State f10968o = SnapshotStateKt.O(new n());

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final State f10966Z = SnapshotStateKt.O(new Ml());

    static final class Ml extends Lambda implements Function0 {
        Ml() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(o.this.getValue() != null);
        }
    }

    static final class j extends Lambda implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf((o.this.getValue() == null && o.this.XQ() == null) ? false : true);
        }
    }

    static final class n extends Lambda implements Function0 {
        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(o.this.XQ() != null);
        }
    }

    static final class w6 extends Lambda implements Function0 {
        w6() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(o.this.getValue() == null && o.this.XQ() == null);
        }
    }

    public final synchronized void HI(FQq.Dsr composition) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        if (iF()) {
            return;
        }
        e(composition);
        this.f10967n.eF(composition);
    }

    public final synchronized void ck(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (iF()) {
            return;
        }
        E2(error);
        this.f10967n.n(error);
    }

    private void E2(Throwable th) {
        this.f10965O.setValue(th);
    }

    private void e(FQq.Dsr dsr) {
        this.f10970t.setValue(dsr);
    }

    public Throwable XQ() {
        return (Throwable) this.f10965O.getValue();
    }

    public boolean fD() {
        return ((Boolean) this.f10966Z.getValue()).booleanValue();
    }

    public boolean iF() {
        return ((Boolean) this.f10969r.getValue()).booleanValue();
    }

    @Override // androidx.compose.runtime.State
    /* JADX INFO: renamed from: te, reason: merged with bridge method [inline-methods] */
    public FQq.Dsr getValue() {
        return (FQq.Dsr) this.f10970t.getValue();
    }
}
