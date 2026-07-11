package androidx.compose.foundation.gestures.snapping;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {175}, m = "tryApproach", n = {}, s = {})
final class SnapFlingBehavior$tryApproach$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f17314O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    /* synthetic */ Object f17315n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ SnapFlingBehavior f17316t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SnapFlingBehavior$tryApproach$1(SnapFlingBehavior snapFlingBehavior, Continuation continuation) {
        super(continuation);
        this.f17316t = snapFlingBehavior;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17315n = obj;
        this.f17314O |= Integer.MIN_VALUE;
        return this.f17316t.qie(null, 0.0f, 0.0f, null, this);
    }
}
