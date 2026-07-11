package j$.time.format;

import j$.time.temporal.WeekFields;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class t extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char f69092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f69093h;

    t(char c2, int i2, int i3, int i5, int i7) {
        super(null, i3, i5, E.NOT_NEGATIVE, i7);
        this.f69092g = c2;
        this.f69093h = i2;
    }

    @Override // j$.time.format.k
    final k e() {
        if (this.f69065e == -1) {
            return this;
        }
        return new t(this.f69092g, this.f69093h, this.f69062b, this.f69063c, -1);
    }

    @Override // j$.time.format.k
    final k f(int i2) {
        int i3 = this.f69065e + i2;
        return new t(this.f69092g, this.f69093h, this.f69062b, this.f69063c, i3);
    }

    @Override // j$.time.format.k, j$.time.format.InterfaceC2193f
    public final boolean q(y yVar, StringBuilder sb) {
        return g(yVar.c()).q(yVar, sb);
    }

    @Override // j$.time.format.k, j$.time.format.InterfaceC2193f
    public final int s(w wVar, CharSequence charSequence, int i2) {
        return g(wVar.i()).s(wVar, charSequence, i2);
    }

    private k g(Locale locale) {
        j$.time.temporal.p pVarH;
        WeekFields weekFieldsOf = WeekFields.of(locale);
        char c2 = this.f69092g;
        if (c2 == 'W') {
            pVarH = weekFieldsOf.h();
        } else {
            if (c2 == 'Y') {
                j$.time.temporal.p pVarG = weekFieldsOf.g();
                int i2 = this.f69093h;
                if (i2 == 2) {
                    return new q(pVarG, q.f69085h, this.f69065e);
                }
                return new k(pVarG, i2, 19, i2 < 4 ? E.NORMAL : E.EXCEEDS_PAD, this.f69065e);
            }
            if (c2 == 'c' || c2 == 'e') {
                pVarH = weekFieldsOf.d();
            } else if (c2 == 'w') {
                pVarH = weekFieldsOf.i();
            } else {
                throw new IllegalStateException("unreachable");
            }
        }
        return new k(pVarH, this.f69062b, this.f69063c, E.NOT_NEGATIVE, this.f69065e);
    }

    @Override // j$.time.format.k
    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i2 = this.f69093h;
        char c2 = this.f69092g;
        if (c2 != 'Y') {
            if (c2 == 'W') {
                sb.append("WeekOfMonth");
            } else if (c2 == 'c' || c2 == 'e') {
                sb.append("DayOfWeek");
            } else if (c2 == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(i2);
        } else if (i2 == 1) {
            sb.append("WeekBasedYear");
        } else if (i2 == 2) {
            sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb.append("WeekBasedYear,");
            sb.append(i2);
            sb.append(",19,");
            sb.append(i2 < 4 ? E.NORMAL : E.EXCEEDS_PAD);
        }
        sb.append(")");
        return sb.toString();
    }
}
