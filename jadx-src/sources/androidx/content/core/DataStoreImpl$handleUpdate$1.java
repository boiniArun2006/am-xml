package androidx.content.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {1, 1}, l = {237, 243, 246}, m = "handleUpdate", n = {"update", "$this$handleUpdate_u24lambda_u242"}, s = {"L$0", "L$1"})
final class DataStoreImpl$handleUpdate$1 extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f37436O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37437n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f37438o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ DataStoreImpl f37439r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f37440t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$handleUpdate$1(DataStoreImpl dataStoreImpl, Continuation continuation) {
        super(continuation);
        this.f37439r = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f37438o |= Integer.MIN_VALUE;
        return this.f37439r.Z(null, this);
    }
}
