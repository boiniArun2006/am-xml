package j$.time.format;

import j$.time.chrono.Chronology;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: j$.time.format.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class C2189b extends B {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ A f69050e;

    C2189b(A a2) {
        this.f69050e = a2;
    }

    @Override // j$.time.format.B
    public final String d(Chronology chronology, j$.time.temporal.p pVar, long j2, TextStyle textStyle, Locale locale) {
        return this.f69050e.a(j2, textStyle);
    }

    @Override // j$.time.format.B
    public final String e(j$.time.temporal.p pVar, long j2, TextStyle textStyle, Locale locale) {
        return this.f69050e.a(j2, textStyle);
    }

    @Override // j$.time.format.B
    public final Iterator f(Chronology chronology, j$.time.temporal.p pVar, TextStyle textStyle, Locale locale) {
        return this.f69050e.b(textStyle);
    }

    @Override // j$.time.format.B
    public final Iterator g(j$.time.temporal.p pVar, TextStyle textStyle, Locale locale) {
        return this.f69050e.b(textStyle);
    }
}
