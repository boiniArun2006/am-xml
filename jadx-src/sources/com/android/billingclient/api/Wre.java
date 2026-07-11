package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Wre {
    private final String J2;
    private final String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f47578O;
    private final String Uo;
    private final List gh;
    private final List mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f47579n;
    private final String nr;
    private final JSONObject rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f47580t;
    private final String xMQ;

    public List J2() {
        return this.mUb;
    }

    public String O() {
        return this.nr;
    }

    public String Uo() {
        return this.f47578O;
    }

    final List gh() {
        return this.gh;
    }

    public String mUb() {
        return this.xMQ;
    }

    public String n() {
        return this.Uo;
    }

    public String nr() {
        return this.f47580t;
    }

    public String rl() {
        return this.J2;
    }

    final String xMQ() {
        return this.KN;
    }

    public static final class I28 {
        private final j J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final List f47581O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f47582n;
        private final Ml nr;
        private final String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f47583t;

        public Ml O() {
            return this.nr;
        }

        public String n() {
            return this.f47582n;
        }

        public String nr() {
            return this.f47583t;
        }

        public String rl() {
            return this.rl;
        }

        public List t() {
            return this.f47581O;
        }

        I28(JSONObject jSONObject) throws JSONException {
            this.f47582n = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.rl = true == strOptString.isEmpty() ? null : strOptString;
            this.f47583t = jSONObject.getString("offerIdToken");
            this.nr = new Ml(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.J2 = jSONObjectOptJSONObject != null ? new j(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getString("productId");
                jSONObjectOptJSONObject2.optString("title");
                jSONObjectOptJSONObject2.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                jSONObjectOptJSONObject2.optString("description");
                jSONObjectOptJSONObject2.optString("basePlanId");
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
                if (jSONObjectOptJSONObject3 != null) {
                    new w6(jSONObjectOptJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i2));
                }
            }
            this.f47581O = arrayList;
        }
    }

    public static class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f47584n;

        public List n() {
            return this.f47584n;
        }

        Ml(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new w6(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f47584n = arrayList;
        }
    }

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f47585n;
        private final int rl;

        j(JSONObject jSONObject) {
            this.f47585n = jSONObject.getInt("commitmentPaymentsCount");
            this.rl = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
    }

    public static final class n {
        private final M J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final String f47586O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f47587n;
        private final String nr;
        private final long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f47588t;

        public final M n() {
            return this.J2;
        }

        public final String rl() {
            return this.nr;
        }

        final String t() {
            return this.f47586O;
        }

        n(JSONObject jSONObject) throws JSONException {
            this.f47587n = jSONObject.optString("formattedPrice");
            this.rl = jSONObject.optLong("priceAmountMicros");
            this.f47588t = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.nr = true == strOptString.isEmpty() ? null : strOptString;
            jSONObject.optString("offerId").getClass();
            jSONObject.optString("purchaseOptionId").getClass();
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i2));
                }
            }
            zzco.zzk(arrayList);
            if (jSONObject.has("fullPriceMicros")) {
                jSONObject.optLong("fullPriceMicros");
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            if (jSONObjectOptJSONObject != null) {
                jSONObjectOptJSONObject.getInt("percentageDiscount");
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.getLong("startTimeMillis");
                jSONObjectOptJSONObject2.getLong("endTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            if (jSONObjectOptJSONObject3 != null) {
                jSONObjectOptJSONObject3.getInt("maximumQuantity");
                jSONObjectOptJSONObject3.getInt("remainingQuantity");
            }
            this.f47586O = jSONObject.optString("serializedDocid");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            if (jSONObjectOptJSONObject4 != null) {
                jSONObjectOptJSONObject4.getLong("preorderReleaseTimeMillis");
                jSONObjectOptJSONObject4.getLong("preorderPresaleEndTimeMillis");
            }
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            if (jSONObjectOptJSONObject5 != null) {
                jSONObjectOptJSONObject5.getString("rentalPeriod");
                jSONObjectOptJSONObject5.optString("rentalExpirationPeriod").getClass();
            }
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.J2 = jSONObjectOptJSONObject6 != null ? new M(jSONObjectOptJSONObject6) : null;
        }
    }

    public static final class w6 {
        private final int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int f47589O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f47590n;
        private final String nr;
        private final long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f47591t;

        public int J2() {
            return this.J2;
        }

        public String O() {
            return this.f47591t;
        }

        public int n() {
            return this.f47589O;
        }

        public long nr() {
            return this.rl;
        }

        public String rl() {
            return this.nr;
        }

        public String t() {
            return this.f47590n;
        }

        w6(JSONObject jSONObject) {
            this.nr = jSONObject.optString("billingPeriod");
            this.f47591t = jSONObject.optString("priceCurrencyCode");
            this.f47590n = jSONObject.optString("formattedPrice");
            this.rl = jSONObject.optLong("priceAmountMicros");
            this.J2 = jSONObject.optInt("recurrenceMode");
            this.f47589O = jSONObject.optInt("billingCycleCount");
        }
    }

    public final String KN() {
        return this.rl.optString("packageName");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Wre) {
            return TextUtils.equals(this.f47579n, ((Wre) obj).f47579n);
        }
        return false;
    }

    public int hashCode() {
        return this.f47579n.hashCode();
    }

    public n t() {
        List list = this.gh;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (n) this.gh.get(0);
    }

    public String toString() {
        List list = this.mUb;
        return "ProductDetails{jsonString='" + this.f47579n + "', parsedJson=" + this.rl.toString() + ", productId='" + this.f47580t + "', productType='" + this.nr + "', title='" + this.f47578O + "', productDetailsToken='" + this.KN + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }

    Wre(String str) {
        ArrayList arrayList;
        this.f47579n = str;
        JSONObject jSONObject = new JSONObject(str);
        this.rl = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f47580t = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.nr = strOptString2;
        if (!TextUtils.isEmpty(strOptString)) {
            if (!TextUtils.isEmpty(strOptString2)) {
                this.f47578O = jSONObject.optString("title");
                this.J2 = jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                this.Uo = jSONObject.optString("description");
                jSONObject.optString("packageDisplayName");
                jSONObject.optString("iconUrl");
                this.KN = jSONObject.optString("skuDetailsToken");
                this.xMQ = jSONObject.optString("serializedDocid");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        arrayList2.add(new I28(jSONArrayOptJSONArray.getJSONObject(i2)));
                    }
                    this.mUb = arrayList2;
                } else {
                    if (!strOptString2.equals("subs") && !strOptString2.equals("play_pass_subs")) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                    }
                    this.mUb = arrayList;
                }
                JSONObject jSONObjectOptJSONObject = this.rl.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray jSONArrayOptJSONArray2 = this.rl.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                        arrayList3.add(new n(jSONArrayOptJSONArray2.getJSONObject(i3)));
                    }
                    this.gh = arrayList3;
                    return;
                }
                if (jSONObjectOptJSONObject != null) {
                    arrayList3.add(new n(jSONObjectOptJSONObject));
                    this.gh = arrayList3;
                    return;
                } else {
                    this.gh = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }
}
