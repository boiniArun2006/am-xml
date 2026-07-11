package androidx.compose.ui.text.android;

import android.text.StaticLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "", "Landroidx/compose/ui/text/android/StaticLayoutParams;", "params", "Landroid/text/StaticLayout;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroidx/compose/ui/text/android/StaticLayoutParams;)Landroid/text/StaticLayout;", TtmlNode.TAG_LAYOUT, "", "useFallbackLineSpacing", "rl", "(Landroid/text/StaticLayout;Z)Z", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
interface StaticLayoutFactoryImpl {
    StaticLayout n(StaticLayoutParams params);

    boolean rl(StaticLayout layout, boolean useFallbackLineSpacing);
}
