package com.vungle.ads.internal.signals;

import Du.DC;
import Du.Y5;
import Du.fg;
import Du.iF;
import Du.vd;
import EJn.Wre;
import com.vungle.ads.internal.model.UnclosedAd$$serializer;
import gi.I28;
import gi.Ml;
import gi.w6;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/signals/SessionData.$serializer", "LDu/vd;", "Lcom/vungle/ads/internal/signals/SessionData;", "<init>", "()V", "", "LXA/Ml;", "childSerializers", "()[LXA/Ml;", "Lgi/I28;", "decoder", "deserialize", "(Lgi/I28;)Lcom/vungle/ads/internal/signals/SessionData;", "Lgi/Wre;", "encoder", "value", "", "serialize", "(Lgi/Wre;Lcom/vungle/ads/internal/signals/SessionData;)V", "LEJn/Wre;", "getDescriptor", "()LEJn/Wre;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class SessionData$$serializer implements vd {
    public static final SessionData$$serializer INSTANCE;
    public static final /* synthetic */ Wre descriptor;

    @Override // XA.w6
    public SessionData deserialize(I28 decoder) {
        int i2;
        Object objFD;
        Object objFD2;
        int iXQ;
        int i3;
        int i5;
        int i7;
        int i8;
        int iXQ2;
        long j2;
        String str;
        long j3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Wre descriptor2 = getDescriptor();
        w6 w6VarRl = decoder.rl(descriptor2);
        int i9 = 0;
        if (w6VarRl.HI()) {
            int iXQ3 = w6VarRl.XQ(descriptor2, 0);
            String strIk = w6VarRl.Ik(descriptor2, 1);
            long jTe = w6VarRl.te(descriptor2, 2);
            objFD2 = w6VarRl.fD(descriptor2, 3, new Du.Wre(SignaledAd$$serializer.INSTANCE), null);
            long jTe2 = w6VarRl.te(descriptor2, 4);
            int iXQ4 = w6VarRl.XQ(descriptor2, 5);
            objFD = w6VarRl.fD(descriptor2, 6, new Du.Wre(UnclosedAd$$serializer.INSTANCE), null);
            int iXQ5 = w6VarRl.XQ(descriptor2, 7);
            int iXQ6 = w6VarRl.XQ(descriptor2, 8);
            int iXQ7 = w6VarRl.XQ(descriptor2, 9);
            i9 = 4095;
            i2 = iXQ3;
            iXQ = w6VarRl.XQ(descriptor2, 10);
            i3 = iXQ7;
            i5 = iXQ5;
            i7 = iXQ6;
            i8 = iXQ4;
            iXQ2 = w6VarRl.XQ(descriptor2, 11);
            j2 = jTe2;
            str = strIk;
            j3 = jTe;
        } else {
            int i10 = 11;
            boolean z2 = true;
            int iXQ8 = 0;
            int iXQ9 = 0;
            int iXQ10 = 0;
            int iXQ11 = 0;
            Object objFD3 = null;
            Object objFD4 = null;
            String strIk2 = null;
            long jTe3 = 0;
            long jTe4 = 0;
            int iXQ12 = 0;
            int iXQ13 = 0;
            int iXQ14 = 0;
            while (z2) {
                int iNY = w6VarRl.nY(descriptor2);
                switch (iNY) {
                    case -1:
                        z2 = false;
                        i10 = 11;
                        break;
                    case 0:
                        i9 |= 1;
                        iXQ8 = w6VarRl.XQ(descriptor2, 0);
                        i10 = 11;
                        break;
                    case 1:
                        strIk2 = w6VarRl.Ik(descriptor2, 1);
                        i9 |= 2;
                        i10 = 11;
                        break;
                    case 2:
                        jTe4 = w6VarRl.te(descriptor2, 2);
                        i9 |= 4;
                        i10 = 11;
                        break;
                    case 3:
                        objFD4 = w6VarRl.fD(descriptor2, 3, new Du.Wre(SignaledAd$$serializer.INSTANCE), objFD4);
                        i9 |= 8;
                        i10 = 11;
                        break;
                    case 4:
                        jTe3 = w6VarRl.te(descriptor2, 4);
                        i9 |= 16;
                        i10 = 11;
                        break;
                    case 5:
                        iXQ10 = w6VarRl.XQ(descriptor2, 5);
                        i9 |= 32;
                        i10 = 11;
                        break;
                    case 6:
                        objFD3 = w6VarRl.fD(descriptor2, 6, new Du.Wre(UnclosedAd$$serializer.INSTANCE), objFD3);
                        i9 |= 64;
                        i10 = 11;
                        break;
                    case 7:
                        iXQ14 = w6VarRl.XQ(descriptor2, 7);
                        i9 |= 128;
                        break;
                    case 8:
                        iXQ9 = w6VarRl.XQ(descriptor2, 8);
                        i9 |= 256;
                        break;
                    case 9:
                        iXQ13 = w6VarRl.XQ(descriptor2, 9);
                        i9 |= 512;
                        break;
                    case 10:
                        iXQ12 = w6VarRl.XQ(descriptor2, 10);
                        i9 |= 1024;
                        break;
                    case 11:
                        iXQ11 = w6VarRl.XQ(descriptor2, i10);
                        i9 |= 2048;
                        break;
                    default:
                        throw new UnknownFieldException(iNY);
                }
            }
            i2 = iXQ8;
            objFD = objFD3;
            objFD2 = objFD4;
            iXQ = iXQ12;
            i3 = iXQ13;
            i5 = iXQ14;
            i7 = iXQ9;
            i8 = iXQ10;
            iXQ2 = iXQ11;
            j2 = jTe3;
            str = strIk2;
            j3 = jTe4;
        }
        int i11 = i9;
        w6VarRl.t(descriptor2);
        return new SessionData(i11, i2, str, j3, (List) objFD2, j2, i8, (List) objFD, i5, i7, i3, iXQ, iXQ2, null);
    }

    @Override // XA.eO
    public void serialize(gi.Wre encoder, SessionData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Wre descriptor2 = getDescriptor();
        Ml mlRl = encoder.rl(descriptor2);
        SessionData.write$Self(value, mlRl, descriptor2);
        mlRl.t(descriptor2);
    }

    static {
        SessionData$$serializer sessionData$$serializer = new SessionData$$serializer();
        INSTANCE = sessionData$$serializer;
        DC dc = new DC("com.vungle.ads.internal.signals.SessionData", sessionData$$serializer, 12);
        dc.HI("103", false);
        dc.HI("101", true);
        dc.HI("100", true);
        dc.HI("106", true);
        dc.HI("102", true);
        dc.HI("104", true);
        dc.HI("105", true);
        dc.HI("112", true);
        dc.HI("113", true);
        dc.HI("114", true);
        dc.HI("115", true);
        dc.HI("116", true);
        descriptor = dc;
    }

    @Override // Du.vd
    public XA.Ml[] childSerializers() {
        Du.Wre wre = new Du.Wre(SignaledAd$$serializer.INSTANCE);
        Du.Wre wre2 = new Du.Wre(UnclosedAd$$serializer.INSTANCE);
        iF iFVar = iF.f2020n;
        fg fgVar = fg.f2014n;
        return new XA.Ml[]{iFVar, Y5.f2000n, fgVar, wre, fgVar, iFVar, wre2, iFVar, iFVar, iFVar, iFVar, iFVar};
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public Wre getDescriptor() {
        return descriptor;
    }

    private SessionData$$serializer() {
    }

    @Override // Du.vd
    public XA.Ml[] typeParametersSerializers() {
        return vd.j.n(this);
    }
}
