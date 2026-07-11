package qwH;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class eO {
    public static final void n(Xo xo, Function1[] alternativeFormats, Function1 primaryFormat) {
        Intrinsics.checkNotNullParameter(xo, "<this>");
        Intrinsics.checkNotNullParameter(alternativeFormats, "alternativeFormats");
        Intrinsics.checkNotNullParameter(primaryFormat, "primaryFormat");
        if (!(xo instanceof n)) {
            throw new IllegalStateException("impossible");
        }
        ((n) xo).mUb((Function1[]) Arrays.copyOf(alternativeFormats, alternativeFormats.length), (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(primaryFormat, 1));
    }

    public static /* synthetic */ void nr(Xo xo, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        t(xo, str, function1);
    }

    public static final void rl(Xo xo, char c2) {
        Intrinsics.checkNotNullParameter(xo, "<this>");
        xo.ck(String.valueOf(c2));
    }

    public static final void t(Xo xo, String ifZero, Function1 format) {
        Intrinsics.checkNotNullParameter(xo, "<this>");
        Intrinsics.checkNotNullParameter(ifZero, "ifZero");
        Intrinsics.checkNotNullParameter(format, "format");
        if (!(xo instanceof n)) {
            throw new IllegalStateException("impossible");
        }
        ((n) xo).rl(ifZero, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(format, 1));
    }
}
