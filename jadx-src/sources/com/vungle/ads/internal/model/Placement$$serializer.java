package com.vungle.ads.internal.model;

import Du.DC;
import Du.Dsr;
import Du.Y5;
import Du.i;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/Placement.$serializer", "LDu/vd;", "Lcom/vungle/ads/internal/model/Placement;", "<init>", "()V", "", "LXA/Ml;", "childSerializers", "()[LXA/Ml;", "Lgi/I28;", "decoder", "deserialize", "(Lgi/I28;)Lcom/vungle/ads/internal/model/Placement;", "Lgi/Wre;", "encoder", "value", "", "serialize", "(Lgi/Wre;Lcom/vungle/ads/internal/model/Placement;)V", "LEJn/Wre;", "getDescriptor", "()LEJn/Wre;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class Placement$$serializer implements vd {
    public static final Placement$$serializer INSTANCE;
    public static final /* synthetic */ Wre descriptor;

    @Override // XA.w6
    public Placement deserialize(I28 decoder) {
        boolean z2;
        int i2;
        String str;
        Object objE;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Wre descriptor2 = getDescriptor();
        w6 w6VarRl = decoder.rl(descriptor2);
        if (w6VarRl.HI()) {
            String strIk = w6VarRl.Ik(descriptor2, 0);
            boolean zMUb = w6VarRl.mUb(descriptor2, 1);
            objE = w6VarRl.e(descriptor2, 2, Y5.f2000n, null);
            str = strIk;
            z2 = zMUb;
            i2 = 7;
        } else {
            boolean z3 = true;
            boolean zMUb2 = false;
            String strIk2 = null;
            Object objE2 = null;
            int i3 = 0;
            while (z3) {
                int iNY = w6VarRl.nY(descriptor2);
                if (iNY == -1) {
                    z3 = false;
                } else if (iNY == 0) {
                    strIk2 = w6VarRl.Ik(descriptor2, 0);
                    i3 |= 1;
                } else if (iNY == 1) {
                    zMUb2 = w6VarRl.mUb(descriptor2, 1);
                    i3 |= 2;
                } else {
                    if (iNY != 2) {
                        throw new UnknownFieldException(iNY);
                    }
                    objE2 = w6VarRl.e(descriptor2, 2, Y5.f2000n, objE2);
                    i3 |= 4;
                }
            }
            z2 = zMUb2;
            i2 = i3;
            str = strIk2;
            objE = objE2;
        }
        w6VarRl.t(descriptor2);
        return new Placement(i2, str, z2, (String) objE, (i) null);
    }

    @Override // XA.eO
    public void serialize(gi.Wre encoder, Placement value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Wre descriptor2 = getDescriptor();
        Ml mlRl = encoder.rl(descriptor2);
        Placement.write$Self(value, mlRl, descriptor2);
        mlRl.t(descriptor2);
    }

    static {
        Placement$$serializer placement$$serializer = new Placement$$serializer();
        INSTANCE = placement$$serializer;
        DC dc = new DC("com.vungle.ads.internal.model.Placement", placement$$serializer, 3);
        dc.HI("placement_ref_id", false);
        dc.HI("is_hb", true);
        dc.HI("type", true);
        descriptor = dc;
    }

    @Override // Du.vd
    public XA.Ml[] childSerializers() {
        Y5 y5 = Y5.f2000n;
        return new XA.Ml[]{y5, Dsr.f1956n, j.Z(y5)};
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public Wre getDescriptor() {
        return descriptor;
    }

    private Placement$$serializer() {
    }

    @Override // Du.vd
    public XA.Ml[] typeParametersSerializers() {
        return vd.j.n(this);
    }
}
