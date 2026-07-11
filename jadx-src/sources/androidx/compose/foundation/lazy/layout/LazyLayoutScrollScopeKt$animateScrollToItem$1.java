package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt", f = "LazyLayoutScrollScope.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {177, 264}, m = "animateScrollToItem", n = {"$this$animateScrollToItem", "loop", "anim", "loops", "index", "scrollOffset", "numOfItemsForTeleport", "targetDistancePx", "boundDistancePx", "minDistancePx", "forward", "$this$animateScrollToItem", "index", "scrollOffset"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "F$0", "F$1", "F$2", "I$3", "L$0", "I$0", "I$1"})
final class LazyLayoutScrollScopeKt$animateScrollToItem$1 extends ContinuationImpl {
    float E2;
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f18525O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f18526S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    int f18527T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    /* synthetic */ Object f18528X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f18529Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f18530e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f18531g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f18532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f18533o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f18534r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f18535t;

    LazyLayoutScrollScopeKt$animateScrollToItem$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18528X = obj;
        this.f18527T |= Integer.MIN_VALUE;
        return LazyLayoutScrollScopeKt.rl(null, 0, 0, 0, null, this);
    }
}
