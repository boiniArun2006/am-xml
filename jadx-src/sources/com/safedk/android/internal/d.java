package com.safedk.android.internal;

import android.os.Bundle;
import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.SdksMapping;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f62961A = "disableWebViewTracking";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f62962B = "imageMimeTypesList";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f62963C = "videoMimeTypesList";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f62964D = "audioMimeTypesList";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f62965E = "maxBannerUniformPixelsPercentageToStopSampling";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f62966F = "minBannerUniformPixelsPercentageForUniformImage";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String f62967G = "maxAttemptsToCaptureBannerImage";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final String f62968H = "bannerImageSamplingInterval";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final String f62969I = "bannerDimensionsMaxSize";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final String f62970J = "isBannersEnabled";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final String f62971L = "https://edge.safedk.com";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final String f62972M = "https://edge.safedk.com";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final long f62973N = 1200000;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f62974O = 20;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final String f62975P = "apng;bmp;gif;x-icon;x-icon;png;svg+xml;tiff";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final String f62976Q = "wave;wav;x-wav;x-pn-wav;webm;ogg;";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final String f62977R = "webViewAnalysisIntervals";

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final String f62978S = "webViewVideoObserverIntervals";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final List<Integer> f62979T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static List<Integer> f62980U = null;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String f62981V = "bannersWebViewAnalysisIntervals";

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final List<Integer> f62982W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static List<Integer> f62983X = null;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final List<Integer> f62984Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static List<Integer> f62985Z = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f62986a = 300;
    private static final int aH = 8192;
    private static final int aJ = 540;

    /* JADX INFO: renamed from: aL, reason: collision with root package name */
    private static final float f62987aL = 2.5f;
    private static final float aN = 40.0f;

    /* JADX INFO: renamed from: aP, reason: collision with root package name */
    private static final float f62988aP = 90.0f;
    private static final int aR = 5;

    /* JADX INFO: renamed from: aT, reason: collision with root package name */
    private static final int f62989aT = 25000;
    private static final boolean aV = false;
    private static final int aX = 10000;
    private static final int aZ = 15000;
    public static List<Integer> aa = null;
    public static final String ab = "webViewMergeNetworkResources";
    private static final String ac = "SafeDKConfiguration";
    private static final String ad = "settings";
    private static final String ae = "android";
    private static final String af = "images";
    private static final String ag = "banners";
    private static final String ah = "adCaching";
    private static final String ai = "general";
    private static final String aj = "timers";

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private static final String f62990ak = "redirectClickTimeout";
    private static final String al = "sdkSpecificMinUniformPixelsPercentageForUniformImage";
    private static final String am = "sdkSpecificCachedCIMaxAge";
    private static final String an = "sdkSpecificCachedCIExpiration";

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    private static final String f62991ao = "handleSVForPC";
    private static final int ap = 30000;
    private static final int aq = 30000;
    private static final int ar = 15000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f62992b = 5000;

    /* JADX INFO: renamed from: bA, reason: collision with root package name */
    private static final boolean f62993bA = true;
    private static final boolean bC = true;
    private static final boolean bG = true;
    private static final String bI = "maxFileItemsToStoreOnDevice";
    private static final int bJ = 40;

    /* JADX INFO: renamed from: bK, reason: collision with root package name */
    private static int f62994bK = 0;
    private static final String bL = "mur";
    private static boolean bM = false;
    private static final int bb = 15000;
    private static final boolean bd = true;
    private static final int bn = 100;
    private static final float bq = 40.0f;
    private static final float bs = 90.0f;
    private static final int bu = 5;
    private static final int bw = 2;
    private static final int by = 480;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f62995c = 500;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f62996d = "minValidImageSize";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f62997e = "interstitialDimensionsMaxSize";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f62998f = "idsf";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f62999g = "maxUniformPixelsPercentageToStopSampling";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f63000h = "maxImagesToStoreOnDevice";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f63001i = "minImageSizeToStopSampling";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f63002j = "minUniformPixelsPercentageForUniformImage";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f63003k = "awsUploadTimeout";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f63004l = "resolveUrlTimeout";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f63005m = "clickValidityTimeout";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f63006n = "interstitialActivitiesToInclude";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f63007o = "interstitialActivitiesToExclude";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f63008p = "edgeServerUrl";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f63009q = "backupEdgeServerUrl";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f63010r = "devicesWithDebugLog";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f63011s = "cachedCreativeInfoMaxAge";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f63012t = "cachedMaxNumberOfItems";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f63013u = "cachedNumberOfItemsThreshold";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f63014v = "cacheSupportingSdkUUIDs";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f63015w = "safeDKDeactivation";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f63016x = "activePercentage";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f63017y = "deactivated";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f63018z = "alwaysTakeScreenshot";

    /* JADX INFO: renamed from: as, reason: collision with root package name */
    private boolean f63025as = false;
    private int at = f62986a;
    private boolean au = false;
    private int av = 5000;

    /* JADX INFO: renamed from: aw, reason: collision with root package name */
    private int f63026aw = 500;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f63019K = 30000;
    private int ax = 30000;
    private int ay = 15000;
    private boolean az = false;
    private boolean aA = true;

    /* JADX INFO: renamed from: aB, reason: collision with root package name */
    private boolean f63020aB = false;

    /* JADX INFO: renamed from: aC, reason: collision with root package name */
    private boolean f63021aC = false;

    /* JADX INFO: renamed from: aD, reason: collision with root package name */
    private JSONObject f63022aD = new JSONObject();
    private JSONObject aE = new JSONObject();

    /* JADX INFO: renamed from: aF, reason: collision with root package name */
    private ArrayList<String> f63023aF = new ArrayList<>(Arrays.asList(com.safedk.android.utils.h.f63164d, com.safedk.android.utils.h.f63162b, com.safedk.android.utils.h.f63181u, com.safedk.android.utils.h.f63186z, com.safedk.android.utils.h.f63175o));
    private boolean aG = false;
    private int aI = 8192;
    private int aK = aJ;
    private float aM = f62987aL;

    /* JADX INFO: renamed from: aO, reason: collision with root package name */
    private float f63024aO = 40.0f;
    private float aQ = 90.0f;
    private int aS = 5;
    private long aU = 25000;
    private boolean aW = false;
    private int aY = 10000;
    private int ba = 15000;
    private int bc = 15000;
    private boolean be = true;
    private ArrayList<String> bf = new ArrayList<>();
    private ArrayList<String> bg = new ArrayList<>();
    private String bh = "https://edge.safedk.com";
    private String bi = "https://edge.safedk.com";
    private ArrayList<String> bj = new ArrayList<>();
    private ArrayList<String> bk = new ArrayList<>();
    private long bl = f62973N;
    private int bm = 20;
    private int bo = 100;
    private final boolean bp = false;
    private float br = 40.0f;
    private float bt = 90.0f;
    private int bv = 5;
    private int bx = 2;
    private int bz = by;
    private boolean bB = true;
    private boolean bD = true;
    private List<String> bE = Arrays.asList(f62975P.split(";"));

    /* JADX INFO: renamed from: bF, reason: collision with root package name */
    private List<String> f63027bF = Arrays.asList(f62976Q.split(";"));

    /* JADX INFO: renamed from: bH, reason: collision with root package name */
    private boolean f63028bH = true;
    private boolean bN = false;

    public int a() {
        return this.f63019K;
    }

    public int b() {
        return this.ax;
    }

    public int c() {
        return this.ay;
    }

    public boolean d() {
        return this.aG;
    }

    public int e() {
        return this.aI;
    }

    public int f() {
        return this.aK;
    }

    public float g() {
        return this.aM;
    }

    public float h() {
        return this.f63024aO;
    }

    public float i() {
        return this.aQ;
    }

    public boolean j() {
        return this.aW;
    }

    public int k() {
        return this.aS;
    }

    public long l() {
        return this.aU;
    }

    public int m() {
        return this.aY;
    }

    public int n() {
        return this.ba;
    }

    public boolean o() {
        return this.f63028bH;
    }

    public int p() {
        return this.bc;
    }

    public boolean q() {
        return this.be;
    }

    public float r() {
        return this.br;
    }

    public float s() {
        return this.bt;
    }

    public int t() {
        return this.bv;
    }

    public int u() {
        return this.bx;
    }

    public int v() {
        return this.bz;
    }

    public boolean w() {
        return this.bB;
    }

    public boolean x() {
        return this.bD;
    }

    public List<String> y() {
        return this.bE;
    }

    public List<String> z() {
        return this.f63027bF;
    }

    static {
        List<Integer> listAsList = Arrays.asList(0, 2, 4, 8, 16, 32, 64);
        f62979T = listAsList;
        f62980U = listAsList;
        List<Integer> listAsList2 = Arrays.asList(0, 2, 4, 8, 16, 32, 64);
        f62982W = listAsList2;
        f62983X = listAsList2;
        List<Integer> listAsList3 = Arrays.asList(0, 2, 4, 8, 16, 32, 64);
        f62984Y = listAsList3;
        f62985Z = f62979T;
        aa = listAsList3;
        f62994bK = 40;
        bM = false;
    }

    public static int A() {
        return f62994bK;
    }

    public static List<Integer> B() {
        return f62980U;
    }

    public static List<Integer> C() {
        return f62983X;
    }

    public static List<Integer> D() {
        return f62985Z;
    }

    public static List<Integer> E() {
        return aa;
    }

    public void a(boolean z2) {
        this.bN = z2;
    }

    public boolean F() {
        return this.f63021aC;
    }

    public boolean G() {
        return !this.bN;
    }

    public void b(boolean z2) {
        this.f63025as = z2;
    }

    public boolean H() {
        return this.f63025as;
    }

    public int I() {
        return this.at;
    }

    public void a(int i2) {
        this.av = i2;
    }

    public void b(int i2) {
        this.f63026aw = i2;
    }

    public boolean J() {
        return this.az;
    }

    public boolean K() {
        return this.au;
    }

    public int L() {
        return this.av;
    }

    public int M() {
        return this.f63026aw;
    }

    public JSONObject N() {
        return this.f63022aD;
    }

    public JSONObject O() {
        return this.aE;
    }

    public Set<String> P() {
        return new HashSet(this.bj);
    }

    public boolean Q() {
        return this.f63020aB;
    }

    public int R() {
        return this.bo;
    }

    public boolean S() {
        return bM;
    }

    public boolean a(Bundle bundle, boolean z2) {
        ArrayList<String> arrayList;
        Object[] objArr = new Object[2];
        objArr[0] = "parseSettings started , bundle : ";
        objArr[1] = bundle == null ? V8ValueNull.NULL : bundle.toString();
        Logger.d(ac, objArr);
        Bundle bundle2 = bundle.getBundle(ad);
        if (bundle2 == null) {
            if (z2) {
                Logger.e(ac, "Settings bundle is null, cannot parse settings. Saved settings will be used");
            }
            return false;
        }
        Logger.d(ac, "parseSettings starting DEACTIVATION");
        if (bundle2.containsKey(f63015w)) {
            Bundle bundle3 = bundle2.getBundle(f63015w);
            if (bundle3.containsKey(KfLR.rxWEfw)) {
                boolean z3 = bundle3.getBoolean(f63017y, false);
                this.bN = z3;
                Logger.d(ac, "parseSettings deactivated ", Boolean.valueOf(z3));
            } else {
                this.bN = false;
            }
            if (bundle3.containsKey(f63016x)) {
                int i2 = (int) bundle3.getDouble(f63016x, 100.0d);
                this.bo = i2;
                Logger.d(ac, "parseSettings activePercentage ", Integer.valueOf(i2));
            } else {
                this.bo = 100;
            }
            if (!this.bN && this.bo != 100) {
                Logger.d(ac, "Checking active percentage");
                boolean z4 = !a(Double.valueOf(this.bo), SafeDK.getInstance().getUserId());
                this.bN = z4;
                Logger.d(ac, "After active percentage deactivated=", Boolean.valueOf(z4));
            }
        } else {
            this.bN = false;
            this.bo = 100;
            Logger.d(ac, "parseSettings SAFE_DK_DEACTIVATION settings block does not exist. Default configuration values will be used.");
        }
        float fFloatValue = f62987aL;
        int i3 = 4;
        char c2 = 3;
        if (bundle2 != null && bundle2.containsKey(af)) {
            Bundle bundle4 = bundle2.getBundle(af);
            Logger.d(ac, "parseSettings starting IMAGES : ", bundle4.toString());
            if (bundle4.containsKey(f62996d)) {
                int i5 = bundle4.getInt(f62996d, 8192);
                this.aI = i5;
                Logger.d(ac, "parseSettings minValidImageSize ", Integer.valueOf(i5));
            } else {
                this.aI = 8192;
            }
            if (bundle4.containsKey(f62997e)) {
                int i7 = bundle4.getInt(f62997e, aJ);
                this.aK = i7;
                Logger.d(ac, "parseSettings interstitialDimensionsMaxSize ", Integer.valueOf(i7));
            } else {
                this.aK = aJ;
            }
            if (bundle4.containsKey(f62998f)) {
                Object obj = bundle4.get(f62998f);
                if (obj instanceof Number) {
                    fFloatValue = ((Number) obj).floatValue();
                }
                this.aM = fFloatValue;
                Logger.d(ac, "parseSettings ", f62998f, " ", Float.valueOf(fFloatValue));
            } else {
                this.aM = f62987aL;
            }
            if (!bundle4.containsKey(f62999g)) {
                this.f63024aO = 40.0f;
            } else {
                float f3 = (float) bundle4.getDouble(f62999g, 40.0d);
                this.f63024aO = f3;
                Logger.d(ac, "parseSettings maxUniformPixelsPercentageToStopSampling ", Float.valueOf(f3));
            }
            if (!bundle4.containsKey(f63000h)) {
                this.aS = 5;
            } else {
                int i8 = bundle4.getInt(f63000h, 5);
                this.aS = i8;
                Logger.d(ac, "parseSettings maxImagesToStoreOnDevice ", Integer.valueOf(i8));
            }
            if (!bundle4.containsKey(f63001i)) {
                this.aU = 25000L;
            } else {
                long j2 = bundle4.getInt(f63001i, 25000);
                this.aU = j2;
                Logger.d(ac, "parseSettings minImageSizeToStopSampling ", Long.valueOf(j2));
            }
            if (bundle4.containsKey(f63002j)) {
                float f4 = (float) bundle4.getDouble(f63002j, 90.0d);
                this.aQ = f4;
                Logger.d(ac, "parseSettings minUniformPixelsPercentageForUniformImage ", Float.valueOf(f4));
                CreativeInfoManager.a(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, this.aQ);
            }
            if (bundle4.containsKey(f63018z)) {
                boolean z5 = bundle4.getBoolean(f63018z, false);
                this.aW = z5;
                Logger.d(ac, "parseSettings alwaysTakeScreenshot ", Boolean.valueOf(z5));
            } else {
                this.aW = false;
            }
            if (bundle4.containsKey(f62991ao)) {
                boolean z6 = bundle4.getBoolean(f62991ao, true);
                this.be = z6;
                Logger.d(ac, "parseSettings handleSVForPC ", Boolean.valueOf(z6));
            } else {
                this.be = true;
            }
            try {
                if (bundle4.containsKey(al)) {
                    Logger.d(ac, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage ", bundle4.getBundle(al));
                    Bundle bundle5 = bundle4.getBundle(al);
                    for (String str : bundle5.keySet()) {
                        Object[] objArr2 = new Object[i3];
                        objArr2[0] = "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage key = ";
                        objArr2[1] = str;
                        objArr2[2] = ", value = ";
                        objArr2[c2] = Double.valueOf(bundle5.getDouble(str));
                        Logger.d(ac, objArr2);
                        double d2 = bundle5.getDouble(str);
                        String sdkPackageByPackageUUID = SdksMapping.getSdkPackageByPackageUUID(str);
                        if (sdkPackageByPackageUUID != null) {
                            Logger.d(ac, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage identified UUID = ", str, ", sdkPackageName = ", sdkPackageByPackageUUID, ", value = ", Double.valueOf(d2));
                            com.safedk.android.analytics.brandsafety.creatives.b bVarK = CreativeInfoManager.k(sdkPackageByPackageUUID);
                            if (bVarK != null) {
                                float f5 = (float) d2;
                                bVarK.a(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, f5);
                                Logger.d(ac, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage UUID = ", str, ", sdkPackageName = ", sdkPackageByPackageUUID, ", value = ", Float.valueOf(f5));
                            }
                        }
                        c2 = 3;
                        i3 = 4;
                    }
                }
            } catch (Throwable th) {
                Logger.d(ac, "parseSettings sdkSpecificMinUniformPixelsPercentageForUniformImage Exception : ", th.getMessage(), th);
            }
        } else {
            this.aI = 8192;
            this.aK = aJ;
            this.aM = f62987aL;
            this.f63024aO = 40.0f;
            this.aS = 5;
            this.aU = 25000L;
            Logger.d(ac, "minUniformPixelsPercentageForUniformImage set to ", Float.valueOf(this.aQ));
            this.aW = false;
            Logger.d(ac, "parseSettings IMAGES settings block does not exist. Default configuration values will be used.");
        }
        Logger.d(ac, "parseSettings starting BANNERS");
        if (bundle2 == null || !bundle2.containsKey(ag)) {
            this.br = 40.0f;
            this.bt = 90.0f;
            this.bv = 5;
            this.bx = 2;
            this.bz = by;
            this.bB = true;
            Logger.d(ac, "parseSettings BANNERS settings block does not exist. Default configuration values will be used.");
        } else {
            Bundle bundle6 = bundle2.getBundle(ag);
            if (!bundle6.containsKey(f62965E)) {
                this.br = 40.0f;
            } else {
                float f6 = (float) bundle6.getDouble(f62965E, 40.0d);
                this.br = f6;
                Logger.d(ac, "parseSettings maxBannerUniformPixelsPercentageToStopSampling ", Float.valueOf(f6));
            }
            if (!bundle6.containsKey(f62966F)) {
                this.bt = 90.0f;
            } else {
                float f7 = (float) bundle6.getDouble(f62966F, 90.0d);
                this.bt = f7;
                Logger.d(ac, "parseSettings minBannerUniformPixelsPercentageForUniformImage ", Float.valueOf(f7));
            }
            if (!bundle6.containsKey(f62967G)) {
                this.bv = 5;
            } else {
                int i9 = bundle6.getInt(f62967G, 5);
                this.bv = i9;
                Logger.d(ac, "parseSettings maxAttemptsToCaptureBannerImage ", Integer.valueOf(i9));
            }
            if (bundle6.containsKey(f62968H)) {
                int i10 = bundle6.getInt(f62968H, 2);
                this.bx = i10;
                Logger.d(ac, "parseSettings bannerImageSamplingInterval ", Integer.valueOf(i10));
            } else {
                this.bx = 2;
            }
            if (bundle6.containsKey(f62969I)) {
                int i11 = bundle6.getInt(f62969I, by);
                this.bz = i11;
                Logger.d(ac, "parseSettings bannerDimensionsMaxSize ", Integer.valueOf(i11));
            } else {
                this.bz = by;
            }
            if (bundle6.containsKey(f62970J)) {
                boolean z7 = bundle6.getBoolean(f62970J, true);
                this.bB = z7;
                Logger.d(ac, "parseSettings bannerIsEnabled ", Boolean.valueOf(z7));
            } else {
                this.bB = true;
            }
        }
        Logger.d(ac, "parseSettings starting TIMERS");
        if (!bundle2.containsKey(aj)) {
            this.aY = 10000;
            this.ba = 15000;
            this.bc = 15000;
            this.f63019K = 30000;
            Logger.d(ac, "parseSettings TIMERS settings block does not exist. Default configuration values will be used.");
        } else {
            Bundle bundle7 = bundle2.getBundle(aj);
            if (!bundle7.containsKey(f63003k)) {
                this.aY = 10000;
            } else {
                int i12 = (int) bundle7.getDouble(f63003k, 10000.0d);
                this.aY = i12;
                if (z2) {
                    this.aY = i12 * 1000;
                }
                Logger.d(ac, "parseSettings awsUploadTimeout (ms) ", Integer.valueOf(this.aY));
            }
            if (bundle7.containsKey(gUxOLwRQBPPLC.ZNzAIUdmZ)) {
                int i13 = (int) bundle7.getDouble(f63004l, 15000.0d);
                this.ba = i13;
                if (z2) {
                    this.ba = i13 * 1000;
                }
                Logger.d(ac, "parseSettings resolveUrlTimeout (ms) ", Integer.valueOf(this.ba));
            } else {
                this.ba = 15000;
            }
            if (bundle7.containsKey(f63005m)) {
                int i14 = ((int) bundle7.getDouble(f63005m, 15000.0d)) * 1000;
                this.bc = i14;
                if (z2) {
                    this.bc = i14 * 1000;
                }
                Logger.d(ac, "parseSettings clickValidityTimeout (ms) ", Integer.valueOf(this.bc));
            } else {
                this.bc = 15000;
            }
            if (!bundle7.containsKey(f62990ak)) {
                this.f63019K = 30000;
            } else {
                int i15 = bundle7.getInt(f62990ak, 30) * 1000;
                this.f63019K = i15;
                Logger.d(ac, "parseSettings redirectClickTimeout (ms) value is ", Integer.valueOf(i15), ", isFromServer=", Boolean.valueOf(z2));
            }
        }
        Logger.d(ac, "parseSettings starting ANDROID");
        if (bundle2.containsKey("android")) {
            Bundle bundle8 = bundle2.getBundle("android");
            if (bundle8.containsKey(f63006n)) {
                ArrayList<String> stringArrayList = bundle8.getStringArrayList(f63006n);
                this.bf = stringArrayList;
                Logger.d(ac, "parseSettings interstitialActivitiesToInclude ", stringArrayList);
            }
            if (bundle8.containsKey(f63007o)) {
                ArrayList<String> stringArrayList2 = bundle8.getStringArrayList(f63007o);
                this.bg = stringArrayList2;
                Logger.d(ac, "parseSettings interstitialActivitiesToExclude ", stringArrayList2);
            }
            ArrayList<String> arrayList2 = this.bf;
            if ((arrayList2 != null && arrayList2.size() > 0) || ((arrayList = this.bg) != null && arrayList.size() > 0)) {
                Iterator<String> it = this.bf.iterator();
                while (it.hasNext()) {
                    BrandSafetyUtils.l(it.next());
                }
                Iterator<String> it2 = this.bg.iterator();
                while (it2.hasNext()) {
                    BrandSafetyUtils.m(it2.next());
                }
            }
            if (bundle8.containsKey(f62961A)) {
                boolean z9 = bundle8.getBoolean(qUrazMnwDskFs.vYLLw, false);
                this.aG = z9;
                Logger.d(ac, "parseSettings disableWebViewTracking ", Boolean.valueOf(z9));
            }
            if (bundle8.containsKey(f62978S)) {
                try {
                    ArrayList<String> stringArrayList3 = bundle8.getStringArrayList(f62978S);
                    if (stringArrayList3 != null && stringArrayList3.size() > 0) {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator<String> it3 = stringArrayList3.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(Integer.valueOf(Integer.parseInt(it3.next())));
                        }
                        f62985Z = new ArrayList(arrayList3);
                    }
                } catch (Exception e2) {
                    Logger.d(ac, "caught exception: ", e2);
                }
                Logger.d(ac, "parseSettings chosen interstitial video observer intervals: ", f62985Z);
            }
            if (bundle8.containsKey(f62977R)) {
                try {
                    ArrayList<String> stringArrayList4 = bundle8.getStringArrayList(f62977R);
                    if (stringArrayList4 != null && stringArrayList4.size() > 0) {
                        ArrayList arrayList4 = new ArrayList();
                        Iterator<String> it4 = stringArrayList4.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add(Integer.valueOf(Integer.parseInt(it4.next())));
                        }
                        f62980U = new ArrayList(arrayList4);
                    }
                } catch (Exception e3) {
                    Logger.d(ac, "caught exception: ", e3);
                }
                Logger.d(ac, "parseSettings chosen interstitial resource scanning intervals: ", f62980U);
            } else {
                Logger.d(ac, "parseSettings chosen default interstitial resource scanning intervals: ");
            }
            if (bundle8.containsKey(f62981V)) {
                try {
                    ArrayList<String> stringArrayList5 = bundle8.getStringArrayList(f62981V);
                    if (stringArrayList5 != null && stringArrayList5.size() > 0) {
                        ArrayList arrayList5 = new ArrayList();
                        Iterator<String> it5 = stringArrayList5.iterator();
                        while (it5.hasNext()) {
                            arrayList5.add(Integer.valueOf(Integer.parseInt(it5.next())));
                        }
                        f62983X = new ArrayList(arrayList5);
                    }
                } catch (Exception e4) {
                    Logger.d(ac, "caught exception: ", e4);
                }
                Logger.d(ac, "parseSettings chosen banner resource scanning intervals: ", f62983X);
            } else {
                Logger.d(ac, "parseSettings chosen default banner resource scanning intervals: ");
            }
            if (bundle8.containsKey(ab)) {
                try {
                    this.f63028bH = bundle8.getBoolean(ab);
                } catch (Exception e5) {
                    Logger.d(ac, "caught exception: ", e5);
                }
            }
        } else {
            Logger.d(ac, "parseSettings ANDROID settings block does not exist. Default configuration values will be used.");
        }
        Logger.d(ac, "parseSettings starting GENERAL");
        if (bundle2.containsKey(ai)) {
            Bundle bundle9 = bundle2.getBundle(ai);
            if (bundle9.containsKey(f63008p)) {
                String string = bundle9.getString(f63008p, "https://edge.safedk.com");
                this.bh = string;
                String strA = a(string);
                this.bh = strA;
                Logger.d(ac, "parseSettings edgeServerUrl ", strA);
            } else {
                this.bh = "https://edge.safedk.com";
            }
            if (bundle9.containsKey(f63009q)) {
                String string2 = bundle9.getString(f63009q, "https://edge.safedk.com");
                this.bi = string2;
                String strA2 = a(string2);
                this.bi = strA2;
                Logger.d(ac, "parseSettings backupEdgeServerUrl ", strA2);
            } else {
                this.bi = "https://edge.safedk.com";
            }
            AppLovinBridge.receiveEdgeUrls(this.bh, this.bi);
            if (bundle9.containsKey(f63010r)) {
                ArrayList<String> stringArrayList6 = bundle9.getStringArrayList(f63010r);
                this.bj = stringArrayList6;
                Logger.d(ac, "parseSettings devicesWithDebugLog ", stringArrayList6);
            }
            if (bundle9.containsKey(bI)) {
                int i16 = bundle9.getInt(bI);
                f62994bK = i16;
                Logger.d(ac, "parseSettings fileStorageMaxSize ", Integer.valueOf(i16));
            }
            if (bundle9.containsKey(bL)) {
                boolean z10 = bundle9.getBoolean(bL);
                bM = z10;
                Logger.d(ac, "parseSettings shouldIncludeMintegralRedirectData ", Boolean.valueOf(z10));
            }
        } else {
            Logger.d(ac, "parseSettings GENERAL settings block does not exist. Default configuration values will be used.");
        }
        Logger.d(ac, "parseSettings starting Ad CACHING");
        if (!bundle2.containsKey(ah)) {
            this.bl = f62973N;
            this.bm = 20;
            Logger.d(ac, "parseSettings AD_CACHING settings block does not exist. Default configuration values will be used.");
        } else {
            Bundle bundle10 = bundle2.getBundle(ah);
            if (!bundle10.containsKey(f63011s)) {
                this.bl = f62973N;
            } else {
                long j3 = (int) bundle10.getDouble(f63011s, 1200000.0d);
                this.bl = j3;
                Logger.d(ac, "parseSettings cachedCreativeInfoMaxAge ", Long.valueOf(j3));
            }
            CreativeInfoManager.a(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE, this.bl);
            if (!bundle10.containsKey(f63012t)) {
                this.bm = 20;
            } else {
                int i17 = bundle10.getInt(f63012t);
                this.bm = i17;
                Logger.d(ac, "parseSettings cachedMaxNumberOfItems ", Integer.valueOf(i17));
            }
            if (bundle10.containsKey(f63014v)) {
                ArrayList<String> stringArrayList7 = bundle10.getStringArrayList(f63014v);
                this.bk = stringArrayList7;
                Logger.d(ac, "parseSettings cacheSupportingSdkUUIDs ", stringArrayList7);
            }
            ArrayList<String> arrayList6 = this.bk;
            if (arrayList6 != null && arrayList6.size() > 0) {
                a(this.bk);
            }
            try {
                if (bundle10.containsKey(am)) {
                    Logger.d(ac, "parseSettings sdkSpecificCachedCIMaxAge ", bundle10.getBundle(am));
                    Bundle bundle11 = bundle10.getBundle(am);
                    for (String str2 : bundle11.keySet()) {
                        Logger.d(ac, "parseSettings sdkSpecificCachedCIMaxAge key = ", str2, ", value = ", Double.valueOf(bundle11.getDouble(str2)));
                        long j4 = (long) bundle11.getDouble(str2);
                        String sdkPackageByPackageUUID2 = SdksMapping.getSdkPackageByPackageUUID(str2);
                        if (sdkPackageByPackageUUID2 != null) {
                            Logger.d(ac, "parseSettings sdkSpecificCachedCIMaxAge identified UUID = ", str2, ", sdkPackageName = ", sdkPackageByPackageUUID2, ", value = ", Long.valueOf(j4));
                            com.safedk.android.analytics.brandsafety.creatives.b bVarK2 = CreativeInfoManager.k(sdkPackageByPackageUUID2);
                            if (bVarK2 != null) {
                                bVarK2.a(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_MAX_AGE, j4);
                                Logger.d(ac, "parseSettings sdkSpecificCachedCIMaxAge UUID = ", str2, ", sdkPackageName = ", sdkPackageByPackageUUID2, ", value = ", Long.valueOf(j4));
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                Logger.d(ac, "parseSettings sdkSpecificCachedCreativeInfoMaxAge Exception : ", th2.getMessage(), th2);
            }
            try {
                if (bundle10.containsKey(an)) {
                    Logger.d(ac, "parseSettings sdkSpecificCachedCreativeInfoMaxAge ", bundle10.getBundle(an));
                    Bundle bundle12 = bundle10.getBundle(an);
                    for (String str3 : bundle12.keySet()) {
                        Logger.d(ac, "parseSettings sdkSpecificCachedCIExpirationBundle key = ", str3, ", value = ", Boolean.valueOf(bundle12.getBoolean(str3)));
                        boolean z11 = bundle12.getBoolean(str3);
                        String sdkPackageByPackageUUID3 = SdksMapping.getSdkPackageByPackageUUID(str3);
                        if (sdkPackageByPackageUUID3 != null) {
                            Logger.d(ac, "parseSettings sdkSpecificCachedCIExpirationBundle identified UUID = ", str3, ", sdkPackageName = ", sdkPackageByPackageUUID3, ", value = ", Boolean.valueOf(z11));
                            com.safedk.android.analytics.brandsafety.creatives.b bVarK3 = CreativeInfoManager.k(sdkPackageByPackageUUID3);
                            if (bVarK3 != null) {
                                bVarK3.b(AdNetworkConfiguration.SDK_SPECIFIC_CACHED_CI_EXPIRATION, z11);
                                Logger.d(ac, "parseSettings sdkSpecificCachedCIExpirationBundle UUID = ", str3, ", sdkPackageName = ", sdkPackageByPackageUUID3, ", value = ", Boolean.valueOf(z11));
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                Logger.d(ac, "parseSettings sdkSpecificCachedCIExpirationBundle Exception : ", th3.getMessage(), th3);
            }
        }
        return true;
    }

    private void a(JSONObject jSONObject) throws JSONException {
        Logger.d(ac, "Attempting to parse sdk specific uniformity threshold. setting : ", jSONObject);
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                int i2 = jSONObject.getInt(next);
                String sdkPackageByPackageUUID = SdksMapping.getSdkPackageByPackageUUID(next);
                if (sdkPackageByPackageUUID != null) {
                    Logger.d(ac, "Parse sdk specific uniformity threshold setting identified, UUID = ", next, ", sdkPackageName = ", sdkPackageByPackageUUID, ", value = ", Integer.valueOf(i2));
                    com.safedk.android.analytics.brandsafety.creatives.b bVarK = CreativeInfoManager.k(sdkPackageByPackageUUID);
                    if (bVarK != null) {
                        bVarK.a(AdNetworkConfiguration.SDK_SPECIFIC_MIN_UNIFORM_PIXELS_PERCENTAGE_FOR_UNIFORM_IMAGE, i2);
                        Logger.d(ac, "Parse sdk specific uniformity threshold set, UUID = ", next, ", sdkPackageName = ", sdkPackageByPackageUUID, ", value = ", Integer.valueOf(i2));
                    }
                }
            }
            return;
        }
        Logger.d(ac, "Cannot parse sdk specific uniformity setting, json is null");
    }

    private void a(Bundle bundle) {
        Logger.d(ac, "processSdkVersionsBundle started, bundle=", bundle.toString());
    }

    private void a(ArrayList<String> arrayList) {
        this.f63023aF.clear();
        for (String str : arrayList) {
            Logger.d(ac, "Adding cacheSupportingSDKUUID ", str, " to cacheSupportedSdk List");
            this.f63023aF.add(str);
        }
    }

    private String a(String str) {
        if (str != null && str.length() > 0) {
            try {
                URL url = new URL(str);
                String protocol = url.getProtocol();
                String host = url.getHost();
                int port = url.getPort();
                if (port == -1) {
                    return String.format("%s://%s", protocol, host);
                }
                return String.format("%s://%s:%d", protocol, host, Integer.valueOf(port));
            } catch (MalformedURLException e2) {
                Logger.e(ac, "Exception sanitizing server url:", e2.getMessage(), e2);
            }
        }
        return str;
    }

    private boolean a(Double d2, String str) {
        Logger.d(ac, "checkActivePercent started, activePercent=", d2, ", userId=", str);
        float fA2 = DeviceData.a("", str);
        Logger.d(ac, "checkActivePercent hashValue ==", Float.valueOf(fA2));
        return ((double) fA2) <= d2.doubleValue();
    }

    public long T() {
        return this.bl;
    }

    public int U() {
        return this.bm;
    }

    public ArrayList<String> V() {
        return this.f63023aF;
    }
}
