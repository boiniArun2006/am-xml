package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", i = {0, 0}, l = {1548}, m = "emit", n = {"this", "latestInputs"}, s = {"L$0", "L$1"})
final class AnchoredDraggableKt$restartable$2$1$emit$1 extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f16498O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16499n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f16500o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ AnchoredDraggableKt$restartable$2.AnonymousClass1 f16501r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f16502t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableKt$restartable$2$1$emit$1(AnchoredDraggableKt$restartable$2.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.f16501r = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f16500o |= Integer.MIN_VALUE;
        return this.f16501r.rl(null, this);
    }
}
