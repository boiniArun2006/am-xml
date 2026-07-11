package com.vungle.ads.internal.model;

import Du.DC;
import Du.iF;
import Du.vd;
import EJn.Wre;
import XA.Ml;
import androidx.media3.exoplayer.upstream.CmcdData;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.AdSizeParam.$serializer", "LDu/vd;", "Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;", "<init>", "()V", "", "LXA/Ml;", "childSerializers", "()[LXA/Ml;", "Lgi/I28;", "decoder", "deserialize", "(Lgi/I28;)Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;", "Lgi/Wre;", "encoder", "value", "", "serialize", "(Lgi/Wre;Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;)V", "LEJn/Wre;", "getDescriptor", "()LEJn/Wre;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class CommonRequestBody$AdSizeParam$$serializer implements vd {
    public static final CommonRequestBody$AdSizeParam$$serializer INSTANCE;
    public static final /* synthetic */ Wre descriptor;

    @Override // Du.vd
    public Ml[] childSerializers() {
        iF iFVar = iF.f2020n;
        return new Ml[]{iFVar, iFVar};
    }

    @Override // XA.w6
    public CommonRequestBody.AdSizeParam deserialize(I28 decoder) {
        int iXQ;
        int iXQ2;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Wre descriptor2 = getDescriptor();
        w6 w6VarRl = decoder.rl(descriptor2);
        if (w6VarRl.HI()) {
            iXQ = w6VarRl.XQ(descriptor2, 0);
            iXQ2 = w6VarRl.XQ(descriptor2, 1);
            i2 = 3;
        } else {
            boolean z2 = true;
            iXQ = 0;
            int iXQ3 = 0;
            int i3 = 0;
            while (z2) {
                int iNY = w6VarRl.nY(descriptor2);
                if (iNY == -1) {
                    z2 = false;
                } else if (iNY == 0) {
                    iXQ = w6VarRl.XQ(descriptor2, 0);
                    i3 |= 1;
                } else {
                    if (iNY != 1) {
                        throw new UnknownFieldException(iNY);
                    }
                    iXQ3 = w6VarRl.XQ(descriptor2, 1);
                    i3 |= 2;
                }
            }
            iXQ2 = iXQ3;
            i2 = i3;
        }
        w6VarRl.t(descriptor2);
        return new CommonRequestBody.AdSizeParam(i2, iXQ, iXQ2, null);
    }

    @Override // XA.eO
    public void serialize(gi.Wre encoder, CommonRequestBody.AdSizeParam value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Wre descriptor2 = getDescriptor();
        gi.Ml mlRl = encoder.rl(descriptor2);
        CommonRequestBody.AdSizeParam.write$Self(value, mlRl, descriptor2);
        mlRl.t(descriptor2);
    }

    static {
        CommonRequestBody$AdSizeParam$$serializer commonRequestBody$AdSizeParam$$serializer = new CommonRequestBody$AdSizeParam$$serializer();
        INSTANCE = commonRequestBody$AdSizeParam$$serializer;
        DC dc = new DC("com.vungle.ads.internal.model.CommonRequestBody.AdSizeParam", commonRequestBody$AdSizeParam$$serializer, 2);
        dc.HI("w", false);
        dc.HI(CmcdData.STREAMING_FORMAT_HLS, false);
        descriptor = dc;
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public Wre getDescriptor() {
        return descriptor;
    }

    private CommonRequestBody$AdSizeParam$$serializer() {
    }

    @Override // Du.vd
    public Ml[] typeParametersSerializers() {
        return vd.j.n(this);
    }
}
