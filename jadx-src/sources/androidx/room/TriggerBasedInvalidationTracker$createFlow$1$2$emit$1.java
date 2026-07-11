package androidx.room;

import androidx.room.TriggerBasedInvalidationTracker$createFlow$1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2", f = "InvalidationTracker.kt", i = {0, 0, 1, 1}, l = {241, 250}, m = "emit", n = {"this", "newVersions", "this", "newVersions"}, s = {"L$0", "L$1", "L$0", "L$1"})
final class TriggerBasedInvalidationTracker$createFlow$1$2$emit$1 extends ContinuationImpl {
    final /* synthetic */ TriggerBasedInvalidationTracker$createFlow$1.AnonymousClass2 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f41474O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41475n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f41476r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f41477t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerBasedInvalidationTracker$createFlow$1$2$emit$1(TriggerBasedInvalidationTracker$createFlow$1.AnonymousClass2 anonymousClass2, Continuation continuation) {
        super(continuation);
        this.J2 = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f41474O = obj;
        this.f41476r |= Integer.MIN_VALUE;
        return this.J2.rl(null, this);
    }
}
