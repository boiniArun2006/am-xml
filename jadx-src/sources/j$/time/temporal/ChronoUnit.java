package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public enum ChronoUnit implements TemporalUnit {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69142a;

    static {
        Duration duration = Duration.f68901c;
        Duration.ofSeconds(Long.MAX_VALUE, 999999999L);
    }

    ChronoUnit(String str) {
        this.f69142a = str;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal q(Temporal temporal, long j2) {
        return temporal.b(j2, this);
    }

    @Override // j$.time.temporal.TemporalUnit
    public final long s(Temporal temporal, Temporal temporal2) {
        return temporal.n(temporal2, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f69142a;
    }
}
