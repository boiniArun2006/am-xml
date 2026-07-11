package SY6;

import android.graphics.drawable.Animatable;
import android.util.Log;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Wre implements Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f9760n = new ArrayList(2);

    private synchronized void xMQ(String str, Throwable th) {
        Log.e("FdingControllerListener", str, th);
    }

    public synchronized void KN() {
        this.f9760n.clear();
    }

    @Override // SY6.Ml
    public synchronized void O(String str, Object obj) {
        int size = this.f9760n.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                Ml ml = (Ml) this.f9760n.get(i2);
                if (ml != null) {
                    ml.O(str, obj);
                }
            } catch (Exception e2) {
                xMQ("InternalListener exception in onSubmit", e2);
            }
        }
    }

    public synchronized void Uo(Ml ml) {
        this.f9760n.add(ml);
    }

    @Override // SY6.Ml
    public synchronized void nr(String str, Object obj, Animatable animatable) {
        int size = this.f9760n.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                Ml ml = (Ml) this.f9760n.get(i2);
                if (ml != null) {
                    ml.nr(str, obj, animatable);
                }
            } catch (Exception e2) {
                xMQ("InternalListener exception in onFinalImageSet", e2);
            }
        }
    }

    @Override // SY6.Ml
    public synchronized void rl(String str, Throwable th) {
        int size = this.f9760n.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                Ml ml = (Ml) this.f9760n.get(i2);
                if (ml != null) {
                    ml.rl(str, th);
                }
            } catch (Exception e2) {
                xMQ("InternalListener exception in onFailure", e2);
            }
        }
    }

    @Override // SY6.Ml
    public synchronized void t(String str) {
        int size = this.f9760n.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                Ml ml = (Ml) this.f9760n.get(i2);
                if (ml != null) {
                    ml.t(str);
                }
            } catch (Exception e2) {
                xMQ(YjqZUJsVmhcjko.DVRAXzRXQ, e2);
            }
        }
    }

    @Override // SY6.Ml
    public void J2(String str, Throwable th) {
        int size = this.f9760n.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                Ml ml = (Ml) this.f9760n.get(i2);
                if (ml != null) {
                    ml.J2(str, th);
                }
            } catch (Exception e2) {
                xMQ("InternalListener exception in onIntermediateImageFailed", e2);
            }
        }
    }

    @Override // SY6.Ml
    public void n(String str, Object obj) {
        int size = this.f9760n.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                Ml ml = (Ml) this.f9760n.get(i2);
                if (ml != null) {
                    ml.n(str, obj);
                }
            } catch (Exception e2) {
                xMQ("InternalListener exception in onIntermediateImageSet", e2);
            }
        }
    }
}
