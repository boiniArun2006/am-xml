package com.safedk.android.analytics;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.database.sqlite.cL.PtsLKY;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.sdk.AppLovinSdk;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class AppLovinBridge {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final String f61266A = "ad_review_creative_id";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static Context f61281P = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f61283a = "SafeDK";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f61284b = "v1/events";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f61285c = "v1/image_uploaded";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f61286d = "v1/resolved";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f61287e = "v1/file_uploaded";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f61289g = "package";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f61290h = "android";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f61291i = "body";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f61293k = "AppLovinBridge";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f61294l = "max_ad_events";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f61295m = "safedk_init";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f61296n = "user_info";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f61297o = "send_http_request";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f61298p = "receive_http_response";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f61299q = "safedk_ad_info";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f61300r = "max_revenue_events";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f61301s = "url";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f61302t = "backup_url";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f61303u = "post_body";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f61304v = "report";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f61305w = "metadata";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f61306x = "events";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f61307y = "public";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f61308z = "private";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static String f61267B = "https://edge.safedk.com/v1/events";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static String f61268C = "https://edge.safedk.com/v1/events";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static String f61269D = "https://edge.safedk.com/v1/image_uploaded";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static String f61270E = "https://edge.safedk.com/v1/image_uploaded";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static String f61271F = "https://edge.safedk.com/v1/resolved";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static String f61272G = "https://edge.safedk.com/v1/resolved";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static String f61273H = "https://edge.safedk.com/v1/file_uploaded";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static String f61274I = "https://edge.safedk.com/v1/file_uploaded";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f61288f = "platform";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final String[] f61275J = {f61288f};

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final String[] f61276K = {"sdk_uuid", "impression_id", "ad_format_type", StatsEvent.f62824A};

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final String[] f61277L = {FileUploadManager.f61565c};

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final String[] f61278M = {FileUploadManager.f61570h};

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final String[] f61279N = {FileUploadManager.f61564b};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final HashMap<String, ArrayList<b>> f61280O = new HashMap<>();

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static AppLovinCommunicator f61282Q = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static AppLovinCommunicatorSubscriber f61292j = new AppLovinCommunicatorSubscriber() { // from class: com.safedk.android.analytics.AppLovinBridge.1
        @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
        public void onMessageReceived(AppLovinCommunicatorMessage message) {
            Logger.d(AppLovinBridge.f61293k, "Response received ", message.getMessageData(), ", topic=", message.getTopic(), ", url=", message.getMessageData().getString("url"));
            Bundle messageData = message.getMessageData();
            String string = message.getMessageData().getString("url");
            if (string.endsWith(AppLovinBridge.f61284b)) {
                AppLovinBridge.b(AppLovinBridge.f61284b, messageData.getBundle("body"));
            } else if (string.endsWith(AppLovinBridge.f61285c)) {
                AppLovinBridge.b(AppLovinBridge.f61285c, messageData.getBundle("body"));
            } else if (string.endsWith(AppLovinBridge.f61286d)) {
                AppLovinBridge.b(AppLovinBridge.f61286d, messageData.getBundle("body"));
            }
        }

        @Override // com.applovin.communicator.AppLovinCommunicatorEntity
        public String getCommunicatorId() {
            return AppLovinBridge.f61283a;
        }
    };

    public static void init(Context context) {
        f61281P = context;
        registerToReceiveResponse(f61292j);
    }

    public static void receiveEdgeUrls(String url, String backupUrl) {
        Logger.d(f61293k, "receive edge urls, url=", url, ", backupUrl=", backupUrl);
        if (!TextUtils.isEmpty(url)) {
            String str = url + "/" + f61284b;
            f61267B = str;
            Logger.d(f61293k, "receive edge urls, BrandSafetyReportUrl updated to ", str);
            String str2 = url + "/" + f61285c;
            f61269D = str2;
            Logger.d(f61293k, "receive edge urls, ImageUploadedUrl updated to ", str2);
            String str3 = url + "/" + f61286d;
            f61271F = str3;
            Logger.d(f61293k, "receive edge urls, ResolvedUrl updated to ", str3);
            String str4 = url + "/" + f61287e;
            f61273H = str4;
            Logger.d(f61293k, "receive edge urls, FileUploadedUrl updated to ", str4);
        }
        if (!TextUtils.isEmpty(backupUrl)) {
            String str5 = backupUrl + "/" + f61284b;
            f61268C = str5;
            Logger.d(f61293k, "Backup BrandSafetyReportUrl updated to ", str5);
            String str6 = backupUrl + "/" + f61285c;
            f61270E = str6;
            Logger.d(f61293k, "Backup ImageUploadedUrl updated to ", str6);
            String str7 = backupUrl + "/" + f61286d;
            f61272G = str7;
            Logger.d(f61293k, "Backup ResolvedUrl updated to ", str7);
            String str8 = backupUrl + "/" + f61287e;
            f61274I = str8;
            Logger.d(f61293k, "Backup FileUploadUrl updated to ", str8);
        }
    }

    public static AppLovinCommunicator getApplovinCommunicator() {
        AppLovinCommunicator appLovinCommunicator = f61282Q;
        if (appLovinCommunicator != null) {
            return appLovinCommunicator;
        }
        Object obj = null;
        try {
            Logger.d(f61293k, "get communicator: current applovin sdk is: ", AppLovinSdk.VERSION);
            Class<?> cls = Class.forName("com.applovin.communicator.AppLovinCommunicator");
            try {
                f61282Q = (AppLovinCommunicator) cls.getMethod("getInstance", Context.class).invoke(null, f61281P);
                obj = "Context";
            } catch (Throwable th) {
                f61282Q = (AppLovinCommunicator) cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                obj = "empty";
            }
        } catch (Throwable th2) {
            Logger.d(f61293k, "Failed to initialize AppLovinCommunicator", th2);
        }
        Logger.d(f61293k, "get communicator: returned: ", f61282Q, " with overload: ", obj);
        return f61282Q;
    }

    static void a(ArrayList<Bundle> arrayList, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        Logger.printFullVerboseLog(f61293k, "report stats events start ", Integer.valueOf(arrayList.size()), " events. edgeUrl=", f61267B, ", events : ", arrayList);
        Bundle bundle = new Bundle();
        bundle.putString("url", f61267B);
        bundle.putString(f61302t, f61268C);
        Bundle bundle2 = new Bundle();
        Bundle bundleC = SafeDK.getInstance().x().c();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        for (Bundle bundle3 : arrayList) {
            if (("impression".equals(bundle3.getString(StatsEvent.f62830z)) && a(bundle3, f61276K, "stats event")) || !a(bundle3)) {
                Logger.d(f61293k, "report stats events, skipping event with missing fields.");
            } else {
                arrayList2.add(bundle3);
            }
        }
        if (arrayList2.isEmpty() || a(bundleC, f61275J, "metadata")) {
            Logger.d(f61293k, "report stats events not completed. there are missing fields.");
            return;
        }
        bundle2.putBundle("metadata", bundleC);
        bundle2.putParcelableArrayList("events", arrayList2);
        Bundle bundle4 = new Bundle();
        bundle4.putBundle("report", bundle2);
        bundle.putBundle(f61303u, bundle4);
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(bundle, f61297o, appLovinCommunicatorPublisher);
        AppLovinCommunicator applovinCommunicator = getApplovinCommunicator();
        if (applovinCommunicator == null) {
            Logger.d(f61293k, "could not get communicator");
        } else {
            Logger.d(f61293k, "publishing message with ", Integer.valueOf(arrayList.size()), " events");
            applovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
        }
    }

    public static Bundle initHttpRequestBundle(String httpRequestUrl, String httpRequestBackupUrl, Bundle data) {
        Bundle bundle = new Bundle();
        bundle.putString("url", httpRequestUrl);
        bundle.putString(f61302t, httpRequestBackupUrl);
        bundle.putBundle(f61303u, data);
        return bundle;
    }

    public static void reportImageUploadEvent(Bundle data, AppLovinCommunicatorPublisher callback) {
        Logger.d(f61293k, "report image upload event start. Data=", data);
        Bundle bundleC = SafeDK.getInstance().x().c();
        data.putBundle("metadata", bundleC);
        if (a(data, f61277L, "image uploaded") || a(bundleC, f61275J, "metadata")) {
            Logger.d(f61293k, "report image upload event not completed. there are missing fields.");
            return;
        }
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(initHttpRequestBundle(f61269D, f61270E, data), f61297o, callback);
        AppLovinCommunicator applovinCommunicator = getApplovinCommunicator();
        if (applovinCommunicator == null) {
            Logger.d(f61293k, "could not get communicator");
        } else {
            Logger.d(f61293k, "publishing message. body=", data);
            applovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
        }
    }

    public static void reportFileUploadEvent(Bundle data, AppLovinCommunicatorPublisher callback) {
        Logger.d(f61293k, "report File upload event start. Data=", data);
        data.putString("sdk_key", SafeDK.getInstance().x().a());
        Bundle bundleC = SafeDK.getInstance().x().c();
        data.putBundle("metadata", bundleC);
        if (a(data, f61278M, "file uploaded") || a(bundleC, f61275J, "metadata")) {
            Logger.d(f61293k, "report File upload event not completed. there are missing fields.");
            return;
        }
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(initHttpRequestBundle(f61273H, f61274I, data), f61297o, callback);
        AppLovinCommunicator applovinCommunicator = getApplovinCommunicator();
        if (applovinCommunicator == null) {
            Logger.d(f61293k, "could not get communicator");
        } else {
            Logger.d(f61293k, "publishing message. body=", data);
            applovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
        }
    }

    public static void reportClickUrlResolvedEvent(Bundle data, AppLovinCommunicatorPublisher callback) {
        Logger.d(f61293k, "report click url resolved event start");
        Bundle bundleC = SafeDK.getInstance().x().c();
        data.putBundle("metadata", bundleC);
        if (a(data, f61279N, "resolved") || a(bundleC, f61275J, "metadata")) {
            Logger.d(f61293k, "report image upload event not completed. there are missing fields.");
            return;
        }
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(initHttpRequestBundle(f61271F, f61272G, data), f61297o, callback);
        AppLovinCommunicator applovinCommunicator = getApplovinCommunicator();
        if (applovinCommunicator == null) {
            Logger.d(f61293k, "could not get communicator");
        } else {
            Logger.d(f61293k, "publishing message. body=", data);
            applovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
        }
    }

    public static void reportMaxCreativeId(Bundle appLovinMaxBundle, String creativeId, AppLovinCommunicatorPublisher callback) {
        Logger.d(f61293k, "report max creative ID start, creative ID=", creativeId, ", appLovin max bundle=", appLovinMaxBundle.toString());
        Bundle bundle = new Bundle();
        bundle.putString(f61266A, creativeId);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle(f61307y, bundle);
        bundle2.putBundle(f61308z, appLovinMaxBundle);
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(bundle2, f61299q, callback);
        AppLovinCommunicator applovinCommunicator = getApplovinCommunicator();
        if (applovinCommunicator == null) {
            Logger.d(f61293k, "could not get communicator");
        } else {
            Logger.d(f61293k, "report max creative ID, publishing message. body=", bundle2);
            applovinCommunicator.getMessagingService().publish(appLovinCommunicatorMessage);
        }
    }

    private static boolean a(Bundle bundle) {
        return SdksMapping.getSdkPackageByPackageUUID(bundle.getString("sdk_uuid")) != null;
    }

    private static boolean a(Bundle bundle, String[] strArr, String str) {
        if (strArr != null) {
            HashSet hashSet = new HashSet();
            for (String str2 : strArr) {
                if (!bundle.containsKey(str2)) {
                    hashSet.add(str2);
                } else {
                    Object obj = bundle.get(str2);
                    if ((obj instanceof String) && TextUtils.isEmpty((String) obj)) {
                        hashSet.add(str2);
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                Logger.d(f61293k, "missing fields in ", str, " data: ", hashSet);
                return true;
            }
        }
        return false;
    }

    public static void registerToReceiveMaxEvents(AppLovinCommunicatorSubscriber subscriber) {
        a(subscriber, f61294l);
    }

    public static void registerToReceiveResponse(AppLovinCommunicatorSubscriber subscriber) {
        a(subscriber, f61298p);
    }

    public static void registerToReceiveSafeDKSettings(AppLovinCommunicatorSubscriber subscriber) {
        a(subscriber, f61295m);
    }

    public static void registerToReceiveMaxRevenueEvents(AppLovinCommunicatorSubscriber subscriber) {
        a(subscriber, PtsLKY.cOfRSwECxdyDf);
    }

    public static void registerToReceiveUserInfo(AppLovinCommunicatorSubscriber subscriber) {
        a(subscriber, f61296n);
    }

    private static void a(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        if (getApplovinCommunicator() != null) {
            getApplovinCommunicator().subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
        } else {
            Logger.d(f61293k, "could not register - communicator is null");
        }
    }

    public static void registerListener(String requestName, b listener) {
        try {
            Logger.d(f61293k, "register listener started, request name=", requestName);
            if (!f61280O.containsKey(requestName)) {
                Logger.d(f61293k, "register listener, listener list created for request name=", requestName);
                f61280O.put(requestName, new ArrayList<>());
            }
            ArrayList<b> arrayList = f61280O.get(requestName);
            Logger.d(f61293k, "register listener, listener added for request name=", requestName, ",", listener);
            arrayList.add(listener);
        } catch (Throwable th) {
            Logger.e(f61293k, "register listener failed. request name:", requestName, ", listener: ", listener, th);
            new CrashReporter().caughtException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, Bundle bundle) {
        try {
            Logger.d(f61293k, "notify listeners started, request name=", str, ", data=", bundle);
            ArrayList<b> arrayList = f61280O.get(str);
            if (arrayList != null) {
                for (b bVar : arrayList) {
                    Logger.d(f61293k, "Invoking handler for request name '", str, "', Bundle : ", bundle);
                    bVar.a(str, bundle);
                }
            }
        } catch (Throwable th) {
            Logger.e(f61293k, "Failed to read response", th);
        }
    }
}
