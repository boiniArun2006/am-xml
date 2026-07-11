package F5;

import F5.Ml;
import QNA.nKK;
import com.caoccao.javet.interop.engine.JavetEngineConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class qz implements Dsr {
    private static long nr(nKK nkk, long j2, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : nkk.n() + (j2 * 1000);
    }

    private static Ml.j rl(JSONObject jSONObject) {
        return new Ml.j(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    private static Ml.n t(JSONObject jSONObject) {
        return new Ml.n(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    @Override // F5.Dsr
    public Ml n(nKK nkk, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", JavetEngineConfig.DEFAULT_RESET_ENGINE_TIMEOUT_SECONDS);
        return new Ml(nr(nkk, iOptInt2, jSONObject), jSONObject.has("session") ? t(jSONObject.getJSONObject("session")) : t(new JSONObject()), rl(jSONObject.getJSONObject("features")), iOptInt, iOptInt2, jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject.optDouble("on_demand_backoff_base", 1.2d), jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60));
    }

    qz() {
    }
}
