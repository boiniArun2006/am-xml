package kYF;

import android.graphics.drawable.Drawable;
import com.caoccao.javet.utils.Float16;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final FjR.w6 f69938n = new FjR.w6(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, Float16.EXPONENT_SIGNIFICAND_MASK, null);

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Z.I28.values().length];
            try {
                iArr[Z.I28.f12266n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Z.I28.f12268t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Z.I28.f12265O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final FjR.w6 rl() {
        return f69938n;
    }

    public static final Drawable t(FjR.fuX fux, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        return Ml.n(fux.qie(), num.intValue());
    }

    public static final boolean n(FjR.fuX fux) {
        int i2 = j.$EnumSwitchMapping$0[fux.T().ordinal()];
        if (i2 == 1) {
            return false;
        }
        if (i2 == 2) {
            return true;
        }
        if (i2 == 3) {
            if (fux.Ik().az() == null && (fux.s7N() instanceof Z.Ml)) {
                return true;
            }
            fux.v();
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
