package com.safedk.android.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.work.impl.constraints.controllers.qRl.FijIa;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.safedk.android.utils.j;
import com.safedk.android.utils.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class DeviceData implements AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final String f62868A = "is_ad_tracking_enabled";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final String f62869B = "enduser_id";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final String f62870C = "app_version_name";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final String f62871D = "app_version";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final String f62872E = "init_success";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final String f62873F = "value";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final String f62874G = "user_id";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f62875a = "sdk_key";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f62876l = "DeviceData";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f62877m = "values";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f62878n = "operator";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f62879o = "lte";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f62880p = "gte";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f62881q = "deactivationPercentage";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f62882r = "device_type";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f62883s = "applovin_random_token";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f62884t = "device_brand";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f62885u = "device_model";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f62886v = "device_revision";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f62887w = "os_version";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f62888x = "safedk_version";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f62889y = "applovin_version";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f62890z = "from_store";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private j f62891H;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f62892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f62893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f62894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f62895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f62896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f62897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f62898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f62899i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f62900j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f62901k = false;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    private enum CriteriaField {
        deviceModel,
        manufacturer,
        country,
        appVersionCode,
        androidVersion,
        osVersion,
        appDeviceIDs,
        age,
        region
    }

    private DeviceData() {
    }

    public DeviceData(final Context context, j prefs) {
        Logger.d(f62876l, "DeviceData started");
        this.f62891H = prefs;
        this.f62892b = Build.MODEL;
        this.f62893c = Build.MANUFACTURER.toLowerCase();
        this.f62895e = Build.VERSION.SDK_INT;
        try {
            new Thread(new Runnable() { // from class: com.safedk.android.internal.DeviceData.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        DeviceData.this.f62901k = DeviceData.this.a(context);
                    } catch (Throwable th) {
                    }
                }
            }).start();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f62896f = packageInfo.versionName;
            this.f62894d = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            Logger.e(f62876l, "Error getting device data", e2);
        } catch (Throwable th) {
            Logger.e(f62876l, "Error getting device data", th);
        }
        AppLovinBridge.registerToReceiveSafeDKSettings(this);
        AppLovinBridge.registerToReceiveUserInfo(this);
    }

    public String a() {
        String str = this.f62899i;
        if (str != null) {
            return str;
        }
        j jVar = this.f62891H;
        if (jVar != null && jVar.n() == this.f62894d) {
            return this.f62891H.m();
        }
        return null;
    }

    public String b() {
        String str = this.f62898h;
        if (str != null) {
            return str;
        }
        j jVar = this.f62891H;
        if (jVar != null && jVar.n() == this.f62894d) {
            return this.f62891H.o();
        }
        return null;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage message) {
        Logger.d(f62876l, "message received ", message.getMessageData());
        Bundle messageData = message.getMessageData();
        if (messageData.containsKey(f62872E)) {
            if (this.f62891H != null) {
                this.f62898h = messageData.getString(f62883s);
                String string = messageData.getString("sdk_key");
                this.f62899i = string;
                this.f62891H.a(this.f62894d, this.f62898h, string);
                this.f62897g = messageData.getString(f62882r);
                SdksMapping.setMaxAdapterVersions(messageData);
                if (Boolean.parseBoolean(messageData.getString(f62872E))) {
                    Logger.d(f62876l, "AppLovinSdk reported success to retrieve settings");
                    SafeDK.getInstance().a(messageData, true);
                } else {
                    SafeDK.getInstance().a(true);
                    Logger.d(f62876l, "AppLovinSdk reported a failure to retrieve settings. The saved settings from a previous session will be used.");
                }
            } else {
                Logger.d(f62876l, FijIa.niFFzVjVGdC);
            }
        } else if (messageData.containsKey("value")) {
            this.f62900j = messageData.getString("value");
        } else if (messageData.containsKey(f62874G)) {
            this.f62900j = messageData.getString(f62874G);
        }
        SafeDK.ac();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return AppLovinBridge.f61283a;
    }

    public static float a(String str, String str2) {
        return (Math.abs((str + str2).hashCode()) % 100000) / 1000;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putString("package", SafeDK.getInstance().m().getPackageName());
        bundle.putString(AppLovinBridge.f61288f, AppLovinBridge.f61290h);
        bundle.putString(f62883s, b());
        bundle.putString(f62889y, n.a());
        bundle.putString("safedk_version", com.safedk.android.a.f61234a);
        bundle.putString(f62882r, this.f62897g);
        bundle.putString(f62885u, Build.MODEL);
        bundle.putString(f62884t, Build.MANUFACTURER);
        bundle.putString(f62886v, Build.DEVICE);
        bundle.putString(f62887w, Build.VERSION.RELEASE);
        bundle.putString(f62871D, String.valueOf(this.f62894d));
        bundle.putString(f62870C, this.f62896f);
        SafeDK.getInstance();
        bundle.putBoolean(f62890z, SafeDK.a());
        bundle.putString(f62869B, this.f62900j);
        bundle.putBoolean(f62868A, this.f62901k);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Context context) {
        try {
            if (AdvertisingIdClient.getAdvertisingIdInfo(context) != null) {
                return !r1.isLimitAdTrackingEnabled();
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }
}
