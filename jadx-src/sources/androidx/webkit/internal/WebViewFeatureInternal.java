package androidx.webkit.internal;

import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import androidx.webkit.internal.ApiFeature;
import androidx.webkit.internal.StartupApiFeature;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class WebViewFeatureInternal {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ApiFeature.M f42556n = new ApiFeature.M("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
    public static final ApiFeature.M rl = new ApiFeature.M("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ApiFeature.O f42559t = new ApiFeature.O("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
    public static final ApiFeature.N nr = new ApiFeature.N("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final ApiFeature.O_MR1 f42545O = new ApiFeature.O_MR1("START_SAFE_BROWSING", "START_SAFE_BROWSING");
    public static final ApiFeature.O_MR1 J2 = new ApiFeature.O_MR1("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
    public static final ApiFeature.O_MR1 Uo = new ApiFeature.O_MR1("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
    public static final ApiFeature.O_MR1 KN = new ApiFeature.O_MR1("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
    public static final ApiFeature.O_MR1 xMQ = new ApiFeature.O_MR1("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
    public static final ApiFeature.O_MR1 mUb = new ApiFeature.O_MR1("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
    public static final ApiFeature.N gh = new ApiFeature.N("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
    public static final ApiFeature.N qie = new ApiFeature.N("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
    public static final ApiFeature.N az = new ApiFeature.N("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
    public static final ApiFeature.N ty = new ApiFeature.N("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
    public static final ApiFeature.N HI = new ApiFeature.N("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
    public static final ApiFeature.N ck = new ApiFeature.N("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
    public static final ApiFeature.M Ik = new ApiFeature.M("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ApiFeature.M f42558r = new ApiFeature.M("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ApiFeature.N f42557o = new ApiFeature.N("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final ApiFeature.O_MR1 f42551Z = new ApiFeature.O_MR1("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
    public static final ApiFeature.N XQ = new ApiFeature.N("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final ApiFeature.M f42546S = new ApiFeature.M("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
    public static final ApiFeature.M WPU = new ApiFeature.M("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
    public static final ApiFeature.O_MR1 aYN = new ApiFeature.O_MR1("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
    public static final ApiFeature.O_MR1 ViF = new ApiFeature.O_MR1("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
    public static final ApiFeature.O_MR1 nY = new ApiFeature.O_MR1("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ApiFeature.M f42554g = new ApiFeature.M("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
    public static final ApiFeature.M te = new ApiFeature.M("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
    public static final ApiFeature.NoFramework iF = new ApiFeature.NoFramework("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
    public static final ApiFeature.M fD = new ApiFeature.M("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
    public static final ApiFeature.M E2 = new ApiFeature.M("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ApiFeature.M f42553e = new ApiFeature.M("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final ApiFeature.M f42549X = new ApiFeature.M("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final ApiFeature.O f42547T = new ApiFeature.O("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final ApiFeature.O f42544N = new ApiFeature.O("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
    public static final ApiFeature.Q nHg = new ApiFeature.Q("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
    public static final ApiFeature.Q s7N = new ApiFeature.Q("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
    public static final ApiFeature.P wTp = new ApiFeature.P("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final StartupApiFeature.P f42560v = new StartupApiFeature.P("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");
    public static final StartupApiFeature.NoFramework rV9 = new StartupApiFeature.NoFramework("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");
    public static final ApiFeature.Q bzg = new ApiFeature.Q("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
    public static final ApiFeature.T Xw = new ApiFeature.T("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING") { // from class: androidx.webkit.internal.WebViewFeatureInternal.1
        private final Pattern nr = Pattern.compile("\\A\\d+");

        @Override // androidx.webkit.internal.ApiFeature
        public boolean t() {
            boolean zT2 = super.t();
            if (zT2 && Build.VERSION.SDK_INT < 29) {
                PackageInfo packageInfoO = WebViewCompat.O();
                if (packageInfoO == null) {
                    return false;
                }
                Matcher matcher = this.nr.matcher(packageInfoO.versionName);
                if (!matcher.find() || Integer.parseInt(packageInfoO.versionName.substring(matcher.start(), matcher.end())) < 105) {
                    return false;
                }
                return true;
            }
            return zT2;
        }
    };
    public static final ApiFeature.NoFramework jB = new ApiFeature.NoFramework("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final ApiFeature.NoFramework f42548U = new ApiFeature.NoFramework("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
    public static final ApiFeature.Q P5 = new ApiFeature.Q("FORCE_DARK", "FORCE_DARK");
    public static final ApiFeature.NoFramework M7 = new ApiFeature.NoFramework("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
    public static final ApiFeature.NoFramework p5 = new ApiFeature.NoFramework("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
    public static final ApiFeature.NoFramework eF = new ApiFeature.NoFramework("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final ApiFeature.NoFramework f42538E = new ApiFeature.NoFramework("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final ApiFeature.NoFramework f42543M = new ApiFeature.NoFramework("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    public static final ApiFeature.NoFramework f42539FX = new ApiFeature.NoFramework("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final ApiFeature.NoFramework f42536B = new ApiFeature.NoFramework("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final ApiFeature.NoFramework f42542J = new ApiFeature.NoFramework("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final ApiFeature.NoFramework f42537D = new ApiFeature.NoFramework("USER_AGENT_METADATA", "USER_AGENT_METADATA");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ApiFeature.NoFramework f42552a = new ApiFeature.NoFramework("MULTI_PROFILE", "MULTI_PROFILE") { // from class: androidx.webkit.internal.WebViewFeatureInternal.2
        @Override // androidx.webkit.internal.ApiFeature
        public boolean t() {
            if (!super.t() || !WebViewFeature.n("MULTI_PROCESS")) {
                return false;
            }
            return WebViewCompat.gh();
        }
    };

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final ApiFeature.NoFramework f42541I = new ApiFeature.NoFramework("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    public static final ApiFeature.NoFramework f42540GR = new ApiFeature.NoFramework("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");
    public static final ApiFeature.NoFramework Nxk = new ApiFeature.NoFramework("MUTE_AUDIO", "MUTE_AUDIO");

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final ApiFeature.NoFramework f42550Y = new ApiFeature.NoFramework("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ApiFeature.NoFramework f42555k = new ApiFeature.NoFramework("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");
    public static final ApiFeature.NoFramework dR0 = new ApiFeature.NoFramework("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");

    public static UnsupportedOperationException n() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean t(String str, Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ConditionallySupportedFeature conditionallySupportedFeature = (ConditionallySupportedFeature) it.next();
            if (conditionallySupportedFeature.n().equals(str)) {
                hashSet.add(conditionallySupportedFeature);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            if (((ConditionallySupportedFeature) it2.next()).isSupported()) {
                return true;
            }
        }
        return false;
    }

    public static boolean rl(String str) {
        return t(str, ApiFeature.nr());
    }
}
