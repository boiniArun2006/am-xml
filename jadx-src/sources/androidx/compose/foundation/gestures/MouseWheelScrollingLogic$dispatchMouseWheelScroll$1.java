package androidx.compose.foundation.gestures;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", f = "MouseWheelScrollable.kt", i = {0, 0, 0, 0}, l = {244, l.f62286h}, m = "dispatchMouseWheelScroll", n = {"this", "$this$dispatchMouseWheelScroll", "targetValue", "speed"}, s = {"L$0", "L$1", "L$2", "F$0"})
final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 extends ContinuationImpl {
    float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f16926O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f16927Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16928n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ MouseWheelScrollingLogic f16929o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    /* synthetic */ Object f16930r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f16931t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MouseWheelScrollingLogic$dispatchMouseWheelScroll$1(MouseWheelScrollingLogic mouseWheelScrollingLogic, Continuation continuation) {
        super(continuation);
        this.f16929o = mouseWheelScrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16930r = obj;
        this.f16927Z |= Integer.MIN_VALUE;
        return this.f16929o.r(null, null, 0.0f, 0.0f, this);
    }
}
