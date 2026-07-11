package androidx.compose.ui.text.style;

import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/style/TextGeometricTransform;", TtmlNode.START, "stop", "", "fraction", c.f62177j, "(Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/style/TextGeometricTransform;F)Landroidx/compose/ui/text/style/TextGeometricTransform;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextGeometricTransformKt {
    public static final TextGeometricTransform n(TextGeometricTransform textGeometricTransform, TextGeometricTransform textGeometricTransform2, float f3) {
        return new TextGeometricTransform(MathHelpersKt.rl(textGeometricTransform.getScaleX(), textGeometricTransform2.getScaleX(), f3), MathHelpersKt.rl(textGeometricTransform.getSkewX(), textGeometricTransform2.getSkewX(), f3));
    }
}
