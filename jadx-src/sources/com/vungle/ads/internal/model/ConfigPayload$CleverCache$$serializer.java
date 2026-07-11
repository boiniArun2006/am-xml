package com.vungle.ads.internal.model;

import Du.DC;
import Du.Dsr;
import Du.fg;
import Du.i;
import Du.iF;
import Du.vd;
import EJn.Wre;
import WY.j;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/ConfigPayload.CleverCache.$serializer", "LDu/vd;", "Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "<init>", "()V", "", "LXA/Ml;", "childSerializers", "()[LXA/Ml;", "Lgi/I28;", "decoder", "deserialize", "(Lgi/I28;)Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;", "Lgi/Wre;", "encoder", "value", "", "serialize", "(Lgi/Wre;Lcom/vungle/ads/internal/model/ConfigPayload$CleverCache;)V", "LEJn/Wre;", "getDescriptor", "()LEJn/Wre;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class ConfigPayload$CleverCache$$serializer implements vd {
    public static final ConfigPayload$CleverCache$$serializer INSTANCE;
    public static final /* synthetic */ Wre descriptor;

    @Override // XA.w6
    public ConfigPayload.CleverCache deserialize(I28 decoder) {
        int i2;
        Object objE;
        Object objE2;
        Object objE3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Wre descriptor2 = getDescriptor();
        w6 w6VarRl = decoder.rl(descriptor2);
        Object objE4 = null;
        if (w6VarRl.HI()) {
            objE = w6VarRl.e(descriptor2, 0, Dsr.f1956n, null);
            objE2 = w6VarRl.e(descriptor2, 1, fg.f2014n, null);
            objE3 = w6VarRl.e(descriptor2, 2, iF.f2020n, null);
            i2 = 7;
        } else {
            boolean z2 = true;
            int i3 = 0;
            Object objE5 = null;
            Object objE6 = null;
            while (z2) {
                int iNY = w6VarRl.nY(descriptor2);
                if (iNY == -1) {
                    z2 = false;
                } else if (iNY == 0) {
                    objE4 = w6VarRl.e(descriptor2, 0, Dsr.f1956n, objE4);
                    i3 |= 1;
                } else if (iNY == 1) {
                    objE5 = w6VarRl.e(descriptor2, 1, fg.f2014n, objE5);
                    i3 |= 2;
                } else {
                    if (iNY != 2) {
                        throw new UnknownFieldException(iNY);
                    }
                    objE6 = w6VarRl.e(descriptor2, 2, iF.f2020n, objE6);
                    i3 |= 4;
                }
            }
            Object obj = objE4;
            i2 = i3;
            objE = obj;
            objE2 = objE5;
            objE3 = objE6;
        }
        w6VarRl.t(descriptor2);
        return new ConfigPayload.CleverCache(i2, (Boolean) objE, (Long) objE2, (Integer) objE3, (i) null);
    }

    @Override // XA.eO
    public void serialize(gi.Wre encoder, ConfigPayload.CleverCache value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Wre descriptor2 = getDescriptor();
        Ml mlRl = encoder.rl(descriptor2);
        ConfigPayload.CleverCache.write$Self(value, mlRl, descriptor2);
        mlRl.t(descriptor2);
    }

    static {
        ConfigPayload$CleverCache$$serializer configPayload$CleverCache$$serializer = new ConfigPayload$CleverCache$$serializer();
        INSTANCE = configPayload$CleverCache$$serializer;
        DC dc = new DC("com.vungle.ads.internal.model.ConfigPayload.CleverCache", configPayload$CleverCache$$serializer, 3);
        dc.HI("enabled", true);
        dc.HI("disk_size", true);
        dc.HI("disk_percentage", true);
        descriptor = dc;
    }

    @Override // Du.vd
    public XA.Ml[] childSerializers() {
        return new XA.Ml[]{j.Z(Dsr.f1956n), j.Z(fg.f2014n), j.Z(iF.f2020n)};
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public Wre getDescriptor() {
        return descriptor;
    }

    private ConfigPayload$CleverCache$$serializer() {
    }

    @Override // Du.vd
    public XA.Ml[] typeParametersSerializers() {
        return vd.j.n(this);
    }
}
