package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class TileList<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SparseArray f41234n;
    Tile rl;

    public static class Tile<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Object[] f41235n;
        Tile nr;
        public int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f41236t;

        Tile(Class cls, int i2) {
            this.f41235n = (Object[]) Array.newInstance((Class<?>) cls, i2);
        }
    }

    public int O() {
        return this.f41234n.size();
    }

    public Tile n(Tile tile) {
        int iIndexOfKey = this.f41234n.indexOfKey(tile.rl);
        if (iIndexOfKey < 0) {
            this.f41234n.put(tile.rl, tile);
            return null;
        }
        Tile tile2 = (Tile) this.f41234n.valueAt(iIndexOfKey);
        this.f41234n.setValueAt(iIndexOfKey, tile);
        if (this.rl == tile2) {
            this.rl = tile;
        }
        return tile2;
    }

    public Tile nr(int i2) {
        Tile tile = (Tile) this.f41234n.get(i2);
        if (this.rl == tile) {
            this.rl = null;
        }
        this.f41234n.delete(i2);
        return tile;
    }

    public void rl() {
        this.f41234n.clear();
    }

    public Tile t(int i2) {
        if (i2 < 0 || i2 >= this.f41234n.size()) {
            return null;
        }
        return (Tile) this.f41234n.valueAt(i2);
    }
}
