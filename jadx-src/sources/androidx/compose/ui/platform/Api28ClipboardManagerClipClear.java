package androidx.compose.ui.platform;

import androidx.annotation.RequiresApi;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/Api28ClipboardManagerClipClear;", "", "<init>", "()V", "Landroid/content/ClipboardManager;", "clipboardManager", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/content/ClipboardManager;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class Api28ClipboardManagerClipClear {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Api28ClipboardManagerClipClear f32864n = new Api28ClipboardManagerClipClear();

    private Api28ClipboardManagerClipClear() {
    }

    public static final void n(android.content.ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }
}
