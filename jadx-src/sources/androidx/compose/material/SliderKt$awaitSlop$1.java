package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SliderKt", f = "Slider.kt", i = {0}, l = {903}, m = "awaitSlop-8vUncbI", n = {"initialDelta"}, s = {"L$0"})
final class SliderKt$awaitSlop$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f22912O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f22913n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f22914t;

    SliderKt$awaitSlop$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22914t = obj;
        this.f22912O |= Integer.MIN_VALUE;
        return SliderKt.aYN(null, 0L, 0, this);
    }
}
