package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract /* synthetic */ class fuX {
    public static /* synthetic */ BoringLayout n(CharSequence charSequence, TextPaint textPaint, int i2, Layout.Alignment alignment, float f3, float f4, BoringLayout.Metrics metrics, boolean z2, TextUtils.TruncateAt truncateAt, int i3, boolean z3) {
        return new BoringLayout(charSequence, textPaint, i2, alignment, f3, f4, metrics, z2, truncateAt, i3, z3);
    }
}
