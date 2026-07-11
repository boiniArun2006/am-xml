package k;

import android.util.Log;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinEventParameters;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Wre f69648n = new Wre();

    public final Ml J2(I28 type, String str, String str2, String unitId, String mediator, String network, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(mediator, "mediator");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        pq.Ml ml = new pq.Ml();
        ml.O("ad_type", type.rl());
        if (str != null) {
            ml.O("ad_location", str);
        }
        if (str2 != null) {
            ml.O("ad_response_id", str2);
        }
        ml.O(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, unitId);
        ml.O("ad_mediator", mediator);
        ml.O("ad_network", network);
        return new Ml("ad_load_completed", ml.rl(additionalInfo));
    }

    public final Ml KN(I28 type, String str, String unitId, String mediator, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(mediator, "mediator");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        pq.Ml ml = new pq.Ml();
        ml.O("ad_type", type.rl());
        if (str != null) {
            ml.O("ad_location", str);
        }
        ml.O("ad_mediator", mediator);
        ml.O(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, unitId);
        return new Ml("ad_load_requested", ml.rl(additionalInfo));
    }

    public final Ml O(I28 type, String location, String str, String unitId, String mediator, String network, String str2, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(mediator, "mediator");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        pq.Ml ml = new pq.Ml();
        ml.O("ad_type", type.rl());
        ml.O("ad_location", location);
        if (str != null) {
            ml.O("ad_response_id", str);
        }
        ml.O(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, unitId);
        ml.O("ad_mediator", mediator);
        ml.O("ad_network", network);
        if (str2 != null) {
            ml.O("ad_reward_content", str2);
            if (type != I28.f69641Z) {
                Log.w("AdOrable Events", "Logging reward content for ad type " + type + ".");
            }
        }
        return new Ml(Apsps.yxRTpemSbl, ml.rl(additionalInfo));
    }

    public final Ml Uo(I28 type, String str, String mediator, String unitId, String error, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(mediator, "mediator");
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        pq.Ml ml = new pq.Ml();
        ml.O("ad_type", type.rl());
        if (str != null) {
            ml.O("ad_location", str);
        }
        ml.O("ad_mediator", mediator);
        ml.O(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, unitId);
        ml.O("ad_error", error);
        return new Ml("ad_load_failed", ml.rl(additionalInfo));
    }

    public final C2203w6 mUb(String type, String location, String str, String unitId, String mediator, String str2, String currencyCode, float f3, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(mediator, "mediator");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        pq.Ml ml = new pq.Ml();
        ml.O("ad_type", type);
        ml.O("ad_location", location);
        if (str != null) {
            ml.O("ad_response_id", str);
        }
        ml.O(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, unitId);
        ml.O("ad_mediator", mediator);
        if (str2 != null) {
            ml.O("ad_network", str2);
        }
        pq.Ml ml2 = new pq.Ml();
        ml2.O(AppLovinEventParameters.REVENUE_CURRENCY, currencyCode);
        ml2.nr("value", Float.valueOf(f3));
        Unit unit = Unit.INSTANCE;
        ml.Uo("ad_revenue", ml2);
        return new C2203w6("ad_revenue", ml.rl(additionalInfo));
    }

    public final Ml n(I28 type, String location, String str, String unitId, String mediator, String network, String str2, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(mediator, "mediator");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        pq.Ml ml = new pq.Ml();
        ml.O("ad_type", type.rl());
        ml.O("ad_location", location);
        if (str != null) {
            ml.O("ad_response_id", str);
        }
        ml.O(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, unitId);
        ml.O("ad_mediator", mediator);
        ml.O("ad_network", network);
        if (str2 != null) {
            ml.O("ad_reward_content", str2);
            if (type != I28.f69641Z) {
                Log.w("AdOrable Events", "Logging reward content for ad type " + type + ".");
            }
        }
        return new Ml("ad_dismissed", ml.rl(additionalInfo));
    }

    public final Ml nr(I28 type, String location, String str, String unitId, String mediator, String str2, String str3, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(mediator, "mediator");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        pq.Ml ml = new pq.Ml();
        ml.O("ad_type", type.rl());
        ml.O("ad_location", location);
        if (str != null) {
            ml.O("ad_response_id", str);
        }
        ml.O(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, unitId);
        ml.O("ad_mediator", mediator);
        if (str2 != null) {
            ml.O("ad_network", str2);
        }
        if (str3 != null) {
            ml.O("ad_reward_content", str3);
            if (type != I28.f69641Z) {
                Log.w("AdOrable Events", "Logging reward content for ad type " + type + ".");
            }
        }
        return new Ml("ad_display_requested", ml.rl(additionalInfo));
    }

    public final Ml rl(I28 type, String location, String str, String unitId, String mediator, String network, String str2, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(mediator, "mediator");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        pq.Ml ml = new pq.Ml();
        ml.O("ad_type", type.rl());
        ml.O("ad_location", location);
        if (str != null) {
            ml.O("ad_response_id", str);
        }
        ml.O(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, unitId);
        ml.O("ad_mediator", mediator);
        ml.O("ad_network", network);
        if (str2 != null) {
            ml.O("ad_reward_content", str2);
            if (type != I28.f69641Z) {
                Log.w("AdOrable Events", "Logging reward content for ad type " + type + ".");
            }
        }
        return new Ml("ad_dismissed", ml.rl(additionalInfo));
    }

    public final Ml t(I28 type, String location, String str, String unitId, String mediator, String network, String str2, String error, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(mediator, "mediator");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        pq.Ml ml = new pq.Ml();
        ml.O("ad_type", type.rl());
        ml.O("ad_location", location);
        if (str != null) {
            ml.O("ad_response_id", str);
        }
        ml.O(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, unitId);
        ml.O("ad_mediator", mediator);
        ml.O("ad_network", network);
        if (str2 != null) {
            ml.O("ad_reward_content", str2);
            if (type != I28.f69641Z) {
                Log.w("AdOrable Events", "Logging reward content for ad type " + type + ".");
            }
        }
        ml.O("ad_error", error);
        return new Ml("ad_display_failed", ml.rl(additionalInfo));
    }

    public final Ml xMQ(I28 type, String location, String mediator, String unitId, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(mediator, "mediator");
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        pq.Ml ml = new pq.Ml();
        ml.O("ad_type", type.rl());
        ml.O("ad_location", location);
        ml.O("ad_mediator", mediator);
        ml.O(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, unitId);
        return new Ml("ad_requested", ml.rl(additionalInfo));
    }

    private Wre() {
    }
}
