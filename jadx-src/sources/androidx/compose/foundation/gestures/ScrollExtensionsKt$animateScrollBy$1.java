package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", i = {0}, l = {38}, m = "animateScrollBy", n = {"previousValue"}, s = {"L$0"})
final class ScrollExtensionsKt$animateScrollBy$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f16983O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16984n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f16985t;

    ScrollExtensionsKt$animateScrollBy$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16985t = obj;
        this.f16983O |= Integer.MIN_VALUE;
        return ScrollExtensionsKt.n(null, 0.0f, null, this);
    }
}
