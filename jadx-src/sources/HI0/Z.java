package HI0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class Z implements Sequence {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CharSequence f3845n;
    private final Function2 nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f3846t;

    public static final class j implements Iterator, KMappedMarker {
        private IntRange J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f3847O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f3848n = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f3850r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f3851t;

        j() {
            int iCoerceIn = RangesKt.coerceIn(Z.this.rl, 0, Z.this.f3845n.length());
            this.f3851t = iCoerceIn;
            this.f3847O = iCoerceIn;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void t() {
            Pair pair;
            if (this.f3847O < 0) {
                this.f3848n = 0;
                this.J2 = null;
                return;
            }
            if (Z.this.f3846t > 0) {
                int i2 = this.f3850r + 1;
                this.f3850r = i2;
                if (i2 >= Z.this.f3846t) {
                    this.J2 = new IntRange(this.f3851t, StringsKt.getLastIndex(Z.this.f3845n));
                    this.f3847O = -1;
                } else if (this.f3847O <= Z.this.f3845n.length() && (pair = (Pair) Z.this.nr.invoke(Z.this.f3845n, Integer.valueOf(this.f3847O))) != null) {
                    int iIntValue = ((Number) pair.component1()).intValue();
                    int iIntValue2 = ((Number) pair.component2()).intValue();
                    this.J2 = RangesKt.until(this.f3851t, iIntValue);
                    int i3 = iIntValue + iIntValue2;
                    this.f3851t = i3;
                    this.f3847O = i3 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.J2 = new IntRange(this.f3851t, StringsKt.getLastIndex(Z.this.f3845n));
                    this.f3847O = -1;
                }
            }
            this.f3848n = 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public IntRange next() {
            if (this.f3848n == -1) {
                t();
            }
            if (this.f3848n == 0) {
                throw new NoSuchElementException();
            }
            IntRange intRange = this.J2;
            Intrinsics.checkNotNull(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.J2 = null;
            this.f3848n = -1;
            return intRange;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f3848n == -1) {
                t();
            }
            return this.f3848n == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public Z(CharSequence input, int i2, int i3, Function2 getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f3845n = input;
        this.rl = i2;
        this.f3846t = i3;
        this.nr = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new j();
    }
}
