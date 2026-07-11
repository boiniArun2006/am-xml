package xAo;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import f.AbstractC1974Dsr;
import f.AbstractC1976Ml;
import f.AbstractC1977Pl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Ml implements sqD.Wre {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // sqD.Wre
    public sqD.I28 n(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String strO = bIo.Wre.O(json, "__type");
        if (strO == null) {
            return null;
        }
        switch (strO.hashCode()) {
            case -2128769366:
                if (strO.equals("unlock_pro_features")) {
                    return f.Ew.nr(json);
                }
                return null;
            case -891050150:
                if (strO.equals(CreativeInfo.f62455s)) {
                    return f.afx.nr(json);
                }
                return null;
            case -786387342:
                if (strO.equals("paywall")) {
                    return AbstractC1977Pl.O(json);
                }
                return null;
            case 3107:
                if (strO.equals("ad")) {
                    return AbstractC1976Ml.O(json);
                }
                return null;
            case 106852524:
                if (strO.equals("popup")) {
                    return f.r.t(json);
                }
                return null;
            case 2102494577:
                if (strO.equals("navigate")) {
                    return AbstractC1974Dsr.rl(json);
                }
                return null;
            default:
                return null;
        }
    }
}
