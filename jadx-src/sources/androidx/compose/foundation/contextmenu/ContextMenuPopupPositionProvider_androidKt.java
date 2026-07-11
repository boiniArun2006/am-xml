package androidx.compose.foundation.contextmenu;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u001a1\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\t\u001a'\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\f\u001a'\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a'\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"", "position", "popupLength", "windowLength", "", "closeAffinity", "rl", "(IIIZ)I", "KN", "(IIIZ)Z", "Uo", "O", "(IIZ)I", "nr", "J2", c.f62177j, "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ContextMenuPopupPositionProvider_androidKt {
    private static final int J2(int i2, int i3, boolean z2) {
        if (z2) {
            return 0;
        }
        return i3 - i2;
    }

    private static final boolean KN(int i2, int i3, int i5, boolean z2) {
        return z2 ? i3 <= i2 : i5 - i3 > i2;
    }

    private static final int O(int i2, int i3, boolean z2) {
        return z2 ? i2 : i2 - i3;
    }

    private static final boolean Uo(int i2, int i3, int i5, boolean z2) {
        return KN(i2, i3, i5, !z2);
    }

    private static final int n(int i2, int i3, boolean z2) {
        return J2(i2, i3, !z2);
    }

    private static final int nr(int i2, int i3, boolean z2) {
        return O(i2, i3, !z2);
    }

    public static final int rl(int i2, int i3, int i5, boolean z2) {
        return i3 >= i5 ? J2(i3, i5, z2) : Uo(i2, i3, i5, z2) ? O(i2, i3, z2) : KN(i2, i3, i5, z2) ? nr(i2, i3, z2) : n(i3, i5, z2);
    }

    public static /* synthetic */ int t(int i2, int i3, int i5, boolean z2, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            z2 = true;
        }
        return rl(i2, i3, i5, z2);
    }
}
