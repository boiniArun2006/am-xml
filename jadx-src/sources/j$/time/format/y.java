package j$.time.format;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TemporalAccessor f69112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DateTimeFormatter f69113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f69114c;

    y(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        Chronology chronologyB = dateTimeFormatter.b();
        if (chronologyB != null) {
            Chronology chronology = (Chronology) temporalAccessor.e(j$.time.temporal.q.a());
            ZoneId zoneId = (ZoneId) temporalAccessor.e(j$.time.temporal.q.g());
            ChronoLocalDate chronoLocalDateV = null;
            chronologyB = Objects.equals(chronologyB, chronology) ? null : chronologyB;
            if (chronologyB != null) {
                Chronology chronology2 = chronologyB != null ? chronologyB : chronology;
                if (chronologyB != null) {
                    if (temporalAccessor.g(j$.time.temporal.a.EPOCH_DAY)) {
                        chronoLocalDateV = chronology2.v(temporalAccessor);
                    } else if (chronologyB != j$.time.chrono.p.f68978e || chronology != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.Y() && temporalAccessor.g(aVar)) {
                                throw new DateTimeException("Unable to apply override chronology '" + chronologyB + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new x(chronoLocalDateV, temporalAccessor, chronology2, zoneId);
            }
        }
        this.f69112a = temporalAccessor;
        this.f69113b = dateTimeFormatter;
    }

    final TemporalAccessor d() {
        return this.f69112a;
    }

    final Locale c() {
        return this.f69113b.d();
    }

    final DecimalStyle b() {
        return this.f69113b.c();
    }

    final void g() {
        this.f69114c++;
    }

    final void a() {
        this.f69114c--;
    }

    final Object f(TemporalQuery temporalQuery) {
        TemporalAccessor temporalAccessor = this.f69112a;
        Object objE = temporalAccessor.e(temporalQuery);
        if (objE != null || this.f69114c != 0) {
            return objE;
        }
        throw new DateTimeException("Unable to extract " + temporalQuery + " from temporal " + temporalAccessor);
    }

    final Long e(j$.time.temporal.p pVar) {
        int i2 = this.f69114c;
        TemporalAccessor temporalAccessor = this.f69112a;
        if (i2 <= 0 || temporalAccessor.g(pVar)) {
            return Long.valueOf(temporalAccessor.h(pVar));
        }
        return null;
    }

    public final String toString() {
        return this.f69112a.toString();
    }
}
