package UO6;

import com.alightcreative.app.motion.persist.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class iF {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j.Ml.values().length];
            try {
                iArr[j.Ml.f45830n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.Ml.f45832t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.Ml.f45829O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int n(int i2, j.Ml option) {
        float f3;
        float f4;
        float f5;
        Intrinsics.checkNotNullParameter(option, "option");
        if (i2 <= 1500) {
            int i3 = j.$EnumSwitchMapping$0[option.ordinal()];
            if (i3 == 1) {
                f5 = i2 / 3.0f;
            } else {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return i2;
                }
                f5 = (i2 / 3.0f) * 2;
            }
            return (int) f5;
        }
        int i5 = j.$EnumSwitchMapping$0[option.ordinal()];
        if (i5 == 1) {
            f3 = i2;
            f4 = 4.0f;
        } else {
            if (i5 != 2) {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return i2;
            }
            f3 = i2;
            f4 = 2.0f;
        }
        f5 = f3 / f4;
        return (int) f5;
    }
}
