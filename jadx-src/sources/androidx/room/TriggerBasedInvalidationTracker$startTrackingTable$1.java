package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {323, 328}, m = "startTrackingTable", n = {"this", "connection", "tableId", "this", "connection", "tableName", "tableId"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0"})
final class TriggerBasedInvalidationTracker$startTrackingTable$1 extends ContinuationImpl {
    int E2;
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f41495O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    /* synthetic */ Object f41496S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f41497Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ TriggerBasedInvalidationTracker f41498g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41499n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f41500o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f41501r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f41502t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerBasedInvalidationTracker$startTrackingTable$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Continuation continuation) {
        super(continuation);
        this.f41498g = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f41496S = obj;
        this.E2 |= Integer.MIN_VALUE;
        return this.f41498g.S(null, 0, this);
    }
}
