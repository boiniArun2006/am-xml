package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RequiresApi
@RestrictTo
final class EmojiInputConnection extends InputConnectionWrapper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TextView f38401n;
    private final EmojiCompatDeleteHelper rl;

    EmojiInputConnection(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new EmojiCompatDeleteHelper());
    }

    public static class EmojiCompatDeleteHelper {
        public boolean n(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z2) {
            return EmojiCompat.KN(inputConnection, editable, i2, i3, z2);
        }

        public void rl(EditorInfo editorInfo) {
            if (EmojiCompat.gh()) {
                EmojiCompat.t().aYN(editorInfo);
            }
        }
    }

    EmojiInputConnection(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, EmojiCompatDeleteHelper emojiCompatDeleteHelper) {
        super(inputConnection, false);
        this.f38401n = textView;
        this.rl = emojiCompatDeleteHelper;
        emojiCompatDeleteHelper.rl(editorInfo);
    }

    private Editable rl() {
        return this.f38401n.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i2, int i3) {
        return this.rl.n(this, rl(), i2, i3, false) || super.deleteSurroundingText(i2, i3);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        return this.rl.n(this, rl(), i2, i3, true) || super.deleteSurroundingTextInCodePoints(i2, i3);
    }
}
