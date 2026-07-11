package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.caoccao.javet.values.primitive.V8ValueBoolean;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.w1;
import com.google.android.gms.common.internal.safeparcel.GkWI.KfLR;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f54135a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f54139e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v f54141g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f54138d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54140f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f54142h = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f54136b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f54137c = new ArrayList();

    public final void a(Node node) {
        w wVar;
        Node nodeD = w1.d(node, "AdVerifications");
        if (nodeD != null) {
            for (Node node2 : w1.c(nodeD, "Verification")) {
                com.fyber.inneractive.sdk.measurement.h hVar = null;
                if (node2 != null) {
                    com.fyber.inneractive.sdk.measurement.h hVar2 = new com.fyber.inneractive.sdk.measurement.h();
                    hVar2.f54058e = w1.b(node2, "vendor");
                    Node nodeD2 = w1.d(node2, "JavaScriptResource");
                    if (nodeD2 != null) {
                        hVar2.f54060g = true;
                        try {
                            hVar2.f54059f = w1.a(nodeD2);
                            hVar2.f54055b = w1.b(nodeD2, KfLR.Uiyr);
                            hVar2.f54054a = new URL(hVar2.f54059f);
                        } catch (MalformedURLException unused) {
                        }
                    }
                    Node nodeD3 = w1.d(node2, "TrackingEvents");
                    if (nodeD3 != null) {
                        for (Node node3 : w1.c(nodeD3, "Tracking")) {
                            if (node3 == null) {
                                wVar = null;
                            } else {
                                wVar = new w();
                                wVar.f54186a = w1.b(node3, com.safedk.android.analytics.events.a.f62811a);
                                wVar.f54187b = w1.a(node3);
                                wVar.f54188c = w1.b(node3, "offset");
                            }
                            if (node3 != null && wVar.f54186a.equalsIgnoreCase("verificationNotExecuted")) {
                                hVar2.a(x.EVENT_VERIFICATION_NOT_EXECUTED, wVar.f54187b);
                            }
                        }
                    }
                    Node nodeD4 = w1.d(node2, "VerificationParameters");
                    if (nodeD4 != null) {
                        hVar2.f54057d = w1.a(nodeD4);
                    }
                    hVar = hVar2;
                }
                if (hVar != null) {
                    IAlog.a("Verification Found - %s", hVar.toString());
                    this.f54138d.add(hVar);
                }
            }
        }
    }

    public void b(Node node) {
        Node nodeD;
        NodeList childNodes;
        NodeList childNodes2;
        m mVar;
        Iterator it;
        h hVar;
        Iterator it2;
        w wVar;
        w wVar2;
        Iterator it3;
        Iterator it4;
        r rVar;
        g gVar = this;
        Node nodeD2 = w1.d(node, "AdSystem");
        if (nodeD2 != null) {
            w1.b(nodeD2, NodeModuleProcess.PROPERTY_VERSION);
            w1.a(nodeD2);
        }
        Node nodeD3 = w1.d(node, dpcnwfoVOnrtRA.npyENg);
        if (nodeD3 != null) {
            String strA = w1.a(nodeD3);
            if (!TextUtils.isEmpty(strA)) {
                gVar.f54135a = strA;
            }
        }
        Iterator it5 = w1.c(node, "Impression").iterator();
        while (it5.hasNext()) {
            String strA2 = w1.a((Node) it5.next());
            if (!TextUtils.isEmpty(strA2)) {
                gVar.f54136b.add(strA2);
            }
        }
        Node nodeD4 = w1.d(node, "Creatives");
        if (nodeD4 != null) {
            Iterator it6 = w1.c(nodeD4, "Creative").iterator();
            while (it6.hasNext()) {
                Node node2 = (Node) it6.next();
                if (node2 == null) {
                    it = it6;
                    mVar = null;
                } else {
                    mVar = new m();
                    if (TextUtils.isEmpty(w1.b(node2, "AdID"))) {
                        w1.b(node2, "adId");
                    }
                    w1.b(node2, "id");
                    w1.a(node2, "sequence");
                    Node nodeD5 = w1.d(node2, "Linear");
                    if (nodeD5 != null) {
                        q qVar = new q();
                        it = it6;
                        Node nodeD6 = w1.d(nodeD5, "MediaFiles");
                        if (nodeD6 != null) {
                            ArrayList arrayListC = w1.c(nodeD6, "MediaFile");
                            if (!arrayListC.isEmpty()) {
                                qVar.f54163a = new ArrayList();
                                Iterator it7 = arrayListC.iterator();
                                while (it7.hasNext()) {
                                    Node node3 = (Node) it7.next();
                                    if (node3 == null) {
                                        it4 = it7;
                                        rVar = null;
                                    } else {
                                        it4 = it7;
                                        rVar = new r();
                                        rVar.f54168a = w1.b(node3, "delivery");
                                        rVar.f54169b = w1.a(node3, "width");
                                        rVar.f54170c = w1.a(node3, "height");
                                        rVar.f54171d = w1.b(node3, "type");
                                        w1.b(node3, "id");
                                        rVar.f54173f = w1.b(node3, "apiFramework");
                                        rVar.f54172e = w1.a(node3, "bitrate");
                                        String strB = w1.b(node3, "maintainAspectRatio");
                                        if (!TextUtils.isEmpty(strB)) {
                                            try {
                                                Boolean.valueOf(strB);
                                            } catch (Exception unused) {
                                            }
                                        }
                                        String strB2 = w1.b(node3, "scalable");
                                        if (!TextUtils.isEmpty(strB2)) {
                                            try {
                                                Boolean.valueOf(strB2);
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        rVar.f54174g = w1.a(node3);
                                    }
                                    if (rVar != null) {
                                        qVar.f54163a.add(rVar);
                                    }
                                    it7 = it4;
                                }
                            }
                        }
                        Node nodeD7 = w1.d(nodeD5, "VideoClicks");
                        if (nodeD7 != null) {
                            qVar.f54165c = w1.a(w1.d(nodeD7, "ClickThrough"));
                            ArrayList arrayListC2 = w1.c(nodeD7, "ClickTracking");
                            if (!arrayListC2.isEmpty()) {
                                qVar.f54166d = new ArrayList();
                                Iterator it8 = arrayListC2.iterator();
                                while (it8.hasNext()) {
                                    String strA3 = w1.a((Node) it8.next());
                                    if (!TextUtils.isEmpty(strA3)) {
                                        qVar.f54166d.add(strA3);
                                    }
                                }
                            }
                        }
                        Node nodeD8 = w1.d(nodeD5, "TrackingEvents");
                        if (nodeD8 != null) {
                            ArrayList arrayListC3 = w1.c(nodeD8, "Tracking");
                            if (!arrayListC3.isEmpty()) {
                                qVar.f54164b = new ArrayList();
                                Iterator it9 = arrayListC3.iterator();
                                while (it9.hasNext()) {
                                    Node node4 = (Node) it9.next();
                                    if (node4 == null) {
                                        it3 = it9;
                                        wVar2 = null;
                                    } else {
                                        wVar2 = new w();
                                        it3 = it9;
                                        wVar2.f54186a = w1.b(node4, com.safedk.android.analytics.events.a.f62811a);
                                        wVar2.f54187b = w1.a(node4);
                                        wVar2.f54188c = w1.b(node4, "offset");
                                    }
                                    if (wVar2 != null) {
                                        qVar.f54164b.add(wVar2);
                                    }
                                    it9 = it3;
                                }
                            }
                        }
                        Node nodeD9 = w1.d(nodeD5, "Duration");
                        if (nodeD9 != null) {
                            qVar.f54167e = w1.a(nodeD9);
                        }
                        mVar.f54156a = qVar;
                    } else {
                        it = it6;
                    }
                    Node nodeD10 = w1.d(node2, "CompanionAds");
                    if (nodeD10 != null) {
                        j jVar = new j();
                        String strB3 = w1.b(nodeD10, "required");
                        if (!"all".equalsIgnoreCase(strB3)) {
                            "none".equalsIgnoreCase(strB3);
                        }
                        ArrayList arrayListC4 = w1.c(nodeD10, "Companion");
                        jVar.f54153a.clear();
                        Iterator it10 = arrayListC4.iterator();
                        while (it10.hasNext()) {
                            Node node5 = (Node) it10.next();
                            if (node5 == null) {
                                it2 = it10;
                                hVar = null;
                            } else {
                                hVar = new h();
                                hVar.f54143a = w1.a(node5, "width");
                                hVar.f54144b = w1.a(node5, "height");
                                hVar.f54145c = w1.b(node5, "id");
                                w1.b(node5, "apiFramework");
                                w1.a(node5, "expandedWidth");
                                w1.a(node5, "expandedHeight");
                                Node nodeD11 = w1.d(node5, "StaticResource");
                                if (nodeD11 != null) {
                                    l lVar = new l();
                                    it2 = it10;
                                    lVar.f54154a = w1.b(nodeD11, "creativeType");
                                    lVar.f54155b = w1.a(nodeD11);
                                    hVar.f54146d = lVar;
                                } else {
                                    it2 = it10;
                                }
                                Node nodeD12 = w1.d(node5, "HTMLResource");
                                if (nodeD12 != null) {
                                    hVar.f54148f = w1.a(nodeD12);
                                }
                                Node nodeD13 = w1.d(node5, "IFrameResource");
                                if (nodeD13 != null) {
                                    hVar.f54147e = w1.a(nodeD13);
                                }
                                Node nodeD14 = w1.d(node5, "CompanionClickThrough");
                                if (nodeD14 != null) {
                                    hVar.f54149g = w1.a(nodeD14);
                                }
                                hVar.f54150h.clear();
                                ArrayList arrayListC5 = w1.c(node5, "CompanionClickTracking");
                                if (arrayListC5.size() > 0) {
                                    Iterator it11 = arrayListC5.iterator();
                                    while (it11.hasNext()) {
                                        String strA4 = w1.a((Node) it11.next());
                                        if (!TextUtils.isEmpty(strA4)) {
                                            hVar.f54150h.add(strA4);
                                        }
                                    }
                                }
                                hVar.f54152j.clear();
                                Node nodeD15 = w1.d(node5, "TrackingEvents");
                                if (nodeD15 != null) {
                                    ArrayList<Node> arrayListC6 = w1.c(nodeD15, "Tracking");
                                    if (!arrayListC6.isEmpty()) {
                                        for (Node node6 : arrayListC6) {
                                            if (node6 == null) {
                                                wVar = null;
                                            } else {
                                                wVar = new w();
                                                wVar.f54186a = w1.b(node6, com.safedk.android.analytics.events.a.f62811a);
                                                wVar.f54187b = w1.a(node6);
                                                wVar.f54188c = w1.b(node6, "offset");
                                            }
                                            if (wVar != null) {
                                                hVar.f54152j.add(wVar);
                                            }
                                        }
                                    }
                                }
                            }
                            if (hVar != null) {
                                jVar.f54153a.add(hVar);
                            }
                            it10 = it2;
                        }
                        mVar.f54157b = jVar;
                    }
                }
                gVar = this;
                if (mVar != null) {
                    gVar.f54137c.add(mVar);
                }
                it6 = it;
            }
        }
        Node nodeD16 = w1.d(node, "Extensions");
        if (nodeD16 != null) {
            for (Node node7 : w1.c(nodeD16, "Extension")) {
                if ("AdVerifications".equalsIgnoreCase(w1.b(node7, "type"))) {
                    gVar.a(node7);
                }
                if ("FMPCompanionAssets".equalsIgnoreCase(w1.b(node7, "type"))) {
                    IAlog.a("parseFMPCompanionAssetsTag", new Object[0]);
                    Node nodeD17 = w1.d(node7, "FMPCompanionAssets");
                    if (nodeD17 != null) {
                        o oVar = new o();
                        String strB4 = w1.b(nodeD17, "enableMultipleCompanions");
                        if (V8ValueBoolean.FALSE.equalsIgnoreCase(strB4) || "0".equals(strB4)) {
                            oVar.f54162d = false;
                        }
                        Node nodeD18 = w1.d(nodeD17, "Name");
                        if (nodeD18 != null) {
                            oVar.f54159a = w1.a(nodeD18);
                        }
                        Node nodeD19 = w1.d(nodeD17, "Description");
                        if (nodeD19 != null) {
                            w1.a(nodeD19);
                        }
                        oVar.f54160b.clear();
                        Node nodeD20 = w1.d(nodeD17, "Icons");
                        if (nodeD20 != null) {
                            Iterator it12 = w1.c(nodeD20, "Icon").iterator();
                            while (it12.hasNext()) {
                                oVar.f54160b.add(w1.a((Node) it12.next()));
                            }
                        }
                        Node nodeD21 = w1.d(nodeD17, "Rating");
                        if (nodeD21 != null) {
                            try {
                                Float.parseFloat(w1.a(nodeD21));
                            } catch (Exception unused3) {
                            }
                        }
                        Node nodeD22 = w1.d(nodeD17, "Screenshots");
                        if (nodeD22 != null) {
                            oVar.f54161c = new ArrayList();
                            Iterator it13 = w1.c(nodeD22, "Screenshot").iterator();
                            while (it13.hasNext()) {
                                String strA5 = w1.a((Node) it13.next());
                                if (!TextUtils.isEmpty(strA5)) {
                                    oVar.f54161c.add(strA5);
                                }
                            }
                        }
                        gVar.f54139e = oVar;
                    }
                }
                if ("DynamicVideoControlsURL".equalsIgnoreCase(w1.b(node7, "type"))) {
                    Node nodeD23 = w1.d(node7, "DynamicVideoControlsURL");
                    n nVar = new n();
                    if (nodeD23 != null) {
                        nVar.f54158a = w1.a(nodeD23);
                    }
                    if (!TextUtils.isEmpty(nVar.f54158a)) {
                        gVar.f54142h.add(nVar);
                    }
                }
                if ("StorePromoAssets".equalsIgnoreCase(w1.b(node7, "type")) && (nodeD = w1.d(node7, "DTSPR")) != null) {
                    v vVar = new v();
                    Node nodeD24 = w1.d(nodeD, "DTSPNm");
                    if (nodeD24 != null) {
                        vVar.f54178b = w1.a(nodeD24);
                    }
                    Node nodeD25 = w1.d(nodeD, "DTSPTUrl");
                    if (nodeD25 != null) {
                        vVar.f54179c = w1.a(nodeD25);
                    }
                    Node nodeD26 = w1.d(nodeD, "DTSPPNm");
                    if (nodeD26 != null) {
                        vVar.f54185i = w1.a(nodeD26);
                    }
                    Node nodeD27 = w1.d(nodeD, "DTSPIap");
                    if (nodeD27 != null) {
                        vVar.f54180d = w1.a(nodeD27);
                    }
                    Node nodeD28 = w1.d(nodeD, "DTSPCads");
                    if (nodeD28 != null) {
                        vVar.f54181e = w1.a(nodeD28);
                    }
                    Node nodeD29 = w1.d(nodeD, "DTSPMedia");
                    if (nodeD29 != null && (childNodes2 = nodeD29.getChildNodes()) != null && childNodes2.getLength() != 0) {
                        for (int i2 = 0; i2 < childNodes2.getLength(); i2++) {
                            Node nodeItem = childNodes2.item(i2);
                            if (nodeItem != null) {
                                String nodeName = nodeItem.getNodeName();
                                String strA6 = w1.a(nodeItem);
                                if (!TextUtils.isEmpty(strA6)) {
                                    if ("DTSPScrn".equalsIgnoreCase(nodeName)) {
                                        vVar.f54182f.add(strA6);
                                    } else if ("DTSPVid".equalsIgnoreCase(nodeName)) {
                                        vVar.f54183g.add(strA6);
                                    } else if ("DTSPIcon".equalsIgnoreCase(nodeName)) {
                                        vVar.f54177a = strA6;
                                    }
                                }
                            }
                        }
                    }
                    Node nodeD30 = w1.d(nodeD, "DTSPMetadata");
                    if (nodeD30 != null && (childNodes = nodeD30.getChildNodes()) != null && childNodes.getLength() != 0) {
                        String strA7 = null;
                        String strA8 = null;
                        String strA9 = null;
                        for (int i3 = 0; i3 < childNodes.getLength(); i3++) {
                            Node nodeItem2 = childNodes.item(i3);
                            if (nodeItem2 != null) {
                                String nodeName2 = nodeItem2.getNodeName();
                                if ("DTSPLabel".equalsIgnoreCase(nodeName2)) {
                                    strA7 = w1.a(nodeItem2);
                                } else if ("DTSPRating".equalsIgnoreCase(nodeName2)) {
                                    strA8 = w1.a(nodeItem2);
                                } else if ("DTSPSize".equalsIgnoreCase(nodeName2)) {
                                    strA9 = w1.a(nodeItem2);
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(strA7) && !TextUtils.isEmpty(strA8) && !TextUtils.isEmpty(strA9)) {
                            vVar.f54184h = new com.fyber.inneractive.sdk.flow.storepromo.model.d(strA8, strA7, strA9);
                        }
                    }
                    gVar.f54141g = vVar;
                }
            }
        }
        a(node);
    }
}
