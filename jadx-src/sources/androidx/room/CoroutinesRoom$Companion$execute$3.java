package androidx.room;

import androidx.room.CoroutinesRoom;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion", f = "CoroutinesRoom.android.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {64, l.f62283e}, m = "execute", n = {"db", "cancellationSignal", "callable", "db", "cancellationSignal", "callable", "context"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
final class CoroutinesRoom$Companion$execute$3<R> extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f41275O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f41276Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41277n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ CoroutinesRoom.Companion f41278o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    /* synthetic */ Object f41279r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f41280t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$execute$3(CoroutinesRoom.Companion companion, Continuation continuation) {
        super(continuation);
        this.f41278o = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f41279r = obj;
        this.f41276Z |= Integer.MIN_VALUE;
        return this.f41278o.n(null, false, null, null, this);
    }
}
