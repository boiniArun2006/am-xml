package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/AndroidClipboard;", "Landroidx/compose/ui/platform/Clipboard;", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "androidClipboardManager", "<init>", "(Landroidx/compose/ui/platform/AndroidClipboardManager;)V", "Landroidx/compose/ui/platform/ClipEntry;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clipEntry", "", "rl", "(Landroidx/compose/ui/platform/ClipEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidClipboard implements Clipboard {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AndroidClipboardManager androidClipboardManager;

    @Override // androidx.compose.ui.platform.Clipboard
    public Object n(Continuation continuation) {
        return this.androidClipboardManager.n();
    }

    @Override // androidx.compose.ui.platform.Clipboard
    public Object rl(ClipEntry clipEntry, Continuation continuation) {
        this.androidClipboardManager.t(clipEntry);
        return Unit.INSTANCE;
    }

    public AndroidClipboard(AndroidClipboardManager androidClipboardManager) {
        this.androidClipboardManager = androidClipboardManager;
    }
}
