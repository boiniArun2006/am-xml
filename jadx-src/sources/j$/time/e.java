package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final /* synthetic */ class e implements TemporalQuery {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68998a;

    public /* synthetic */ e(int i2) {
        this.f68998a = i2;
    }

    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        switch (this.f68998a) {
            case 0:
                return LocalDate.C(temporalAccessor);
            case 1:
                return LocalDateTime.s(temporalAccessor);
            case 2:
                return LocalTime.s(temporalAccessor);
            default:
                return OffsetDateTime.q(temporalAccessor);
        }
    }
}
