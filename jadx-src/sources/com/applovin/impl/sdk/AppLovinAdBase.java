package com.applovin.impl.sdk;

import android.graphics.Color;
import androidx.annotation.Nullable;
import com.applovin.impl.e4;
import com.applovin.impl.f4;
import com.applovin.impl.h5;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class AppLovinAdBase implements e4 {

    @Nullable
    protected final JSONObject adObject;
    private final long createdAtMillis;

    @Nullable
    protected final JSONObject fullResponse;
    protected final C1802k sdk;

    @Nullable
    protected final h5 synchronizedAdObject;

    @Nullable
    protected final h5 synchronizedFullResponse;
    protected final Object adObjectLock = new Object();
    protected final Object fullResponseLock = new Object();

    @Override // com.applovin.impl.e4
    public abstract /* synthetic */ f4 getAdEventTracker();

    public abstract long getAdIdNumber();

    protected int getColorFromAdObject(String str, int i2) {
        String stringFromAdObject = getStringFromAdObject(str, null);
        return StringUtils.isValidString(stringFromAdObject) ? Color.parseColor(stringFromAdObject) : i2;
    }

    @Override // com.applovin.impl.e4
    @Nullable
    public abstract /* synthetic */ String getOpenMeasurementContentUrl();

    @Override // com.applovin.impl.e4
    public abstract /* synthetic */ String getOpenMeasurementCustomReferenceData();

    @Override // com.applovin.impl.e4
    public abstract /* synthetic */ List getOpenMeasurementVerificationScriptResources();

    @Override // com.applovin.impl.e4
    public abstract /* synthetic */ boolean isOpenMeasurementEnabled();

    protected boolean containsKeyForAdObject(String str) {
        boolean zHas;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str);
        }
        synchronized (this.adObjectLock) {
            zHas = this.adObject.has(str);
        }
        return zHas;
    }

    public String getAdDomain() {
        return getStringFromFullResponse("adomain", "");
    }

    protected boolean getBooleanFromAdObject(String str, Boolean bool) {
        boolean zBooleanValue;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, bool).booleanValue();
        }
        synchronized (this.adObjectLock) {
            zBooleanValue = JsonUtils.getBoolean(this.adObject, str, bool).booleanValue();
        }
        return zBooleanValue;
    }

    protected boolean getBooleanFromFullResponse(String str, boolean z2) {
        boolean zBooleanValue;
        h5 h5Var = this.synchronizedFullResponse;
        if (h5Var != null) {
            return h5Var.a(str, Boolean.valueOf(z2)).booleanValue();
        }
        synchronized (this.fullResponseLock) {
            zBooleanValue = JsonUtils.getBoolean(this.fullResponse, str, Boolean.valueOf(z2)).booleanValue();
        }
        return zBooleanValue;
    }

    public String getClCode() {
        String stringFromAdObject = getStringFromAdObject("clcode", "");
        return StringUtils.isValidString(stringFromAdObject) ? stringFromAdObject : getStringFromFullResponse("clcode", "");
    }

    public long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    public String getDspId() {
        return getStringFromFullResponse("dsp_id", "");
    }

    public String getDspName() {
        return getStringFromFullResponse("dsp_name", "");
    }

    public long getFetchLatencyMillis() {
        return getLongFromFullResponse("ad_fetch_latency_millis", -1L);
    }

    public long getFetchResponseSize() {
        return getLongFromFullResponse("ad_fetch_response_size", -1L);
    }

    protected float getFloatFromAdObject(String str, float f3) {
        float f4;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, f3);
        }
        synchronized (this.adObjectLock) {
            f4 = JsonUtils.getFloat(this.adObject, str, f3);
        }
        return f4;
    }

    protected int getIntFromAdObject(String str, int i2) {
        int i3;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, i2);
        }
        synchronized (this.adObjectLock) {
            i3 = JsonUtils.getInt(this.adObject, str, i2);
        }
        return i3;
    }

    protected List<Integer> getIntegerListFromAdObject(String str, List<Integer> list) {
        List<Integer> integerList;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, (List) list);
        }
        synchronized (this.adObjectLock) {
            integerList = JsonUtils.getIntegerList(this.adObject, str, list);
        }
        return integerList;
    }

    protected JSONArray getJsonArrayFromAdObject(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, jSONArray);
        }
        synchronized (this.adObjectLock) {
            jSONArray2 = JsonUtils.getJSONArray(this.adObject, str, jSONArray);
        }
        return jSONArray2;
    }

    protected JSONObject getJsonObjectFromAdObject(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, jSONObject);
        }
        synchronized (this.adObjectLock) {
            jSONObject2 = JsonUtils.getJSONObject(this.adObject, str, jSONObject);
        }
        return jSONObject2;
    }

    protected long getLongFromAdObject(String str, long j2) {
        long j3;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, j2);
        }
        synchronized (this.adObjectLock) {
            j3 = JsonUtils.getLong(this.adObject, str, j2);
        }
        return j3;
    }

    protected long getLongFromFullResponse(String str, long j2) {
        long j3;
        h5 h5Var = this.synchronizedFullResponse;
        if (h5Var != null) {
            return h5Var.a(str, j2);
        }
        synchronized (this.fullResponseLock) {
            j3 = JsonUtils.getLong(this.fullResponse, str, j2);
        }
        return j3;
    }

    public C1802k getSdk() {
        return this.sdk;
    }

    protected String getStringFromAdObject(String str, String str2) {
        String string;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, str2);
        }
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, str, str2);
        }
        return string;
    }

    protected String getStringFromFullResponse(String str, String str2) {
        String string;
        h5 h5Var = this.synchronizedFullResponse;
        if (h5Var != null) {
            return h5Var.a(str, str2);
        }
        synchronized (this.fullResponseLock) {
            string = JsonUtils.getString(this.fullResponse, str, str2);
        }
        return string;
    }

    protected List<String> getStringListFromAdObject(String str, List<String> list) {
        List<String> stringList;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.b(str, list);
        }
        synchronized (this.adObjectLock) {
            stringList = JsonUtils.getStringList(this.adObject, str, list);
        }
        return stringList;
    }

    protected AppLovinAdBase(JSONObject jSONObject, JSONObject jSONObject2, C1802k c1802k) {
        if (jSONObject != null) {
            if (jSONObject2 != null) {
                if (c1802k != null) {
                    this.sdk = c1802k;
                    if (((Boolean) c1802k.a(x4.f50755C6)).booleanValue()) {
                        this.synchronizedAdObject = new h5(jSONObject);
                        this.synchronizedFullResponse = new h5(jSONObject2);
                        this.adObject = null;
                        this.fullResponse = null;
                    } else {
                        this.adObject = jSONObject;
                        this.fullResponse = jSONObject2;
                        this.synchronizedAdObject = null;
                        this.synchronizedFullResponse = null;
                    }
                    this.createdAtMillis = System.currentTimeMillis();
                    return;
                }
                throw new IllegalArgumentException("No sdk specified");
            }
            throw new IllegalArgumentException("No response specified");
        }
        throw new IllegalArgumentException("No ad object specified");
    }
}
