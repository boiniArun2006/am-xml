package IRN;

import org.json.JSONObject;
import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final WkR.j f4212n = new nS.Ml().mUb(j.f4231n).xMQ();

    public abstract long J2();

    public abstract String O();

    public abstract String Uo();

    public abstract String nr();

    public abstract String t();

    static aC n(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return rl(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    public static aC rl(String str, String str2, String str3, String str4, long j2) {
        return new n(str, str2, xMQ(str3), str4, j2);
    }

    private static String xMQ(String str) {
        if (str.length() > 256) {
            return str.substring(0, 256);
        }
        return str;
    }

    public DAz.I28.Ml.AbstractC1195I28 KN() {
        return DAz.I28.Ml.AbstractC1195I28.n().nr(DAz.I28.Ml.AbstractC1195I28.n.n().t(Uo()).rl(O()).n()).rl(t()).t(nr()).O(J2()).n();
    }
}
