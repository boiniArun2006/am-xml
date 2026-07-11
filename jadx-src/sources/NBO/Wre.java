package NBO;

import NBO.I28;
import android.os.Build;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import i.C2167j;
import i.C2169w6;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Wre {
    private static final I28.w6 J2(JSONObject jSONObject) {
        String strO;
        String strO2 = bIo.Wre.O(jSONObject, "key");
        if (strO2 == null || (strO = bIo.Wre.O(jSONObject, "default")) == null) {
            return null;
        }
        return new I28.w6(new C2167j(strO2, strO));
    }

    private static final I28.n O(JSONObject jSONObject) {
        String strO = bIo.Wre.O(jSONObject, "resource");
        if (strO == null) {
            return null;
        }
        return new I28.n(strO);
    }

    private static final I28.j nr(JSONObject jSONObject) {
        String strO;
        String strO2 = bIo.Wre.O(jSONObject, "key");
        if (strO2 == null || (strO = bIo.Wre.O(jSONObject, "default")) == null) {
            return null;
        }
        return new I28.j(new C2167j(strO2, strO));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final n t(JSONObject jSONObject, C2169w6 translations) {
        I28 i28Nr;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(translations, "translations");
        String strO = bIo.Wre.O(jSONObject, "type");
        if (strO == null) {
            return null;
        }
        int iHashCode = strO.hashCode();
        if (iHashCode != -1724546052) {
            if (iHashCode != 100313435) {
                i28Nr = (iHashCode == 110371416 && strO.equals("title")) ? J2(jSONObject) : null;
            } else if (strO.equals("image")) {
                i28Nr = O(jSONObject);
            }
        } else if (strO.equals("description")) {
            i28Nr = nr(jSONObject);
        }
        if (i28Nr != null) {
            return i28Nr.n(translations);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final int rl(String str) {
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
            case -34875907:
                if (str.equals("oldWatermark")) {
                    return 2131232334;
                }
                return 2131231326;
            case 2996167:
                if (str.equals("am50")) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        return 2131231145;
                    }
                    return 2131231146;
                }
                return 2131231326;
            case 91009700:
                if (str.equals("newWatermark")) {
                    return 2131232333;
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
            case 1655054676:
                if (str.equals("diamond")) {
                    return 2131231325;
                }
                return 2131231326;
            default:
                return 2131231326;
        }
    }
}
