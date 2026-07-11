package androidx.compose.ui.text.font;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\u0001\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceRequestCache;", c.f62177j, "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "rl", "()Landroidx/compose/ui/text/font/TypefaceRequestCache;", "GlobalTypefaceRequestCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "()Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "GlobalAsyncTypefaceCache", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FontFamilyResolverKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final TypefaceRequestCache f33670n = new TypefaceRequestCache();
    private static final AsyncTypefaceCache rl = new AsyncTypefaceCache();

    public static final AsyncTypefaceCache n() {
        return rl;
    }

    public static final TypefaceRequestCache rl() {
        return f33670n;
    }
}
