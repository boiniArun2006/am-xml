package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.ObservedTableVersions", f = "InvalidationTracker.kt", i = {}, l = {602}, m = "collect", n = {}, s = {})
final class ObservedTableVersions$collect$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f41352O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    /* synthetic */ Object f41353n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ ObservedTableVersions f41354t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ObservedTableVersions$collect$1(ObservedTableVersions observedTableVersions, Continuation continuation) {
        super(continuation);
        this.f41354t = observedTableVersions;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f41353n = obj;
        this.f41352O |= Integer.MIN_VALUE;
        return this.f41354t.n(null, this);
    }
}
