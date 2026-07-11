package androidx.compose.foundation.contextmenu;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.contextmenu.ContextMenuGestures_androidKt", f = "ContextMenuGestures.android.kt", i = {0}, l = {71}, m = "awaitFirstRightClickDown", n = {"$this$awaitFirstRightClickDown"}, s = {"L$0"})
final class ContextMenuGestures_androidKt$awaitFirstRightClickDown$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f16355O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f16356n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    /* synthetic */ Object f16357t;

    ContextMenuGestures_androidKt$awaitFirstRightClickDown$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f16357t = obj;
        this.f16355O |= Integer.MIN_VALUE;
        return ContextMenuGestures_androidKt.rl(null, this);
    }
}
