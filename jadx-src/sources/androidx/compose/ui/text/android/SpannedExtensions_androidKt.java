package androidx.compose.ui.text.android;

import android.text.Spanned;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\t\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/text/Spanned;", "Ljava/lang/Class;", "clazz", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Landroid/text/Spanned;Ljava/lang/Class;)Z", "", "startInclusive", "endExclusive", "rl", "(Landroid/text/Spanned;Ljava/lang/Class;II)Z", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SpannedExtensions_androidKt {
    public static final boolean rl(Spanned spanned, Class cls, int i2, int i3) {
        return spanned.nextSpanTransition(i2 - 1, i3, cls) != i3;
    }

    public static final boolean n(Spanned spanned, Class cls) {
        if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
            return true;
        }
        return false;
    }
}
