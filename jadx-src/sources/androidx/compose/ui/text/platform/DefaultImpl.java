package androidx.compose.ui.text.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.emoji2.text.EmojiCompat;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/platform/DefaultImpl;", "Landroidx/compose/ui/text/platform/EmojiCompatStatusDelegate;", "<init>", "()V", "Landroidx/compose/runtime/State;", "", "t", "()Landroidx/compose/runtime/State;", c.f62177j, "Landroidx/compose/runtime/State;", "loadState", "fontLoaded", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultImpl implements EmojiCompatStatusDelegate {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private State loadState;

    @Override // androidx.compose.ui.text.platform.EmojiCompatStatusDelegate
    public State n() {
        State state = this.loadState;
        if (state != null) {
            Intrinsics.checkNotNull(state);
            return state;
        }
        if (!EmojiCompat.gh()) {
            return EmojiCompatStatus_androidKt.f33854n;
        }
        State stateT = t();
        this.loadState = stateT;
        Intrinsics.checkNotNull(stateT);
        return stateT;
    }

    public DefaultImpl() {
        State stateT;
        if (EmojiCompat.gh()) {
            stateT = t();
        } else {
            stateT = null;
        }
        this.loadState = stateT;
    }

    private final State t() {
        EmojiCompat emojiCompatT = EmojiCompat.t();
        if (emojiCompatT.Uo() != 1) {
            final MutableState mutableStateO = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
            emojiCompatT.S(new EmojiCompat.InitCallback() { // from class: androidx.compose.ui.text.platform.DefaultImpl$getFontLoadState$initCallback$1
                @Override // androidx.emoji2.text.EmojiCompat.InitCallback
                public void n(Throwable throwable) {
                    this.loadState = EmojiCompatStatus_androidKt.f33854n;
                }

                @Override // androidx.emoji2.text.EmojiCompat.InitCallback
                public void rl() {
                    mutableStateO.setValue(Boolean.TRUE);
                    this.loadState = new ImmutableBool(true);
                }
            });
            return mutableStateO;
        }
        return new ImmutableBool(true);
    }
}
