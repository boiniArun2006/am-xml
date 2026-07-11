package j$.time.chrono;

import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.signals.SignalManager;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: renamed from: j$.time.chrono.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class C2185e implements ChronoLocalDateTime, Temporal, j$.time.temporal.l, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient ChronoLocalDate f68949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient LocalTime f68950b;

    static C2185e s(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        return new C2185e(chronoLocalDate, localTime);
    }

    static C2185e q(Chronology chronology, Temporal temporal) {
        C2185e c2185e = (C2185e) temporal;
        if (chronology.equals(c2185e.i())) {
            return c2185e;
        }
        throw new ClassCastException("Chronology mismatch, required: " + chronology.u() + ", actual: " + c2185e.i().u());
    }

    private C2185e(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(localTime, "time");
        this.f68949a = chronoLocalDate;
        this.f68950b = localTime;
    }

    private C2185e d0(Temporal temporal, LocalTime localTime) {
        ChronoLocalDate chronoLocalDate = this.f68949a;
        return (chronoLocalDate == temporal && this.f68950b == localTime) ? this : new C2185e(AbstractC2183c.q(chronoLocalDate.i(), temporal), localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoLocalDate p() {
        return this.f68949a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime o() {
        return this.f68950b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar != null && pVar.a0(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        return aVar.Y() || aVar.f0();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return (((j$.time.temporal.a) pVar).f0() ? this.f68950b : this.f68949a).l(pVar);
        }
        return pVar.L(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).f0() ? this.f68950b.j(pVar) : this.f68949a.j(pVar);
        }
        return l(pVar).a(h(pVar), pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).f0() ? this.f68950b.h(pVar) : this.f68949a.h(pVar);
        }
        return pVar.s(this);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final C2185e m(LocalDate localDate) {
        if (localDate != null) {
            return d0(localDate, this.f68950b);
        }
        return q(this.f68949a.i(), (C2185e) localDate.f(this));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final C2185e a(long j2, j$.time.temporal.p pVar) {
        boolean z2 = pVar instanceof j$.time.temporal.a;
        ChronoLocalDate chronoLocalDate = this.f68949a;
        if (z2) {
            boolean zF0 = ((j$.time.temporal.a) pVar).f0();
            LocalTime localTime = this.f68950b;
            if (zF0) {
                return d0(chronoLocalDate, localTime.a(j2, pVar));
            }
            return d0(chronoLocalDate.a(j2, pVar), localTime);
        }
        return q(chronoLocalDate.i(), pVar.q(this, j2));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime, j$.time.temporal.Temporal
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final C2185e b(long j2, TemporalUnit temporalUnit) {
        boolean z2 = temporalUnit instanceof ChronoUnit;
        ChronoLocalDate chronoLocalDate = this.f68949a;
        if (z2) {
            int i2 = AbstractC2184d.f68948a[((ChronoUnit) temporalUnit).ordinal()];
            LocalTime localTime = this.f68950b;
            switch (i2) {
                case 1:
                    return X(this.f68949a, 0L, 0L, 0L, j2);
                case 2:
                    C2185e c2185eD0 = d0(chronoLocalDate.b(j2 / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), localTime);
                    return c2185eD0.X(c2185eD0.f68949a, 0L, 0L, 0L, (j2 % 86400000000L) * 1000);
                case 3:
                    C2185e c2185eD02 = d0(chronoLocalDate.b(j2 / SignalManager.TWENTY_FOUR_HOURS_MILLIS, (TemporalUnit) ChronoUnit.DAYS), localTime);
                    return c2185eD02.X(c2185eD02.f68949a, 0L, 0L, 0L, (j2 % SignalManager.TWENTY_FOUR_HOURS_MILLIS) * 1000000);
                case 4:
                    return L(j2);
                case 5:
                    return X(this.f68949a, 0L, j2, 0L, 0L);
                case 6:
                    return X(this.f68949a, j2, 0L, 0L, 0L);
                case 7:
                    C2185e c2185eD03 = d0(chronoLocalDate.b(j2 / 256, (TemporalUnit) ChronoUnit.DAYS), localTime);
                    return c2185eD03.X(c2185eD03.f68949a, (j2 % 256) * 12, 0L, 0L, 0L);
                default:
                    return d0(chronoLocalDate.b(j2, temporalUnit), localTime);
            }
        }
        return q(chronoLocalDate.i(), temporalUnit.q(this, j2));
    }

    final C2185e L(long j2) {
        return X(this.f68949a, 0L, 0L, j2, 0L);
    }

    private C2185e X(ChronoLocalDate chronoLocalDate, long j2, long j3, long j4, long j5) {
        long j6 = j2 | j3 | j4 | j5;
        LocalTime localTimeX = this.f68950b;
        if (j6 == 0) {
            return d0(chronoLocalDate, localTimeX);
        }
        long j7 = j3 / 1440;
        long j9 = j2 / 24;
        long j10 = (j3 % 1440) * 60000000000L;
        long j11 = ((j2 % 24) * 3600000000000L) + j10 + ((j4 % 86400) * 1000000000) + (j5 % 86400000000000L);
        long jI0 = localTimeX.i0();
        long j12 = j11 + jI0;
        long jFloorDiv = Math.floorDiv(j12, 86400000000000L) + j9 + j7 + (j4 / 86400) + (j5 / 86400000000000L);
        long jFloorMod = Math.floorMod(j12, 86400000000000L);
        if (jFloorMod != jI0) {
            localTimeX = LocalTime.X(jFloorMod);
        }
        return d0(chronoLocalDate.b(jFloorDiv, (TemporalUnit) ChronoUnit.DAYS), localTimeX);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime J(ZoneId zoneId) {
        return i.s(zoneId, null, this);
    }

    @Override // j$.time.temporal.Temporal
    public final long n(Temporal temporal, TemporalUnit temporalUnit) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDateTime chronoLocalDateTimeC0 = i().c0(temporal);
        if (!(temporalUnit instanceof ChronoUnit)) {
            Objects.requireNonNull(temporalUnit, "unit");
            return temporalUnit.s(this, chronoLocalDateTimeC0);
        }
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        boolean z2 = ((ChronoUnit) temporalUnit).compareTo(chronoUnit) < 0;
        LocalTime localTime = this.f68950b;
        ChronoLocalDate chronoLocalDate = this.f68949a;
        if (!z2) {
            ChronoLocalDate chronoLocalDateP = chronoLocalDateTimeC0.p();
            if (chronoLocalDateTimeC0.o().compareTo(localTime) < 0) {
                chronoLocalDateP = chronoLocalDateP.d(1L, (TemporalUnit) chronoUnit);
            }
            return chronoLocalDate.n(chronoLocalDateP, temporalUnit);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        long jH = chronoLocalDateTimeC0.h(aVar) - chronoLocalDate.h(aVar);
        switch (AbstractC2184d.f68948a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                jH = Math.multiplyExact(jH, 86400000000000L);
                break;
            case 2:
                jH = Math.multiplyExact(jH, 86400000000L);
                break;
            case 3:
                jH = Math.multiplyExact(jH, SignalManager.TWENTY_FOUR_HOURS_MILLIS);
                break;
            case 4:
                jH = Math.multiplyExact(jH, 86400);
                break;
            case 5:
                jH = Math.multiplyExact(jH, 1440);
                break;
            case 6:
                jH = Math.multiplyExact(jH, 24);
                break;
            case 7:
                jH = Math.multiplyExact(jH, 2);
                break;
        }
        return Math.addExact(jH, localTime.n(chronoLocalDateTimeC0.o(), temporalUnit));
    }

    private Object writeReplace() {
        return new B((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f68949a);
        objectOutput.writeObject(this.f68950b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && compareTo((ChronoLocalDateTime) obj) == 0;
    }

    public final int hashCode() {
        return this.f68949a.hashCode() ^ this.f68950b.hashCode();
    }

    public final String toString() {
        return this.f68949a.toString() + RequestConfiguration.MAX_AD_CONTENT_RATING_T + this.f68950b.toString();
    }
}
