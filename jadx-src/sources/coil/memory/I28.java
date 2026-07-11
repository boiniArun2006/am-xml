package coil.memory;

import android.graphics.Bitmap;
import androidx.collection.LruCache;
import coil.memory.MemoryCache;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class I28 implements CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final fuX f43874n;
    private final n rl;

    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Bitmap f43875n;
        private final Map rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f43876t;

        public final Bitmap n() {
            return this.f43875n;
        }

        public final Map rl() {
            return this.rl;
        }

        public final int t() {
            return this.f43876t;
        }

        public j(Bitmap bitmap, Map map, int i2) {
            this.f43875n = bitmap;
            this.rl = map;
            this.f43876t = i2;
        }
    }

    public static final class n extends LruCache {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ I28 f43877n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i2, I28 i28) {
            super(i2);
            this.f43877n = i28;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.LruCache
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void entryRemoved(boolean z2, MemoryCache.Key key, j jVar, j jVar2) {
            this.f43877n.f43874n.t(key, jVar.n(), jVar.rl(), jVar.t());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.LruCache
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int sizeOf(MemoryCache.Key key, j jVar) {
            return jVar.t();
        }
    }

    public int J2() {
        return this.rl.maxSize();
    }

    public void O() {
        this.rl.evictAll();
    }

    public int Uo() {
        return this.rl.size();
    }

    @Override // coil.memory.CN3
    public void n(int i2) {
        if (i2 >= 40) {
            O();
        } else {
            if (10 > i2 || i2 >= 20) {
                return;
            }
            this.rl.trimToSize(Uo() / 2);
        }
    }

    @Override // coil.memory.CN3
    public MemoryCache.n rl(MemoryCache.Key key) {
        j jVar = (j) this.rl.get(key);
        if (jVar != null) {
            return new MemoryCache.n(jVar.n(), jVar.rl());
        }
        return null;
    }

    public I28(int i2, fuX fux) {
        this.f43874n = fux;
        this.rl = new n(i2, this);
    }

    @Override // coil.memory.CN3
    public void t(MemoryCache.Key key, Bitmap bitmap, Map map) {
        int iN = kYF.j.n(bitmap);
        if (iN <= J2()) {
            this.rl.put(key, new j(bitmap, map, iN));
        } else {
            this.rl.remove(key);
            this.f43874n.t(key, bitmap, map, iN);
        }
    }
}
