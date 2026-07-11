package GJW;

import GJW.xuv;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class V1 extends AbstractCoroutineContextElement implements xuv {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final V1 f3456n = new V1();

    @Override // GJW.xuv
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    @Override // GJW.xuv
    public xuv getParent() {
        return null;
    }

    @Override // GJW.xuv
    public O invokeOnCompletion(Function1 function1) {
        return oXP.f3498n;
    }

    @Override // GJW.xuv
    public boolean isActive() {
        return true;
    }

    @Override // GJW.xuv
    public boolean isCancelled() {
        return false;
    }

    @Override // GJW.xuv
    public boolean isCompleted() {
        return false;
    }

    @Override // GJW.xuv
    public boolean start() {
        return false;
    }

    private V1() {
        super(xuv.nr);
    }

    @Override // GJW.xuv
    public s4 attachChild(Q q2) {
        return oXP.f3498n;
    }

    @Override // GJW.xuv
    public void cancel(CancellationException cancellationException) {
    }

    @Override // GJW.xuv
    public CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // GJW.xuv
    public tj.j getOnJoin() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // GJW.xuv
    public O invokeOnCompletion(boolean z2, boolean z3, Function1 function1) {
        return oXP.f3498n;
    }

    @Override // GJW.xuv
    public Object join(Continuation continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // GJW.xuv
    public /* synthetic */ boolean cancel(Throwable th) {
        return false;
    }

    @Override // GJW.xuv
    public Sequence getChildren() {
        return SequencesKt.emptySequence();
    }

    @Override // GJW.xuv
    public xuv plus(xuv xuvVar) {
        return xuv.j.J2(this, xuvVar);
    }
}
