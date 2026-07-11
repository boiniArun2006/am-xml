package com.vungle.ads.fpd;

import Du.DC;
import Du.Y5;
import Du.mz;
import Du.vd;
import EJn.Wre;
import WY.j;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/fpd/FirstPartyData.$serializer", "LDu/vd;", "Lcom/vungle/ads/fpd/FirstPartyData;", "<init>", "()V", "", "LXA/Ml;", "childSerializers", "()[LXA/Ml;", "Lgi/I28;", "decoder", "deserialize", "(Lgi/I28;)Lcom/vungle/ads/fpd/FirstPartyData;", "Lgi/Wre;", "encoder", "value", "", "serialize", "(Lgi/Wre;Lcom/vungle/ads/fpd/FirstPartyData;)V", "LEJn/Wre;", "getDescriptor", "()LEJn/Wre;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class FirstPartyData$$serializer implements vd {
    public static final FirstPartyData$$serializer INSTANCE;
    public static final /* synthetic */ Wre descriptor;

    @Override // XA.w6
    public FirstPartyData deserialize(I28 decoder) {
        int i2;
        String str;
        Object objE;
        Object objE2;
        Object objE3;
        Object objE4;
        Object objE5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Wre descriptor2 = getDescriptor();
        w6 w6VarRl = decoder.rl(descriptor2);
        boolean z2 = true;
        String strIk = null;
        if (w6VarRl.HI()) {
            String strIk2 = w6VarRl.Ik(descriptor2, 0);
            objE = w6VarRl.e(descriptor2, 1, SessionContext$$serializer.INSTANCE, null);
            objE2 = w6VarRl.e(descriptor2, 2, Demographic$$serializer.INSTANCE, null);
            objE3 = w6VarRl.e(descriptor2, 3, Location$$serializer.INSTANCE, null);
            objE4 = w6VarRl.e(descriptor2, 4, Revenue$$serializer.INSTANCE, null);
            Y5 y5 = Y5.f2000n;
            objE5 = w6VarRl.e(descriptor2, 5, new mz(y5, y5), null);
            str = strIk2;
            i2 = 63;
        } else {
            boolean z3 = true;
            int i3 = 0;
            Object objE6 = null;
            Object objE7 = null;
            Object objE8 = null;
            Object objE9 = null;
            Object objE10 = null;
            while (z3) {
                int iNY = w6VarRl.nY(descriptor2);
                switch (iNY) {
                    case -1:
                        z3 = false;
                        z2 = z2;
                        break;
                    case 0:
                        strIk = w6VarRl.Ik(descriptor2, 0);
                        i3 |= 1;
                        z2 = z2;
                        break;
                    case 1:
                        objE6 = w6VarRl.e(descriptor2, 1, SessionContext$$serializer.INSTANCE, objE6);
                        i3 |= 2;
                        z2 = true;
                        break;
                    case 2:
                        objE7 = w6VarRl.e(descriptor2, 2, Demographic$$serializer.INSTANCE, objE7);
                        i3 |= 4;
                        z2 = true;
                        break;
                    case 3:
                        objE8 = w6VarRl.e(descriptor2, 3, Location$$serializer.INSTANCE, objE8);
                        i3 |= 8;
                        z2 = true;
                        break;
                    case 4:
                        objE9 = w6VarRl.e(descriptor2, 4, Revenue$$serializer.INSTANCE, objE9);
                        i3 |= 16;
                        z2 = true;
                        break;
                    case 5:
                        Y5 y52 = Y5.f2000n;
                        objE10 = w6VarRl.e(descriptor2, 5, new mz(y52, y52), objE10);
                        i3 |= 32;
                        z2 = true;
                        break;
                    default:
                        throw new UnknownFieldException(iNY);
                }
            }
            i2 = i3;
            str = strIk;
            objE = objE6;
            objE2 = objE7;
            objE3 = objE8;
            objE4 = objE9;
            objE5 = objE10;
        }
        w6VarRl.t(descriptor2);
        return new FirstPartyData(i2, str, (SessionContext) objE, (Demographic) objE2, (Location) objE3, (Revenue) objE4, (Map) objE5, null);
    }

    @Override // XA.eO
    public void serialize(gi.Wre encoder, FirstPartyData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Wre descriptor2 = getDescriptor();
        Ml mlRl = encoder.rl(descriptor2);
        FirstPartyData.write$Self(value, mlRl, descriptor2);
        mlRl.t(descriptor2);
    }

    static {
        FirstPartyData$$serializer firstPartyData$$serializer = new FirstPartyData$$serializer();
        INSTANCE = firstPartyData$$serializer;
        DC dc = new DC("com.vungle.ads.fpd.FirstPartyData", firstPartyData$$serializer, 6);
        dc.HI("model_version", true);
        dc.HI("session_context", true);
        dc.HI("demographic", true);
        dc.HI("location", true);
        dc.HI("revenue", true);
        dc.HI("custom_data", true);
        descriptor = dc;
    }

    @Override // Du.vd
    public XA.Ml[] childSerializers() {
        Y5 y5 = Y5.f2000n;
        return new XA.Ml[]{y5, j.Z(SessionContext$$serializer.INSTANCE), j.Z(Demographic$$serializer.INSTANCE), j.Z(Location$$serializer.INSTANCE), j.Z(Revenue$$serializer.INSTANCE), j.Z(new mz(y5, y5))};
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public Wre getDescriptor() {
        return descriptor;
    }

    private FirstPartyData$$serializer() {
    }

    @Override // Du.vd
    public XA.Ml[] typeParametersSerializers() {
        return vd.j.n(this);
    }
}
