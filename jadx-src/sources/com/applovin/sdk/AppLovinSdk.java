package com.applovin.sdk;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.w3;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxSegmentCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class AppLovinSdk {
    private static final String TAG = "AppLovinSdk";
    private static AppLovinSdk instance;
    private final C1802k coreSdk;
    public static final String VERSION = getVersion();
    public static final int VERSION_CODE = getVersionCode();
    private static final Object instanceLock = new Object();

    public interface SdkInitializationListener {
        void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    private static int getVersionCode() {
        return 13050199;
    }

    public void showMediationDebugger() {
        this.coreSdk.W0();
    }

    public static AppLovinSdk getInstance(Context context) {
        AppLovinSdk appLovinSdk;
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        synchronized (instanceLock) {
            try {
                if (instance == null) {
                    C1802k c1802k = new C1802k(new AppLovinSdkSettings(context), context);
                    AppLovinSdk appLovinSdk2 = new AppLovinSdk(c1802k);
                    c1802k.a(appLovinSdk2);
                    instance = appLovinSdk2;
                }
                appLovinSdk = instance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return appLovinSdk;
    }

    private static String getVersion() {
        return "13.5.1";
    }

    public C1802k a() {
        return this.coreSdk;
    }

    public AppLovinAdService getAdService() {
        return this.coreSdk.k();
    }

    public List<MaxMediatedNetworkInfo> getAvailableMediatedNetworks() {
        JSONArray jSONArrayB = w3.b(this.coreSdk);
        ArrayList arrayList = new ArrayList(jSONArrayB.length());
        for (int i2 = 0; i2 < jSONArrayB.length(); i2++) {
            arrayList.add(new MaxMediatedNetworkInfoImpl(JsonUtils.getJSONObject(jSONArrayB, i2, (JSONObject) null)));
        }
        return arrayList;
    }

    public AppLovinCmpService getCmpService() {
        return this.coreSdk.s();
    }

    public AppLovinSdkConfiguration getConfiguration() {
        return this.coreSdk.v();
    }

    public AppLovinEventService getEventService() {
        return this.coreSdk.F();
    }

    public String getSdkKey() {
        return this.coreSdk.i0();
    }

    public MaxSegmentCollection getSegmentCollection() {
        return this.coreSdk.j0();
    }

    public AppLovinSdkSettings getSettings() {
        return this.coreSdk.n0();
    }

    public void initialize(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, @Nullable SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.a(appLovinSdkInitializationConfiguration, sdkInitializationListener);
    }

    public boolean isInitialized() {
        return this.coreSdk.B0();
    }

    public void processDeepLink(Uri uri) {
        this.coreSdk.a(uri);
    }

    protected void reinitialize(Boolean bool, Boolean bool2) {
        if (this.coreSdk.D0()) {
            this.coreSdk.R0();
        }
        this.coreSdk.Q0();
        if (bool != null) {
            this.coreSdk.O();
            if (C1804o.a()) {
                this.coreSdk.O().d(TAG, "Toggled 'huc' to " + bool);
            }
            getEventService().trackEvent("huc", CollectionUtils.map("value", bool.toString()));
        }
        if (bool2 != null) {
            this.coreSdk.O();
            if (C1804o.a()) {
                this.coreSdk.O().d(TAG, "Toggled 'dns' to " + bool2);
            }
            getEventService().trackEvent("dns", CollectionUtils.map("value", bool2.toString()));
        }
    }

    public void showCreativeDebugger() {
        this.coreSdk.V0();
    }

    public void showMediationDebugger(@Nullable Map<String, List<?>> map) {
        this.coreSdk.a(map);
    }

    public String toString() {
        return "AppLovinSdk{sdkKey='" + getSdkKey() + "', isInitialized=" + isInitialized() + ", isFirstSession=" + this.coreSdk.C0() + '}';
    }

    private AppLovinSdk(C1802k c1802k) {
        this.coreSdk = c1802k;
    }
}
