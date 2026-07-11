package androidx.palette.graphics;

import android.graphics.Color;
import android.util.TimingLogger;
import androidx.core.graphics.ColorUtils;
import androidx.palette.graphics.Palette;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class ColorCutQuantizer {
    private static final Comparator Uo = new Comparator<Vbox>() { // from class: androidx.palette.graphics.ColorCutQuantizer.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compare(Vbox vbox, Vbox vbox2) {
            return vbox2.Uo() - vbox.Uo();
        }
    };

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final Palette.Filter[] f40492O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int[] f40493n;
    final int[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final List f40494t;
    private final float[] J2 = new float[3];
    final TimingLogger nr = null;

    private class Vbox {
        private int J2;
        private int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f40495O;
        private int Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f40496n;
        private int nr;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f40497t;
        private int xMQ;

        Vbox(int i2, int i3) {
            this.f40496n = i2;
            this.rl = i3;
            t();
        }

        final int J2() {
            int i2 = this.f40495O - this.nr;
            int i3 = this.Uo - this.J2;
            int i5 = this.xMQ - this.KN;
            if (i2 < i3 || i2 < i5) {
                return (i3 < i2 || i3 < i5) ? -1 : -2;
            }
            return -3;
        }

        final int O() {
            return (this.rl + 1) - this.f40496n;
        }

        final int Uo() {
            return ((this.f40495O - this.nr) + 1) * ((this.Uo - this.J2) + 1) * ((this.xMQ - this.KN) + 1);
        }

        final Palette.Swatch nr() {
            ColorCutQuantizer colorCutQuantizer = ColorCutQuantizer.this;
            int[] iArr = colorCutQuantizer.f40493n;
            int[] iArr2 = colorCutQuantizer.rl;
            int iGh = 0;
            int i2 = 0;
            int iMUb = 0;
            int iXMQ = 0;
            for (int i3 = this.f40496n; i3 <= this.rl; i3++) {
                int i5 = iArr[i3];
                int i7 = iArr2[i5];
                i2 += i7;
                iGh += ColorCutQuantizer.gh(i5) * i7;
                iMUb += ColorCutQuantizer.mUb(i5) * i7;
                iXMQ += i7 * ColorCutQuantizer.xMQ(i5);
            }
            float f3 = i2;
            return new Palette.Swatch(ColorCutQuantizer.rl(Math.round(iGh / f3), Math.round(iMUb / f3), Math.round(iXMQ / f3)), i2);
        }

        final void t() {
            ColorCutQuantizer colorCutQuantizer = ColorCutQuantizer.this;
            int[] iArr = colorCutQuantizer.f40493n;
            int[] iArr2 = colorCutQuantizer.rl;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i7 = Integer.MIN_VALUE;
            int i8 = 0;
            int i9 = Integer.MAX_VALUE;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = this.f40496n; i11 <= this.rl; i11++) {
                int i12 = iArr[i11];
                i8 += iArr2[i12];
                int iGh = ColorCutQuantizer.gh(i12);
                int iMUb = ColorCutQuantizer.mUb(i12);
                int iXMQ = ColorCutQuantizer.xMQ(i12);
                if (iGh > i3) {
                    i3 = iGh;
                }
                if (iGh < i2) {
                    i2 = iGh;
                }
                if (iMUb > i5) {
                    i5 = iMUb;
                }
                if (iMUb < i9) {
                    i9 = iMUb;
                }
                if (iXMQ > i7) {
                    i7 = iXMQ;
                }
                if (iXMQ < i10) {
                    i10 = iXMQ;
                }
            }
            this.nr = i2;
            this.f40495O = i3;
            this.J2 = i9;
            this.Uo = i5;
            this.KN = i10;
            this.xMQ = i7;
            this.f40497t = i8;
        }

        final Vbox KN() {
            if (n()) {
                int iRl = rl();
                Vbox vbox = ColorCutQuantizer.this.new Vbox(iRl + 1, this.rl);
                this.rl = iRl;
                t();
                return vbox;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }

        final boolean n() {
            if (O() > 1) {
                return true;
            }
            return false;
        }

        final int rl() {
            int iJ2 = J2();
            ColorCutQuantizer colorCutQuantizer = ColorCutQuantizer.this;
            int[] iArr = colorCutQuantizer.f40493n;
            int[] iArr2 = colorCutQuantizer.rl;
            ColorCutQuantizer.O(iArr, iJ2, this.f40496n, this.rl);
            Arrays.sort(iArr, this.f40496n, this.rl + 1);
            ColorCutQuantizer.O(iArr, iJ2, this.f40496n, this.rl);
            int i2 = this.f40497t / 2;
            int i3 = this.f40496n;
            int i5 = 0;
            while (true) {
                int i7 = this.rl;
                if (i3 <= i7) {
                    i5 += iArr2[iArr[i3]];
                    if (i5 >= i2) {
                        return Math.min(i7 - 1, i3);
                    }
                    i3++;
                } else {
                    return this.f40496n;
                }
            }
        }
    }

    private static int J2(int i2, int i3, int i5) {
        return (i5 > i3 ? i2 << (i5 - i3) : i2 >> (i3 - i5)) & ((1 << i5) - 1);
    }

    static void O(int[] iArr, int i2, int i3, int i5) {
        if (i2 == -2) {
            while (i3 <= i5) {
                int i7 = iArr[i3];
                iArr[i3] = xMQ(i7) | (mUb(i7) << 10) | (gh(i7) << 5);
                i3++;
            }
            return;
        }
        if (i2 != -1) {
            return;
        }
        while (i3 <= i5) {
            int i8 = iArr[i3];
            iArr[i3] = gh(i8) | (xMQ(i8) << 10) | (mUb(i8) << 5);
            i3++;
        }
    }

    static int gh(int i2) {
        return (i2 >> 10) & 31;
    }

    static int mUb(int i2) {
        return (i2 >> 5) & 31;
    }

    static int rl(int i2, int i3, int i5) {
        return Color.rgb(J2(i2, 5, 8), J2(i3, 5, 8), J2(i5, 5, 8));
    }

    static int xMQ(int i2) {
        return i2 & 31;
    }

    private List KN(int i2) {
        PriorityQueue priorityQueue = new PriorityQueue(i2, Uo);
        priorityQueue.offer(new Vbox(0, this.f40493n.length - 1));
        HI(priorityQueue, i2);
        return t(priorityQueue);
    }

    private boolean az(int i2, float[] fArr) {
        Palette.Filter[] filterArr = this.f40492O;
        if (filterArr != null && filterArr.length > 0) {
            int length = filterArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                if (!this.f40492O[i3].n(i2, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    private List t(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Palette.Swatch swatchNr = ((Vbox) it.next()).nr();
            if (!ty(swatchNr)) {
                arrayList.add(swatchNr);
            }
        }
        return arrayList;
    }

    List nr() {
        return this.f40494t;
    }

    ColorCutQuantizer(int[] iArr, int i2, Palette.Filter[] filterArr) {
        this.f40492O = filterArr;
        int[] iArr2 = new int[32768];
        this.rl = iArr2;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int iUo = Uo(iArr[i3]);
            iArr[i3] = iUo;
            iArr2[iUo] = iArr2[iUo] + 1;
        }
        int i5 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0 && qie(i7)) {
                iArr2[i7] = 0;
            }
            if (iArr2[i7] > 0) {
                i5++;
            }
        }
        int[] iArr3 = new int[i5];
        this.f40493n = iArr3;
        int i8 = 0;
        for (int i9 = 0; i9 < 32768; i9++) {
            if (iArr2[i9] > 0) {
                iArr3[i8] = i9;
                i8++;
            }
        }
        if (i5 <= i2) {
            this.f40494t = new ArrayList();
            for (int i10 = 0; i10 < i5; i10++) {
                int i11 = iArr3[i10];
                this.f40494t.add(new Palette.Swatch(n(i11), iArr2[i11]));
            }
            return;
        }
        this.f40494t = KN(i2);
    }

    private void HI(PriorityQueue priorityQueue, int i2) {
        Vbox vbox;
        while (priorityQueue.size() < i2 && (vbox = (Vbox) priorityQueue.poll()) != null && vbox.n()) {
            priorityQueue.offer(vbox.KN());
            priorityQueue.offer(vbox);
        }
    }

    private static int Uo(int i2) {
        return J2(Color.blue(i2), 8, 5) | (J2(Color.red(i2), 8, 5) << 10) | (J2(Color.green(i2), 8, 5) << 5);
    }

    private static int n(int i2) {
        return rl(gh(i2), mUb(i2), xMQ(i2));
    }

    private boolean qie(int i2) {
        int iN = n(i2);
        ColorUtils.KN(iN, this.J2);
        return az(iN, this.J2);
    }

    private boolean ty(Palette.Swatch swatch) {
        return az(swatch.O(), swatch.t());
    }
}
