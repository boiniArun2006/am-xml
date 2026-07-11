package ifA;

import android.util.Log;
import ifA.w6;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Ml {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[w6.j.values().length];
            try {
                iArr[w6.j.f68145n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w6.j.f68147t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w6.j.f68144O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void n(w6 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        String str = "Error of type " + error.KN() + " in component " + error.O() + ". " + error.nr();
        int i2 = j.$EnumSwitchMapping$0[error.J2().ordinal()];
        if (i2 == 1) {
            Throwable thUo = error.Uo();
            if (thUo != null) {
                Log.e("SpiderSense", str, thUo);
                return;
            } else {
                Log.e("SpiderSense", str);
                return;
            }
        }
        if (i2 == 2) {
            Throwable thUo2 = error.Uo();
            if (thUo2 != null) {
                Log.w("SpiderSense", str, thUo2);
                return;
            } else {
                Log.w("SpiderSense", str);
                return;
            }
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Throwable thUo3 = error.Uo();
        if (thUo3 != null) {
            Log.i("SpiderSense", str, thUo3);
        } else {
            Log.i("SpiderSense", str);
        }
    }
}
