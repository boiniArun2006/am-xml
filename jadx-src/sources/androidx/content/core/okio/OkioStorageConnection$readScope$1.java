package androidx.content.core.okio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", i = {0, 0, 0}, l = {113}, m = "readScope", n = {"this", "$this$use$iv", "lock"}, s = {"L$0", "L$1", "Z$0"})
final class OkioStorageConnection$readScope$1<R> extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f37635O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37636n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f37637o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ OkioStorageConnection f37638r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f37639t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OkioStorageConnection$readScope$1(OkioStorageConnection okioStorageConnection, Continuation continuation) {
        super(continuation);
        this.f37638r = okioStorageConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f37637o |= Integer.MIN_VALUE;
        return this.f37638r.nr(null, this);
    }
}
