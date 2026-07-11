package j$.time.temporal;

import j$.time.DateTimeException;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public interface TemporalAccessor {
    boolean g(p pVar);

    long h(p pVar);

    default s l(p pVar) {
        if (!(pVar instanceof a)) {
            Objects.requireNonNull(pVar, "field");
            return pVar.L(this);
        }
        if (g(pVar)) {
            return ((a) pVar).C();
        }
        throw new r(j$.time.b.a("Unsupported field: ", pVar));
    }

    default int j(p pVar) {
        s sVarL = l(pVar);
        if (!sVarL.h()) {
            throw new r("Invalid field " + pVar + " for get() method, use getLong() instead");
        }
        long jH = h(pVar);
        if (sVarL.i(jH)) {
            return (int) jH;
        }
        throw new DateTimeException("Invalid value for " + pVar + " (valid values " + sVarL + "): " + jH);
    }

    default Object e(TemporalQuery temporalQuery) {
        if (temporalQuery == q.f69171a || temporalQuery == q.f69172b || temporalQuery == q.f69173c) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }
}
