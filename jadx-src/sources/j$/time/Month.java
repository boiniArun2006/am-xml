package j$.time;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.vungle.ads.internal.protos.Sdk;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final class Month implements TemporalAccessor, j$.time.temporal.l {
    public static final Month APRIL;
    public static final Month AUGUST;
    public static final Month DECEMBER;
    public static final Month FEBRUARY;
    public static final Month JANUARY;
    public static final Month JULY;
    public static final Month JUNE;
    public static final Month MARCH;
    public static final Month MAY;
    public static final Month NOVEMBER;
    public static final Month OCTOBER;
    public static final Month SEPTEMBER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Month[] f68919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ Month[] f68920b;

    public static Month valueOf(String str) {
        return (Month) Enum.valueOf(Month.class, str);
    }

    public static Month[] values() {
        return (Month[]) f68920b.clone();
    }

    static {
        Month month = new Month("JANUARY", 0);
        JANUARY = month;
        Month month2 = new Month("FEBRUARY", 1);
        FEBRUARY = month2;
        Month month3 = new Month("MARCH", 2);
        MARCH = month3;
        Month month4 = new Month("APRIL", 3);
        APRIL = month4;
        Month month5 = new Month("MAY", 4);
        MAY = month5;
        Month month6 = new Month("JUNE", 5);
        JUNE = month6;
        Month month7 = new Month("JULY", 6);
        JULY = month7;
        Month month8 = new Month("AUGUST", 7);
        AUGUST = month8;
        Month month9 = new Month("SEPTEMBER", 8);
        SEPTEMBER = month9;
        Month month10 = new Month("OCTOBER", 9);
        OCTOBER = month10;
        Month month11 = new Month("NOVEMBER", 10);
        NOVEMBER = month11;
        Month month12 = new Month("DECEMBER", 11);
        DECEMBER = month12;
        f68920b = new Month[]{month, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12};
        f68919a = values();
    }

    public static Month L(int i2) {
        if (i2 < 1 || i2 > 12) {
            throw new DateTimeException("Invalid value for MonthOfYear: " + i2);
        }
        return f68919a[i2 - 1];
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.MONTH_OF_YEAR : pVar != null && pVar.a0(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return pVar.C();
        }
        return super.l(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        return super.j(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(b.a("Unsupported field: ", pVar));
        }
        return pVar.s(this);
    }

    public final Month X() {
        return f68919a[((((int) 1) + 12) + ordinal()) % 12];
    }

    public final int s(boolean z2) {
        int i2 = i.f69118a[ordinal()];
        return i2 != 1 ? (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 30 : 31 : z2 ? 29 : 28;
    }

    public final int C() {
        int i2 = i.f69118a[ordinal()];
        if (i2 != 1) {
            return (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int q(boolean z2) {
        switch (i.f69118a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z2 ? 1 : 0) + 91;
            case 3:
                return (z2 ? 1 : 0) + ModuleDescriptor.MODULE_VERSION;
            case 4:
                return (z2 ? 1 : 0) + 244;
            case 5:
                return (z2 ? 1 : 0) + Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE;
            case 6:
                return 1;
            case 7:
                return (z2 ? 1 : 0) + 60;
            case 8:
                return (z2 ? 1 : 0) + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            case 9:
                return (z2 ? 1 : 0) + 182;
            case 10:
                return (z2 ? 1 : 0) + Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE;
            case 11:
                return (z2 ? 1 : 0) + 274;
            default:
                return (z2 ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object e(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.a()) {
            return j$.time.chrono.p.f68978e;
        }
        if (temporalQuery == j$.time.temporal.q.e()) {
            return ChronoUnit.MONTHS;
        }
        return super.e(temporalQuery);
    }

    @Override // j$.time.temporal.l
    public final Temporal f(Temporal temporal) {
        if (!Chronology.G(temporal).equals(j$.time.chrono.p.f68978e)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return temporal.a(getValue(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
