package Suk;

import Suk.j;
import aT.dE.JLZo;
import com.facebook.Ew;
import com.facebook.internal.Z;
import com.facebook.internal.vd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I28 f10022n = new I28();
    public static final Map nr;
    private static final Map rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Map f10023t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public enum Ml {
        ARRAY,
        BOOL,
        INT;


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f10025n = new j(null);

        public static final class j {
            public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private j() {
            }

            public final Ml n(String rawValue) {
                Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                if (Intrinsics.areEqual(rawValue, Suk.n.EXT_INFO.rl())) {
                    return Ml.ARRAY;
                }
                if (Intrinsics.areEqual(rawValue, Suk.n.URL_SCHEMES.rl())) {
                    return Ml.ARRAY;
                }
                if (Intrinsics.areEqual(rawValue, qz.CONTENT_IDS.rl())) {
                    return Ml.ARRAY;
                }
                if (Intrinsics.areEqual(rawValue, qz.CONTENTS.rl())) {
                    return Ml.ARRAY;
                }
                if (Intrinsics.areEqual(rawValue, j.OPTIONS.rl())) {
                    return Ml.ARRAY;
                }
                if (Intrinsics.areEqual(rawValue, Suk.n.ADV_TE.rl())) {
                    return Ml.BOOL;
                }
                if (Intrinsics.areEqual(rawValue, Suk.n.APP_TE.rl())) {
                    return Ml.BOOL;
                }
                if (Intrinsics.areEqual(rawValue, qz.EVENT_TIME.rl())) {
                    return Ml.INT;
                }
                return null;
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public enum j {
        OPTIONS("data_processing_options"),
        COUNTRY("data_processing_options_country"),
        STATE("data_processing_options_state");


        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final C0348j f10031t = new C0348j(null);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f10032n;

        /* JADX INFO: renamed from: Suk.I28$j$j, reason: collision with other inner class name */
        public static final class C0348j {
            public /* synthetic */ C0348j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0348j() {
            }

            public final j n(String rawValue) {
                Intrinsics.checkNotNullParameter(rawValue, "rawValue");
                for (j jVar : j.values()) {
                    if (Intrinsics.areEqual(jVar.rl(), rawValue)) {
                        return jVar;
                    }
                }
                return null;
            }
        }

        public final String rl() {
            return this.f10032n;
        }

        j(String str) {
            this.f10032n = str;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private C f10033n;
        private Dsr rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.f10033n == nVar.f10033n && this.rl == nVar.rl;
        }

        public n(C c2, Dsr field) {
            Intrinsics.checkNotNullParameter(field, "field");
            this.f10033n = c2;
            this.rl = field;
        }

        public int hashCode() {
            C c2 = this.f10033n;
            return ((c2 == null ? 0 : c2.hashCode()) * 31) + this.rl.hashCode();
        }

        public final Dsr n() {
            return this.rl;
        }

        public final C rl() {
            return this.f10033n;
        }

        public String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.f10033n + ", field=" + this.rl + ')';
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private C f10034n;
        private o rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w6)) {
                return false;
            }
            w6 w6Var = (w6) obj;
            return this.f10034n == w6Var.f10034n && this.rl == w6Var.rl;
        }

        public w6(C section, o oVar) {
            Intrinsics.checkNotNullParameter(section, "section");
            this.f10034n = section;
            this.rl = oVar;
        }

        public int hashCode() {
            int iHashCode = this.f10034n.hashCode() * 31;
            o oVar = this.rl;
            return iHashCode + (oVar == null ? 0 : oVar.hashCode());
        }

        public final o n() {
            return this.rl;
        }

        public final C rl() {
            return this.f10034n;
        }

        public String toString() {
            return "SectionFieldMapping(section=" + this.f10034n + ", field=" + this.rl + ')';
        }
    }

    /* JADX INFO: renamed from: Suk.I28$I28, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public /* synthetic */ class C0347I28 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Ml.values().length];
            try {
                iArr[Ml.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ml.BOOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Ml.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[C.values().length];
            try {
                iArr2[C.APP_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[C.USER_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Suk.j.values().length];
            try {
                iArr3[Suk.j.MOBILE_APP_INSTALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Suk.j.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        Suk.n nVar = Suk.n.ANON_ID;
        C c2 = C.USER_DATA;
        Pair pair = TuplesKt.to(nVar, new w6(c2, o.ANON_ID));
        Pair pair2 = TuplesKt.to(Suk.n.APP_USER_ID, new w6(c2, o.FB_LOGIN_ID));
        Pair pair3 = TuplesKt.to(Suk.n.ADVERTISER_ID, new w6(c2, o.MAD_ID));
        Pair pair4 = TuplesKt.to(Suk.n.PAGE_ID, new w6(c2, o.PAGE_ID));
        Pair pair5 = TuplesKt.to(Suk.n.PAGE_SCOPED_USER_ID, new w6(c2, o.PAGE_SCOPED_USER_ID));
        Suk.n nVar2 = Suk.n.ADV_TE;
        C c4 = C.APP_DATA;
        rl = MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, TuplesKt.to(nVar2, new w6(c4, o.ADV_TE)), TuplesKt.to(Suk.n.APP_TE, new w6(c4, o.APP_TE)), TuplesKt.to(Suk.n.CONSIDER_VIEWS, new w6(c4, o.CONSIDER_VIEWS)), TuplesKt.to(Suk.n.DEVICE_TOKEN, new w6(c4, o.DEVICE_TOKEN)), TuplesKt.to(Suk.n.EXT_INFO, new w6(c4, o.EXT_INFO)), TuplesKt.to(Suk.n.INCLUDE_DWELL_DATA, new w6(c4, o.INCLUDE_DWELL_DATA)), TuplesKt.to(Suk.n.f10080v, new w6(c4, o.INCLUDE_VIDEO_DATA)), TuplesKt.to(Suk.n.INSTALL_REFERRER, new w6(c4, o.INSTALL_REFERRER)), TuplesKt.to(Suk.n.INSTALLER_PACKAGE, new w6(c4, o.INSTALLER_PACKAGE)), TuplesKt.to(Suk.n.RECEIPT_DATA, new w6(c4, o.RECEIPT_DATA)), TuplesKt.to(Suk.n.URL_SCHEMES, new w6(c4, o.URL_SCHEMES)), TuplesKt.to(Suk.n.USER_DATA, new w6(c2, null)));
        Pair pair6 = TuplesKt.to(qz.EVENT_TIME, new n(null, Dsr.EVENT_TIME));
        Pair pair7 = TuplesKt.to(qz.EVENT_NAME, new n(null, Dsr.EVENT_NAME));
        qz qzVar = qz.VALUE_TO_SUM;
        C c5 = C.CUSTOM_DATA;
        f10023t = MapsKt.mapOf(pair6, pair7, TuplesKt.to(qzVar, new n(c5, Dsr.VALUE_TO_SUM)), TuplesKt.to(qz.CONTENT_IDS, new n(c5, Dsr.CONTENT_IDS)), TuplesKt.to(qz.CONTENTS, new n(c5, Dsr.CONTENTS)), TuplesKt.to(qz.CONTENT_TYPE, new n(c5, Dsr.CONTENT_TYPE)), TuplesKt.to(qz.CURRENCY, new n(c5, Dsr.CURRENCY)), TuplesKt.to(qz.DESCRIPTION, new n(c5, Dsr.DESCRIPTION)), TuplesKt.to(qz.LEVEL, new n(c5, Dsr.LEVEL)), TuplesKt.to(qz.MAX_RATING_VALUE, new n(c5, Dsr.MAX_RATING_VALUE)), TuplesKt.to(qz.NUM_ITEMS, new n(c5, Dsr.NUM_ITEMS)), TuplesKt.to(qz.PAYMENT_INFO_AVAILABLE, new n(c5, Dsr.PAYMENT_INFO_AVAILABLE)), TuplesKt.to(qz.REGISTRATION_METHOD, new n(c5, Dsr.f10011T)), TuplesKt.to(qz.SEARCH_STRING, new n(c5, Dsr.SEARCH_STRING)), TuplesKt.to(qz.SUCCESS, new n(c5, Dsr.SUCCESS)), TuplesKt.to(qz.ORDER_ID, new n(c5, Dsr.ORDER_ID)), TuplesKt.to(qz.AD_TYPE, new n(c5, Dsr.AD_TYPE)));
        nr = MapsKt.mapOf(TuplesKt.to("fb_mobile_achievement_unlocked", aC.UNLOCKED_ACHIEVEMENT), TuplesKt.to("fb_mobile_activate_app", aC.ACTIVATED_APP), TuplesKt.to("fb_mobile_add_payment_info", aC.ADDED_PAYMENT_INFO), TuplesKt.to("fb_mobile_add_to_cart", aC.ADDED_TO_CART), TuplesKt.to("fb_mobile_add_to_wishlist", aC.ADDED_TO_WISHLIST), TuplesKt.to("fb_mobile_complete_registration", aC.COMPLETED_REGISTRATION), TuplesKt.to("fb_mobile_content_view", aC.VIEWED_CONTENT), TuplesKt.to("fb_mobile_initiated_checkout", aC.INITIATED_CHECKOUT), TuplesKt.to("fb_mobile_level_achieved", aC.ACHIEVED_LEVEL), TuplesKt.to("fb_mobile_purchase", aC.PURCHASED), TuplesKt.to(JLZo.YCSXFOsOVnAl, aC.RATED), TuplesKt.to("fb_mobile_search", aC.f10052T), TuplesKt.to("fb_mobile_spent_credits", aC.SPENT_CREDITS), TuplesKt.to("fb_mobile_tutorial_completion", aC.COMPLETED_TUTORIAL));
    }

    private final Suk.j J2(Map map, Map map2, Map map3, ArrayList arrayList, Map map4) {
        Object obj = map.get(Pl.EVENT.rl());
        j.C0349j c0349j = Suk.j.f10065n;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        Suk.j jVarN = c0349j.n((String) obj);
        if (jVarN != Suk.j.OTHER) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Suk.n nVarN = Suk.n.f10079t.n(str);
                if (nVarN != null) {
                    f10022n.Uo(map2, map3, nVarN, value);
                } else {
                    boolean zAreEqual = Intrinsics.areEqual(str, C.CUSTOM_EVENTS.rl());
                    boolean z2 = value instanceof String;
                    if (jVarN == Suk.j.CUSTOM && zAreEqual && z2) {
                        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
                        ArrayList arrayListGh = gh((String) value);
                        if (arrayListGh != null) {
                            arrayList.addAll(arrayListGh);
                        }
                    } else if (j.f10031t.n(str) != null) {
                        map4.put(str, value);
                    }
                }
            }
        }
        return jVarN;
    }

    private final void KN(Map map, Suk.n nVar, Object obj) {
        o oVarN;
        String strRl;
        w6 w6Var = (w6) rl.get(nVar);
        if (w6Var == null || (oVarN = w6Var.n()) == null || (strRl = oVarN.rl()) == null) {
            return;
        }
        map.put(strRl, obj);
    }

    public static final ArrayList gh(String appEvents) {
        Intrinsics.checkNotNullParameter(appEvents, "appEvents");
        ArrayList<Map> arrayList = new ArrayList();
        try {
            Iterator it = vd.ty(new JSONArray(appEvents)).iterator();
            while (it.hasNext()) {
                arrayList.add(vd.HI(new JSONObject((String) it.next())));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map map : arrayList) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str : map.keySet()) {
                    qz qzVarN = qz.f10107t.n(str);
                    n nVar = (n) f10023t.get(qzVarN);
                    if (qzVarN != null && nVar != null) {
                        C cRl = nVar.rl();
                        if (cRl == null) {
                            try {
                                String strRl = nVar.n().rl();
                                if (qzVarN == qz.EVENT_NAME && ((String) map.get(str)) != null) {
                                    I28 i28 = f10022n;
                                    Object obj = map.get(str);
                                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                                    linkedHashMap2.put(strRl, i28.mUb((String) obj));
                                } else if (qzVarN == qz.EVENT_TIME && ((Integer) map.get(str)) != null) {
                                    Object obj2 = map.get(str);
                                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Any");
                                    Object objQie = qie(str, obj2);
                                    Intrinsics.checkNotNull(objQie, "null cannot be cast to non-null type kotlin.Any");
                                    linkedHashMap2.put(strRl, objQie);
                                }
                            } catch (ClassCastException e2) {
                                Z.f52780O.t(Ew.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", ExceptionsKt.stackTraceToString(e2));
                            }
                        } else if (cRl == C.CUSTOM_DATA) {
                            String strRl2 = nVar.n().rl();
                            Object obj3 = map.get(str);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Any");
                            Object objQie2 = qie(str, obj3);
                            Intrinsics.checkNotNull(objQie2, "null cannot be cast to non-null type kotlin.Any");
                            linkedHashMap.put(strRl2, objQie2);
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    linkedHashMap2.put(C.CUSTOM_DATA.rl(), linkedHashMap);
                }
                arrayList2.add(linkedHashMap2);
            }
            return arrayList2;
        } catch (JSONException e3) {
            Z.f52780O.t(Ew.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", appEvents, e3);
            return null;
        }
    }

    private final String mUb(String str) {
        String strRl;
        Map map = nr;
        if (!map.containsKey(str)) {
            return str;
        }
        aC aCVar = (aC) map.get(str);
        return (aCVar == null || (strRl = aCVar.rl()) == null) ? "" : strRl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map] */
    public static final Object qie(String field, Object value) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(value, "value");
        Ml mlN = Ml.f10025n.n(field);
        String str = value instanceof String ? (String) value : null;
        if (mlN == null || str == null) {
            return value;
        }
        int i2 = C0347I28.$EnumSwitchMapping$0[mlN.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return StringsKt.toIntOrNull(value.toString());
                }
                throw new NoWhenBranchMatchedException();
            }
            Integer intOrNull = StringsKt.toIntOrNull(str.toString());
            if (intOrNull != null) {
                return Boolean.valueOf(intOrNull.intValue() != 0);
            }
            return null;
        }
        try {
            List<??> listTy = vd.ty(new JSONArray(str));
            ArrayList arrayList = new ArrayList();
            for (?? Ty : listTy) {
                try {
                    try {
                        Ty = vd.HI(new JSONObject((String) Ty));
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    Ty = vd.ty(new JSONArray((String) Ty));
                }
                arrayList.add(Ty);
            }
            return arrayList;
        } catch (JSONException e2) {
            Z.f52780O.t(Ew.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e2);
            return Unit.INSTANCE;
        }
    }

    private final List t(Map map, Object obj) {
        if (obj == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put(Dsr.EVENT_NAME.rl(), Pl.MOBILE_APP_INSTALL.rl());
        linkedHashMap.put(Dsr.EVENT_TIME.rl(), obj);
        return CollectionsKt.listOf(linkedHashMap);
    }

    private final void xMQ(Map map, Suk.n nVar, Object obj) {
        o oVarN;
        String strRl;
        if (nVar == Suk.n.USER_DATA) {
            try {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                map.putAll(vd.HI(new JSONObject((String) obj)));
                return;
            } catch (JSONException e2) {
                Z.f52780O.t(Ew.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e2);
                return;
            }
        }
        w6 w6Var = (w6) rl.get(nVar);
        if (w6Var == null || (oVarN = w6Var.n()) == null || (strRl = oVarN.rl()) == null) {
            return;
        }
        map.put(strRl, obj);
    }

    public final List O(Map parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Suk.j jVarJ2 = J2(parameters, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (jVarJ2 == Suk.j.OTHER) {
            return null;
        }
        return n(jVarJ2, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, parameters.get(Pl.INSTALL_EVENT_TIME.rl()));
    }

    public final void Uo(Map userData, Map appData, Suk.n field, Object value) {
        C cRl;
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(value, "value");
        w6 w6Var = (w6) rl.get(field);
        if (w6Var == null || (cRl = w6Var.rl()) == null) {
            return;
        }
        int i2 = C0347I28.$EnumSwitchMapping$1[cRl.ordinal()];
        if (i2 == 1) {
            KN(appData, field, value);
        } else {
            if (i2 != 2) {
                return;
            }
            xMQ(userData, field, value);
        }
    }

    public final List n(Suk.j eventType, Map userData, Map appData, Map restOfData, List customEvents, Object obj) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(restOfData, "restOfData");
        Intrinsics.checkNotNullParameter(customEvents, "customEvents");
        Map mapNr = nr(userData, appData, restOfData);
        int i2 = C0347I28.$EnumSwitchMapping$2[eventType.ordinal()];
        if (i2 == 1) {
            return t(mapNr, obj);
        }
        if (i2 != 2) {
            return null;
        }
        return rl(mapNr, customEvents);
    }

    public final Map nr(Map userData, Map appData, Map restOfData) {
        Intrinsics.checkNotNullParameter(userData, "userData");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(restOfData, "restOfData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Pl.ACTION_SOURCE.rl(), Pl.APP.rl());
        linkedHashMap.put(C.USER_DATA.rl(), userData);
        linkedHashMap.put(C.APP_DATA.rl(), appData);
        linkedHashMap.putAll(restOfData);
        return linkedHashMap;
    }

    private I28() {
    }

    private final List rl(Map map, List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map2 = (Map) it.next();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.putAll(map2);
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }
}
