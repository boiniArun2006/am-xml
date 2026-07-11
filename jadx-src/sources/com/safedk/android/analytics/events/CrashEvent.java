package com.safedk.android.analytics.events;

import android.os.Build;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.events.base.StatsEventWithBundle;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.n;
import java.io.IOException;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class CrashEvent extends StatsEventWithBundle implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final String f62782a = "is_caught";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final String f62783b = "is_emulator";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final String f62784c = "is_debug";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final String f62785d = "generic";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f62786e = "report";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f62787f = "events";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f62788g = "sdk_versions_map";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f62789h = "sdk_key";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f62790j = "CrashEvent";
    private static final long serialVersionUID = 0;

    public CrashEvent(JSONObject report) {
        super(null, StatsCollector.EventType.crash, report);
    }

    public CrashEvent(String sdk, StatsCollector.EventType eventType, JSONObject report) {
        super(sdk, eventType, report);
    }

    @Override // com.safedk.android.analytics.events.base.StatsEventWithBundle
    public JSONObject f() throws JSONException, IOException {
        String string;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put(f62786e, jSONObject2);
        JSONArray jSONArray = new JSONArray();
        jSONObject2.put(f62787f, jSONArray);
        JSONObject jSONObjectF = super.f();
        jSONObjectF.put(StatsEvent.f62830z, a().toString());
        jSONObjectF.put(StatsEvent.f62824A, this.f62835G);
        jSONObjectF.put(f62782a, c());
        jSONObjectF.put(f62783b, Build.FINGERPRINT.contains(f62785d));
        jSONObjectF.put(f62784c, SafeDK.getInstance().o());
        JSONObject jSONObjectR = SafeDK.getInstance().R();
        if (jSONObjectR != null) {
            string = jSONObjectR.toString();
            Logger.d(f62790j, "sdkVersionsJSON=", jSONObjectR.toString());
        } else {
            Logger.d(f62790j, "sdkVersionsJSON is null");
            string = JsonUtils.EMPTY_JSON;
        }
        jSONObjectF.put(f62788g, string);
        jSONArray.put(jSONObjectF);
        jSONObject2.put(TtmlNode.TAG_METADATA, n.a(SafeDK.getInstance().x().c()));
        jSONObject.put("sdk_key", SafeDK.getInstance().x().a());
        return jSONObject;
    }

    protected boolean c() {
        return false;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public StatsCollector.EventType a() {
        return StatsCollector.EventType.crash;
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public String b() {
        return "";
    }

    @Override // com.safedk.android.analytics.events.base.StatsEvent
    public void a(StatsEvent statsEvent) {
    }
}
