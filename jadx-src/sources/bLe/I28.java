package bLe;

import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import androidx.privacysandbox.ads.adservices.customaudience.Q;
import androidx.privacysandbox.ads.adservices.customaudience.UGc;
import androidx.privacysandbox.ads.adservices.customaudience.s4;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class I28 {
    private static EV2.j J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static CustomAudienceManager f43263O;
    private static String Uo;
    private static boolean nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f43265t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I28 f43264n = new I28();
    private static final String rl = "Fledge: " + I28.class.getSimpleName();

    public static final class j implements OutcomeReceiver {
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void onError(Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Log.e(I28.rl(), error.toString());
            EV2.j jVarN = I28.n();
            if (jVarN == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                jVarN = null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_pa_failed_reason", error.toString());
            Unit unit = Unit.INSTANCE;
            jVarN.rl("gps_pa_failed", bundle);
        }

        public void onResult(Object result) {
            Intrinsics.checkNotNullParameter(result, "result");
            Log.i(I28.rl(), "Successfully joined custom audience");
            EV2.j jVarN = I28.n();
            if (jVarN == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                jVarN = null;
            }
            jVarN.rl("gps_pa_succeed", null);
        }

        j() {
        }
    }

    private final void J2(String str, String str2) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            String strUo = Uo(str, str2);
            if (strUo == null) {
                return;
            }
            EV2.j jVar = null;
            try {
                OutcomeReceiver outcomeReceiverN = androidx.core.os.j.n(new j());
                bLe.j.n();
                AdData.Builder builderN = androidx.privacysandbox.ads.adservices.common.j.n();
                StringBuilder sb = new StringBuilder();
                String str3 = Uo;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                    str3 = null;
                }
                sb.append(str3);
                sb.append("/ad");
                Uri uri = Uri.parse(sb.toString());
                Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.parse(this)");
                AdData adDataBuild = builderN.setRenderUri(uri).setMetadata("{'isRealAd': false}").build();
                Intrinsics.checkNotNullExpressionValue(adDataBuild, "Builder()\n              …\n                .build()");
                n.n();
                TrustedBiddingData.Builder builderN2 = s4.n();
                StringBuilder sb2 = new StringBuilder();
                String str4 = Uo;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                    str4 = null;
                }
                sb2.append(str4);
                sb2.append("?trusted_bidding");
                Uri uri2 = Uri.parse(sb2.toString());
                Intrinsics.checkExpressionValueIsNotNull(uri2, "Uri.parse(this)");
                TrustedBiddingData trustedBiddingDataBuild = builderN2.setTrustedBiddingUri(uri2).setTrustedBiddingKeys(CollectionsKt.listOf("")).build();
                Intrinsics.checkNotNullExpressionValue(trustedBiddingDataBuild, "Builder()\n              …\n                .build()");
                w6.n();
                CustomAudience.Builder buyer = Q.n().setName(strUo).setBuyer(AdTechIdentifier.fromString("facebook.com"));
                StringBuilder sb3 = new StringBuilder();
                String str5 = Uo;
                if (str5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                    str5 = null;
                }
                sb3.append(str5);
                sb3.append("?daily&app_id=");
                sb3.append(str);
                Uri uri3 = Uri.parse(sb3.toString());
                Intrinsics.checkExpressionValueIsNotNull(uri3, "Uri.parse(this)");
                CustomAudience.Builder dailyUpdateUri = buyer.setDailyUpdateUri(uri3);
                StringBuilder sb4 = new StringBuilder();
                String str6 = Uo;
                if (str6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                    str6 = null;
                }
                sb4.append(str6);
                sb4.append("?bidding");
                Uri uri4 = Uri.parse(sb4.toString());
                Intrinsics.checkExpressionValueIsNotNull(uri4, "Uri.parse(this)");
                CustomAudience customAudienceBuild = dailyUpdateUri.setBiddingLogicUri(uri4).setTrustedBiddingData(trustedBiddingDataBuild).setUserBiddingSignals(AdSelectionSignals.fromString(JsonUtils.EMPTY_JSON)).setAds(CollectionsKt.listOf(adDataBuild)).build();
                Intrinsics.checkNotNullExpressionValue(customAudienceBuild, "Builder()\n              …(listOf(dummyAd)).build()");
                Ml.n();
                JoinCustomAudienceRequest joinCustomAudienceRequestBuild = UGc.n().setCustomAudience(customAudienceBuild).build();
                Intrinsics.checkNotNullExpressionValue(joinCustomAudienceRequestBuild, "Builder().setCustomAudience(ca).build()");
                CustomAudienceManager customAudienceManager = f43263O;
                if (customAudienceManager != null) {
                    customAudienceManager.joinCustomAudience(joinCustomAudienceRequestBuild, Executors.newSingleThreadExecutor(), outcomeReceiverN);
                }
            } catch (Error e2) {
                Log.w(rl, "Failed to join Custom Audience: " + e2);
                EV2.j jVar2 = J2;
                if (jVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    jVar = jVar2;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_pa_failed_reason", e2.toString());
                Unit unit = Unit.INSTANCE;
                jVar.rl("gps_pa_failed", bundle);
            } catch (Exception e3) {
                Log.w(rl, "Failed to join Custom Audience: " + e3);
                EV2.j jVar3 = J2;
                if (jVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    jVar = jVar3;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_pa_failed_reason", e3.toString());
                Unit unit2 = Unit.INSTANCE;
                jVar.rl("gps_pa_failed", bundle2);
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    public static final /* synthetic */ EV2.j n() {
        if (VmF.j.nr(I28.class)) {
            return null;
        }
        try {
            return J2;
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
            return null;
        }
    }

    public static final /* synthetic */ String rl() {
        if (VmF.j.nr(I28.class)) {
            return null;
        }
        try {
            return rl;
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
            return null;
        }
    }

    public static final void t() {
        String string;
        if (VmF.j.nr(I28.class)) {
            return;
        }
        try {
            nr = true;
            Context contextQie = com.facebook.s4.qie();
            J2 = new EV2.j(contextQie);
            Uo = "https://www." + com.facebook.s4.XQ() + "/privacy_sandbox/pa/logic";
            EV2.j jVar = null;
            try {
                try {
                    CustomAudienceManager customAudienceManager = CustomAudienceManager.get(contextQie);
                    f43263O = customAudienceManager;
                    if (customAudienceManager != null) {
                        f43265t = true;
                    }
                    string = null;
                } catch (Exception e2) {
                    string = e2.toString();
                    Log.w(rl, "Failed to get CustomAudienceManager: " + e2);
                }
            } catch (Error e3) {
                string = e3.toString();
                Log.w(rl, "Failed to get CustomAudienceManager: " + e3);
            }
            if (f43265t) {
                return;
            }
            EV2.j jVar2 = J2;
            if (jVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
            } else {
                jVar = jVar2;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_pa_failed_reason", string);
            Unit unit = Unit.INSTANCE;
            jVar.rl("gps_pa_failed", bundle);
        } catch (Throwable th) {
            VmF.j.rl(th, I28.class);
        }
    }

    private I28() {
    }

    private final String Uo(String str, String str2) {
        if (!VmF.j.nr(this) && str != null && str2 != null) {
            try {
                if (!Intrinsics.areEqual(str2, "_removed_") && !StringsKt.contains$default((CharSequence) str2, (CharSequence) "gps", false, 2, (Object) null)) {
                    return str + '@' + str2 + '@' + (System.currentTimeMillis() / ((long) 1000)) + "@1";
                }
                return null;
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
        return null;
    }

    public final void O(String str, String str2) {
        if (!VmF.j.nr(this)) {
            try {
                if (!nr) {
                    t();
                }
                if (!f43265t) {
                    return;
                }
                J2(str, str2);
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    public final void nr(String str, com.facebook.appevents.Ml ml) {
        if (!VmF.j.nr(this)) {
            try {
                if (!nr) {
                    t();
                }
                if (f43265t) {
                    String string = null;
                    if (ml != null) {
                        try {
                            JSONObject jSONObjectT = ml.t();
                            if (jSONObjectT != null) {
                                string = jSONObjectT.getString("_eventName");
                            }
                        } catch (JSONException unused) {
                            Log.w(rl, "Failed to get event name from event.");
                        }
                    }
                    J2(str, string);
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }
}
