package androidx.media3.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.LanguageFeatureSpan;
import androidx.media3.common.util.Assertions;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class SubtitleViewUtils {
    public static float resolveTextSize(int i2, float f3, int i3, int i5) {
        float f4;
        if (f3 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i2 == 0) {
            f4 = i5;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    return -3.4028235E38f;
                }
                return f3;
            }
            f4 = i3;
        }
        return f3 * f4;
    }

    public static /* synthetic */ boolean n(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static /* synthetic */ boolean rl(Object obj) {
        return !(obj instanceof LanguageFeatureSpan);
    }

    private SubtitleViewUtils() {
    }

    public static void removeAllEmbeddedStyling(Cue.Builder builder) {
        builder.clearWindowColor();
        if (builder.getText() instanceof Spanned) {
            if (!(builder.getText() instanceof Spannable)) {
                builder.setText(SpannableString.valueOf(builder.getText()));
            }
            removeSpansIf((Spannable) Assertions.checkNotNull(builder.getText()), new t1.eO() { // from class: androidx.media3.ui.h
                @Override // t1.eO
                public final boolean apply(Object obj) {
                    return SubtitleViewUtils.rl(obj);
                }
            });
        }
        removeEmbeddedFontSizes(builder);
    }

    public static void removeEmbeddedFontSizes(Cue.Builder builder) {
        builder.setTextSize(-3.4028235E38f, Integer.MIN_VALUE);
        if (builder.getText() instanceof Spanned) {
            if (!(builder.getText() instanceof Spannable)) {
                builder.setText(SpannableString.valueOf(builder.getText()));
            }
            removeSpansIf((Spannable) Assertions.checkNotNull(builder.getText()), new t1.eO() { // from class: androidx.media3.ui.K
                @Override // t1.eO
                public final boolean apply(Object obj) {
                    return SubtitleViewUtils.n(obj);
                }
            });
        }
    }

    private static void removeSpansIf(Spannable spannable, t1.eO eOVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (eOVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }
}
