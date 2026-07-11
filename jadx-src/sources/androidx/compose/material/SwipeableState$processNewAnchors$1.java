package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SwipeableState", f = "Swipeable.kt", i = {1, 1, 1, 2, 2, 2}, l = {154, 179, 182}, m = "processNewAnchors$material_release", n = {"this", "newAnchors", "targetOffset", "this", "newAnchors", "targetOffset"}, s = {"L$0", "L$1", "F$0", "L$0", "L$1", "F$0"})
final class SwipeableState$processNewAnchors$1 extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    float f23277O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f23278n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f23279o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ SwipeableState f23280r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f23281t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableState$processNewAnchors$1(SwipeableState swipeableState, Continuation continuation) {
        super(continuation);
        this.f23280r = swipeableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f23279o |= Integer.MIN_VALUE;
        return this.f23280r.g(null, null, this);
    }
}
