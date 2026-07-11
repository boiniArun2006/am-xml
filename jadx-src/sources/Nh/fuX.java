package Nh;

import com.vungle.ads.internal.presenter.MRAIDPresenter;
import i.AbstractC2168n;
import i.C2167j;
import i.C2169w6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class fuX {
    public static final w6 n(CN3 cn3, C2169w6 translations) {
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        Intrinsics.checkNotNullParameter(translations, "translations");
        String strT = cn3.t();
        String strN = AbstractC2168n.n(cn3.O(), translations);
        C2167j c2167jRl = cn3.rl();
        String strN2 = c2167jRl != null ? AbstractC2168n.n(c2167jRl, translations) : null;
        String strNr = cn3.nr();
        int iRl = strNr != null ? rl(strNr) : 2131231332;
        List listN = cn3.n();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listN, 10));
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            arrayList.add(Wre.n((I28) it.next(), translations));
        }
        return new w6(strT, strN, strN2, iRl, arrayList);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final int rl(String str) {
        switch (str.hashCode()) {
            case -1854767153:
                if (!str.equals("support")) {
                    return 2131231326;
                }
                return 2131231333;
            case -1563411347:
                if (str.equals("lotOfThings")) {
                    return 2131231330;
                }
                return 2131231326;
            case -1309148525:
                if (str.equals("explore")) {
                    return 2131231328;
                }
                return 2131231326;
            case -976269459:
                str.equals("coolFeature");
                return 2131231326;
            case -475059709:
                if (str.equals("learningThings")) {
                    return 2131231329;
                }
                return 2131231326;
            case -103677777:
                if (str.equals("movement")) {
                    return 2131231331;
                }
                return 2131231326;
            case 96784904:
                if (str.equals(MRAIDPresenter.ERROR)) {
                    return 2131231327;
                }
                return 2131231326;
            case 437810057:
                if (str.equals("proFeature")) {
                    return 2131231332;
                }
                return 2131231326;
            default:
                return 2131231326;
        }
    }
}
