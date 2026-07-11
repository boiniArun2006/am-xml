package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f54345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f54346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f54347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f54348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f54349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f54350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f54351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w f54352h;

    public v(w wVar, y yVar, String str, String str2, String str3, String str4, Integer num, String str5) {
        this.f54352h = wVar;
        this.f54345a = yVar;
        this.f54346b = str;
        this.f54347c = str2;
        this.f54348d = str3;
        this.f54349e = str4;
        this.f54350f = num;
        this.f54351g = str5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strA;
        HashMap map;
        com.fyber.inneractive.sdk.response.e eVar;
        w wVar = this.f54352h;
        t tVar = wVar.f54358b;
        if (tVar != null) {
            this.f54345a.a(Integer.valueOf(tVar.val), "err");
            this.f54352h.f54358b.getClass();
            strA = r1.ERROR_TABLE.a();
            IAlog.a("Event dispatcher - dispatching error: %s", this.f54352h.f54358b);
            IAlog.d("%s %s", "DISPATCHED_SDK_ERROR", Integer.valueOf(this.f54352h.f54358b.val));
        } else {
            u uVar = wVar.f54359c;
            if (uVar != null) {
                this.f54345a.a(Integer.valueOf(uVar.val), com.safedk.android.analytics.events.a.f62811a);
                this.f54352h.f54359c.getClass();
                strA = r1.EVENT_TABLE.a();
                IAlog.a("Event dispatcher - dispatching event: %s", this.f54352h.f54359c);
                IAlog.d("%s %s", "DISPATCHED_SDK_EVENT", Integer.valueOf(this.f54352h.f54359c.val));
            } else {
                strA = null;
            }
        }
        y yVar = this.f54345a;
        StringBuilder sb = new StringBuilder();
        sb.append(strA);
        w wVar2 = this.f54352h;
        t tVar2 = wVar2.f54358b;
        sb.append(tVar2 != null ? String.valueOf(tVar2.val) : String.valueOf(wVar2.f54359c.val));
        yVar.a(sb.toString(), "table");
        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        this.f54345a.a(Long.valueOf(calendar.getTimeInMillis()), "date_created");
        if (!IAConfigManager.c()) {
            this.f54345a.a(this.f54346b, "contentid");
            this.f54345a.a(this.f54347c, "fairbidv");
            if (!TextUtils.isEmpty(this.f54348d)) {
                this.f54345a.a(this.f54348d, "placement_type");
            }
            if (!TextUtils.isEmpty(this.f54349e)) {
                this.f54345a.a(this.f54349e, "spot_id");
            }
            if (!InneractiveAdManager.isCurrentUserAChild()) {
                String strI = com.fyber.inneractive.sdk.util.k.i();
                if (!TextUtils.isEmpty(strI)) {
                    this.f54345a.a(strI, "ciso");
                }
            }
            this.f54345a.a(this.f54350f, "ad_type");
            if (this.f54352h.f54363g && !TextUtils.isEmpty(this.f54351g)) {
                this.f54345a.f54370c = this.f54351g;
            }
            this.f54345a.a(com.fyber.inneractive.sdk.util.a1.a().b(), com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j);
            try {
                this.f54345a.a(w.f54356h.format(calendar.getTime()), "day");
            } catch (Throwable unused) {
            }
            this.f54345a.a(Integer.valueOf(calendar.get(11)), "hour");
            JSONArray jSONArray = this.f54352h.f54360d;
            if (jSONArray != null && jSONArray.length() > 0) {
                this.f54345a.a(this.f54352h.f54360d, "experiments");
            }
            com.fyber.inneractive.sdk.response.e eVar2 = this.f54352h.f54361e;
            if (eVar2 != null && eVar2.f56839A) {
                this.f54345a.a("1", "sdk_bidding");
            }
            if (InneractiveAdManager.isCurrentUserAChild()) {
                this.f54345a.a("1", "child_mode");
            }
            IAConfigManager iAConfigManager = IAConfigManager.f53260M;
            this.f54345a.a(iAConfigManager.f53266D.n() && (eVar = this.f54352h.f54361e) != null && eVar.f56843E != com.fyber.inneractive.sdk.ignite.m.NONE ? "1" : HrvQKfmFZJudBc.rHDqsJCx, "ignite");
            y yVar2 = this.f54345a;
            com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.f53266D.f54026p;
            yVar2.a(lVar != null ? lVar.f74139a.d() : null, "ignitep");
            y yVar3 = this.f54345a;
            com.fyber.inneractive.sdk.ignite.l lVar2 = iAConfigManager.f53266D.f54026p;
            yVar3.a(lVar2 != null ? lVar2.f74139a.i() : null, "ignitev");
            JSONArray jSONArrayB = iAConfigManager.f53273K.b();
            if (jSONArrayB != null && jSONArrayB.length() > 0) {
                this.f54345a.a(jSONArrayB, "s_experiments");
            }
            JSONArray jSONArray2 = this.f54352h.f54362f;
            if (jSONArray2 != null && jSONArray2.length() > 0) {
                int i2 = 0;
                while (true) {
                    if (i2 >= jSONArray2.length()) {
                        break;
                    }
                    if (jSONArray2.optJSONObject(i2).length() >= 1) {
                        this.f54345a.a(this.f54352h.f54362f, "extra");
                        break;
                    }
                    i2++;
                }
            }
            com.fyber.inneractive.sdk.response.e eVar3 = this.f54352h.f54361e;
            if (eVar3 != null && eVar3.f56847I) {
                this.f54345a.a("1", "dynamic_controls");
            }
        }
        y yVar4 = this.f54345a;
        yVar4.getClass();
        if (TextUtils.isEmpty(yVar4.f54368a) || (map = yVar4.f54369b) == null || map.size() == 0) {
            return;
        }
        f fVar = IAConfigManager.f53260M.f53268F;
        fVar.getClass();
        JSONObject jSONObject = new JSONObject();
        HashMap map2 = yVar4.f54369b;
        for (String str : map2.keySet()) {
            Object obj = map2.get(str);
            if (obj != null) {
                try {
                    jSONObject.put(str, obj);
                } catch (JSONException unused2) {
                }
            }
        }
        String strSubstring = yVar4.f54370c;
        if (strSubstring != null) {
            int length = strSubstring.length();
            if (length > 51200) {
                int iIndexOf = strSubstring.indexOf("iawrapper");
                if (iIndexOf == -1) {
                    iIndexOf = 0;
                }
                strSubstring = strSubstring.substring(iIndexOf, 51199);
                IAlog.a("Sdk event dispatcher: message size %d is too long! trimming message to %d Characters", Integer.valueOf(length), 51200);
            }
            try {
                jSONObject.put("ad", strSubstring);
            } catch (JSONException e2) {
                IAlog.a("Failed inserting ad body to json", e2, new Object[0]);
            }
        }
        if (IAlog.f56974a == 1) {
            try {
                IAlog.d("%s, Event: %s", "SDK_EVENT", jSONObject.toString());
            } catch (Throwable unused3) {
            }
        }
        fVar.f54246a.offer(jSONObject);
        if (fVar.f54246a.size() > 30) {
            com.fyber.inneractive.sdk.util.d1 d1Var = fVar.f54249d;
            if (d1Var != null && d1Var.hasMessages(12312329)) {
                fVar.f54249d.removeMessages(12312329);
            }
            com.fyber.inneractive.sdk.util.d1 d1Var2 = fVar.f54249d;
            if (d1Var2 != null) {
                d1Var2.post(new c(fVar, 12312329, 0L));
            }
        }
    }
}
