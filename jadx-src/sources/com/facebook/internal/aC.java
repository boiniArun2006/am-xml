package com.facebook.internal;

import com.facebook.FacebookRequestError;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class aC {
    private static aC KN;
    public static final j Uo = new j(null);
    private final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f52785O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f52786n;
    private final String nr;
    private final Map rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f52787t;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final aC t() {
            return new aC(null, MapsKt.hashMapOf(TuplesKt.to(2, null), TuplesKt.to(4, null), TuplesKt.to(9, null), TuplesKt.to(17, null), TuplesKt.to(341, null)), MapsKt.hashMapOf(TuplesKt.to(102, null), TuplesKt.to(190, null), TuplesKt.to(412, null)), null, null, null);
        }

        public final aC n(JSONArray jSONArray) {
            String strOptString;
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            Map mapNr = null;
            Map mapNr2 = null;
            Map mapNr3 = null;
            String strOptString2 = null;
            String strOptString3 = null;
            String strOptString4 = null;
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME)) != null) {
                    if (StringsKt.equals(strOptString, InneractiveMediationNameConsts.OTHER, true)) {
                        strOptString2 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapNr = nr(jSONObjectOptJSONObject);
                    } else if (StringsKt.equals(strOptString, "transient", true)) {
                        strOptString3 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapNr2 = nr(jSONObjectOptJSONObject);
                    } else if (StringsKt.equals(strOptString, "login_recoverable", true)) {
                        strOptString4 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapNr3 = nr(jSONObjectOptJSONObject);
                    }
                }
            }
            return new aC(mapNr, mapNr2, mapNr3, strOptString2, strOptString3, strOptString4);
        }

        public final synchronized aC rl() {
            aC aCVar;
            try {
                if (aC.KN == null) {
                    aC.KN = t();
                }
                aCVar = aC.KN;
                Intrinsics.checkNotNull(aCVar, "null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            } catch (Throwable th) {
                throw th;
            }
            return aCVar;
        }

        private j() {
        }

        private final Map nr(JSONObject jSONObject) {
            int iOptInt;
            HashSet hashSet;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                return null;
            }
            HashMap map = new HashMap();
            int length = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("code")) != 0) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("subcodes");
                    if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        int length2 = jSONArrayOptJSONArray2.length();
                        for (int i3 = 0; i3 < length2; i3++) {
                            int iOptInt2 = jSONArrayOptJSONArray2.optInt(i3);
                            if (iOptInt2 != 0) {
                                hashSet.add(Integer.valueOf(iOptInt2));
                            }
                        }
                    }
                    map.put(Integer.valueOf(iOptInt), hashSet);
                }
            }
            return map;
        }
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FacebookRequestError.j.values().length];
            try {
                iArr[FacebookRequestError.j.OTHER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FacebookRequestError.j.LOGIN_RECOVERABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FacebookRequestError.j.TRANSIENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final String nr(FacebookRequestError.j jVar) {
        int i2 = jVar == null ? -1 : n.$EnumSwitchMapping$0[jVar.ordinal()];
        if (i2 == 1) {
            return this.nr;
        }
        if (i2 == 2) {
            return this.J2;
        }
        if (i2 != 3) {
            return null;
        }
        return this.f52785O;
    }

    public final FacebookRequestError.j t(int i2, int i3, boolean z2) {
        Set set;
        Set set2;
        Set set3;
        if (z2) {
            return FacebookRequestError.j.TRANSIENT;
        }
        Map map = this.f52786n;
        if (map != null && map.containsKey(Integer.valueOf(i2)) && ((set3 = (Set) this.f52786n.get(Integer.valueOf(i2))) == null || set3.contains(Integer.valueOf(i3)))) {
            return FacebookRequestError.j.OTHER;
        }
        Map map2 = this.f52787t;
        if (map2 != null && map2.containsKey(Integer.valueOf(i2)) && ((set2 = (Set) this.f52787t.get(Integer.valueOf(i2))) == null || set2.contains(Integer.valueOf(i3)))) {
            return FacebookRequestError.j.LOGIN_RECOVERABLE;
        }
        Map map3 = this.rl;
        return (map3 != null && map3.containsKey(Integer.valueOf(i2)) && ((set = (Set) this.rl.get(Integer.valueOf(i2))) == null || set.contains(Integer.valueOf(i3)))) ? FacebookRequestError.j.TRANSIENT : FacebookRequestError.j.OTHER;
    }

    public aC(Map map, Map map2, Map map3, String str, String str2, String str3) {
        this.f52786n = map;
        this.rl = map2;
        this.f52787t = map3;
        this.nr = str;
        this.f52785O = str2;
        this.J2 = str3;
    }
}
