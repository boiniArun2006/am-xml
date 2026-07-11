package GJW;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class I28 {
    private static final /* synthetic */ AtomicIntegerFieldUpdater rl = AtomicIntegerFieldUpdater.newUpdater(I28.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final P[] f3397n;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    private final class j extends g9 {

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f3398S = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public O f3400o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final Pl f3401r;

        @Override // GJW.g9
        public boolean S() {
            return false;
        }

        public j(Pl pl) {
            this.f3401r = pl;
        }

        @Override // GJW.g9
        public void WPU(Throwable th) {
            if (th != null) {
                Object objHI = this.f3401r.HI(th);
                if (objHI != null) {
                    this.f3401r.te(objHI);
                    n nVarViF = ViF();
                    if (nVarViF != null) {
                        nVarViF.rl();
                        return;
                    }
                    return;
                }
                return;
            }
            if (I28.nr().decrementAndGet(I28.this) == 0) {
                Pl pl = this.f3401r;
                P[] pArr = I28.this.f3397n;
                ArrayList arrayList = new ArrayList(pArr.length);
                for (P p2 : pArr) {
                    arrayList.add(p2.getCompleted());
                }
                pl.resumeWith(Result.m313constructorimpl(arrayList));
            }
        }

        public final void iF(O o2) {
            this.f3400o = o2;
        }

        public final O nY() {
            O o2 = this.f3400o;
            if (o2 != null) {
                return o2;
            }
            Intrinsics.throwUninitializedPropertyAccessException("handle");
            return null;
        }

        public final n ViF() {
            return (n) f3398S.get(this);
        }

        public final void te(n nVar) {
            f3398S.set(this, nVar);
        }
    }

    private final class n implements qz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final j[] f3402n;

        public n(j[] jVarArr) {
            this.f3402n = jVarArr;
        }

        public final void rl() {
            for (j jVar : this.f3402n) {
                jVar.nY().n();
            }
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f3402n + ']';
        }

        @Override // GJW.qz
        public void n(Throwable th) {
            rl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater nr() {
        return rl;
    }

    public final Object t(Continuation continuation) {
        eO eOVar = new eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        int length = this.f3397n.length;
        j[] jVarArr = new j[length];
        for (int i2 = 0; i2 < length; i2++) {
            P p2 = this.f3397n[i2];
            p2.start();
            j jVar = new j(eOVar);
            jVar.iF(cA.HI(p2, false, jVar, 1, null));
            Unit unit = Unit.INSTANCE;
            jVarArr[i2] = jVar;
        }
        n nVar = new n(jVarArr);
        for (int i3 = 0; i3 < length; i3++) {
            jVarArr[i3].te(nVar);
        }
        if (eOVar.isCompleted()) {
            nVar.rl();
        } else {
            QJ.t(eOVar, nVar);
        }
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU;
    }

    public I28(P[] pArr) {
        this.f3397n = pArr;
        this.notCompletedCount$volatile = pArr.length;
    }
}
