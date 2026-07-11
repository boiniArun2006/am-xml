package androidx.compose.foundation.gestures;

import com.safedk.android.analytics.events.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureNode", f = "Draggable.kt", i = {0, 0}, l = {544}, m = "processDragStop", n = {"this", a.f62811a}, s = {"L$0", "L$1"})
final class DragGestureNode$processDragStop$1 extends ContinuationImpl {
    final /* synthetic */ DragGestureNode J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f16831O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16832n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f16833r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f16834t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureNode$processDragStop$1(DragGestureNode dragGestureNode, Continuation continuation) {
        super(continuation);
        this.J2 = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16831O = obj;
        this.f16833r |= Integer.MIN_VALUE;
        return this.J2.kR(null, this);
    }
}
