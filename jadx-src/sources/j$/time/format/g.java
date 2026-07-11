package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class g extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f69055g;

    g(j$.time.temporal.a aVar, int i2, int i3, boolean z2) {
        this(aVar, i2, i3, z2, 0);
        Objects.requireNonNull(aVar, "field");
        if (!aVar.C().g()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
        }
        if (i2 < 0 || i2 > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i2);
        }
        if (i3 < 1 || i3 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i3);
        }
        if (i3 >= i2) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
    }

    g(j$.time.temporal.p pVar, int i2, int i3, boolean z2, int i5) {
        super(pVar, i2, i3, E.NOT_NEGATIVE, i5);
        this.f69055g = z2;
    }

    @Override // j$.time.format.k
    final k e() {
        if (this.f69065e == -1) {
            return this;
        }
        return new g(this.f69061a, this.f69062b, this.f69063c, this.f69055g, -1);
    }

    @Override // j$.time.format.k
    final k f(int i2) {
        return new g(this.f69061a, this.f69062b, this.f69063c, this.f69055g, this.f69065e + i2);
    }

    @Override // j$.time.format.k
    final boolean c(w wVar) {
        return wVar.l() && this.f69062b == this.f69063c && !this.f69055g;
    }

    @Override // j$.time.format.k, j$.time.format.InterfaceC2193f
    public final boolean q(y yVar, StringBuilder sb) {
        j$.time.temporal.p pVar = this.f69061a;
        Long lE = yVar.e(pVar);
        if (lE == null) {
            return false;
        }
        DecimalStyle decimalStyleB = yVar.b();
        long jLongValue = lE.longValue();
        j$.time.temporal.s sVarC = pVar.C();
        sVarC.b(jLongValue, pVar);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(sVarC.e());
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(sVarC.d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z2 = this.f69055g;
        int i2 = this.f69062b;
        if (iScale != 0) {
            String strA = decimalStyleB.a(bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i2), this.f69063c), roundingMode).toPlainString().substring(2));
            if (z2) {
                sb.append(decimalStyleB.c());
            }
            sb.append(strA);
            return true;
        }
        if (i2 <= 0) {
            return true;
        }
        if (z2) {
            sb.append(decimalStyleB.c());
        }
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(decimalStyleB.e());
        }
        return true;
    }

    @Override // j$.time.format.k, j$.time.format.InterfaceC2193f
    public final int s(w wVar, CharSequence charSequence, int i2) {
        int i3 = (wVar.l() || c(wVar)) ? this.f69062b : 0;
        int i5 = (wVar.l() || c(wVar)) ? this.f69063c : 9;
        int length = charSequence.length();
        if (i2 != length) {
            if (this.f69055g) {
                if (charSequence.charAt(i2) == wVar.g().c()) {
                    i2++;
                } else if (i3 > 0) {
                    return ~i2;
                }
            }
            int i7 = i2;
            int i8 = i3 + i7;
            if (i8 > length) {
                return ~i7;
            }
            int iMin = Math.min(i5 + i7, length);
            int i9 = 0;
            int i10 = i7;
            while (true) {
                if (i10 >= iMin) {
                    break;
                }
                int i11 = i10 + 1;
                int iB = wVar.g().b(charSequence.charAt(i10));
                if (iB >= 0) {
                    i9 = (i9 * 10) + iB;
                    i10 = i11;
                } else if (i11 < i8) {
                    return ~i7;
                }
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i9).movePointLeft(i10 - i7);
            j$.time.temporal.s sVarC = this.f69061a.C();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(sVarC.e());
            return wVar.o(this.f69061a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(sVarC.d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i7, i10);
        }
        if (i3 > 0) {
            return ~i2;
        }
        return i2;
    }

    @Override // j$.time.format.k
    public final String toString() {
        return "Fraction(" + this.f69061a + "," + this.f69062b + "," + this.f69063c + (this.f69055g ? ",DecimalPoint" : "") + ")";
    }
}
