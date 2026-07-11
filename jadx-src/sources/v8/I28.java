package v8;

import android.util.Log;
import kotlin.NoWhenBranchMatchedException;
import v8.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class I28 {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j.EnumC1241j.values().length];
            try {
                iArr[j.EnumC1241j.f74666n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.EnumC1241j.f74669t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.EnumC1241j.f74664O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j.EnumC1241j.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[j.EnumC1241j.f74668r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(String str, j.EnumC1241j enumC1241j, String str2) {
        int i2 = j.$EnumSwitchMapping$0[enumC1241j.ordinal()];
        if (i2 == 1) {
            Log.v(str, str2);
            return;
        }
        if (i2 == 2) {
            Log.d(str, str2);
            return;
        }
        if (i2 == 3) {
            Log.i(str, str2);
        } else if (i2 == 4) {
            Log.w(str, str2);
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            Log.e(str, str2);
        }
    }
}
