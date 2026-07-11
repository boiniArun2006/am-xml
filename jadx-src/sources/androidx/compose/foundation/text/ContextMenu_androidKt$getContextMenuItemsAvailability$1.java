package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.ContextMenu_androidKt", f = "ContextMenu.android.kt", i = {0}, l = {154}, m = "getContextMenuItemsAvailability", n = {"$this$getContextMenuItemsAvailability"}, s = {"L$0"})
final class ContextMenu_androidKt$getContextMenuItemsAvailability$1 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f19537O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f19538n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f19539t;

    ContextMenu_androidKt$getContextMenuItemsAvailability$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f19537O = obj;
        this.J2 |= Integer.MIN_VALUE;
        return ContextMenu_androidKt.nr(null, this);
    }
}
