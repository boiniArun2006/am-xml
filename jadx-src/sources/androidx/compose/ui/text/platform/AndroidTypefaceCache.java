package androidx.compose.ui.text.platform;

import androidx.collection.SieveCache;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTypefaceCache;", "", "<init>", "()V", "Landroidx/collection/SieveCache;", "", "Landroid/graphics/Typeface;", "rl", "Landroidx/collection/SieveCache;", "cache", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(message = "Duplicate cache")
@SourceDebugExtension({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidTypefaceCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SieveCache.kt\nandroidx/collection/SieveCache\n*L\n1#1,174:1\n1#2:175\n251#3,2:176\n*S KotlinDebug\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidTypefaceCache\n*L\n142#1:176,2\n*E\n"})
public final class AndroidTypefaceCache {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AndroidTypefaceCache f33843n = new AndroidTypefaceCache();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final SieveCache cache = new SieveCache(16, 16, null, null, null, 28, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f33844t = 8;

    private AndroidTypefaceCache() {
    }
}
