package com.vungle.ads.internal.model;

import Du.DC;
import Du.Dsr;
import Du.Y5;
import Du.fg;
import Du.i;
import Du.iF;
import Du.rv6;
import Du.vd;
import EJn.Wre;
import WY.j;
import com.vungle.ads.internal.model.DeviceNode;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/DeviceNode.VungleExt.$serializer", "LDu/vd;", "Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "<init>", "()V", "", "LXA/Ml;", "childSerializers", "()[LXA/Ml;", "Lgi/I28;", "decoder", "deserialize", "(Lgi/I28;)Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;", "Lgi/Wre;", "encoder", "value", "", "serialize", "(Lgi/Wre;Lcom/vungle/ads/internal/model/DeviceNode$VungleExt;)V", "LEJn/Wre;", "getDescriptor", "()LEJn/Wre;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class DeviceNode$VungleExt$$serializer implements vd {
    public static final DeviceNode$VungleExt$$serializer INSTANCE;
    public static final /* synthetic */ Wre descriptor;

    @Override // XA.w6
    public DeviceNode.VungleExt deserialize(I28 decoder) {
        Object objE;
        Object objE2;
        Object objE3;
        Object obj;
        Object obj2;
        int i2;
        Object obj3;
        Object objE4;
        Object objE5;
        Object objE6;
        Object objE7;
        boolean z2;
        float f3;
        Object objE8;
        Object objE9;
        int i3;
        boolean z3;
        boolean z4;
        int i5;
        int i7;
        float f4;
        Object objE10;
        Object objE11;
        Object objE12;
        Object obj4;
        int i8;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object objE13;
        Object obj9;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Wre descriptor2 = getDescriptor();
        w6 w6VarRl = decoder.rl(descriptor2);
        int i9 = 0;
        if (w6VarRl.HI()) {
            boolean zMUb = w6VarRl.mUb(descriptor2, 0);
            Y5 y5 = Y5.f2000n;
            Object objE14 = w6VarRl.e(descriptor2, 1, y5, null);
            objE8 = w6VarRl.e(descriptor2, 2, iF.f2020n, null);
            float fUo = w6VarRl.Uo(descriptor2, 3);
            objE12 = w6VarRl.e(descriptor2, 4, y5, null);
            int iXQ = w6VarRl.XQ(descriptor2, 5);
            objE9 = w6VarRl.e(descriptor2, 6, y5, null);
            objE10 = w6VarRl.e(descriptor2, 7, y5, null);
            objE7 = w6VarRl.e(descriptor2, 8, y5, null);
            objE6 = w6VarRl.e(descriptor2, 9, y5, null);
            objE5 = w6VarRl.e(descriptor2, 10, y5, null);
            float fUo2 = w6VarRl.Uo(descriptor2, 11);
            int iXQ2 = w6VarRl.XQ(descriptor2, 12);
            boolean zMUb2 = w6VarRl.mUb(descriptor2, 13);
            int iXQ3 = w6VarRl.XQ(descriptor2, 14);
            boolean zMUb3 = w6VarRl.mUb(descriptor2, 15);
            obj2 = objE14;
            Object objE15 = w6VarRl.e(descriptor2, 16, y5, null);
            objE4 = w6VarRl.e(descriptor2, 17, y5, null);
            fg fgVar = fg.f2014n;
            Object objE16 = w6VarRl.e(descriptor2, 18, fgVar, null);
            Object objE17 = w6VarRl.e(descriptor2, 19, fgVar, null);
            objE11 = w6VarRl.e(descriptor2, 20, fgVar, null);
            Object objE18 = w6VarRl.e(descriptor2, 21, fgVar, null);
            objE3 = w6VarRl.e(descriptor2, 22, y5, null);
            i2 = 8388607;
            i3 = iXQ2;
            i7 = iXQ;
            f4 = fUo2;
            obj3 = objE16;
            z2 = zMUb3;
            i5 = iXQ3;
            z4 = zMUb2;
            z3 = zMUb;
            f3 = fUo;
            objE = objE17;
            objE2 = objE18;
            obj = objE15;
        } else {
            objE = null;
            boolean z5 = true;
            Object objE19 = null;
            Object objE20 = null;
            Object objE21 = null;
            Object objE22 = null;
            Object obj10 = null;
            objE2 = null;
            Object objE23 = null;
            Object objE24 = null;
            Object objE25 = null;
            Object objE26 = null;
            Object objE27 = null;
            Object objE28 = null;
            Object objE29 = null;
            boolean zMUb4 = false;
            int iXQ4 = 0;
            boolean zMUb5 = false;
            boolean zMUb6 = false;
            int iXQ5 = 0;
            int iXQ6 = 0;
            float fUo3 = 0.0f;
            float fUo4 = 0.0f;
            Object objE30 = null;
            while (z5) {
                Object obj11 = obj10;
                int iNY = w6VarRl.nY(descriptor2);
                switch (iNY) {
                    case -1:
                        obj5 = objE28;
                        obj6 = obj11;
                        z5 = false;
                        objE20 = objE20;
                        objE28 = obj5;
                        obj10 = obj6;
                        break;
                    case 0:
                        obj5 = objE28;
                        obj6 = obj11;
                        zMUb5 = w6VarRl.mUb(descriptor2, 0);
                        i9 |= 1;
                        objE20 = objE20;
                        objE19 = objE19;
                        objE28 = obj5;
                        obj10 = obj6;
                        break;
                    case 1:
                        i9 |= 2;
                        objE29 = objE29;
                        obj10 = obj11;
                        objE19 = objE19;
                        objE28 = w6VarRl.e(descriptor2, 1, Y5.f2000n, objE28);
                        objE20 = objE20;
                        break;
                    case 2:
                        obj7 = objE19;
                        obj8 = objE20;
                        objE29 = w6VarRl.e(descriptor2, 2, iF.f2020n, objE29);
                        i9 |= 4;
                        obj10 = obj11;
                        objE20 = obj8;
                        objE19 = obj7;
                        break;
                    case 3:
                        obj7 = objE19;
                        obj8 = objE20;
                        objE13 = obj11;
                        fUo3 = w6VarRl.Uo(descriptor2, 3);
                        i9 |= 8;
                        obj10 = objE13;
                        objE20 = obj8;
                        objE19 = obj7;
                        break;
                    case 4:
                        obj7 = objE19;
                        obj8 = objE20;
                        objE13 = w6VarRl.e(descriptor2, 4, Y5.f2000n, obj11);
                        i9 |= 16;
                        obj10 = objE13;
                        objE20 = obj8;
                        objE19 = obj7;
                        break;
                    case 5:
                        obj9 = objE19;
                        iXQ6 = w6VarRl.XQ(descriptor2, 5);
                        i9 |= 32;
                        objE20 = objE20;
                        objE19 = obj9;
                        obj10 = obj11;
                        break;
                    case 6:
                        obj9 = objE19;
                        objE20 = w6VarRl.e(descriptor2, 6, Y5.f2000n, objE20);
                        i9 |= 64;
                        objE19 = obj9;
                        obj10 = obj11;
                        break;
                    case 7:
                        obj4 = objE20;
                        objE21 = w6VarRl.e(descriptor2, 7, Y5.f2000n, objE21);
                        i9 |= 128;
                        obj10 = obj11;
                        objE20 = obj4;
                        break;
                    case 8:
                        obj4 = objE20;
                        objE27 = w6VarRl.e(descriptor2, 8, Y5.f2000n, objE27);
                        i9 |= 256;
                        obj10 = obj11;
                        objE20 = obj4;
                        break;
                    case 9:
                        obj4 = objE20;
                        objE26 = w6VarRl.e(descriptor2, 9, Y5.f2000n, objE26);
                        i9 |= 512;
                        obj10 = obj11;
                        objE20 = obj4;
                        break;
                    case 10:
                        obj4 = objE20;
                        objE25 = w6VarRl.e(descriptor2, 10, Y5.f2000n, objE25);
                        i9 |= 1024;
                        obj10 = obj11;
                        objE20 = obj4;
                        break;
                    case 11:
                        obj4 = objE20;
                        fUo4 = w6VarRl.Uo(descriptor2, 11);
                        i9 |= 2048;
                        obj10 = obj11;
                        objE20 = obj4;
                        break;
                    case 12:
                        obj4 = objE20;
                        iXQ4 = w6VarRl.XQ(descriptor2, 12);
                        i9 |= 4096;
                        obj10 = obj11;
                        objE20 = obj4;
                        break;
                    case 13:
                        obj4 = objE20;
                        zMUb6 = w6VarRl.mUb(descriptor2, 13);
                        i9 |= 8192;
                        obj10 = obj11;
                        objE20 = obj4;
                        break;
                    case 14:
                        obj4 = objE20;
                        iXQ5 = w6VarRl.XQ(descriptor2, 14);
                        i9 |= 16384;
                        obj10 = obj11;
                        objE20 = obj4;
                        break;
                    case 15:
                        obj4 = objE20;
                        zMUb4 = w6VarRl.mUb(descriptor2, 15);
                        i9 |= 32768;
                        obj10 = obj11;
                        objE20 = obj4;
                        break;
                    case 16:
                        obj4 = objE20;
                        objE22 = w6VarRl.e(descriptor2, 16, Y5.f2000n, objE22);
                        i8 = 65536;
                        i9 |= i8;
                        obj10 = obj11;
                        objE20 = obj4;
                        break;
                    case 17:
                        obj4 = objE20;
                        objE24 = w6VarRl.e(descriptor2, 17, Y5.f2000n, objE24);
                        i8 = 131072;
                        i9 |= i8;
                        obj10 = obj11;
                        objE20 = obj4;
                        break;
                    case 18:
                        obj4 = objE20;
                        objE23 = w6VarRl.e(descriptor2, 18, fg.f2014n, objE23);
                        i8 = 262144;
                        i9 |= i8;
                        obj10 = obj11;
                        objE20 = obj4;
                        break;
                    case 19:
                        obj4 = objE20;
                        objE = w6VarRl.e(descriptor2, 19, fg.f2014n, objE);
                        i8 = 524288;
                        i9 |= i8;
                        obj10 = obj11;
                        objE20 = obj4;
                        break;
                    case 20:
                        obj4 = objE20;
                        objE30 = w6VarRl.e(descriptor2, 20, fg.f2014n, objE30);
                        i8 = 1048576;
                        i9 |= i8;
                        obj10 = obj11;
                        objE20 = obj4;
                        break;
                    case 21:
                        obj4 = objE20;
                        objE2 = w6VarRl.e(descriptor2, 21, fg.f2014n, objE2);
                        i8 = 2097152;
                        i9 |= i8;
                        obj10 = obj11;
                        objE20 = obj4;
                        break;
                    case 22:
                        obj4 = objE20;
                        objE19 = w6VarRl.e(descriptor2, 22, Y5.f2000n, objE19);
                        i8 = 4194304;
                        i9 |= i8;
                        obj10 = obj11;
                        objE20 = obj4;
                        break;
                    default:
                        throw new UnknownFieldException(iNY);
                }
            }
            objE3 = objE19;
            Object obj12 = objE20;
            Object obj13 = obj10;
            obj = objE22;
            obj2 = objE28;
            i2 = i9;
            obj3 = objE23;
            objE4 = objE24;
            objE5 = objE25;
            objE6 = objE26;
            objE7 = objE27;
            z2 = zMUb4;
            f3 = fUo3;
            objE8 = objE29;
            objE9 = obj12;
            i3 = iXQ4;
            z3 = zMUb5;
            z4 = zMUb6;
            i5 = iXQ5;
            i7 = iXQ6;
            f4 = fUo4;
            objE10 = objE21;
            objE11 = objE30;
            objE12 = obj13;
        }
        w6VarRl.t(descriptor2);
        return new DeviceNode.VungleExt(i2, z3, (String) obj2, (Integer) objE8, f3, (String) objE12, i7, (String) objE9, (String) objE10, (String) objE7, (String) objE6, (String) objE5, f4, i3, z4, i5, z2, (String) obj, (String) objE4, (Long) obj3, (Long) objE, (Long) objE11, (Long) objE2, (String) objE3, (i) null);
    }

    @Override // XA.eO
    public void serialize(gi.Wre encoder, DeviceNode.VungleExt value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Wre descriptor2 = getDescriptor();
        Ml mlRl = encoder.rl(descriptor2);
        DeviceNode.VungleExt.write$Self(value, mlRl, descriptor2);
        mlRl.t(descriptor2);
    }

    static {
        DeviceNode$VungleExt$$serializer deviceNode$VungleExt$$serializer = new DeviceNode$VungleExt$$serializer();
        INSTANCE = deviceNode$VungleExt$$serializer;
        DC dc = new DC("com.vungle.ads.internal.model.DeviceNode.VungleExt", deviceNode$VungleExt$$serializer, 23);
        dc.HI("is_google_play_services_available", true);
        dc.HI("app_set_id", true);
        dc.HI("app_set_id_scope", true);
        dc.HI("battery_level", true);
        dc.HI("battery_state", true);
        dc.HI("battery_saver_enabled", true);
        dc.HI("connection_type", true);
        dc.HI("connection_type_detail", true);
        dc.HI("locale", true);
        dc.HI("language", true);
        dc.HI("time_zone", true);
        dc.HI("volume_level", true);
        dc.HI("sound_enabled", true);
        dc.HI("is_tv", true);
        dc.HI("sd_card_available", true);
        dc.HI("is_sideload_enabled", true);
        dc.HI("gaid", true);
        dc.HI("amazon_advertising_id", true);
        dc.HI("sit", true);
        dc.HI("oit", true);
        dc.HI("ort", true);
        dc.HI("obt", true);
        dc.HI("gp_version", true);
        descriptor = dc;
    }

    @Override // Du.vd
    public XA.Ml[] childSerializers() {
        Y5 y5 = Y5.f2000n;
        XA.Ml mlZ = j.Z(y5);
        iF iFVar = iF.f2020n;
        XA.Ml mlZ2 = j.Z(iFVar);
        XA.Ml mlZ3 = j.Z(y5);
        XA.Ml mlZ4 = j.Z(y5);
        XA.Ml mlZ5 = j.Z(y5);
        XA.Ml mlZ6 = j.Z(y5);
        XA.Ml mlZ7 = j.Z(y5);
        XA.Ml mlZ8 = j.Z(y5);
        XA.Ml mlZ9 = j.Z(y5);
        XA.Ml mlZ10 = j.Z(y5);
        fg fgVar = fg.f2014n;
        XA.Ml mlZ11 = j.Z(fgVar);
        XA.Ml mlZ12 = j.Z(fgVar);
        XA.Ml mlZ13 = j.Z(fgVar);
        XA.Ml mlZ14 = j.Z(fgVar);
        XA.Ml mlZ15 = j.Z(y5);
        Dsr dsr = Dsr.f1956n;
        rv6 rv6Var = rv6.f2048n;
        return new XA.Ml[]{dsr, mlZ, mlZ2, rv6Var, mlZ3, iFVar, mlZ4, mlZ5, mlZ6, mlZ7, mlZ8, rv6Var, iFVar, dsr, iFVar, dsr, mlZ9, mlZ10, mlZ11, mlZ12, mlZ13, mlZ14, mlZ15};
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public Wre getDescriptor() {
        return descriptor;
    }

    private DeviceNode$VungleExt$$serializer() {
    }

    @Override // Du.vd
    public XA.Ml[] typeParametersSerializers() {
        return vd.j.n(this);
    }
}
