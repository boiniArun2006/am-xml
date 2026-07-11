package androidx.compose.foundation.gestures.snapping;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0, 0, 0}, l = {354}, m = "animateWithTarget", n = {"animationState", "consumedUpToNow", "targetOffset", "initialVelocity"}, s = {"L$0", "L$1", "F$0", "F$1"})
final class SnapFlingBehaviorKt$animateWithTarget$1 extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f17325O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f17326n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f17327o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    /* synthetic */ Object f17328r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    float f17329t;

    SnapFlingBehaviorKt$animateWithTarget$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17328r = obj;
        this.f17327o |= Integer.MIN_VALUE;
        return SnapFlingBehaviorKt.KN(null, 0.0f, 0.0f, null, null, null, this);
    }
}
