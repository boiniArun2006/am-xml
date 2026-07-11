package qwH;

import kotlin.jvm.internal.Intrinsics;
import qwH.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface w6 extends Xo.j {

    public static final class j {
        public static void J2(w6 w6Var, qf padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            w6Var.WPU(new co4.I28(new Zs(padding, false, 2, null)));
        }

        public static void O(w6 w6Var, qf padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            w6Var.WPU(new co4.I28(new Ew(padding)));
        }

        public static void n(w6 w6Var, Pl format) {
            Intrinsics.checkNotNullParameter(format, "format");
            if (format instanceof SPz) {
                w6Var.WPU(((SPz) format).rl());
            }
        }

        public static void nr(w6 w6Var, DAz names) {
            Intrinsics.checkNotNullParameter(names, "names");
            w6Var.WPU(new co4.I28(new nKK(names)));
        }

        public static void rl(w6 w6Var, qf padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            w6Var.WPU(new co4.I28(new C2344z(padding)));
        }

        public static void t(w6 w6Var, l3D names) {
            Intrinsics.checkNotNullParameter(names, "names");
            w6Var.WPU(new co4.I28(new QJ(names)));
        }
    }

    void WPU(co4.Xo xo);
}
