package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.caoccao.javet.exceptions.JavetError;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class m extends o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f53710g;

    public static void a(boolean z2, com.fyber.inneractive.sdk.response.e eVar, InneractiveAdRequest inneractiveAdRequest) {
        String str;
        String spotId = inneractiveAdRequest.getSpotId();
        IAConfigManager iAConfigManager = IAConfigManager.f53260M;
        String str2 = (String) iAConfigManager.f53297w.f53495d.get("KEY_MISSMATCH_STATS_SPOTS");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        if (str2.contains("-" + spotId + "-")) {
            return;
        }
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.t.MISSMATCH_SPOTID, inneractiveAdRequest, eVar);
        if (z2) {
            str = "There is no " + spotId + " spot ID in current app config";
        } else {
            str = "spot ID " + spotId + " is not active in current app config";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(JavetError.PARAMETER_REASON, str);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", JavetError.PARAMETER_REASON, str);
        }
        wVar.f54362f.put(jSONObject);
        wVar.a((String) null);
        iAConfigManager.f53297w.f53495d.put("KEY_MISSMATCH_STATS_SPOTS", str2 + " -" + spotId + "-");
    }

    public m(String str) {
        super(str);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public final void b() {
        IAlog.a("%s onRetry()", IAlog.a(this));
    }

    public final void c(InneractiveAdRequest inneractiveAdRequest) {
        com.fyber.inneractive.sdk.config.q0 q0Var;
        o oVar;
        com.fyber.inneractive.sdk.config.t0 t0Var;
        UnitDisplayType unitDisplayType;
        n nVar;
        if (!InneractiveAdManager.wasInitialized() && (nVar = this.f53789b) != null) {
            ((e0) nVar).a(inneractiveAdRequest, c(), new InneractiveInfrastructureError(InneractiveErrorCode.SDK_NOT_INITIALIZED, i.NO_APP_CONFIG_AVAILABLE));
        }
        String spotId = inneractiveAdRequest.getSpotId();
        IAConfigManager iAConfigManager = IAConfigManager.f53260M;
        HashMap map = iAConfigManager.f53275a;
        if (map != null && map.containsKey(spotId)) {
            q0Var = (com.fyber.inneractive.sdk.config.q0) iAConfigManager.f53275a.get(spotId);
        } else {
            q0Var = null;
        }
        com.fyber.inneractive.sdk.response.e eVarC = c();
        if (q0Var != null && !q0Var.f53414b) {
            a(false, eVarC, inneractiveAdRequest);
            ((e0) this.f53789b).a(inneractiveAdRequest, c(), new InneractiveInfrastructureError(InneractiveErrorCode.SPOT_DISABLED, i.NO_APP_CONFIG_AVAILABLE));
            return;
        }
        if (q0Var != null && q0Var.f53413a.iterator().hasNext()) {
            com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) q0Var.f53413a.get(0);
            if (r0Var.f53419e == null && (r0Var.f53417c != null || ((t0Var = r0Var.f53420f) != null && ((unitDisplayType = t0Var.f53480j) == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.REWARDED)))) {
                com.fyber.inneractive.sdk.config.global.r rVarA = com.fyber.inneractive.sdk.config.global.r.a();
                this.f53790c = rVarA;
                rVarA.a(false, inneractiveAdRequest.getSpotId());
                com.fyber.inneractive.sdk.network.s sVar = new com.fyber.inneractive.sdk.network.s(inneractiveAdRequest, inneractiveAdRequest.f53932b, this.f53790c, this);
                this.f53791d = sVar;
                sVar.f54286b = false;
                IAlog.a("IARemoteAdFetcher: requestAd called", new Object[0]);
                if (TextUtils.isEmpty(inneractiveAdRequest.getSpotId())) {
                    IAlog.b("appID is null or empty. Please provide a valid appID and re-try.", new Object[0]);
                } else if (!com.fyber.inneractive.sdk.util.o.a("android.permission.INTERNET")) {
                    IAlog.b("INTERNET permission is missing. Please add it to the Manifest and re-try, otherwise ads will not be requested and displayed! ", new Object[0]);
                } else {
                    if (!com.fyber.inneractive.sdk.util.o.a("android.permission.ACCESS_NETWORK_STATE")) {
                        IAlog.b("It is recommended to add ACCESS_NETWORK_STATE permission to the Manifest for better targetting", new Object[0]);
                    }
                    if (!com.fyber.inneractive.sdk.util.o.a("android.permission.READ_PHONE_STATE")) {
                        IAlog.f("It is recomended to add the READ_PHONE_STATE permission to the manifest for better targetting", new Object[0]);
                    }
                    iAConfigManager.f53292r.a(sVar.f54310f);
                    return;
                }
                InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.INVALID_INPUT, i.VALIDATE_PARAMS_FAILED, new Exception("appID is null or empty or INTERNET permission is missing"));
                if (!sVar.f54286b && (oVar = sVar.f54285a) != null) {
                    oVar.a(inneractiveAdRequest, null, inneractiveInfrastructureError);
                    return;
                }
                return;
            }
            ((e0) this.f53789b).a(inneractiveAdRequest, c(), new InneractiveInfrastructureError(InneractiveErrorCode.UNSUPPORTED_SPOT, i.NO_APP_CONFIG_AVAILABLE));
            return;
        }
        if (q0Var == null) {
            a(true, eVarC, inneractiveAdRequest);
            IAConfigManager.a();
        }
        IAlog.f("************************************************************************************************************************", new Object[0]);
        IAlog.f("*** Requested spot id '%s' doesn't exist within this application config - application Id: '%s'", inneractiveAdRequest.getSpotId(), iAConfigManager.f53277c);
        IAlog.f("*** Are you sure that you are using the correct application and spot ids, as defined for this application in the Inneractive console?", new Object[0]);
        IAlog.f("************************************************************************************************************************", new Object[0]);
        ((e0) this.f53789b).a(inneractiveAdRequest, eVarC, new InneractiveInfrastructureError(InneractiveErrorCode.ERROR_CONFIGURATION_NO_SUCH_SPOT, i.NO_APP_CONFIG_AVAILABLE));
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public final String d() {
        return IAlog.a(this);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public final void a() {
        IAlog.a("%s onTimeout()", IAlog.a(this));
    }
}
