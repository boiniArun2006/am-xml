package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1", f = "AppBar.kt", i = {0, 0}, l = {1769, 1771}, m = "onPostFling-RZ2iAVY", n = {"this", "available"}, s = {"L$0", "J$0"})
final class ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {
    final /* synthetic */ ExitAlwaysScrollBehavior$nestedScrollConnection$1 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f25726O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f25727n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f25728r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    long f25729t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(ExitAlwaysScrollBehavior$nestedScrollConnection$1 exitAlwaysScrollBehavior$nestedScrollConnection$1, Continuation continuation) {
        super(continuation);
        this.J2 = exitAlwaysScrollBehavior$nestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25726O = obj;
        this.f25728r |= Integer.MIN_VALUE;
        return this.J2.z(0L, 0L, this);
    }
}
