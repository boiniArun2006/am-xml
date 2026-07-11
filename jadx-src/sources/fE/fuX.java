package fE;

import K6D.j;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.bendingspoons.monopoly.Period;
import com.bendingspoons.monopoly.PeriodTimeUnit;
import com.bendingspoons.monopoly.contracts.j;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f66801n = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);

    private static final int mUb(int i2) {
        return MathKt.roundToInt(((double) i2) * 365.25d);
    }

    private static final int nr(int i2) {
        return MathKt.roundToInt(((double) i2) * 4.34d);
    }

    private static final int qie(int i2) {
        return MathKt.roundToInt(((double) i2) * 52.14d);
    }

    private static final int t(int i2) {
        return MathKt.roundToInt(((double) i2) * 30.41d);
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PeriodTimeUnit.values().length];
            try {
                iArr[PeriodTimeUnit.YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PeriodTimeUnit.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PeriodTimeUnit.WEEK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final YV.o J2(PurchaseHistoryRecord purchaseHistoryRecord) {
        Intrinsics.checkNotNullParameter(purchaseHistoryRecord, "<this>");
        String strOptString = new JSONObject(purchaseHistoryRecord.n()).optString("orderId");
        String strOptString2 = new JSONObject(purchaseHistoryRecord.n()).optString("packageName");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
        List listRl = purchaseHistoryRecord.rl();
        Intrinsics.checkNotNullExpressionValue(listRl, "getProducts(...)");
        String str = (String) CollectionsKt.firstOrNull(listRl);
        long jT2 = purchaseHistoryRecord.t();
        String strNr = purchaseHistoryRecord.nr();
        Intrinsics.checkNotNullExpressionValue(strNr, "getPurchaseToken(...)");
        return new YV.o(strOptString, strOptString2, str, jT2, strNr, YV.qz.f12149O, true, false);
    }

    public static final void KN(K6D.j jVar, fE.j error) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(error, "error");
        String strName = error.n().name();
        pq.Ml ml = new pq.Ml();
        ml.O("error_message", error.rl());
        Unit unit = Unit.INSTANCE;
        j.C0175j.rl(jVar, strName, null, ml, 2, null);
    }

    public static final YV.o O(Purchase purchase) {
        Intrinsics.checkNotNullParameter(purchase, "<this>");
        String strN = purchase.n();
        String strT = purchase.t();
        Intrinsics.checkNotNullExpressionValue(strT, "getPackageName(...)");
        String strN2 = n(purchase);
        long jJ2 = purchase.J2();
        String strUo = purchase.Uo();
        Intrinsics.checkNotNullExpressionValue(strUo, "getPurchaseToken(...)");
        return new YV.o(strN, strT, strN2, jJ2, strUo, YV.qz.f12150n.n(purchase.O()), purchase.xMQ(), purchase.mUb());
    }

    public static final void Uo(K6D.j jVar, j.C0725j error) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(error, "error");
        String strN = error.n();
        pq.Ml ml = new pq.Ml();
        ml.O("error_message", error.t());
        Unit unit = Unit.INSTANCE;
        j.C0175j.rl(jVar, strN, null, ml.rl(error.rl()), 2, null);
    }

    private static final int gh(int i2) {
        return i2 * 12;
    }

    public static final String n(Purchase purchase) {
        Intrinsics.checkNotNullParameter(purchase, "<this>");
        List listNr = purchase.nr();
        Intrinsics.checkNotNullExpressionValue(listNr, "getProducts(...)");
        return (String) CollectionsKt.firstOrNull(listNr);
    }

    public static final Period rl(String str) {
        PeriodTimeUnit periodTimeUnit;
        int iNr;
        Integer intOrNull;
        Integer intOrNull2;
        Integer intOrNull3;
        Integer intOrNull4;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Matcher matcher = f66801n.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(2);
            int iMUb = 0;
            if (strGroup == null || (intOrNull4 = StringsKt.toIntOrNull(strGroup)) == null) {
                periodTimeUnit = null;
                iNr = 0;
            } else {
                iNr = intOrNull4.intValue();
                periodTimeUnit = PeriodTimeUnit.YEAR;
            }
            String strGroup2 = matcher.group(3);
            if (strGroup2 != null && (intOrNull3 = StringsKt.toIntOrNull(strGroup2)) != null) {
                int iIntValue = intOrNull3.intValue();
                PeriodTimeUnit periodTimeUnit2 = PeriodTimeUnit.MONTH;
                iNr = gh(iNr) + iIntValue;
                periodTimeUnit = periodTimeUnit2;
            }
            String strGroup3 = matcher.group(4);
            if (strGroup3 != null && (intOrNull2 = StringsKt.toIntOrNull(strGroup3)) != null) {
                int iIntValue2 = intOrNull2.intValue();
                int i2 = periodTimeUnit == null ? -1 : j.$EnumSwitchMapping$0[periodTimeUnit.ordinal()];
                iNr = (i2 != 1 ? i2 != 2 ? 0 : nr(iNr) : qie(iNr)) + iIntValue2;
                periodTimeUnit = PeriodTimeUnit.WEEK;
            }
            String strGroup4 = matcher.group(5);
            if (strGroup4 != null && (intOrNull = StringsKt.toIntOrNull(strGroup4)) != null) {
                int iIntValue3 = intOrNull.intValue();
                int i3 = periodTimeUnit != null ? j.$EnumSwitchMapping$0[periodTimeUnit.ordinal()] : -1;
                if (i3 == 1) {
                    iMUb = mUb(iNr);
                } else if (i3 == 2) {
                    iMUb = t(iNr);
                } else if (i3 == 3) {
                    iMUb = xMQ(iNr);
                }
                iNr = iMUb + iIntValue3;
                periodTimeUnit = PeriodTimeUnit.DAY;
            }
            if (periodTimeUnit != null) {
                return new Period(iNr, periodTimeUnit);
            }
        }
        return null;
    }

    private static final int xMQ(int i2) {
        return i2 * 7;
    }
}
