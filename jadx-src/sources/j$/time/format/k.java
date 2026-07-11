package j$.time.format;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import j$.time.DateTimeException;
import java.math.BigInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
class k implements InterfaceC2193f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final long[] f69060f = {0, 10, 100, 1000, 10000, SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final j$.time.temporal.p f69061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f69062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f69063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E f69064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f69065e;

    long b(y yVar, long j2) {
        return j2;
    }

    k(j$.time.temporal.p pVar, int i2, int i3, E e2) {
        this.f69061a = pVar;
        this.f69062b = i2;
        this.f69063c = i3;
        this.f69064d = e2;
        this.f69065e = 0;
    }

    protected k(j$.time.temporal.p pVar, int i2, int i3, E e2, int i5) {
        this.f69061a = pVar;
        this.f69062b = i2;
        this.f69063c = i3;
        this.f69064d = e2;
        this.f69065e = i5;
    }

    k e() {
        if (this.f69065e == -1) {
            return this;
        }
        return new k(this.f69061a, this.f69062b, this.f69063c, this.f69064d, -1);
    }

    k f(int i2) {
        int i3 = this.f69065e + i2;
        return new k(this.f69061a, this.f69062b, this.f69063c, this.f69064d, i3);
    }

    @Override // j$.time.format.InterfaceC2193f
    public boolean q(y yVar, StringBuilder sb) {
        j$.time.temporal.p pVar = this.f69061a;
        Long lE = yVar.e(pVar);
        if (lE == null) {
            return false;
        }
        long jB = b(yVar, lE.longValue());
        DecimalStyle decimalStyleB = yVar.b();
        String string = jB == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jB));
        int length = string.length();
        int i2 = this.f69063c;
        if (length > i2) {
            throw new DateTimeException("Field " + pVar + " cannot be printed as the value " + jB + " exceeds the maximum print width of " + i2);
        }
        String strA = decimalStyleB.a(string);
        int i3 = this.f69062b;
        E e2 = this.f69064d;
        if (jB >= 0) {
            int i5 = AbstractC2190c.f69051a[e2.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    sb.append('+');
                }
            } else if (i3 < 19 && jB >= f69060f[i3]) {
                sb.append('+');
            }
        } else {
            int i7 = AbstractC2190c.f69051a[e2.ordinal()];
            if (i7 == 1 || i7 == 2 || i7 == 3) {
                sb.append(decimalStyleB.d());
            } else if (i7 == 4) {
                throw new DateTimeException("Field " + pVar + " cannot be printed as the value " + jB + " cannot be negative according to the SignStyle");
            }
        }
        for (int i8 = 0; i8 < i3 - strA.length(); i8++) {
            sb.append(decimalStyleB.e());
        }
        sb.append(strA);
        return true;
    }

    boolean c(w wVar) {
        int i2 = this.f69065e;
        if (i2 != -1) {
            return i2 > 0 && this.f69062b == this.f69063c && this.f69064d == E.NOT_NEGATIVE;
        }
        return true;
    }

    @Override // j$.time.format.InterfaceC2193f
    public int s(w wVar, CharSequence charSequence, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        BigInteger bigIntegerAdd;
        long j2;
        int i5;
        long j3;
        int i7;
        long j4;
        boolean z4;
        int length = charSequence.length();
        if (i2 == length) {
            return ~i2;
        }
        char cCharAt = charSequence.charAt(i2);
        wVar.g().getClass();
        boolean z5 = true;
        int i8 = this.f69063c;
        E e2 = this.f69064d;
        int i9 = this.f69062b;
        int i10 = 0;
        if (cCharAt == '+') {
            boolean zL2 = wVar.l();
            boolean z6 = i9 == i8;
            int iOrdinal = e2.ordinal();
            if (iOrdinal == 0 ? zL2 : !(iOrdinal == 1 || iOrdinal == 4 || (!zL2 && !z6))) {
                return ~i2;
            }
            i3 = i2 + 1;
            z3 = true;
            z2 = false;
        } else if (cCharAt == wVar.g().d()) {
            boolean zL3 = wVar.l();
            boolean z7 = i9 == i8;
            int iOrdinal2 = e2.ordinal();
            if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 4 && (zL3 || z7)) {
                return ~i2;
            }
            i3 = i2 + 1;
            z2 = true;
            z3 = false;
        } else {
            if (e2 == E.ALWAYS && wVar.l()) {
                return ~i2;
            }
            i3 = i2;
            z2 = false;
            z3 = false;
        }
        int i11 = (wVar.l() || c(wVar)) ? i9 : 1;
        int i12 = i3 + i11;
        if (i12 > length) {
            return ~i3;
        }
        if (!wVar.l() && !c(wVar)) {
            i8 = 9;
        }
        int i13 = this.f69065e;
        int iMax = Math.max(i13, 0) + i8;
        while (true) {
            bigIntegerAdd = null;
            if (i10 >= 2) {
                j2 = 0;
                i5 = i3;
                j3 = 0;
                break;
            }
            int iMin = Math.min(iMax + i3, length);
            i7 = i3;
            j4 = 0;
            while (true) {
                if (i7 >= iMin) {
                    z4 = z5;
                    j2 = 0;
                    break;
                }
                int i14 = i7 + 1;
                z4 = z5;
                j2 = 0;
                int iB = wVar.g().b(charSequence.charAt(i7));
                if (iB >= 0) {
                    if (i14 - i3 > 18) {
                        if (bigIntegerAdd == null) {
                            bigIntegerAdd = BigInteger.valueOf(j4);
                        }
                        bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.TEN).add(BigInteger.valueOf(iB));
                    } else {
                        j4 = (j4 * 10) + ((long) iB);
                    }
                    i7 = i14;
                    z5 = z4;
                } else if (i7 < i12) {
                    return ~i3;
                }
            }
            if (i13 <= 0 || i10 != 0) {
                break;
            }
            iMax = Math.max(i11, (i7 - i3) - i13);
            i10++;
            z5 = z4;
        }
        i5 = i7;
        j3 = j4;
        BigInteger bigIntegerDivide = bigIntegerAdd;
        if (z2) {
            if (bigIntegerDivide != null) {
                if (bigIntegerDivide.equals(BigInteger.ZERO) && wVar.l()) {
                    return ~(i3 - 1);
                }
                bigIntegerDivide = bigIntegerDivide.negate();
            } else {
                if (j3 == j2 && wVar.l()) {
                    return ~(i3 - 1);
                }
                j3 = -j3;
            }
        } else if (e2 == E.EXCEEDS_PAD && wVar.l()) {
            int i15 = i5 - i3;
            if (z3) {
                if (i15 <= i9) {
                    return ~(i3 - 1);
                }
            } else if (i15 > i9) {
                return ~i3;
            }
        }
        if (bigIntegerDivide != null) {
            if (bigIntegerDivide.bitLength() > 63) {
                bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                i5--;
            }
            return d(wVar, bigIntegerDivide.longValue(), i3, i5);
        }
        return d(wVar, j3, i3, i5);
    }

    int d(w wVar, long j2, int i2, int i3) {
        return wVar.o(this.f69061a, j2, i2, i3);
    }

    public String toString() {
        int i2 = this.f69063c;
        j$.time.temporal.p pVar = this.f69061a;
        E e2 = this.f69064d;
        int i3 = this.f69062b;
        if (i3 == 1 && i2 == 19 && e2 == E.NORMAL) {
            return "Value(" + pVar + ")";
        }
        if (i3 == i2 && e2 == E.NOT_NEGATIVE) {
            return "Value(" + pVar + "," + i3 + ")";
        }
        return "Value(" + pVar + "," + i3 + "," + i2 + "," + e2 + ")";
    }
}
