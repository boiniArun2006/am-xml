package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", i = {0, 0, 0, 0, 0}, l = {227}, m = "dispatchMouseWheelScroll$waitNextScrollDelta", n = {"this$0", "targetScrollDelta", "targetValue", "$this_dispatchMouseWheelScroll", "animationState"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f16946O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f16947Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16948n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    /* synthetic */ Object f16949o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Object f16950r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f16951t;

    MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16949o = obj;
        this.f16947Z |= Integer.MIN_VALUE;
        return MouseWheelScrollingLogic.o(null, null, null, null, null, 0L, this);
    }
}
