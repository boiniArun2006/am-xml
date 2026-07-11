package j$.time.temporal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
public final /* synthetic */ class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f69169b;

    public /* synthetic */ m(int i2, int i3) {
        this.f69168a = i3;
        this.f69169b = i2;
    }

    @Override // j$.time.temporal.l
    public final Temporal f(Temporal temporal) {
        switch (this.f69168a) {
            case 0:
                int iJ = temporal.j(a.DAY_OF_WEEK);
                int i2 = this.f69169b;
                if (iJ == i2) {
                    return temporal;
                }
                return temporal.b(iJ - i2 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
            default:
                int iJ2 = temporal.j(a.DAY_OF_WEEK);
                int i3 = this.f69169b;
                if (iJ2 == i3) {
                    return temporal;
                }
                return temporal.d(i3 - iJ2 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
        }
    }
}
