package qwH;

import kotlin.jvm.internal.Intrinsics;
import qwH.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface Wre extends Xo.w6 {

    public static final class j {
        public static void n(Wre wre, qf padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            wre.qie(new co4.I28(new s4(padding)));
        }

        public static void nr(Wre wre, int i2, int i3) {
            wre.qie(new co4.I28(new C2343c(i2, i3, null, 4, null)));
        }

        public static void rl(Wre wre, qf padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            wre.qie(new co4.I28(new Z(padding)));
        }

        public static void t(Wre wre, qf padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            wre.qie(new co4.I28(new Ln(padding)));
        }
    }

    void qie(co4.Xo xo);
}
