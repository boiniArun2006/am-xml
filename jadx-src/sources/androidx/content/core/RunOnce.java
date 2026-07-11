package androidx.content.core;

import GJW.ci;
import GJW.r;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import yB.CN3;
import yB.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H¤@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/datastore/core/RunOnce;", "", "<init>", "()V", "", "rl", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", c.f62177j, "t", "LyB/j;", "LyB/j;", "runMutex", "LGJW/r;", "LGJW/r;", "didRun", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/RunOnce\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,538:1\n120#2,10:539\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/RunOnce\n*L\n495#1:539,10\n*E\n"})
public abstract class RunOnce {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final j runMutex = CN3.rl(false, 1, null);

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final r didRun = ci.t(null, 1, null);

    protected abstract Object rl(Continuation continuation);

    public final Object n(Continuation continuation) {
        Object objAwait = this.didRun.await(continuation);
        return objAwait == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwait : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(Continuation continuation) throws Throwable {
        RunOnce$runIfNeeded$1 runOnce$runIfNeeded$1;
        j jVar;
        RunOnce runOnce;
        j jVar2;
        Throwable th;
        RunOnce runOnce2;
        if (continuation instanceof RunOnce$runIfNeeded$1) {
            runOnce$runIfNeeded$1 = (RunOnce$runIfNeeded$1) continuation;
            int i2 = runOnce$runIfNeeded$1.f37582r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                runOnce$runIfNeeded$1.f37582r = i2 - Integer.MIN_VALUE;
            } else {
                runOnce$runIfNeeded$1 = new RunOnce$runIfNeeded$1(this, continuation);
            }
        }
        Object obj = runOnce$runIfNeeded$1.f37580O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = runOnce$runIfNeeded$1.f37582r;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.didRun.isCompleted()) {
                    return Unit.INSTANCE;
                }
                jVar = this.runMutex;
                runOnce$runIfNeeded$1.f37581n = this;
                runOnce$runIfNeeded$1.f37583t = jVar;
                runOnce$runIfNeeded$1.f37582r = 1;
                if (jVar.Z(null, runOnce$runIfNeeded$1) != coroutine_suspended) {
                    runOnce = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar2 = (j) runOnce$runIfNeeded$1.f37583t;
                runOnce2 = (RunOnce) runOnce$runIfNeeded$1.f37581n;
                try {
                    ResultKt.throwOnFailure(obj);
                    r rVar = runOnce2.didRun;
                    Unit unit = Unit.INSTANCE;
                    rVar.eF(unit);
                    jVar2.T(null);
                    return unit;
                } catch (Throwable th2) {
                    th = th2;
                    jVar2.T(null);
                    throw th;
                }
            }
            j jVar3 = (j) runOnce$runIfNeeded$1.f37583t;
            runOnce = (RunOnce) runOnce$runIfNeeded$1.f37581n;
            ResultKt.throwOnFailure(obj);
            jVar = jVar3;
            if (runOnce.didRun.isCompleted()) {
                Unit unit2 = Unit.INSTANCE;
                jVar.T(null);
                return unit2;
            }
            runOnce$runIfNeeded$1.f37581n = runOnce;
            runOnce$runIfNeeded$1.f37583t = jVar;
            runOnce$runIfNeeded$1.f37582r = 2;
            if (runOnce.rl(runOnce$runIfNeeded$1) != coroutine_suspended) {
                jVar2 = jVar;
                runOnce2 = runOnce;
                r rVar2 = runOnce2.didRun;
                Unit unit3 = Unit.INSTANCE;
                rVar2.eF(unit3);
                jVar2.T(null);
                return unit3;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            jVar2 = jVar;
            th = th3;
            jVar2.T(null);
            throw th;
        }
    }
}
