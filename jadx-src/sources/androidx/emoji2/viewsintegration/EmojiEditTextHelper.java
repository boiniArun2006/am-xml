package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class EmojiEditTextHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HelperInternal f38396n;
    private int rl = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f38397t = 0;

    @RequiresApi
    private static class HelperInternal19 extends HelperInternal {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final EditText f38398n;
        private final EmojiTextWatcher rl;

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        KeyListener n(KeyListener keyListener) {
            if (keyListener instanceof EmojiKeyListener) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new EmojiKeyListener(keyListener);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        InputConnection rl(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof EmojiInputConnection ? inputConnection : new EmojiInputConnection(this.f38398n, inputConnection, editorInfo);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        void t(boolean z2) {
            this.rl.t(z2);
        }

        HelperInternal19(EditText editText, boolean z2) {
            this.f38398n = editText;
            EmojiTextWatcher emojiTextWatcher = new EmojiTextWatcher(editText, z2);
            this.rl = emojiTextWatcher;
            editText.addTextChangedListener(emojiTextWatcher);
            editText.setEditableFactory(EmojiEditableFactory.getInstance());
        }
    }

    static class HelperInternal {
        KeyListener n(KeyListener keyListener) {
            return keyListener;
        }

        InputConnection rl(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection;
        }

        void t(boolean z2) {
        }

        HelperInternal() {
        }
    }

    public KeyListener n(KeyListener keyListener) {
        return this.f38396n.n(keyListener);
    }

    public InputConnection rl(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f38396n.rl(inputConnection, editorInfo);
    }

    public void t(boolean z2) {
        this.f38396n.t(z2);
    }

    public EmojiEditTextHelper(EditText editText, boolean z2) {
        Preconditions.KN(editText, "editText cannot be null");
        this.f38396n = new HelperInternal19(editText, z2);
    }
}
