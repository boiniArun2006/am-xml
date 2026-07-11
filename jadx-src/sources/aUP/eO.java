package aUP;

import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class eO {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int nr(int i2, int i3) {
        if (i2 % 10 != 1) {
            return i3 * MathKt.roundToInt(i2 / i3);
        }
        return (int) (i3 * ((float) Math.floor(i2 / r3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int J2(oC.Wre wre) {
        return Oe.n.rl(wre.nr()).t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int O(oC.Wre wre) {
        return Oe.n.rl(wre.nr()).rl();
    }
}
