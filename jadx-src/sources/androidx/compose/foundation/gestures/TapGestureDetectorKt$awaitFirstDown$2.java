package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 0}, l = {291}, m = "awaitFirstDown", n = {"$this$awaitFirstDown", "pass", "requireUnconsumed"}, s = {"L$0", "L$1", "Z$0"})
final class TapGestureDetectorKt$awaitFirstDown$2 extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f17090O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f17091n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f17092r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f17093t;

    TapGestureDetectorKt$awaitFirstDown$2(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f17092r |= Integer.MIN_VALUE;
        return TapGestureDetectorKt.O(null, false, null, this);
    }
}
