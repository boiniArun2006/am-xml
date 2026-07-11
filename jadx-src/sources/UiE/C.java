package UiE;

import CKP.l3D;
import CKP.s4;
import CKP.z;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.facebook.appevents.Lu;
import com.facebook.appevents.rv6;
import com.facebook.appevents.vd;
import com.facebook.internal.C1869z;
import com.facebook.internal.Pl;
import com.facebook.internal.QJ;
import com.facebook.internal.UGc;
import com.facebook.s4;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C f10792n = new C();
    private static final String rl = C.class.getCanonicalName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final rv6 f10793t = new rv6(s4.qie());

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private BigDecimal f10794n;
        private vd nr;
        private Currency rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Bundle f10795t;

        public j(BigDecimal purchaseAmount, Currency currency, Bundle param, vd operationalData) {
            Intrinsics.checkNotNullParameter(purchaseAmount, "purchaseAmount");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(param, "param");
            Intrinsics.checkNotNullParameter(operationalData, "operationalData");
            this.f10794n = purchaseAmount;
            this.rl = currency;
            this.f10795t = param;
            this.nr = operationalData;
        }

        public final Currency n() {
            return this.rl;
        }

        public final BigDecimal nr() {
            return this.f10794n;
        }

        public final vd rl() {
            return this.nr;
        }

        public final Bundle t() {
            return this.f10795t;
        }
    }

    public static final synchronized Bundle J2(List purchaseLoggingParametersList, String eventName) {
        ArrayList arrayList;
        long jCurrentTimeMillis;
        ArrayList arrayList2;
        try {
            Intrinsics.checkNotNullParameter(purchaseLoggingParametersList, "purchaseLoggingParametersList");
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            arrayList = new ArrayList();
            Iterator it = purchaseLoggingParametersList.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                arrayList.add(new CKP.j(eventName, jVar.nr().doubleValue(), jVar.n()));
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(purchaseLoggingParametersList, 10));
            Iterator it2 = purchaseLoggingParametersList.iterator();
            while (it2.hasNext()) {
                j jVar2 = (j) it2.next();
                arrayList2.add(new Pair(jVar2.t(), jVar2.rl()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return l3D.J2(arrayList, jCurrentTimeMillis, true, arrayList2);
    }

    private final List O(String str, Bundle bundle, vd vdVar, JSONObject jSONObject) throws JSONException {
        if (!Intrinsics.areEqual(str, s4.n.SUBS.rl())) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("oneTimePurchaseOfferDetails");
            if (jSONObject2 == null) {
                return null;
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("priceCurrencyCode"));
            Intrinsics.checkNotNullExpressionValue(currency, "getInstance(oneTimePurch…RICE_CURRENCY_CODE_V5V7))");
            return CollectionsKt.mutableListOf(new j(bigDecimal, currency, bundle, vdVar));
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("subscriptionOfferDetails");
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject3 = jSONObject.getJSONArray("subscriptionOfferDetails").getJSONObject(i2);
            if (jSONObject3 == null) {
                return null;
            }
            Bundle bundle2 = new Bundle(bundle);
            vd vdVarT = vdVar.t();
            String basePlanId = jSONObject3.getString("basePlanId");
            vd.j jVar = vd.rl;
            Lu lu = Lu.IAPParameters;
            Intrinsics.checkNotNullExpressionValue(basePlanId, "basePlanId");
            jVar.n(lu, "fb_iap_base_plan", basePlanId, bundle2, vdVarT);
            JSONObject jSONObject4 = jSONObject3.getJSONArray("pricingPhases").getJSONObject(r11.length() - 1);
            if (jSONObject4 == null) {
                return null;
            }
            String strOptString = jSONObject4.optString("billingPeriod");
            Intrinsics.checkNotNullExpressionValue(strOptString, "subscriptionJSON.optStri…IOD\n                    )");
            jVar.n(lu, "fb_iap_subs_period", strOptString, bundle2, vdVarT);
            if (!jSONObject4.has("recurrenceMode") || jSONObject4.getInt("recurrenceMode") == 3) {
                jVar.n(lu, "fb_iap_subs_auto_renewing", V8ValueBoolean.FALSE, bundle2, vdVarT);
            } else {
                jVar.n(lu, "fb_iap_subs_auto_renewing", "true", bundle2, vdVarT);
            }
            BigDecimal bigDecimal2 = new BigDecimal(jSONObject4.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency2 = Currency.getInstance(jSONObject4.getString("priceCurrencyCode"));
            Intrinsics.checkNotNullExpressionValue(currency2, "getInstance(subscription…RICE_CURRENCY_CODE_V5V7))");
            arrayList.add(new j(bigDecimal2, currency2, bundle2, vdVarT));
        }
        return arrayList;
    }

    public static /* synthetic */ void gh(String str, String str2, boolean z2, s4.j jVar, boolean z3, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            z3 = false;
        }
        mUb(str, str2, z2, jVar, z3);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void mUb(String purchase, String skuDetails, boolean z2, s4.j jVar, boolean z3) {
        List listRl;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(skuDetails, "skuDetails");
        if (!Uo() || (listRl = f10792n.rl(purchase, skuDetails, jVar)) == null || listRl.isEmpty()) {
            return;
        }
        if (z2 && C1869z.nr("app_events_if_auto_log_subs", com.facebook.s4.az(), false)) {
            str2 = z3 ? "SubscriptionRestore" : z.f913n.az(skuDetails) ? "StartTrial" : "Subscribe";
        } else {
            if (!z3) {
                str = "fb_mobile_purchase";
                CKP.eO.f876n.n((z2 || !com.facebook.internal.Pl.Uo(Pl.n.AndroidManualImplicitSubsDedupe)) ? (z2 && com.facebook.internal.Pl.Uo(Pl.n.AndroidManualImplicitPurchaseDedupe)) ? n(listRl) : null : J2(listRl, str), ((j) listRl.get(0)).t(), ((j) listRl.get(0)).rl());
                if (Intrinsics.areEqual(str, "fb_mobile_purchase")) {
                    f10793t.xMQ(str, ((j) listRl.get(0)).nr(), ((j) listRl.get(0)).n(), ((j) listRl.get(0)).t(), ((j) listRl.get(0)).rl());
                    return;
                } else {
                    f10793t.mUb(((j) listRl.get(0)).nr(), ((j) listRl.get(0)).n(), ((j) listRl.get(0)).t(), ((j) listRl.get(0)).rl());
                    return;
                }
            }
            str2 = "fb_mobile_purchase_restored";
        }
        str = str2;
        CKP.eO.f876n.n((z2 || !com.facebook.internal.Pl.Uo(Pl.n.AndroidManualImplicitSubsDedupe)) ? (z2 && com.facebook.internal.Pl.Uo(Pl.n.AndroidManualImplicitPurchaseDedupe)) ? n(listRl) : null : J2(listRl, str), ((j) listRl.get(0)).t(), ((j) listRl.get(0)).rl());
        if (Intrinsics.areEqual(str, "fb_mobile_purchase")) {
        }
    }

    public static final synchronized Bundle n(List purchaseLoggingParametersList) {
        j jVar;
        Intrinsics.checkNotNullParameter(purchaseLoggingParametersList, "purchaseLoggingParametersList");
        jVar = (j) purchaseLoggingParametersList.get(0);
        return l3D.J2(CollectionsKt.listOf(new CKP.j("fb_mobile_purchase", jVar.nr().doubleValue(), jVar.n())), System.currentTimeMillis(), true, CollectionsKt.listOf(new Pair(jVar.t(), jVar.rl())));
    }

    private final j nr(String str, Bundle bundle, vd vdVar, JSONObject jSONObject, JSONObject jSONObject2) {
        Bundle bundle2;
        vd vdVar2;
        if (Intrinsics.areEqual(str, s4.n.SUBS.rl())) {
            vd.j jVar = vd.rl;
            Lu lu = Lu.IAPParameters;
            String string = Boolean.toString(jSONObject.optBoolean("autoRenewing", false));
            Intrinsics.checkNotNullExpressionValue(string, "toString(\n              …      )\n                )");
            bundle2 = bundle;
            vdVar2 = vdVar;
            jVar.n(lu, "fb_iap_subs_auto_renewing", string, bundle2, vdVar2);
            String strOptString = jSONObject2.optString("subscriptionPeriod");
            Intrinsics.checkNotNullExpressionValue(strOptString, "skuDetailsJSON.optString…_IAP_SUBSCRIPTION_PERIOD)");
            jVar.n(lu, "fb_iap_subs_period", strOptString, bundle2, vdVar2);
            String strOptString2 = jSONObject2.optString("freeTrialPeriod");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "skuDetailsJSON.optString…GP_IAP_FREE_TRIAL_PERIOD)");
            jVar.n(lu, "fb_free_trial_period", strOptString2, bundle2, vdVar2);
            String introductoryPriceCycles = jSONObject2.optString("introductoryPriceCycles");
            Intrinsics.checkNotNullExpressionValue(introductoryPriceCycles, "introductoryPriceCycles");
            if (introductoryPriceCycles.length() > 0) {
                jVar.n(lu, "fb_intro_price_cycles", introductoryPriceCycles, bundle2, vdVar2);
            }
            String introductoryPricePeriod = jSONObject2.optString("introductoryPricePeriod");
            Intrinsics.checkNotNullExpressionValue(introductoryPricePeriod, "introductoryPricePeriod");
            if (introductoryPricePeriod.length() > 0) {
                jVar.n(lu, "fb_intro_period", introductoryPricePeriod, bundle2, vdVar2);
            }
            String introductoryPriceAmountMicros = jSONObject2.optString("introductoryPriceAmountMicros");
            Intrinsics.checkNotNullExpressionValue(introductoryPriceAmountMicros, "introductoryPriceAmountMicros");
            if (introductoryPriceAmountMicros.length() > 0) {
                jVar.n(lu, "fb_intro_price_amount_micros", introductoryPriceAmountMicros, bundle2, vdVar2);
            }
        } else {
            bundle2 = bundle;
            vdVar2 = vdVar;
        }
        BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
        Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(skuDetailsJS…RICE_CURRENCY_CODE_V2V4))");
        return new j(bigDecimal, currency, bundle2, vdVar2);
    }

    private final List rl(String str, String str2, s4.j jVar) {
        return t(str, str2, new HashMap(), jVar);
    }

    private final List t(String str, String str2, Map map, s4.j jVar) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            vd vdVar = new vd();
            if (jVar != null) {
                vd.rl.n(Lu.IAPParameters, "fb_iap_sdk_supported_library_versions", jVar.rl(), bundle, vdVar);
            }
            vd.j jVar2 = vd.rl;
            Lu lu = Lu.IAPParameters;
            String string = jSONObject.getString("productId");
            Intrinsics.checkNotNullExpressionValue(string, "purchaseJSON.getString(C…stants.GP_IAP_PRODUCT_ID)");
            jVar2.n(lu, "fb_iap_product_id", string, bundle, vdVar);
            String string2 = jSONObject.getString("productId");
            Intrinsics.checkNotNullExpressionValue(string2, "purchaseJSON.getString(C…stants.GP_IAP_PRODUCT_ID)");
            jVar2.n(lu, "fb_content_id", string2, bundle, vdVar);
            jVar2.n(lu, "android_dynamic_ads_content_id", "client_implicit", bundle, vdVar);
            String string3 = jSONObject.getString("purchaseTime");
            Intrinsics.checkNotNullExpressionValue(string3, "purchaseJSON.getString(C…nts.GP_IAP_PURCHASE_TIME)");
            jVar2.n(lu, "fb_iap_purchase_time", string3, bundle, vdVar);
            String string4 = jSONObject.getString("purchaseToken");
            Intrinsics.checkNotNullExpressionValue(string4, "purchaseJSON.getString(C…ts.GP_IAP_PURCHASE_TOKEN)");
            jVar2.n(lu, "fb_iap_purchase_token", string4, bundle, vdVar);
            String strOptString = jSONObject.optString("packageName");
            Intrinsics.checkNotNullExpressionValue(strOptString, "purchaseJSON.optString(C…ants.GP_IAP_PACKAGE_NAME)");
            jVar2.n(lu, "fb_iap_package_name", strOptString, bundle, vdVar);
            String strOptString2 = jSONObject2.optString("title");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "skuDetailsJSON.optString(Constants.GP_IAP_TITLE)");
            jVar2.n(lu, "fb_iap_product_title", strOptString2, bundle, vdVar);
            String strOptString3 = jSONObject2.optString("description");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "skuDetailsJSON.optString…tants.GP_IAP_DESCRIPTION)");
            jVar2.n(lu, "fb_iap_product_description", strOptString3, bundle, vdVar);
            String type = jSONObject2.optString("type");
            Intrinsics.checkNotNullExpressionValue(type, "type");
            jVar2.n(lu, "fb_iap_product_type", type, bundle, vdVar);
            String strO = l3D.O();
            if (strO != null) {
                jVar2.n(lu, "fb_iap_client_library_version", strO, bundle, vdVar);
            }
            for (Map.Entry entry : map.entrySet()) {
                vd.rl.n(Lu.IAPParameters, (String) entry.getKey(), (String) entry.getValue(), bundle, vdVar);
            }
            if (jSONObject2.has("price_amount_micros")) {
                return CollectionsKt.mutableListOf(nr(type, bundle, vdVar, jSONObject, jSONObject2));
            }
            if (!jSONObject2.has("subscriptionOfferDetails") && !jSONObject2.has("oneTimePurchaseOfferDetails")) {
                return null;
            }
            try {
                return O(type, bundle, vdVar, jSONObject2);
            } catch (JSONException e2) {
                e = e2;
                Log.e(rl, "Error parsing in-app purchase/subscription data.", e);
                return null;
            } catch (Exception e3) {
                e = e3;
                Log.e(rl, "Failed to get purchase logging parameters,", e);
                return null;
            }
        } catch (JSONException e4) {
            e = e4;
        } catch (Exception e5) {
            e = e5;
        }
    }

    private C() {
    }

    public static final void KN() {
        Context contextQie = com.facebook.s4.qie();
        String strAz = com.facebook.s4.az();
        if (com.facebook.s4.ck()) {
            if (contextQie instanceof Application) {
                com.facebook.appevents.Xo.rl.rl((Application) contextQie, strAz);
            } else {
                Log.w(rl, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    public static final boolean Uo() {
        QJ qjJ2 = UGc.J2(com.facebook.s4.az());
        if (qjJ2 != null && com.facebook.s4.ck() && qjJ2.xMQ()) {
            return true;
        }
        return false;
    }

    public static final void xMQ(String str, long j2) {
        Context contextQie = com.facebook.s4.qie();
        QJ qjXQ = UGc.XQ(com.facebook.s4.az(), false);
        if (qjXQ != null && qjXQ.n() && j2 > 0) {
            rv6 rv6Var = new rv6(contextQie);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            rv6Var.t("fb_aa_time_spent_on_view", j2, bundle);
        }
    }
}
