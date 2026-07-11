package androidx.compose.ui.geometry;

import com.caoccao.javet.values.primitive.V8ValueDouble;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "", "digits", "", c.f62177j, "(FI)Ljava/lang/String;", "ui-geometry_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class GeometryUtilsKt {
    public static final String n(float f3, int i2) {
        if (Float.isNaN(f3)) {
            return "NaN";
        }
        if (Float.isInfinite(f3)) {
            if (f3 < 0.0f) {
                return "-Infinity";
            }
            return V8ValueDouble.INFINITY;
        }
        int iMax = Math.max(i2, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f4 = f3 * fPow;
        int i3 = (int) f4;
        if (f4 - i3 >= 0.5f) {
            i3++;
        }
        float f5 = i3 / fPow;
        if (iMax > 0) {
            return String.valueOf(f5);
        }
        return String.valueOf((int) f5);
    }
}
