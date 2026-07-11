package androidx.emoji2.viewsintegration;

import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RequiresApi
@RestrictTo
final class EmojiTextWatcher implements TextWatcher {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private EmojiCompat.InitCallback f38410O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final EditText f38411n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f38414t;
    private int J2 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f38413r = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f38412o = true;

    @RequiresApi
    @RestrictTo
    static class InitCallbackImpl extends EmojiCompat.InitCallback implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Reference f38415n;

        @Override // java.lang.Runnable
        public void run() {
            EmojiTextWatcher.rl((EditText) this.f38415n.get(), 1);
        }

        InitCallbackImpl(EditText editText) {
            this.f38415n = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void rl() {
            Handler handler;
            super.rl();
            EditText editText = (EditText) this.f38415n.get();
            if (editText == null || (handler = editText.getHandler()) == null) {
                return;
            }
            handler.post(this);
        }
    }

    static void rl(EditText editText, int i2) {
        if (i2 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            EmojiCompat.t().r(editableText);
            EmojiInputFilter.rl(editableText, selectionStart, selectionEnd);
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
    }

    private boolean nr() {
        if (this.f38412o) {
            return (this.f38414t || EmojiCompat.gh()) ? false : true;
        }
        return true;
    }

    EmojiCompat.InitCallback n() {
        if (this.f38410O == null) {
            this.f38410O = new InitCallbackImpl(this.f38411n);
        }
        return this.f38410O;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
        if (this.f38411n.isInEditMode() || nr() || i3 > i5 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iUo = EmojiCompat.t().Uo();
        if (iUo != 0) {
            if (iUo == 1) {
                EmojiCompat.t().XQ((Spannable) charSequence, i2, i2 + i5, this.J2, this.f38413r);
                return;
            } else if (iUo != 3) {
                return;
            }
        }
        EmojiCompat.t().S(n());
    }

    public void t(boolean z2) {
        if (this.f38412o != z2) {
            if (this.f38410O != null) {
                EmojiCompat.t().WPU(this.f38410O);
            }
            this.f38412o = z2;
            if (z2) {
                rl(this.f38411n, EmojiCompat.t().Uo());
            }
        }
    }

    EmojiTextWatcher(EditText editText, boolean z2) {
        this.f38411n = editText;
        this.f38414t = z2;
    }
}
