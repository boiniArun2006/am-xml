package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.SliderKt", f = "Slider.kt", i = {0}, l = {1426}, m = "awaitSlop-8vUncbI", n = {"initialDelta"}, s = {"L$0"})
final class SliderKt$awaitSlop$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f27766O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f27767n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f27768t;

    SliderKt$awaitSlop$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27768t = obj;
        this.f27766O |= Integer.MIN_VALUE;
        return SliderKt.XQ(null, 0L, 0, this);
    }
}
