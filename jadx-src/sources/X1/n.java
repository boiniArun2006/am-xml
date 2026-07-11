package X1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class n {
    public final j J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f11729O;
    public final EnumC0422n Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f11730n;
    public final int nr;
    public final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f11731t;

    public enum j {
        BLEND_WITH_PREVIOUS,
        NO_BLEND
    }

    /* JADX INFO: renamed from: X1.n$n, reason: collision with other inner class name */
    public enum EnumC0422n {
        DISPOSE_DO_NOT,
        DISPOSE_TO_BACKGROUND,
        DISPOSE_TO_PREVIOUS
    }

    public n(int i2, int i3, int i5, int i7, int i8, j jVar, EnumC0422n enumC0422n) {
        this.f11730n = i2;
        this.rl = i3;
        this.f11731t = i5;
        this.nr = i7;
        this.f11729O = i8;
        this.J2 = jVar;
        this.Uo = enumC0422n;
    }
}
