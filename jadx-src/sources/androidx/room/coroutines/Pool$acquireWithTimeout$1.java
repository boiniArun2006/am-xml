package androidx.room.coroutines;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", i = {0, 0, 0, 0}, l = {Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE}, m = "acquireWithTimeout-KLykuaI", n = {"this", "onTimeout", "connection", "timeout"}, s = {"L$0", "L$1", "L$2", "J$0"})
final class Pool$acquireWithTimeout$1 extends ContinuationImpl {
    long J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f41586O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f41587Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41588n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ Pool f41589o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    /* synthetic */ Object f41590r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f41591t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Pool$acquireWithTimeout$1(Pool pool, Continuation continuation) {
        super(continuation);
        this.f41589o = pool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f41590r = obj;
        this.f41587Z |= Integer.MIN_VALUE;
        return this.f41589o.rl(0L, null, this);
    }
}
