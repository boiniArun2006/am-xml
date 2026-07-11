package androidx.room;

import com.safedk.android.internal.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", i = {0}, l = {d.f62986a}, m = "syncTriggers$room_runtime_release", n = {"$this$ifNotClosed$iv"}, s = {"L$0"})
final class TriggerBasedInvalidationTracker$syncTriggers$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ TriggerBasedInvalidationTracker f41510O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41511n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f41512t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerBasedInvalidationTracker$syncTriggers$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Continuation continuation) {
        super(continuation);
        this.f41510O = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f41512t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f41510O.aYN(this);
    }
}
