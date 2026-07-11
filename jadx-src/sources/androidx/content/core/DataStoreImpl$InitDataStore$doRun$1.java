package androidx.content.core;

import androidx.content.core.DataStoreImpl;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore", f = "DataStoreImpl.kt", i = {0, 1}, l = {430, 434}, m = "doRun", n = {"this", "this"}, s = {"L$0", "L$0"})
final class DataStoreImpl$InitDataStore$doRun$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ DataStoreImpl.InitDataStore f37392O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37393n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f37394t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$InitDataStore$doRun$1(DataStoreImpl.InitDataStore initDataStore, Continuation continuation) {
        super(continuation);
        this.f37392O = initDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37394t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f37392O.rl(this);
    }
}
