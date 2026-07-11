package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.app.ApplicationStartInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Range;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.work.impl.constraints.controllers.qRl.FijIa;
import com.applovin.impl.AbstractC1810u4;
import com.applovin.impl.AbstractC1811v;
import com.applovin.impl.AbstractRunnableC1782i5;
import com.applovin.impl.C1784j;
import com.applovin.impl.C1797r6;
import com.applovin.impl.c4;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.k7;
import com.applovin.impl.m7;
import com.applovin.impl.n7;
import com.applovin.impl.n8;
import com.applovin.impl.o0;
import com.applovin.impl.o5;
import com.applovin.impl.p0;
import com.applovin.impl.q0;
import com.applovin.impl.r0;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinEventTypes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.internal.ads_identifier.VR.wDgKoYAES;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.vungle.ads.internal.model.Cookie;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f50272j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static String f50273k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final AtomicReference f50274l = new AtomicReference();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final AtomicReference f50275m = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802k f50276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1804o f50277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f50278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f50279d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f50281f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f50283h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f50280e = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f50282g = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicReference f50284i = new AtomicReference();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class a implements o5.a {
        a() {
        }

        @Override // com.applovin.impl.o5.a
        public void a(AbstractC1811v.a aVar) {
            l.f50274l.set(aVar);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50288a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f50289b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Boolean f50290c = null;
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public interface d {
        String a(ContentResolver contentResolver, String str);
    }

    private Map L() {
        return n7.a(a((Map) null, true, false));
    }

    private boolean P() {
        try {
            if (!b()) {
                if (!c()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        try {
            String strI = I();
            if (StringUtils.isValidString(strI)) {
                this.f50276a.O();
                if (C1804o.a()) {
                    this.f50276a.O().a("DataCollector", "Successfully retrieved bid token");
                }
                t2.a(appLovinBidTokenCollectionListener, strI);
                return;
            }
            this.f50276a.O();
            if (C1804o.a()) {
                this.f50276a.O().b("DataCollector", "Empty bid token");
            }
            t2.b(appLovinBidTokenCollectionListener, "Empty bid token");
        } catch (Throwable th) {
            if (C1804o.a()) {
                this.f50277b.a("DataCollector", "Failed to collect bid token", th);
            }
            this.f50276a.D().a("DataCollector", "collectBidToken", th);
            t2.b(appLovinBidTokenCollectionListener, "Failed to collect bid token");
        }
    }

    private Map c(PackageInfo packageInfo) {
        HashMap map = null;
        if (packageInfo == null) {
            return null;
        }
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && iArr != null && strArr.length != 0 && strArr.length == iArr.length) {
            map = new HashMap();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                CollectionUtils.putIntegerIfValid(strArr[i2], Integer.valueOf(iArr[i2]), map);
            }
        }
        return map;
    }

    private List d(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return null;
        }
        if (o0.h()) {
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo != null) {
                return a(signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory());
            }
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                return a(signatureArr);
            }
        }
        return null;
    }

    public Map p() {
        return a(false);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f50286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f50287b;

        public b(String str, int i2) {
            this.f50286a = str;
            this.f50287b = i2;
        }
    }

    private String B() {
        AudioManager audioManager = (AudioManager) this.f50278c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (o0.e()) {
            for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                sb.append(audioDeviceInfo.getType());
                sb.append(",");
            }
        } else {
            if (audioManager.isWiredHeadsetOn()) {
                sb.append(3);
                sb.append(",");
            }
            if (audioManager.isBluetoothScoOn()) {
                sb.append(7);
                sb.append(",");
            }
            if (audioManager.isBluetoothA2dpOn()) {
                sb.append(8);
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        String string = sb.toString();
        if (TextUtils.isEmpty(string) && C1804o.a()) {
            this.f50277b.a("DataCollector", "No sound outputs detected");
        }
        return string;
    }

    private Map C() {
        HashMap map = new HashMap();
        PackageManager packageManager = this.f50278c.getPackageManager();
        ApplicationInfo applicationInfo = this.f50278c.getApplicationInfo();
        long jLastModified = new File(applicationInfo.sourceDir).lastModified();
        int i2 = o0.h() ? 134238224 : 20560;
        PackageInfo packageInfoA = n7.a(this.f50278c, 0);
        PackageInfo packageInfoA2 = n7.a(this.f50278c, i2);
        String strA = a(applicationInfo.packageName, packageManager, this.f50276a);
        String strA2 = a(applicationInfo.packageName, packageManager);
        map.put("app_name", packageManager.getApplicationLabel(applicationInfo));
        map.put("app_version", packageInfoA != null ? packageInfoA.versionName : "");
        map.put("app_version_code", Integer.valueOf(packageInfoA != null ? packageInfoA.versionCode : -1));
        map.put("installer_name", StringUtils.emptyIfNull(strA));
        map.put("originating_name", StringUtils.emptyIfNull(strA2));
        map.put("tg", m7.a(this.f50276a));
        map.put("debug", Boolean.valueOf(n7.c(this.f50276a)));
        map.put("ia", Long.valueOf(jLastModified));
        map.put("alts_ms", Long.valueOf(C1802k.n()));
        map.put("session_id", this.f50276a.m0().getSessionId());
        map.put("j8", Boolean.valueOf(C1802k.F0()));
        map.put("app_info_flags", Integer.valueOf(applicationInfo.flags));
        map.put("last_update_ms", Long.valueOf(packageInfoA != null ? packageInfoA.lastUpdateTime : 0L));
        List listD = d(packageInfoA2);
        if (!CollectionUtils.isEmpty(listD)) {
            map.put("signing_info", listD);
        }
        List listA = a(packageInfoA2);
        if (!CollectionUtils.isEmpty(listA)) {
            map.put("instrumentation", listA);
        }
        if (o0.d()) {
            map.put("install_location", Integer.valueOf(packageInfoA != null ? packageInfoA.installLocation : 0));
            map.put("split_names", packageInfoA != null ? packageInfoA.splitNames : Collections.EMPTY_LIST);
        }
        if (((Boolean) this.f50276a.a(x4.L4)).booleanValue()) {
            Map mapC = c(packageInfoA2);
            if (CollectionUtils.isEmpty(mapC)) {
                map.put("req_p", mapC);
            }
            List listB = b(packageInfoA2);
            if (CollectionUtils.isEmpty(listB)) {
                map.put("req_f", listB);
            }
        }
        C1802k c1802k = this.f50276a;
        z4 z4Var = z4.f51005h;
        Long l2 = (Long) c1802k.a(z4Var);
        if (l2 != null) {
            map.put("ia_v2", l2);
        } else {
            this.f50276a.b(z4Var, Long.valueOf(jLastModified));
        }
        map.put("sdk_version", AppLovinSdk.VERSION);
        map.put("omid_sdk_version", this.f50276a.e0().c());
        CollectionUtils.putStringIfValid("ad_review_sdk_version", C1784j.b(), map);
        map.put("api_did", this.f50276a.a(x4.f50816f));
        map.put("first_install_v3_ms", packageInfoA != null ? Long.valueOf(packageInfoA.firstInstallTime) : "");
        CollectionUtils.putLongIfValid("last_launch_ms", this.f50276a.L(), map);
        CollectionUtils.putLongIfValid("app_launch_count", Long.valueOf(this.f50276a.M()), map);
        map.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        if (o0.f()) {
            map.put("min_sdk", Integer.valueOf(applicationInfo.minSdkVersion));
        }
        if (this.f50276a.H0()) {
            map.put("unity_version", n7.a(this.f50276a.n0()));
        }
        List listI = i();
        if (!CollectionUtils.isEmpty(listI)) {
            map.put("application_start_info", listI);
        }
        List listG = g();
        if (!CollectionUtils.isEmpty(listG)) {
            map.put("application_exit_info", listG);
        }
        if (o0.g()) {
            map.put("instant_app", Boolean.valueOf(packageManager.isInstantApp()));
        }
        return map;
    }

    private Map D() {
        String str = FijIa.hHkFhn;
        HashMap map = new HashMap(35);
        map.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        map.put("brand", Build.MANUFACTURER);
        map.put("brand_name", Build.BRAND);
        map.put("hardware", Build.HARDWARE);
        map.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        map.put("aida", Boolean.valueOf(AbstractC1811v.a()));
        map.put("locale", Locale.getDefault().toString());
        map.put("model", Build.MODEL);
        map.put("os", Build.VERSION.RELEASE);
        map.put(AppLovinBridge.f61288f, A());
        map.put("revision", Build.DEVICE);
        map.put("tz_offset", Double.valueOf(E()));
        map.put("gy", Boolean.valueOf(u()));
        map.put("country_code", n());
        map.put("mcc", y());
        map.put("mnc", z());
        map.put("carrier", l());
        map.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.f50278c)));
        map.put("pc", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        map.put("hdr", T());
        map.put("supported_abis", O());
        map.put("type", Build.TYPE);
        map.put(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT);
        DisplayMetrics displayMetrics = this.f50278c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            map.put("adns", Float.valueOf(displayMetrics.density));
            map.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            map.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            map.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            o0.b bVarA = o0.a(this.f50278c, this.f50276a);
            if (bVarA != null) {
                map.put("tl_cr", Integer.valueOf(bVarA.c()));
                map.put("tr_cr", Integer.valueOf(bVarA.d()));
                map.put("bl_cr", Integer.valueOf(bVarA.a()));
                map.put("br_cr", Integer.valueOf(bVarA.b()));
            }
        }
        map.put("bt_ms", Long.valueOf(k()));
        map.put("tbalsi_ms", Long.valueOf(this.f50276a.K() - C1802k.n()));
        CollectionUtils.putStringIfValid("process_name", n7.c(this.f50278c), map);
        CollectionUtils.putBooleanIfValid("is_main_process", n7.i(this.f50278c), map);
        try {
            PackageInfo packageInfo = this.f50278c.getPackageManager().getPackageInfo("com.android.vending", 0);
            map.put(str, packageInfo.versionName);
            map.put("ps_version_code", Integer.valueOf(packageInfo.versionCode));
        } catch (Throwable unused) {
            map.put(str, "");
            map.put("ps_version_code", -1);
        }
        CollectionUtils.putBooleanIfValid("play_store_disabled", k7.a(this.f50278c), map);
        a(map);
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private JSONArray F() {
        MediaCodecInfo[] mediaCodecInfoArr;
        int i2;
        int i3;
        int i5;
        int i7;
        MediaCodecInfo mediaCodecInfo;
        String[] strArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Range<Integer> bitrateRange;
        if (!o0.d()) {
            return new JSONArray();
        }
        ArrayList arrayList = new ArrayList();
        try {
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            int length = codecInfos.length;
            int i8 = 0;
            while (i8 < length) {
                MediaCodecInfo mediaCodecInfo2 = codecInfos[i8];
                if (mediaCodecInfo2.isEncoder()) {
                    mediaCodecInfoArr = codecInfos;
                    i2 = length;
                    i3 = i8;
                } else {
                    HashMap map = new HashMap();
                    map.put(AppMeasurementSdk.ConditionalUserProperty.NAME, mediaCodecInfo2.getName());
                    if (o0.i()) {
                        map.put("is_hardware_accelerated", Boolean.valueOf(mediaCodecInfo2.isHardwareAccelerated()));
                        map.put("is_software_only", Boolean.valueOf(mediaCodecInfo2.isSoftwareOnly()));
                    }
                    String[] supportedTypes = mediaCodecInfo2.getSupportedTypes();
                    ArrayList arrayList2 = new ArrayList();
                    HashMap map2 = new HashMap();
                    int length2 = supportedTypes.length;
                    int i9 = 0;
                    while (i9 < length2) {
                        String str = supportedTypes[i9];
                        MediaCodecInfo[] mediaCodecInfoArr2 = codecInfos;
                        if (str.toLowerCase(Locale.ROOT).startsWith("video/")) {
                            arrayList2.add(str);
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo2.getCapabilitiesForType(str);
                                if (capabilitiesForType == null || (videoCapabilities = capabilitiesForType.getVideoCapabilities()) == null) {
                                    i5 = length;
                                    i7 = i8;
                                    mediaCodecInfo = mediaCodecInfo2;
                                    strArr = supportedTypes;
                                } else {
                                    i5 = length;
                                    try {
                                        HashMap map3 = new HashMap();
                                        i7 = i8;
                                        try {
                                            mediaCodecInfo = mediaCodecInfo2;
                                            try {
                                                map3.put("max_width", videoCapabilities.getSupportedWidths().getUpper());
                                                map3.put("max_height", videoCapabilities.getSupportedHeights().getUpper());
                                                bitrateRange = videoCapabilities.getBitrateRange();
                                                strArr = supportedTypes;
                                            } catch (Throwable th) {
                                                th = th;
                                                strArr = supportedTypes;
                                                if (!C1804o.a()) {
                                                    this.f50277b.a("DataCollector", "Failed to get capabilities for codec: " + mediaCodecInfo.getName() + ", MIME type: " + str, th);
                                                }
                                                i9++;
                                                codecInfos = mediaCodecInfoArr2;
                                                length = i5;
                                                i8 = i7;
                                                mediaCodecInfo2 = mediaCodecInfo;
                                                supportedTypes = strArr;
                                            }
                                            try {
                                                map3.put("bitrate_range_bps", Arrays.asList((Integer) bitrateRange.getLower(), (Integer) bitrateRange.getUpper()));
                                                Range<Integer> supportedFrameRates = videoCapabilities.getSupportedFrameRates();
                                                map3.put("overall_frame_rate_range", Arrays.asList((Integer) supportedFrameRates.getLower(), (Integer) supportedFrameRates.getUpper()));
                                                int iIntValue = ((Integer) videoCapabilities.getSupportedWidths().getUpper()).intValue();
                                                int iIntValue2 = ((Integer) videoCapabilities.getSupportedHeights().getUpper()).intValue();
                                                if (videoCapabilities.isSizeSupported(iIntValue, iIntValue2)) {
                                                    try {
                                                        Range<Double> supportedFrameRatesFor = videoCapabilities.getSupportedFrameRatesFor(iIntValue, iIntValue2);
                                                        if (supportedFrameRatesFor != null) {
                                                            map3.put("frame_rate_range_for_max_res", Arrays.asList((Double) supportedFrameRatesFor.getLower(), (Double) supportedFrameRatesFor.getUpper()));
                                                        }
                                                    } catch (Throwable th2) {
                                                        if (C1804o.a()) {
                                                            this.f50277b.a("DataCollector", "Could not get frame rates for max resolution for codec: " + mediaCodecInfo.getName() + ", MIME type: " + str, th2);
                                                        }
                                                    }
                                                }
                                                ArrayList arrayList3 = new ArrayList();
                                                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                                                if (codecProfileLevelArr != null && codecProfileLevelArr.length > 0) {
                                                    int i10 = 0;
                                                    for (int length3 = codecProfileLevelArr.length; i10 < length3; length3 = length3) {
                                                        MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i10];
                                                        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr2 = codecProfileLevelArr;
                                                        HashMap map4 = new HashMap();
                                                        map4.put(Scopes.PROFILE, Integer.valueOf(codecProfileLevel.profile));
                                                        map4.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(codecProfileLevel.level));
                                                        arrayList3.add(map4);
                                                        i10++;
                                                        codecProfileLevelArr = codecProfileLevelArr2;
                                                    }
                                                    map3.put("profile_levels", arrayList3);
                                                }
                                                if (!map3.isEmpty()) {
                                                    map2.put(str, map3);
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                if (!C1804o.a()) {
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            mediaCodecInfo = mediaCodecInfo2;
                                            strArr = supportedTypes;
                                            if (!C1804o.a()) {
                                            }
                                            i9++;
                                            codecInfos = mediaCodecInfoArr2;
                                            length = i5;
                                            i8 = i7;
                                            mediaCodecInfo2 = mediaCodecInfo;
                                            supportedTypes = strArr;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        i7 = i8;
                                        mediaCodecInfo = mediaCodecInfo2;
                                        strArr = supportedTypes;
                                        if (!C1804o.a()) {
                                        }
                                        i9++;
                                        codecInfos = mediaCodecInfoArr2;
                                        length = i5;
                                        i8 = i7;
                                        mediaCodecInfo2 = mediaCodecInfo;
                                        supportedTypes = strArr;
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                i5 = length;
                            }
                        }
                        i9++;
                        codecInfos = mediaCodecInfoArr2;
                        length = i5;
                        i8 = i7;
                        mediaCodecInfo2 = mediaCodecInfo;
                        supportedTypes = strArr;
                    }
                    mediaCodecInfoArr = codecInfos;
                    i2 = length;
                    i3 = i8;
                    if (!arrayList2.isEmpty()) {
                        map.put("supported_mime_types", arrayList2);
                        if (!map2.isEmpty()) {
                            map.put("capabilities_by_type", map2);
                        }
                        arrayList.add(map);
                    }
                }
                i8 = i3 + 1;
                codecInfos = mediaCodecInfoArr;
                length = i2;
            }
            return new JSONArray((Collection) arrayList);
        } catch (Throwable th7) {
            if (C1804o.a()) {
                this.f50277b.a("DataCollector", "Failed to get MediaCodecList", th7);
            }
            return new JSONArray();
        }
    }

    public static String J() {
        return f50273k;
    }

    private boolean S() {
        boolean z2 = this.f50278c.getResources().getConfiguration().keyboard == 2;
        PackageManager packageManager = this.f50278c.getPackageManager();
        return z2 && (packageManager.hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE") || packageManager.hasSystemFeature("android.hardware.type.pc"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V() {
        this.f50284i.set(s());
    }

    private List X() {
        List listC = this.f50276a.c(x4.H4);
        if (CollectionUtils.isEmpty(listC)) {
            return null;
        }
        return n7.a("/proc/self/maps", listC, this.f50276a);
    }

    private Map Y() {
        boolean z2;
        int i2;
        Throwable th;
        if (!((Boolean) this.f50276a.a(x4.G4)).booleanValue()) {
            return null;
        }
        HashMap map = new HashMap();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            z2 = false;
            i2 = 0;
            while (it.hasNext()) {
                try {
                    for (StackTraceElement stackTraceElement : it.next().getValue()) {
                        String string = stackTraceElement.toString();
                        if (!z2 && string.contains("de.robv.android.xposed")) {
                            z2 = true;
                        }
                        if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                            i2++;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f50276a.D().b("DataCollector", "collectHookingSignals", th);
                }
            }
        } catch (Throwable th3) {
            z2 = false;
            i2 = 0;
            th = th3;
        }
        map.put("xpd", Boolean.valueOf(z2));
        map.put("zi_count", Integer.valueOf(i2));
        CollectionUtils.putBooleanIfValid("fpd", Q(), map);
        return map;
    }

    private void a0() {
        this.f50276a.q0().a((AbstractRunnableC1782i5) new C1797r6(this.f50276a, "collectPostInitAppInfo", new Runnable() { // from class: com.applovin.impl.sdk.qYU
            @Override // java.lang.Runnable
            public final void run() {
                this.f50462n.W();
            }
        }), d6.b.OTHER);
    }

    private String h() {
        int orientation = AppLovinSdkUtils.getOrientation(this.f50278c);
        return orientation == 1 ? "portrait" : orientation == 2 ? "landscape" : "none";
    }

    private c j() {
        c cVar = new c();
        Intent intentRegisterReceiver = this.f50278c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) : -1;
        int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            cVar.f50289b = -1;
        } else {
            cVar.f50289b = (int) ((intExtra / intExtra2) * 100.0f);
        }
        cVar.f50288a = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        cVar.f50290c = Boolean.valueOf(Settings.Global.getInt(this.f50278c.getContentResolver(), "stay_on_while_plugged_in", -1) > 0);
        return cVar;
    }

    private String l() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f50278c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            return telephonyManager.getNetworkOperatorName();
        } catch (Throwable th) {
            if (!C1804o.a()) {
                return "";
            }
            this.f50277b.a("DataCollector", "Unable to collect carrier", th);
            return "";
        }
    }

    private String n() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f50278c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    private String o() {
        ActivityInfo activityInfo;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.f62220u));
        ResolveInfo resolveInfoResolveActivity = this.f50278c.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null) {
            f50273k = activityInfo.packageName;
        }
        return f50273k;
    }

    private Map r() {
        HashMap map = new HashMap();
        JSONObject jSONObjectDeserialize = JsonUtils.deserialize((String) this.f50276a.a(x4.I4));
        if (JsonUtils.isValid(jSONObjectDeserialize)) {
            map.putAll(a(jSONObjectDeserialize, new d() { // from class: com.applovin.impl.sdk.Fl
                @Override // com.applovin.impl.sdk.l.d
                public final String a(ContentResolver contentResolver, String str) {
                    return Settings.System.getString(contentResolver, str);
                }
            }));
        }
        JSONObject jSONObjectDeserialize2 = JsonUtils.deserialize((String) this.f50276a.a(x4.J4));
        if (JsonUtils.isValid(jSONObjectDeserialize2)) {
            map.putAll(a(jSONObjectDeserialize2, new d() { // from class: com.applovin.impl.sdk.R6
                @Override // com.applovin.impl.sdk.l.d
                public final String a(ContentResolver contentResolver, String str) {
                    return Settings.Secure.getString(contentResolver, str);
                }
            }));
        }
        JSONObject jSONObjectDeserialize3 = JsonUtils.deserialize((String) this.f50276a.a(x4.K4));
        if (JsonUtils.isValid(jSONObjectDeserialize3)) {
            map.putAll(a(jSONObjectDeserialize3, new d() { // from class: com.applovin.impl.sdk.RzR
                @Override // com.applovin.impl.sdk.l.d
                public final String a(ContentResolver contentResolver, String str) {
                    return Settings.Global.getString(contentResolver, str);
                }
            }));
        }
        return map;
    }

    private Float s() {
        Float f3 = (Float) this.f50276a.a(x4.f50808a4);
        Float fB = this.f50276a.p().b();
        if (fB != null) {
            return Float.valueOf(fB.floatValue() * f3.floatValue());
        }
        return null;
    }

    private float t() {
        try {
            return Settings.System.getFloat(this.f50278c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e2) {
            if (!C1804o.a()) {
                return -1.0f;
            }
            this.f50277b.a("DataCollector", "Error collecting font scale", e2);
            return -1.0f;
        }
    }

    private boolean u() {
        SensorManager sensorManager = (SensorManager) this.f50278c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    private Map v() {
        HashMap map = new HashMap();
        CollectionUtils.putIntegerIfValid(Cookie.IABTCF_GDPR_APPLIES, this.f50276a.r0().g(), map);
        CollectionUtils.putStringIfValid(Cookie.IABTCF_TC_STRING, this.f50276a.r0().j(), map);
        CollectionUtils.putStringIfValid("IABTCF_AddtlConsent", this.f50276a.r0().c(), map);
        return map;
    }

    private Boolean w() {
        AudioManager audioManager = (AudioManager) this.f50278c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isMusicActive());
    }

    private Boolean x() {
        AudioManager audioManager = (AudioManager) this.f50278c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    private String y() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f50278c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(0, Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!C1804o.a()) {
                return "";
            }
            this.f50277b.a("DataCollector", "Unable to collect mobile country code", th);
            return "";
        }
    }

    private String z() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f50278c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!C1804o.a()) {
                return "";
            }
            this.f50277b.a("DataCollector", "Unable to collect mobile network code", th);
            return "";
        }
    }

    public String A() {
        return AppLovinSdkUtils.isFireOS(this.f50278c) ? "fireos" : AppLovinBridge.f61290h;
    }

    public Map G() {
        Map map;
        synchronized (this.f50282g) {
            map = CollectionUtils.map(this.f50281f);
        }
        String str = StringUtils.isValidString(f50272j) ? f50272j : this.f50278c.getApplicationInfo().packageName;
        map.put("package_name", str);
        map.put("vz", StringUtils.toShortSHA1Hash(str));
        map.put("first_install", Boolean.valueOf(this.f50276a.C0()));
        map.put("first_install_v2", Boolean.valueOf(!this.f50276a.z0()));
        map.put("test_ads", Boolean.valueOf(this.f50283h));
        map.put("test_mode", Integer.valueOf(this.f50276a.s0().c() ? 1 : 0));
        map.put("muted", Boolean.valueOf(this.f50276a.n0().isMuted()));
        if (((Boolean) this.f50276a.a(x4.A3)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.f50276a.w0().e(), map);
        }
        if (((Boolean) this.f50276a.a(x4.D3)).booleanValue()) {
            map.put("compass_random_token", this.f50276a.u());
        }
        if (((Boolean) this.f50276a.a(x4.f50760F3)).booleanValue()) {
            map.put("applovin_random_token", this.f50276a.h0());
        }
        if (((Boolean) this.f50276a.a(x4.J3)).booleanValue()) {
            map.put("art", this.f50276a.r());
        }
        map.putAll(v());
        CollectionUtils.putStringIfValid("template_browser_package_name", (String) this.f50276a.p0().a(z4.f50999T, null), map);
        return map;
    }

    public b H() {
        return (b) f50275m.get();
    }

    protected String I() {
        String strEncodeToString = Base64.encodeToString(new JSONObject(L()).toString().getBytes(Charset.defaultCharset()), 2);
        return ((Boolean) this.f50276a.a(x4.m5)).booleanValue() ? AbstractC1810u4.b(strEncodeToString, n7.a(this.f50276a), AbstractC1810u4.a.a(((Integer) this.f50276a.a(x4.n5)).intValue()), this.f50276a.i0(), this.f50276a) : strEncodeToString;
    }

    public String K() {
        ActivityManager activityManager = (ActivityManager) this.f50278c.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
    }

    public Map M() {
        Map map;
        synchronized (this.f50282g) {
            map = CollectionUtils.map(this.f50281f);
        }
        return map;
    }

    public Map N() {
        Map map;
        synchronized (this.f50280e) {
            map = CollectionUtils.map(this.f50279d);
        }
        return map;
    }

    public boolean U() {
        return this.f50283h;
    }

    public void Z() {
        d6 d6VarQ0 = this.f50276a.q0();
        o5 o5Var = new o5(this.f50276a, new a());
        d6.b bVar = d6.b.OTHER;
        d6VarQ0.a((AbstractRunnableC1782i5) o5Var, bVar);
        this.f50276a.q0().a((AbstractRunnableC1782i5) new C1797r6(this.f50276a, true, "setDeviceVolume", new Runnable() { // from class: com.applovin.impl.sdk.kO4
            @Override // java.lang.Runnable
            public final void run() {
                this.f50271n.V();
            }
        }), bVar);
    }

    protected void a(final AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.f50276a.q0().a((AbstractRunnableC1782i5) new C1797r6(this.f50276a, ((Boolean) this.f50276a.a(x4.N3)).booleanValue(), "DataCollector", new Runnable() { // from class: com.applovin.impl.sdk.hQ
            @Override // java.lang.Runnable
            public final void run() {
                this.f50195n.b(appLovinBidTokenCollectionListener);
            }
        }), d6.b.CORE);
    }

    public void b0() {
        synchronized (this.f50280e) {
            a(this.f50279d);
        }
        a0();
    }

    public Map e() {
        HashMap map = new HashMap();
        map.put("sc", this.f50276a.a(x4.f50828l));
        map.put("sc2", this.f50276a.a(x4.f50832m));
        map.put("sc3", this.f50276a.a(x4.f50833n));
        map.put("server_installed_at", this.f50276a.a(x4.f50834o));
        CollectionUtils.putStringIfValid("persisted_data", (String) this.f50276a.a(z4.f50987H), map);
        return map;
    }

    public AbstractC1811v.a f() {
        AbstractC1811v.a aVarB = AbstractC1811v.b(this.f50278c);
        if (aVarB == null) {
            return new AbstractC1811v.a();
        }
        if (((Boolean) this.f50276a.a(x4.y3)).booleanValue()) {
            if (aVarB.c() && !((Boolean) this.f50276a.a(x4.x3)).booleanValue()) {
                aVarB.a("");
            }
            f50274l.set(aVarB);
        } else {
            aVarB = new AbstractC1811v.a();
        }
        List<String> testDeviceAdvertisingIds = this.f50276a.J() != null ? this.f50276a.J().getTestDeviceAdvertisingIds() : null;
        if (testDeviceAdvertisingIds == null) {
            this.f50283h = false;
            return aVarB;
        }
        String strA = aVarB.a();
        if (StringUtils.isValidString(strA)) {
            this.f50283h = testDeviceAdvertisingIds.contains(strA);
        }
        b bVarH = H();
        String str = bVarH != null ? bVarH.f50286a : null;
        if (StringUtils.isValidString(str)) {
            this.f50283h = testDeviceAdvertisingIds.contains(str) | this.f50283h;
        }
        return aVarB;
    }

    public Map m() {
        HashMap map = new HashMap();
        c4 c4VarD0 = this.f50276a.d0();
        Deque dequeB = c4VarD0.b();
        if (!CollectionUtils.isEmpty(dequeB)) {
            map.put("network_throughput_info", dequeB);
        }
        CollectionUtils.putLongIfValid("network_throughput_kbps", c4VarD0.a(), map);
        q0.d dVarA = this.f50276a.w().a();
        if (dVarA != null) {
            map.put("lrm_ts_ms", String.valueOf(dVarA.c()));
            map.put("lrm_url", dVarA.d());
            map.put("lrm_ct_ms", String.valueOf(dVarA.a()));
            map.put("lrm_rs", String.valueOf(dVarA.b()));
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    protected l(C1802k c1802k) {
        if (c1802k != null) {
            this.f50276a = c1802k;
            this.f50277b = c1802k.O();
            this.f50278c = C1802k.o();
            this.f50279d = D();
            this.f50281f = C();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    private double E() {
        return Math.round((((double) TimeZone.getDefault().getOffset(new Date().getTime())) * 10.0d) / 3600000.0d) / 10.0d;
    }

    private JSONArray O() {
        if (o0.d()) {
            return CollectionUtils.toJSONArray(Build.SUPPORTED_ABIS);
        }
        JSONArray jSONArray = new JSONArray();
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI);
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI2);
        return jSONArray;
    }

    private Boolean Q() {
        if (o0.i()) {
            return null;
        }
        return Boolean.valueOf(!CollectionUtils.isEmpty(n7.a("/proc/net/tcp", Collections.singletonList(":69A2"), this.f50276a)));
    }

    private boolean R() {
        ConnectivityManager connectivityManager;
        if (o0.f() && (connectivityManager = (ConnectivityManager) this.f50278c.getSystemService("connectivity")) != null) {
            try {
                if (connectivityManager.getRestrictBackgroundStatus() != 3) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                this.f50276a.O();
                if (C1804o.a()) {
                    this.f50276a.O().a("DataCollector", "Unable to collect constrained network info.", th);
                }
            }
        }
        return false;
    }

    private Boolean T() {
        if (!o0.g()) {
            return null;
        }
        return Boolean.valueOf(this.f50278c.getResources().getConfiguration().isScreenHdr());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W() {
        Map mapY = Y();
        List listX = X();
        synchronized (this.f50282g) {
            if (mapY != null) {
                try {
                    this.f50281f.putAll(mapY);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (listX != null) {
                this.f50281f.put(CmcdConfiguration.KEY_DEADLINE, listX);
            }
        }
    }

    private List g() {
        ActivityManager activityManager;
        String packageName = null;
        if (!o0.b()) {
            return null;
        }
        Integer num = (Integer) this.f50276a.a(x4.A4);
        if (num.intValue() < 0 || (activityManager = (ActivityManager) this.f50278c.getSystemService(wDgKoYAES.awWTrz)) == null) {
            return null;
        }
        if (((Boolean) this.f50276a.a(x4.B4)).booleanValue()) {
            packageName = this.f50278c.getPackageName();
        }
        List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(packageName, 0, num.intValue());
        if (CollectionUtils.isEmpty(historicalProcessExitReasons)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons.size());
        Iterator it = historicalProcessExitReasons.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoN = androidx.work.impl.utils.n.n(it.next());
            HashMap map = new HashMap(13);
            int reason = applicationExitInfoN.getReason();
            map.put(JavetError.PARAMETER_REASON, Integer.valueOf(reason));
            String description = applicationExitInfoN.getDescription();
            CollectionUtils.putStringIfValid("description", description, map);
            map.put(StatsEvent.f62824A, Long.valueOf(applicationExitInfoN.getTimestamp()));
            map.put("status", Integer.valueOf(applicationExitInfoN.getStatus()));
            map.put("importance", Integer.valueOf(applicationExitInfoN.getImportance()));
            map.put("pss", Long.valueOf(applicationExitInfoN.getPss()));
            map.put("rss", Long.valueOf(applicationExitInfoN.getRss()));
            CollectionUtils.putStringIfValid("process_name", applicationExitInfoN.getProcessName(), map);
            map.put("pid", Integer.valueOf(applicationExitInfoN.getPid()));
            map.put("ruid", Integer.valueOf(applicationExitInfoN.getRealUid()));
            map.put("puid", Integer.valueOf(applicationExitInfoN.getPackageUid()));
            map.put("duid", Integer.valueOf(applicationExitInfoN.getDefiningUid()));
            String strA = a(applicationExitInfoN, reason);
            if (StringUtils.isValidString(strA)) {
                map.put("stack_trace", strA);
                b(strA, reason, description);
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    private List i() {
        ActivityManager activityManager;
        if (!o0.c()) {
            return null;
        }
        Integer num = (Integer) this.f50276a.a(x4.z4);
        if (num.intValue() >= 0 && (activityManager = (ActivityManager) this.f50278c.getSystemService("activity")) != null) {
            List historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(num.intValue());
            if (CollectionUtils.isEmpty(historicalProcessStartReasons)) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList(historicalProcessStartReasons.size());
            Iterator it = historicalProcessStartReasons.iterator();
            while (it.hasNext()) {
                ApplicationStartInfo applicationStartInfoN = pO.n(it.next());
                HashMap map = new HashMap(11);
                map.put(JavetError.PARAMETER_REASON, Integer.valueOf(applicationStartInfoN.getReason()));
                map.put("startup_state", Integer.valueOf(applicationStartInfoN.getStartupState()));
                map.put("start_type", Integer.valueOf(applicationStartInfoN.getStartType()));
                map.put("was_force_stopped", Boolean.valueOf(applicationStartInfoN.wasForceStopped()));
                map.put("startup_timestamps", applicationStartInfoN.getStartupTimestamps());
                CollectionUtils.putStringIfValid("process_name", applicationStartInfoN.getProcessName(), map);
                map.put("pid", Integer.valueOf(applicationStartInfoN.getPid()));
                map.put("ruid", Integer.valueOf(applicationStartInfoN.getRealUid()));
                map.put("puid", Integer.valueOf(applicationStartInfoN.getPackageUid()));
                map.put("duid", Integer.valueOf(applicationStartInfoN.getDefiningUid()));
                map.put("launch_mode", Integer.valueOf(applicationStartInfoN.getLaunchMode()));
                map.put("intent", a(applicationStartInfoN.getIntent()));
                arrayList.add(map);
            }
            return arrayList;
        }
        return null;
    }

    private long k() {
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        Long l2 = (Long) this.f50276a.a(x4.F4);
        return (jCurrentTimeMillis / l2.longValue()) * l2.longValue();
    }

    private String q() {
        if (!o0.f()) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            LocaleList locales = this.f50278c.getResources().getConfiguration().getLocales();
            for (int i2 = 0; i2 < locales.size(); i2++) {
                sb.append(locales.get(i2));
                sb.append(",");
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    public Map a(Map map, boolean z2, boolean z3) {
        HashMap map2 = new HashMap(64);
        Map mapA = a(z2);
        Map mapG = G();
        Map mapM = m();
        Map mapK0 = this.f50276a.k0();
        if (z3) {
            map2.put("device_info", mapA);
            map2.put("app_info", mapG);
            if (mapM != null) {
                map2.put("connection_info", mapM);
            }
            if (map != null) {
                map2.put("ad_info", map);
            }
            if (!CollectionUtils.isEmpty(mapK0)) {
                map2.put("segments", mapK0);
            }
        } else {
            map2.putAll(mapA);
            map2.putAll(mapG);
            if (mapM != null) {
                map2.putAll(mapM);
            }
            if (map != null) {
                map2.putAll(map);
            }
            if (!CollectionUtils.isEmpty(mapK0)) {
                map2.putAll(mapK0);
            }
        }
        map2.put("accept", "custom_size,launch_app,video");
        map2.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.f50276a.V(), map2);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.f50276a.C(), map2);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.f50276a.a(x4.f50772L3), map2);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.f50276a.t0()), map2);
        if (!((Boolean) this.f50276a.a(x4.k5)).booleanValue()) {
            map2.put("sdk_key", this.f50276a.i0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.f50276a.q(), map2);
        map2.putAll(e());
        map2.put(com.safedk.android.analytics.brandsafety.l.f62669x, UUID.randomUUID().toString());
        return map2;
    }

    private boolean c() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i2 = 0; i2 < 9; i2++) {
            if (new File(c(strArr[i2])).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long d() {
        long j2;
        int iB;
        int iB2;
        int iB3;
        long j3;
        long j4;
        long j5;
        String strEmptyIfNull = StringUtils.emptyIfNull(Settings.Secure.getString(this.f50278c.getContentResolver(), "enabled_accessibility_services"));
        long j6 = strEmptyIfNull.contains("AccessibilityMenuService") ? 256L : 0L;
        if (strEmptyIfNull.contains("SelectToSpeakService")) {
            j6 |= 512;
        }
        if (strEmptyIfNull.contains("SoundAmplifierService")) {
            j6 |= 2;
        }
        if (strEmptyIfNull.contains("SpeechToTextAccessibilityService")) {
            j6 |= 128;
        }
        if (strEmptyIfNull.contains("SwitchAccessService")) {
            j6 |= 4;
        }
        if ((this.f50278c.getResources().getConfiguration().uiMode & 48) == 32) {
            j6 |= 1024;
        }
        if (a("accessibility_enabled")) {
            j6 |= 8;
        }
        if (a("touch_exploration_enabled")) {
            j6 |= 16;
        }
        if (o0.d()) {
            if (a("accessibility_display_inversion_enabled")) {
                j6 |= 32;
            }
            if (a("skip_first_use_hints")) {
                j6 |= 64;
            }
        }
        if (a("lock_screen_allow_remote_input")) {
            j6 |= 2048;
        }
        if (a("enabled_accessibility_audio_description_by_default")) {
            j6 |= 4096;
        }
        if (a("accessibility_shortcut_on_lock_screen")) {
            j6 |= 8192;
        }
        if (a("wear_talkback_enabled")) {
            j6 |= 16384;
        }
        if (a("hush_gesture_used")) {
            j6 |= 32768;
        }
        if (a("high_text_contrast_enabled")) {
            j6 |= 65536;
        }
        if (a("accessibility_display_magnification_enabled")) {
            j6 |= 131072;
        }
        if (a("accessibility_display_magnification_navbar_enabled")) {
            j6 |= 262144;
        }
        if (a("accessibility_captioning_enabled")) {
            j6 |= 524288;
        }
        if (a("accessibility_display_daltonizer_enabled")) {
            j6 |= 1048576;
        }
        if (a("accessibility_autoclick_enabled")) {
            j6 |= 2097152;
        }
        if (a("accessibility_large_pointer_icon")) {
            j6 |= 4194304;
        }
        if (a("reduce_bright_colors_activated")) {
            j6 |= 8388608;
        }
        if (a("reduce_bright_colors_persist_across_reboots")) {
            j6 |= 16777216;
        }
        if (a("tty_mode_enabled")) {
            j6 |= 33554432;
        }
        if (a("rtt_calling_mode")) {
            j6 |= 67108864;
        }
        if (a("accessibility_floating_menu_fade_enabled")) {
            j6 |= 134217728;
        }
        if (a("accessibility_show_window_magnification_prompt")) {
            j6 |= 268435456;
        }
        if (a("accessibility_floating_menu_migration_tooltip_prompt")) {
            j6 |= 536870912;
        }
        int iB4 = b("accessibility_magnification_mode");
        if (iB4 == 0) {
            j2 = 1073741824;
        } else if (iB4 == 1) {
            j2 = 2147483648L;
        } else {
            if (iB4 != 2) {
                if (iB4 == 3) {
                    j2 = 8589934592L;
                }
                iB = b("accessibility_button_mode");
                if (iB == 0) {
                    j5 = iB == 1 ? 34359738368L : 17179869184L;
                    iB2 = b("accessibility_floating_menu_size");
                    if (iB2 != 0) {
                        j4 = iB2 == 1 ? 137438953472L : 68719476736L;
                        iB3 = b("accessibility_floating_menu_icon_type");
                        if (iB3 != 0) {
                            j3 = 274877906944L;
                        } else {
                            if (iB3 != 1) {
                                return j6;
                            }
                            j3 = 549755813888L;
                        }
                        return j6 | j3;
                    }
                    j6 |= j4;
                    iB3 = b("accessibility_floating_menu_icon_type");
                    if (iB3 != 0) {
                    }
                    return j6 | j3;
                }
                j6 |= j5;
                iB2 = b("accessibility_floating_menu_size");
                if (iB2 != 0) {
                }
                j6 |= j4;
                iB3 = b("accessibility_floating_menu_icon_type");
                if (iB3 != 0) {
                }
                return j6 | j3;
            }
            j2 = 4294967296L;
        }
        j6 |= j2;
        iB = b("accessibility_button_mode");
        if (iB == 0) {
        }
        j6 |= j5;
        iB2 = b("accessibility_floating_menu_size");
        if (iB2 != 0) {
        }
        j6 |= j4;
        iB3 = b("accessibility_floating_menu_icon_type");
        if (iB3 != 0) {
        }
        return j6 | j3;
    }

    private List b(PackageInfo packageInfo) {
        FeatureInfo[] featureInfoArr;
        if (packageInfo == null || (featureInfoArr = packageInfo.reqFeatures) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FeatureInfo featureInfo : featureInfoArr) {
            arrayList.add(featureInfo.name);
        }
        return arrayList;
    }

    private String c(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = str.charAt(i2);
            for (int i3 = 9; i3 >= 0; i3--) {
                cArr[i2] = (char) (cArr[i2] ^ iArr[i3]);
            }
        }
        return new String(cArr);
    }

    private void b(final String str, final int i2, final String str2) {
        this.f50276a.q0().a((AbstractRunnableC1782i5) new C1797r6(this.f50276a, "reportAppExitInfoStackTrace", new Runnable() { // from class: com.applovin.impl.sdk.pq
            @Override // java.lang.Runnable
            public final void run() {
                this.f50458n.a(str, i2, str2);
            }
        }), d6.b.OTHER);
    }

    private int b(String str) {
        try {
            return Settings.Secure.getInt(this.f50278c.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private boolean b() {
        String str = Build.TAGS;
        return str != null && str.contains(c("lz}$blpz"));
    }

    private Map a(boolean z2) {
        Map map;
        synchronized (this.f50280e) {
            map = CollectionUtils.map(this.f50279d);
        }
        return a(map, z2);
    }

    private void a(Map map) {
        JSONArray jSONArrayF;
        if (((Boolean) this.f50276a.a(x4.U3)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(d()));
        }
        if (((Boolean) this.f50276a.a(x4.V3)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(t()));
        }
        if (((Boolean) this.f50276a.a(x4.c4)).booleanValue() && n7.d(this.f50276a)) {
            n8.a(this.f50276a);
        }
        if (((Boolean) this.f50276a.a(x4.n4)).booleanValue()) {
            n8.b(this.f50276a);
        }
        if (((Boolean) this.f50276a.a(x4.b4)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (((Boolean) this.f50276a.a(x4.X3)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", Boolean.valueOf(R()));
        }
        map.put("is_pc", Boolean.valueOf(S()));
        if (((Boolean) this.f50276a.a(x4.p4)).booleanValue()) {
            CollectionUtils.putStringIfValid("oglv", K(), map);
        }
        if (((Boolean) this.f50276a.a(x4.K6)).booleanValue()) {
            CollectionUtils.putStringIfValid("dbpn", o(), map);
        }
        if (!((Boolean) this.f50276a.a(x4.L6)).booleanValue() || map.containsKey("video_decoders") || (jSONArrayF = F()) == null || jSONArrayF.length() <= 0) {
            return;
        }
        map.put("video_decoders", jSONArrayF);
    }

    private Map a(Map map, boolean z2) {
        AbstractC1811v.a aVarF;
        PowerManager powerManager;
        Map map2 = CollectionUtils.map(map);
        Point pointB = o0.b(this.f50278c);
        map2.put("dx", Integer.valueOf(pointB.x));
        map2.put("dy", Integer.valueOf(pointB.y));
        DisplayMetrics displayMetrics = this.f50278c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            map2.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow(pointB.x, 2.0d) + Math.pow(pointB.y, 2.0d)) / ((double) displayMetrics.xdpi)));
        }
        map2.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.f50278c)));
        if (((Boolean) this.f50276a.a(x4.E4)).booleanValue()) {
            String strB = n7.b(this.f50278c);
            Map mapA = o0.a(strB);
            if (mapA != null) {
                map2.put("display_cutout_insets", mapA);
            }
            Map mapC = o0.c(strB);
            if (mapC != null) {
                map2.put("status_bar_insets", mapC);
            }
            Map mapB = o0.b(strB);
            if (mapB != null) {
                map2.put("nav_bar_insets", mapB);
            }
        }
        if (z2) {
            aVarF = (AbstractC1811v.a) f50274l.get();
            if (aVarF != null) {
                Z();
            } else if (n7.i()) {
                aVarF = new AbstractC1811v.a();
                map2.put("inc", Boolean.TRUE);
            } else {
                aVarF = f();
            }
        } else {
            aVarF = f();
        }
        String strA = aVarF.a();
        if (StringUtils.isValidString(strA)) {
            map2.put("idfa", strA);
        }
        map2.put("dnt", Boolean.valueOf(aVarF.c()));
        map2.put("dnt_code", aVarF.b().b());
        b bVar = (b) f50275m.get();
        if (((Boolean) this.f50276a.a(x4.z3)).booleanValue() && bVar != null) {
            map2.put("idfv", bVar.f50286a);
            map2.put("idfv_scope", Integer.valueOf(bVar.f50287b));
        }
        Boolean boolB = p0.b().b(this.f50278c);
        if (boolB != null) {
            map2.put("huc", boolB);
        }
        Boolean boolB2 = p0.c().b(this.f50278c);
        if (boolB2 != null) {
            map2.put("aru", boolB2);
        }
        Boolean boolB3 = p0.a().b(this.f50278c);
        if (boolB3 != null) {
            map2.put("dns", boolB3);
        }
        if (((Boolean) this.f50276a.a(x4.O3)).booleanValue()) {
            c cVarJ = j();
            CollectionUtils.putIntegerIfValid("act", Integer.valueOf(cVarJ.f50288a), map2);
            CollectionUtils.putIntegerIfValid("acm", Integer.valueOf(cVarJ.f50289b), map2);
            CollectionUtils.putBooleanIfValid("sowpie", cVarJ.f50290c, map2);
        }
        if (((Boolean) this.f50276a.a(x4.f50800W3)).booleanValue()) {
            map2.put("mtl", Integer.valueOf(this.f50276a.m0().getLastTrimMemoryLevel()));
        }
        if (((Boolean) this.f50276a.a(x4.Z3)).booleanValue()) {
            map2.put(com.safedk.android.analytics.brandsafety.l.f62622C, Boolean.valueOf(P()));
        }
        Float fS = z2 ? (Float) this.f50284i.get() : s();
        if (fS != null) {
            map2.put("volume", fS);
        }
        CollectionUtils.putBooleanIfValid("ma", w(), map2);
        CollectionUtils.putBooleanIfValid("spo", x(), map2);
        CollectionUtils.putBooleanIfValid("aif", Boolean.valueOf(!this.f50276a.m0().isApplicationPaused()), map2);
        CollectionUtils.putLongIfValid("af_ts_ms", Long.valueOf(this.f50276a.m0().getAppEnteredForegroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("ab_ts_ms", Long.valueOf(this.f50276a.m0().getAppEnteredBackgroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("abd_ms", Long.valueOf(this.f50276a.m0().getTotalBackgroundDurationMillis()), map2);
        try {
            map2.put("sb", Integer.valueOf((int) ((Settings.System.getInt(this.f50278c.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)));
        } catch (Settings.SettingNotFoundException e2) {
            if (C1804o.a()) {
                this.f50277b.a("DataCollector", "Unable to collect screen brightness", e2);
            }
        }
        if (((Boolean) this.f50276a.a(x4.c4)).booleanValue() && n7.d(this.f50276a)) {
            n8.a(this.f50276a);
            String strA2 = n8.a();
            if (StringUtils.isValidString(strA2)) {
                map2.put("ua", strA2);
            }
        }
        if (((Boolean) this.f50276a.a(x4.n4)).booleanValue()) {
            n8.b(this.f50276a);
            CollectionUtils.putIntegerIfValid("wvvc", Integer.valueOf(n8.d()), map2);
            CollectionUtils.putStringIfValid("wvv", n8.c(), map2);
            CollectionUtils.putStringIfValid("wvpn", n8.b(), map2);
        }
        if (((Boolean) this.f50276a.a(x4.Q3)).booleanValue()) {
            try {
                map2.put("fs", Long.valueOf(Environment.getDataDirectory().getFreeSpace()));
                map2.put("tds", Long.valueOf(Environment.getDataDirectory().getTotalSpace()));
            } catch (Throwable th) {
                map2.put("fs", -1);
                map2.put("tds", -1);
                if (C1804o.a()) {
                    this.f50277b.a("DataCollector", "Unable to collect total & free space.", th);
                }
            }
        }
        if (((Boolean) this.f50276a.a(x4.R3)).booleanValue()) {
            ActivityManager.MemoryInfo memoryInfoA = n7.a((ActivityManager) this.f50278c.getSystemService("activity"));
            if (memoryInfoA != null) {
                map2.put("fm", Long.valueOf(memoryInfoA.availMem));
                map2.put("tm", Long.valueOf(memoryInfoA.totalMem));
                map2.put("lmt", Long.valueOf(memoryInfoA.threshold));
                map2.put("lm", Boolean.valueOf(memoryInfoA.lowMemory));
            } else {
                map2.put("fm", -1);
                map2.put("tm", -1);
                map2.put("lmt", -1);
            }
        }
        if (((Boolean) this.f50276a.a(x4.f50792S3)).booleanValue() && o0.a("android.permission.READ_PHONE_STATE", this.f50278c) && o0.f()) {
            map2.put("rat", Integer.valueOf(((TelephonyManager) this.f50278c.getSystemService("phone")).getDataNetworkType()));
        }
        if (((Boolean) this.f50276a.a(x4.f50782P3)).booleanValue()) {
            String strB2 = B();
            if (!TextUtils.isEmpty(strB2)) {
                map2.put("so", strB2);
            }
        }
        map2.put(BrandSafetyEvent.f62730aw, n7.b(this.f50278c));
        map2.put("orientation_lock", h());
        if (((Boolean) this.f50276a.a(x4.T3)).booleanValue()) {
            map2.put("vs", Boolean.valueOf(n7.k()));
        }
        if (o0.d() && (powerManager = (PowerManager) this.f50278c.getSystemService("power")) != null) {
            map2.put("lpm", Integer.valueOf(powerManager.isPowerSaveMode() ? 1 : 0));
        }
        if (((Boolean) this.f50276a.a(x4.e4)).booleanValue() && this.f50276a.l0() != null) {
            map2.put("da", Float.valueOf(this.f50276a.l0().a()));
        }
        if (((Boolean) this.f50276a.a(x4.f4)).booleanValue() && this.f50276a.l0() != null) {
            map2.put("dm", Float.valueOf(this.f50276a.l0().b()));
        }
        map2.put("mute_switch", Integer.valueOf(this.f50276a.p().c()));
        map2.put(com.safedk.android.analytics.events.a.f62814d, r0.g(this.f50276a));
        String strQ = q();
        if (StringUtils.isValidString(strQ)) {
            map2.put("kb", strQ);
        }
        Map mapR = r();
        if (!CollectionUtils.isEmpty(mapR)) {
            map2.put("ds", mapR);
        }
        return map2;
    }

    private List a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (Signature signature : signatureArr) {
                messageDigest.update(signature.toByteArray());
                arrayList.add(StringUtils.toHexString(messageDigest.digest()));
            }
        } catch (Throwable th) {
            this.f50276a.D().b("DataCollector", "parseSignatures", th);
        }
        return arrayList;
    }

    private List a(PackageInfo packageInfo) {
        InstrumentationInfo[] instrumentationInfoArr;
        if (packageInfo == null || (instrumentationInfoArr = packageInfo.instrumentation) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InstrumentationInfo instrumentationInfo : instrumentationInfoArr) {
            HashMap map = new HashMap();
            map.put(AppMeasurementSdk.ConditionalUserProperty.NAME, instrumentationInfo.name);
            map.put("hp", Boolean.valueOf(instrumentationInfo.handleProfiling));
            map.put("ft", Boolean.valueOf(instrumentationInfo.functionalTest));
            map.put("t_pa", instrumentationInfo.targetPackage);
            if (o0.g()) {
                map.put("t_pr", instrumentationInfo.targetProcesses);
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    private Map a(Intent intent) {
        if (intent == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(5);
        map.put(FileUploadManager.f61572j, StringUtils.emptyIfNull(intent.getAction()));
        map.put("data", StringUtils.emptyIfNull(intent.getDataString()));
        map.put("flags", Integer.valueOf(intent.getFlags()));
        ComponentName component = intent.getComponent();
        map.put("component", component != null ? component.flattenToString() : "");
        Set<String> categories = intent.getCategories();
        map.put("categories", categories != null ? new ArrayList(categories) : Collections.EMPTY_LIST);
        return map;
    }

    private String a(ApplicationExitInfo applicationExitInfo, int i2) {
        InputStream traceInputStream;
        String line;
        if (this.f50276a.c(x4.D4).contains(Integer.toString(i2))) {
            return null;
        }
        Integer num = (Integer) this.f50276a.a(x4.C4);
        if (num.intValue() <= 0) {
            return null;
        }
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
        } catch (Throwable th) {
            this.f50276a.O();
            if (C1804o.a()) {
                this.f50276a.O().a("DataCollector", "Failed to obtain trace input stream from application exit info", th);
            }
            this.f50276a.D().b("DataCollector", "getTraceInputStream", th);
            traceInputStream = null;
        }
        if (traceInputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream));
            for (int i3 = 0; i3 < num.intValue() && (line = bufferedReader.readLine()) != null; i3++) {
                try {
                    sb.append(line);
                    sb.append('\n');
                } finally {
                }
            }
            bufferedReader.close();
        } catch (Throwable th2) {
            this.f50276a.O();
            if (C1804o.a()) {
                this.f50276a.O().a("DataCollector", "Failed to read stack trace from input stream", th2);
            }
            this.f50276a.D().b("DataCollector", "readStackTraceFromInputStream", th2);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, int i2, String str2) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", str);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(i2), mapHashMap);
        CollectionUtils.putStringIfValid("error_message", str2, mapHashMap);
        this.f50276a.D().d(d2.G0, mapHashMap);
    }

    public static void a(AbstractC1811v.a aVar) {
        f50274l.set(aVar);
    }

    public static void a(b bVar) {
        f50275m.set(bVar);
    }

    public static void a(String str, C1802k c1802k) {
        String strA = a(C1802k.o().getApplicationInfo().packageName, C1802k.o().getPackageManager(), c1802k);
        List listC = c1802k.c(x4.X6);
        if (!StringUtils.isValidString(strA) || listC.contains(strA)) {
            f50272j = str;
        }
    }

    private boolean a(String str) {
        return b(str) == 1;
    }

    private Map a(JSONObject jSONObject, d dVar) {
        ContentResolver contentResolver = this.f50278c.getContentResolver();
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string = JsonUtils.getString(jSONObject, next, null);
            if (StringUtils.isValidString(string)) {
                map.put(next, StringUtils.emptyIfNull(a(dVar, contentResolver, string)));
            }
        }
        return map;
    }

    private String a(d dVar, ContentResolver contentResolver, String str) {
        try {
            return dVar.a(contentResolver, str);
        } catch (Throwable th) {
            this.f50276a.D().a(HrvQKfmFZJudBc.MPvusrGy, "retrieveSystemSettingValue", th, CollectionUtils.hashMap("details", str));
            return null;
        }
    }

    private String a(String str, PackageManager packageManager) {
        if (!o0.b()) {
            return null;
        }
        try {
            return packageManager.getInstallSourceInfo(str).getOriginatingPackageName();
        } catch (Throwable th) {
            this.f50276a.D().b("DataCollector", "getOriginatingName", th);
            return null;
        }
    }

    private static String a(String str, PackageManager packageManager, C1802k c1802k) {
        try {
            if (((Boolean) c1802k.a(x4.x4)).booleanValue() && o0.b()) {
                return packageManager.getInstallSourceInfo(str).getInstallingPackageName();
            }
            return packageManager.getInstallerPackageName(str);
        } catch (Throwable th) {
            c1802k.D().b("DataCollector", "getInstallerName", th);
            return null;
        }
    }
}
