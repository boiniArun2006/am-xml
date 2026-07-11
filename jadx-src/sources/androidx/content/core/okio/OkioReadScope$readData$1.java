package androidx.content.core.okio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.okio.OkioReadScope", f = "OkioStorage.kt", i = {0, 0, 1}, l = {180, 187}, m = "readData$suspendImpl", n = {"$this", "$this$use$iv$iv", "$this$use$iv$iv"}, s = {"L$0", "L$1", "L$0"})
final class OkioReadScope$readData$1<T> extends ContinuationImpl {
    final /* synthetic */ OkioReadScope J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f37622O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37623n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f37624r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f37625t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OkioReadScope$readData$1(OkioReadScope okioReadScope, Continuation continuation) {
        super(continuation);
        this.J2 = okioReadScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37622O = obj;
        this.f37624r |= Integer.MIN_VALUE;
        return OkioReadScope.mUb(this.J2, this);
    }
}
