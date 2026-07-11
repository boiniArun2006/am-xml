package com.applovin.impl.sdk;

import android.os.Bundle;
import android.view.View;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.AbstractRunnableC1782i5;
import com.applovin.impl.C1784j;
import com.applovin.impl.b3;
import com.applovin.impl.c3;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.d3;
import com.applovin.impl.d6;
import com.applovin.impl.e8;
import com.applovin.impl.h3;
import com.applovin.impl.h7;
import com.applovin.impl.n0;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w3;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class j implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f50206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AppLovinCommunicator f50207b;

    public void a(JSONObject jSONObject, boolean z2) {
        if (b("safedk_init") && C1784j.c()) {
            Bundle bundle = new Bundle();
            bundle.putString("sdk_key", this.f50206a.i0());
            bundle.putString("applovin_random_token", this.f50206a.h0());
            bundle.putString("compass_random_token", this.f50206a.u());
            bundle.putString("device_type", AppLovinSdkUtils.isTablet(C1802k.o()) ? "tablet" : "phone");
            bundle.putString("init_success", String.valueOf(z2));
            bundle.putParcelableArrayList(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS, JsonUtils.toBundle(w3.b(this.f50206a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", (JSONObject) null);
            Bundle bundle2 = (Bundle) bundle.clone();
            bundle2.putString("user_id", this.f50206a.w0().e());
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "safedk_settings", new JSONObject());
            if (!((Boolean) this.f50206a.a(x4.l7)).booleanValue()) {
                JSONObject jSONObject4 = new JSONObject();
                JsonUtils.putBoolean(jSONObject4, com.safedk.android.internal.d.f63017y, true);
                JsonUtils.putJSONObject(jSONObject3, com.safedk.android.internal.d.f63015w, jSONObject4);
            }
            bundle2.putBundle("settings", JsonUtils.toBundle(jSONObject3));
            this.f50206a.O();
            if (C1804o.a()) {
                this.f50206a.O().a("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            a(bundle2, "safedk_init");
        }
    }

    public void b(String str, String str2) {
        if (b("user_info") && C1784j.c()) {
            Bundle bundle = new Bundle(2);
            bundle.putString("user_id", StringUtils.emptyIfNull(str));
            bundle.putString("applovin_random_token", str2);
            a(bundle, "user_info");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        Map<String, Object> map;
        long j2;
        int i2;
        long j3;
        Map<String, Object> map2;
        if (((Boolean) this.f50206a.a(x4.k7)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
                Map<String, Object> map3 = BundleUtils.toMap(messageData.getBundle("post_body"));
                Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
                String string = messageData.getString("id", "");
                if (!map3.containsKey("sdk_key")) {
                    map3.put("sdk_key", this.f50206a.i0());
                }
                this.f50206a.f0().e(new d.b().d(messageData.getString("url")).a(messageData.getString("backup_url")).b(stringMap).c(map3).a(stringMap2).a(((Boolean) this.f50206a.a(x4.k5)).booleanValue()).b(string).a());
                return;
            }
            if (!"send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f50206a.k().addCustomQueryParams(n7.a((Map) BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
                    return;
                } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f50206a.k().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                    return;
                } else {
                    if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                        this.f50206a.X().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                        return;
                    }
                    return;
                }
            }
            Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
            String string2 = messageData2.getString("http_method", "POST");
            long millis = messageData2.containsKey("timeout_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec")) : ((Long) this.f50206a.a(x4.j3)).longValue();
            int i3 = messageData2.getInt("retry_count", ((Integer) this.f50206a.a(x4.k3)).intValue());
            long millis2 = messageData2.containsKey("retry_delay_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec")) : ((Long) this.f50206a.a(x4.f50830l3)).longValue();
            Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
            if ("GET".equalsIgnoreCase(string2)) {
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    map2 = null;
                    stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(this.f50206a.A().a((Map) null, false, false))));
                } else {
                    map2 = null;
                }
                j2 = millis;
                i2 = i3;
                j3 = millis2;
                map = map2;
            } else {
                map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    Map mapG = this.f50206a.A().G();
                    Map mapP = this.f50206a.A().p();
                    j3 = millis2;
                    if (mapP.containsKey("idfv") && mapP.containsKey("idfv_scope")) {
                        i2 = i3;
                        String str = (String) mapP.get("idfv");
                        j2 = millis;
                        Integer num = (Integer) mapP.get("idfv_scope");
                        num.getClass();
                        mapP.remove("idfv");
                        mapP.remove("idfv_scope");
                        mapG.put("idfv", str);
                        mapG.put("idfv_scope", num);
                    } else {
                        j2 = millis;
                        i2 = i3;
                    }
                    mapG.put("server_installed_at", this.f50206a.a(x4.f50834o));
                    mapG.put("sdk_key", this.f50206a.i0());
                    map.put(PangleCreativeInfo.f62498a, mapG);
                    map.put("device", mapP);
                } else {
                    j2 = millis;
                    i2 = i3;
                    j3 = millis2;
                }
            }
            this.f50206a.q0().a((AbstractRunnableC1782i5) new n0(appLovinCommunicatorMessage.getPublisherId(), com.applovin.impl.sdk.network.a.a(this.f50206a).b(messageData2.getString("url")).a(messageData2.getString("backup_url")).b(stringMap3).c(string2).a((Map) BundleUtils.toStringMap(messageData2.getBundle("headers"))).a(map != null ? new JSONObject(map) : null).c((int) j2).a(i2).b((int) j3).a((Object) new JSONObject()).a(messageData2.getBoolean("is_encoding_enabled", false)).a(), this.f50206a), d6.b.OTHER);
        }
    }

    j(C1802k c1802k) {
        this.f50206a = c1802k;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(C1802k.o());
        this.f50207b = appLovinCommunicator;
        if (((Boolean) c1802k.a(x4.k7)).booleanValue()) {
            appLovinCommunicator.a(c1802k);
            appLovinCommunicator.subscribe(this, h7.f48665a);
        }
    }

    public void b(y2 y2Var, String str) {
        if (b("max_ad_events")) {
            Bundle bundleA = a(y2Var);
            bundleA.putString("type", str);
            this.f50206a.O();
            if (C1804o.a()) {
                this.f50206a.O().a("CommunicatorService", "Sending \"max_ad_events\" message: " + bundleA);
            }
            a(bundleA, "max_ad_events");
        }
    }

    public void b(y2 y2Var) {
        if (b("max_revenue_events")) {
            Bundle bundleA = a(y2Var);
            bundleA.putAll(JsonUtils.toBundle(y2Var.P()));
            bundleA.putString("country_code", this.f50206a.v().getCountryCode());
            a(bundleA, "max_revenue_events");
        }
    }

    public void b(List list) {
        if (b("test_mode_networks_updated")) {
            if (list == null || list.isEmpty()) {
                a(Bundle.EMPTY, "test_mode_networks_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("test_mode_networks", new ArrayList<>(list));
            a(bundle, "test_mode_networks_updated");
        }
    }

    public void a(y2 y2Var, String str) {
        if (b("ad_callback_blocked_after_hidden")) {
            Bundle bundleA = a(y2Var);
            bundleA.putString("callback_name", str);
            a(bundleA, "ad_callback_blocked_after_hidden");
        }
    }

    private boolean b(String str) {
        if (((Boolean) this.f50206a.a(x4.k7)).booleanValue()) {
            return this.f50206a.c(x4.j7).contains(str) || this.f50207b.hasSubscriber(str);
        }
        return false;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (b("adapter_initialization_status")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str);
            bundle.putInt("init_status", initializationStatus.getCode());
            a(bundle, "adapter_initialization_status");
        }
    }

    public void a() {
        if (b("privacy_setting_updated")) {
            a(new Bundle(), "privacy_setting_updated");
        }
    }

    public void a(String str, String str2) {
        if (b("network_sdk_version_updated")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            a(bundle, "network_sdk_version_updated");
        }
    }

    public void a(List list) {
        if (b("live_networks_updated")) {
            if (list == null || list.isEmpty()) {
                a(Bundle.EMPTY, "live_networks_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("live_networks", new ArrayList<>(list));
            a(bundle, "live_networks_updated");
        }
    }

    public void a(String str, String str2, String str3) {
        if (b("responses")) {
            String strMaybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String strMaybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", strMaybeConvertToIndentedString);
            bundle.putString("response", strMaybeConvertToIndentedString2);
            a(bundle, "responses");
        }
    }

    public void a(String str, String str2, int i2, Object obj, String str3, boolean z2) {
        if (b("receive_http_response")) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putString("url", str2);
            bundle.putInt("code", i2);
            bundle.putBundle("body", JsonUtils.toBundle(obj));
            bundle.putBoolean("success", z2);
            BundleUtils.putString("error_message", str3, bundle);
            a(bundle, "receive_http_response");
        }
    }

    public void a(Bundle bundle, String str) {
        if (b(str)) {
            this.f50207b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this, this.f50206a.c(x4.j7).contains(str)));
        }
    }

    public boolean a(String str) {
        return h7.f48665a.contains(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Bundle a(y2 y2Var) {
        View viewS0;
        Bundle bundle = new Bundle();
        bundle.putString("id", y2Var.Q());
        bundle.putString(BrandSafetyEvent.ad, y2Var.c());
        bundle.putString(BrandSafetyEvent.f62741l, y2Var.getAdUnitId());
        bundle.putString(BrandSafetyEvent.f62740k, y2Var.R());
        bundle.putString("ad_format", y2Var.getFormat().getLabel());
        BundleUtils.putStringIfValid("creative_id", y2Var.getCreativeId(), bundle);
        BundleUtils.putStringIfValid("adomain", y2Var.v(), bundle);
        BundleUtils.putStringIfValid("dsp_name", y2Var.getDspName(), bundle);
        if ("CUSTOM_NETWORK_SDK".equalsIgnoreCase(y2Var.c())) {
            bundle.putString("custom_sdk_network_name", y2Var.getNetworkName());
        }
        bundle.putAll(JsonUtils.toBundle(y2Var.x()));
        if (y2Var instanceof h3) {
            if (y2Var instanceof b3) {
                viewS0 = ((b3) y2Var).y();
            } else if (y2Var instanceof d3) {
                d3 d3Var = (d3) y2Var;
                if (d3Var.x0()) {
                    viewS0 = null;
                } else {
                    viewS0 = d3Var.s0() != null ? d3Var.s0() : d3Var.t0();
                }
            }
            bundle.putString("ad_view", viewS0 != null ? e8.a(viewS0) : "N/A");
            return bundle;
        }
        if (y2Var instanceof c3) {
            Bundle bundle2 = ((c3) y2Var).q0().getBundle("applovin_ad_view_info");
            bundle.putString("ad_view", BundleUtils.getString("ad_view_address", "N/A", bundle2));
            bundle.putString("video_view", BundleUtils.getString("video_view_address", "N/A", bundle2));
        }
        return bundle;
    }
}
