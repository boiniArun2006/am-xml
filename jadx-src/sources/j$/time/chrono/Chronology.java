package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public interface Chronology extends Comparable<Chronology> {
    ChronoLocalDate A(int i2, int i3);

    List D();

    boolean E(long j2);

    ChronoLocalDate H(int i2, int i3, int i5);

    ChronoLocalDate P();

    j S(int i2);

    ChronoLocalDate U(Map map, j$.time.format.D d2);

    String W();

    j$.time.temporal.s Z(j$.time.temporal.a aVar);

    boolean equals(Object obj);

    int hashCode();

    ChronoLocalDate r(long j2);

    /* JADX INFO: renamed from: t */
    int compareTo(Chronology chronology);

    String toString();

    String u();

    ChronoLocalDate v(TemporalAccessor temporalAccessor);

    int x(j jVar, int i2);

    static Chronology G(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        Chronology chronology = (Chronology) temporalAccessor.e(j$.time.temporal.q.a());
        p pVar = p.f68978e;
        if (chronology != null) {
            return chronology;
        }
        Objects.requireNonNull(pVar, "defaultObj");
        return pVar;
    }

    static Chronology ofLocale(Locale locale) {
        return AbstractC2181a.ofLocale(locale);
    }

    default ChronoLocalDateTime c0(Temporal temporal) {
        try {
            return v(temporal).N(LocalTime.s(temporal));
        } catch (DateTimeException e2) {
            throw new DateTimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + temporal.getClass(), e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [j$.time.chrono.ChronoZonedDateTime] */
    default ChronoZonedDateTime O(Temporal temporal) {
        try {
            ZoneId zoneIdQ = ZoneId.q(temporal);
            try {
                temporal = y(Instant.s(temporal), zoneIdQ);
                return temporal;
            } catch (DateTimeException unused) {
                return i.s(zoneIdQ, null, C2185e.q(this, c0(temporal)));
            }
        } catch (DateTimeException e2) {
            throw new DateTimeException("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + temporal.getClass(), e2);
        }
    }

    default ChronoZonedDateTime y(Instant instant, ZoneId zoneId) {
        return i.C(this, instant, zoneId);
    }
}
