package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {}, l = {537}, m = "awaitRelease", n = {}, s = {})
final class PressGestureScopeImpl$awaitRelease$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f16974O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    /* synthetic */ Object f16975n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ PressGestureScopeImpl f16976t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PressGestureScopeImpl$awaitRelease$1(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
        super(continuation);
        this.f16976t = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16975n = obj;
        this.f16974O |= Integer.MIN_VALUE;
        return this.f16976t.g6(this);
    }
}
