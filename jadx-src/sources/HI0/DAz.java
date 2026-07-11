package HI0;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class DAz {
    public static final String n(float f3) {
        String str = String.format(Locale.ROOT, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f3)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final String rl(double d2) {
        String str = String.format(Locale.ROOT, "%f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final String t(float f3) {
        String str = String.format(Locale.ROOT, "%f", Arrays.copyOf(new Object[]{Float.valueOf(f3)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
