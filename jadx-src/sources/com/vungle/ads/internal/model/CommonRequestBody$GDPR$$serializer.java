package com.vungle.ads.internal.model;

import Du.DC;
import Du.Y5;
import Du.fg;
import Du.vd;
import EJn.Wre;
import XA.Ml;
import com.vungle.ads.internal.model.CommonRequestBody;
import gi.I28;
import gi.w6;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.GDPR.$serializer", "LDu/vd;", "Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;", "<init>", "()V", "", "LXA/Ml;", "childSerializers", "()[LXA/Ml;", "Lgi/I28;", "decoder", "deserialize", "(Lgi/I28;)Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;", "Lgi/Wre;", "encoder", "value", "", "serialize", "(Lgi/Wre;Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;)V", "LEJn/Wre;", "getDescriptor", "()LEJn/Wre;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class CommonRequestBody$GDPR$$serializer implements vd {
    public static final CommonRequestBody$GDPR$$serializer INSTANCE;
    public static final /* synthetic */ Wre descriptor;

    @Override // Du.vd
    public Ml[] childSerializers() {
        Y5 y5 = Y5.f2000n;
        return new Ml[]{y5, y5, fg.f2014n, y5};
    }

    @Override // XA.w6
    public CommonRequestBody.GDPR deserialize(I28 decoder) {
        String strIk;
        String strIk2;
        int i2;
        String str;
        long j2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Wre descriptor2 = getDescriptor();
        w6 w6VarRl = decoder.rl(descriptor2);
        if (w6VarRl.HI()) {
            strIk = w6VarRl.Ik(descriptor2, 0);
            String strIk3 = w6VarRl.Ik(descriptor2, 1);
            long jTe = w6VarRl.te(descriptor2, 2);
            strIk2 = w6VarRl.Ik(descriptor2, 3);
            i2 = 15;
            str = strIk3;
            j2 = jTe;
        } else {
            strIk = null;
            String strIk4 = null;
            boolean z2 = true;
            long jTe2 = 0;
            String strIk5 = null;
            int i3 = 0;
            while (z2) {
                int iNY = w6VarRl.nY(descriptor2);
                if (iNY == -1) {
                    z2 = false;
                } else if (iNY == 0) {
                    strIk = w6VarRl.Ik(descriptor2, 0);
                    i3 |= 1;
                } else if (iNY == 1) {
                    strIk4 = w6VarRl.Ik(descriptor2, 1);
                    i3 |= 2;
                } else if (iNY == 2) {
                    jTe2 = w6VarRl.te(descriptor2, 2);
                    i3 |= 4;
                } else {
                    if (iNY != 3) {
                        throw new UnknownFieldException(iNY);
                    }
                    strIk5 = w6VarRl.Ik(descriptor2, 3);
                    i3 |= 8;
                }
            }
            strIk2 = strIk5;
            i2 = i3;
            str = strIk4;
            j2 = jTe2;
        }
        String str2 = strIk;
        w6VarRl.t(descriptor2);
        return new CommonRequestBody.GDPR(i2, str2, str, j2, strIk2, null);
    }

    @Override // XA.eO
    public void serialize(gi.Wre encoder, CommonRequestBody.GDPR value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Wre descriptor2 = getDescriptor();
        gi.Ml mlRl = encoder.rl(descriptor2);
        CommonRequestBody.GDPR.write$Self(value, mlRl, descriptor2);
        mlRl.t(descriptor2);
    }

    static {
        CommonRequestBody$GDPR$$serializer commonRequestBody$GDPR$$serializer = new CommonRequestBody$GDPR$$serializer();
        INSTANCE = commonRequestBody$GDPR$$serializer;
        DC dc = new DC("com.vungle.ads.internal.model.CommonRequestBody.GDPR", commonRequestBody$GDPR$$serializer, 4);
        dc.HI("consent_status", false);
        dc.HI("consent_source", false);
        dc.HI("consent_timestamp", false);
        dc.HI("consent_message_version", false);
        descriptor = dc;
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public Wre getDescriptor() {
        return descriptor;
    }

    private CommonRequestBody$GDPR$$serializer() {
    }

    @Override // Du.vd
    public Ml[] typeParametersSerializers() {
        return vd.j.n(this);
    }
}
