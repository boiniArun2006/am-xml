package F5;

import QNA.nKK;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final nKK f2508n;

    private static Dsr n(int i2) {
        if (i2 == 3) {
            return new qz();
        }
        h1M.CN3.J2().nr("Could not determine SettingsJsonTransform for settings version " + i2 + ". Using default settings values.");
        return new n();
    }

    public Ml rl(JSONObject jSONObject) {
        return n(jSONObject.getInt("settings_version")).n(this.f2508n, jSONObject);
    }

    fuX(nKK nkk) {
        this.f2508n = nkk;
    }
}
