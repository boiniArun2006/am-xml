package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {281, 322}, m = "touchSelectionSubsequentPress", n = {"$this$touchSelectionSubsequentPress", "observer", "firstDown", "overSlop", "pointerId", "$this$touchSelectionSubsequentPress", "observer"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1"})
final class SelectionGesturesKt$touchSelectionSubsequentPress$1 extends ContinuationImpl {
    Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f20847O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    int f20848Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f20849n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    /* synthetic */ Object f20850o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    long f20851r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f20852t;

    SelectionGesturesKt$touchSelectionSubsequentPress$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20850o = obj;
        this.f20848Z |= Integer.MIN_VALUE;
        return SelectionGesturesKt.Ik(null, null, null, this);
    }
}
