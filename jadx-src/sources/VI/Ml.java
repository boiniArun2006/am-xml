package VI;

import K7m.CN3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f10857n;
    private final w6 nr;
    private final Float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f10858t;

    public static Ml rl(boolean z2, w6 w6Var) {
        CN3.nr(w6Var, "Position is null");
        return new Ml(false, null, z2, w6Var);
    }

    public static Ml t(float f3, boolean z2, w6 w6Var) {
        CN3.nr(w6Var, "Position is null");
        return new Ml(true, Float.valueOf(f3), z2, w6Var);
    }

    public JSONObject n() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f10857n);
            if (this.f10857n) {
                jSONObject.put("skipOffset", this.rl);
            }
            jSONObject.put("autoPlay", this.f10858t);
            jSONObject.put("position", this.nr);
            return jSONObject;
        } catch (JSONException e2) {
            K7m.Ml.rl("VastProperties: JSON error", e2);
            return jSONObject;
        }
    }

    private Ml(boolean z2, Float f3, boolean z3, w6 w6Var) {
        this.f10857n = z2;
        this.rl = f3;
        this.f10858t = z3;
        this.nr = w6Var;
    }
}
