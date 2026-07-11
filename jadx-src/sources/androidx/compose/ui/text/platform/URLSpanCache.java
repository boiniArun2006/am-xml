package androidx.compose.ui.text.platform;

import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.UrlAnnotation;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R&\u0010\u0016\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R&\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\u0004\u0012\u00020\u00170\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/platform/URLSpanCache;", "", "<init>", "()V", "Landroidx/compose/ui/text/UrlAnnotation;", "urlAnnotation", "Landroid/text/style/URLSpan;", "t", "(Landroidx/compose/ui/text/UrlAnnotation;)Landroid/text/style/URLSpan;", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/LinkAnnotation$Url;", "urlRange", "rl", "(Landroidx/compose/ui/text/AnnotatedString$Range;)Landroid/text/style/URLSpan;", "Landroidx/compose/ui/text/LinkAnnotation;", "linkRange", "Landroid/text/style/ClickableSpan;", c.f62177j, "(Landroidx/compose/ui/text/AnnotatedString$Range;)Landroid/text/style/ClickableSpan;", "Ljava/util/WeakHashMap;", "Ljava/util/WeakHashMap;", "spansByAnnotation", "urlSpansByAnnotation", "Landroidx/compose/ui/text/platform/ComposeClickableSpan;", "linkSpansWithListenerByAnnotation", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InternalTextApi
@RestrictTo
@SourceDebugExtension({"SMAP\nURLSpanCache.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLSpanCache.android.kt\nandroidx/compose/ui/text/platform/URLSpanCache\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,76:1\n372#2,7:77\n372#2,7:84\n372#2,7:91\n*S KotlinDebug\n*F\n+ 1 URLSpanCache.android.kt\nandroidx/compose/ui/text/platform/URLSpanCache\n*L\n56#1:77,7\n59#1:84,7\n66#1:91,7\n*E\n"})
public final class URLSpanCache {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final WeakHashMap spansByAnnotation = new WeakHashMap();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final WeakHashMap urlSpansByAnnotation = new WeakHashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final WeakHashMap linkSpansWithListenerByAnnotation = new WeakHashMap();

    public final ClickableSpan n(AnnotatedString.Range linkRange) {
        WeakHashMap weakHashMap = this.linkSpansWithListenerByAnnotation;
        Object composeClickableSpan = weakHashMap.get(linkRange);
        if (composeClickableSpan == null) {
            composeClickableSpan = new ComposeClickableSpan((LinkAnnotation) linkRange.getItem());
            weakHashMap.put(linkRange, composeClickableSpan);
        }
        return (ClickableSpan) composeClickableSpan;
    }

    public final URLSpan rl(AnnotatedString.Range urlRange) {
        WeakHashMap weakHashMap = this.urlSpansByAnnotation;
        Object uRLSpan = weakHashMap.get(urlRange);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(((LinkAnnotation.Url) urlRange.getItem()).getUrl());
            weakHashMap.put(urlRange, uRLSpan);
        }
        return (URLSpan) uRLSpan;
    }

    public final URLSpan t(UrlAnnotation urlAnnotation) {
        WeakHashMap weakHashMap = this.spansByAnnotation;
        Object uRLSpan = weakHashMap.get(urlAnnotation);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(urlAnnotation.getUrl());
            weakHashMap.put(urlAnnotation, uRLSpan);
        }
        return (URLSpan) uRLSpan;
    }
}
