package GJW;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class Ogx extends mrQ {
    private final Continuation J2;

    public Ogx(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.J2 = IntrinsicsKt.createCoroutineUnintercepted(function2, this, this);
    }

    @Override // GJW.L0y
    protected void Jk() throws Throwable {
        hND.j.rl(this.J2, this);
    }
}
