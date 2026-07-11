package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", i = {0}, l = {430}, m = "awaitDown", n = {"$this$awaitDown"}, s = {"L$0"})
final class SelectionGesturesKt$awaitDown$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f20808O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f20809n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f20810t;

    SelectionGesturesKt$awaitDown$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20810t = obj;
        this.f20808O |= Integer.MIN_VALUE;
        return SelectionGesturesKt.KN(null, this);
    }
}
