package androidx.recyclerview.widget;

import androidx.recyclerview.widget.TileList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
interface ThreadUtil<T> {

    public interface BackgroundCallback<T> {
        void n(int i2, int i3, int i5, int i7, int i8);

        void nr(TileList.Tile tile);

        void rl(int i2, int i3);

        void t(int i2);
    }

    public interface MainThreadCallback<T> {
        void n(int i2, int i3);

        void rl(int i2, TileList.Tile tile);

        void t(int i2, int i3);
    }
}
