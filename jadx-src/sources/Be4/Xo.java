package Be4;

import androidx.media3.common.MimeTypes;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.SetsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Set f538n = SetsKt.setOf((Object[]) new String[]{"image/jpeg", MimeTypes.IMAGE_WEBP, MimeTypes.IMAGE_HEIC, MimeTypes.IMAGE_HEIF});

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[qz.values().length];
            try {
                iArr[qz.f563t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qz.f561n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qz.f560O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean t(qz qzVar, String str) {
        int i2 = j.$EnumSwitchMapping$0[qzVar.ordinal()];
        if (i2 == 1) {
            return str != null && f538n.contains(str);
        }
        if (i2 == 2) {
            return false;
        }
        if (i2 == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean n(C c2) {
        if (c2.n() > 0) {
            return true;
        }
        return false;
    }

    public static final boolean rl(C c2) {
        if (c2.n() != 90 && c2.n() != 270) {
            return false;
        }
        return true;
    }
}
