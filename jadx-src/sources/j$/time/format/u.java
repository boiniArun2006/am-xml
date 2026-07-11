package j$.time.format;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalQuery;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
class u implements InterfaceC2193f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile AbstractMap.SimpleImmutableEntry f69094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile AbstractMap.SimpleImmutableEntry f69095d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TemporalQuery f69096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69097b;

    u(TemporalQuery temporalQuery, String str) {
        this.f69096a = temporalQuery;
        this.f69097b = str;
    }

    @Override // j$.time.format.InterfaceC2193f
    public boolean q(y yVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) yVar.f(this.f69096a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.u());
        return true;
    }

    protected o a(w wVar) {
        Set setA = j$.time.zone.j.a();
        int size = setA.size();
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = wVar.k() ? f69094c : f69095d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = wVar.k() ? f69094c : f69095d;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), o.g(setA, wVar));
                        if (wVar.k()) {
                            f69094c = simpleImmutableEntry;
                        } else {
                            f69095d = simpleImmutableEntry;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (o) simpleImmutableEntry.getValue();
    }

    @Override // j$.time.format.InterfaceC2193f
    public final int s(w wVar, CharSequence charSequence, int i2) {
        int i3;
        int length = charSequence.length();
        if (i2 > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == length) {
            return ~i2;
        }
        char cCharAt = charSequence.charAt(i2);
        if (cCharAt == '+' || cCharAt == '-') {
            return b(wVar, charSequence, i2, i2, l.f69067e);
        }
        int i5 = i2 + 2;
        if (length >= i5) {
            char cCharAt2 = charSequence.charAt(i2 + 1);
            if (wVar.b(cCharAt, 'U') && wVar.b(cCharAt2, 'T')) {
                int i7 = i2 + 3;
                if (length >= i7 && wVar.b(charSequence.charAt(i5), 'C')) {
                    return b(wVar, charSequence, i2, i7, l.f69068f);
                }
                return b(wVar, charSequence, i2, i5, l.f69068f);
            }
            if (wVar.b(cCharAt, 'G') && length >= (i3 = i2 + 3) && wVar.b(cCharAt2, 'M') && wVar.b(charSequence.charAt(i5), 'T')) {
                int i8 = i2 + 4;
                if (length >= i8 && wVar.b(charSequence.charAt(i3), '0')) {
                    wVar.n(ZoneId.of("GMT0"));
                    return i8;
                }
                return b(wVar, charSequence, i2, i3, l.f69068f);
            }
        }
        o oVarA = a(wVar);
        ParsePosition parsePosition = new ParsePosition(i2);
        String strD = oVarA.d(charSequence, parsePosition);
        if (strD == null) {
            if (!wVar.b(cCharAt, 'Z')) {
                return ~i2;
            }
            wVar.n(ZoneOffset.UTC);
            return i2 + 1;
        }
        wVar.n(ZoneId.of(strD));
        return parsePosition.getIndex();
    }

    private static int b(w wVar, CharSequence charSequence, int i2, int i3, l lVar) {
        String upperCase = charSequence.subSequence(i2, i3).toString().toUpperCase();
        if (i3 >= charSequence.length()) {
            wVar.n(ZoneId.of(upperCase));
            return i3;
        }
        if (charSequence.charAt(i3) == '0' || wVar.b(charSequence.charAt(i3), 'Z')) {
            wVar.n(ZoneId.of(upperCase));
            return i3;
        }
        w wVarD = wVar.d();
        int iS = lVar.s(wVarD, charSequence, i3);
        try {
            if (iS < 0) {
                if (lVar == l.f69067e) {
                    return ~i2;
                }
                wVar.n(ZoneId.of(upperCase));
                return i3;
            }
            wVar.n(ZoneId.L(upperCase, ZoneOffset.ofTotalSeconds((int) wVarD.j(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
            return iS;
        } catch (DateTimeException unused) {
            return ~i2;
        }
    }

    public final String toString() {
        return this.f69097b;
    }
}
