package j$.time.format;

import j$.time.chrono.Chronology;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class s implements InterfaceC2193f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.time.temporal.p f69088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextStyle f69089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B f69090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile k f69091d;

    s(j$.time.temporal.p pVar, TextStyle textStyle, B b2) {
        this.f69088a = pVar;
        this.f69089b = textStyle;
        this.f69090c = b2;
    }

    @Override // j$.time.format.InterfaceC2193f
    public final boolean q(y yVar, StringBuilder sb) {
        String strE;
        Long lE = yVar.e(this.f69088a);
        if (lE == null) {
            return false;
        }
        Chronology chronology = (Chronology) yVar.d().e(j$.time.temporal.q.a());
        if (chronology == null || chronology == j$.time.chrono.p.f68978e) {
            strE = this.f69090c.e(this.f69088a, lE.longValue(), this.f69089b, yVar.c());
        } else {
            strE = this.f69090c.d(chronology, this.f69088a, lE.longValue(), this.f69089b, yVar.c());
        }
        if (strE != null) {
            sb.append(strE);
            return true;
        }
        if (this.f69091d == null) {
            this.f69091d = new k(this.f69088a, 1, 19, E.NORMAL);
        }
        return this.f69091d.q(yVar, sb);
    }

    @Override // j$.time.format.InterfaceC2193f
    public final int s(w wVar, CharSequence charSequence, int i2) {
        Iterator itG;
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            throw new IndexOutOfBoundsException();
        }
        TextStyle textStyle = wVar.l() ? this.f69089b : null;
        Chronology chronologyH = wVar.h();
        B b2 = this.f69090c;
        j$.time.temporal.p pVar = this.f69088a;
        if (chronologyH == null || chronologyH == j$.time.chrono.p.f68978e) {
            itG = b2.g(pVar, textStyle, wVar.i());
        } else {
            itG = b2.f(chronologyH, pVar, textStyle, wVar.i());
        }
        Iterator it = itG;
        if (it != null) {
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                if (wVar.s(str, 0, charSequence, i2, str.length())) {
                    return wVar.o(this.f69088a, ((Long) entry.getValue()).longValue(), i2, str.length() + i2);
                }
            }
            if (pVar == j$.time.temporal.a.ERA && !wVar.l()) {
                Iterator it2 = chronologyH.D().iterator();
                while (it2.hasNext()) {
                    String string = ((j$.time.chrono.j) it2.next()).toString();
                    if (wVar.s(string, 0, charSequence, i2, string.length())) {
                        return wVar.o(this.f69088a, r7.getValue(), i2, string.length() + i2);
                    }
                }
            }
            if (wVar.l()) {
                return ~i2;
            }
        }
        if (this.f69091d == null) {
            this.f69091d = new k(this.f69088a, 1, 19, E.NORMAL);
        }
        return this.f69091d.s(wVar, charSequence, i2);
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        j$.time.temporal.p pVar = this.f69088a;
        TextStyle textStyle2 = this.f69089b;
        if (textStyle2 == textStyle) {
            return "Text(" + pVar + ")";
        }
        return "Text(" + pVar + "," + textStyle2 + ")";
    }
}
