package com.fyber.inneractive.sdk.flow.endcard.loaders.companion;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.caoccao.javet.exceptions.JavetError;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.endcard.v;
import com.fyber.inneractive.sdk.flow.endcard.w;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.model.vast.k;
import com.fyber.inneractive.sdk.network.d1;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.response.g;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class d implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f53626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a f53627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f53628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f53629d;

    public d(e eVar, v vVar, com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        this.f53629d = eVar;
        this.f53628c = vVar;
        this.f53626a = (w) vVar.f();
        this.f53627b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    @Override // com.fyber.inneractive.sdk.network.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Exception exc, boolean z2) {
        boolean zEqualsIgnoreCase;
        Bitmap bitmap;
        d1 d1Var = (d1) obj;
        if (exc == null && d1Var != null && d1Var.f54239b == null && (bitmap = d1Var.f54238a) != null) {
            w wVar = this.f53626a;
            Bitmap bitmap2 = wVar.f53664c;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            wVar.f53664c = bitmap;
            wVar.f53665d.setImageBitmap(bitmap);
            e eVar = this.f53629d;
            v vVar = this.f53628c;
            eVar.getClass();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObjectA = vVar.f53592g.a();
            try {
                jSONObject.put("companion_data", jSONObjectA);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "companion_data", jSONObjectA);
            }
            x0 x0Var = vVar.f53588c;
            u uVar = u.VAST_COMPANION_LOADED;
            InneractiveAdRequest inneractiveAdRequest = x0Var.f53985c;
            g gVar = x0Var.f53986d;
            JSONArray jSONArray = x0Var.f53988f;
            com.fyber.inneractive.sdk.network.w wVar2 = new com.fyber.inneractive.sdk.network.w(gVar);
            wVar2.f54359c = uVar;
            wVar2.f54357a = inneractiveAdRequest;
            wVar2.f54360d = jSONArray;
            wVar2.f54362f.put(jSONObject);
            wVar2.a((String) null);
            this.f53627b.a();
            return;
        }
        String str = d1Var != null ? d1Var.f54239b : null;
        e eVar2 = this.f53629d;
        v vVar2 = this.f53628c;
        eVar2.getClass();
        IAlog.a("%s sending VAST_COMPANION_FAILED_LOADING event", "StaticCompanionEndCardLoader");
        JSONObject jSONObject2 = new JSONObject();
        String strA = TextUtils.isEmpty(str) ? com.fyber.inneractive.sdk.util.v.a(exc) : str;
        if (!TextUtils.isEmpty(strA)) {
            try {
                jSONObject2.put(JavetError.PARAMETER_REASON, strA);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", JavetError.PARAMETER_REASON, strA);
            }
        }
        JSONObject jSONObjectA2 = vVar2.f53592g.a();
        try {
            jSONObject2.put("companion_data", jSONObjectA2);
        } catch (Exception unused3) {
            IAlog.f("Got exception adding param to json object: %s, %s", "companion_data", jSONObjectA2);
        }
        x0 x0Var2 = vVar2.f53588c;
        t tVar = t.VAST_COMPANION_FAILED_LOADING;
        InneractiveAdRequest inneractiveAdRequest2 = x0Var2.f53985c;
        g gVar2 = x0Var2.f53986d;
        JSONArray jSONArray2 = x0Var2.f53988f;
        com.fyber.inneractive.sdk.network.w wVar3 = new com.fyber.inneractive.sdk.network.w(gVar2);
        wVar3.f54358b = tVar;
        wVar3.f54357a = inneractiveAdRequest2;
        wVar3.f54360d = jSONArray2;
        wVar3.f54362f.put(jSONObject2);
        wVar3.a((String) null);
        this.f53627b.a(str);
        v vVar3 = this.f53628c;
        String str2 = vVar3.f53592g.f54124f;
        k kVar = vVar3.f53663h;
        if (TextUtils.isEmpty(str2)) {
            zEqualsIgnoreCase = false;
        } else {
            zEqualsIgnoreCase = true;
            String strSubstring = str2.substring(str2.lastIndexOf(46) + 1);
            if (!kVar.extension.equalsIgnoreCase(strSubstring)) {
                k kVar2 = k.Jpeg;
                if (kVar == kVar2) {
                    zEqualsIgnoreCase = k.Jpg.extension.equalsIgnoreCase(strSubstring);
                } else if (kVar == k.Jpg) {
                    zEqualsIgnoreCase = kVar2.extension.equalsIgnoreCase(strSubstring);
                }
            }
        }
        if (zEqualsIgnoreCase) {
            return;
        }
        x0 x0Var3 = this.f53628c.f53588c;
        t tVar2 = t.VAST_COMPANION_INCOMPATIBLE_MIMETYPE;
        InneractiveAdRequest inneractiveAdRequest3 = x0Var3.f53985c;
        g gVar3 = x0Var3.f53986d;
        JSONArray jSONArray3 = x0Var3.f53988f;
        com.fyber.inneractive.sdk.network.w wVar4 = new com.fyber.inneractive.sdk.network.w(gVar3);
        wVar4.f54358b = tVar2;
        wVar4.f54357a = inneractiveAdRequest3;
        wVar4.f54360d = jSONArray3;
        wVar4.a((String) null);
    }
}
