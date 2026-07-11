package androidx.content.core.okio;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {236, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE}, m = "writeScope", n = {"this", "block", "parentDir", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "scratchPath", "$this$use$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
final class OkioStorageConnection$writeScope$1 extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f37640O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f37641Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37642n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ OkioStorageConnection f37643o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    /* synthetic */ Object f37644r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f37645t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OkioStorageConnection$writeScope$1(OkioStorageConnection okioStorageConnection, Continuation continuation) {
        super(continuation);
        this.f37643o = okioStorageConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37644r = obj;
        this.f37641Z |= Integer.MIN_VALUE;
        return this.f37643o.rl(null, this);
    }
}
