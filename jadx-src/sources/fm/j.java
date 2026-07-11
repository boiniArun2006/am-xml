package fm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j implements Comparable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f66977n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f66978t;

    public boolean equals(Object obj) {
        return (obj instanceof j) && compareTo((j) obj) == 0;
    }

    public int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(j other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iMax = Math.max(this.f66978t, other.f66978t);
        return Intrinsics.compare(rl(iMax), other.rl(iMax));
    }

    public final int rl(int i2) {
        int i3 = this.f66978t;
        return i2 == i3 ? this.f66977n : i2 > i3 ? this.f66977n * w6.rl()[i2 - this.f66978t] : this.f66977n / w6.rl()[this.f66978t - i2];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = w6.rl()[this.f66978t];
        sb.append(this.f66977n / i2);
        sb.append('.');
        sb.append(StringsKt.removePrefix(String.valueOf(i2 + (this.f66977n % i2)), (CharSequence) "1"));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public j(int i2, int i3) {
        this.f66977n = i2;
        this.f66978t = i3;
        if (i3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Digits must be non-negative, but was " + i3).toString());
    }
}
