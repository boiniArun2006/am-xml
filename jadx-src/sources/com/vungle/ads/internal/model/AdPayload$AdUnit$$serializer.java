package com.vungle.ads.internal.model;

import Du.DC;
import Du.Dsr;
import Du.Y5;
import Du.iF;
import Du.vd;
import EJn.Wre;
import WY.j;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.model.AdPayload;
import gi.Ml;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/AdPayload.AdUnit.$serializer", "LDu/vd;", "Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "<init>", "()V", "", "LXA/Ml;", "childSerializers", "()[LXA/Ml;", "Lgi/I28;", "decoder", "deserialize", "(Lgi/I28;)Lcom/vungle/ads/internal/model/AdPayload$AdUnit;", "Lgi/Wre;", "encoder", "value", "", "serialize", "(Lgi/Wre;Lcom/vungle/ads/internal/model/AdPayload$AdUnit;)V", "LEJn/Wre;", "getDescriptor", "()LEJn/Wre;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class AdPayload$AdUnit$$serializer implements vd {
    public static final AdPayload$AdUnit$$serializer INSTANCE;
    public static final /* synthetic */ Wre descriptor;

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // XA.w6
    public com.vungle.ads.internal.model.AdPayload.AdUnit deserialize(gi.I28 r82) {
        /*
            Method dump skipped, instruction units count: 2764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.model.AdPayload$AdUnit$$serializer.deserialize(gi.I28):com.vungle.ads.internal.model.AdPayload$AdUnit");
    }

    @Override // XA.eO
    public void serialize(gi.Wre encoder, AdPayload.AdUnit value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Wre descriptor2 = getDescriptor();
        Ml mlRl = encoder.rl(descriptor2);
        AdPayload.AdUnit.write$Self(value, mlRl, descriptor2);
        mlRl.t(descriptor2);
    }

    static {
        AdPayload$AdUnit$$serializer adPayload$AdUnit$$serializer = new AdPayload$AdUnit$$serializer();
        INSTANCE = adPayload$AdUnit$$serializer;
        DC dc = new DC("com.vungle.ads.internal.model.AdPayload.AdUnit", adPayload$AdUnit$$serializer, 30);
        dc.HI("id", true);
        dc.HI("ad_type", true);
        dc.HI("ad_source", true);
        dc.HI("expiry", true);
        dc.HI("expiry_duration", true);
        dc.HI("deeplink_url", true);
        dc.HI("click_coordinates_enabled", true);
        dc.HI("ad_load_optimization", true);
        dc.HI("template_heartbeat_check", true);
        dc.HI("mediation_name", true);
        dc.HI("info", true);
        dc.HI("sleep", true);
        dc.HI("error_code", true);
        dc.HI("tpat", true);
        dc.HI("vm_url", true);
        dc.HI("vm_version", true);
        dc.HI("ad_market_id", true);
        dc.HI("notification", true);
        dc.HI(Constants.LOAD_AD, true);
        dc.HI("viewability", true);
        dc.HI("template_type", true);
        dc.HI("template_settings", true);
        dc.HI("creative_id", true);
        dc.HI("app_id", true);
        dc.HI("show_close", true);
        dc.HI("show_close_incentivized", true);
        dc.HI("ad_size", true);
        dc.HI("webview_settings", true);
        dc.HI("use_preloading", true);
        dc.HI("ad_partial_download_enabled", true);
        descriptor = dc;
    }

    @Override // Du.vd
    public XA.Ml[] childSerializers() {
        Y5 y5 = Y5.f2000n;
        XA.Ml mlZ = j.Z(y5);
        XA.Ml mlZ2 = j.Z(y5);
        XA.Ml mlZ3 = j.Z(y5);
        iF iFVar = iF.f2020n;
        XA.Ml mlZ4 = j.Z(iFVar);
        XA.Ml mlZ5 = j.Z(iFVar);
        XA.Ml mlZ6 = j.Z(y5);
        Dsr dsr = Dsr.f1956n;
        return new XA.Ml[]{mlZ, mlZ2, mlZ3, mlZ4, mlZ5, mlZ6, j.Z(dsr), j.Z(dsr), j.Z(dsr), j.Z(y5), j.Z(y5), j.Z(iFVar), j.Z(iFVar), j.Z(AdPayload.TpatSerializer.INSTANCE), j.Z(y5), j.Z(y5), j.Z(y5), j.Z(new Du.Wre(y5)), j.Z(new Du.Wre(y5)), j.Z(AdPayload$ViewAbility$$serializer.INSTANCE), j.Z(y5), j.Z(AdPayload$TemplateSettings$$serializer.INSTANCE), j.Z(y5), j.Z(y5), j.Z(iFVar), j.Z(iFVar), j.Z(AdPayload$AdSizeInfo$$serializer.INSTANCE), j.Z(AdPayload$WebViewSettings$$serializer.INSTANCE), j.Z(dsr), j.Z(dsr)};
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public Wre getDescriptor() {
        return descriptor;
    }

    private AdPayload$AdUnit$$serializer() {
    }

    @Override // Du.vd
    public XA.Ml[] typeParametersSerializers() {
        return vd.j.n(this);
    }
}
