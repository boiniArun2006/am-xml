package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", i = {0, 0}, l = {782}, m = "doFlingAnimation-QWom1Mo", n = {"this", "result"}, s = {"L$0", "L$1"})
final class ScrollingLogic$doFlingAnimation$1 extends ContinuationImpl {
    final /* synthetic */ ScrollingLogic J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f17068O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f17069n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f17070r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f17071t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$doFlingAnimation$1(ScrollingLogic scrollingLogic, Continuation continuation) {
        super(continuation);
        this.J2 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17068O = obj;
        this.f17070r |= Integer.MIN_VALUE;
        return this.J2.ck(0L, this);
    }
}
