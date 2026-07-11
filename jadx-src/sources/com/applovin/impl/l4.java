package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class l4 extends f4 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final /* synthetic */ boolean f48870p = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o7 f48871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f48872i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MediaEvents f48873j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final VastProperties f48874k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f48875l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f48876m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f48877n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f48878o;

    @Override // com.applovin.impl.f4
    protected AdSessionContext a(WebView webView) {
        if (!f48870p && this.f48871h.e1() == null) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        for (p7 p7Var : this.f48871h.e1().b()) {
            List<v7> listC = p7Var.c();
            if (listC.isEmpty()) {
                a8.a(p7Var.b(), t7.FAILED_TO_LOAD_RESOURCE, this.f48526b);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (v7 v7Var : listC) {
                    if ("omid".equalsIgnoreCase(v7Var.b())) {
                        arrayList2.add(v7Var);
                    }
                }
                if (arrayList2.isEmpty()) {
                    a8.a(p7Var.b(), t7.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED, this.f48526b);
                } else {
                    ArrayList<URL> arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList3.add(new URL(((v7) it.next()).c()));
                        } catch (Throwable th) {
                            if (C1804o.a()) {
                                this.f48527c.a(this.f48528d, "Failed to parse JavaScript resource url", th);
                            }
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        a8.a(p7Var.b(), t7.FAILED_TO_LOAD_RESOURCE, this.f48526b);
                    } else {
                        String strE = p7Var.e();
                        String strD = p7Var.d();
                        if (!StringUtils.isValidString(strE) || StringUtils.isValidString(strD)) {
                            for (URL url : arrayList3) {
                                arrayList.add(StringUtils.isValidString(strE) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(strD, url, strE) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                            }
                        } else {
                            a8.a(p7Var.b(), t7.FAILED_TO_LOAD_RESOURCE, this.f48526b);
                        }
                    }
                }
            }
        }
        String strA = this.f48526b.e0().a();
        if (TextUtils.isEmpty(strA)) {
            if (C1804o.a()) {
                this.f48527c.b(this.f48528d, "JavaScript SDK content not loaded successfully");
            }
            return null;
        }
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f48526b.e0().b(), strA, arrayList, this.f48871h.getOpenMeasurementContentUrl(), this.f48871h.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th2) {
            if (!C1804o.a()) {
                return null;
            }
            this.f48527c.a(this.f48528d, "Failed to create ad session context", th2);
            return null;
        }
    }

    public void b(final float f3, final boolean z2) {
        if (this.f48875l.compareAndSet(false, true)) {
            b("track started", new Runnable() { // from class: com.applovin.impl.lS
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48914n.a(f3, z2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        this.f48873j.bufferFinish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        this.f48873j.bufferStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        this.f48873j.adUserInteraction(InteractionType.CLICK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        this.f48873j.complete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.f48873j.firstQuartile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        this.f48531g.loaded(this.f48874k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        this.f48873j.midpoint();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.f48873j.pause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        this.f48873j.resume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.f48873j.skipped();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        this.f48873j.thirdQuartile();
    }

    public void A() {
        b("track resumed", new Runnable() { // from class: com.applovin.impl.N
            @Override // java.lang.Runnable
            public final void run() {
                this.f47788n.s();
            }
        });
    }

    public void B() {
        b("track skipped", new Runnable() { // from class: com.applovin.impl.nSC
            @Override // java.lang.Runnable
            public final void run() {
                this.f49503n.t();
            }
        });
    }

    public void C() {
        if (this.f48878o.compareAndSet(false, true)) {
            b("track third quartile", new Runnable() { // from class: com.applovin.impl.mrQ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49442n.u();
                }
            });
        }
    }

    @Override // com.applovin.impl.f4
    public void h() {
        b("track loaded", new Runnable() { // from class: com.applovin.impl.IG
            @Override // java.lang.Runnable
            public final void run() {
                this.f47742n.p();
            }
        });
    }

    public void i() {
        if (this.f48872i.compareAndSet(true, false)) {
            b("buffer finished", new Runnable() { // from class: com.applovin.impl.h6y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48664n.k();
                }
            });
        }
    }

    public void j() {
        if (this.f48872i.compareAndSet(false, true)) {
            b("buffer started", new Runnable() { // from class: com.applovin.impl.Y5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47866n.l();
                }
            });
        }
    }

    public void v() {
        b("track clicked", new Runnable() { // from class: com.applovin.impl.dT
            @Override // java.lang.Runnable
            public final void run() {
                this.f48376n.m();
            }
        });
    }

    public void w() {
        b("track completed", new Runnable() { // from class: com.applovin.impl.Pmq
            @Override // java.lang.Runnable
            public final void run() {
                this.f47804n.n();
            }
        });
    }

    public void x() {
        if (this.f48876m.compareAndSet(false, true)) {
            b("track first quartile", new Runnable() { // from class: com.applovin.impl.Pp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47805n.o();
                }
            });
        }
    }

    public void y() {
        if (this.f48877n.compareAndSet(false, true)) {
            b("track midpoint", new Runnable() { // from class: com.applovin.impl.ozJ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49635n.q();
                }
            });
        }
    }

    public void z() {
        b("track paused", new Runnable() { // from class: com.applovin.impl.FPL
            @Override // java.lang.Runnable
            public final void run() {
                this.f47722n.r();
            }
        });
    }

    public l4(o7 o7Var) {
        super(o7Var);
        this.f48872i = new AtomicBoolean();
        this.f48875l = new AtomicBoolean();
        this.f48876m = new AtomicBoolean();
        this.f48877n = new AtomicBoolean();
        this.f48878o = new AtomicBoolean();
        this.f48871h = o7Var;
        float fM1 = o7Var.m1();
        if (o7Var.m1() == -1) {
            this.f48874k = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        } else {
            this.f48874k = VastProperties.createVastPropertiesForSkippableMedia(fM1, true, Position.STANDALONE);
        }
    }

    public void b(final boolean z2) {
        b("track volume changed", new Runnable() { // from class: com.applovin.impl.tI
            @Override // java.lang.Runnable
            public final void run() {
                this.f50531n.a(z2);
            }
        });
    }

    @Override // com.applovin.impl.f4
    protected AdSessionConfiguration a() {
        try {
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th) {
            if (!C1804o.a()) {
                return null;
            }
            this.f48527c.a(this.f48528d, "Failed to create ad session configuration", th);
            return null;
        }
    }

    @Override // com.applovin.impl.f4
    protected void a(AdSession adSession) {
        try {
            this.f48873j = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            if (C1804o.a()) {
                this.f48527c.a(this.f48528d, "Failed to create media events", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(float f3, boolean z2) {
        this.f48873j.start(f3, z2 ? 0.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2) {
        this.f48873j.volumeChange(z2 ? 0.0f : 1.0f);
    }
}
