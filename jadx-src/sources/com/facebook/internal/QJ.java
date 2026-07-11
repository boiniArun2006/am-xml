package com.facebook.internal;

import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.l;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class QJ {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final j f52754X = new j(null);
    private final List E2;
    private final boolean HI;
    private final String Ik;
    private final Map J2;
    private final aC KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final EnumSet f52755O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final Map f52756S;
    private final boolean Uo;
    private final JSONArray ViF;
    private final JSONArray WPU;
    private final JSONArray XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final JSONArray f52757Z;
    private final JSONArray aYN;
    private final JSONArray az;
    private final boolean ck;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f52758e;
    private final List fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONArray f52759g;
    private final boolean gh;
    private final List iF;
    private final String mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f52760n;
    private final JSONArray nY;
    private final int nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f52761o;
    private final boolean qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f52762r;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f52763t;
    private final List te;
    private final String ty;
    private final String xMQ;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public static final class n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final j f52764O = new j(null);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f52765n;
        private final int[] nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Uri f52766t;

        public static final class j {
            public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private j() {
            }

            private final int[] rl(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                int length = jSONArray.length();
                int[] iArr = new int[length];
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = -1;
                    int iOptInt = jSONArray.optInt(i2, -1);
                    if (iOptInt == -1) {
                        String versionString = jSONArray.optString(i2);
                        if (!vd.I(versionString)) {
                            try {
                                Intrinsics.checkNotNullExpressionValue(versionString, "versionString");
                                i3 = Integer.parseInt(versionString);
                            } catch (NumberFormatException e2) {
                                vd.z("FacebookSDK", e2);
                            }
                            iOptInt = i3;
                        }
                    }
                    iArr[i2] = iOptInt;
                }
                return iArr;
            }

            public final n n(JSONObject dialogConfigJSON) {
                Intrinsics.checkNotNullParameter(dialogConfigJSON, "dialogConfigJSON");
                String dialogNameWithFeature = dialogConfigJSON.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (vd.I(dialogNameWithFeature)) {
                    return null;
                }
                Intrinsics.checkNotNullExpressionValue(dialogNameWithFeature, "dialogNameWithFeature");
                List listSplit$default = StringsKt.split$default((CharSequence) dialogNameWithFeature, new String[]{l.ad}, false, 0, 6, (Object) null);
                if (listSplit$default.size() != 2) {
                    return null;
                }
                String str = (String) CollectionsKt.first(listSplit$default);
                String str2 = (String) CollectionsKt.last(listSplit$default);
                if (vd.I(str) || vd.I(str2)) {
                    return null;
                }
                String strOptString = dialogConfigJSON.optString("url");
                return new n(str, str2, vd.I(strOptString) ? null : Uri.parse(strOptString), rl(dialogConfigJSON.optJSONArray("versions")), null);
            }
        }

        public /* synthetic */ n(String str, String str2, Uri uri, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, uri, iArr);
        }

        private n(String str, String str2, Uri uri, int[] iArr) {
            this.f52765n = str;
            this.rl = str2;
            this.f52766t = uri;
            this.nr = iArr;
        }

        public final String n() {
            return this.f52765n;
        }

        public final String rl() {
            return this.rl;
        }
    }

    public QJ(boolean z2, String nuxContent, boolean z3, int i2, EnumSet smartLoginOptions, Map dialogConfigurations, boolean z4, aC errorClassification, String smartLoginBookmarkIconURL, String smartLoginMenuIconURL, boolean z5, boolean z6, JSONArray jSONArray, String sdkUpdateMessage, boolean z7, boolean z9, String str, String str2, String str3, JSONArray jSONArray2, JSONArray jSONArray3, Map map, JSONArray jSONArray4, JSONArray jSONArray5, JSONArray jSONArray6, JSONArray jSONArray7, JSONArray jSONArray8, List list, List list2, List list3, List list4, Long l2) {
        Intrinsics.checkNotNullParameter(nuxContent, "nuxContent");
        Intrinsics.checkNotNullParameter(smartLoginOptions, "smartLoginOptions");
        Intrinsics.checkNotNullParameter(dialogConfigurations, "dialogConfigurations");
        Intrinsics.checkNotNullParameter(errorClassification, "errorClassification");
        Intrinsics.checkNotNullParameter(smartLoginBookmarkIconURL, "smartLoginBookmarkIconURL");
        Intrinsics.checkNotNullParameter(smartLoginMenuIconURL, "smartLoginMenuIconURL");
        Intrinsics.checkNotNullParameter(sdkUpdateMessage, "sdkUpdateMessage");
        this.f52760n = z2;
        this.rl = nuxContent;
        this.f52763t = z3;
        this.nr = i2;
        this.f52755O = smartLoginOptions;
        this.J2 = dialogConfigurations;
        this.Uo = z4;
        this.KN = errorClassification;
        this.xMQ = smartLoginBookmarkIconURL;
        this.mUb = smartLoginMenuIconURL;
        this.gh = z5;
        this.qie = z6;
        this.az = jSONArray;
        this.ty = sdkUpdateMessage;
        this.HI = z7;
        this.ck = z9;
        this.Ik = str;
        this.f52762r = str2;
        this.f52761o = str3;
        this.f52757Z = jSONArray2;
        this.XQ = jSONArray3;
        this.f52756S = map;
        this.WPU = jSONArray4;
        this.aYN = jSONArray5;
        this.ViF = jSONArray6;
        this.nY = jSONArray7;
        this.f52759g = jSONArray8;
        this.te = list;
        this.iF = list2;
        this.fD = list3;
        this.E2 = list4;
        this.f52758e = l2;
    }

    public final JSONArray HI() {
        return this.aYN;
    }

    public final JSONArray Ik() {
        return this.nY;
    }

    public final Long J2() {
        return this.f52758e;
    }

    public final JSONArray KN() {
        return this.az;
    }

    public final List O() {
        return this.te;
    }

    public final String S() {
        return this.f52762r;
    }

    public final aC Uo() {
        return this.KN;
    }

    public final List WPU() {
        return this.E2;
    }

    public final EnumSet XQ() {
        return this.f52755O;
    }

    public final int Z() {
        return this.nr;
    }

    public final boolean aYN() {
        return this.f52760n;
    }

    public final List az() {
        return this.iF;
    }

    public final String ck() {
        return this.f52761o;
    }

    public final List gh() {
        return this.fD;
    }

    public final JSONArray mUb() {
        return this.XQ;
    }

    public final boolean n() {
        return this.Uo;
    }

    public final boolean nr() {
        return this.qie;
    }

    public final JSONArray o() {
        return this.ViF;
    }

    public final JSONArray qie() {
        return this.f52757Z;
    }

    public final String r() {
        return this.ty;
    }

    public final JSONArray rl() {
        return this.f52759g;
    }

    public final JSONArray t() {
        return this.WPU;
    }

    public final String ty() {
        return this.Ik;
    }

    public final boolean xMQ() {
        return this.gh;
    }
}
