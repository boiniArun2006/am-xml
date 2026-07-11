package qwH;

import kotlin.jvm.internal.Intrinsics;
import qwH.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface I28 extends Xo.Ml {

    public static final class j {
        public static void n(I28 i28, Pl format) {
            Intrinsics.checkNotNullParameter(format, "format");
            if (format instanceof Lu) {
                i28.o(((Lu) format).rl());
            }
        }

        public static void nr(I28 i28, qf padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            i28.o(new co4.I28(new psW(padding)));
        }

        public static void rl(I28 i28, qf padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            i28.o(new co4.SPz(new co4.I28(new Md(padding)), true));
        }

        public static void t(I28 i28, qf padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            i28.o(new co4.I28(new K(padding)));
        }
    }

    void o(co4.Xo xo);
}
