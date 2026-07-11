package androidx.compose.ui.text.android;

import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/text/android/HorizontalPositionCache;", "", "Landroidx/compose/ui/text/android/TextLayout;", TtmlNode.TAG_LAYOUT, "<init>", "(Landroidx/compose/ui/text/android/TextLayout;)V", "", "offset", "", "upstream", "cache", "primary", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(IZZZ)F", "rl", "(I)F", "t", "nr", "O", "Landroidx/compose/ui/text/android/TextLayout;", "getLayout", "()Landroidx/compose/ui/text/android/TextLayout;", "I", "cachedKey", "F", "cachedValue", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class HorizontalPositionCache {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final TextLayout layout;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int cachedKey = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float cachedValue;

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final float n(int offset, boolean upstream, boolean cache, boolean primary) {
        boolean z2;
        int i2 = 1;
        if (upstream) {
            int iN = LayoutCompat_androidKt.n(this.layout.getAndroidx.media3.extractor.text.ttml.TtmlNode.TAG_LAYOUT java.lang.String(), offset, upstream);
            z2 = offset == this.layout.S(iN) || offset == this.layout.ck(iN);
        }
        int i3 = offset * 4;
        if (!primary) {
            i2 = z2 ? 2 : 3;
        } else if (z2) {
            i2 = 0;
        }
        int i5 = i3 + i2;
        if (this.cachedKey == i5) {
            return this.cachedValue;
        }
        float fG = primary ? this.layout.g(offset, upstream) : this.layout.fD(offset, upstream);
        if (cache) {
            this.cachedKey = i5;
            this.cachedValue = fG;
        }
        return fG;
    }

    public final float O(int offset) {
        return n(offset, true, true, false);
    }

    public final float nr(int offset) {
        return n(offset, false, false, false);
    }

    public final float rl(int offset) {
        return n(offset, false, false, true);
    }

    public final float t(int offset) {
        return n(offset, true, true, true);
    }

    public HorizontalPositionCache(TextLayout textLayout) {
        this.layout = textLayout;
    }
}
