package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@UnstableApi
public interface ShuffleOrder {

    public static class DefaultShuffleOrder implements ShuffleOrder {
        private final int[] indexInShuffled;
        private final Random random;
        private final int[] shuffled;

        public DefaultShuffleOrder(int i2) {
            this(i2, new Random());
        }

        public DefaultShuffleOrder(int i2, long j2) {
            this(i2, new Random(j2));
        }

        private static int[] createShuffledList(int i2, Random random) {
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int i5 = i3 + 1;
                int iNextInt = random.nextInt(i5);
                iArr[i3] = iArr[iNextInt];
                iArr[iNextInt] = i3;
                i3 = i5;
            }
            return iArr;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder cloneAndClear() {
            return new DefaultShuffleOrder(0, new Random(this.random.nextLong()));
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder cloneAndInsert(int i2, int i3) {
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int i5 = 0;
            int i7 = 0;
            while (i7 < i3) {
                iArr[i7] = this.random.nextInt(this.shuffled.length + 1);
                int i8 = i7 + 1;
                int iNextInt = this.random.nextInt(i8);
                iArr2[i7] = iArr2[iNextInt];
                iArr2[iNextInt] = i7 + i2;
                i7 = i8;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.shuffled.length + i3];
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int[] iArr4 = this.shuffled;
                if (i5 >= iArr4.length + i3) {
                    return new DefaultShuffleOrder(iArr3, new Random(this.random.nextLong()));
                }
                if (i9 >= i3 || i10 != iArr[i9]) {
                    int i11 = i10 + 1;
                    int i12 = iArr4[i10];
                    iArr3[i5] = i12;
                    if (i12 >= i2) {
                        iArr3[i5] = i12 + i3;
                    }
                    i10 = i11;
                } else {
                    iArr3[i5] = iArr2[i9];
                    i9++;
                }
                i5++;
            }
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder cloneAndRemove(int i2, int i3) {
            int i5 = i3 - i2;
            int[] iArr = new int[this.shuffled.length - i5];
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int[] iArr2 = this.shuffled;
                if (i7 >= iArr2.length) {
                    return new DefaultShuffleOrder(iArr, new Random(this.random.nextLong()));
                }
                int i9 = iArr2[i7];
                if (i9 < i2 || i9 >= i3) {
                    int i10 = i7 - i8;
                    if (i9 >= i2) {
                        i9 -= i5;
                    }
                    iArr[i10] = i9;
                } else {
                    i8++;
                }
                i7++;
            }
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getFirstIndex() {
            int[] iArr = this.shuffled;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getLastIndex() {
            int[] iArr = this.shuffled;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getLength() {
            return this.shuffled.length;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getNextIndex(int i2) {
            int i3 = this.indexInShuffled[i2] + 1;
            int[] iArr = this.shuffled;
            if (i3 < iArr.length) {
                return iArr[i3];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getPreviousIndex(int i2) {
            int i3 = this.indexInShuffled[i2] - 1;
            if (i3 >= 0) {
                return this.shuffled[i3];
            }
            return -1;
        }

        public DefaultShuffleOrder(int[] iArr, long j2) {
            this(Arrays.copyOf(iArr, iArr.length), new Random(j2));
        }

        private DefaultShuffleOrder(int i2, Random random) {
            this(createShuffledList(i2, random), random);
        }

        private DefaultShuffleOrder(int[] iArr, Random random) {
            this.shuffled = iArr;
            this.random = random;
            this.indexInShuffled = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                this.indexInShuffled[iArr[i2]] = i2;
            }
        }
    }

    public static final class UnshuffledShuffleOrder implements ShuffleOrder {
        private final int length;

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getPreviousIndex(int i2) {
            int i3 = i2 - 1;
            if (i3 >= 0) {
                return i3;
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder cloneAndClear() {
            return new UnshuffledShuffleOrder(0);
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder cloneAndInsert(int i2, int i3) {
            return new UnshuffledShuffleOrder(this.length + i3);
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public ShuffleOrder cloneAndRemove(int i2, int i3) {
            return new UnshuffledShuffleOrder((this.length - i3) + i2);
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getFirstIndex() {
            return this.length > 0 ? 0 : -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getLastIndex() {
            int i2 = this.length;
            if (i2 > 0) {
                return i2 - 1;
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getLength() {
            return this.length;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getNextIndex(int i2) {
            int i3 = i2 + 1;
            if (i3 < this.length) {
                return i3;
            }
            return -1;
        }

        public UnshuffledShuffleOrder(int i2) {
            this.length = i2;
        }
    }

    ShuffleOrder cloneAndClear();

    ShuffleOrder cloneAndInsert(int i2, int i3);

    ShuffleOrder cloneAndRemove(int i2, int i3);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i2);

    int getPreviousIndex(int i2);
}
