package com.vungle.ads.internal.signals;

import Du.DC;
import Du.Y5;
import Du.fg;
import Du.iF;
import Du.vd;
import EJn.Wre;
import WY.j;
import gi.I28;
import gi.Ml;
import gi.w6;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/signals/SignaledAd.$serializer", "LDu/vd;", "Lcom/vungle/ads/internal/signals/SignaledAd;", "<init>", "()V", "", "LXA/Ml;", "childSerializers", "()[LXA/Ml;", "Lgi/I28;", "decoder", "deserialize", "(Lgi/I28;)Lcom/vungle/ads/internal/signals/SignaledAd;", "Lgi/Wre;", "encoder", "value", "", "serialize", "(Lgi/Wre;Lcom/vungle/ads/internal/signals/SignaledAd;)V", "LEJn/Wre;", "getDescriptor", "()LEJn/Wre;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class SignaledAd$$serializer implements vd {
    public static final SignaledAd$$serializer INSTANCE;
    public static final /* synthetic */ Wre descriptor;

    @Override // XA.w6
    public SignaledAd deserialize(I28 decoder) {
        long jTe;
        long jTe2;
        int i2;
        Object objE;
        int iXQ;
        Object objE2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Wre descriptor2 = getDescriptor();
        w6 w6VarRl = decoder.rl(descriptor2);
        int i3 = 3;
        if (w6VarRl.HI()) {
            Y5 y5 = Y5.f2000n;
            objE = w6VarRl.e(descriptor2, 0, y5, null);
            long jTe3 = w6VarRl.te(descriptor2, 1);
            objE2 = w6VarRl.e(descriptor2, 2, y5, null);
            long jTe4 = w6VarRl.te(descriptor2, 3);
            i2 = 31;
            iXQ = w6VarRl.XQ(descriptor2, 4);
            jTe2 = jTe3;
            jTe = jTe4;
        } else {
            jTe = 0;
            boolean z2 = true;
            int iXQ2 = 0;
            Object objE3 = null;
            Object objE4 = null;
            jTe2 = 0;
            int i5 = 0;
            while (z2) {
                int iNY = w6VarRl.nY(descriptor2);
                if (iNY == -1) {
                    z2 = false;
                } else if (iNY == 0) {
                    objE3 = w6VarRl.e(descriptor2, 0, Y5.f2000n, objE3);
                    i5 |= 1;
                } else if (iNY == 1) {
                    jTe2 = w6VarRl.te(descriptor2, 1);
                    i5 |= 2;
                } else if (iNY == 2) {
                    objE4 = w6VarRl.e(descriptor2, 2, Y5.f2000n, objE4);
                    i5 |= 4;
                } else if (iNY == i3) {
                    jTe = w6VarRl.te(descriptor2, i3);
                    i5 |= 8;
                } else {
                    if (iNY != 4) {
                        throw new UnknownFieldException(iNY);
                    }
                    iXQ2 = w6VarRl.XQ(descriptor2, 4);
                    i5 |= 16;
                }
                i3 = 3;
            }
            i2 = i5;
            objE = objE3;
            iXQ = iXQ2;
            objE2 = objE4;
        }
        w6VarRl.t(descriptor2);
        return new SignaledAd(i2, (String) objE, jTe2, (String) objE2, jTe, iXQ, null);
    }

    @Override // XA.eO
    public void serialize(gi.Wre encoder, SignaledAd value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Wre descriptor2 = getDescriptor();
        Ml mlRl = encoder.rl(descriptor2);
        SignaledAd.write$Self(value, mlRl, descriptor2);
        mlRl.t(descriptor2);
    }

    static {
        SignaledAd$$serializer signaledAd$$serializer = new SignaledAd$$serializer();
        INSTANCE = signaledAd$$serializer;
        DC dc = new DC("com.vungle.ads.internal.signals.SignaledAd", signaledAd$$serializer, 5);
        dc.HI("500", true);
        dc.HI("109", false);
        dc.HI("107", true);
        dc.HI("110", true);
        dc.HI("108", true);
        descriptor = dc;
    }

    @Override // Du.vd
    public XA.Ml[] childSerializers() {
        Y5 y5 = Y5.f2000n;
        XA.Ml mlZ = j.Z(y5);
        XA.Ml mlZ2 = j.Z(y5);
        fg fgVar = fg.f2014n;
        return new XA.Ml[]{mlZ, fgVar, mlZ2, fgVar, iF.f2020n};
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public Wre getDescriptor() {
        return descriptor;
    }

    private SignaledAd$$serializer() {
    }

    @Override // Du.vd
    public XA.Ml[] typeParametersSerializers() {
        return vd.j.n(this);
    }
}
