package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.d2;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u0;
import d8q.jqQ.QTafcm;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class AppLovinSdkSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f51151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f51152b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f51155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f51156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f51157g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AppLovinTermsAndPrivacyPolicyFlowSettings f51160j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C1802k f51161k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f51162l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f51154d = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f51158h = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f51159i = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f51153c = true;

    public void attachAppLovinSdk(C1802k c1802k) {
        this.f51161k = c1802k;
        if (StringUtils.isValidString(this.f51155e)) {
            c1802k.s0().a(Arrays.asList(this.f51155e.split(",")));
            this.f51155e = null;
        }
        if (this.f51156f != null) {
            c1802k.O();
            if (C1804o.a()) {
                c1802k.O().a("AppLovinSdkSettings", "Setting user id: " + this.f51156f);
            }
            c1802k.w0().a(this.f51156f);
            this.f51156f = null;
        }
        if (StringUtils.isValidString(this.f51157g)) {
            l.a(this.f51157g, c1802k);
            this.f51157g = null;
        }
        for (Map.Entry entry : this.f51159i.entrySet()) {
            c1802k.v0().a(d2.f48285k, "preInitExtraParameter", CollectionUtils.hashMap("details", ((String) entry.getKey()) + ":" + ((String) entry.getValue())));
        }
        this.f51159i.clear();
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.f51158h) {
            map = CollectionUtils.map(this.f51158h);
        }
        return map;
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings getTermsAndPrivacyPolicyFlowSettings() {
        return this.f51160j;
    }

    @Nullable
    public String getUserIdentifier() {
        C1802k c1802k = this.f51161k;
        return c1802k == null ? this.f51156f : c1802k.w0().e();
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f51153c;
    }

    public boolean isMuted() {
        return this.f51152b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f51151a;
    }

    public void setCreativeDebuggerEnabled(boolean z2) {
        C1804o.e("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z2 + ")");
        if (this.f51153c == z2) {
            return;
        }
        this.f51153c = z2;
        C1802k c1802k = this.f51161k;
        if (c1802k == null) {
            return;
        }
        if (z2) {
            c1802k.y().l();
        } else {
            c1802k.y().k();
        }
    }

    public void setExtraParameter(String str, @Nullable String str2) {
        C1804o.e("AppLovinSdkSettings", "setExtraParameter(key=" + str + ", value=" + str2 + ")");
        if (TextUtils.isEmpty(str)) {
            C1804o.h("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String strTrim = str2 != null ? str2.trim() : null;
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.f51161k == null) {
                this.f51155e = strTrim;
            } else if (StringUtils.isValidString(strTrim)) {
                this.f51161k.s0().a(Arrays.asList(strTrim.split(",")));
            } else {
                this.f51161k.s0().a((String) null);
            }
        } else if ("fan".equals(str) || "esc".equals(str)) {
            if (!this.f51162l.startsWith("com.unity.")) {
                return;
            }
        } else if ("disable_all_logs".equals(str)) {
            C1804o.a(Boolean.parseBoolean(strTrim));
        } else if ("package_name_override".equals(str)) {
            C1802k c1802k = this.f51161k;
            if (c1802k != null) {
                l.a(strTrim, c1802k);
            } else {
                this.f51157g = strTrim;
            }
        }
        if (this.f51161k != null) {
            this.f51161k.v0().a(d2.f48285k, "postInitExtraParameter", CollectionUtils.hashMap("details", str + ":" + str2));
        } else {
            this.f51159i.put(str, strTrim);
        }
        this.f51158h.put(str, strTrim);
    }

    public void setMuted(boolean z2) {
        C1804o.e("AppLovinSdkSettings", "setMuted(muted=" + z2 + ")");
        this.f51152b = z2;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z2) {
        C1804o.e("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z2 + ")");
        this.f51154d = z2;
    }

    public void setUserIdentifier(String str) {
        C1804o.e("AppLovinSdkSettings", QTafcm.sJayFhSf + str + ")");
        if (StringUtils.isValidString(str) && str.length() > n7.d(8)) {
            C1804o.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + n7.d(8) + " maximum)");
        }
        C1802k c1802k = this.f51161k;
        if (c1802k == null) {
            this.f51156f = str;
            return;
        }
        c1802k.O();
        if (C1804o.a()) {
            this.f51161k.O().a("AppLovinSdkSettings", "Setting user id: " + str);
        }
        this.f51161k.w0().a(str);
    }

    public void setVerboseLogging(boolean z2) {
        C1804o.e("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z2 + ")");
        if (!n7.l()) {
            this.f51151a = z2;
            return;
        }
        C1804o.h("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
        if (n7.m(null) != z2) {
            C1804o.h("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f51154d;
    }

    @NonNull
    public String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.f51151a + ", muted=" + this.f51152b + ", creativeDebuggerEnabled=" + this.f51153c + '}';
    }

    AppLovinSdkSettings(Context context) {
        this.f51162l = "";
        if (context == null) {
            C1804o.h("AppLovinSdkSettings", "context cannot be null. Please provide a valid context.");
        }
        Context contextE = n7.e(context);
        this.f51151a = n7.m(contextE);
        this.f51160j = u0.a(contextE);
        this.f51162l = contextE.getPackageName();
        a(contextE);
    }

    private void a(Context context) {
        JSONObject jSONObject;
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        String strA = n7.a(identifier, context, (C1802k) null);
        if (StringUtils.isValidString(strA)) {
            jSONObject = JsonUtils.jsonObjectFromJsonString(strA, new JSONObject());
        } else {
            jSONObject = new JSONObject();
        }
        this.f51158h.putAll(JsonUtils.tryToStringMap(jSONObject));
    }
}
