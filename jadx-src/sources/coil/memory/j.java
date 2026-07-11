package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j implements CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final fuX f43890n;

    @Override // coil.memory.CN3
    public void n(int i2) {
    }

    @Override // coil.memory.CN3
    public MemoryCache.n rl(MemoryCache.Key key) {
        return null;
    }

    @Override // coil.memory.CN3
    public void t(MemoryCache.Key key, Bitmap bitmap, Map map) {
        this.f43890n.t(key, bitmap, map, kYF.j.n(bitmap));
    }

    public j(fuX fux) {
        this.f43890n = fux;
    }
}
