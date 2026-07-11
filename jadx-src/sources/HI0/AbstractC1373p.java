package HI0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: HI0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class AbstractC1373p {
    public static final void n(K k2, String data, Function2 action) {
        Intrinsics.checkNotNullParameter(k2, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(action, "action");
        ArrayList arrayList = new ArrayList();
        int length = data.length();
        int i2 = 0;
        int i3 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char cCharAt = data.charAt(i5);
            Character orNull = StringsKt.getOrNull(data, i5 - 1);
            char cCharValue = orNull != null ? orNull.charValue() : (char) 0;
            if (i5 > 0 && k2.rl().isBoundary(cCharValue, cCharAt)) {
                String strSubstring = data.substring(i3, i5);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                KH[] khArrN = k2.n();
                int length2 = khArrN.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length2) {
                        arrayList.add(strSubstring);
                        break;
                    } else if (khArrN[i7].n(strSubstring)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                i3 = i5;
            }
        }
        if (data.length() > i3) {
            String strSubstring2 = data.substring(i3, data.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            KH[] khArrN2 = k2.n();
            int length3 = khArrN2.length;
            while (true) {
                if (i2 >= length3) {
                    arrayList.add(strSubstring2);
                    break;
                } else if (khArrN2[i2].n(strSubstring2)) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        psW psw = new psW(arrayList);
        while (psw.rl() < psw.t().size()) {
            List listT = psw.t();
            int iRl = psw.rl();
            psw.qie(iRl + 1);
            action.invoke(psw, (String) listT.get(iRl));
        }
    }
}
