package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.AppBarKt", f = "AppBar.kt", i = {0, 0, 0, 1}, l = {2501, 2515}, m = "settleAppBar", n = {"state", "snapAnimationSpec", "remainingVelocity", "remainingVelocity"}, s = {"L$0", "L$1", "L$2", "L$0"})
final class AppBarKt$settleAppBar$1 extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f24428O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f24429n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f24430r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f24431t;

    AppBarKt$settleAppBar$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f24430r |= Integer.MIN_VALUE;
        return AppBarKt.iF(null, 0.0f, null, null, this);
    }
}
