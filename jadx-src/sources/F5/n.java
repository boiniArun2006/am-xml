package F5;

import F5.Ml;
import QNA.nKK;
import com.caoccao.javet.interop.engine.JavetEngineConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class n implements Dsr {
    static Ml rl(nKK nkk) {
        return new Ml(nkk.n() + ((long) 3600000), new Ml.n(8, 4), new Ml.j(true, false, false), 0, JavetEngineConfig.DEFAULT_RESET_ENGINE_TIMEOUT_SECONDS, 10.0d, 1.2d, 60);
    }

    n() {
    }

    @Override // F5.Dsr
    public Ml n(nKK nkk, JSONObject jSONObject) {
        return rl(nkk);
    }
}
