package com.vungle.ads.internal.model;

import Du.DC;
import Du.Dsr;
import Du.Y5;
import Du.fg;
import Du.mz;
import Du.vd;
import EJn.Wre;
import WY.j;
import XA.Ml;
import XA.n;
import com.safedk.android.analytics.brandsafety.l;
import gi.I28;
import gi.w6;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/AdPayload.$serializer", "LDu/vd;", "Lcom/vungle/ads/internal/model/AdPayload;", "<init>", "()V", "", "LXA/Ml;", "childSerializers", "()[LXA/Ml;", "Lgi/I28;", "decoder", "deserialize", "(Lgi/I28;)Lcom/vungle/ads/internal/model/AdPayload;", "Lgi/Wre;", "encoder", "value", "", "serialize", "(Lgi/Wre;Lcom/vungle/ads/internal/model/AdPayload;)V", "LEJn/Wre;", "getDescriptor", "()LEJn/Wre;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class AdPayload$$serializer implements vd {
    public static final AdPayload$$serializer INSTANCE;
    public static final /* synthetic */ Wre descriptor;

    @Override // XA.w6
    public AdPayload deserialize(I28 decoder) {
        Object objE;
        Object objE2;
        boolean z2;
        Object objFD;
        Object objFD2;
        int i2;
        Object objE3;
        Object objE4;
        char c2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Wre descriptor2 = getDescriptor();
        w6 w6VarRl = decoder.rl(descriptor2);
        int i3 = 6;
        int i5 = 5;
        if (w6VarRl.HI()) {
            objE = w6VarRl.e(descriptor2, 0, new Du.Wre(AdPayload$PlacementAdUnit$$serializer.INSTANCE), null);
            objE4 = w6VarRl.e(descriptor2, 1, ConfigPayload$$serializer.INSTANCE, null);
            objE3 = w6VarRl.e(descriptor2, 2, fg.f2014n, null);
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConcurrentHashMap.class);
            Y5 y5 = Y5.f2000n;
            objFD = w6VarRl.fD(descriptor2, 3, new n(orCreateKotlinClass, null, new Ml[]{y5, y5}), null);
            objFD2 = w6VarRl.fD(descriptor2, 4, new mz(y5, y5), null);
            boolean zMUb = w6VarRl.mUb(descriptor2, 5);
            objE2 = w6VarRl.e(descriptor2, 6, y5, null);
            i2 = 127;
            z2 = zMUb;
        } else {
            boolean z3 = true;
            boolean zMUb2 = false;
            int i7 = 0;
            objE = null;
            Object objE5 = null;
            Object objE6 = null;
            Object objE7 = null;
            Object objFD3 = null;
            Object objFD4 = null;
            while (z3) {
                int iNY = w6VarRl.nY(descriptor2);
                switch (iNY) {
                    case -1:
                        z3 = false;
                        i5 = 5;
                        break;
                    case 0:
                        objE = w6VarRl.e(descriptor2, 0, new Du.Wre(AdPayload$PlacementAdUnit$$serializer.INSTANCE), objE);
                        i7 |= 1;
                        i3 = 6;
                        i5 = 5;
                        break;
                    case 1:
                        objE6 = w6VarRl.e(descriptor2, 1, ConfigPayload$$serializer.INSTANCE, objE6);
                        i7 |= 2;
                        i3 = 6;
                        i5 = 5;
                        break;
                    case 2:
                        c2 = 3;
                        objE5 = w6VarRl.e(descriptor2, 2, fg.f2014n, objE5);
                        i7 |= 4;
                        i3 = 6;
                        i5 = 5;
                        break;
                    case 3:
                        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(ConcurrentHashMap.class);
                        Y5 y52 = Y5.f2000n;
                        c2 = 3;
                        objFD3 = w6VarRl.fD(descriptor2, 3, new n(orCreateKotlinClass2, null, new Ml[]{y52, y52}), objFD3);
                        i7 |= 8;
                        i3 = 6;
                        i5 = 5;
                        break;
                    case 4:
                        Y5 y53 = Y5.f2000n;
                        objFD4 = w6VarRl.fD(descriptor2, 4, new mz(y53, y53), objFD4);
                        i7 |= 16;
                        i3 = 6;
                        break;
                    case 5:
                        zMUb2 = w6VarRl.mUb(descriptor2, i5);
                        i7 |= 32;
                        break;
                    case 6:
                        objE7 = w6VarRl.e(descriptor2, i3, Y5.f2000n, objE7);
                        i7 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iNY);
                }
            }
            objE2 = objE7;
            z2 = zMUb2;
            objFD = objFD3;
            objFD2 = objFD4;
            i2 = i7;
            objE3 = objE5;
            objE4 = objE6;
        }
        w6VarRl.t(descriptor2);
        return new AdPayload(i2, (List) objE, (ConfigPayload) objE4, (Long) objE3, (ConcurrentHashMap) objFD, (Map) objFD2, z2, (String) objE2, null);
    }

    @Override // XA.eO
    public void serialize(gi.Wre encoder, AdPayload value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Wre descriptor2 = getDescriptor();
        gi.Ml mlRl = encoder.rl(descriptor2);
        AdPayload.write$Self(value, mlRl, descriptor2);
        mlRl.t(descriptor2);
    }

    static {
        AdPayload$$serializer adPayload$$serializer = new AdPayload$$serializer();
        INSTANCE = adPayload$$serializer;
        DC dc = new DC("com.vungle.ads.internal.model.AdPayload", adPayload$$serializer, 7);
        dc.HI(l.f62638S, true);
        dc.HI("config", true);
        dc.HI("expiryWindowStart", true);
        dc.HI("mraidFiles", true);
        dc.HI("incentivizedTextSettings", true);
        dc.HI("assetsFullyDownloaded", true);
        dc.HI("indexFilePath", true);
        descriptor = dc;
    }

    @Override // Du.vd
    public Ml[] childSerializers() {
        Ml mlZ = j.Z(new Du.Wre(AdPayload$PlacementAdUnit$$serializer.INSTANCE));
        Ml mlZ2 = j.Z(ConfigPayload$$serializer.INSTANCE);
        Ml mlZ3 = j.Z(fg.f2014n);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConcurrentHashMap.class);
        Y5 y5 = Y5.f2000n;
        return new Ml[]{mlZ, mlZ2, mlZ3, new n(orCreateKotlinClass, null, new Ml[]{y5, y5}), new mz(y5, y5), Dsr.f1956n, j.Z(y5)};
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public Wre getDescriptor() {
        return descriptor;
    }

    private AdPayload$$serializer() {
    }

    @Override // Du.vd
    public Ml[] typeParametersSerializers() {
        return vd.j.n(this);
    }
}
