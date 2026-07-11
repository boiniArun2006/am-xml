package androidx.room;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/room/FtsOptions;", "", "<init>", "()V", "MatchInfo", "Order", "room-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FtsOptions {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final FtsOptions f41296n = new FtsOptions();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/room/FtsOptions$MatchInfo;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "room-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MatchInfo {
        private static final /* synthetic */ EnumEntries J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ MatchInfo[] f41297O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final MatchInfo f41298n = new MatchInfo("FTS3", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final MatchInfo f41299t = new MatchInfo("FTS4", 1);

        private static final /* synthetic */ MatchInfo[] n() {
            return new MatchInfo[]{f41298n, f41299t};
        }

        static {
            MatchInfo[] matchInfoArrN = n();
            f41297O = matchInfoArrN;
            J2 = EnumEntriesKt.enumEntries(matchInfoArrN);
        }

        public static MatchInfo valueOf(String str) {
            return (MatchInfo) Enum.valueOf(MatchInfo.class, str);
        }

        public static MatchInfo[] values() {
            return (MatchInfo[]) f41297O.clone();
        }

        private MatchInfo(String str, int i2) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/room/FtsOptions$Order;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "room-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Order {
        private static final /* synthetic */ EnumEntries J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ Order[] f41300O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Order f41301n = new Order("ASC", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final Order f41302t = new Order("DESC", 1);

        private static final /* synthetic */ Order[] n() {
            return new Order[]{f41301n, f41302t};
        }

        static {
            Order[] orderArrN = n();
            f41300O = orderArrN;
            J2 = EnumEntriesKt.enumEntries(orderArrN);
        }

        public static Order valueOf(String str) {
            return (Order) Enum.valueOf(Order.class, str);
        }

        public static Order[] values() {
            return (Order[]) f41300O.clone();
        }

        private Order(String str, int i2) {
        }
    }

    private FtsOptions() {
    }
}
