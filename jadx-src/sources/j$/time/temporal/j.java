package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.chrono.Chronology;
import j$.time.format.D;
import java.util.HashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class j implements p {
    public static final j JULIAN_DAY;
    public static final j MODIFIED_JULIAN_DAY;
    public static final j RATA_DIE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ j[] f69163d;
    private static final long serialVersionUID = -7501623920830201812L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient String f69164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient s f69165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient long f69166c;

    @Override // j$.time.temporal.p
    public final boolean Y() {
        return true;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f69163d.clone();
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.FOREVER;
        j jVar = new j("JULIAN_DAY", 0, "JulianDay", chronoUnit, chronoUnit2, 2440588L);
        JULIAN_DAY = jVar;
        j jVar2 = new j("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", chronoUnit, chronoUnit2, 40587L);
        MODIFIED_JULIAN_DAY = jVar2;
        j jVar3 = new j("RATA_DIE", 2, "RataDie", chronoUnit, chronoUnit2, 719163L);
        RATA_DIE = jVar3;
        f69163d = new j[]{jVar, jVar2, jVar3};
    }

    private j(String str, int i2, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, long j2) {
        this.f69164a = str2;
        this.f69165b = s.j((-365243219162L) + j2, 365241780471L + j2);
        this.f69166c = j2;
    }

    @Override // j$.time.temporal.p
    public final s C() {
        return this.f69165b;
    }

    @Override // j$.time.temporal.p
    public final s L(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.g(a.EPOCH_DAY)) {
            return this.f69165b;
        }
        throw new DateTimeException("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.p
    public final boolean a0(TemporalAccessor temporalAccessor) {
        return temporalAccessor.g(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.p
    public final long s(TemporalAccessor temporalAccessor) {
        return temporalAccessor.h(a.EPOCH_DAY) + this.f69166c;
    }

    @Override // j$.time.temporal.p
    public final Temporal q(Temporal temporal, long j2) {
        if (!this.f69165b.i(j2)) {
            throw new DateTimeException("Invalid value: " + this.f69164a + " " + j2);
        }
        return temporal.a(Math.subtractExact(j2, this.f69166c), a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.p
    public final TemporalAccessor X(HashMap map, TemporalAccessor temporalAccessor, D d2) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        Chronology chronologyG = Chronology.G(temporalAccessor);
        D d4 = D.LENIENT;
        long j2 = this.f69166c;
        if (d2 == d4) {
            return chronologyG.r(Math.subtractExact(jLongValue, j2));
        }
        this.f69165b.b(jLongValue, this);
        return chronologyG.r(jLongValue - j2);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f69164a;
    }
}
