package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0, 0}, l = {412}, m = "notifyInvalidation", n = {"this", "$this$ifNotClosed$iv"}, s = {"L$0", "L$1"})
final class TriggerBasedInvalidationTracker$notifyInvalidation$1 extends ContinuationImpl {
    final /* synthetic */ TriggerBasedInvalidationTracker J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f41478O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41479n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f41480r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f41481t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerBasedInvalidationTracker$notifyInvalidation$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Continuation continuation) {
        super(continuation);
        this.J2 = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f41478O = obj;
        this.f41480r |= Integer.MIN_VALUE;
        return this.J2.az(this);
    }
}
