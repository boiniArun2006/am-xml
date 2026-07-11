package androidx.compose.foundation.gestures.snapping;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {0}, l = {115}, m = "fling", n = {"onRemainingScrollOffsetUpdate"}, s = {"L$0"})
final class SnapFlingBehavior$fling$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ SnapFlingBehavior f17299O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f17300n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f17301t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnapFlingBehavior$fling$1(SnapFlingBehavior snapFlingBehavior, Continuation continuation) {
        super(continuation);
        this.f17299O = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17301t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f17299O.xMQ(null, 0.0f, null, this);
    }
}
