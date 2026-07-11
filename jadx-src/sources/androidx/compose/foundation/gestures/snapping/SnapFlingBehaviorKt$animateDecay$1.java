package androidx.compose.foundation.gestures.snapping;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", i = {0, 0, 0}, l = {Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE}, m = "animateDecay", n = {"animationState", "previousValue", "targetOffset"}, s = {"L$0", "L$1", "F$0"})
final class SnapFlingBehaviorKt$animateDecay$1 extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f17318O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f17319n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f17320r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f17321t;

    SnapFlingBehaviorKt$animateDecay$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f17320r |= Integer.MIN_VALUE;
        return SnapFlingBehaviorKt.J2(null, 0.0f, null, null, null, this);
    }
}
