package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.StaticLayout;
import androidx.annotation.RequiresApi;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory23;", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "<init>", "()V", "Landroidx/compose/ui/text/android/StaticLayoutParams;", "params", "Landroid/text/StaticLayout;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroidx/compose/ui/text/android/StaticLayoutParams;)Landroid/text/StaticLayout;", TtmlNode.TAG_LAYOUT, "", "useFallbackLineSpacing", "rl", "(Landroid/text/StaticLayout;Z)Z", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class StaticLayoutFactory23 implements StaticLayoutFactoryImpl {
    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public boolean rl(StaticLayout layout, boolean useFallbackLineSpacing) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            return StaticLayoutFactory33.n(layout);
        }
        if (i2 >= 28) {
            return useFallbackLineSpacing;
        }
        return false;
    }

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public StaticLayout n(StaticLayoutParams params) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(params.getText(), params.getAndroidx.media3.extractor.text.ttml.TtmlNode.START java.lang.String(), params.getAndroidx.media3.extractor.text.ttml.TtmlNode.END java.lang.String(), params.getPaint(), params.getWidth());
        builderObtain.setTextDirection(params.getTextDir());
        builderObtain.setAlignment(params.getAlignment());
        builderObtain.setMaxLines(params.getMaxLines());
        builderObtain.setEllipsize(params.getEllipsize());
        builderObtain.setEllipsizedWidth(params.getEllipsizedWidth());
        builderObtain.setLineSpacing(params.getLineSpacingExtra(), params.getLineSpacingMultiplier());
        builderObtain.setIncludePad(params.getIncludePadding());
        builderObtain.setBreakStrategy(params.getBreakStrategy());
        builderObtain.setHyphenationFrequency(params.getHyphenationFrequency());
        builderObtain.setIndents(params.getLeftIndents(), params.getRightIndents());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            StaticLayoutFactory26.n(builderObtain, params.getJustificationMode());
        }
        if (i2 >= 28) {
            StaticLayoutFactory28.n(builderObtain, params.getUseFallbackLineSpacing());
        }
        if (i2 >= 33) {
            StaticLayoutFactory33.rl(builderObtain, params.getLineBreakStyle(), params.getLineBreakWordStyle());
        }
        if (i2 >= 35) {
            StaticLayoutFactory35.n(builderObtain);
        }
        return builderObtain.build();
    }
}
