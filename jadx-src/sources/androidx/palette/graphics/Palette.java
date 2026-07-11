package androidx.palette.graphics;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.Log;
import android.util.SparseBooleanArray;
import androidx.collection.ArrayMap;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Palette {
    static final Filter J2 = new Filter() { // from class: androidx.palette.graphics.Palette.1
        private boolean nr(float[] fArr) {
            return fArr[2] >= 0.95f;
        }

        private boolean rl(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        private boolean t(float[] fArr) {
            float f3 = fArr[0];
            return f3 >= 10.0f && f3 <= 37.0f && fArr[1] <= 0.82f;
        }

        @Override // androidx.palette.graphics.Palette.Filter
        public boolean n(int i2, float[] fArr) {
            if (!nr(fArr) && !rl(fArr) && !t(fArr)) {
                return true;
            }
            return false;
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f40499n;
    private final List rl;
    private final SparseBooleanArray nr = new SparseBooleanArray();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f40500t = new ArrayMap();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Swatch f40498O = n();

    public static final class Builder {
        private int J2;
        private Rect KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f40501O;
        private final List Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f40502n;
        private int nr;
        private final Bitmap rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final List f40503t;

        /* JADX INFO: renamed from: androidx.palette.graphics.Palette$Builder$1, reason: invalid class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
        class AnonymousClass1 extends AsyncTask<Bitmap, Void, Palette> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ PaletteAsyncListener f40504n;
            final /* synthetic */ Builder rl;

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public Palette doInBackground(Bitmap... bitmapArr) {
                try {
                    return this.rl.n();
                } catch (Exception e2) {
                    Log.e("Palette", "Exception thrown during async generate", e2);
                    return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Palette palette) {
                this.f40504n.n(palette);
            }
        }

        private Bitmap t(Bitmap bitmap) {
            int iMax;
            int i2;
            double dSqrt = -1.0d;
            if (this.f40501O > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i3 = this.f40501O;
                if (width > i3) {
                    dSqrt = Math.sqrt(((double) i3) / ((double) width));
                }
            } else if (this.J2 > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i2 = this.J2)) {
                dSqrt = ((double) i2) / ((double) iMax);
            }
            return dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
        }

        public Palette n() {
            List listNr;
            Filter[] filterArr;
            Bitmap bitmap = this.rl;
            if (bitmap != null) {
                Bitmap bitmapT = t(bitmap);
                Rect rect = this.KN;
                if (bitmapT != this.rl && rect != null) {
                    double width = ((double) bitmapT.getWidth()) / ((double) this.rl.getWidth());
                    rect.left = (int) Math.floor(((double) rect.left) * width);
                    rect.top = (int) Math.floor(((double) rect.top) * width);
                    rect.right = Math.min((int) Math.ceil(((double) rect.right) * width), bitmapT.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width), bitmapT.getHeight());
                }
                int[] iArrRl = rl(bitmapT);
                int i2 = this.nr;
                if (this.Uo.isEmpty()) {
                    filterArr = null;
                } else {
                    List list = this.Uo;
                    filterArr = (Filter[]) list.toArray(new Filter[list.size()]);
                }
                ColorCutQuantizer colorCutQuantizer = new ColorCutQuantizer(iArrRl, i2, filterArr);
                if (bitmapT != this.rl) {
                    bitmapT.recycle();
                }
                listNr = colorCutQuantizer.nr();
            } else {
                listNr = this.f40502n;
                if (listNr == null) {
                    throw new AssertionError();
                }
            }
            Palette palette = new Palette(listNr, this.f40503t);
            palette.t();
            return palette;
        }

        public Builder(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f40503t = arrayList;
            this.nr = 16;
            this.f40501O = 12544;
            this.J2 = -1;
            ArrayList arrayList2 = new ArrayList();
            this.Uo = arrayList2;
            if (bitmap != null && !bitmap.isRecycled()) {
                arrayList2.add(Palette.J2);
                this.rl = bitmap;
                this.f40502n = null;
                arrayList.add(Target.f40508O);
                arrayList.add(Target.J2);
                arrayList.add(Target.Uo);
                arrayList.add(Target.KN);
                arrayList.add(Target.xMQ);
                arrayList.add(Target.mUb);
                return;
            }
            throw new IllegalArgumentException("Bitmap is not valid");
        }

        private int[] rl(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.KN;
            if (rect == null) {
                return iArr;
            }
            int iWidth = rect.width();
            int iHeight = this.KN.height();
            int[] iArr2 = new int[iWidth * iHeight];
            for (int i2 = 0; i2 < iHeight; i2++) {
                Rect rect2 = this.KN;
                System.arraycopy(iArr, ((rect2.top + i2) * width) + rect2.left, iArr2, i2 * iWidth, iWidth);
            }
            return iArr2;
        }
    }

    public interface Filter {
        boolean n(int i2, float[] fArr);
    }

    public interface PaletteAsyncListener {
        void n(Palette palette);
    }

    public static final class Swatch {
        private boolean J2;
        private int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final int f40505O;
        private int Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f40506n;
        private final int nr;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f40507t;
        private float[] xMQ;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Swatch.class == obj.getClass()) {
                Swatch swatch = (Swatch) obj;
                if (this.f40505O == swatch.f40505O && this.nr == swatch.nr) {
                    return true;
                }
            }
            return false;
        }

        private void n() {
            if (this.J2) {
                return;
            }
            int iUo = ColorUtils.Uo(-1, this.nr, 4.5f);
            int iUo2 = ColorUtils.Uo(-1, this.nr, 3.0f);
            if (iUo != -1 && iUo2 != -1) {
                this.KN = ColorUtils.ck(-1, iUo);
                this.Uo = ColorUtils.ck(-1, iUo2);
                this.J2 = true;
                return;
            }
            int iUo3 = ColorUtils.Uo(-16777216, this.nr, 4.5f);
            int iUo4 = ColorUtils.Uo(-16777216, this.nr, 3.0f);
            if (iUo3 == -1 || iUo4 == -1) {
                this.KN = iUo != -1 ? ColorUtils.ck(-1, iUo) : ColorUtils.ck(-16777216, iUo3);
                this.Uo = iUo2 != -1 ? ColorUtils.ck(-1, iUo2) : ColorUtils.ck(-16777216, iUo4);
                this.J2 = true;
            } else {
                this.KN = ColorUtils.ck(-16777216, iUo3);
                this.Uo = ColorUtils.ck(-16777216, iUo4);
                this.J2 = true;
            }
        }

        public int O() {
            return this.nr;
        }

        public int hashCode() {
            return (this.nr * 31) + this.f40505O;
        }

        public int nr() {
            return this.f40505O;
        }

        public float[] t() {
            if (this.xMQ == null) {
                this.xMQ = new float[3];
            }
            ColorUtils.n(this.f40506n, this.rl, this.f40507t, this.xMQ);
            return this.xMQ;
        }

        public String toString() {
            return Swatch.class.getSimpleName() + " [RGB: #" + Integer.toHexString(O()) + "] [HSL: " + Arrays.toString(t()) + "] [Population: " + this.f40505O + "] [Title Text: #" + Integer.toHexString(J2()) + "] [Body Text: #" + Integer.toHexString(rl()) + ']';
        }

        public Swatch(int i2, int i3) {
            this.f40506n = Color.red(i2);
            this.rl = Color.green(i2);
            this.f40507t = Color.blue(i2);
            this.nr = i2;
            this.f40505O = i3;
        }

        public int J2() {
            n();
            return this.Uo;
        }

        public int rl() {
            n();
            return this.KN;
        }
    }

    private Swatch gh(Target target) {
        int size = this.f40499n.size();
        float f3 = 0.0f;
        Swatch swatch = null;
        for (int i2 = 0; i2 < size; i2++) {
            Swatch swatch2 = (Swatch) this.f40499n.get(i2);
            if (ty(swatch2, target)) {
                float fNr = nr(swatch2, target);
                if (swatch == null || fNr > f3) {
                    swatch = swatch2;
                    f3 = fNr;
                }
            }
        }
        return swatch;
    }

    private Swatch n() {
        int size = this.f40499n.size();
        int iNr = Integer.MIN_VALUE;
        Swatch swatch = null;
        for (int i2 = 0; i2 < size; i2++) {
            Swatch swatch2 = (Swatch) this.f40499n.get(i2);
            if (swatch2.nr() > iNr) {
                iNr = swatch2.nr();
                swatch = swatch2;
            }
        }
        return swatch;
    }

    public static Builder rl(Bitmap bitmap) {
        return new Builder(bitmap);
    }

    public Swatch J2() {
        return az(Target.mUb);
    }

    public Swatch KN() {
        return this.f40498O;
    }

    public Swatch Uo() {
        return az(Target.Uo);
    }

    public Swatch az(Target target) {
        return (Swatch) this.f40500t.get(target);
    }

    public Swatch mUb() {
        return az(Target.f40508O);
    }

    public Swatch qie() {
        return az(Target.xMQ);
    }

    void t() {
        int size = this.rl.size();
        for (int i2 = 0; i2 < size; i2++) {
            Target target = (Target) this.rl.get(i2);
            target.gh();
            this.f40500t.put(target, O(target));
        }
        this.nr.clear();
    }

    public Swatch xMQ() {
        return az(Target.KN);
    }

    Palette(List list, List list2) {
        this.f40499n = list;
        this.rl = list2;
    }

    private Swatch O(Target target) {
        Swatch swatchGh = gh(target);
        if (swatchGh != null && target.mUb()) {
            this.nr.append(swatchGh.O(), true);
        }
        return swatchGh;
    }

    private float nr(Swatch swatch, Target target) {
        int iNr;
        float fUo;
        float fN;
        float[] fArrT = swatch.t();
        Swatch swatch2 = this.f40498O;
        if (swatch2 != null) {
            iNr = swatch2.nr();
        } else {
            iNr = 1;
        }
        float fJ2 = 0.0f;
        if (target.Uo() > 0.0f) {
            fUo = target.Uo() * (1.0f - Math.abs(fArrT[1] - target.xMQ()));
        } else {
            fUo = 0.0f;
        }
        if (target.n() > 0.0f) {
            fN = target.n() * (1.0f - Math.abs(fArrT[2] - target.KN()));
        } else {
            fN = 0.0f;
        }
        if (target.J2() > 0.0f) {
            fJ2 = target.J2() * (swatch.nr() / iNr);
        }
        return fUo + fN + fJ2;
    }

    private boolean ty(Swatch swatch, Target target) {
        float[] fArrT = swatch.t();
        if (fArrT[1] >= target.O() && fArrT[1] <= target.t() && fArrT[2] >= target.nr() && fArrT[2] <= target.rl() && !this.nr.get(swatch.O())) {
            return true;
        }
        return false;
    }
}
