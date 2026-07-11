package androidx.compose.foundation.gestures;

import com.safedk.android.analytics.events.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {0, 0, 1, 1, 1}, l = {534, 537}, m = "processDragStart", n = {"this", a.f62811a, "this", a.f62811a, "interaction"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
final class DragGestureNode$processDragStart$1 extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f16826O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16827n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f16828o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ DragGestureNode f16829r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f16830t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureNode$processDragStart$1(DragGestureNode dragGestureNode, Continuation continuation) {
        super(continuation);
        this.f16829r = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f16828o |= Integer.MIN_VALUE;
        return this.f16829r.cAB(null, this);
    }
}
