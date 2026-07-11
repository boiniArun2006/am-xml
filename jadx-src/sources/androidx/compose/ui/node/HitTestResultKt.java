package androidx.compose.ui.node;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "distance", "", "isInLayer", "isInExpandedBounds", "Landroidx/compose/ui/node/DistanceAndFlags;", c.f62177j, "(FZZ)J", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class HitTestResultKt {
    static /* synthetic */ long rl(float f3, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        return n(f3, z2, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(float f3, boolean z2, boolean z3) {
        long j2;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f3);
        long j3 = 0;
        if (z2) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        if (z3) {
            j3 = 2;
        }
        return DistanceAndFlags.rl(((j2 | j3) & 4294967295L) | (jFloatToRawIntBits << 32));
    }
}
