package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/graphics/Paint$FontMetricsInt;", "", c.f62177j, "(Landroid/graphics/Paint$FontMetricsInt;)I", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LineHeightStyleSpan_androidKt {
    public static final int n(Paint.FontMetricsInt fontMetricsInt) {
        return fontMetricsInt.descent - fontMetricsInt.ascent;
    }
}
