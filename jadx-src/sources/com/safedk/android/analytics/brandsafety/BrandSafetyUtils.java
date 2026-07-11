package com.safedk.android.analytics.brandsafety;

import ScC.FuwU.XIvb;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.core.net.Toe.GDEJgAYrPQHfw;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.utils.LimitedConcurrentHashMap;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import com.vungle.ads.internal.protos.Sdk;
import d8q.jqQ.QTafcm;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class BrandSafetyUtils {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int f61420A = 26;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final float f61421B = 0.2f;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final float f61422C = 0.2f;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final float f61423D = 0.2f;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final float f61424E = 0.2f;
    private static final String INTERSTITIAL_ACTIVITIES = "Y29tLnVuaXR5M2QuYWRzLmFuZHJvaWQudmlldy5Vbml0eUFkc0Z1bGxzY3JlZW5BY3Rpdml0eXxjb20udW5pdHkzZC5hZHMuYWR1bml0LkFkVW5pdEFjdGl2aXR5fGNvbS51bml0eTNkLmFkcy5hZHVuaXQuQWRVbml0U29mdHdhcmVBY3Rpdml0eXxjb20udW5pdHkzZC5zZXJ2aWNlcy5hZHMuYWR1bml0LkFkVW5pdEFjdGl2aXR5fGNvbS51bml0eTNkLnNlcnZpY2VzLmFkcy5hZHVuaXQuQWRVbml0U29mdHdhcmVBY3Rpdml0eXxjb20udW5pdHkzZC5hZHMuYWRwbGF5ZXIuRnVsbFNjcmVlbldlYlZpZXdEaXNwbGF5fGNvbS5nb29nbGUuYW5kcm9pZC5nbXMuYWRzLkFkQWN0aXZpdHl8Y29tLmdvb2dsZS5hZHMuQWRBY3Rpdml0eXxjb20udnVuZ2xlLnB1Ymxpc2hlci5GdWxsU2NyZWVuQWRBY3Rpdml0eXxjb20udnVuZ2xlLnB1Ymxpc2hlci5NcmFpZEZ1bGxTY3JlZW5BZEFjdGl2aXR5fGNvbS52dW5nbGUucHVibGlzaGVyLlZpZGVvRnVsbFNjcmVlbkFkQWN0aXZpdHl8Y29tLnZ1bmdsZS5wdWJsaXNoZXIuRmxleFZpZXdBZEFjdGl2aXR5fGNvbS52dW5nbGUud2FycmVuLnVpLlZ1bmdsZUFjdGl2aXR5fGNvbS52dW5nbGUud2FycmVuLnVpLlZ1bmdsZUZsZXhWaWV3QWN0aXZpdHl8Y29tLnZ1bmdsZS5hZHMuaW50ZXJuYWwudWkuVnVuZ2xlQWN0aXZpdHl8Y29tLmFwcGxvdmluLmFkdmlldy5BcHBMb3ZpbkludGVyc3RpdGlhbEFjdGl2aXR5fGNvbS5hcHBsb3Zpbi5hZHZpZXcuQXBwTG92aW5GdWxsc2NyZWVuQWN0aXZpdHl8Y29tLmFwcGxvdmluLmFkdmlldy5BcHBMb3ZpbkZ1bGxzY3JlZW5UaGVtZWRBY3Rpdml0eXxjb20uYXBwbG92aW4uaW1wbC5hZHZpZXcuQXBwTG92aW5PcmllbnRhdGlvbkF3YXJlSW50ZXJzdGl0aWFsQWN0aXZpdHl8Y29tLnN1cGVyc29uaWNhZHMuc2RrLmNvbnRyb2xsZXIuQ29udHJvbGxlckFjdGl2aXR5fGNvbS5zdXBlcnNvbmljYWRzLnNkay5jb250cm9sbGVyLkludGVyc3RpdGlhbEFjdGl2aXR5fGNvbS5pcm9uc291cmNlLnNkay5jb250cm9sbGVyLkNvbnRyb2xsZXJBY3Rpdml0eXxjb20uaXJvbnNvdXJjZS5zZGsuY29udHJvbGxlci5JbnRlcnN0aXRpYWxBY3Rpdml0eXxjb20ubWludGVncmFsLm1zZGsuaW50ZXJzdGl0aWFsLnZpZXcuTVRHSW50ZXJzdGl0aWFsQWN0aXZpdHl8Y29tLm1pbnRlZ3JhbC5tc2RrLnJld2FyZC5wbGF5ZXIuTVRHUmV3YXJkVmlkZW9BY3Rpdml0eXxjb20ubWludGVncmFsLm1zZGsubmV3cmV3YXJkLnBsYXllci5NVEdSZXdhcmRWaWRlb0FjdGl2aXR5fGNvbS5taW50ZWdyYWwubXNkay5pbnRlcmFjdGl2ZWFkcy5hY3Rpdml0eS5JbnRlcmFjdGl2ZVNob3dBY3Rpdml0eXxjb20ubWJyaWRnZS5tc2RrLmludGVyc3RpdGlhbC52aWV3Lk1CSW50ZXJzdGl0aWFsQWN0aXZpdHl8Y29tLm1icmlkZ2UubXNkay5yZXdhcmQucGxheWVyLk1CUmV3YXJkVmlkZW9BY3Rpdml0eXxjb20ubWJyaWRnZS5tc2RrLm5ld3Jld2FyZC5wbGF5ZXIuTUJSZXdhcmRWaWRlb0FjdGl2aXR5fGNvbS5tYnJpZGdlLm1zZGsuaW50ZXJhY3RpdmVhZHMuYWN0aXZpdHkuSW50ZXJhY3RpdmVTaG93QWN0aXZpdHl8Y29tLmZ5YmVyLmlubmVyYWN0aXZlLnNkay5hY3Rpdml0aWVzLklubmVyYWN0aXZlRnVsbHNjcmVlbkFkQWN0aXZpdHl8Y29tLmZpdmVfY29ycC5hZC5BZEFjdGl2aXR5fGNvbS5pbm1vYmkuYWRzLnJlbmRlcmluZy5Jbk1vYmlBZEFjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5UVEZ1bGxTY3JlZW5WaWRlb0FjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5UVEZ1bGxTY3JlZW5FeHByZXNzVmlkZW9BY3Rpdml0eXxjb20uYnl0ZWRhbmNlLnNkay5vcGVuYWRzZGsuYWN0aXZpdHkuVFRSZXdhcmRWaWRlb0FjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5UVFJld2FyZEV4cHJlc3NWaWRlb0FjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5UVEFwcE9wZW5BZEFjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5BZEFjdGl2aXR5fGNvbS5ieXRlZGFuY2Uuc2RrLm9wZW5hZHNkay5hY3Rpdml0eS5UVEFkQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LlRUSW50ZXJzdGl0aWFsQWN0aXZpdHl8Y29tLmJ5dGVkYW5jZS5zZGsub3BlbmFkc2RrLmFjdGl2aXR5LlRUSW50ZXJzdGl0aWFsRXhwcmVzc0FjdGl2aXR5fGNvbS5zbWFhdG8uc2RrLmludGVyc3RpdGlhbC5JbnRlcnN0aXRpYWxBZEFjdGl2aXR5fGNvbS5zbWFhdG8uc2RrLmludGVyc3RpdGlhbC52aWV3LkludGVyc3RpdGlhbEFkQWN0aXZpdHl8Y29tLnNtYWF0by5zZGsucmV3YXJkZWQud2lkZ2V0LlJld2FyZGVkSW50ZXJzdGl0aWFsQWRBY3Rpdml0eXxjb20uc21hYXRvLnNkay5yZXdhcmRlZC52aWV3LlJld2FyZGVkSW50ZXJzdGl0aWFsQWRBY3Rpdml0eXxjb20ubW9sb2NvLnNkay54ZW5vc3Muc2RrZGV2a2l0LmFuZHJvaWQuYWRyZW5kZXJlci5pbnRlcm5hbC5tcmFpZC5NcmFpZEFjdGl2aXR5fGNvbS5tb2xvY28uc2RrLnhlbm9zcy5zZGtkZXZraXQuYW5kcm9pZC5hZHJlbmRlcmVyLmludGVybmFsLnN0YXRpY3JlbmRlcmVyLlN0YXRpY0FkQWN0aXZpdHl8Y29tLm1vbG9jby5zZGsueGVub3NzLnNka2RldmtpdC5hbmRyb2lkLmFkcmVuZGVyZXIuaW50ZXJuYWwudmFzdC5WYXN0QWN0aXZpdHl8Y29tLmV4cGxvcmVzdGFjay5pYWIubXJhaWQuTXJhaWRBY3Rpdml0eXxjb20uZXhwbG9yZXN0YWNrLmlhYi52YXN0LmFjdGl2aXR5LlZhc3RBY3Rpdml0eXxpby5iaWRtYWNoaW5lLnJlbmRlcmluZy5hZC5mdWxsc2NyZWVuLkZ1bGxTY3JlZW5BY3Rpdml0eXxpby5iaWRtYWNoaW5lLmlhYi52YXN0LmFjdGl2aXR5LlZhc3RBY3Rpdml0eXxuZXQucHVibmF0aXZlLmxpdGUuc2RrLmludGVyc3RpdGlhbC5hY3Rpdml0eS5NcmFpZEludGVyc3RpdGlhbEFjdGl2aXR5fG5ldC5wdWJuYXRpdmUubGl0ZS5zZGsuaW50ZXJzdGl0aWFsLmFjdGl2aXR5LlZhc3RJbnRlcnN0aXRpYWxBY3Rpdml0eXxuZXQucHVibmF0aXZlLmxpdGUuc2RrLnJld2FyZGVkLmFjdGl2aXR5Lk1yYWlkUmV3YXJkZWRBY3Rpdml0eXxuZXQucHVibmF0aXZlLmxpdGUuc2RrLnJld2FyZGVkLmFjdGl2aXR5LlZhc3RSZXdhcmRlZEFjdGl2aXR5fGNvbS5tb2JpbGVmdXNlLnNkay5Nb2JpbGVGdXNlRnVsbHNjcmVlbkFjdGl2aXR5fGNvbS5jaGFydGJvb3N0LnNkay52aWV3LkNCSW1wcmVzc2lvbkFjdGl2aXR5fGNvbS5jaGFydGJvb3N0LnNkay52aWV3LkZ1bGxzY3JlZW5BZEFjdGl2aXR5fGNvbS5wdWJtYXRpYy5zZGsud2VicmVuZGVyaW5nLm1yYWlkLlBPQlZpZGVvUGxheWVyQWN0aXZpdHl8Y29tLnB1Ym1hdGljLnNkay53ZWJyZW5kZXJpbmcudWkuUE9CRnVsbFNjcmVlbkFjdGl2aXR5fGNvbS5hbWF6b24uYXBzLmFkcy5hY3Rpdml0eS5BcHNJbnRlcnN0aXRpYWxBY3Rpdml0eXxjb20ueWFuZGV4Lm1vYmlsZS5hZHMuY29tbW9uLkFkQWN0aXZpdHk=";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static int f61433N = 0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static int f61434O = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f61435a = ".jpg";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f61436b = ".txt";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f61437c = "unknown";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f61438d = "com.appsaholic";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int f61439e = 1000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f61440f = 500;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f61441g = 86400000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f61442h = 20000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f61443i = 5000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f61444j = "INTER";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f61445k = "REWARDED";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f61446l = "APPOPEN";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f61447m = "BANNER";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f61448n = "LEADER";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f61449o = "MREC";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f61450p = "NATIVE";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f61451q = "BrandSafetyUtils";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Set<String> f61452r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Set<String> f61453s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Set<String> f61454t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f61456v = 100;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f61457w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f61458x = 8947848;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f61459y = 4473924;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f61460z = 10;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final List<Integer> f61455u = new LinkedList();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static m f61425F = null;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static RedirectDetails f61426G = null;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static String f61427H = null;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static String f61428I = null;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final ExecutorService f61429J = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static Map<String, x> f61430K = new ConcurrentHashMap();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final LimitedConcurrentHashMap<String, WeakReference<WebView>> f61431L = new LimitedConcurrentHashMap<>();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final LimitedConcurrentHashMap<String, WeakReference<WebView>> f61432M = new LimitedConcurrentHashMap<>();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public enum AdType {
        INTERSTITIAL,
        MREC,
        BANNER,
        NATIVE
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public enum ScreenShotOrientation {
        NOT_INITIALIZED,
        PORTRAIT,
        LANDSCAPE
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public enum ScreenshotValidity {
        VALID,
        UNIFORMITY_BLACK,
        UNIFORMITY_VERY_HIGH,
        UNIFORMITY_HIGH,
        UNIFORMITY_GRAY,
        NOT_SUITABLE_FOR_DASHBOARD
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList(new String(Base64.decode(INTERSTITIAL_ACTIVITIES, 0)).split("\\|")));
        f61452r = hashSet;
        Logger.d(f61451q, "BrandSafetyUtils initialized with ", hashSet, ",  INTERSTITIAL_ACTIVITIES=", INTERSTITIAL_ACTIVITIES);
        HashSet hashSet2 = new HashSet(Arrays.asList(new String(Base64.decode("Y29tLmZ5YmVyLmlubmVyYWN0aXZlLnNkay5hY3Rpdml0aWVzLklubmVyYWN0aXZlSW50ZXJuYWxCcm93c2VyQWN0aXZpdHk=", 0)).split("\\|")));
        f61453s = hashSet2;
        Logger.d(f61451q, "BrandSafetyUtils initialized with ", hashSet2, ",  INTERNAL_BROWSER_ACTIVITIES=", INTERSTITIAL_ACTIVITIES);
        f61454t = new HashSet();
        f61433N = 0;
        f61434O = 0;
    }

    public static void a(String str) {
        f61453s.add(str);
    }

    public static BrandSafetyEvent.AdFormatType a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("ad_format");
            if (f61447m.equals(string) || f61448n.equals(string)) {
                return BrandSafetyEvent.AdFormatType.BANNER;
            }
            if (f61449o.equals(string)) {
                return BrandSafetyEvent.AdFormatType.MREC;
            }
            if (f61445k.equals(string)) {
                return BrandSafetyEvent.AdFormatType.REWARD;
            }
            if (f61444j.equals(string)) {
                return BrandSafetyEvent.AdFormatType.INTER;
            }
            if (f61446l.equals(string)) {
                return BrandSafetyEvent.AdFormatType.APPOPEN;
            }
            if ("NATIVE".equals(string)) {
                return BrandSafetyEvent.AdFormatType.NATIVE;
            }
            return null;
        }
        return null;
    }

    public static BrandSafetyEvent.AdFormatType a(AdType adType) {
        if (adType != null) {
            int i2 = AnonymousClass4.f61478a[adType.ordinal()];
            if (i2 == 1) {
                return BrandSafetyEvent.AdFormatType.INTER;
            }
            if (i2 == 2) {
                return BrandSafetyEvent.AdFormatType.BANNER;
            }
            if (i2 == 3) {
                return BrandSafetyEvent.AdFormatType.MREC;
            }
            if (i2 == 4) {
                return BrandSafetyEvent.AdFormatType.NATIVE;
            }
            return null;
        }
        return null;
    }

    public static AdType b(String str) {
        if (str != null) {
            return a(BrandSafetyEvent.AdFormatType.valueOf(str));
        }
        return null;
    }

    public static AdType a(BrandSafetyEvent.AdFormatType adFormatType) {
        if (adFormatType != null) {
            switch (AnonymousClass4.f61479b[adFormatType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return AdType.INTERSTITIAL;
                case 4:
                case 5:
                    return AdType.BANNER;
                case 6:
                    return AdType.MREC;
                case 7:
                    return AdType.NATIVE;
                default:
                    return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: com.safedk.android.analytics.brandsafety.BrandSafetyUtils$4, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f61478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f61479b;

        static {
            int[] iArr = new int[BrandSafetyEvent.AdFormatType.values().length];
            f61479b = iArr;
            try {
                iArr[BrandSafetyEvent.AdFormatType.INTER.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f61479b[BrandSafetyEvent.AdFormatType.REWARD.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f61479b[BrandSafetyEvent.AdFormatType.APPOPEN.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f61479b[BrandSafetyEvent.AdFormatType.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f61479b[BrandSafetyEvent.AdFormatType.LEADER.ordinal()] = 5;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f61479b[BrandSafetyEvent.AdFormatType.MREC.ordinal()] = 6;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f61479b[BrandSafetyEvent.AdFormatType.NATIVE.ordinal()] = 7;
            } catch (NoSuchFieldError e8) {
            }
            int[] iArr2 = new int[AdType.values().length];
            f61478a = iArr2;
            try {
                iArr2[AdType.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError e9) {
            }
            try {
                f61478a[AdType.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError e10) {
            }
            try {
                f61478a[AdType.MREC.ordinal()] = 3;
            } catch (NoSuchFieldError e11) {
            }
            try {
                f61478a[AdType.NATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError e12) {
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static class c implements FilenameFilter {
        c() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File dir, String name) {
            return name.endsWith(BrandSafetyUtils.f61435a);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    static class b implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f61518a;

        public b(String str) {
            this.f61518a = null;
            this.f61518a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File dir, String name) {
            return name.contains(this.f61518a);
        }
    }

    public static void detectAdClick(Intent intent, String sdkPackageName) {
        a(intent, sdkPackageName, false);
    }

    public static void a(final Intent intent, final String str, final boolean z2) {
        if (SafeDK.getInstance() == null || !SafeDK.getInstance().p()) {
            return;
        }
        Logger.d(f61451q, "detect ad click invoked, sdk=", str);
        if (com.safedk.android.utils.n.c()) {
            f61429J.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.1
                @Override // java.lang.Runnable
                public void run() {
                    BrandSafetyUtils.c(intent, str, z2);
                }
            });
        } else {
            c(intent, str, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public static void c(Intent intent, String str, boolean z2) {
        Uri uri;
        String string;
        String string2;
        String str2;
        long j2;
        int i2;
        long j3;
        int i3;
        Activity activity;
        String str3;
        int i5;
        StatsCollector statsCollector;
        int i7;
        Activity activity2;
        String str4;
        int i8;
        StatsCollector statsCollector2;
        String str5;
        long j4;
        StatsCollector statsCollector3;
        Activity activity3;
        boolean z3;
        String str6;
        boolean z4;
        String str7 = 2;
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
            Logger.printFullVerboseLog(f61451q, "detect ad click started, current timestamp (elapsed)=", Long.valueOf(jElapsedRealtime), ", sdk=", mainSdkPackage, ", intent=", com.safedk.android.utils.n.a(intent), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            if (!SafeDK.getInstance().s()) {
                return;
            }
            Logger.d(f61451q, "detect ad click - should monitor");
            if (intent == null) {
                return;
            }
            Intent intent2 = (Intent) intent.clone();
            Logger.d(f61451q, "detect ad click - intent cloned");
            int iF = SafeDK.getInstance().f();
            Logger.d(f61451q, "detect ad click - redirect click timeout is ", Integer.valueOf(iF));
            Uri data = intent2.getData();
            String strA = a(mainSdkPackage, intent2);
            if (strA != null) {
                Logger.d(f61451q, "detect ad click - uri extracted from intent extras");
                uri = Uri.parse(strA);
            } else {
                uri = data;
            }
            if (uri != null) {
                string2 = uri.toString();
                try {
                    if (com.safedk.android.utils.n.p(uri.toString())) {
                        Logger.d(f61451q, "detect ad click - Uri is a store url: ", uri);
                        string = uri.toString();
                    } else {
                        URL url = new URL(uri.toString());
                        Logger.d(f61451q, "detect ad click - Uri is a standard url: ", url);
                        string = url.toString();
                    }
                } catch (MalformedURLException e2) {
                    Logger.d(f61451q, "detect ad click - Uri is not a valid url: ", uri);
                    string = null;
                }
            } else {
                string = null;
                string2 = null;
            }
            String strB = b(mainSdkPackage, intent2);
            v vVarA = DetectTouchUtils.a(mainSdkPackage);
            long jLongValue = vVarA == null ? 0L : vVarA.f62709a.longValue();
            long jLongValue2 = vVarA == null ? 0L : vVarA.f62710b.longValue();
            String str8 = vVarA == null ? null : vVarA.f62711c;
            String str9 = vVarA == null ? null : vVarA.f62712d;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            a(mainSdkPackage, string2, strB, z2 ? RedirectEvent.f62802j : null);
            try {
                if ("android.intent.action.VIEW".equals(intent2.getAction()) || intent2.getAction() == null) {
                    if (string != null) {
                        Logger.d(f61451q, "detect ad click - has URL, intentUrl: ", string);
                        AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(mainSdkPackage);
                        if (adNetworkDiscoveryJ != null && adNetworkDiscoveryJ.j(string)) {
                            Logger.d(f61451q, "detect ad click - url should be ignored (by discovery class), skipping");
                            return;
                        }
                        if (a(intent)) {
                            return;
                        }
                        Logger.d(f61451q, "detect ad click - not handled (yet)");
                        Activity foregroundActivity = com.safedk.android.internal.b.getInstance().getForegroundActivity();
                        StatsCollector statsCollectorC = StatsCollector.c();
                        if (foregroundActivity != null && statsCollectorC != null) {
                            Logger.d(f61451q, "detect ad click - has foreground");
                            InterstitialFinder interstitialFinderZ = SafeDK.getInstance().z();
                            n nVarD = interstitialFinderZ != null ? interstitialFinderZ.d(foregroundActivity) : null;
                            boolean z5 = SafeDK.getInstance().A() != null && SafeDK.getInstance().A().m(str8);
                            if (interstitialFinderZ == null || nVarD == null || z5) {
                                StatsCollector statsCollector4 = statsCollectorC;
                                Activity activity4 = foregroundActivity;
                                long j5 = jLongValue;
                                int i9 = iF;
                                String str10 = f61451q;
                                try {
                                    Logger.d(str10, "detect ad click - no interstitial");
                                    long j6 = jElapsedRealtime2 - j5;
                                    if (j6 < 20000) {
                                        Logger.d(str10, "detect ad click - updating click URL. address : ", str8);
                                        for (com.safedk.android.analytics.brandsafety.a aVar : Arrays.asList(SafeDK.getInstance().A(), SafeDK.getInstance().C())) {
                                            if (aVar != null) {
                                                str4 = str10;
                                                i8 = i9;
                                                activity2 = activity4;
                                                statsCollector2 = statsCollector4;
                                                if (aVar.a(string, mainSdkPackage, str8, true, (String) null) && str8 != null) {
                                                    l.a[] aVarArr = new l.a[2];
                                                    aVarArr[0] = new l.a("url", string);
                                                    aVarArr[1] = new l.a(l.f62629J, z2 ? RedirectEvent.f62802j : "intent");
                                                    com.safedk.android.analytics.brandsafety.b.a(str8, l.f62659n, aVarArr);
                                                }
                                            } else {
                                                activity2 = activity4;
                                                str4 = str10;
                                                i8 = i9;
                                                statsCollector2 = statsCollector4;
                                            }
                                            str10 = str4;
                                            activity4 = activity2;
                                            i9 = i8;
                                            statsCollector4 = statsCollector2;
                                        }
                                        activity = activity4;
                                        str3 = str10;
                                        i5 = i9;
                                        statsCollector = statsCollector4;
                                        i7 = 6;
                                    } else {
                                        activity = activity4;
                                        str3 = str10;
                                        i5 = i9;
                                        statsCollector = statsCollector4;
                                        i7 = 6;
                                    }
                                    String strA2 = t.a(mainSdkPackage, j5);
                                    Object[] objArr = new Object[i7];
                                    objArr[0] = "detect ad click - last touch event(elapsed): ";
                                    objArr[1] = Long.valueOf(j5);
                                    objArr[2] = ", last touch event(current time millis): ";
                                    objArr[3] = Long.valueOf(jLongValue2);
                                    objArr[4] = ", redirectInfoKey: ";
                                    objArr[5] = strA2;
                                    Logger.d(str3, objArr);
                                    Object[] objArr2 = new Object[i7];
                                    objArr2[0] = "detect ad click - current elapsed realtime: ";
                                    objArr2[1] = Long.valueOf(jElapsedRealtime2);
                                    objArr2[2] = ", last touch event(elapsed): ";
                                    objArr2[3] = Long.valueOf(j5);
                                    objArr2[4] = ", diff: ";
                                    objArr2[5] = Long.valueOf(j6);
                                    Logger.d(str3, objArr2);
                                    if (!SafeDK.b() || statsCollector.a(mainSdkPackage, strA2) || (j5 != 0 && j6 <= i5)) {
                                        Logger.d(str3, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                    } else {
                                        a(mainSdkPackage, jElapsedRealtime, jLongValue2, q(mainSdkPackage) ? RedirectEvent.f62803k : RedirectEvent.f62800h, string, activity.getClass().getName());
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    str7 = str10;
                                }
                            } else {
                                Logger.d(f61451q, "detect ad click - has interstitial");
                                boolean zD2 = nVarD.d();
                                Logger.d(f61451q, "detect ad click - clicked ", Boolean.valueOf(zD2));
                                Logger.d(f61451q, "detect ad click - last touch event(elapsed): ", Long.valueOf(jLongValue), " last touch event(current time millis): ", Long.valueOf(jLongValue2), ", activityAddress=", a(foregroundActivity.getClass().getName(), true));
                                long j7 = jLongValue;
                                long j9 = jElapsedRealtime2 - j7;
                                if (j9 < 20000) {
                                    String str11 = string;
                                    statsCollector3 = statsCollectorC;
                                    j4 = jElapsedRealtime;
                                    activity3 = foregroundActivity;
                                    String str12 = str8;
                                    z3 = zD2;
                                    str5 = f61451q;
                                    try {
                                        if (interstitialFinderZ.a(str11, mainSdkPackage, str12, true, str9)) {
                                            if (str8 != null) {
                                                l.a[] aVarArr2 = new l.a[2];
                                                aVarArr2[0] = new l.a("url", string);
                                                aVarArr2[1] = new l.a(l.f62629J, z2 ? RedirectEvent.f62802j : "intent");
                                                com.safedk.android.analytics.brandsafety.b.a(str8, l.f62659n, aVarArr2);
                                            } else {
                                                n nVarD2 = interstitialFinderZ.d(activity3);
                                                l.a[] aVarArr3 = new l.a[2];
                                                aVarArr3[0] = new l.a("url", string);
                                                aVarArr3[1] = new l.a(l.f62629J, z2 ? RedirectEvent.f62802j : "intent");
                                                nVarD2.a(l.f62659n, aVarArr3);
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        str7 = str5;
                                    }
                                } else {
                                    str5 = f61451q;
                                    j4 = jElapsedRealtime;
                                    statsCollector3 = statsCollectorC;
                                    activity3 = foregroundActivity;
                                    z3 = zD2;
                                }
                                String strA3 = t.a(mainSdkPackage, j7);
                                if (SafeDK.b() && statsCollector3.a(mainSdkPackage, strA3)) {
                                    str6 = str5;
                                    z4 = false;
                                } else {
                                    str6 = str5;
                                    Logger.d(str6, "Reporter thread not initialized or stats collector instance is null or redirect info does not exist, skipping");
                                    z4 = true;
                                }
                                Logger.d(str6, "detect ad click - should handle click ", Boolean.valueOf(z4));
                                if (z4) {
                                    Logger.d(str6, "detect ad click - current elapsed realtime: ", Long.valueOf(jElapsedRealtime2), ", activity last touched: ", Long.valueOf(j7), ", diff: ", Long.valueOf(j9), ", isClicked: ", Boolean.valueOf(z3));
                                    if ((j7 == 0 || j9 > iF) && !z3) {
                                        Logger.d(str6, "detect ad click - redirect");
                                        a(mainSdkPackage, j4, jLongValue2, q(mainSdkPackage) ? RedirectEvent.f62803k : RedirectEvent.f62800h, string, activity3.getClass().getName());
                                    }
                                }
                            }
                        }
                        return;
                    }
                    str2 = f61451q;
                    j2 = jElapsedRealtime;
                    i2 = iF;
                    j3 = jLongValue;
                    i3 = 6;
                } else {
                    str2 = f61451q;
                    j2 = jElapsedRealtime;
                    i2 = iF;
                    j3 = jLongValue;
                    i3 = 6;
                }
                Logger.d(str2, "detect ad click - Intent doesn't have url");
                Activity foregroundActivity2 = com.safedk.android.internal.b.getInstance().getForegroundActivity();
                if (foregroundActivity2 == null) {
                    Logger.d(str2, "detect ad click - current foreground activity is null");
                    return;
                }
                if (a(intent)) {
                    return;
                }
                if (!g(foregroundActivity2.getClass().getName())) {
                    Logger.d(str2, "detect ad click - activity ", foregroundActivity2.getClass().getName(), " is not in the redirect tracked activities, ignoring");
                    return;
                }
                Object[] objArr3 = new Object[i3];
                objArr3[0] = "detect ad click - current elapsed realtime: ";
                objArr3[1] = Long.valueOf(jElapsedRealtime2);
                objArr3[2] = ", webview last touched: ";
                objArr3[3] = Long.valueOf(j3);
                objArr3[4] = ", diff: ";
                long j10 = jElapsedRealtime2 - j3;
                objArr3[5] = Long.valueOf(j10);
                Logger.d(str2, objArr3);
                if (j3 == 0 || j10 > i2) {
                    Logger.d(str2, "detect ad click - Redirecting through ad");
                    a(mainSdkPackage, j2, jLongValue2, q(mainSdkPackage) ? RedirectEvent.f62803k : RedirectEvent.f62801i, string, foregroundActivity2.getClass().getName());
                    return;
                }
                return;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            str7 = f61451q;
        }
        Logger.d(str7, "error in detect ad click", th);
        new CrashReporter().caughtException(th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        com.safedk.android.utils.Logger.d(com.safedk.android.analytics.brandsafety.BrandSafetyUtils.f61451q, "found url in intent : ", r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String a(String str, Intent intent) {
        AdNetworkDiscovery adNetworkDiscoveryJ;
        Logger.d(f61451q, "Attempting to extract url from intent extra, sdkPackageName is ", str, ", intent : ", com.safedk.android.utils.n.a(intent));
        String string = null;
        if (intent != null) {
            try {
                if (intent.getExtras() != null && (adNetworkDiscoveryJ = CreativeInfoManager.j(str)) != null) {
                    Iterator<String> it = adNetworkDiscoveryJ.e().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String next = it.next();
                        Logger.d(f61451q, "looking for url in intent extra with name : ", next);
                        string = intent.getExtras().getString(next);
                        if (string != null) {
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                Logger.e(f61451q, "Exception when attempting to extract url from intent extra");
            }
        }
        return string;
    }

    private static String b(String str, Intent intent) {
        AdNetworkDiscovery adNetworkDiscoveryJ;
        Logger.d(f61451q, "Attempting to extract expanded ad webview address from intent extra, sdkPackageName is ", str, ", intent: ", com.safedk.android.utils.n.a(intent));
        if (intent != null) {
            try {
                if (intent.getExtras() != null && (adNetworkDiscoveryJ = CreativeInfoManager.j(str)) != null) {
                    return adNetworkDiscoveryJ.a(intent.getExtras());
                }
                return null;
            } catch (Throwable th) {
                Logger.e(f61451q, "Exception when attempting to extract expanded ad webview address from intent extra");
                return null;
            }
        }
        return null;
    }

    public static void detectAdClick(final Uri uri, final String sdkPackageName) {
        if (com.safedk.android.utils.n.c()) {
            f61429J.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.5
                @Override // java.lang.Runnable
                public void run() {
                    BrandSafetyUtils.b(uri, sdkPackageName);
                }
            });
        } else {
            b(uri, sdkPackageName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Uri uri, String str) {
        RedirectDetails redirectDetailsH;
        Logger.d(f61451q, "detect ad click Uri invoked, sdk=", str, ", url = ", uri.toString(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        if (com.safedk.android.utils.h.f63169i.equals(str) && SafeDK.S()) {
            v vVarA = DetectTouchUtils.a(str);
            long jLongValue = vVarA == null ? 0L : vVarA.f62709a.longValue();
            if ((jLongValue == 0 || SystemClock.elapsedRealtime() - jLongValue > ((long) SafeDK.getInstance().f())) && ((redirectDetailsH = h()) == null || redirectDetailsH.f61744g == null || !redirectDetailsH.f61744g.equals(uri.toString()))) {
                try {
                    throw new Exception("redirect potential source");
                } catch (Exception e2) {
                    Logger.d(f61451q, "detect ad click, redirect potential source", e2);
                }
            }
        }
        a(intent, str, true);
    }

    private static boolean a(Intent intent) {
        int iIdentityHashCode = System.identityHashCode(intent);
        if (f61455u.contains(Integer.valueOf(iIdentityHashCode))) {
            Logger.d(f61451q, "mark intent as handled found ", Integer.valueOf(iIdentityHashCode));
            return true;
        }
        if (f61455u.size() >= 100) {
            Logger.d(f61451q, "mark intent as handled > MAX events");
            f61455u.remove(0);
        }
        Logger.d(f61451q, "mark intent as handled add ", Integer.valueOf(iIdentityHashCode));
        f61455u.add(Integer.valueOf(iIdentityHashCode));
        return false;
    }

    public static void a(String str, String str2, WebView webView) {
        InterstitialFinder interstitialFinderZ;
        try {
            Logger.d(f61451q, "attach loaded url to detected click started, sdk=", str, ", url=", str2, ", webview=", webView.toString(), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            SafeDK safeDK = SafeDK.getInstance();
            if (SafeDK.ab() && safeDK != null && str2 != null) {
                if (!str2.equals("about:blank") && !str2.equals("About:blank")) {
                    AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(str);
                    if (adNetworkDiscoveryJ != null && adNetworkDiscoveryJ.j(str2)) {
                        Logger.d(f61451q, "url should be ignored (by discovery class), skipping");
                        return;
                    }
                    if ((str2.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.f62221v) || str2.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.f62220u)) && (interstitialFinderZ = SafeDK.getInstance().z()) != null) {
                        interstitialFinderZ.a(str2, str, a((Object) webView));
                    }
                    if (!SafeDK.b() || StatsCollector.c() == null) {
                        Logger.d(f61451q, "Reporter thread not initialized or stats collector instance is null, skipping");
                    } else {
                        ConcurrentHashMap<String, StatsEvent> concurrentHashMapA = StatsCollector.c().a(StatsCollector.EventType.redirect);
                        Iterator<String> it = concurrentHashMapA.keySet().iterator();
                        while (it.hasNext()) {
                            RedirectEvent redirectEvent = (RedirectEvent) concurrentHashMapA.get(it.next());
                            if (redirectEvent.k().equals(str) && redirectEvent.f() == null) {
                                Logger.d(f61451q, "Attaching url to url-less redirect event. event = ", redirectEvent.toString(), ", url = ", str2);
                                redirectEvent.a(str2);
                            }
                        }
                    }
                    return;
                }
                Logger.d(f61451q, "url is blank, skipping");
                return;
            }
            Logger.d(f61451q, "attach loaded url to detected click loaded url is empty or app not initialized yet, skipping.");
        } catch (Throwable th) {
            Logger.e(f61451q, "failed to attach url to detected click (internal browser)", th);
        }
    }

    static String a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(byteArray, 0, byteArray.length);
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (NoSuchAlgorithmException e2) {
            Logger.e(f61451q, "Failed to get hash value for bitmap", e2);
            return "";
        }
    }

    static String a(Bitmap bitmap, AdType adType, String str, String str2, String str3, ScreenShotOrientation screenShotOrientation) {
        String strA = a(adType, str, str2, str3, screenShotOrientation);
        if (new File(strA).exists()) {
            new File(strA).delete();
            Logger.d(f61451q, YjqZUJsVmhcjko.qOdkaoPBVwOl, strA);
        }
        Logger.d(f61451q, "Saving image to file: ", strA);
        FileOutputStream fileOutputStream = null;
        try {
            Logger.d(f61451q, "Saving screenshot to file ", strA);
            FileOutputStream fileOutputStream2 = new FileOutputStream(strA);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream2);
                try {
                    fileOutputStream2.close();
                    return strA;
                } catch (IOException e2) {
                    Logger.e(f61451q, "Failed to save screenshot to file (fos close) , error : ", e2.getMessage(), e2);
                    return "";
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    Logger.e(f61451q, "Failed to save screenshot to file, error : ", th.getMessage(), th);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            Logger.e(f61451q, "Failed to save screenshot to file (fos close) , error : ", e3.getMessage(), e3);
                            return "";
                        }
                    }
                    return "";
                } catch (Throwable th2) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            Logger.e(f61451q, "Failed to save screenshot to file (fos close) , error : ", e4.getMessage(), e4);
                            return "";
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    static void a(String str, AdType adType, String str2, String str3, String str4, ScreenShotOrientation screenShotOrientation) {
        if (str == null) {
            return;
        }
        String strReplace = a(adType, str2, str3, str4, screenShotOrientation).replace(f61435a, f61436b);
        Logger.d(f61451q, "Saving ad text to file: ", strReplace);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(strReplace);
                try {
                    fileOutputStream2.write(str.getBytes());
                    fileOutputStream2.close();
                    fileOutputStream2.close();
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    try {
                        Logger.e(f61451q, "Failed to save ad text to file", th);
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } catch (Throwable th2) {
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e2) {
                            }
                        }
                        throw th2;
                    }
                }
            } catch (IOException e3) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String a(String str, boolean z2) {
        try {
            if (str == null) {
                Logger.d(f61451q, "Parameter name 'activityName' cannot be null");
                return null;
            }
            String[] strArrSplit = str.split("@");
            return strArrSplit.length > 1 ? strArrSplit[z2 ? (char) 1 : (char) 0] : "";
        } catch (Throwable th) {
            Logger.e(f61451q, "Failed to get activity address for ", str, th);
            return "";
        }
    }

    static long c(String str) {
        try {
            return new File(str).length();
        } catch (Throwable th) {
            Logger.e(f61451q, "Failed to create new file for screenshot", th);
            return 0L;
        }
    }

    static synchronized void d(String str) {
        if (str != null) {
            Logger.d(f61451q, "remove ad files started, filepath ", str, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            if (new File(str).exists()) {
                if (!new File(str).delete()) {
                    Logger.d(f61451q, "remove ad files failed to delete file ", str);
                } else {
                    Logger.d(f61451q, "remove ad files deleted file ", str);
                }
            } else {
                Logger.d(f61451q, "remove ad files filePath does not exist. file=", str);
            }
            File file = new File(str.replace(f61435a, f61436b));
            if (file.exists()) {
                Logger.d(f61451q, "remove ad files deleting file ", file.getAbsolutePath());
                if (!file.delete()) {
                    Logger.d(f61451q, "remove ad files failed to delete file ", file.getAbsolutePath());
                }
            }
        }
    }

    static synchronized void a(AdType adType, String str) {
        Logger.d(f61451q, "remove all ad files started, adType = ", adType.name(), " , impression = ", str, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (str.contains("_")) {
            String str2 = str.split("_")[1];
            File file = new File(SafeDK.getInstance().ae() + adType);
            Logger.d(f61451q, "remove all ad files impressionId = ", str2);
            File[] fileArrListFiles = file.listFiles(new b(str2));
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file2 : fileArrListFiles) {
                    Logger.d(f61451q, "remove all ad files deleting file for impression ", str2, XIvb.cSNANHOOOKj, file2.getAbsolutePath());
                    d(file2.getAbsolutePath());
                }
            }
        }
    }

    public static String a(Class cls) {
        return e(cls.getName());
    }

    public static String e(String str) {
        if (str != null) {
            return u(str) ? com.safedk.android.utils.h.f63168h : SdksMapping.getSdkPackageByClass(str);
        }
        return null;
    }

    public static String b(Class cls) {
        String name = cls.getName();
        String strE = e(name);
        if (strE == null) {
            strE = name;
        }
        Logger.v(f61451q, "SDK package for class ", name, " is ", strE);
        return strE == null ? "unknown" : strE;
    }

    public static boolean f(String str) {
        return u(str) || SdksMapping.getSdkPackageByClass(str) != null;
    }

    private static boolean u(String str) {
        if (str.startsWith("maps.bi.f") || str.startsWith("avu") || str.startsWith(MobileAds.ERROR_DOMAIN)) {
            return true;
        }
        return false;
    }

    public static a a(String str, Bitmap bitmap) {
        return a(str, bitmap, 1000, AdType.INTERSTITIAL);
    }

    public static a b(String str, Bitmap bitmap) {
        return a(str, bitmap, 500, AdType.BANNER);
    }

    private static a a(String str, Bitmap bitmap, int i2, AdType adType) {
        a aVar = new a();
        Random random = new Random();
        HashMap map = new HashMap();
        Logger.d(f61451q, "bitmap scan started, sdkPackage = ", str, ", adType = ", adType.name(), " bitmap scan : margins are : top ", Float.valueOf(CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_TOP_MARGIN_PERCENT, 0.2f)), " , right ", Float.valueOf(CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_RIGHT_MARGIN_PERCENT, 0.2f)), ", left ", Float.valueOf(CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_LEFT_MARGIN_PERCENT, 0.2f)), ", right ", Float.valueOf(CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_BOTTOM_MARGIN_PERCENT, 0.2f)), ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        float width = bitmap.getWidth();
        int i3 = (int) (r8 * width);
        int i5 = (int) (width - (r7 * width));
        float height = bitmap.getHeight();
        int i7 = (int) (r5 * height);
        int i8 = (int) (height - (r6 * height));
        for (int i9 = 0; i9 < i2; i9++) {
            int pixel = bitmap.getPixel(random.nextInt(i5 - i3) + i3, random.nextInt(i8 - i7) + i7) & 16777215;
            Integer num = (Integer) map.get(Integer.valueOf(pixel));
            if (num == null) {
                map.put(Integer.valueOf(pixel), 1);
            } else {
                map.put(Integer.valueOf(pixel), Integer.valueOf(num.intValue() + 1));
            }
        }
        Iterator it = map.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (iIntValue > i10) {
                aVar.a(iIntValue);
                i10 = iIntValue;
            }
        }
        int iA = a(map, 0, 26);
        int i11 = (iA * 100) / i2;
        aVar.b(i11);
        int iA2 = a(map, f61458x, 10);
        int i12 = (iA2 * 100) / i2;
        aVar.c(i12);
        int iA3 = a(map, f61459y, 10);
        int i13 = (iA3 * 100) / i2;
        aVar.d(i13);
        Logger.d(f61451q, "bitmap scan, pixel percentages: black=", Integer.valueOf(i11), "% (", Integer.valueOf(iA), "/", Integer.valueOf(i2), ")", ", gray-1=", Integer.valueOf(i12), "% (", Integer.valueOf(iA2), "/", Integer.valueOf(i2), ")", ", gray-2=", Integer.valueOf(i13), "% (", Integer.valueOf(iA3), "/", Integer.valueOf(i2), ")");
        if (CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_SHOULD_CHECK_FOR_GREYSCALE, false)) {
            aVar.a(a((Map<Integer, Integer>) map));
        }
        return aVar;
    }

    private static boolean a(Map<Integer, Integer> map) {
        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (Color.red(iIntValue) != Color.blue(iIntValue) || Color.blue(iIntValue) != Color.green(iIntValue)) {
                Logger.d(f61451q, "Image is not Greyscale");
                return false;
            }
        }
        Logger.d(f61451q, "Image is Greyscale");
        return true;
    }

    private static int d(int i2) {
        return (i2 >> 16) & 255;
    }

    private static int e(int i2) {
        return (i2 >> 8) & 255;
    }

    private static int f(int i2) {
        return i2 & 255;
    }

    private static boolean a(int i2, int i3, int i5) {
        return Math.abs(d(i2) - d(i3)) <= i5 && d(i2) == e(i2) && d(i2) == f(i2);
    }

    private static int a(Map<Integer, Integer> map, int i2, int i3) {
        int iIntValue = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (a(entry.getKey().intValue(), i2, i3)) {
                iIntValue += entry.getValue().intValue();
            }
        }
        return iIntValue;
    }

    public static boolean a(int i2) {
        return a(i2, 1000, SafeDK.getInstance().G());
    }

    public static boolean b(int i2) {
        return a(i2, 500, SafeDK.getInstance().W());
    }

    public static boolean c(int i2) {
        return b(i2);
    }

    private static boolean a(int i2, int i3, float f3) {
        Logger.d(f61451q, "isScreenshotEnough Max Uniform Pixel Percentage to Stop Sampling is ", Float.valueOf(f3));
        return ((float) i2) < (f3 / 100.0f) * ((float) i3);
    }

    public static ScreenshotValidity a(String str, a aVar) {
        return a(str, aVar, 1000, CreativeInfoManager.a(str, AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, SafeDK.getInstance().H()));
    }

    public static ScreenshotValidity b(String str, a aVar) {
        return a(str, aVar, 500, SafeDK.getInstance().X());
    }

    public static ScreenshotValidity c(String str, a aVar) {
        return b(str, aVar);
    }

    public static ScreenshotValidity a(String str, a aVar, int i2, float f3) {
        Logger.d(f61451q, "screenshot validity check started, number of samples: ", Integer.valueOf(i2), ", BitmapScanResult: ", aVar);
        if (aVar.b() > 98) {
            Logger.d(f61451q, "screenshot validity check, black pixel percentage is above threshold, image is black (not valid)");
            return ScreenshotValidity.UNIFORMITY_BLACK;
        }
        int iA = (aVar.a() * 100) / i2;
        if (iA > 98) {
            Logger.d(f61451q, "screenshot validity check, uniform pixel count is ", Integer.valueOf(iA), "% => above threshold, image is uniform (not valid)");
            return ScreenshotValidity.UNIFORMITY_VERY_HIGH;
        }
        if (iA > f3) {
            Logger.d(f61451q, "screenshot validity check, uniformity check : Screenshot max color pixel count is above uniformity threshold, image is not valid (result = ", Integer.valueOf(iA), "%)");
            return ScreenshotValidity.UNIFORMITY_HIGH;
        }
        if (aVar.b() > 10 && (aVar.c() > 10 || aVar.d() > 10)) {
            Logger.d(f61451q, "screenshot validity check, black=", Integer.valueOf(aVar.b()), "% , grey-1=", Integer.valueOf(aVar.c()), "% , grey-2=", Integer.valueOf(aVar.d()), "%, => above threshold, image is not valid");
            return ScreenshotValidity.UNIFORMITY_GRAY;
        }
        if (aVar.c() > 50 || aVar.d() > 50) {
            Logger.d(f61451q, "screenshot validity check, grey-1=", Integer.valueOf(aVar.c()), "%, grey-2=", Integer.valueOf(aVar.d()), "%  => above threshold, image is not valid");
            return ScreenshotValidity.UNIFORMITY_GRAY;
        }
        if (CreativeInfoManager.a(str, AdNetworkConfiguration.BITMAP_SCAN_SHOULD_CHECK_FOR_GREYSCALE, false)) {
            if (aVar.e()) {
                Logger.d(f61451q, "screenshot validity check, Screenshot is NSFD");
                return ScreenshotValidity.NOT_SUITABLE_FOR_DASHBOARD;
            }
            Logger.d(f61451q, "screenshot validity check, Screenshot is NOT NSFD");
        }
        return ScreenshotValidity.VALID;
    }

    public static String a(AdType adType, String str, String str2, String str3, ScreenShotOrientation screenShotOrientation) {
        String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(str2);
        Logger.d(f61451q, "getFileName Sdk UUID is ", sdkUUIDByPackage, " for sdk ", str2);
        return SafeDK.getInstance().ae() + adType + File.separator + str + "_" + sdkUUIDByPackage + "_" + str3 + "_" + screenShotOrientation.name().toLowerCase() + f61435a;
    }

    public static boolean c(Class cls) {
        return g(cls.getName());
    }

    public static boolean g(String str) {
        Logger.d(f61451q, "Internal browser activity check started, Activity name : ", str, ", result : ", Boolean.valueOf(f61453s.contains(str)), ", redirectDetectionInterstitialActivities= ", f61453s);
        return f61453s.contains(str);
    }

    public static boolean d(Class cls) {
        return h(cls.getName());
    }

    public static boolean h(String str) {
        Logger.d(f61451q, "Interstitial activity check started, Activity name : ", str, QiDPjiOCZHDS.ALmwyWKVH, Boolean.valueOf(f61452r.contains(str)), ", interstitialActivities= ", f61452r);
        return f61452r.contains(str);
    }

    public static String i(String str) {
        for (String str2 : f61452r) {
            if (str.startsWith(str2)) {
                return str2;
            }
        }
        return "";
    }

    public static com.safedk.android.analytics.brandsafety.c j(String str) {
        if (str != null) {
            Iterator<com.safedk.android.analytics.brandsafety.b> it = SafeDK.getInstance().y().iterator();
            while (it.hasNext()) {
                com.safedk.android.analytics.brandsafety.c cVarL = it.next().l(str);
                if (cVarL != null) {
                    return cVarL;
                }
            }
            return null;
        }
        return null;
    }

    public static com.safedk.android.analytics.brandsafety.c k(String str) {
        if (SafeDK.getInstance() != null && SafeDK.getInstance().p() && str != null) {
            Iterator<com.safedk.android.analytics.brandsafety.b> it = SafeDK.getInstance().y().iterator();
            while (it.hasNext()) {
                com.safedk.android.analytics.brandsafety.c cVarC = it.next().c(str);
                if (cVarC != null) {
                    return cVarC;
                }
            }
        }
        return null;
    }

    public static void l(String str) {
        Logger.d(f61451q, "addInterstitialActivity started name=", str);
        f61452r.add(str);
    }

    public static void m(String str) {
        Logger.d(f61451q, "removeInterstitialActivity started name=", str);
        f61452r.remove(str);
    }

    public static int b(AdType adType) {
        try {
            Logger.d(f61451q, "get image count by ad type started, adType = ", adType.name(), " : ", adType);
            File file = new File(SafeDK.getInstance().ae() + adType);
            File[] fileArrListFiles = file.listFiles();
            String str = "";
            for (File file2 : fileArrListFiles) {
                str = str + ", " + file2.getName();
            }
            Logger.d(f61451q, "get image count by ad type all files in ", file.getName(), " : ", str);
            Logger.d(f61451q, "get image count by ad type returned ", Integer.valueOf(fileArrListFiles.length), " for adType ", adType.name());
            return fileArrListFiles.length;
        } catch (Throwable th) {
            Logger.d(f61451q, "get image count by ad type  error :  ", th.getMessage(), th);
            return -1;
        }
    }

    public static List<d> c(AdType adType) {
        String str;
        ScreenShotOrientation screenShotOrientationValueOf;
        ArrayList arrayList = new ArrayList();
        try {
            Logger.d(f61451q, "Restoring ", adType, " images for upload", ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            File[] fileArrListFiles = new File(SafeDK.getInstance().ae() + adType).listFiles(new c());
            if (fileArrListFiles != null) {
                Logger.d(f61451q, "Found ", Integer.valueOf(fileArrListFiles.length), " candidate images for upload");
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    Logger.d(f61451q, "Checking file ", name);
                    String absolutePath = file.getAbsolutePath();
                    File file2 = new File(absolutePath.replace(f61435a, f61436b));
                    Logger.d(f61451q, "Deleting file ", file.getAbsolutePath());
                    file.delete();
                    if (file2.exists()) {
                        file2.delete();
                    }
                    String[] strArrSplit = name.replace(f61435a, "").split("_");
                    if (strArrSplit.length == 4) {
                        String str2 = strArrSplit[0];
                        String str3 = strArrSplit[1];
                        Logger.d(f61451q, "sdk = ", strArrSplit[1]);
                        if (SdksMapping.getSdkPackageByPackageUUID(strArrSplit[1]) == null) {
                            str = str3;
                        } else {
                            String sdkPackageByPackageUUID = SdksMapping.getSdkPackageByPackageUUID(strArrSplit[1]);
                            Logger.d(f61451q, "sdk value replaced : ", sdkPackageByPackageUUID);
                            str = sdkPackageByPackageUUID;
                        }
                        String str4 = strArrSplit[2];
                        try {
                            screenShotOrientationValueOf = ScreenShotOrientation.valueOf(strArrSplit[3].toUpperCase());
                        } catch (IllegalArgumentException e2) {
                            screenShotOrientationValueOf = ScreenShotOrientation.NOT_INITIALIZED;
                        }
                        Logger.d(f61451q, "Restore image for upload: ", absolutePath);
                        arrayList.add(new d(str2, str, str4, screenShotOrientationValueOf, absolutePath, null));
                    }
                }
            }
        } catch (Throwable th) {
            Logger.d(f61451q, "Error while restoring ads for upload", th);
            new CrashReporter().caughtException(th);
        }
        return arrayList;
    }

    private static void k() {
        DisplayMetrics displayMetrics = SafeDK.getInstance().m().getResources().getDisplayMetrics();
        f61434O = displayMetrics.heightPixels;
        f61433N = displayMetrics.widthPixels;
    }

    static int a() {
        if (f61433N == 0) {
            k();
        }
        return f61433N;
    }

    static int b() {
        if (f61434O == 0) {
            k();
        }
        return f61434O;
    }

    static ScreenShotOrientation c() {
        DisplayMetrics displayMetrics = SafeDK.getInstance().m().getResources().getDisplayMetrics();
        return displayMetrics.heightPixels > displayMetrics.widthPixels ? ScreenShotOrientation.PORTRAIT : ScreenShotOrientation.LANDSCAPE;
    }

    static ScreenShotOrientation b(Bitmap bitmap) {
        if (bitmap == null) {
            return ScreenShotOrientation.NOT_INITIALIZED;
        }
        return bitmap.getHeight() > bitmap.getWidth() ? ScreenShotOrientation.PORTRAIT : ScreenShotOrientation.LANDSCAPE;
    }

    public static String n(String str) {
        if (str != null) {
            String[] strArrSplit = str.split("@");
            if (strArrSplit.length > 1) {
                return strArrSplit[1];
            }
            return "";
        }
        return "";
    }

    public static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        return Integer.toHexString(obj.hashCode());
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f61519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f61520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f61521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ScreenShotOrientation f61522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f61523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f61524f;

        public d(String str, String str2, String str3, ScreenShotOrientation screenShotOrientation, String str4, String str5) {
            this.f61519a = str;
            this.f61520b = str2;
            this.f61521c = str3;
            this.f61522d = screenShotOrientation;
            this.f61523e = str4;
            this.f61524f = str5;
        }

        public String a() {
            return this.f61519a;
        }

        public String b() {
            return this.f61520b;
        }

        public String c() {
            return this.f61521c;
        }

        public ScreenShotOrientation d() {
            return this.f61522d;
        }

        public String e() {
            return this.f61523e;
        }

        public String f() {
            return this.f61524f;
        }
    }

    private static void a(String str, long j2, long j3, String str2, String str3, String str4) {
        if (SafeDK.ab()) {
            try {
                Logger.d(f61451q, "Report click url with no impression to server starting, sdkPackageName=", str, ", url=", str3, ", currentForegroundActivityName=", str4, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                if (!e.a(str)) {
                    Logger.d(f61451q, "Redirect reporting not supported for Sdk ", str, ", report will not be sent");
                    return;
                }
                if (str3 == null) {
                    return;
                }
                Uri uri = Uri.parse(str3);
                if (uri.getScheme() != null && uri.getHost() != null) {
                    if (e.a(str, str3)) {
                        Logger.d(f61451q, "Ignoring this intent as it was already reported , sdkPackageName=", str, " ,intentUrl=", str);
                        return;
                    }
                    RedirectEvent redirectEvent = new RedirectEvent(str, str3, str2, str4, j2, j3);
                    redirectEvent.a(p.a().b());
                    if (SafeDK.b()) {
                        StatsCollector.c().a(redirectEvent);
                    } else {
                        Logger.d(f61451q, "Reporter thread not initialized or stats collector instance is null, skipping");
                    }
                }
            } catch (Throwable th) {
                Logger.e(f61451q, "Exception during attempt to create redirect event", th);
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f61525a = "SdkUrlRedirectManager";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Map<String, Long> f61526b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f61527c = 1000;

        private e() {
        }

        private static String b(String str, String str2) {
            return str + "_" + str2;
        }

        private static boolean c(String str, String str2) {
            Logger.d(f61525a, "Check : does timestamp exist for Sdk and url ?  sdkPackageName=", str, ", url=", str2, " , result = ", Boolean.valueOf(f61526b.containsKey(b(str, str2))));
            return f61526b.containsKey(b(str, str2));
        }

        private static long d(String str, String str2) {
            Logger.d(f61525a, "getting latest timestamp for Sdk and url started. sdkPackageName=", str, ", url=", str2);
            if (c(str, str2)) {
                return f61526b.get(b(str, str2)).longValue();
            }
            return 0L;
        }

        public static boolean a(String str, String str2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            a();
            long jD = d(str, str2);
            Logger.d(f61525a, "Checking if we should ignore the redirect instance sdkPackageName=", str, ", url=", str2, ", timestamp=", Long.valueOf(jCurrentTimeMillis), ",System.currentTimeMillis()=", Long.valueOf(System.currentTimeMillis()), ", latestTimestamp=", Long.valueOf(jD), ", diff=", Long.valueOf(System.currentTimeMillis() - jD));
            if (jD != 0 && System.currentTimeMillis() - jD < f61527c) {
                Logger.d(f61525a, "should ignore this redirect.");
                return true;
            }
            a(str, str2, jCurrentTimeMillis);
            return false;
        }

        private static void a(String str, String str2, long j2) {
            Logger.d(f61525a, "Update latest timestamp for Sdk and url started. sdkPackageName=", str, ", url=", str2);
            f61526b.put(b(str, str2), Long.valueOf(j2));
            Logger.d(f61525a, "timestamps : ", f61526b.toString());
        }

        private static void a() {
            Logger.d(f61525a, "Clear data started, (", Integer.valueOf(f61526b.size()), ") : ", f61526b.toString());
            ArrayList<String> arrayList = new ArrayList();
            for (String str : f61526b.keySet()) {
                Logger.d(f61525a, "Clear System.currentTimeMillis()-sdkAndUrlToTimestamp.get(key)=", Long.valueOf(System.currentTimeMillis() - f61526b.get(str).longValue()));
                if (System.currentTimeMillis() - f61526b.get(str).longValue() > f61527c) {
                    Logger.d(f61525a, "Added key for removal : ", str);
                    arrayList.add(str);
                }
            }
            if (arrayList.size() > 0) {
                for (String str2 : arrayList) {
                    Logger.d(f61525a, "Removing key ", str2);
                    f61526b.remove(str2);
                }
            }
            Logger.d(f61525a, "Clear data finished, Items (", Integer.valueOf(f61526b.size()), ") : ", f61526b.toString());
        }

        public static boolean a(String str) {
            String sdkUUIDByPackage = SdksMapping.getSdkUUIDByPackage(str);
            if (sdkUUIDByPackage != null && sdkUUIDByPackage.length() > 0 && SdksMapping.getRedirectSupportedSdks() != null) {
                Logger.d(f61525a, "sdk=", str, ", sdkUid=", sdkUUIDByPackage, ", supported ? ", Boolean.valueOf(SdksMapping.getRedirectSupportedSdks().contains(sdkUUIDByPackage)));
                return SdksMapping.getRedirectSupportedSdks().contains(sdkUUIDByPackage);
            }
            Logger.d(f61525a, "Cannot determine if sdk is redirect detection supported, sdk=", str);
            return false;
        }
    }

    public static void o(String str) {
        Logger.d(f61451q, "adding to redirect current open fullscreen ad collection. sdk = ", str, ", redirectDetectionCurrentInterstitialBySdk = ", f61454t.toString());
        f61454t.add(str);
    }

    public static void p(String str) {
        Logger.d(f61451q, "removing from redirect current open fullscreen ad collection. sdk = ", str, ", redirectDetectionCurrentInterstitialBySdk = ", f61454t.toString());
        f61454t.remove(str);
    }

    public static boolean q(String str) {
        Logger.d(f61451q, "checking if there is a redirect current open fullscreen ad in collection. sdk = ", str, ", result is ", Boolean.valueOf(f61454t.contains(str)), ", redirectDetectionCurrentInterstitialBySdk = ", f61454t.toString());
        return f61454t.contains(str);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f61512a = "BitmapScanResult";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f61513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f61514c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f61515d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f61516e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f61517f = false;

        public int a() {
            return this.f61513b;
        }

        public void a(int i2) {
            this.f61513b = i2;
        }

        public int b() {
            return this.f61514c;
        }

        public void b(int i2) {
            this.f61514c = i2;
        }

        public int c() {
            return this.f61515d;
        }

        public void c(int i2) {
            this.f61515d = i2;
        }

        public int d() {
            return this.f61516e;
        }

        public void d(int i2) {
            this.f61516e = i2;
        }

        public boolean e() {
            return this.f61514c > 50 && this.f61517f;
        }

        public void a(boolean z2) {
            this.f61517f = z2;
        }

        public String toString() {
            return "{max count: " + this.f61513b + ", black: " + this.f61514c + "%, gray-1: " + this.f61515d + "%, gray-2: " + this.f61516e + "%}";
        }
    }

    public static String r(String str) {
        if (new File(str).exists()) {
            try {
                return new BigInteger(1, MessageDigest.getInstance("MD5").digest(a(new File(str)))).toString(16);
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        }
        return "";
    }

    public static String a(byte[] bArr) {
        try {
            return new BigInteger(1, MessageDigest.getInstance("MD5").digest(bArr)).toString(16);
        } catch (NoSuchAlgorithmException e2) {
            return "";
        }
    }

    private static byte[] a(File file) {
        byte[] bArr = new byte[100];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            while (true) {
                int i2 = bufferedInputStream.read(bArr);
                if (i2 != -1) {
                    byteArrayOutputStream.write(bArr, 0, i2);
                } else {
                    bufferedInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Exception e2) {
            Logger.d(f61451q, "Exception reading file : ", e2.getMessage(), e2);
            return null;
        }
    }

    public static void onMraidOpen(String sdkPackageName, String urlJsonString, Object obj, String originatedMethod) {
        if (SafeDK.ab()) {
            Logger.d(f61451q, "on mraid open, sdk: ", sdkPackageName, ", urlJsonString: ", urlJsonString, ", object: ", obj, ", originated method: ", originatedMethod);
            if (obj != null && urlJsonString != null) {
                try {
                    onMraidOpen(sdkPackageName, new JSONObject(urlJsonString), obj, originatedMethod);
                } catch (JSONException e2) {
                    Logger.d(f61451q, "on mraid open, failed build a JSON object: ", urlJsonString);
                }
            }
        }
    }

    public static void onMraidOpen(String sdkPackageName, JSONObject urlJsonObject, Object obj, String originatedMethod) {
        if (SafeDK.ab()) {
            Logger.d(f61451q, "on mraid open, sdk: ", sdkPackageName, ", urlJsonObject: ", urlJsonObject, ", object: ", obj, ", originated method: ", originatedMethod);
            if (obj != null && urlJsonObject != null) {
                String strOptString = urlJsonObject.optString("url");
                Logger.d(f61451q, "on mraid open, url: ", strOptString);
                ArrayList<Field> arrayList = new ArrayList();
                for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    arrayList.addAll(Arrays.asList(superclass.getDeclaredFields()));
                }
                for (Field field : arrayList) {
                    try {
                        field.setAccessible(true);
                        Object obj2 = field.get(obj);
                        if (obj2 instanceof WebView) {
                            onMraidOpen(sdkPackageName, null, strOptString, (WebView) obj2, originatedMethod);
                            return;
                        }
                        continue;
                    } catch (IllegalAccessException e2) {
                        Logger.d(f61451q, "on mraid open, failed to get webview from: ", obj);
                    }
                }
            }
        }
    }

    public static void onMraidExpand(String sdkPackageName, String urlJsonString, Object obj, String originatedMethod) {
        String strOptString;
        if (SafeDK.ab()) {
            Logger.d(f61451q, "on mraid expand, sdk: ", sdkPackageName, ", urlJsonString: ", urlJsonString, ", object: ", obj, ", originated method: ", originatedMethod);
            if (obj != null && urlJsonString != null) {
                try {
                    strOptString = new JSONObject(urlJsonString).optString("url");
                } catch (JSONException e2) {
                    Logger.d(f61451q, "on mraid expand, failed to get url from: ", urlJsonString);
                    strOptString = null;
                }
                for (Field field : obj.getClass().getFields()) {
                    try {
                        if (field.get(obj) instanceof WebView) {
                            onMraidExpand(sdkPackageName, null, strOptString, (WebView) field.get(obj), originatedMethod);
                        }
                    } catch (IllegalAccessException e3) {
                        Logger.d(f61451q, "on mraid expand, failed to get webview from: ", obj);
                    }
                }
            }
        }
    }

    public static void onMraidOpen(final String sdkPackageName, String str, final String url, final WebView view, final String originatedMethod) {
        if (SafeDK.ab()) {
            Logger.d(f61451q, Logger.FeatureTag.REDIRECTS, "on mraid open, sdk: ", sdkPackageName, ", str: ", str, ", url: ", url, ", webview: ", view, ", originated method: ", originatedMethod);
            if (sdkPackageName != null && url != null) {
                f61429J.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.6
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            BrandSafetyUtils.a(sdkPackageName, view, url, RedirectDetails.RedirectType.REDIRECT, originatedMethod);
                        } catch (Throwable th) {
                            Logger.e(BrandSafetyUtils.f61451q, "exception while handling mraid open", th);
                        }
                    }
                });
            }
        }
    }

    public static void onMraidExpand(final String sdkPackageName, String str, final String url, final WebView view, final String originatedMethod) {
        if (SafeDK.ab()) {
            Logger.d(f61451q, Logger.FeatureTag.REDIRECTS, "on mraid expand, sdk: ", sdkPackageName, ", str: ", str, ", url: ", url, ", webview: ", view, ", originated method: ", originatedMethod);
            if (sdkPackageName != null) {
                f61429J.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.7
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            BrandSafetyUtils.a(sdkPackageName, view, url, RedirectDetails.RedirectType.EXPAND, originatedMethod);
                        } catch (Throwable th) {
                            Logger.e(GDEJgAYrPQHfw.iFlCXYXIAf, "exception while handling mraid expand", th);
                        }
                    }
                });
            }
        }
    }

    public static void onMraidProcessExpand(String sdkPackageName, String url) {
        if (SafeDK.ab()) {
            Logger.d(f61451q, "on mraid process expand, sdk: ", sdkPackageName, ", url: ", url);
            a(sdkPackageName, url, (String) null, RedirectEvent.f62801i);
        }
    }

    public static void onMraidWasExpanded(String sdkPackageName) {
        if (SafeDK.ab()) {
            Logger.d(f61451q, "on mraid was expanded, sdk: ", sdkPackageName);
            s(sdkPackageName);
        }
    }

    public static boolean a(String str, WebView webView) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strA = a((Object) webView);
        v vVarA = DetectTouchUtils.a(str, strA);
        long jLongValue = vVarA == null ? 0L : vVarA.f62709a.longValue();
        boolean z2 = jElapsedRealtime - jLongValue < 20000;
        Logger.d(f61451q, "is ad clicked recently - for package: ", str, " and view address: ", strA, " returned: ", Boolean.valueOf(z2), " last touch event: ", Long.valueOf(jLongValue), " vs current: ", Long.valueOf(jElapsedRealtime));
        return z2;
    }

    public static void onWebViewPageCommitVisible(String sdkPackage, WebView webView, String url) {
        if (SafeDK.ab()) {
            Logger.d(f61451q, "WebView page commit visible, sdk: ", sdkPackage, ", webView : ", webView.toString(), ", url ", url);
        }
    }

    public static void onWebViewPageStarted(final String sdkPackage, WebView webView, final String url) {
        com.safedk.android.analytics.brandsafety.c cVarC;
        CreativeInfo creativeInfoJ;
        if (SafeDK.ab()) {
            SafeDKWebAppInterface.a(sdkPackage, webView, url, false);
            final String strA = a((Object) webView);
            InterstitialFinder interstitialFinderZ = SafeDK.getInstance().z();
            if (interstitialFinderZ != null && (cVarC = interstitialFinderZ.c(strA)) != null && (creativeInfoJ = cVarC.j()) != null && creativeInfoJ.aq()) {
                Logger.d(f61451q, "WebView page started, ignore url from website end card");
            } else {
                Logger.d(f61451q, "WebView page started, sdk: ", sdkPackage, ", webView : ", webView.toString(), ", url ", url);
                f61429J.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.8
                    @Override // java.lang.Runnable
                    public void run() {
                        com.safedk.android.analytics.brandsafety.a aVar;
                        try {
                            x xVar = (x) BrandSafetyUtils.f61430K.get(strA);
                            if (xVar != null && xVar.a().equals(url) && xVar.d().equals(sdkPackage)) {
                                xVar.a(url);
                                Iterator it = Arrays.asList(SafeDK.getInstance().A(), SafeDK.getInstance().z()).iterator();
                                while (it.hasNext() && ((aVar = (com.safedk.android.analytics.brandsafety.a) it.next()) == null || !aVar.a(sdkPackage, xVar))) {
                                }
                                Logger.d(BrandSafetyUtils.f61451q, "handle website opened, started loading: ", BrandSafetyUtils.f61430K);
                                BrandSafetyUtils.b(xVar, strA, "commit");
                            }
                        } catch (Throwable th) {
                            Logger.e(BrandSafetyUtils.f61451q, "exception while WebView page started", th);
                        }
                    }
                });
            }
        }
    }

    public static void onWebViewReceivedError(final String sdkPackage, WebView webView, int errorCode, String description, final String failingUrl) {
        com.safedk.android.analytics.brandsafety.c cVarC;
        CreativeInfo creativeInfoJ;
        if (SafeDK.ab()) {
            final String strA = a((Object) webView);
            InterstitialFinder interstitialFinderZ = SafeDK.getInstance().z();
            if (interstitialFinderZ != null && (cVarC = interstitialFinderZ.c(strA)) != null && (creativeInfoJ = cVarC.j()) != null && creativeInfoJ.aq()) {
                Logger.d(f61451q, "WebView received error, ignore url from website end card");
            } else {
                Logger.d(f61451q, "WebView received error, sdk: ", sdkPackage, ", webView: ", webView.toString(), ", errorCode: ", Integer.valueOf(errorCode), ", description: ", description, ", failingUrl: ", failingUrl);
                f61429J.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.9
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            x xVar = (x) BrandSafetyUtils.f61430K.get(strA);
                            if (xVar != null && xVar.a().equals(failingUrl) && xVar.d().equals(sdkPackage)) {
                                BrandSafetyUtils.f61430K.remove(strA);
                                Logger.d(BrandSafetyUtils.f61451q, "handle suspicion of website loaded into banner, load failed: ", BrandSafetyUtils.f61430K);
                                BrandSafetyUtils.b(xVar, strA, "fail");
                            }
                        } catch (Throwable th) {
                            Logger.e(BrandSafetyUtils.f61451q, "exception while WebView received error", th);
                        }
                    }
                });
            }
        }
    }

    public static void onWebViewReceivedError(String sdkPackage, WebView webView, WebResourceRequest request, WebResourceError error) {
        if (SafeDK.ab()) {
            Logger.d(f61451q, "WebView received error, sdk: ", sdkPackage, ", webView: ", webView.toString(), ", request: ", request, ", error: ", error);
            if (Build.VERSION.SDK_INT >= 23) {
                onWebViewReceivedError(sdkPackage, webView, error.getErrorCode(), error.getDescription().toString(), request.getUrl() != null ? request.getUrl().toString() : "");
            } else {
                onWebViewReceivedError(sdkPackage, webView, -1, "", "");
            }
        }
    }

    public static void onShouldOverrideUrlLoading(String sdkPackageName, WebView view, String url, boolean ret) {
        com.safedk.android.analytics.brandsafety.c cVarC;
        CreativeInfo creativeInfoJ;
        if (SafeDK.ab()) {
            Logger.d(f61451q, "on should override url loading, sdk: ", sdkPackageName, ", webview: ", view, ", url: ", url, ", ret: ", Boolean.valueOf(ret));
            CreativeInfoManager.a(sdkPackageName, view, url);
            String strA = a((Object) view);
            if (sdkPackageName != null && view != null && url != null) {
                com.safedk.android.analytics.brandsafety.c cVarK = k(strA);
                if (cVarK != null) {
                    l.a[] aVarArr = new l.a[3];
                    aVarArr[0] = new l.a(l.f62634O, "so");
                    aVarArr[1] = new l.a("url", url);
                    aVarArr[2] = new l.a(l.f62636Q, ret ? "cancel" : "allow");
                    cVarK.a(l.f62667v, aVarArr);
                } else {
                    l.a[] aVarArr2 = new l.a[3];
                    aVarArr2[0] = new l.a(l.f62634O, "so");
                    aVarArr2[1] = new l.a("url", url);
                    aVarArr2[2] = new l.a(l.f62636Q, ret ? "cancel" : "allow");
                    com.safedk.android.analytics.brandsafety.b.a(strA, l.f62667v, aVarArr2);
                }
                if (ret) {
                    a(sdkPackageName, view, url, strA);
                    return;
                }
                InterstitialFinder interstitialFinderZ = SafeDK.getInstance().z();
                if (interstitialFinderZ != null && (cVarC = interstitialFinderZ.c(strA)) != null && (creativeInfoJ = cVarC.j()) != null && creativeInfoJ.aq()) {
                    Logger.d(f61451q, "on should override url loading, ignore url from website end card");
                } else {
                    a(sdkPackageName, url, strA);
                }
            }
        }
    }

    public static void onShouldOverrideUrlLoading(String sdkPackageName, WebView view, WebResourceRequest webResourceRequest, boolean ret) {
        if (SafeDK.ab() && Build.VERSION.SDK_INT >= 21) {
            onShouldOverrideUrlLoading(sdkPackageName, view, webResourceRequest.getUrl().toString(), ret);
        }
    }

    public static void onWebChromeClientCreateWindow(String sdkPackageName, WebView view, Message msg, boolean ret) {
        if (SafeDK.ab() && sdkPackageName != null && view != null && msg != null && ret) {
            WebView webView = ((WebView.WebViewTransport) msg.obj).getWebView();
            Logger.d(f61451q, "on web chrome client create window, sdk: ", sdkPackageName, ", view: ", view, ", transport view: ", webView);
            if (webView != null) {
                f61431L.put(a((Object) webView), new WeakReference<>(view));
            }
        }
    }

    private static void a(final String str, final WebView webView, final String str2, final String str3) {
        f61429J.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.10
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(str);
                    if (adNetworkDiscoveryJ != null) {
                        RedirectDetails.RedirectType redirectTypeK = adNetworkDiscoveryJ.k(str2);
                        String strL = adNetworkDiscoveryJ.l(str2);
                        Logger.d(BrandSafetyUtils.f61451q, Logger.FeatureTag.REDIRECTS, "on should override url loading: target url is: ", strL, " redirect type is: ", redirectTypeK);
                        if (redirectTypeK != null) {
                            BrandSafetyUtils.a(str, webView, strL, redirectTypeK, "shouldOverrideUrlLoading");
                            if (BrandSafetyUtils.a(str, webView)) {
                                Logger.d(BrandSafetyUtils.f61451q, "on should override url loading, updating click URL. address : ", str3);
                                for (com.safedk.android.analytics.brandsafety.a aVar : Arrays.asList(SafeDK.getInstance().A(), SafeDK.getInstance().C())) {
                                    if (aVar != null && aVar.a(strL, str, str3, false, (String) null)) {
                                        com.safedk.android.analytics.brandsafety.b.a(str3, l.f62659n, new l.a("url", strL), new l.a(l.f62629J, "shouldOverrideUrlLoading"));
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        Logger.d(BrandSafetyUtils.f61451q, "on should override url loading, ignore redirect, sdk: ", str, ", webview: ", webView, ", url: ", str2);
                    }
                } catch (Throwable th) {
                    Logger.e(BrandSafetyUtils.f61451q, "exception while handling potential redirect", th);
                }
            }
        });
    }

    private static void a(final String str, final String str2, final String str3) {
        f61429J.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.11
            @Override // java.lang.Runnable
            public void run() {
                v vVar;
                try {
                    if (str2 == null || !str2.startsWith(com.safedk.android.analytics.brandsafety.creatives.g.f62375e)) {
                        return;
                    }
                    for (com.safedk.android.analytics.brandsafety.a aVar : Arrays.asList(SafeDK.getInstance().A(), SafeDK.getInstance().z())) {
                        if (aVar != null) {
                            v vVarA = null;
                            com.safedk.android.analytics.brandsafety.c cVarC = aVar.c(str3);
                            if (cVarC != null && cVarC.c().equals(str)) {
                                k kVarI = cVarC.i();
                                if (kVarI != null) {
                                    kVarI.m();
                                }
                                int size = cVarC.x().size() - 1;
                                while (true) {
                                    if (size < 0) {
                                        vVar = vVarA;
                                        break;
                                    }
                                    vVarA = DetectTouchUtils.a(str, cVarC.x().get(size));
                                    if (vVarA != null) {
                                        vVar = vVarA;
                                        break;
                                    }
                                    size--;
                                }
                                x xVar = new x(str, str2, str3, vVar, cVarC);
                                BrandSafetyUtils.f61430K.put(str3, xVar);
                                Logger.d(BrandSafetyUtils.f61451q, "handle suspicion of website loaded into banner: ", xVar);
                                BrandSafetyUtils.b(xVar, str3, "suspect");
                                return;
                            }
                        }
                    }
                } catch (Throwable th) {
                    Logger.e(BrandSafetyUtils.f61451q, "exception while handling suspicion of website loaded into banner", th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(x xVar, String str, String str2) {
        int iH = SafeDK.getInstance().h();
        v vVarF = xVar.f();
        boolean z2 = vVarF != null && SystemClock.elapsedRealtime() - vVarF.f62709a.longValue() < ((long) iH);
        String str3 = V8ValueBoolean.FALSE;
        if (vVarF != null) {
            float fElapsedRealtime = ((SystemClock.elapsedRealtime() - vVarF.f62709a.longValue()) / 100) / 10.0f;
            l.a[] aVarArr = new l.a[4];
            aVarArr[0] = new l.a("typ", str2);
            aVarArr[1] = new l.a("url", xVar.a());
            if (z2) {
                str3 = "true";
            }
            aVarArr[2] = new l.a(l.f62640U, str3);
            aVarArr[3] = new l.a(l.f62641V, String.valueOf(fElapsedRealtime));
            BannerFinder.a(str, l.f62625F, aVarArr);
            return;
        }
        BannerFinder.a(str, l.f62625F, new l.a("typ", str2), new l.a("url", xVar.a()), new l.a(l.f62640U, V8ValueBoolean.FALSE));
    }

    public static void a(String str, WebView webView, WebChromeClient webChromeClient) {
        Logger.d(f61451q, "handle set web chrome client, sdk: ", str, ", webview: ", webView, ", chrome client: ", webChromeClient);
        f61432M.put(a(webChromeClient), new WeakReference<>(webView));
    }

    public static void handleOnConsoleMessage(String sdkPackageName, WebChromeClient chromeClient, ConsoleMessage consoleMessage) {
        String strMessage;
        if (Build.VERSION.SDK_INT < 8) {
            strMessage = null;
        } else {
            strMessage = consoleMessage.message();
        }
        Logger.d(f61451q, "handle console message, chromeClient: ", chromeClient, ", message: ", strMessage);
        if (strMessage != null && strMessage.contains("mraid.open")) {
            String[] strArrSplit = strMessage.split("\\s+");
            if (strArrSplit.length > 1) {
                String str = strArrSplit[1];
                WeakReference<WebView> weakReference = f61432M.get(a(chromeClient));
                if (weakReference != null && weakReference.get() != null) {
                    Logger.d(f61451q, "handle console message, mraid.open detected, sdk: ", sdkPackageName, ", webview: ", weakReference.get(), ", url: ", str);
                    a(sdkPackageName, weakReference.get(), str, RedirectDetails.RedirectType.REDIRECT, "OnConsoleMessage");
                }
            }
        }
    }

    public static void onJsPrompt(String sdkPackageName, WebView webview, String requestingUrl, final String message, boolean ret) {
        final AdNetworkDiscovery adNetworkDiscoveryJ;
        Logger.d(f61451q, "on JS prompt, sdk: ", sdkPackageName, ", webview: ", webview, ", requestingUrl: ", requestingUrl, ", message: ", message, ", ret: ", Boolean.valueOf(ret));
        if (ret && webview != null && (adNetworkDiscoveryJ = CreativeInfoManager.j(sdkPackageName)) != null) {
            final WeakReference weakReference = new WeakReference(webview);
            f61429J.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.12
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        adNetworkDiscoveryJ.a(weakReference, message);
                    } catch (Throwable th) {
                        Logger.e(BrandSafetyUtils.f61451q, "on JS prompt exception", th);
                    }
                }
            });
        }
    }

    public static synchronized void a(String str, WebView webView, String str2, RedirectDetails.RedirectType redirectType, String str3) {
        RedirectDetails redirectDetails;
        SafeDK safeDK = SafeDK.getInstance();
        if (SafeDK.ab() && safeDK != null) {
            String strReplaceAll = str2 != null ? str2.replaceAll("/$", "") : null;
            if (SafeDK.S() && f61427H != null && str2 != null && !f61427H.equals(str2) && !f61427H.equals(strReplaceAll)) {
                Logger.d(f61451q, Logger.FeatureTag.REDIRECTS, "ignore redirect indication, sdk: ", str, ", url: ", str2);
                f61427H = null;
                return;
            }
            WebView webViewA = a(webView);
            AdType adTypeA = com.safedk.android.analytics.brandsafety.b.a(str, webViewA);
            m();
            if (f61426G == null) {
                redirectDetails = null;
            } else {
                redirectDetails = f61426G;
            }
            String strA = webViewA != null ? a((Object) webViewA) : null;
            f61426G = new RedirectDetails(str, adTypeA, redirectType, strA, str2, str3, redirectDetails);
            Logger.d(f61451q, Logger.FeatureTag.REDIRECTS, "handle redirect: last redirect - ", f61426G);
            e();
            if (com.safedk.android.utils.h.f63175o.equals(str)) {
                BannerFinder.a(f61426G);
            }
            if (!str3.equals("shouldOverrideUrlLoading")) {
                com.safedk.android.analytics.brandsafety.c cVarK = k(strA);
                if (cVarK != null) {
                    cVarK.a(l.f62666u, new l.a(l.f62634O, str3), new l.a("typ", redirectType.name().toLowerCase()), new l.a("url", str2));
                } else {
                    com.safedk.android.analytics.brandsafety.b.a(strA, l.f62666u, new l.a(l.f62634O, str3), new l.a("typ", redirectType.name().toLowerCase()), new l.a("url", str2));
                }
            }
        } else {
            Logger.d(f61451q, "handle redirect, Max/SafeDK not initialized, skipping. ");
        }
    }

    private static WebView a(WebView webView) {
        WeakReference<WebView> weakReference = f61431L.get(a((Object) webView));
        WebView webView2 = weakReference != null ? weakReference.get() : null;
        if (webView2 != null) {
            Logger.d(f61451q, "get redirect view, view: ", webView, ", redirect view: ", webView2);
            return webView2;
        }
        return webView;
    }

    public static synchronized void a(String str, String str2, String str3, String str4) {
        m mVar;
        String mainSdkPackage = SdksMapping.getMainSdkPackage(str);
        AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(mainSdkPackage);
        if (adNetworkDiscoveryJ != null && adNetworkDiscoveryJ.k(str2) != null) {
            if (SafeDK.S() && f61428I != null) {
                String strL = adNetworkDiscoveryJ.l(str2);
                Logger.d(f61451q, "handle redirect, sdk: ", mainSdkPackage, ", extracted url: ", strL);
                String strReplaceAll = str2 != null ? str2.replaceAll("/$", "") : null;
                if (strL != null && !f61428I.equals(strL) && !f61428I.equals(strReplaceAll)) {
                    Logger.d(f61451q, "handle redirect, ignore intent for sdk: ", mainSdkPackage, ", url: ", strL);
                    f61428I = null;
                    return;
                }
            }
            l();
            if (f61425F == null) {
                mVar = null;
            } else {
                mVar = f61425F;
            }
            f61425F = new m(mainSdkPackage, str2, str3, str4, mVar);
            Logger.d(f61451q, Logger.FeatureTag.REDIRECTS, "handle redirect, last intent details: ", f61425F);
            e();
            if (com.safedk.android.utils.h.f63175o.equals(mainSdkPackage)) {
                BannerFinder.a(f61425F);
            }
            return;
        }
        Logger.d(f61451q, "handle redirect, ignore intent for sdk: ", mainSdkPackage, ", url: ", str2);
    }

    public static synchronized String d() {
        m();
        l();
        if (f61426G != null && f61425F != null && f61425F.f62677c != null && f61425F.f62677c.equals(f61426G.f61740c)) {
            boolean zA = CreativeInfoManager.a(f61426G.f61740c, AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, false);
            if (f61426G.f61742e == RedirectDetails.RedirectType.REDIRECT && zA) {
                v vVarA = DetectTouchUtils.a(f61425F.f62677c, f61426G.f61743f);
                long jLongValue = vVarA == null ? 0L : vVarA.f62709a.longValue();
                if (jLongValue == 0 || SystemClock.elapsedRealtime() - jLongValue > ((long) SafeDK.getInstance().f())) {
                    Logger.d(f61451q, "check for potential auto redirect, identified for ", f61425F.f62677c, ", view address: ", f61426G.f61743f, ", webviewReqURL: ", f61426G.f61744g, ", landingPageURL: ", f61425F.f62678d);
                    return f61425F.f62678d;
                }
            }
        }
        return null;
    }

    public static synchronized void e() {
        m();
        l();
        if (f61426G != null && f61425F != null && f61425F.f62677c != null && f61425F.f62677c.equals(f61426G.f61740c)) {
            a(f61425F.f62677c, true, false);
        }
    }

    public static synchronized void f() {
        m();
        l();
        if (f61426G != null && f61425F != null && f61426G.f61742e == RedirectDetails.RedirectType.EXPAND && f61425F.f62677c != null && f61425F.f62677c.equals(f61426G.f61740c) && CreativeInfoManager.a(f61426G.f61740c, AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION_BY_MAX_EVENT, false)) {
            a(f61425F.f62677c, false, true);
        }
    }

    public static synchronized void g() {
        m();
        l();
        if (f61426G != null && f61425F != null && f61425F.f62677c != null && f61425F.f62677c.equals(f61426G.f61740c)) {
            a(f61425F.f62677c, true, true);
        }
    }

    public static synchronized com.safedk.android.analytics.brandsafety.c s(String str) {
        m();
        l();
        if (f61426G != null && f61425F != null) {
            Logger.d(f61451q, "handle redirect if needed with sdk: ", str);
            if (str != null && str.equals(f61425F.f62677c) && str.equals(f61426G.f61740c)) {
                return a(str, false, true);
            }
        }
        return null;
    }

    public static synchronized com.safedk.android.analytics.brandsafety.c a(Activity activity) {
        m();
        l();
        if (f61426G != null && f61425F != null) {
            String sdkPackageByClass = SdksMapping.getSdkPackageByClass(activity.toString());
            Logger.d(f61451q, "handle redirect if needed with activity sdk: ", sdkPackageByClass);
            if (sdkPackageByClass != null && sdkPackageByClass.equals(f61425F.f62677c) && sdkPackageByClass.equals(f61426G.f61740c)) {
                return a(sdkPackageByClass, false, true);
            }
        }
        return null;
    }

    private static synchronized com.safedk.android.analytics.brandsafety.c a(String str, boolean z2, boolean z3) {
        int i2;
        com.safedk.android.analytics.brandsafety.c cVarA;
        com.safedk.android.analytics.brandsafety.c cVarA2;
        BannerFinder bannerFinderA;
        Logger.d(f61451q, Logger.FeatureTag.REDIRECTS, "handle redirect report: last redirect name: ", f61426G.f61742e.name().toLowerCase(), ", intent: ", f61425F, ", redirect: ", f61426G);
        boolean zA = CreativeInfoManager.a(f61426G.f61740c, AdNetworkConfiguration.SUPPORTS_EXPANDED_ADS_IDENTIFICATION, false);
        boolean zA2 = CreativeInfoManager.a(f61426G.f61740c, AdNetworkConfiguration.SUPPORTS_AUTO_REDIRECTS_IDENTIFICATION, false);
        if ((f61426G.f61742e == RedirectDetails.RedirectType.REDIRECT && !zA2) || (f61426G.f61742e == RedirectDetails.RedirectType.EXPAND && !zA)) {
            Logger.d(f61451q, Logger.FeatureTag.REDIRECTS, "handle ", f61426G.f61742e.name().toLowerCase(), " is not supported for: ", f61426G.f61740c);
            return null;
        }
        if (f61426G.f61741d != null) {
            Logger.d(f61451q, "handle ", f61426G.f61742e.name().toLowerCase(), ", for ", str, " ", f61426G.f61741d, ", view address: ", f61426G.f61743f, ", webviewReqURL: ", f61426G.f61744g, ", landingPageURL: ", f61425F.f62678d);
            com.safedk.android.analytics.brandsafety.a aVarA = SafeDK.getInstance().a(f61426G.f61741d);
            if (aVarA == null) {
                cVarA2 = null;
            } else {
                cVarA2 = aVarA.a(str, f61426G, f61425F, z2, z3);
            }
        } else {
            InterstitialFinder interstitialFinderZ = SafeDK.getInstance().z();
            if (interstitialFinderZ == null) {
                i2 = 12;
                cVarA = null;
            } else {
                Logger.d(f61451q, "handle ", f61426G.f61742e.name().toLowerCase(), ", for ", str, " ", interstitialFinderZ.a(), ", view address: ", f61426G.f61743f, ", webviewReqURL: ", f61426G.f61744g, ", landingPageURL: ", f61425F.f62678d);
                i2 = 12;
                cVarA = interstitialFinderZ.a(str, f61426G, f61425F, z2, z3);
            }
            if (cVarA == null && (bannerFinderA = SafeDK.getInstance().A()) != null) {
                Object[] objArr = new Object[i2];
                objArr[0] = "handle ";
                objArr[1] = f61426G.f61742e.name().toLowerCase();
                objArr[2] = ", for ";
                objArr[3] = str;
                objArr[4] = " ";
                objArr[5] = bannerFinderA.a();
                objArr[6] = ", view address: ";
                objArr[7] = f61426G.f61743f;
                objArr[8] = ", webviewReqURL: ";
                objArr[9] = f61426G.f61744g;
                objArr[10] = ", landingPageURL: ";
                objArr[11] = f61425F.f62678d;
                Logger.d(f61451q, objArr);
                cVarA2 = bannerFinderA.a(str, f61426G, f61425F, z2, z3);
            } else {
                cVarA2 = cVarA;
            }
        }
        if (z3) {
            f61426G = null;
            f61425F = null;
        }
        return cVarA2;
    }

    private static void l() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iG = SafeDK.getInstance().g();
        m mVar = f61425F;
        if (mVar != null && jElapsedRealtime - mVar.f62676b.longValue() > iG) {
            Logger.d(f61451q, "remove old intent: ", f61425F);
            f61425F = null;
        }
    }

    private static void m() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iG = SafeDK.getInstance().g();
        RedirectDetails redirectDetails = f61426G;
        if (redirectDetails != null && jElapsedRealtime - redirectDetails.f61739b.longValue() > iG) {
            Logger.d(f61451q, "remove old redirect: ", f61426G);
            f61426G = null;
        }
    }

    public static RedirectDetails h() {
        m();
        return f61426G;
    }

    public static void t(String str) {
        if (SafeDK.S()) {
            f61427H = str;
            f61428I = str;
        }
    }

    public static void i() {
        f61427H = null;
        f61428I = null;
    }

    public static AdType a(long j2, long j3) {
        float f3 = j2;
        float f4 = j3;
        if (com.safedk.android.utils.n.a(f3, f4)) {
            Logger.d(f61451q, "get ad type, banner identified");
            return AdType.BANNER;
        }
        if (com.safedk.android.utils.n.b(f3, f4)) {
            Logger.d(f61451q, "get ad type, mrec identified");
            return AdType.MREC;
        }
        Logger.d(f61451q, "get ad type, inter identified");
        return AdType.INTERSTITIAL;
    }

    public static void b(Activity activity) {
        Logger.d(f61451q, "report landing page loaded. activity: ", activity);
        n nVarR = SafeDK.getInstance().z().r(SdksMapping.getSdkPackageByClass(activity.getClass().getName()));
        if (nVarR != null && nVarR.f62687ao) {
            nVarR.i().a(l.f62663r, new l.a(l.f62638S, Integer.toString(SafeDK.getInstance().A().j() + 1 + SafeDK.getInstance().C().f())), new l.a(l.f62639T, activity.getClass().getCanonicalName()));
        }
    }

    public static void c(Activity activity) {
        Logger.d(f61451q, "report landing page removed. activity: ", activity);
        n nVarR = SafeDK.getInstance().z().r(SdksMapping.getSdkPackageByClass(activity.getClass().getName()));
        if (nVarR != null && nVarR.f62687ao) {
            nVarR.i().a(l.f62664s, new l.a[0]);
        }
    }

    public static void onMobileFuseSetState(String state) {
        Logger.d(f61451q, "on mobilefuse set state - state= ", state);
        if (!TextUtils.isEmpty(state) && state.equals("EXPANDED")) {
            Logger.d(f61451q, "on mobilefuse set state - calling handle redirect (intent)");
            a(com.safedk.android.utils.h.f63159E, (String) null, (String) null, RedirectEvent.f62801i);
        }
    }

    public static void onMobileFuseFullscreenChanged(boolean isChanged) {
        Logger.d(f61451q, "on mobilefuse fullscreen changed - is changed= ", Boolean.valueOf(isChanged));
        if (SafeDK.ab() && isChanged) {
            Logger.d(f61451q, "on mobilefuse fullscreen changed - calling handle redirect");
            s(com.safedk.android.utils.h.f63159E);
        }
    }

    public static void onBidMachineOnExpandIntention(WebView expandedWebview) {
        Logger.d(f61451q, QTafcm.PShNJ, expandedWebview);
        a(com.safedk.android.utils.h.f63156B, (String) null, a((Object) expandedWebview), RedirectEvent.f62801i);
    }

    public static void onBidMachineOnExpanded() {
        Logger.d(f61451q, "on bidMachine on expanded - calling handle redirect (intent)");
        a(com.safedk.android.utils.h.f63156B, (String) null, (String) null, RedirectEvent.f62801i);
    }

    public static void onBidMachineOnClose() {
        Logger.d(f61451q, "on bidMachine on close - calling handle redirect");
        if (SafeDK.ab()) {
            s(com.safedk.android.utils.h.f63156B);
        }
    }

    public static void onMintegralNativeController(final Object instance, final JSONObject object) {
        Logger.d(f61451q, "on mintegral native controller - instance= ", instance);
        if (instance != null && object != null) {
            f61429J.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.2
                @Override // java.lang.Runnable
                public void run() {
                    com.safedk.android.analytics.brandsafety.creatives.discoveries.k.a(instance, object);
                }
            });
        }
    }

    public static void onPubmaticNativeCall(final WebView webview, final String message) {
        Logger.d(f61451q, "on pubmatic native call - webview: ", webview, ", message:", message);
        f61429J.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.BrandSafetyUtils.3
            @Override // java.lang.Runnable
            public void run() {
                RedirectDetails.RedirectType redirectType;
                try {
                    JSONObject jSONObject = new JSONObject(message);
                    String string = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (string.equals("open")) {
                        redirectType = RedirectDetails.RedirectType.REDIRECT;
                    } else if (string.equals("expand")) {
                        redirectType = RedirectDetails.RedirectType.EXPAND;
                    } else {
                        return;
                    }
                    BrandSafetyUtils.a(com.safedk.android.utils.h.f63160F, webview, jSONObject.getJSONObject("params").getString("url"), redirectType, "NativeCall");
                } catch (Exception e2) {
                    Logger.d(BrandSafetyUtils.f61451q, "on pubmatic native call - webview: ", webview, ", failed to parse message", e2);
                }
            }
        });
    }

    public static void onWindVaneSignalCommunicationHandleMessage(String sdkPackageName, Object obj, Message msg) {
        Logger.d(f61451q, "onWindVaneSignalCommunicationHandleMessage, sdk: ", sdkPackageName, ", calling obj: ", obj, ", msg: ", msg);
        Object obj2 = msg.obj;
        Class<?> cls = obj2.getClass();
        ArrayList arrayList = new ArrayList();
        String strA = null;
        for (Field field : cls.getDeclaredFields()) {
            try {
                field.setAccessible(true);
                Object obj3 = field.get(obj2);
                Object obj4 = V8ValueNull.NULL;
                String string = obj3 != null ? obj3.toString() : V8ValueNull.NULL;
                if (string.length() > 128) {
                    string = string.substring(0, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) + "...";
                }
                arrayList.add(string);
                Object[] objArr = new Object[4];
                objArr[0] = "onWindVaneSignalCommunicationHandleMessage, fieldObj class: ";
                if (obj3 != null) {
                    obj4 = obj3.getClass();
                }
                objArr[1] = obj4;
                objArr[2] = ", value: ";
                try {
                    objArr[3] = obj3;
                    Logger.d(f61451q, objArr);
                    if (obj3 instanceof WebView) {
                        strA = a(obj3);
                        Logger.d(f61451q, "onWindVaneSignalCommunicationHandleMessage, found webview address: ", strA);
                    }
                } catch (Throwable th) {
                    th = th;
                    Logger.d(f61451q, "onWindVaneSignalCommunicationHandleMessage exception: ", th);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        BannerFinder.a(strA, arrayList);
    }
}
