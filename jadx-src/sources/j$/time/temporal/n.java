package j$.time.temporal;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.Chronology;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final /* synthetic */ class n implements TemporalQuery, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69170a;

    public /* synthetic */ n(int i2) {
        this.f69170a = i2;
    }

    @Override // j$.time.temporal.l
    public Temporal f(Temporal temporal) {
        a aVar = a.DAY_OF_MONTH;
        return temporal.a(temporal.l(aVar).d(), aVar);
    }

    @Override // j$.time.temporal.TemporalQuery
    public Object queryFrom(TemporalAccessor temporalAccessor) {
        switch (this.f69170a) {
            case 1:
                return (ZoneId) temporalAccessor.e(q.f69171a);
            case 2:
                return (Chronology) temporalAccessor.e(q.f69172b);
            case 3:
                return (TemporalUnit) temporalAccessor.e(q.f69173c);
            case 4:
                a aVar = a.OFFSET_SECONDS;
                if (temporalAccessor.g(aVar)) {
                    return ZoneOffset.ofTotalSeconds(temporalAccessor.j(aVar));
                }
                return null;
            case 5:
                ZoneId zoneId = (ZoneId) temporalAccessor.e(q.f69171a);
                return zoneId != null ? zoneId : (ZoneId) temporalAccessor.e(q.f69174d);
            case 6:
                a aVar2 = a.EPOCH_DAY;
                if (temporalAccessor.g(aVar2)) {
                    return LocalDate.ofEpochDay(temporalAccessor.h(aVar2));
                }
                return null;
            default:
                a aVar3 = a.NANO_OF_DAY;
                if (temporalAccessor.g(aVar3)) {
                    return LocalTime.X(temporalAccessor.h(aVar3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f69170a) {
            case 1:
                return "ZoneId";
            case 2:
                return "Chronology";
            case 3:
                return "Precision";
            case 4:
                return "ZoneOffset";
            case 5:
                return "Zone";
            case 6:
                return "LocalDate";
            case 7:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
