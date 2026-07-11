package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.annotation.AnyThread;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.PaintCompat;
import androidx.emoji2.text.EmojiCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@AnyThread
@RestrictTo
class DefaultGlyphChecker implements EmojiCompat.GlyphChecker {
    private static final ThreadLocal rl = new ThreadLocal();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TextPaint f38311n;

    private static StringBuilder rl() {
        ThreadLocal threadLocal = rl;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    DefaultGlyphChecker() {
        TextPaint textPaint = new TextPaint();
        this.f38311n = textPaint;
        textPaint.setTextSize(10.0f);
    }

    @Override // androidx.emoji2.text.EmojiCompat.GlyphChecker
    public boolean n(CharSequence charSequence, int i2, int i3, int i5) {
        StringBuilder sbRl = rl();
        sbRl.setLength(0);
        while (i2 < i3) {
            sbRl.append(charSequence.charAt(i2));
            i2++;
        }
        return PaintCompat.n(this.f38311n, sbRl.toString());
    }
}
