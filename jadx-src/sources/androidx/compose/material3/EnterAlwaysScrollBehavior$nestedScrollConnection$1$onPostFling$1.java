package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1", f = "AppBar.kt", i = {0, 0}, l = {2386, 2388}, m = "onPostFling-RZ2iAVY", n = {"this", "available"}, s = {"L$0", "J$0"})
final class EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {
    final /* synthetic */ EnterAlwaysScrollBehavior$nestedScrollConnection$1 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f25715O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f25716n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f25717r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    long f25718t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(EnterAlwaysScrollBehavior$nestedScrollConnection$1 enterAlwaysScrollBehavior$nestedScrollConnection$1, Continuation continuation) {
        super(continuation);
        this.J2 = enterAlwaysScrollBehavior$nestedScrollConnection$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25715O = obj;
        this.f25717r |= Integer.MIN_VALUE;
        return this.J2.z(0L, 0L, this);
    }
}
