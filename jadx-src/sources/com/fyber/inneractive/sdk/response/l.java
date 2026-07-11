package com.fyber.inneractive.sdk.response;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class l extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.nativead.j f56885e;

    @Override // com.fyber.inneractive.sdk.response.b
    public final void a(String str, r0 r0Var) throws Exception {
        com.fyber.inneractive.sdk.response.nativead.j jVar;
        if (this.f56828a == null || (jVar = this.f56885e) == null) {
            throw new Exception("Missing response ".concat(this.f56828a == null ? "data" : pTYaLzzmJSGAPQ.FfFseFwBopQplQ));
        }
        if (r0Var == null) {
            jVar.f56857i = "ErrorConfigurationMismatch";
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.isNull("native")) {
            this.f56885e.f56857i = "ErrorInvalidJsonResponse";
            throw new com.fyber.inneractive.sdk.response.nativead.a("Missing native ad object", "ErrorInvalidJsonResponse");
        }
        try {
            com.fyber.inneractive.sdk.response.nativead.i iVarA = a(jSONObject.optJSONObject("native"));
            com.fyber.inneractive.sdk.response.nativead.k kVar = this.f56885e.f56908Q;
            kVar.f56909K = iVarA;
            if (kVar.d()) {
                a(this.f56885e, r0Var);
            }
        } catch (com.fyber.inneractive.sdk.flow.vast.h e2) {
            if (e2.getCause() != null) {
                this.f56885e.f56857i = e2.getCause().getMessage();
            }
            this.f56885e.f56858j = e2.getMessage();
            throw e2;
        } catch (com.fyber.inneractive.sdk.response.nativead.a e3) {
            if (e3.getCause() != null) {
                this.f56885e.f56857i = e3.getCause().getMessage();
            }
            this.f56885e.f56858j = e3.getMessage();
            IAlog.f("%s: parsing native ad response: error: %s", "NativeAdResponseParser", e3.getMessage());
            throw e3;
        } catch (Exception e4) {
            this.f56885e.f56858j = e4.getMessage();
            com.fyber.inneractive.sdk.response.nativead.j jVar2 = this.f56885e;
            jVar2.f56857i = "ErrorInvalidNativeOrtbObject";
            jVar2.f56871w = e4;
            IAlog.f("%s: parsing native ad response: error: %s", "NativeAdResponseParser", e4.getMessage());
            if (IAlog.f56974a == 2) {
                e4.printStackTrace();
            }
            throw e4;
        }
    }

    public final void a(com.fyber.inneractive.sdk.response.nativead.j jVar, r0 r0Var) {
        com.fyber.inneractive.sdk.response.nativead.e eVarC = jVar.f56908Q.c();
        String str = eVarC != null ? eVarC.f56889a : null;
        if (str != null && !str.isEmpty()) {
            d dVar = new d(false);
            dVar.f56828a = new g();
            dVar.f56832e = this.f56885e;
            dVar.a(str, r0Var);
            return;
        }
        throw new com.fyber.inneractive.sdk.flow.vast.h("Missing vast content", "VastErrorInvalidFile");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.fyber.inneractive.sdk.response.nativead.i a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.has("assets") && !jSONObject.isNull("assets")) {
                if (jSONObject.has("link") && !jSONObject.isNull("link")) {
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("assets");
                    ArrayList arrayList = new ArrayList();
                    if (jSONArrayOptJSONArray != null) {
                        boolean z2 = false;
                        boolean z3 = false;
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                            if (jSONObjectOptJSONObject != null) {
                                com.fyber.inneractive.sdk.response.nativead.f fVar = new com.fyber.inneractive.sdk.response.nativead.f();
                                fVar.f56890a = jSONObjectOptJSONObject.optInt("id");
                                jSONObjectOptJSONObject.optInt("required");
                                fVar.f56895f = com.fyber.inneractive.sdk.response.nativead.parser.c.a(jSONObjectOptJSONObject.optJSONObject("link"));
                                if (jSONObjectOptJSONObject.has("title")) {
                                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("title");
                                    com.fyber.inneractive.sdk.response.nativead.d dVar = new com.fyber.inneractive.sdk.response.nativead.d();
                                    if (jSONObjectOptJSONObject2 != null) {
                                        dVar.f56888a = v.a(jSONObjectOptJSONObject2, "text");
                                        jSONObjectOptJSONObject2.optInt("len");
                                    }
                                    fVar.f56891b = dVar;
                                } else if (jSONObjectOptJSONObject.has("video")) {
                                    if (z2) {
                                        fVar = null;
                                    } else {
                                        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("video");
                                        com.fyber.inneractive.sdk.response.nativead.e eVar = new com.fyber.inneractive.sdk.response.nativead.e();
                                        if (jSONObjectOptJSONObject3 != null) {
                                            eVar.f56889a = v.a(jSONObjectOptJSONObject3, "vasttag");
                                        }
                                        fVar.f56892c = eVar;
                                        z2 = !TextUtils.isEmpty(eVar.f56889a);
                                    }
                                } else if (jSONObjectOptJSONObject.has(com.safedk.android.analytics.brandsafety.l.f62665t)) {
                                    int i3 = fVar.f56890a;
                                    boolean z4 = i3 == 2;
                                    if ((!z4 || !z2) && (z4 || !z3)) {
                                        JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject(com.safedk.android.analytics.brandsafety.l.f62665t);
                                        com.fyber.inneractive.sdk.response.nativead.c cVar = new com.fyber.inneractive.sdk.response.nativead.c();
                                        if (jSONObjectOptJSONObject4 != null) {
                                            jSONObjectOptJSONObject4.optInt("width");
                                            jSONObjectOptJSONObject4.optInt("height");
                                            cVar.f56887a = v.a(jSONObjectOptJSONObject4, "url");
                                        }
                                        if (i3 == 2) {
                                            z2 = !TextUtils.isEmpty(cVar.f56887a);
                                        } else if (i3 == 4) {
                                            z3 = !TextUtils.isEmpty(cVar.f56887a);
                                        }
                                        fVar.f56893d = cVar;
                                    }
                                } else if (jSONObjectOptJSONObject.has("data")) {
                                    JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject("data");
                                    com.fyber.inneractive.sdk.response.nativead.b bVar = new com.fyber.inneractive.sdk.response.nativead.b();
                                    if (jSONObjectOptJSONObject5 != null) {
                                        bVar.f56886a = v.a(jSONObjectOptJSONObject5, "value");
                                    }
                                    fVar.f56894e = bVar;
                                }
                                if (fVar != null) {
                                    arrayList.add(fVar);
                                }
                            }
                        }
                        if (!z2) {
                            throw new com.fyber.inneractive.sdk.response.nativead.a("Missing valid main asset (video/image)", "ErrorNoMainAsset");
                        }
                    }
                    com.fyber.inneractive.sdk.response.nativead.h hVarA = com.fyber.inneractive.sdk.response.nativead.parser.c.a(jSONObject.optJSONObject("link"));
                    if (!TextUtils.isEmpty(hVarA.f56900a)) {
                        String strA = v.a(jSONObject, "jstracker");
                        v.a(jSONObject, "privacy");
                        ArrayList arrayListA = com.fyber.inneractive.sdk.response.nativead.parser.b.a(jSONObject.optJSONArray("imptrackers"));
                        ArrayList arrayListA2 = com.fyber.inneractive.sdk.response.nativead.parser.a.a(jSONObject.optJSONArray("eventtrackers"));
                        com.fyber.inneractive.sdk.response.nativead.i iVar = new com.fyber.inneractive.sdk.response.nativead.i();
                        iVar.f56903a = arrayList;
                        iVar.f56904b = hVarA;
                        iVar.f56906d = strA;
                        iVar.f56905c = arrayListA;
                        iVar.f56907e = arrayListA2;
                        return iVar;
                    }
                    throw new com.fyber.inneractive.sdk.response.nativead.a("Missing url in main link object", "ErrorNoMainLink");
                }
                throw new com.fyber.inneractive.sdk.response.nativead.a("Missing main link object", "ErrorNoMainLink");
            }
            throw new com.fyber.inneractive.sdk.response.nativead.a("Missing assets", "ErrorNoAssets");
        }
        throw new com.fyber.inneractive.sdk.response.nativead.a("Empty native body", "ErrorNoNativeBody");
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final e a() {
        com.fyber.inneractive.sdk.response.nativead.j jVar = new com.fyber.inneractive.sdk.response.nativead.j();
        this.f56828a = jVar;
        this.f56885e = jVar;
        return jVar;
    }
}
