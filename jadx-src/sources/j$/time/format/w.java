package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DateTimeFormatter f69103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f69104b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f69105c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f69106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f69107e;

    w(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f69106d = arrayList;
        this.f69107e = null;
        this.f69103a = dateTimeFormatter;
        arrayList.add(new C());
    }

    final w d() {
        w wVar = new w(this.f69103a);
        wVar.f69104b = this.f69104b;
        wVar.f69105c = this.f69105c;
        return wVar;
    }

    final Locale i() {
        return this.f69103a.d();
    }

    final DecimalStyle g() {
        return this.f69103a.c();
    }

    final Chronology h() {
        Chronology chronology = e().f69009c;
        if (chronology != null) {
            return chronology;
        }
        Chronology chronologyB = this.f69103a.b();
        return chronologyB == null ? j$.time.chrono.p.f68978e : chronologyB;
    }

    final boolean b(char c2, char c4) {
        if (this.f69104b) {
            return c2 == c4;
        }
        return c(c2, c4);
    }

    final boolean k() {
        return this.f69104b;
    }

    final void m(boolean z2) {
        this.f69104b = z2;
    }

    final boolean s(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i5) {
        if (i2 + i5 <= charSequence.length() && i3 + i5 <= charSequence2.length()) {
            if (this.f69104b) {
                for (int i7 = 0; i7 < i5; i7++) {
                    if (charSequence.charAt(i2 + i7) == charSequence2.charAt(i3 + i7)) {
                    }
                }
                return true;
            }
            for (int i8 = 0; i8 < i5; i8++) {
                char cCharAt = charSequence.charAt(i2 + i8);
                char cCharAt2 = charSequence2.charAt(i3 + i8);
                if (cCharAt == cCharAt2 || Character.toUpperCase(cCharAt) == Character.toUpperCase(cCharAt2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    static boolean c(char c2, char c4) {
        return c2 == c4 || Character.toUpperCase(c2) == Character.toUpperCase(c4) || Character.toLowerCase(c2) == Character.toLowerCase(c4);
    }

    final boolean l() {
        return this.f69105c;
    }

    final void q(boolean z2) {
        this.f69105c = z2;
    }

    final void r() {
        ArrayList arrayList = this.f69106d;
        C cE = e();
        cE.getClass();
        C c2 = new C();
        c2.f69007a.putAll(cE.f69007a);
        c2.f69008b = cE.f69008b;
        c2.f69009c = cE.f69009c;
        c2.f69010d = cE.f69010d;
        arrayList.add(c2);
    }

    final void f(boolean z2) {
        ArrayList arrayList = this.f69106d;
        if (z2) {
            arrayList.remove(arrayList.size() - 2);
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    private C e() {
        return (C) this.f69106d.get(r0.size() - 1);
    }

    final TemporalAccessor t(D d2) {
        C cE = e();
        cE.f69009c = h();
        ZoneId zoneId = cE.f69008b;
        if (zoneId == null) {
            this.f69103a.getClass();
            zoneId = null;
        }
        cE.f69008b = zoneId;
        cE.r(d2);
        return cE;
    }

    final Long j(j$.time.temporal.a aVar) {
        return (Long) e().f69007a.get(aVar);
    }

    final int o(j$.time.temporal.p pVar, long j2, int i2, int i3) {
        Objects.requireNonNull(pVar, "field");
        Long l2 = (Long) e().f69007a.put(pVar, Long.valueOf(j2));
        return (l2 == null || l2.longValue() == j2) ? i3 : ~i2;
    }

    final void a(p pVar) {
        if (this.f69107e == null) {
            this.f69107e = new ArrayList();
        }
        this.f69107e.add(pVar);
    }

    final void n(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        e().f69008b = zoneId;
    }

    final void p() {
        e().f69010d = true;
    }

    public final String toString() {
        return e().toString();
    }
}
