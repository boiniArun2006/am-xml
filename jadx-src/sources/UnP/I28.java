package UnP;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class I28 implements w6 {
    private static final Bitmap.Config gh = Bitmap.Config.ARGB_8888;
    private long J2;
    private int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f10824O;
    private int Uo;
    private int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Wre f10825n;
    private final j nr;
    private final Set rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f10826t;
    private int xMQ;

    private interface j {
        void n(Bitmap bitmap);

        void rl(Bitmap bitmap);
    }

    I28(long j2, Wre wre, Set set) {
        this.f10826t = j2;
        this.f10824O = j2;
        this.f10825n = wre;
        this.rl = set;
        this.nr = new n();
    }

    private synchronized void HI(long j2) {
        while (this.J2 > j2) {
            try {
                Bitmap bitmapRemoveLast = this.f10825n.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        KN();
                    }
                    this.J2 = 0L;
                    return;
                }
                this.nr.n(bitmapRemoveLast);
                this.J2 -= (long) this.f10825n.O(bitmapRemoveLast);
                this.mUb++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f10825n.rl(bitmapRemoveLast));
                }
                Uo();
                bitmapRemoveLast.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void az(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private synchronized Bitmap qie(int i2, int i3, Bitmap.Config config) {
        Bitmap bitmapNr;
        try {
            O(config);
            bitmapNr = this.f10825n.nr(i2, i3, config != null ? config : gh);
            if (bitmapNr == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f10825n.t(i2, i3, config));
                }
                this.KN++;
            } else {
                this.Uo++;
                this.J2 -= (long) this.f10825n.O(bitmapNr);
                this.nr.n(bitmapNr);
                ty(bitmapNr);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f10825n.t(i2, i3, config));
            }
            Uo();
        } catch (Throwable th) {
            throw th;
        }
        return bitmapNr;
    }

    private static void ty(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        az(bitmap);
    }

    @Override // UnP.w6
    public synchronized void n(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f10825n.O(bitmap) <= this.f10824O && this.rl.contains(bitmap.getConfig())) {
                int iO = this.f10825n.O(bitmap);
                this.f10825n.n(bitmap);
                this.nr.rl(bitmap);
                this.xMQ++;
                this.J2 += (long) iO;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f10825n.rl(bitmap));
                }
                Uo();
                xMQ();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f10825n.rl(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.rl.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // UnP.w6
    public synchronized void rl(float f3) {
        this.f10824O = Math.round(this.f10826t * f3);
        xMQ();
    }

    private static final class n implements j {
        @Override // UnP.I28.j
        public void n(Bitmap bitmap) {
        }

        @Override // UnP.I28.j
        public void rl(Bitmap bitmap) {
        }

        n() {
        }
    }

    private static Bitmap J2(int i2, int i3, Bitmap.Config config) {
        if (config == null) {
            config = gh;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    private void KN() {
        Log.v("LruBitmapPool", "Hits=" + this.Uo + ", misses=" + this.KN + ", puts=" + this.xMQ + ", evictions=" + this.mUb + ", currentSize=" + this.J2 + ", maxSize=" + this.f10824O + "\nStrategy=" + this.f10825n);
    }

    private static void O(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    private void Uo() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            KN();
        }
    }

    private static Wre gh() {
        return new fuX();
    }

    private static Set mUb() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i2 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i2 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private void xMQ() {
        HI(this.f10824O);
    }

    @Override // UnP.w6
    public long nr() {
        return this.f10824O;
    }

    @Override // UnP.w6
    public Bitmap t(int i2, int i3, Bitmap.Config config) {
        Bitmap bitmapQie = qie(i2, i3, config);
        if (bitmapQie == null) {
            return J2(i2, i3, config);
        }
        return bitmapQie;
    }

    public I28(long j2) {
        this(j2, gh(), mUb());
    }
}
