package ILs;

import GJW.L0y;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobCancellationException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class fuX extends GJW.j implements CN3 {
    private final CN3 J2;

    @Override // GJW.L0y, GJW.xuv
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(X(), null, this);
        }
        fD(cancellationException);
    }

    @Override // GJW.L0y
    public void fD(Throwable th) {
        CancellationException cancellationExceptionHRu = L0y.hRu(this, th, null, 1, null);
        this.J2.cancel(cancellationExceptionHRu);
        nY(cancellationExceptionHRu);
    }

    @Override // ILs.Q
    public Object KN(Continuation continuation) {
        return this.J2.KN(continuation);
    }

    @Override // ILs.Q
    public Object O() {
        return this.J2.O();
    }

    @Override // ILs.Q
    public Object Uo(Continuation continuation) {
        Object objUo = this.J2.Uo(continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objUo;
    }

    protected final CN3 a63() {
        return this.J2;
    }

    @Override // ILs.r
    public boolean gh() {
        return this.J2.gh();
    }

    @Override // ILs.Q
    public Dsr iterator() {
        return this.J2.iterator();
    }

    @Override // ILs.r
    public Object mUb(Object obj, Continuation continuation) {
        return this.J2.mUb(obj, continuation);
    }

    @Override // ILs.r
    public Object nr(Object obj) {
        return this.J2.nr(obj);
    }

    @Override // ILs.r
    public void t(Function1 function1) {
        this.J2.t(function1);
    }

    @Override // ILs.r
    public boolean xMQ(Throwable th) {
        return this.J2.xMQ(th);
    }

    public fuX(CoroutineContext coroutineContext, CN3 cn3, boolean z2, boolean z3) {
        super(coroutineContext, z2, z3);
        this.J2 = cn3;
    }

    @Override // GJW.L0y, GJW.xuv
    public /* synthetic */ void cancel() {
        fD(new JobCancellationException(X(), null, this));
    }

    @Override // GJW.L0y, GJW.xuv
    public final /* synthetic */ boolean cancel(Throwable th) {
        fD(new JobCancellationException(X(), null, this));
        return true;
    }
}
