package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", i = {0, 1}, l = {898, 901}, m = "onPostFling-RZ2iAVY", n = {"available", "available"}, s = {"J$0", "J$0"})
final class ScrollableNestedScrollConnection$onPostFling$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ ScrollableNestedScrollConnection f17025O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    long f17026n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f17027t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableNestedScrollConnection$onPostFling$1(ScrollableNestedScrollConnection scrollableNestedScrollConnection, Continuation continuation) {
        super(continuation);
        this.f17025O = scrollableNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17027t = obj;
        this.J2 |= Integer.MIN_VALUE;
        return this.f17025O.z(0L, 0L, this);
    }
}
