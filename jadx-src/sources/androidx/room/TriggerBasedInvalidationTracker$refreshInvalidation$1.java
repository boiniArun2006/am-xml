package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0, 0}, l = {367}, m = "refreshInvalidation$room_runtime_release", n = {"onRefreshCompleted", "tableIds"}, s = {"L$0", "L$1"})
final class TriggerBasedInvalidationTracker$refreshInvalidation$1 extends ContinuationImpl {
    final /* synthetic */ TriggerBasedInvalidationTracker J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f41488O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41489n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f41490r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f41491t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerBasedInvalidationTracker$refreshInvalidation$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Continuation continuation) {
        super(continuation);
        this.J2 = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f41488O = obj;
        this.f41490r |= Integer.MIN_VALUE;
        return this.J2.Ik(null, null, null, this);
    }
}
