package androidx.content.core;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE}, m = "writeScope", n = {"this", "block", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "scratchFile", "$this$use$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
final class FileStorageConnection$writeScope$1 extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f37528O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f37529Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37530n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ FileStorageConnection f37531o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    /* synthetic */ Object f37532r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f37533t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileStorageConnection$writeScope$1(FileStorageConnection fileStorageConnection, Continuation continuation) {
        super(continuation);
        this.f37531o = fileStorageConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37532r = obj;
        this.f37529Z |= Integer.MIN_VALUE;
        return this.f37531o.rl(null, this);
    }
}
