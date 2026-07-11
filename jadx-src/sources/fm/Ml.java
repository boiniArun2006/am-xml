package fm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Ml {
    public static final int n(char c2) {
        return c2 - '0';
    }

    public static final String nr(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return t(input.toString(), 6);
    }

    public static final boolean rl(char c2) {
        return '0' <= c2 && c2 < ':';
    }

    private static final String t(String str, int i2) {
        if (str.length() >= i2 + 12) {
            int i3 = 0;
            if (StringsKt.contains$default((CharSequence) "+-", str.charAt(0), false, 2, (Object) null)) {
                int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, '-', 1, false, 4, (Object) null);
                if (iIndexOf$default < 12) {
                    return str;
                }
                while (true) {
                    int i5 = i3 + 1;
                    if (str.charAt(i5) != '0') {
                        break;
                    }
                    i3 = i5;
                }
                if (iIndexOf$default - i3 >= 12) {
                    return str;
                }
                return StringsKt.removeRange((CharSequence) str, 1, iIndexOf$default - 10).toString();
            }
        }
        return str;
    }
}
