package com.vungle.ads.internal.network;

import Du.DC;
import Du.Y5;
import Du.i;
import Du.iF;
import Du.mz;
import Du.vd;
import EJn.Wre;
import gi.I28;
import gi.Ml;
import gi.w6;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/network/FailedTpat.$serializer", "LDu/vd;", "Lcom/vungle/ads/internal/network/FailedTpat;", "<init>", "()V", "", "LXA/Ml;", "childSerializers", "()[LXA/Ml;", "Lgi/I28;", "decoder", "deserialize", "(Lgi/I28;)Lcom/vungle/ads/internal/network/FailedTpat;", "Lgi/Wre;", "encoder", "value", "", "serialize", "(Lgi/Wre;Lcom/vungle/ads/internal/network/FailedTpat;)V", "LEJn/Wre;", "getDescriptor", "()LEJn/Wre;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class FailedTpat$$serializer implements vd {
    public static final FailedTpat$$serializer INSTANCE;
    public static final /* synthetic */ Wre descriptor;

    @Override // XA.w6
    public FailedTpat deserialize(I28 decoder) {
        int i2;
        Object objE;
        Object objE2;
        Object objE3;
        int i3;
        int i5;
        Object objFD;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Wre descriptor2 = getDescriptor();
        w6 w6VarRl = decoder.rl(descriptor2);
        int i7 = 5;
        if (w6VarRl.HI()) {
            objFD = w6VarRl.fD(descriptor2, 0, HttpMethod$$serializer.INSTANCE, null);
            Y5 y5 = Y5.f2000n;
            objE = w6VarRl.e(descriptor2, 1, new mz(y5, y5), null);
            objE2 = w6VarRl.e(descriptor2, 2, y5, null);
            int iXQ = w6VarRl.XQ(descriptor2, 3);
            int iXQ2 = w6VarRl.XQ(descriptor2, 4);
            objE3 = w6VarRl.e(descriptor2, 5, y5, null);
            i5 = iXQ;
            i3 = iXQ2;
            i2 = 63;
        } else {
            boolean z2 = true;
            int iXQ3 = 0;
            int i8 = 0;
            Object objFD2 = null;
            Object objE4 = null;
            Object objE5 = null;
            Object objE6 = null;
            int iXQ4 = 0;
            while (z2) {
                int iNY = w6VarRl.nY(descriptor2);
                switch (iNY) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        objFD2 = w6VarRl.fD(descriptor2, 0, HttpMethod$$serializer.INSTANCE, objFD2);
                        i8 |= 1;
                        i7 = 5;
                        continue;
                    case 1:
                        Y5 y52 = Y5.f2000n;
                        objE4 = w6VarRl.e(descriptor2, 1, new mz(y52, y52), objE4);
                        i8 |= 2;
                        i7 = 5;
                        break;
                    case 2:
                        objE5 = w6VarRl.e(descriptor2, 2, Y5.f2000n, objE5);
                        i8 |= 4;
                        break;
                    case 3:
                        iXQ3 = w6VarRl.XQ(descriptor2, 3);
                        i8 |= 8;
                        break;
                    case 4:
                        iXQ4 = w6VarRl.XQ(descriptor2, 4);
                        i8 |= 16;
                        break;
                    case 5:
                        objE6 = w6VarRl.e(descriptor2, i7, Y5.f2000n, objE6);
                        i8 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iNY);
                }
            }
            i2 = i8;
            objE = objE4;
            objE2 = objE5;
            objE3 = objE6;
            i3 = iXQ4;
            i5 = iXQ3;
            objFD = objFD2;
        }
        w6VarRl.t(descriptor2);
        return new FailedTpat(i2, (HttpMethod) objFD, (Map) objE, (String) objE2, i5, i3, (String) objE3, (i) null);
    }

    @Override // XA.eO
    public void serialize(gi.Wre encoder, FailedTpat value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Wre descriptor2 = getDescriptor();
        Ml mlRl = encoder.rl(descriptor2);
        FailedTpat.write$Self(value, mlRl, descriptor2);
        mlRl.t(descriptor2);
    }

    static {
        FailedTpat$$serializer failedTpat$$serializer = new FailedTpat$$serializer();
        INSTANCE = failedTpat$$serializer;
        DC dc = new DC("com.vungle.ads.internal.network.FailedTpat", failedTpat$$serializer, 6);
        dc.HI("method", true);
        dc.HI("headers", true);
        dc.HI("body", true);
        dc.HI("retryAttempt", true);
        dc.HI("retryCount", false);
        dc.HI("tpatKey", true);
        descriptor = dc;
    }

    @Override // Du.vd
    public XA.Ml[] childSerializers() {
        Y5 y5 = Y5.f2000n;
        XA.Ml mlZ = WY.j.Z(new mz(y5, y5));
        XA.Ml mlZ2 = WY.j.Z(y5);
        XA.Ml mlZ3 = WY.j.Z(y5);
        iF iFVar = iF.f2020n;
        return new XA.Ml[]{HttpMethod$$serializer.INSTANCE, mlZ, mlZ2, iFVar, iFVar, mlZ3};
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public Wre getDescriptor() {
        return descriptor;
    }

    private FailedTpat$$serializer() {
    }

    @Override // Du.vd
    public XA.Ml[] typeParametersSerializers() {
        return vd.j.n(this);
    }
}
