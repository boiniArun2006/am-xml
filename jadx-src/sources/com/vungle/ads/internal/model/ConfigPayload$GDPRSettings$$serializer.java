package com.vungle.ads.internal.model;

import Du.DC;
import Du.Dsr;
import Du.Y5;
import Du.i;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/ConfigPayload.GDPRSettings.$serializer", "LDu/vd;", "Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "<init>", "()V", "", "LXA/Ml;", "childSerializers", "()[LXA/Ml;", "Lgi/I28;", "decoder", "deserialize", "(Lgi/I28;)Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "Lgi/Wre;", "encoder", "value", "", "serialize", "(Lgi/Wre;Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;)V", "LEJn/Wre;", "getDescriptor", "()LEJn/Wre;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class ConfigPayload$GDPRSettings$$serializer implements vd {
    public static final ConfigPayload$GDPRSettings$$serializer INSTANCE;
    public static final /* synthetic */ Wre descriptor;

    @Override // XA.w6
    public ConfigPayload.GDPRSettings deserialize(I28 decoder) {
        int i2;
        Object objE;
        Object objE2;
        Object objE3;
        Object objE4;
        Object objE5;
        Object objE6;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Wre descriptor2 = getDescriptor();
        w6 w6VarRl = decoder.rl(descriptor2);
        int i3 = 5;
        Object objE7 = null;
        if (w6VarRl.HI()) {
            objE = w6VarRl.e(descriptor2, 0, Dsr.f1956n, null);
            Y5 y5 = Y5.f2000n;
            objE2 = w6VarRl.e(descriptor2, 1, y5, null);
            objE3 = w6VarRl.e(descriptor2, 2, y5, null);
            objE4 = w6VarRl.e(descriptor2, 3, y5, null);
            objE5 = w6VarRl.e(descriptor2, 4, y5, null);
            objE6 = w6VarRl.e(descriptor2, 5, y5, null);
            i2 = 63;
        } else {
            boolean z2 = true;
            int i5 = 0;
            Object objE8 = null;
            Object objE9 = null;
            Object objE10 = null;
            Object objE11 = null;
            Object objE12 = null;
            while (z2) {
                int iNY = w6VarRl.nY(descriptor2);
                switch (iNY) {
                    case -1:
                        z2 = false;
                        i3 = 5;
                        break;
                    case 0:
                        objE7 = w6VarRl.e(descriptor2, 0, Dsr.f1956n, objE7);
                        i5 |= 1;
                        i3 = 5;
                        break;
                    case 1:
                        objE8 = w6VarRl.e(descriptor2, 1, Y5.f2000n, objE8);
                        i5 |= 2;
                        break;
                    case 2:
                        objE9 = w6VarRl.e(descriptor2, 2, Y5.f2000n, objE9);
                        i5 |= 4;
                        break;
                    case 3:
                        objE10 = w6VarRl.e(descriptor2, 3, Y5.f2000n, objE10);
                        i5 |= 8;
                        break;
                    case 4:
                        objE11 = w6VarRl.e(descriptor2, 4, Y5.f2000n, objE11);
                        i5 |= 16;
                        break;
                    case 5:
                        objE12 = w6VarRl.e(descriptor2, i3, Y5.f2000n, objE12);
                        i5 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iNY);
                }
            }
            Object obj = objE7;
            i2 = i5;
            objE = obj;
            objE2 = objE8;
            objE3 = objE9;
            objE4 = objE10;
            objE5 = objE11;
            objE6 = objE12;
        }
        w6VarRl.t(descriptor2);
        return new ConfigPayload.GDPRSettings(i2, (Boolean) objE, (String) objE2, (String) objE3, (String) objE4, (String) objE5, (String) objE6, (i) null);
    }

    @Override // XA.eO
    public void serialize(gi.Wre encoder, ConfigPayload.GDPRSettings value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Wre descriptor2 = getDescriptor();
        Ml mlRl = encoder.rl(descriptor2);
        ConfigPayload.GDPRSettings.write$Self(value, mlRl, descriptor2);
        mlRl.t(descriptor2);
    }

    static {
        ConfigPayload$GDPRSettings$$serializer configPayload$GDPRSettings$$serializer = new ConfigPayload$GDPRSettings$$serializer();
        INSTANCE = configPayload$GDPRSettings$$serializer;
        DC dc = new DC("com.vungle.ads.internal.model.ConfigPayload.GDPRSettings", configPayload$GDPRSettings$$serializer, 6);
        dc.HI("is_country_data_protected", true);
        dc.HI("consent_title", true);
        dc.HI("consent_message", true);
        dc.HI("consent_message_version", true);
        dc.HI("button_accept", true);
        dc.HI("button_deny", true);
        descriptor = dc;
    }

    @Override // Du.vd
    public XA.Ml[] childSerializers() {
        XA.Ml mlZ = j.Z(Dsr.f1956n);
        Y5 y5 = Y5.f2000n;
        return new XA.Ml[]{mlZ, j.Z(y5), j.Z(y5), j.Z(y5), j.Z(y5), j.Z(y5)};
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public Wre getDescriptor() {
        return descriptor;
    }

    private ConfigPayload$GDPRSettings$$serializer() {
    }

    @Override // Du.vd
    public XA.Ml[] typeParametersSerializers() {
        return vd.j.n(this);
    }
}
