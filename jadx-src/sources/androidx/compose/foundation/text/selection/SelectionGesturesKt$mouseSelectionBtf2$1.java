package androidx.compose.foundation.text.selection;

import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0, 0, 1, 1, 1}, l = {357, RendererCapabilities.DECODER_SUPPORT_MASK}, m = "mouseSelectionBtf2", n = {"$this$mouseSelectionBtf2", "observer", "$this$mouseSelectionBtf2", "observer", "dragConsumed"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
final class SelectionGesturesKt$mouseSelectionBtf2$1 extends ContinuationImpl {
    /* synthetic */ Object J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f20819O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f20820n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f20821r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Object f20822t;

    SelectionGesturesKt$mouseSelectionBtf2$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.J2 = obj;
        this.f20821r |= Integer.MIN_VALUE;
        return SelectionGesturesKt.qie(null, null, null, null, this);
    }
}
