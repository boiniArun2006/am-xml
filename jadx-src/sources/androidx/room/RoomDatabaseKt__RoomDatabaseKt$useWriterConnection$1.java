package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt", f = "RoomDatabase.kt", i = {0}, l = {496}, m = "useWriterConnection", n = {"$this$useWriterConnection"}, s = {"L$0"})
final class RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1<R> extends ContinuationImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f41397O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41398n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f41399t;

    RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f41399t = obj;
        this.f41397O |= Integer.MIN_VALUE;
        return RoomDatabaseKt.n(null, null, this);
    }
}
