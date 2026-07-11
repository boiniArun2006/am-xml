package androidx.content.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", i = {0, 1, 1}, l = {264, 266}, m = "readAndInitOrPropagateAndThrowFailure", n = {"this", "this", "preReadVersion"}, s = {"L$0", "L$0", "I$0"})
final class DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 extends ContinuationImpl {
    final /* synthetic */ DataStoreImpl J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f37448O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37449n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f37450r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f37451t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1(DataStoreImpl dataStoreImpl, Continuation continuation) {
        super(continuation);
        this.J2 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37448O = obj;
        this.f37450r |= Integer.MIN_VALUE;
        return this.J2.S(this);
    }
}
