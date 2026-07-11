package androidx.content.core.okio;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.okio.OkioWriteScope", f = "OkioStorage.kt", i = {0, 0, 0}, l = {Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE}, m = "writeData", n = {"$this$use$iv", "handle", "$this$use$iv"}, s = {"L$0", "L$1", "L$2"})
final class OkioWriteScope$writeData$1 extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f37646O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37647n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f37648o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ OkioWriteScope f37649r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f37650t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OkioWriteScope$writeData$1(OkioWriteScope okioWriteScope, Continuation continuation) {
        super(continuation);
        this.f37649r = okioWriteScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f37648o |= Integer.MIN_VALUE;
        return this.f37649r.n(null, this);
    }
}
