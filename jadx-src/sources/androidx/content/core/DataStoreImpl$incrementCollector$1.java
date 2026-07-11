package androidx.content.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0, 0}, l = {544}, m = "incrementCollector", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
final class DataStoreImpl$incrementCollector$1 extends ContinuationImpl {
    final /* synthetic */ DataStoreImpl J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f37441O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37442n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f37443r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f37444t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$incrementCollector$1(DataStoreImpl dataStoreImpl, Continuation continuation) {
        super(continuation);
        this.J2 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37441O = obj;
        this.f37443r |= Integer.MIN_VALUE;
        return this.J2.XQ(this);
    }
}
