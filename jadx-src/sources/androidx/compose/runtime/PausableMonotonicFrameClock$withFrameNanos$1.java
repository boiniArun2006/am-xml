package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", i = {0, 0}, l = {61, 62}, m = "withFrameNanos", n = {"this", "onFrame"}, s = {"L$0", "L$1"})
final class PausableMonotonicFrameClock$withFrameNanos$1<R> extends ContinuationImpl {
    final /* synthetic */ PausableMonotonicFrameClock J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f30243O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f30244n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f30245r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f30246t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PausableMonotonicFrameClock$withFrameNanos$1(PausableMonotonicFrameClock pausableMonotonicFrameClock, Continuation continuation) {
        super(continuation);
        this.J2 = pausableMonotonicFrameClock;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30243O = obj;
        this.f30245r |= Integer.MIN_VALUE;
        return this.J2.jB(null, this);
    }
}
