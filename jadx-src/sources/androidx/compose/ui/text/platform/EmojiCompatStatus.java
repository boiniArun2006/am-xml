package androidx.compose.ui.text.platform;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0006\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/platform/EmojiCompatStatus;", "Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;", "<init>", "()V", "rl", "Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;", "delegate", "Landroidx/compose/runtime/State;", "", c.f62177j, "()Landroidx/compose/runtime/State;", "fontLoaded", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EmojiCompatStatus implements EmojiCompatStatusDelegate {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EmojiCompatStatus f33852n = new EmojiCompatStatus();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static EmojiCompatStatusDelegate delegate = new DefaultImpl();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f33853t = 8;

    @Override // androidx.compose.ui.text.platform.EmojiCompatStatusDelegate
    public State n() {
        return delegate.n();
    }

    private EmojiCompatStatus() {
    }
}
