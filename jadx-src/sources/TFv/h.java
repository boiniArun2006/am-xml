package TFv;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class h extends teV.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicReference f10441n = new AtomicReference(null);

    @Override // teV.w6
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public Continuation[] rl(vd vdVar) {
        dzu.Ml.rl(this.f10441n, null);
        return teV.n.f73655n;
    }

    public final boolean KN() {
        Object andSet = this.f10441n.getAndSet(Lu.f10292n);
        Intrinsics.checkNotNull(andSet);
        return andSet == Lu.rl;
    }

    public final Object O(Continuation continuation) {
        GJW.eO eOVar = new GJW.eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        if (!androidx.compose.animation.core.fuX.n(this.f10441n, Lu.f10292n, eOVar)) {
            Result.Companion companion = Result.INSTANCE;
            eOVar.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
        }
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWPU : Unit.INSTANCE;
    }

    public final void Uo() {
        AtomicReference atomicReference = this.f10441n;
        while (true) {
            Object objN = dzu.Ml.n(atomicReference);
            if (objN == null || objN == Lu.rl) {
                return;
            }
            if (objN == Lu.f10292n) {
                if (androidx.compose.animation.core.fuX.n(this.f10441n, objN, Lu.rl)) {
                    return;
                }
            } else if (androidx.compose.animation.core.fuX.n(this.f10441n, objN, Lu.f10292n)) {
                Result.Companion companion = Result.INSTANCE;
                ((GJW.eO) objN).resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
                return;
            }
        }
    }

    @Override // teV.w6
    /* JADX INFO: renamed from: nr, reason: merged with bridge method [inline-methods] */
    public boolean n(vd vdVar) {
        if (dzu.Ml.n(this.f10441n) != null) {
            return false;
        }
        dzu.Ml.rl(this.f10441n, Lu.f10292n);
        return true;
    }
}
