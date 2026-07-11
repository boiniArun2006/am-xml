package Ba;

import Ba.n;
import j$.time.DateTimeException;
import j$.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.datetime.DateTimeArithmeticException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f497n = LocalDate.MIN.toEpochDay();
    private static final long rl = LocalDate.MAX.toEpochDay();

    private static final LocalDate n(long j2) {
        long j3 = f497n;
        if (j2 <= rl && j3 <= j2) {
            LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(j2);
            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay, "ofEpochDay(...)");
            return localDateOfEpochDay;
        }
        throw new DateTimeException("The resulting day " + j2 + " is out of supported LocalDate range.");
    }

    public static final I28 rl(I28 i28, int i2, n.AbstractC0015n unit) {
        Intrinsics.checkNotNullParameter(i28, "<this>");
        Intrinsics.checkNotNullParameter(unit, "unit");
        return t(i28, i2, unit);
    }

    public static final I28 t(I28 i28, long j2, n.AbstractC0015n unit) throws Exception {
        LocalDate localDatePlusMonths;
        Intrinsics.checkNotNullParameter(i28, "<this>");
        Intrinsics.checkNotNullParameter(unit, "unit");
        try {
            if (unit instanceof n.w6) {
                localDatePlusMonths = n(fm.n.n(i28.getValue().toEpochDay(), fm.n.t(j2, ((n.w6) unit).getDays())));
            } else {
                if (!(unit instanceof n.Ml)) {
                    throw new NoWhenBranchMatchedException();
                }
                localDatePlusMonths = i28.getValue().plusMonths(fm.n.t(j2, ((n.Ml) unit).getMonths()));
            }
            return new I28(localDatePlusMonths);
        } catch (Exception e2) {
            if (!(e2 instanceof DateTimeException) && !(e2 instanceof ArithmeticException)) {
                throw e2;
            }
            throw new DateTimeArithmeticException("The result of adding " + j2 + " of " + unit + " to " + i28 + " is out of LocalDate range.", e2);
        }
    }
}
