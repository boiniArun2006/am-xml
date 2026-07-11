package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt", f = "AnchoredDraggable.kt", i = {}, l = {720}, m = "restartable", n = {}, s = {})
final class AnchoredDraggableKt$restartable$1<I> extends ContinuationImpl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    /* synthetic */ Object f21076n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f21077t;

    AnchoredDraggableKt$restartable$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f21076n = obj;
        this.f21077t |= Integer.MIN_VALUE;
        return AnchoredDraggableKt.mUb(null, null, this);
    }
}
