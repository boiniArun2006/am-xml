package com.vungle.ads.internal.model;

import Du.DC;
import Du.Dsr;
import Du.Y5;
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
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/ConfigPayload.$serializer", "LDu/vd;", "Lcom/vungle/ads/internal/model/ConfigPayload;", "<init>", "()V", "", "LXA/Ml;", "childSerializers", "()[LXA/Ml;", "Lgi/I28;", "decoder", "deserialize", "(Lgi/I28;)Lcom/vungle/ads/internal/model/ConfigPayload;", "Lgi/Wre;", "encoder", "value", "", "serialize", "(Lgi/Wre;Lcom/vungle/ads/internal/model/ConfigPayload;)V", "LEJn/Wre;", "getDescriptor", "()LEJn/Wre;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class ConfigPayload$$serializer implements vd {
    public static final ConfigPayload$$serializer INSTANCE;
    public static final /* synthetic */ Wre descriptor;

    @Override // XA.w6
    public ConfigPayload deserialize(I28 decoder) {
        Object objE;
        Object objE2;
        Object obj;
        Object obj2;
        Object obj3;
        Object objE3;
        Object obj4;
        Object objE4;
        Object objE5;
        Object objE6;
        Object objE7;
        int i2;
        Object obj5;
        Object obj6;
        Object objE8;
        Object objE9;
        Object objE10;
        Object objE11;
        Object objE12;
        Object objE13;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Wre descriptor2 = getDescriptor();
        w6 w6VarRl = decoder.rl(descriptor2);
        if (w6VarRl.HI()) {
            Object objE14 = w6VarRl.e(descriptor2, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, null);
            objE7 = w6VarRl.e(descriptor2, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, null);
            objE3 = w6VarRl.e(descriptor2, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, null);
            Object objE15 = w6VarRl.e(descriptor2, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, null);
            Object objE16 = w6VarRl.e(descriptor2, 4, new Du.Wre(Placement$$serializer.INSTANCE), null);
            objE9 = w6VarRl.e(descriptor2, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, null);
            objE13 = w6VarRl.e(descriptor2, 6, Y5.f2000n, null);
            Dsr dsr = Dsr.f1956n;
            objE12 = w6VarRl.e(descriptor2, 7, dsr, null);
            objE11 = w6VarRl.e(descriptor2, 8, dsr, null);
            iF iFVar = iF.f2020n;
            objE10 = w6VarRl.e(descriptor2, 9, iFVar, null);
            objE8 = w6VarRl.e(descriptor2, 10, dsr, null);
            Object objE17 = w6VarRl.e(descriptor2, 11, iFVar, null);
            Object objE18 = w6VarRl.e(descriptor2, 12, dsr, null);
            obj6 = objE17;
            objE6 = w6VarRl.e(descriptor2, 13, dsr, null);
            objE5 = w6VarRl.e(descriptor2, 14, dsr, null);
            objE4 = w6VarRl.e(descriptor2, 15, fg.f2014n, null);
            Object objE19 = w6VarRl.e(descriptor2, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, null);
            Object objE20 = w6VarRl.e(descriptor2, 17, dsr, null);
            objE2 = w6VarRl.e(descriptor2, 18, dsr, null);
            obj3 = objE15;
            obj = objE20;
            obj4 = objE19;
            obj2 = objE14;
            i2 = 524287;
            obj5 = objE18;
            objE = objE16;
        } else {
            boolean z2 = true;
            Object objE21 = null;
            Object objE22 = null;
            Object objE23 = null;
            Object objE24 = null;
            Object objE25 = null;
            Object objE26 = null;
            Object objE27 = null;
            Object objE28 = null;
            Object objE29 = null;
            Object objE30 = null;
            objE = null;
            Object objE31 = null;
            Object objE32 = null;
            Object objE33 = null;
            Object objE34 = null;
            Object objE35 = null;
            Object objE36 = null;
            Object objE37 = null;
            int i3 = 0;
            Object objE38 = null;
            while (z2) {
                int iNY = w6VarRl.nY(descriptor2);
                switch (iNY) {
                    case -1:
                        obj7 = objE38;
                        obj8 = objE21;
                        obj9 = objE25;
                        z2 = false;
                        objE25 = obj9;
                        objE38 = obj7;
                        objE21 = obj8;
                        break;
                    case 0:
                        obj8 = objE21;
                        obj9 = objE25;
                        obj7 = objE38;
                        objE37 = w6VarRl.e(descriptor2, 0, ConfigPayload$CleverCache$$serializer.INSTANCE, objE37);
                        i3 |= 1;
                        objE25 = obj9;
                        objE38 = obj7;
                        objE21 = obj8;
                        break;
                    case 1:
                        obj8 = objE21;
                        i3 |= 2;
                        objE38 = w6VarRl.e(descriptor2, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE, objE38);
                        objE25 = objE25;
                        objE21 = obj8;
                        break;
                    case 2:
                        obj10 = objE38;
                        obj11 = objE25;
                        objE24 = w6VarRl.e(descriptor2, 2, ConfigPayload$Endpoints$$serializer.INSTANCE, objE24);
                        i3 |= 4;
                        objE25 = obj11;
                        objE38 = obj10;
                        break;
                    case 3:
                        obj10 = objE38;
                        obj11 = objE25;
                        objE23 = w6VarRl.e(descriptor2, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, objE23);
                        i3 |= 8;
                        objE25 = obj11;
                        objE38 = obj10;
                        break;
                    case 4:
                        obj10 = objE38;
                        obj11 = objE25;
                        objE = w6VarRl.e(descriptor2, 4, new Du.Wre(Placement$$serializer.INSTANCE), objE);
                        i3 |= 16;
                        objE25 = obj11;
                        objE38 = obj10;
                        break;
                    case 5:
                        obj10 = objE38;
                        obj11 = objE25;
                        objE21 = w6VarRl.e(descriptor2, 5, ConfigPayload$UserPrivacy$$serializer.INSTANCE, objE21);
                        i3 |= 32;
                        objE25 = obj11;
                        objE38 = obj10;
                        break;
                    case 6:
                        obj10 = objE38;
                        obj11 = objE25;
                        objE30 = w6VarRl.e(descriptor2, 6, Y5.f2000n, objE30);
                        i3 |= 64;
                        objE25 = obj11;
                        objE38 = obj10;
                        break;
                    case 7:
                        obj10 = objE38;
                        obj11 = objE25;
                        objE29 = w6VarRl.e(descriptor2, 7, Dsr.f1956n, objE29);
                        i3 |= 128;
                        objE25 = obj11;
                        objE38 = obj10;
                        break;
                    case 8:
                        obj10 = objE38;
                        obj11 = objE25;
                        objE28 = w6VarRl.e(descriptor2, 8, Dsr.f1956n, objE28);
                        i3 |= 256;
                        objE25 = obj11;
                        objE38 = obj10;
                        break;
                    case 9:
                        obj10 = objE38;
                        obj11 = objE25;
                        objE22 = w6VarRl.e(descriptor2, 9, iF.f2020n, objE22);
                        i3 |= 512;
                        objE25 = obj11;
                        objE38 = obj10;
                        break;
                    case 10:
                        obj10 = objE38;
                        obj11 = objE25;
                        objE27 = w6VarRl.e(descriptor2, 10, Dsr.f1956n, objE27);
                        i3 |= 1024;
                        objE25 = obj11;
                        objE38 = obj10;
                        break;
                    case 11:
                        obj10 = objE38;
                        obj11 = objE25;
                        objE26 = w6VarRl.e(descriptor2, 11, iF.f2020n, objE26);
                        i3 |= 2048;
                        objE25 = obj11;
                        objE38 = obj10;
                        break;
                    case 12:
                        obj10 = objE38;
                        objE31 = w6VarRl.e(descriptor2, 12, Dsr.f1956n, objE31);
                        i3 |= 4096;
                        objE25 = objE25;
                        objE32 = objE32;
                        objE38 = obj10;
                        break;
                    case 13:
                        obj10 = objE38;
                        objE32 = w6VarRl.e(descriptor2, 13, Dsr.f1956n, objE32);
                        i3 |= 8192;
                        objE25 = objE25;
                        objE33 = objE33;
                        objE38 = obj10;
                        break;
                    case 14:
                        obj10 = objE38;
                        objE33 = w6VarRl.e(descriptor2, 14, Dsr.f1956n, objE33);
                        i3 |= 16384;
                        objE25 = objE25;
                        objE34 = objE34;
                        objE38 = obj10;
                        break;
                    case 15:
                        obj10 = objE38;
                        objE34 = w6VarRl.e(descriptor2, 15, fg.f2014n, objE34);
                        i3 |= 32768;
                        objE25 = objE25;
                        objE35 = objE35;
                        objE38 = obj10;
                        break;
                    case 16:
                        obj10 = objE38;
                        objE35 = w6VarRl.e(descriptor2, 16, ConfigPayload$AutoRedirect$$serializer.INSTANCE, objE35);
                        i3 |= 65536;
                        objE25 = objE25;
                        objE36 = objE36;
                        objE38 = obj10;
                        break;
                    case 17:
                        obj10 = objE38;
                        obj11 = objE25;
                        objE36 = w6VarRl.e(descriptor2, 17, Dsr.f1956n, objE36);
                        i3 |= 131072;
                        objE25 = obj11;
                        objE38 = obj10;
                        break;
                    case 18:
                        objE25 = w6VarRl.e(descriptor2, 18, Dsr.f1956n, objE25);
                        i3 |= 262144;
                        objE38 = objE38;
                        break;
                    default:
                        throw new UnknownFieldException(iNY);
                }
            }
            Object obj12 = objE38;
            Object obj13 = objE21;
            objE2 = objE25;
            obj = objE36;
            obj2 = objE37;
            obj3 = objE23;
            objE3 = objE24;
            obj4 = objE35;
            objE4 = objE34;
            objE5 = objE33;
            objE6 = objE32;
            objE7 = obj12;
            i2 = i3;
            obj5 = objE31;
            obj6 = objE26;
            objE8 = objE27;
            objE9 = obj13;
            objE10 = objE22;
            objE11 = objE28;
            objE12 = objE29;
            objE13 = objE30;
        }
        w6VarRl.t(descriptor2);
        return new ConfigPayload(i2, (ConfigPayload.CleverCache) obj2, (ConfigPayload.ConfigSettings) objE7, (ConfigPayload.Endpoints) objE3, (ConfigPayload.LogMetricsSettings) obj3, (List) objE, (ConfigPayload.UserPrivacy) objE9, (String) objE13, (Boolean) objE12, (Boolean) objE11, (Integer) objE10, (Boolean) objE8, (Integer) obj6, (Boolean) obj5, (Boolean) objE6, (Boolean) objE5, (Long) objE4, (ConfigPayload.AutoRedirect) obj4, (Boolean) obj, (Boolean) objE2, (i) null);
    }

    @Override // XA.eO
    public void serialize(gi.Wre encoder, ConfigPayload value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Wre descriptor2 = getDescriptor();
        Ml mlRl = encoder.rl(descriptor2);
        ConfigPayload.write$Self(value, mlRl, descriptor2);
        mlRl.t(descriptor2);
    }

    static {
        ConfigPayload$$serializer configPayload$$serializer = new ConfigPayload$$serializer();
        INSTANCE = configPayload$$serializer;
        DC dc = new DC("com.vungle.ads.internal.model.ConfigPayload", configPayload$$serializer, 19);
        dc.HI("reuse_assets", true);
        dc.HI("config", true);
        dc.HI("endpoints", true);
        dc.HI("log_metrics", true);
        dc.HI("placements", true);
        dc.HI("user", true);
        dc.HI(Cookie.CONFIG_EXTENSION, true);
        dc.HI(Cookie.COPPA_DISABLE_AD_ID, true);
        dc.HI("ri_enabled", true);
        dc.HI("session_timeout", true);
        dc.HI("wait_for_connectivity_for_tpat", true);
        dc.HI("sdk_session_timeout", true);
        dc.HI("signals_disabled", true);
        dc.HI("fpd_enabled", true);
        dc.HI("rta_debugging", true);
        dc.HI("config_last_validated_ts", true);
        dc.HI("auto_redirect", true);
        dc.HI("retry_prioritized_tpat", true);
        dc.HI("enable_ot", true);
        descriptor = dc;
    }

    @Override // Du.vd
    public XA.Ml[] childSerializers() {
        XA.Ml mlZ = j.Z(ConfigPayload$CleverCache$$serializer.INSTANCE);
        XA.Ml mlZ2 = j.Z(ConfigPayload$ConfigSettings$$serializer.INSTANCE);
        XA.Ml mlZ3 = j.Z(ConfigPayload$Endpoints$$serializer.INSTANCE);
        XA.Ml mlZ4 = j.Z(ConfigPayload$LogMetricsSettings$$serializer.INSTANCE);
        XA.Ml mlZ5 = j.Z(new Du.Wre(Placement$$serializer.INSTANCE));
        XA.Ml mlZ6 = j.Z(ConfigPayload$UserPrivacy$$serializer.INSTANCE);
        XA.Ml mlZ7 = j.Z(Y5.f2000n);
        Dsr dsr = Dsr.f1956n;
        XA.Ml mlZ8 = j.Z(dsr);
        XA.Ml mlZ9 = j.Z(dsr);
        iF iFVar = iF.f2020n;
        return new XA.Ml[]{mlZ, mlZ2, mlZ3, mlZ4, mlZ5, mlZ6, mlZ7, mlZ8, mlZ9, j.Z(iFVar), j.Z(dsr), j.Z(iFVar), j.Z(dsr), j.Z(dsr), j.Z(dsr), j.Z(fg.f2014n), j.Z(ConfigPayload$AutoRedirect$$serializer.INSTANCE), j.Z(dsr), j.Z(dsr)};
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public Wre getDescriptor() {
        return descriptor;
    }

    private ConfigPayload$$serializer() {
    }

    @Override // Du.vd
    public XA.Ml[] typeParametersSerializers() {
        return vd.j.n(this);
    }
}
