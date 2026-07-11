package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import android.view.inputmethod.CursorAnchorInfo;
import com.safedk.android.analytics.events.a;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J/\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "", "", "rl", "()V", "", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(IIII)V", "Landroid/view/inputmethod/CursorAnchorInfo;", "info", "t", "(Landroid/view/inputmethod/CursorAnchorInfo;)V", "Landroid/view/KeyEvent;", a.f62811a, "sendKeyEvent", "(Landroid/view/KeyEvent;)V", "O", "J2", "Uo", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ComposeInputMethodManager {
    void J2();

    void O();

    void Uo();

    void n(int selectionStart, int selectionEnd, int compositionStart, int compositionEnd);

    void rl();

    void sendKeyEvent(KeyEvent event);

    void t(CursorAnchorInfo info);
}
