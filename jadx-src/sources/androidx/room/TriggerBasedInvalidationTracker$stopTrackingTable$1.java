package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0, 0}, l = {342}, m = "stopTrackingTable", n = {"connection", "tableName"}, s = {"L$0", "L$1"})
final class TriggerBasedInvalidationTracker$stopTrackingTable$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f41503O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f41504S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ TriggerBasedInvalidationTracker f41505Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41506n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    /* synthetic */ Object f41507o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f41508r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f41509t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerBasedInvalidationTracker$stopTrackingTable$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Continuation continuation) {
        super(continuation);
        this.f41505Z = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f41507o = obj;
        this.f41504S |= Integer.MIN_VALUE;
        return this.f41505Z.WPU(null, 0, this);
    }
}
