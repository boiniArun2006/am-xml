package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldCharSequence;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\r\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a3\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "", "destination", "", "destinationOffset", "startIndex", "endIndex", "", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(Ljava/lang/CharSequence;[CIII)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ToCharArray_androidKt {
    public static final void n(CharSequence charSequence, char[] cArr, int i2, int i3, int i5) {
        if (charSequence instanceof TextFieldCharSequence) {
            ((TextFieldCharSequence) charSequence).mUb(cArr, i2, i3, i5);
            return;
        }
        while (i3 < i5) {
            cArr[i2] = charSequence.charAt(i3);
            i3++;
            i2++;
        }
    }
}
