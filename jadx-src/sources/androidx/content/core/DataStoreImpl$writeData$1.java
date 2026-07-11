package androidx.content.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0}, l = {348}, m = "writeData$datastore_core_release", n = {"newVersion"}, s = {"L$0"})
final class DataStoreImpl$writeData$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ DataStoreImpl f37499O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37500n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f37501t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$writeData$1(DataStoreImpl dataStoreImpl, Continuation continuation) {
        super(continuation);
        this.f37499O = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37501t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f37499O.te(null, false, this);
    }
}
