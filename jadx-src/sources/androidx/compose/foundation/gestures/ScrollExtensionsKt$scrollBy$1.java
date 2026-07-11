package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", i = {0}, l = {57}, m = "scrollBy", n = {"consumed"}, s = {"L$0"})
final class ScrollExtensionsKt$scrollBy$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f16992O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16993n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f16994t;

    ScrollExtensionsKt$scrollBy$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16994t = obj;
        this.f16992O |= Integer.MIN_VALUE;
        return ScrollExtensionsKt.rl(null, 0.0f, this);
    }
}
