package com.vungle.ads.internal.model;

import Du.DC;
import Du.Y5;
import Du.i;
import Du.vd;
import EJn.Wre;
import WY.j;
import com.safedk.android.analytics.brandsafety.l;
import com.vungle.ads.internal.model.ConfigPayload;
import gi.I28;
import gi.Ml;
import gi.w6;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/ConfigPayload.Endpoints.$serializer", "LDu/vd;", "Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "<init>", "()V", "", "LXA/Ml;", "childSerializers", "()[LXA/Ml;", "Lgi/I28;", "decoder", "deserialize", "(Lgi/I28;)Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "Lgi/Wre;", "encoder", "value", "", "serialize", "(Lgi/Wre;Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;)V", "LEJn/Wre;", "getDescriptor", "()LEJn/Wre;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class ConfigPayload$Endpoints$$serializer implements vd {
    public static final ConfigPayload$Endpoints$$serializer INSTANCE;
    public static final /* synthetic */ Wre descriptor;

    @Override // XA.w6
    public ConfigPayload.Endpoints deserialize(I28 decoder) {
        Object objE;
        int i2;
        Object objE2;
        Object objE3;
        Object objE4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Wre descriptor2 = getDescriptor();
        w6 w6VarRl = decoder.rl(descriptor2);
        Object objE5 = null;
        if (w6VarRl.HI()) {
            Y5 y5 = Y5.f2000n;
            objE2 = w6VarRl.e(descriptor2, 0, y5, null);
            objE3 = w6VarRl.e(descriptor2, 1, y5, null);
            Object objE6 = w6VarRl.e(descriptor2, 2, y5, null);
            objE4 = w6VarRl.e(descriptor2, 3, y5, null);
            objE = objE6;
            i2 = 15;
        } else {
            boolean z2 = true;
            int i3 = 0;
            Object objE7 = null;
            objE = null;
            Object objE8 = null;
            while (z2) {
                int iNY = w6VarRl.nY(descriptor2);
                if (iNY == -1) {
                    z2 = false;
                } else if (iNY == 0) {
                    objE5 = w6VarRl.e(descriptor2, 0, Y5.f2000n, objE5);
                    i3 |= 1;
                } else if (iNY == 1) {
                    objE7 = w6VarRl.e(descriptor2, 1, Y5.f2000n, objE7);
                    i3 |= 2;
                } else if (iNY == 2) {
                    objE = w6VarRl.e(descriptor2, 2, Y5.f2000n, objE);
                    i3 |= 4;
                } else {
                    if (iNY != 3) {
                        throw new UnknownFieldException(iNY);
                    }
                    objE8 = w6VarRl.e(descriptor2, 3, Y5.f2000n, objE8);
                    i3 |= 8;
                }
            }
            i2 = i3;
            objE2 = objE5;
            objE3 = objE7;
            objE4 = objE8;
        }
        w6VarRl.t(descriptor2);
        return new ConfigPayload.Endpoints(i2, (String) objE2, (String) objE3, (String) objE, (String) objE4, (i) null);
    }

    @Override // XA.eO
    public void serialize(gi.Wre encoder, ConfigPayload.Endpoints value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Wre descriptor2 = getDescriptor();
        Ml mlRl = encoder.rl(descriptor2);
        ConfigPayload.Endpoints.write$Self(value, mlRl, descriptor2);
        mlRl.t(descriptor2);
    }

    static {
        ConfigPayload$Endpoints$$serializer configPayload$Endpoints$$serializer = new ConfigPayload$Endpoints$$serializer();
        INSTANCE = configPayload$Endpoints$$serializer;
        DC dc = new DC("com.vungle.ads.internal.model.ConfigPayload.Endpoints", configPayload$Endpoints$$serializer, 4);
        dc.HI(l.f62638S, true);
        dc.HI("ri", true);
        dc.HI("error_logs", true);
        dc.HI("metrics", true);
        descriptor = dc;
    }

    @Override // Du.vd
    public XA.Ml[] childSerializers() {
        Y5 y5 = Y5.f2000n;
        return new XA.Ml[]{j.Z(y5), j.Z(y5), j.Z(y5), j.Z(y5)};
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public Wre getDescriptor() {
        return descriptor;
    }

    private ConfigPayload$Endpoints$$serializer() {
    }

    @Override // Du.vd
    public XA.Ml[] typeParametersSerializers() {
        return vd.j.n(this);
    }
}
