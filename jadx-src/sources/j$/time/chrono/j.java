package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public interface j extends TemporalAccessor, j$.time.temporal.l {
    int getValue();

    @Override // j$.time.temporal.TemporalAccessor
    default boolean g(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.ERA : pVar != null && pVar.a0(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int j(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ERA) {
            return getValue();
        }
        return super.j(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long h(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ERA) {
            return getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(j$.time.b.a("Unsupported field: ", pVar));
        }
        return pVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object e(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.e()) {
            return ChronoUnit.ERAS;
        }
        return super.e(temporalQuery);
    }

    @Override // j$.time.temporal.l
    default Temporal f(Temporal temporal) {
        return temporal.a(getValue(), j$.time.temporal.a.ERA);
    }
}
