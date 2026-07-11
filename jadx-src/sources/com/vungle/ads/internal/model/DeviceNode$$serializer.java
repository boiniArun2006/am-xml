package com.vungle.ads.internal.model;

import Du.DC;
import Du.Y5;
import Du.i;
import Du.iF;
import Du.vd;
import EJn.Wre;
import ScC.FuwU.pTYaLzzmJSGAPQ;
import WY.j;
import androidx.media3.exoplayer.upstream.CmcdData;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/DeviceNode.$serializer", "LDu/vd;", "Lcom/vungle/ads/internal/model/DeviceNode;", "<init>", "()V", "", "LXA/Ml;", "childSerializers", "()[LXA/Ml;", "Lgi/I28;", "decoder", "deserialize", "(Lgi/I28;)Lcom/vungle/ads/internal/model/DeviceNode;", "Lgi/Wre;", "encoder", "value", "", "serialize", "(Lgi/Wre;Lcom/vungle/ads/internal/model/DeviceNode;)V", "LEJn/Wre;", "getDescriptor", "()LEJn/Wre;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class DeviceNode$$serializer implements vd {
    public static final DeviceNode$$serializer INSTANCE;
    public static final /* synthetic */ Wre descriptor;

    @Override // XA.w6
    public DeviceNode deserialize(I28 decoder) {
        int i2;
        Object objE;
        Object objE2;
        Object objE3;
        Object objE4;
        Object objE5;
        int i3;
        int i5;
        String str;
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Wre descriptor2 = getDescriptor();
        w6 w6VarRl = decoder.rl(descriptor2);
        int i7 = 10;
        int i8 = 9;
        if (w6VarRl.HI()) {
            String strIk = w6VarRl.Ik(descriptor2, 0);
            String strIk2 = w6VarRl.Ik(descriptor2, 1);
            String strIk3 = w6VarRl.Ik(descriptor2, 2);
            Y5 y5 = Y5.f2000n;
            objE5 = w6VarRl.e(descriptor2, 3, y5, null);
            String strIk4 = w6VarRl.Ik(descriptor2, 4);
            int iXQ = w6VarRl.XQ(descriptor2, 5);
            int iXQ2 = w6VarRl.XQ(descriptor2, 6);
            objE4 = w6VarRl.e(descriptor2, 7, y5, null);
            objE3 = w6VarRl.e(descriptor2, 8, y5, null);
            objE = w6VarRl.e(descriptor2, 9, iF.f2020n, null);
            objE2 = w6VarRl.e(descriptor2, 10, DeviceNode$VungleExt$$serializer.INSTANCE, null);
            str = strIk;
            i2 = iXQ2;
            i3 = iXQ;
            str4 = strIk4;
            str3 = strIk3;
            str2 = strIk2;
            i5 = 2047;
        } else {
            boolean z2 = true;
            int iXQ3 = 0;
            int i9 = 0;
            Object objE6 = null;
            Object objE7 = null;
            Object objE8 = null;
            Object objE9 = null;
            String strIk5 = null;
            String strIk6 = null;
            String strIk7 = null;
            String strIk8 = null;
            int iXQ4 = 0;
            Object objE10 = null;
            while (z2) {
                int iNY = w6VarRl.nY(descriptor2);
                switch (iNY) {
                    case -1:
                        z2 = false;
                        i7 = 10;
                        break;
                    case 0:
                        strIk5 = w6VarRl.Ik(descriptor2, 0);
                        i9 |= 1;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 1:
                        strIk6 = w6VarRl.Ik(descriptor2, 1);
                        i9 |= 2;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 2:
                        strIk7 = w6VarRl.Ik(descriptor2, 2);
                        i9 |= 4;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 3:
                        objE10 = w6VarRl.e(descriptor2, 3, Y5.f2000n, objE10);
                        i9 |= 8;
                        i7 = 10;
                        i8 = 9;
                        break;
                    case 4:
                        strIk8 = w6VarRl.Ik(descriptor2, 4);
                        i9 |= 16;
                        i7 = 10;
                        break;
                    case 5:
                        iXQ4 = w6VarRl.XQ(descriptor2, 5);
                        i9 |= 32;
                        break;
                    case 6:
                        iXQ3 = w6VarRl.XQ(descriptor2, 6);
                        i9 |= 64;
                        break;
                    case 7:
                        objE9 = w6VarRl.e(descriptor2, 7, Y5.f2000n, objE9);
                        i9 |= 128;
                        break;
                    case 8:
                        objE8 = w6VarRl.e(descriptor2, 8, Y5.f2000n, objE8);
                        i9 |= 256;
                        break;
                    case 9:
                        objE6 = w6VarRl.e(descriptor2, i8, iF.f2020n, objE6);
                        i9 |= 512;
                        break;
                    case 10:
                        objE7 = w6VarRl.e(descriptor2, i7, DeviceNode$VungleExt$$serializer.INSTANCE, objE7);
                        i9 |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iNY);
                }
            }
            i2 = iXQ3;
            objE = objE6;
            objE2 = objE7;
            objE3 = objE8;
            objE4 = objE9;
            objE5 = objE10;
            i3 = iXQ4;
            i5 = i9;
            str = strIk5;
            str2 = strIk6;
            str3 = strIk7;
            str4 = strIk8;
        }
        w6VarRl.t(descriptor2);
        return new DeviceNode(i5, str, str2, str3, (String) objE5, str4, i3, i2, (String) objE4, (String) objE3, (Integer) objE, (DeviceNode.VungleExt) objE2, (i) null);
    }

    @Override // XA.eO
    public void serialize(gi.Wre encoder, DeviceNode value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, pTYaLzzmJSGAPQ.KpOprA);
        Wre descriptor2 = getDescriptor();
        Ml mlRl = encoder.rl(descriptor2);
        DeviceNode.write$Self(value, mlRl, descriptor2);
        mlRl.t(descriptor2);
    }

    static {
        DeviceNode$$serializer deviceNode$$serializer = new DeviceNode$$serializer();
        INSTANCE = deviceNode$$serializer;
        DC dc = new DC("com.vungle.ads.internal.model.DeviceNode", deviceNode$$serializer, 11);
        dc.HI("make", false);
        dc.HI("model", false);
        dc.HI("osv", false);
        dc.HI("carrier", true);
        dc.HI("os", false);
        dc.HI("w", false);
        dc.HI(CmcdData.STREAMING_FORMAT_HLS, false);
        dc.HI("ua", true);
        dc.HI("ifa", true);
        dc.HI("lmt", true);
        dc.HI("ext", true);
        descriptor = dc;
    }

    @Override // Du.vd
    public XA.Ml[] childSerializers() {
        Y5 y5 = Y5.f2000n;
        XA.Ml mlZ = j.Z(y5);
        iF iFVar = iF.f2020n;
        return new XA.Ml[]{y5, y5, y5, mlZ, y5, iFVar, iFVar, j.Z(y5), j.Z(y5), j.Z(iFVar), j.Z(DeviceNode$VungleExt$$serializer.INSTANCE)};
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public Wre getDescriptor() {
        return descriptor;
    }

    private DeviceNode$$serializer() {
    }

    @Override // Du.vd
    public XA.Ml[] typeParametersSerializers() {
        return vd.j.n(this);
    }
}
