package androidx.media3.common.text;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@UnstableApi
public final class SpanUtil {
    public static void addInheritedRelativeSizeSpan(Spannable spannable, float f3, int i2, int i3, int i5) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i2, i3, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i2 && spannable.getSpanEnd(relativeSizeSpan) >= i3) {
                f3 *= relativeSizeSpan.getSizeChange();
            }
            removeIfStartEndAndFlagsMatch(spannable, relativeSizeSpan, i2, i3, i5);
        }
        spannable.setSpan(new RelativeSizeSpan(f3), i2, i3, i5);
    }

    private SpanUtil() {
    }

    public static void addOrReplaceSpan(Spannable spannable, Object obj, int i2, int i3, int i5) {
        for (Object obj2 : spannable.getSpans(i2, i3, obj.getClass())) {
            removeIfStartEndAndFlagsMatch(spannable, obj2, i2, i3, i5);
        }
        spannable.setSpan(obj, i2, i3, i5);
    }

    private static void removeIfStartEndAndFlagsMatch(Spannable spannable, Object obj, int i2, int i3, int i5) {
        if (spannable.getSpanStart(obj) == i2 && spannable.getSpanEnd(obj) == i3 && spannable.getSpanFlags(obj) == i5) {
            spannable.removeSpan(obj);
        }
    }
}
