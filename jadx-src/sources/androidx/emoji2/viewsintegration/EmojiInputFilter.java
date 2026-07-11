package androidx.emoji2.viewsintegration;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
@RestrictTo
final class EmojiInputFilter implements InputFilter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TextView f38402n;
    private EmojiCompat.InitCallback rl;

    @RequiresApi
    @RestrictTo
    static class InitCallbackImpl extends EmojiCompat.InitCallback implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Reference f38403n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Reference f38404t;

        private boolean t(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            CharSequence text;
            CharSequence charSequenceR;
            TextView textView = (TextView) this.f38403n.get();
            if (t(textView, (InputFilter) this.f38404t.get()) && textView.isAttachedToWindow() && text != (charSequenceR = EmojiCompat.t().r((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceR);
                int selectionEnd = Selection.getSelectionEnd(charSequenceR);
                textView.setText(charSequenceR);
                if (charSequenceR instanceof Spannable) {
                    EmojiInputFilter.rl((Spannable) charSequenceR, selectionStart, selectionEnd);
                }
            }
        }

        InitCallbackImpl(TextView textView, EmojiInputFilter emojiInputFilter) {
            this.f38403n = new WeakReference(textView);
            this.f38404t = new WeakReference(emojiInputFilter);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void rl() {
            Handler handler;
            super.rl();
            TextView textView = (TextView) this.f38403n.get();
            if (textView != null && (handler = textView.getHandler()) != null) {
                handler.post(this);
            }
        }
    }

    static void rl(Spannable spannable, int i2, int i3) {
        if (i2 >= 0 && i3 >= 0) {
            Selection.setSelection(spannable, i2, i3);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        } else if (i3 >= 0) {
            Selection.setSelection(spannable, i3);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i5, int i7) {
        if (this.f38402n.isInEditMode()) {
            return charSequence;
        }
        int iUo = EmojiCompat.t().Uo();
        if (iUo != 0) {
            if (iUo == 1) {
                if ((i7 == 0 && i5 == 0 && spanned.length() == 0 && charSequence == this.f38402n.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i2 != 0 || i3 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i2, i3);
                }
                return EmojiCompat.t().o(charSequence, 0, charSequence.length());
            }
            if (iUo != 3) {
                return charSequence;
            }
        }
        EmojiCompat.t().S(n());
        return charSequence;
    }

    EmojiCompat.InitCallback n() {
        if (this.rl == null) {
            this.rl = new InitCallbackImpl(this.f38402n, this);
        }
        return this.rl;
    }

    EmojiInputFilter(TextView textView) {
        this.f38402n = textView;
    }
}
