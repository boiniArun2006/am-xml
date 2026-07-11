package zx;

import android.os.Bundle;
import com.applovin.sdk.AppLovinEventParameters;
import com.facebook.internal.QJ;
import com.facebook.internal.UGc;
import com.facebook.s4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class I28 {
    private static HashSet nr;
    private static boolean rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I28 f76720n = new I28();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Lazy f76721t = LazyKt.lazy(j.f76722n);

    static final class j extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f76722n = new j();

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final HashSet invoke() {
            return SetsKt.hashSetOf("_currency", "_valueToSum", "fb_availability", "fb_body_style", "fb_checkin_date", "fb_checkout_date", "fb_city", "fb_condition_of_vehicle", "fb_content_ids", "fb_content_type", "fb_contents", "fb_country", "fb_currency", "fb_delivery_category", "fb_departing_arrival_date", "fb_departing_departure_date", "fb_destination_airport", "fb_destination_ids", "fb_dma_code", "fb_drivetrain", "fb_exterior_color", "fb_fuel_type", "fb_hotel_score", "fb_interior_color", "fb_lease_end_date", "fb_lease_start_date", "fb_listing_type", "fb_make", "fb_mileage.unit", "fb_mileage.value", "fb_model", "fb_neighborhood", "fb_num_adults", "fb_num_children", "fb_num_infants", "fb_num_items", "fb_order_id", "fb_origin_airport", "fb_postal_code", "fb_predicted_ltv", "fb_preferred_baths_range", "fb_preferred_beds_range", "fb_preferred_neighborhoods", "fb_preferred_num_stops", "fb_preferred_price_range", "fb_preferred_star_ratings", "fb_price", "fb_property_type", "fb_region", "fb_returning_arrival_date", "fb_returning_departure_date", "fb_state_of_vehicle", "fb_suggested_destinations", "fb_suggested_home_listings", "fb_suggested_hotels", "fb_suggested_jobs", "fb_suggested_local_service_businesses", "fb_suggested_location_based_items", "fb_suggested_vehicles", "fb_transmission", "fb_travel_class", "fb_travel_end", "fb_travel_start", "fb_trim", "fb_user_bucket", "fb_value", "fb_vin", "fb_year", "lead_event_source", "predicted_ltv", "product_catalog_id", "app_user_id", "appVersion", "_eventName", "_eventName_md5", "_implicitlyLogged", "_inBackground", "_isTimedEvent", "_logTime", "_session_id", "_ui", "_valueToUpdate", "_is_fb_codeless", "_is_suggested_event", "_fb_pixel_referral_id", "fb_pixel_id", "trace_id", "subscription_id", "event_id", "_restrictedParams", "_onDeviceParams", "purchase_valid_result_type", "core_lib_included", "login_lib_included", "share_lib_included", "place_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "_codeless_action", "sdk_initialized", "billing_client_lib_included", "billing_service_lib_included", "user_data_keys", "device_push_token", "fb_mobile_pckg_fp", "fb_mobile_app_cert_hash", "aggregate_id", "anonymous_id", "campaign_ids", "fb_post_attachment", AppLovinEventParameters.IN_APP_PURCHASE_DATA, "ad_type", "fb_content", "fb_content_id", "fb_description", "fb_level", "fb_max_rating_value", "fb_payment_info_available", "fb_registration_method", "fb_success", "pm", "_audiencePropertyIds", "cs_maca");
        }
    }

    public static final void J2(Bundle bundle) {
        if (VmF.j.nr(I28.class)) {
            return;
        }
        try {
            if (rl && bundle != null && !bundle.isEmpty() && nr != null) {
                ArrayList arrayList = new ArrayList();
                Set<String> setKeySet = bundle.keySet();
                Intrinsics.checkNotNullExpressionValue(setKeySet, "parameters.keySet()");
                for (String param : setKeySet) {
                    HashSet hashSet = nr;
                    Intrinsics.checkNotNull(hashSet);
                    if (!hashSet.contains(param)) {
                        Intrinsics.checkNotNullExpressionValue(param, "param");
                        arrayList.add(param);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bundle.remove((String) it.next());
                }
                bundle.putString("pm", "1");
            }
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
        }
    }

    public static final boolean nr() {
        if (VmF.j.nr(I28.class)) {
            return false;
        }
        try {
            return rl;
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
            return false;
        }
    }

    public static final void rl() {
        if (VmF.j.nr(I28.class)) {
            return;
        }
        try {
            rl = true;
            f76720n.O();
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
        }
    }

    public final boolean Uo(Bundle bundle) {
        if (VmF.j.nr(this) || bundle == null) {
            return false;
        }
        try {
            if (bundle.containsKey("pm")) {
                if (Intrinsics.areEqual(bundle.get("pm"), "1")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }

    private I28() {
    }

    private final void O() {
        if (!VmF.j.nr(this)) {
            try {
                QJ qjXQ = UGc.XQ(s4.az(), false);
                if (qjXQ == null) {
                    return;
                }
                HashSet hashSetN = n(qjXQ.qie());
                if (hashSetN == null) {
                    hashSetN = t();
                }
                nr = hashSetN;
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    private final HashSet n(JSONArray jSONArray) {
        if (!VmF.j.nr(this) && jSONArray != null) {
            try {
                if (jSONArray.length() != 0) {
                    HashSet hashSet = new HashSet();
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = jSONArray.getString(i2);
                        Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                        hashSet.add(string);
                    }
                    return hashSet;
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
        return null;
    }

    public final HashSet t() {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            return (HashSet) f76721t.getValue();
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }
}
