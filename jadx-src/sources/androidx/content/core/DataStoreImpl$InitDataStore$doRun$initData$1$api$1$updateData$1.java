package androidx.content.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", f = "DataStoreImpl.kt", i = {0, 0, 1, 2, 2}, l = {544, 447, 449}, m = "updateData", n = {"transform", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "newData"}, s = {"L$0", "L$1", "L$0", "L$0", "L$2"})
final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f37405O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f37406S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ DataStoreImpl$InitDataStore$doRun$initData$1$api$1 f37407Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37408n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    /* synthetic */ Object f37409o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f37410r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f37411t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1, Continuation continuation) {
        super(continuation);
        this.f37407Z = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37409o = obj;
        this.f37406S |= Integer.MIN_VALUE;
        return this.f37407Z.n(null, this);
    }
}
