package androidx.compose.ui.text.android;

import android.text.GraphemeClusterSegmentFinder;
import android.text.TextPaint;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract /* synthetic */ class j {
    public static /* synthetic */ GraphemeClusterSegmentFinder n(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }
}
