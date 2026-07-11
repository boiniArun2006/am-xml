package Ttw;

import Nh.CN3;
import Nh.I28;
import bIo.Wre;
import i.C2167j;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import xAo.Ln;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class I28 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CN3 J2(JSONObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return xMQ(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Nh.I28 KN(JSONObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Uo(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Nh.Ml O(JSONArray jSONArray) {
        return new Nh.Ml(WK.w6.rl(jSONArray, new Function1() { // from class: Ttw.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I28.J2((JSONObject) obj);
            }
        }));
    }

    private static final Nh.I28 Uo(JSONObject jSONObject) {
        String strO;
        String strO2;
        String strO3 = Wre.O(jSONObject, "id");
        if (strO3 == null || (strO = Wre.O(jSONObject, "key")) == null || (strO2 = Wre.O(jSONObject, "default")) == null) {
            return null;
        }
        Boolean boolN = Wre.n(jSONObject, "is_open_field");
        JSONArray jSONArrayN = Ln.n(jSONObject, "sub_answers");
        return boolN != null ? boolN.booleanValue() ? new I28.n(strO3, new C2167j(strO, strO2)) : new I28.w6(strO3, new C2167j(strO, strO2)) : jSONArrayN != null ? new I28.j(strO3, new C2167j(strO, strO2), WK.w6.rl(jSONArrayN, new Function1() { // from class: Ttw.Ml
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I28.KN((JSONObject) obj);
            }
        })) : new I28.w6(strO3, new C2167j(strO, strO2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Nh.I28 mUb(JSONObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Uo(it);
    }

    private static final CN3 xMQ(JSONObject jSONObject) {
        String strO;
        String strO2;
        List listRl;
        String strO3 = Wre.O(jSONObject, "id");
        C2167j c2167j = null;
        if (strO3 == null || (strO = Wre.O(jSONObject, "key")) == null || (strO2 = Wre.O(jSONObject, "default")) == null) {
            return null;
        }
        String strO4 = Wre.O(jSONObject, "description_key");
        String strO5 = Wre.O(jSONObject, "description_default");
        String strO6 = Wre.O(jSONObject, "image");
        JSONArray jSONArrayN = Ln.n(jSONObject, "answers");
        if (jSONArrayN == null || (listRl = WK.w6.rl(jSONArrayN, new Function1() { // from class: Ttw.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I28.mUb((JSONObject) obj);
            }
        })) == null) {
            return null;
        }
        C2167j c2167j2 = new C2167j(strO, strO2);
        if (strO4 != null && strO5 != null) {
            c2167j = new C2167j(strO4, strO5);
        }
        return new CN3(strO3, c2167j2, c2167j, strO6, listRl);
    }
}
