package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "gridSize", "slotCount", "spacing", "", "rl", "(III)[I", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LazyStaggeredGridCellsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] rl(int i2, int i3, int i5) {
        int i7;
        int i8 = i2 - (i5 * (i3 - 1));
        int i9 = i8 / i3;
        int i10 = i8 % i3;
        int[] iArr = new int[i3];
        int i11 = 0;
        while (i11 < i3) {
            if (i9 < 0) {
                i7 = 0;
            } else {
                i7 = (i11 < i10 ? 1 : 0) + i9;
            }
            iArr[i11] = i7;
            i11++;
        }
        return iArr;
    }
}
