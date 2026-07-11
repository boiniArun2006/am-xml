package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", i = {0}, l = {544}, m = "tryAwaitRelease", n = {"this"}, s = {"L$0"})
final class PressGestureScopeImpl$tryAwaitRelease$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ PressGestureScopeImpl f16980O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16981n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f16982t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PressGestureScopeImpl$tryAwaitRelease$1(PressGestureScopeImpl pressGestureScopeImpl, Continuation continuation) {
        super(continuation);
        this.f16980O = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16982t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f16980O.kSg(this);
    }
}
