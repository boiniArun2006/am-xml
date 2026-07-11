package com.vungle.ads.internal.model;

import Du.DC;
import Du.i;
import Du.vd;
import EJn.Wre;
import WY.j;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.ui.AdActivity;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.$serializer", "LDu/vd;", "Lcom/vungle/ads/internal/model/CommonRequestBody;", "<init>", "()V", "", "LXA/Ml;", "childSerializers", "()[LXA/Ml;", "Lgi/I28;", "decoder", "deserialize", "(Lgi/I28;)Lcom/vungle/ads/internal/model/CommonRequestBody;", "Lgi/Wre;", "encoder", "value", "", "serialize", "(Lgi/Wre;Lcom/vungle/ads/internal/model/CommonRequestBody;)V", "LEJn/Wre;", "getDescriptor", "()LEJn/Wre;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
public final class CommonRequestBody$$serializer implements vd {
    public static final CommonRequestBody$$serializer INSTANCE;
    public static final /* synthetic */ Wre descriptor;

    @Override // XA.w6
    public CommonRequestBody deserialize(I28 decoder) {
        int i2;
        Object objFD;
        Object objE;
        Object objE2;
        Object objE3;
        Object objE4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Wre descriptor2 = getDescriptor();
        w6 w6VarRl = decoder.rl(descriptor2);
        Object objFD2 = null;
        if (w6VarRl.HI()) {
            objFD = w6VarRl.fD(descriptor2, 0, DeviceNode$$serializer.INSTANCE, null);
            objE = w6VarRl.e(descriptor2, 1, AppNode$$serializer.INSTANCE, null);
            objE2 = w6VarRl.e(descriptor2, 2, CommonRequestBody$User$$serializer.INSTANCE, null);
            objE3 = w6VarRl.e(descriptor2, 3, CommonRequestBody$RequestExt$$serializer.INSTANCE, null);
            objE4 = w6VarRl.e(descriptor2, 4, CommonRequestBody$RequestParam$$serializer.INSTANCE, null);
            i2 = 31;
        } else {
            boolean z2 = true;
            int i3 = 0;
            Object objE5 = null;
            Object objE6 = null;
            Object objE7 = null;
            Object objE8 = null;
            while (z2) {
                int iNY = w6VarRl.nY(descriptor2);
                if (iNY == -1) {
                    z2 = false;
                } else if (iNY == 0) {
                    objFD2 = w6VarRl.fD(descriptor2, 0, DeviceNode$$serializer.INSTANCE, objFD2);
                    i3 |= 1;
                } else if (iNY == 1) {
                    objE5 = w6VarRl.e(descriptor2, 1, AppNode$$serializer.INSTANCE, objE5);
                    i3 |= 2;
                } else if (iNY == 2) {
                    objE6 = w6VarRl.e(descriptor2, 2, CommonRequestBody$User$$serializer.INSTANCE, objE6);
                    i3 |= 4;
                } else if (iNY == 3) {
                    objE7 = w6VarRl.e(descriptor2, 3, CommonRequestBody$RequestExt$$serializer.INSTANCE, objE7);
                    i3 |= 8;
                } else {
                    if (iNY != 4) {
                        throw new UnknownFieldException(iNY);
                    }
                    objE8 = w6VarRl.e(descriptor2, 4, CommonRequestBody$RequestParam$$serializer.INSTANCE, objE8);
                    i3 |= 16;
                }
            }
            Object obj = objFD2;
            i2 = i3;
            objFD = obj;
            objE = objE5;
            objE2 = objE6;
            objE3 = objE7;
            objE4 = objE8;
        }
        w6VarRl.t(descriptor2);
        return new CommonRequestBody(i2, (DeviceNode) objFD, (AppNode) objE, (CommonRequestBody.User) objE2, (CommonRequestBody.RequestExt) objE3, (CommonRequestBody.RequestParam) objE4, (i) null);
    }

    @Override // XA.eO
    public void serialize(gi.Wre encoder, CommonRequestBody value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Wre descriptor2 = getDescriptor();
        Ml mlRl = encoder.rl(descriptor2);
        CommonRequestBody.write$Self(value, mlRl, descriptor2);
        mlRl.t(descriptor2);
    }

    static {
        CommonRequestBody$$serializer commonRequestBody$$serializer = new CommonRequestBody$$serializer();
        INSTANCE = commonRequestBody$$serializer;
        DC dc = new DC("com.vungle.ads.internal.model.CommonRequestBody", commonRequestBody$$serializer, 5);
        dc.HI("device", false);
        dc.HI(PangleCreativeInfo.f62498a, true);
        dc.HI("user", true);
        dc.HI("ext", true);
        dc.HI(AdActivity.REQUEST_KEY_EXTRA, true);
        descriptor = dc;
    }

    @Override // Du.vd
    public XA.Ml[] childSerializers() {
        return new XA.Ml[]{DeviceNode$$serializer.INSTANCE, j.Z(AppNode$$serializer.INSTANCE), j.Z(CommonRequestBody$User$$serializer.INSTANCE), j.Z(CommonRequestBody$RequestExt$$serializer.INSTANCE), j.Z(CommonRequestBody$RequestParam$$serializer.INSTANCE)};
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public Wre getDescriptor() {
        return descriptor;
    }

    private CommonRequestBody$$serializer() {
    }

    @Override // Du.vd
    public XA.Ml[] typeParametersSerializers() {
        return vd.j.n(this);
    }
}
