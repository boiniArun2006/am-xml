package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: renamed from: j$.time.chrono.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
abstract class AbstractC2183c implements ChronoLocalDate, Temporal, j$.time.temporal.l, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    abstract ChronoLocalDate C(long j2);

    abstract ChronoLocalDate L(long j2);

    abstract ChronoLocalDate X(long j2);

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public /* bridge */ /* synthetic */ Temporal a(long j2, j$.time.temporal.p pVar) {
        return a(j2, pVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ Temporal m(LocalDate localDate) {
        return m(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public /* bridge */ /* synthetic */ Temporal d(long j2, TemporalUnit temporalUnit) {
        return d(j2, temporalUnit);
    }

    static ChronoLocalDate q(Chronology chronology, Temporal temporal) {
        ChronoLocalDate chronoLocalDate = (ChronoLocalDate) temporal;
        if (chronology.equals(chronoLocalDate.i())) {
            return chronoLocalDate;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + chronology.u() + ", actual: " + chronoLocalDate.i().u());
    }

    AbstractC2183c() {
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public ChronoLocalDate b(long j2, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return super.b(j2, temporalUnit);
        }
        switch (AbstractC2182b.f68947a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return C(j2);
            case 2:
                return C(Math.multiplyExact(j2, 7));
            case 3:
                return L(j2);
            case 4:
                return X(j2);
            case 5:
                return X(Math.multiplyExact(j2, 10));
            case 6:
                return X(Math.multiplyExact(j2, 100));
            case 7:
                return X(Math.multiplyExact(j2, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a(Math.addExact(h(aVar), j2), (j$.time.temporal.p) aVar);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.Temporal
    public long n(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDate chronoLocalDateV = i().v(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.s(this, chronoLocalDateV);
        }
        switch (AbstractC2182b.f68947a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return chronoLocalDateV.toEpochDay() - toEpochDay();
            case 2:
                return (chronoLocalDateV.toEpochDay() - toEpochDay()) / 7;
            case 3:
                return s(chronoLocalDateV);
            case 4:
                return s(chronoLocalDateV) / 12;
            case 5:
                return s(chronoLocalDateV) / 120;
            case 6:
                return s(chronoLocalDateV) / 1200;
            case 7:
                return s(chronoLocalDateV) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return chronoLocalDateV.h(aVar) - h(aVar);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + temporalUnit);
        }
    }

    private long s(ChronoLocalDate chronoLocalDate) {
        if (i().Z(j$.time.temporal.a.MONTH_OF_YEAR).d() != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        long jH = h(aVar) * 32;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_MONTH;
        return (((chronoLocalDate.h(aVar) * 32) + ((long) chronoLocalDate.j(aVar2))) - (jH + ((long) j(aVar2)))) / 32;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDate) && compareTo((ChronoLocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        long epochDay = toEpochDay();
        return ((int) (epochDay ^ (epochDay >>> 32))) ^ i().hashCode();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        long jH = h(j$.time.temporal.a.YEAR_OF_ERA);
        long jH2 = h(j$.time.temporal.a.MONTH_OF_YEAR);
        long jH3 = h(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(i().toString());
        sb.append(" ");
        sb.append(w());
        sb.append(" ");
        sb.append(jH);
        sb.append(jH2 < 10 ? "-0" : "-");
        sb.append(jH2);
        sb.append(jH3 < 10 ? "-0" : "-");
        sb.append(jH3);
        return sb.toString();
    }
}
