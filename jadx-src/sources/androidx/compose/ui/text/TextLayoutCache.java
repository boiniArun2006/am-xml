package androidx.compose.ui.text;

import androidx.collection.LruCache;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/TextLayoutCache;", "", "", "capacity", "<init>", "(I)V", "Landroidx/compose/ui/text/TextLayoutInput;", "key", "Landroidx/compose/ui/text/TextLayoutResult;", c.f62177j, "(Landroidx/compose/ui/text/TextLayoutInput;)Landroidx/compose/ui/text/TextLayoutResult;", "value", "", "rl", "(Landroidx/compose/ui/text/TextLayoutInput;Landroidx/compose/ui/text/TextLayoutResult;)V", "Landroidx/collection/LruCache;", "Landroidx/compose/ui/text/CacheTextLayoutInput;", "Landroidx/collection/LruCache;", "cache", "Landroidx/compose/ui/text/CacheTextLayoutInput;", "singleSizeCacheInput", "t", "Landroidx/compose/ui/text/TextLayoutResult;", "singleSizeCacheResult", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextLayoutCache {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LruCache cache;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private CacheTextLayoutInput singleSizeCacheInput;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private TextLayoutResult singleSizeCacheResult;

    public final TextLayoutResult n(TextLayoutInput key) {
        TextLayoutResult textLayoutResult;
        CacheTextLayoutInput cacheTextLayoutInput = new CacheTextLayoutInput(key);
        LruCache lruCache = this.cache;
        if (lruCache != null) {
            textLayoutResult = (TextLayoutResult) lruCache.get(cacheTextLayoutInput);
        } else {
            if (!Intrinsics.areEqual(this.singleSizeCacheInput, cacheTextLayoutInput)) {
                return null;
            }
            textLayoutResult = this.singleSizeCacheResult;
        }
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().rl()) {
            return null;
        }
        return textLayoutResult;
    }

    public final void rl(TextLayoutInput key, TextLayoutResult value) {
        LruCache lruCache = this.cache;
        if (lruCache != null) {
            lruCache.put(new CacheTextLayoutInput(key), value);
        } else {
            this.singleSizeCacheInput = new CacheTextLayoutInput(key);
            this.singleSizeCacheResult = value;
        }
    }

    public TextLayoutCache(int i2) {
        LruCache lruCache;
        if (i2 != 1) {
            lruCache = new LruCache(i2);
        } else {
            lruCache = null;
        }
        this.cache = lruCache;
    }
}
