package s7Q;

import WK.w6;
import bIo.Wre;
import i.C2167j;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import xAo.Ln;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f73178n = new n();

    private final F2p.n nr(JSONObject jSONObject) {
        String strO;
        String strO2;
        JSONObject jSONObjectRl;
        String strO3;
        String strO4;
        JSONObject jSONObjectRl2 = Ln.rl(jSONObject, "question");
        if (jSONObjectRl2 == null || (strO = Wre.O(jSONObjectRl2, "key")) == null || (strO2 = Wre.O(jSONObjectRl2, "default")) == null || (jSONObjectRl = Ln.rl(jSONObject, "answer")) == null || (strO3 = Wre.O(jSONObjectRl, "key")) == null || (strO4 = Wre.O(jSONObjectRl, "default")) == null) {
            return null;
        }
        return new F2p.n(new C2167j(strO, strO2), new C2167j(strO3, strO4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F2p.n t(JSONObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return f73178n.nr(it);
    }

    public final List rl(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return w6.rl(new JSONArray(string), new Function1() { // from class: s7Q.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.t((JSONObject) obj);
            }
        });
    }

    private n() {
    }
}
