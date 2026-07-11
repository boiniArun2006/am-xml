package Ak;

import k.C2203w6;
import k.I28;
import k.Wre;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ml {
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final I28 f94n;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public Ml(I28 adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f94n = adType;
    }

    public static /* synthetic */ k.Ml J2(Ml ml, String str, String str2, String str3, dI8.j jVar, String str4, pq.Ml ml2, String str5, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            ml2 = new pq.Ml();
        }
        return ml.O(str, str2, str3, jVar, str4, ml2, (i2 & 64) != 0 ? null : str5);
    }

    public static /* synthetic */ k.Ml KN(Ml ml, String str, String str2, String str3, String str4, pq.Ml ml2, String str5, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            ml2 = new pq.Ml();
        }
        pq.Ml ml3 = ml2;
        if ((i2 & 32) != 0) {
            str5 = null;
        }
        return ml.Uo(str, str2, str3, str4, ml3, str5);
    }

    public static /* synthetic */ k.Ml mUb(Ml ml, String str, String str2, String str3, String str4, pq.Ml ml2, String str5, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            ml2 = new pq.Ml();
        }
        pq.Ml ml3 = ml2;
        if ((i2 & 32) != 0) {
            str5 = null;
        }
        return ml.xMQ(str, str2, str3, str4, ml3, str5);
    }

    public static /* synthetic */ k.Ml nr(Ml ml, String str, String str2, String str3, String str4, pq.Ml ml2, String str5, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            ml2 = new pq.Ml();
        }
        pq.Ml ml3 = ml2;
        if ((i2 & 32) != 0) {
            str5 = null;
        }
        return ml.t(str, str2, str3, str4, ml3, str5);
    }

    public static /* synthetic */ k.Ml rl(Ml ml, String str, String str2, String str3, String str4, pq.Ml ml2, String str5, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            ml2 = new pq.Ml();
        }
        pq.Ml ml3 = ml2;
        if ((i2 & 32) != 0) {
            str5 = null;
        }
        return ml.n(str, str2, str3, str4, ml3, str5);
    }

    public final C2203w6 HI(String unitId, String str, String str2, Long l2, String currencyCode, String location, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        return Wre.f69648n.mUb(this.f94n.rl(), location, str, unitId, "admob", str2, currencyCode, l2 != null ? l2.longValue() / 1000000.0f : 0.0f, additionalInfo);
    }

    public final k.Ml O(String unitId, String str, String str2, dI8.j error, String location, pq.Ml additionalInfo, String str3) {
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        Wre wre = Wre.f69648n;
        I28 i28 = this.f94n;
        if (str2 == null) {
            str2 = "unknown";
        }
        return wre.t(i28, location, str, unitId, "admob", str2, str3, error.getTitle(), pq.I28.n(pq.n.O("error_message", error.getMessage())).rl(additionalInfo));
    }

    public final k.Ml Uo(String unitId, String str, String str2, String location, pq.Ml additionalInfo, String str3) {
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        return Wre.f69648n.nr(this.f94n, location, str, unitId, "admob", str2, str3, additionalInfo);
    }

    public final k.Ml az(String unitId, String location, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        return Wre.f69648n.KN(this.f94n, location, unitId, "admob", additionalInfo);
    }

    public final k.Ml gh(String unitId, String str, String str2, String location, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        Wre wre = Wre.f69648n;
        I28 i28 = this.f94n;
        if (str2 == null) {
            str2 = "unknown";
        }
        return wre.J2(i28, location, str, unitId, "admob", str2, additionalInfo);
    }

    public final k.Ml n(String unitId, String str, String str2, String location, pq.Ml additionalInfo, String str3) {
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        Wre wre = Wre.f69648n;
        I28 i28 = this.f94n;
        if (str2 == null) {
            str2 = "unknown";
        }
        return wre.n(i28, location, str, unitId, "admob", str2, str3, additionalInfo);
    }

    public final k.Ml qie(String unitId, String location, dI8.n error, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        return Wre.f69648n.Uo(this.f94n, location, "admob", unitId, error.getTitle(), pq.I28.n(pq.n.O("error_message", error.getMessage())).rl(additionalInfo));
    }

    public final k.Ml t(String unitId, String str, String str2, String location, pq.Ml additionalInfo, String str3) {
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        Wre wre = Wre.f69648n;
        I28 i28 = this.f94n;
        if (str2 == null) {
            str2 = "unknown";
        }
        return wre.rl(i28, location, str, unitId, "admob", str2, str3, additionalInfo);
    }

    public final k.Ml ty(String unitId, String location, pq.Ml additionalInfo) {
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        return Wre.f69648n.xMQ(this.f94n, location, "admob", unitId, additionalInfo);
    }

    public final k.Ml xMQ(String unitId, String str, String str2, String location, pq.Ml additionalInfo, String str3) {
        Intrinsics.checkNotNullParameter(unitId, "unitId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        Wre wre = Wre.f69648n;
        I28 i28 = this.f94n;
        if (str2 == null) {
            str2 = "unknown";
        }
        return wre.O(i28, location, str, unitId, "admob", str2, str3, additionalInfo);
    }
}
