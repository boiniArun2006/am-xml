package v9;

import com.caoccao.javet.utils.Float16;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class I28 {
    public static final short n(int i2) {
        return (short) RangesKt.coerceIn(i2, -32768, Float16.EXPONENT_SIGNIFICAND_MASK);
    }
}
