package androidx.room.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", i = {0}, l = {231}, m = "acquire", n = {"this"}, s = {"L$0"})
final class Pool$acquire$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Pool f41583O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41584n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f41585t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Pool$acquire$1(Pool pool, Continuation continuation) {
        super(continuation);
        this.f41583O = pool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f41585t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f41583O.n(this);
    }
}
