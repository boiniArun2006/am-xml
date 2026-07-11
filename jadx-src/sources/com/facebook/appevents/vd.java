package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class vd {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Map f52334O;
    private static final Set nr;
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Set f52335t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f52336n = new LinkedHashMap();

    public static final class j {

        /* JADX INFO: renamed from: com.facebook.appevents.vd$j$j, reason: collision with other inner class name */
        public /* synthetic */ class C0744j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[h.values().length];
                try {
                    iArr[h.CustomData.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h.OperationalData.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[h.CustomAndOperationalData.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final void n(Lu typeOfParameter, String key, String value, Bundle customEventsParams, vd operationalData) {
            Intrinsics.checkNotNullParameter(typeOfParameter, "typeOfParameter");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(customEventsParams, "customEventsParams");
            Intrinsics.checkNotNullParameter(operationalData, "operationalData");
            int i2 = C0744j.$EnumSwitchMapping$0[nr(typeOfParameter, key).ordinal()];
            if (i2 == 1) {
                customEventsParams.putCharSequence(key, value);
                return;
            }
            if (i2 == 2) {
                operationalData.rl(typeOfParameter, key, value);
            } else {
                if (i2 != 3) {
                    return;
                }
                operationalData.rl(typeOfParameter, key, value);
                customEventsParams.putCharSequence(key, value);
            }
        }

        public final h nr(Lu typeOfParameter, String parameter) {
            Intrinsics.checkNotNullParameter(typeOfParameter, "typeOfParameter");
            Intrinsics.checkNotNullParameter(parameter, "parameter");
            Pair pair = (Pair) vd.f52334O.get(typeOfParameter);
            Set set = pair != null ? (Set) pair.getFirst() : null;
            Pair pair2 = (Pair) vd.f52334O.get(typeOfParameter);
            Set set2 = pair2 != null ? (Set) pair2.getSecond() : null;
            return (set == null || !set.contains(parameter)) ? (set2 == null || !set2.contains(parameter)) ? h.CustomData : h.CustomAndOperationalData : h.OperationalData;
        }

        public final Pair rl(Lu typeOfParameter, String key, String value, Bundle bundle, vd vdVar) {
            Intrinsics.checkNotNullParameter(typeOfParameter, "typeOfParameter");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            int i2 = C0744j.$EnumSwitchMapping$0[nr(typeOfParameter, key).ordinal()];
            if (i2 == 1) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putCharSequence(key, value);
            } else if (i2 == 2) {
                if (vdVar == null) {
                    vdVar = new vd();
                }
                vdVar.rl(typeOfParameter, key, value);
            } else if (i2 == 3) {
                if (vdVar == null) {
                    vdVar = new vd();
                }
                if (bundle == null) {
                    bundle = new Bundle();
                }
                vdVar.rl(typeOfParameter, key, value);
                bundle.putCharSequence(key, value);
            }
            return new Pair(bundle, vdVar);
        }

        public final Object t(Lu typeOfParameter, String key, Bundle bundle, vd vdVar) {
            Intrinsics.checkNotNullParameter(typeOfParameter, "typeOfParameter");
            Intrinsics.checkNotNullParameter(key, "key");
            Object objNr = vdVar != null ? vdVar.nr(typeOfParameter, key) : null;
            return objNr == null ? bundle != null ? bundle.getCharSequence(key) : null : objNr;
        }
    }

    static {
        Set of = SetsKt.setOf((Object[]) new String[]{"fb_iap_package_name", "fb_iap_subs_auto_renewing", "fb_free_trial_period", "fb_intro_price_amount_micros", "fb_intro_price_cycles", "fb_iap_base_plan", "is_implicit_purchase_logging_enabled", "fb_iap_sdk_supported_library_versions", "is_autolog_app_events_enabled", "fb_iap_client_library_version", "fb_iap_subs_period", "fb_iap_purchase_token", "fb_iap_non_deduped_event_time", "fb_iap_actual_dedup_result", "fb_iap_actual_dedup_key_used", "fb_iap_test_dedup_result", "fb_iap_test_dedup_key_used"});
        f52335t = of;
        Set of2 = SetsKt.setOf((Object[]) new String[]{"fb_iap_product_id", "fb_iap_product_type", "fb_iap_purchase_time"});
        nr = of2;
        f52334O = MapsKt.mapOf(TuplesKt.to(Lu.IAPParameters, new Pair(of, of2)));
    }

    public final JSONObject O() {
        JSONObject jSONObject;
        try {
            Map map = this.f52336n;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            for (Object obj : map.entrySet()) {
                linkedHashMap.put(((Lu) ((Map.Entry) obj).getKey()).rl(), ((Map.Entry) obj).getValue());
            }
            jSONObject = new JSONObject(MapsKt.toMap(linkedHashMap));
        } catch (Exception unused) {
            jSONObject = null;
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public final Object nr(Lu type, String key) {
        Map map;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f52336n.containsKey(type) && (map = (Map) this.f52336n.get(type)) != null) {
            return map.get(key);
        }
        return null;
    }

    public final void rl(Lu type, String key, Object value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            Ml.f52278o.n(key);
            if (!(value instanceof String) && !(value instanceof Number)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{value, key}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                throw new FacebookException(str);
            }
            if (!this.f52336n.containsKey(type)) {
                this.f52336n.put(type, new LinkedHashMap());
            }
            Map map = (Map) this.f52336n.get(type);
            if (map != null) {
                map.put(key, value);
            }
        } catch (Exception unused) {
        }
    }

    public final vd t() {
        vd vdVar = new vd();
        for (Lu lu : this.f52336n.keySet()) {
            Map map = (Map) this.f52336n.get(lu);
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    if (obj != null) {
                        vdVar.rl(lu, str, obj);
                    }
                }
            }
        }
        return vdVar;
    }
}
