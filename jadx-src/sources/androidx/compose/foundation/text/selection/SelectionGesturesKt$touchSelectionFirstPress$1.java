package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 0, 1, 1}, l = {238, 242}, m = "touchSelectionFirstPress", n = {"$this$touchSelectionFirstPress", "observer", "firstDown", "$this$touchSelectionFirstPress", "observer"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
final class SelectionGesturesKt$touchSelectionFirstPress$1 extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f20842O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f20843n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f20844r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f20845t;

    SelectionGesturesKt$touchSelectionFirstPress$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f20844r |= Integer.MIN_VALUE;
        return SelectionGesturesKt.ck(null, null, null, this);
    }
}
