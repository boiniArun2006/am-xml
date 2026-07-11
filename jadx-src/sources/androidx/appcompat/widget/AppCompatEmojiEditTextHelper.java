package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.appcompat.R;
import androidx.emoji2.viewsintegration.EmojiEditTextHelper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class AppCompatEmojiEditTextHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final EditText f14079n;
    private final EmojiEditTextHelper rl;

    void O(boolean z2) {
        this.rl.t(z2);
    }

    InputConnection nr(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.rl.rl(inputConnection, editorInfo);
    }

    boolean rl(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    void t(AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = this.f14079n.getContext().obtainStyledAttributes(attributeSet, R.styleable.dR0, i2, 0);
        try {
            int i3 = R.styleable.ul;
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(i3) ? typedArrayObtainStyledAttributes.getBoolean(i3, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            O(z2);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    AppCompatEmojiEditTextHelper(EditText editText) {
        this.f14079n = editText;
        this.rl = new EmojiEditTextHelper(editText, false);
    }

    KeyListener n(KeyListener keyListener) {
        if (rl(keyListener)) {
            return this.rl.n(keyListener);
        }
        return keyListener;
    }
}
