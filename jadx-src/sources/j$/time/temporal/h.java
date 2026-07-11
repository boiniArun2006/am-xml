package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
enum h implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69158a;

    static {
        Duration duration = Duration.f68901c;
    }

    h(String str) {
        this.f69158a = str;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal q(Temporal temporal, long j2) {
        int i2 = b.f69154a[ordinal()];
        if (i2 == 1) {
            return temporal.a(Math.addExact(temporal.j(r0), j2), i.f69161c);
        }
        if (i2 == 2) {
            return temporal.b(j2 / 4, ChronoUnit.YEARS).b((j2 % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.TemporalUnit
    public final long s(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.n(temporal2, this);
        }
        int i2 = b.f69154a[ordinal()];
        if (i2 == 1) {
            p pVar = i.f69161c;
            return Math.subtractExact(temporal2.h(pVar), temporal.h(pVar));
        }
        if (i2 == 2) {
            return temporal.n(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f69158a;
    }
}
