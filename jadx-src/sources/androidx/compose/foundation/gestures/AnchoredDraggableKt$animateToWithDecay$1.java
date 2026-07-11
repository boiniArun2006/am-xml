package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {0, 0}, l = {1380}, m = "animateToWithDecay", n = {"remainingVelocity", "velocity"}, s = {"L$0", "F$0"})
final class AnchoredDraggableKt$animateToWithDecay$1<T> extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f16473O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f16474n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f16475t;

    AnchoredDraggableKt$animateToWithDecay$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16473O = obj;
        this.J2 |= Integer.MIN_VALUE;
        return AnchoredDraggableKt.qie(null, null, 0.0f, null, null, this);
    }
}
