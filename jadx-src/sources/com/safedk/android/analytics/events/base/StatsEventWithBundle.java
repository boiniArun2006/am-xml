package com.safedk.android.analytics.events.base;

import android.util.Base64;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.n;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class StatsEventWithBundle extends StatsEvent implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62840a = "CrashEvent";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62841b = "report";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected static final String f62842i = "metadata";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f62843c;

    public StatsEventWithBundle(String sdk, StatsCollector.EventType eventType, JSONObject report) {
        super(sdk, eventType);
        this.f62833E = eventType;
        this.f62831C = sdk;
        this.f62835G = n.b(System.currentTimeMillis());
        this.f62843c = report;
    }

    public JSONObject f() throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        Logger.printFullVerboseLog(f62840a, "report : ", this.f62843c);
        jSONObject.put("report", a(this.f62843c.toString().replace("\\/", "/")));
        return jSONObject;
    }

    private String a(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return new String(Base64.encode(byteArray, 2));
    }
}
