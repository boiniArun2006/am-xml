package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SwipeableState$animateTo$2", f = "Swipeable.kt", i = {0, 0}, l = {327}, m = "emit", n = {"this", "anchors"}, s = {"L$0", "L$1"})
final class SwipeableState$animateTo$2$emit$1 extends ContinuationImpl {
    final /* synthetic */ SwipeableState$animateTo$2 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f23269O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f23270n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f23271r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f23272t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableState$animateTo$2$emit$1(SwipeableState$animateTo$2 swipeableState$animateTo$2, Continuation continuation) {
        super(continuation);
        this.J2 = swipeableState$animateTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23269O = obj;
        this.f23271r |= Integer.MIN_VALUE;
        return this.J2.rl(null, this);
    }
}
