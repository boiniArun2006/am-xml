package com.safedk.android.analytics.events.base;

import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.internal.b;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.PersistableBase;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.n;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class StatsEvent extends PersistableBase implements Comparable<StatsEvent> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f62824A = "timestamp";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f62825B = "application";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62826a = "StatsEvent";
    protected static final String ax = "sdk";
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected static final String f62827w = "sdk_version";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f62828x = "sdk_uuid";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected static final String f62829y = "isBackground";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f62830z = "event_type";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected String f62831C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected String f62832D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected StatsCollector.EventType f62833E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected boolean f62834F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    protected long f62835G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    protected int f62836H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    protected boolean f62837I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected boolean f62838J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    String f62839K;
    protected transient boolean az;

    public abstract StatsCollector.EventType a();

    public abstract void a(StatsEvent statsEvent);

    public abstract String b();

    public StatsEvent() {
        this.f62837I = true;
        this.f62838J = false;
        this.f62839K = null;
        this.az = false;
    }

    public StatsEvent(String sdk, StatsCollector.EventType eventType) {
        this.f62837I = true;
        this.f62838J = false;
        this.f62839K = null;
        this.az = false;
        this.f62833E = eventType;
        this.f62831C = sdk;
        this.f62834F = b.getInstance().isInBackground();
        this.f62835G = n.b(System.currentTimeMillis());
        this.f62836H = SafeDK.l();
        String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(sdk);
        this.f62839K = sdkUUIDByPackage;
        if (sdkUUIDByPackage == null) {
            Logger.d(f62826a, "sdk_null_check StatsEvent sdk = ", sdk);
        }
        Logger.d(f62826a, "StatsEvent ctor sdk=", sdk);
    }

    public boolean j() {
        return this.az;
    }

    public void a(boolean z2) {
        this.az = z2;
    }

    public String k() {
        return this.f62831C;
    }

    public long l() {
        return this.f62835G;
    }

    public void a(long j2) {
        this.f62835G = j2;
    }

    public Bundle d() {
        String str;
        Bundle bundle = new Bundle();
        String str2 = this.f62831C;
        if (str2 != null && this.f62839K == null) {
            String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(str2);
            this.f62839K = sdkUUIDByPackage;
            if (sdkUUIDByPackage == null) {
                this.f62839K = this.f62831C;
            }
        }
        String str3 = this.f62839K;
        if (str3 != null) {
            bundle.putString("sdk_uuid", str3);
        }
        if (this.f62839K != null && this.f62832D == null && (str = SdksMapping.getAllSdkVersionsMap().get(this.f62839K)) != null) {
            bundle.putString("sdk_version", str);
        }
        bundle.putString(f62830z, a().toString());
        bundle.putLong(f62824A, this.f62835G);
        if (!TextUtils.isEmpty(this.f62832D)) {
            bundle.putString("sdk_version", this.f62832D);
        }
        return bundle;
    }

    public void b(StatsEvent statsEvent) {
        if (a() == statsEvent.a()) {
            this.f62837I |= statsEvent.f62837I;
            a(statsEvent);
        } else {
            Logger.e(f62826a, "Cannot aggregate events of different types");
        }
    }

    protected long m() {
        return n.c(this.f62835G);
    }

    public boolean a_() {
        return this.f62837I;
    }

    public void b(boolean z2) {
        this.f62837I = z2;
    }

    public boolean n() {
        return this.f62838J;
    }

    public void c(boolean z2) {
        this.f62838J = z2;
    }

    public Set<String> e() {
        return null;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(StatsEvent statsEvent) {
        if (statsEvent == null) {
            throw null;
        }
        long j2 = this.f62835G;
        long j3 = statsEvent.f62835G;
        if (j2 == j3) {
            return 0;
        }
        if (j2 < j3) {
            return -1;
        }
        return 1;
    }

    public String toString() {
        return d().toString();
    }

    public Bundle a(Bundle bundle) {
        return bundle;
    }

    @Override // com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ax, this.f62831C);
        jSONObject.put("sdkVersion", this.f62832D);
        StatsCollector.EventType eventType = this.f62833E;
        jSONObject.put("type", eventType != null ? eventType.name() : null);
        jSONObject.put(f62829y, this.f62834F);
        jSONObject.put(f62824A, this.f62835G);
        jSONObject.put("appVersionCode", this.f62836H);
        jSONObject.put("isMature", this.f62837I);
        jSONObject.put("isNextSession", this.f62838J);
        jSONObject.put("sdkUid", this.f62839K);
        jSONObject.put("isFirstSession", this.az);
        return jSONObject;
    }

    @Override // com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            this.f62831C = jSONObject.optString(ax, "");
            this.f62832D = jSONObject.optString("sdkVersion", "");
            this.f62833E = StatsCollector.EventType.valueOf(jSONObject.optString("type", ""));
            this.f62834F = jSONObject.optBoolean(f62829y, false);
            this.f62835G = jSONObject.optLong(f62824A, 0L);
            this.f62836H = jSONObject.optInt("appVersionCode", 0);
            this.f62837I = jSONObject.optBoolean("isMature", true);
            this.f62838J = jSONObject.optBoolean("isNextSession", false);
            this.f62839K = jSONObject.optString("sdkUid", "");
            this.az = jSONObject.optBoolean("isFirstSession", false);
        }
    }
}
