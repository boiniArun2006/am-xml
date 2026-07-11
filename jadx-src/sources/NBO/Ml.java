package NBO;

import Dj7.CN3;
import NBO.w6;
import i.C2167j;
import i.C2169w6;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Ml {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final j n(JSONObject jSONObject, C2169w6 translations) {
        w6 w6VarRl;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(translations, "translations");
        String strO = bIo.Wre.O(jSONObject, "type");
        if (strO == null) {
            return null;
        }
        switch (strO.hashCode()) {
            case -1624642178:
                w6VarRl = !strO.equals("quaternary") ? null : rl(jSONObject, CN3.J2);
                break;
            case -1174796206:
                w6VarRl = !strO.equals("tertiary") ? null : rl(jSONObject, CN3.f1593O);
                break;
            case -881233556:
                w6VarRl = !strO.equals("tagged") ? null : t(jSONObject);
                break;
            case -817598092:
                w6VarRl = !strO.equals("secondary") ? null : rl(jSONObject, CN3.f1600t);
                break;
            case -314765822:
                w6VarRl = !strO.equals("primary") ? null : rl(jSONObject, CN3.f1597n);
                break;
            default:
                w6VarRl = null;
                break;
        }
        if (w6VarRl != null) {
            return w6VarRl.n(translations);
        }
        return null;
    }

    private static final w6.j rl(JSONObject jSONObject, CN3 cn3) {
        String strO;
        String strO2;
        String strO3 = bIo.Wre.O(jSONObject, "id");
        if (strO3 == null || (strO = bIo.Wre.O(jSONObject, "key")) == null || (strO2 = bIo.Wre.O(jSONObject, "default")) == null) {
            return null;
        }
        return new w6.j(strO3, new C2167j(strO, strO2), cn3);
    }

    private static final w6.n t(JSONObject jSONObject) {
        String strO;
        String strO2;
        String strO3;
        String strO4;
        String strO5 = bIo.Wre.O(jSONObject, "id");
        if (strO5 == null || (strO = bIo.Wre.O(jSONObject, "key")) == null || (strO2 = bIo.Wre.O(jSONObject, "default")) == null || (strO3 = bIo.Wre.O(jSONObject, "tagKey")) == null || (strO4 = bIo.Wre.O(jSONObject, "tagDefault")) == null) {
            return null;
        }
        return new w6.n(strO5, new C2167j(strO, strO2), new C2167j(strO3, strO4));
    }
}
