package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import com.fyber.inneractive.sdk.activities.FyberReportAdActivity;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.ui.FyberAdIdentifierFactory;
import com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal;
import com.fyber.inneractive.sdk.ui.FyberAdIdentifierRemote;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class g implements IFyberAdIdentifier.ClickListener, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f53673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InneractiveAdRequest f53674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.e f53675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IFyberAdIdentifier f53676d;

    @Override // com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.ClickListener
    public final void a() {
        Long demandId;
        String demandSource;
        com.fyber.inneractive.sdk.response.e eVar = this.f53675c;
        String str = null;
        if (eVar != null) {
            ImpressionData impressionData = eVar.f56866r;
            String advertiserDomain = impressionData != null ? impressionData.getAdvertiserDomain() : null;
            ImpressionData impressionData2 = this.f53675c.f56866r;
            demandSource = impressionData2 != null ? impressionData2.getDemandSource() : null;
            ImpressionData impressionData3 = this.f53675c.f56866r;
            str = advertiserDomain;
            demandId = impressionData3 != null ? impressionData3.getDemandId() : null;
        } else {
            demandId = null;
            demandSource = null;
        }
        FyberReportAdActivity.start(this.f53673a, this, str, demandSource, demandId);
    }

    public g(Context context, boolean z2, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        IFyberAdIdentifier fyberAdIdentifierLocal;
        this.f53673a = context;
        this.f53674b = inneractiveAdRequest;
        this.f53675c = eVar;
        new FyberAdIdentifierFactory();
        if (z2) {
            fyberAdIdentifierLocal = new FyberAdIdentifierRemote(rVar);
        } else {
            fyberAdIdentifierLocal = new FyberAdIdentifierLocal(rVar);
        }
        this.f53676d = fyberAdIdentifierLocal;
        fyberAdIdentifierLocal.f56950a = this;
    }
}
