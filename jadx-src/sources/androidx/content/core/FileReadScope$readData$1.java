package androidx.content.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.FileReadScope", f = "FileStorage.kt", i = {0}, l = {169, 178}, m = "readData$suspendImpl", n = {"$this"}, s = {"L$0"})
final class FileReadScope$readData$1<T> extends ContinuationImpl {
    final /* synthetic */ FileReadScope J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f37511O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f37512n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f37513r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f37514t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileReadScope$readData$1(FileReadScope fileReadScope, Continuation continuation) {
        super(continuation);
        this.J2 = fileReadScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37511O = obj;
        this.f37513r |= Integer.MIN_VALUE;
        return FileReadScope.xMQ(this.J2, this);
    }
}
