package stX;

import android.graphics.Trmy.yioUaKMByL;
import kotlin.jvm.internal.Intrinsics;
import stX.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class Ml extends I28 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final j f73350O;
    private final int nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f73351t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ml(int i2, int i3, j setter, String str) {
        super(i2 == i3 ? Integer.valueOf(i2) : null, str, null);
        Intrinsics.checkNotNullParameter(setter, "setter");
        Intrinsics.checkNotNullParameter(str, yioUaKMByL.GQFCEBAF);
        this.f73351t = i2;
        this.nr = i3;
        this.f73350O = setter;
        if (1 > i2 || i2 >= 10) {
            throw new IllegalArgumentException(("Invalid minimum length " + i2 + " for field " + t() + ": expected 1..9").toString());
        }
        if (i2 > i3 || i3 >= 10) {
            throw new IllegalArgumentException(("Invalid maximum length " + i3 + " for field " + t() + ": expected " + i2 + "..9").toString());
        }
    }

    @Override // stX.I28
    public CN3 n(Object obj, CharSequence input, int i2, int i3) {
        Intrinsics.checkNotNullParameter(input, "input");
        int i5 = i3 - i2;
        int i7 = this.f73351t;
        if (i5 < i7) {
            return new CN3.w6(i7);
        }
        int i8 = this.nr;
        return i5 > i8 ? new CN3.Ml(i8) : Wre.J2(this.f73350O, obj, new fm.j(Wre.nr(input, i2, i3), i5));
    }
}
