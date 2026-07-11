package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.ContextMenu_androidKt", f = "ContextMenu.android.kt", i = {0, 0, 0}, l = {167}, m = "getContextMenuItemsAvailability", n = {"$this$getContextMenuItemsAvailability", "isPassword", "hasSelection"}, s = {"L$0", "I$0", "I$1"})
final class ContextMenu_androidKt$getContextMenuItemsAvailability$2 extends ContinuationImpl {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f19540O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f19541n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f19542o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    /* synthetic */ Object f19543r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f19544t;

    ContextMenu_androidKt$getContextMenuItemsAvailability$2(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f19543r = obj;
        this.f19542o |= Integer.MIN_VALUE;
        return ContextMenu_androidKt.O(null, this);
    }
}
