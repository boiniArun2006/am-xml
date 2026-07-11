package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class x implements TemporalAccessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ChronoLocalDate f69108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f69109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Chronology f69110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ZoneId f69111d;

    x(ChronoLocalDate chronoLocalDate, TemporalAccessor temporalAccessor, Chronology chronology, ZoneId zoneId) {
        this.f69108a = chronoLocalDate;
        this.f69109b = temporalAccessor;
        this.f69110c = chronology;
        this.f69111d = zoneId;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.TemporalAccessor, java.lang.Object] */
    @Override // j$.time.temporal.TemporalAccessor
    public final boolean g(j$.time.temporal.p pVar) {
        ChronoLocalDate chronoLocalDate = this.f69108a;
        if (chronoLocalDate != null && pVar.Y()) {
            return chronoLocalDate.g(pVar);
        }
        return this.f69109b.g(pVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.TemporalAccessor, java.lang.Object] */
    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(j$.time.temporal.p pVar) {
        ChronoLocalDate chronoLocalDate = this.f69108a;
        if (chronoLocalDate != null && pVar.Y()) {
            return chronoLocalDate.l(pVar);
        }
        return this.f69109b.l(pVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.TemporalAccessor, java.lang.Object] */
    @Override // j$.time.temporal.TemporalAccessor
    public final long h(j$.time.temporal.p pVar) {
        ChronoLocalDate chronoLocalDate = this.f69108a;
        if (chronoLocalDate != null && pVar.Y()) {
            return chronoLocalDate.h(pVar);
        }
        return this.f69109b.h(pVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [j$.time.temporal.TemporalAccessor, java.lang.Object] */
    @Override // j$.time.temporal.TemporalAccessor
    public final Object e(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.a()) {
            return this.f69110c;
        }
        if (temporalQuery == j$.time.temporal.q.g()) {
            return this.f69111d;
        }
        if (temporalQuery == j$.time.temporal.q.e()) {
            return this.f69109b.e(temporalQuery);
        }
        return temporalQuery.queryFrom(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        Chronology chronology = this.f69110c;
        if (chronology != null) {
            str = " with chronology " + chronology;
        } else {
            str = "";
        }
        ZoneId zoneId = this.f69111d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f69109b + str + str2;
    }
}
