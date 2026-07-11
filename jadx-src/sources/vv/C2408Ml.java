package vv;

import org.json.JSONException;
import org.json.JSONObject;
import upM.CN3;

/* JADX INFO: renamed from: vv.Ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class C2408Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f74760n;
    private final EnumC2411w6 nr;
    private final Float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f74761t;

    public static C2408Ml rl(boolean z2, EnumC2411w6 enumC2411w6) {
        CN3.nr(enumC2411w6, "Position is null");
        return new C2408Ml(false, null, z2, enumC2411w6);
    }

    public JSONObject n() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f74760n);
            if (this.f74760n) {
                jSONObject.put("skipOffset", this.rl);
            }
            jSONObject.put("autoPlay", this.f74761t);
            jSONObject.put("position", this.nr);
            return jSONObject;
        } catch (JSONException e2) {
            upM.Ml.rl("VastProperties: JSON error", e2);
            return jSONObject;
        }
    }

    private C2408Ml(boolean z2, Float f3, boolean z3, EnumC2411w6 enumC2411w6) {
        this.f74760n = z2;
        this.rl = f3;
        this.f74761t = z3;
        this.nr = enumC2411w6;
    }
}
