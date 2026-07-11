package oC;

import android.media.MediaFormat;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class w6 {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[oC.j.values().length];
            try {
                iArr[oC.j.AAC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final MediaFormat n(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        if (j.$EnumSwitchMapping$0[nVar.nr().ordinal()] == 1) {
            return qO.n.t("audio/mp4a-latm", nVar.t(), nVar.O());
        }
        throw new NoWhenBranchMatchedException();
    }
}
