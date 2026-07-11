package j$.time.format;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;
import java.util.function.Consumer;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class q extends k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final LocalDate f69085h = LocalDate.of(2000, 1, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LocalDate f69086g;

    /* synthetic */ q(j$.time.temporal.p pVar, LocalDate localDate, int i2) {
        this(pVar, 2, 2, localDate, i2);
    }

    q(j$.time.temporal.p pVar, LocalDate localDate) {
        this(pVar, 2, 2, localDate, 0);
        if (localDate == null) {
            long j2 = 0;
            if (!pVar.C().i(j2)) {
                throw new IllegalArgumentException("The base value must be within the range of the field");
            }
            if (j2 + k.f69060f[2] > 2147483647L) {
                throw new DateTimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
            }
        }
    }

    private q(j$.time.temporal.p pVar, int i2, int i3, LocalDate localDate, int i5) {
        super(pVar, i2, i3, E.NOT_NEGATIVE, i5);
        this.f69086g = localDate;
    }

    @Override // j$.time.format.k
    final long b(y yVar, long j2) {
        long jAbs = Math.abs(j2);
        LocalDate localDate = this.f69086g;
        long j3 = localDate != null ? Chronology.G(yVar.d()).v(localDate).j(this.f69061a) : 0;
        long[] jArr = k.f69060f;
        if (j2 >= j3) {
            long j4 = jArr[this.f69062b];
            if (j2 < j3 + j4) {
                return jAbs % j4;
            }
        }
        return jAbs % jArr[this.f69063c];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.time.format.p] */
    @Override // j$.time.format.k
    final int d(w wVar, long j2, int i2, int i3) {
        q qVar;
        w wVar2;
        final long j3;
        final int i5;
        final int i7;
        int iJ;
        long j4;
        TemporalAccessor temporalAccessor = this.f69086g;
        if (temporalAccessor != null) {
            iJ = wVar.h().v(temporalAccessor).j(this.f69061a);
            qVar = this;
            final w wVar3 = wVar;
            j3 = j2;
            i5 = i2;
            i7 = i3;
            wVar3.a(new Consumer() { // from class: j$.time.format.p
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f69080a.d(wVar3, j3, i5, i7);
                }
            });
            wVar2 = wVar3;
        } else {
            qVar = this;
            wVar2 = wVar;
            j3 = j2;
            i5 = i2;
            i7 = i3;
            iJ = 0;
        }
        int i8 = i7 - i5;
        int i9 = qVar.f69062b;
        if (i8 != i9 || j3 < 0) {
            j4 = j3;
        } else {
            long j5 = k.f69060f[i9];
            long j6 = iJ;
            long j7 = j6 - (j6 % j5);
            long j9 = iJ > 0 ? j7 + j3 : j7 - j3;
            j4 = j9 < j6 ? j9 + j5 : j9;
        }
        return wVar2.o(qVar.f69061a, j4, i5, i7);
    }

    @Override // j$.time.format.k
    final k e() {
        if (this.f69065e == -1) {
            return this;
        }
        return new q(this.f69061a, this.f69062b, this.f69063c, this.f69086g, -1);
    }

    @Override // j$.time.format.k
    final k f(int i2) {
        int i3 = this.f69065e + i2;
        return new q(this.f69061a, this.f69062b, this.f69063c, this.f69086g, i3);
    }

    @Override // j$.time.format.k
    final boolean c(w wVar) {
        if (wVar.l()) {
            return super.c(wVar);
        }
        return false;
    }

    @Override // j$.time.format.k
    public final String toString() {
        LocalDate localDate = this.f69086g;
        return "ReducedValue(" + this.f69061a + "," + this.f69062b + "," + this.f69063c + "," + (localDate != null ? localDate : 0) + ")";
    }
}
