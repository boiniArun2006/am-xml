package oC;

import android.media.MediaFormat;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class CN3 {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[I28.values().length];
            try {
                iArr[I28.AVC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I28.H265.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final MediaFormat n(Wre wre) {
        String str;
        Intrinsics.checkNotNullParameter(wre, "<this>");
        int i2 = j.$EnumSwitchMapping$0[wre.Uo().ordinal()];
        if (i2 == 1) {
            str = "video/avc";
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "video/hevc";
        }
        return qO.n.J2(str, wre.t(), Oe.n.rl(wre.nr()).t(), Oe.n.rl(wre.nr()).rl(), wre.J2(), wre.O(), 2130708361);
    }
}
