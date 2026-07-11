package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\b\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"", "", "index", "rl", "(Ljava/lang/CharSequence;I)I", "codePoint", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(I)I", "t", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CodepointHelpers_jvmKt {
    public static final int n(int i2) {
        return Character.charCount(i2);
    }

    public static final int rl(CharSequence charSequence, int i2) {
        return Character.codePointAt(charSequence, i2);
    }

    public static final int t(CharSequence charSequence, int i2) {
        return Character.codePointBefore(charSequence, i2);
    }
}
