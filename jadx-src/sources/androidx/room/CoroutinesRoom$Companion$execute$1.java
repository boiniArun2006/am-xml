package androidx.room;

import androidx.room.CoroutinesRoom;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion", f = "CoroutinesRoom.android.kt", i = {0}, l = {48, 49}, m = "execute", n = {"callable"}, s = {"L$0"})
final class CoroutinesRoom$Companion$execute$1<R> extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ CoroutinesRoom.Companion f41270O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41271n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f41272t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$execute$1(CoroutinesRoom.Companion companion, Continuation continuation) {
        super(continuation);
        this.f41270O = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f41272t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f41270O.rl(null, false, null, this);
    }
}
