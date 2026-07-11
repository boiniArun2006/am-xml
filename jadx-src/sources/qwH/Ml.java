package qwH;

import kotlin.jvm.internal.Intrinsics;
import qwH.Wre;
import qwH.Xo;
import qwH.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public interface Ml extends w6, Wre, Xo.j, Xo.w6 {

    public static final class j {
        public static void J2(Ml ml, qf padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            Wre.j.n(ml, padding);
        }

        public static void KN(Ml ml, DAz names) {
            Intrinsics.checkNotNullParameter(names, "names");
            w6.j.nr(ml, names);
        }

        public static void O(Ml ml, l3D names) {
            Intrinsics.checkNotNullParameter(names, "names");
            w6.j.t(ml, names);
        }

        public static void Uo(Ml ml, qf padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            Wre.j.rl(ml, padding);
        }

        public static void mUb(Ml ml, qf padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            Wre.j.t(ml, padding);
        }

        public static void n(Ml ml, co4.Xo structure) {
            Intrinsics.checkNotNullParameter(structure, "structure");
            ml.S(structure);
        }

        public static void nr(Ml ml, qf padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            w6.j.rl(ml, padding);
        }

        public static void qie(Ml ml, qf padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            w6.j.J2(ml, padding);
        }

        public static void rl(Ml ml, co4.Xo structure) {
            Intrinsics.checkNotNullParameter(structure, "structure");
            ml.S(structure);
        }

        public static void t(Ml ml, Pl format) {
            Intrinsics.checkNotNullParameter(format, "format");
            w6.j.n(ml, format);
        }

        public static void xMQ(Ml ml, qf padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            w6.j.O(ml, padding);
        }

        public static void gh(Ml ml, int i2, int i3) {
            Wre.j.nr(ml, i2, i3);
        }
    }

    void S(co4.Xo xo);
}
