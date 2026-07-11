package androidx.compose.foundation.gestures.snapping;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {101}, m = "performFling", n = {}, s = {})
final class SnapFlingBehavior$performFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f17311O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    /* synthetic */ Object f17312n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ SnapFlingBehavior f17313t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnapFlingBehavior$performFling$1(SnapFlingBehavior snapFlingBehavior, Continuation continuation) {
        super(continuation);
        this.f17313t = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17312n = obj;
        this.f17311O |= Integer.MIN_VALUE;
        return this.f17313t.t(null, 0.0f, null, this);
    }
}
