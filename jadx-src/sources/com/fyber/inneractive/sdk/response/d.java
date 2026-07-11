package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.model.vast.a0;
import com.fyber.inneractive.sdk.model.vast.r;
import com.fyber.inneractive.sdk.model.vast.u;
import com.fyber.inneractive.sdk.model.vast.y;
import com.fyber.inneractive.sdk.model.vast.z;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.s;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f56832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r0 f56833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.model.vast.f f56834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f56835h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f56836i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z f56837j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f56838k;

    public d() {
        this.f56838k = true;
        this.f56835h = new ArrayList();
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final e a() {
        g gVar = new g();
        this.f56828a = gVar;
        this.f56832e = gVar;
        return gVar;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final boolean b() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public final void a(String str, r0 r0Var) {
        this.f56833f = r0Var;
        if (r0Var != null && r0Var.f53420f != null) {
            this.f56832e.f56876K = System.currentTimeMillis();
            this.f56832e.f56874z = this.f56833f.f53416b;
            this.f56836i = IAConfigManager.f53260M.f53283i.f53394b;
            try {
                a(str, 0);
                a(this.f56834g, this.f56835h);
                return;
            } catch (com.fyber.inneractive.sdk.flow.vast.h e2) {
                this.f56832e.f56857i = e2.getMessage();
                this.f56832e.f56858j = e2.getCause().getMessage();
                return;
            } catch (InterruptedException e3) {
                throw e3;
            } catch (Exception e4) {
                this.f56832e.f56858j = e4.getMessage();
                g gVar = this.f56832e;
                gVar.f56857i = "VastErrorInvalidFile";
                gVar.f56871w = e4;
                if (IAlog.f56974a == 2) {
                    e4.printStackTrace();
                    return;
                }
                return;
            }
        }
        this.f56828a.f56857i = "ErrorConfigurationMismatch";
    }

    public d(boolean z2) {
        this();
        this.f56838k = z2;
    }

    public final void a(String str, int i2) throws Exception {
        u uVarA;
        try {
            String strReplaceFirst = str.replaceFirst("<\\?.*\\?>", "");
            DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
            documentBuilderFactoryNewInstance.setCoalescing(true);
            Document document = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(new InputSource(new StringReader(strReplaceFirst)));
            if (document != null) {
                Node firstChild = document.getFirstChild();
                if (firstChild.getNodeName().equalsIgnoreCase("VAST")) {
                    uVarA = u.a(firstChild);
                } else {
                    IAlog.a("XML does not contain a VAST tag as its first child!", new Object[0]);
                    throw new Exception("XML does not contain a VAST tag as its first child!");
                }
            } else {
                uVarA = null;
            }
            try {
                if (this.f56837j == null) {
                    this.f56837j = new z(uVarA.f54175a);
                } else {
                    z zVar = new z(uVarA.f54175a);
                    if (zVar.compareTo(this.f56837j) >= 0) {
                        this.f56837j = zVar;
                    }
                }
            } catch (y unused) {
            }
            ArrayList arrayList = uVarA.f54176b;
            if (arrayList != null && !arrayList.isEmpty()) {
                com.fyber.inneractive.sdk.model.vast.f fVar = (com.fyber.inneractive.sdk.model.vast.f) arrayList.get(0);
                a0 a0Var = fVar.f54133b;
                if (a0Var != null) {
                    IAlog.a("Vast response parser: found VAST wrapper #%d", Integer.valueOf(this.f56835h.size()));
                    int size = this.f56835h.size();
                    int i3 = this.f56836i;
                    if (size < i3) {
                        this.f56835h.add(fVar);
                        String str2 = a0Var.f54102i;
                        if (!TextUtils.isEmpty(str2)) {
                            if (h0.f(str2)) {
                                String strA = s.a(str2, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, 5000);
                                if (!TextUtils.isEmpty(strA)) {
                                    int i5 = this.f56836i - i2;
                                    if (i5 > 0) {
                                        a0Var.f54140f = i5;
                                        this.f56832e.f56881P.put(str2, strA);
                                        a(strA, i2 + 1);
                                        return;
                                    }
                                    throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "Invalid level for wrapper");
                                }
                                throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "Failed getting data from ad tag URI");
                            }
                            IAlog.a("Vast response parser: Unsecure Wrapper URL. Aborting! url: %s", str2);
                            throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorUnsecure", "Unsecure ad tag URI for wrapper");
                        }
                        IAlog.a("Vast response parser: found an empty tag uri in wrapper! aborting!", new Object[0]);
                        throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "No ad tag URI for wrapper");
                    }
                    IAlog.a("Vast response parser: too many vast wrappers! Only %d allowed. stopping", Integer.valueOf(i3));
                    throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorTooManyWrappers", "More than " + this.f56836i + " found");
                }
                if (fVar.f54134c != null) {
                    this.f56834g = fVar;
                    return;
                }
                throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", "A top level ad with no wrapper on inline found!");
            }
            IAlog.a("Vast response parser: no ads found in model. aborting", new Object[0]);
            throw new com.fyber.inneractive.sdk.flow.vast.h("ErrorNoMediaFiles", "No ads found in model. Empty Vast?");
        } catch (Exception e2) {
            IAlog.a("Failed parsing Vast file! parsing error = %s", e2.getMessage());
            throw new com.fyber.inneractive.sdk.flow.vast.h("VastErrorInvalidFile", e2.getMessage());
        }
    }

    public final void a(com.fyber.inneractive.sdk.model.vast.f fVar, List list) {
        String str;
        com.fyber.inneractive.sdk.flow.vast.c cVar = new com.fyber.inneractive.sdk.flow.vast.c(this.f56838k);
        int iIntValue = this.f56833f.f53420f.f53473c.intValue();
        int iIntValue2 = this.f56833f.f53420f.f53472b.intValue();
        int iIntValue3 = this.f56833f.f53420f.f53477g.intValue();
        cVar.f53940b = iIntValue;
        cVar.f53941c = iIntValue2;
        cVar.f53942d = iIntValue3;
        if (UnitDisplayType.VERTICAL.equals(this.f56833f.f53420f.f53480j)) {
            cVar.f53943e = true;
        }
        if (this.f56833f.f53420f.f53481k.contains(2)) {
            cVar.f53944f = true;
        }
        try {
            z zVar = this.f56837j;
            if (zVar == null) {
                str = "";
            } else {
                str = zVar.f54190b;
            }
            this.f56832e.f56877L = cVar.a(fVar, list, str);
        } catch (com.fyber.inneractive.sdk.flow.vast.h e2) {
            g gVar = this.f56832e;
            gVar.getClass();
            gVar.f56857i = e2.getMessage();
        }
        com.fyber.inneractive.sdk.model.vast.b bVar = this.f56832e.f56877L;
        if (bVar != null) {
            String str2 = bVar.f54116n;
            if (!TextUtils.isEmpty(str2) && h0.f(str2)) {
                w wVar = new w(com.fyber.inneractive.sdk.network.u.VAST_EVENT_DVC_DETECTED, (InneractiveAdRequest) null, this.f56828a);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("templateURL", str2);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str2);
                }
                wVar.f54362f.put(jSONObject);
                wVar.a((String) null);
            } else if (!TextUtils.isEmpty(str2)) {
                this.f56832e.f56877L.f54116n = "";
                com.fyber.inneractive.sdk.network.events.a.a(t.VAST_ERROR_DVC_FAILURE, com.fyber.inneractive.sdk.network.events.b.SSL_ERROR, (InneractiveAdRequest) null, this.f56828a, "Unsecured URL", str2, Boolean.FALSE);
            }
        }
        g gVar2 = this.f56832e;
        LinkedHashMap linkedHashMap = cVar.f53945g;
        if (linkedHashMap != null) {
            gVar2.f56878M.putAll(linkedHashMap);
        } else {
            gVar2.getClass();
        }
        g gVar3 = this.f56832e;
        ArrayList arrayList = cVar.f53946h;
        if (arrayList != null) {
            gVar3.f56879N.addAll(arrayList);
        } else {
            gVar3.getClass();
        }
        g gVar4 = this.f56832e;
        ArrayList arrayList2 = cVar.f53949k;
        if (arrayList2 != null) {
            gVar4.f56880O.addAll(arrayList2);
        } else {
            gVar4.getClass();
        }
        if (IAlog.f56974a == 2) {
            LinkedHashMap linkedHashMap2 = cVar.f53945g;
            if (linkedHashMap2.size() > 0) {
                IAlog.e(" VParser: Unsupported media files:", new Object[0]);
                for (r rVar : linkedHashMap2.keySet()) {
                    IAlog.e("VParser: %s", rVar);
                    IAlog.e("VParser: reason = %s", linkedHashMap2.get(rVar));
                }
                return;
            }
            IAlog.e("VParser: Unsupported media files: none", new Object[0]);
        }
    }
}
