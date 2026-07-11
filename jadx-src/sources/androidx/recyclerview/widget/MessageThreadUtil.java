package androidx.recyclerview.widget;

import android.os.Handler;
import android.util.Log;
import androidx.recyclerview.widget.ThreadUtil;
import androidx.recyclerview.widget.TileList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class MessageThreadUtil<T> implements ThreadUtil<T> {

    /* JADX INFO: renamed from: androidx.recyclerview.widget.MessageThreadUtil$1, reason: invalid class name */
    class AnonymousClass1 implements ThreadUtil.MainThreadCallback<Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final MessageQueue f41127n;
        final /* synthetic */ ThreadUtil.MainThreadCallback nr;
        private final Handler rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Runnable f41128t;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.MessageThreadUtil$1$1, reason: invalid class name and collision with other inner class name */
        class RunnableC05661 implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ AnonymousClass1 f41129n;

            @Override // java.lang.Runnable
            public void run() {
                SyncQueueItem syncQueueItemN = this.f41129n.f41127n.n();
                while (syncQueueItemN != null) {
                    int i2 = syncQueueItemN.rl;
                    if (i2 == 1) {
                        this.f41129n.nr.t(syncQueueItemN.f41137t, syncQueueItemN.nr);
                    } else if (i2 == 2) {
                        this.f41129n.nr.rl(syncQueueItemN.f41137t, (TileList.Tile) syncQueueItemN.KN);
                    } else if (i2 != 3) {
                        Log.e("ThreadUtil", "Unsupported message, what=" + syncQueueItemN.rl);
                    } else {
                        this.f41129n.nr.n(syncQueueItemN.f41137t, syncQueueItemN.nr);
                    }
                    syncQueueItemN = this.f41129n.f41127n.n();
                }
            }
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void n(int i2, int i3) {
            nr(SyncQueueItem.n(3, i2, i3));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void rl(int i2, TileList.Tile tile) {
            nr(SyncQueueItem.t(2, i2, tile));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.MainThreadCallback
        public void t(int i2, int i3) {
            nr(SyncQueueItem.n(1, i2, i3));
        }

        private void nr(SyncQueueItem syncQueueItem) {
            this.f41127n.t(syncQueueItem);
            this.rl.post(this.f41128t);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.MessageThreadUtil$2, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class AnonymousClass2 implements ThreadUtil.BackgroundCallback<Object> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ ThreadUtil.BackgroundCallback f41130O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final MessageQueue f41131n;
        private Runnable nr;
        private final Executor rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        AtomicBoolean f41132t;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.MessageThreadUtil$2$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ AnonymousClass2 f41133n;

            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    SyncQueueItem syncQueueItemN = this.f41133n.f41131n.n();
                    if (syncQueueItemN == null) {
                        this.f41133n.f41132t.set(false);
                        return;
                    }
                    int i2 = syncQueueItemN.rl;
                    if (i2 == 1) {
                        this.f41133n.f41131n.rl(1);
                        this.f41133n.f41130O.t(syncQueueItemN.f41137t);
                    } else if (i2 == 2) {
                        this.f41133n.f41131n.rl(2);
                        this.f41133n.f41131n.rl(3);
                        this.f41133n.f41130O.n(syncQueueItemN.f41137t, syncQueueItemN.nr, syncQueueItemN.f41135O, syncQueueItemN.J2, syncQueueItemN.Uo);
                    } else if (i2 == 3) {
                        this.f41133n.f41130O.rl(syncQueueItemN.f41137t, syncQueueItemN.nr);
                    } else if (i2 != 4) {
                        Log.e("ThreadUtil", "Unsupported message, what=" + syncQueueItemN.rl);
                    } else {
                        this.f41133n.f41130O.nr((TileList.Tile) syncQueueItemN.KN);
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void n(int i2, int i3, int i5, int i7, int i8) {
            Uo(SyncQueueItem.rl(2, i2, i3, i5, i7, i8, null));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void nr(TileList.Tile tile) {
            J2(SyncQueueItem.t(4, 0, tile));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void rl(int i2, int i3) {
            J2(SyncQueueItem.n(3, i2, i3));
        }

        @Override // androidx.recyclerview.widget.ThreadUtil.BackgroundCallback
        public void t(int i2) {
            Uo(SyncQueueItem.t(1, i2, null));
        }

        private void J2(SyncQueueItem syncQueueItem) {
            this.f41131n.t(syncQueueItem);
            O();
        }

        private void O() {
            if (this.f41132t.compareAndSet(false, true)) {
                this.rl.execute(this.nr);
            }
        }

        private void Uo(SyncQueueItem syncQueueItem) {
            this.f41131n.nr(syncQueueItem);
            O();
        }
    }

    static class MessageQueue {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private SyncQueueItem f41134n;
        private final Object rl;

        SyncQueueItem n() {
            synchronized (this.rl) {
                try {
                    SyncQueueItem syncQueueItem = this.f41134n;
                    if (syncQueueItem == null) {
                        return null;
                    }
                    this.f41134n = syncQueueItem.f41136n;
                    return syncQueueItem;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void nr(SyncQueueItem syncQueueItem) {
            synchronized (this.rl) {
                syncQueueItem.f41136n = this.f41134n;
                this.f41134n = syncQueueItem;
            }
        }

        void rl(int i2) {
            SyncQueueItem syncQueueItem;
            synchronized (this.rl) {
                while (true) {
                    try {
                        syncQueueItem = this.f41134n;
                        if (syncQueueItem == null || syncQueueItem.rl != i2) {
                            break;
                        }
                        this.f41134n = syncQueueItem.f41136n;
                        syncQueueItem.nr();
                    } finally {
                    }
                }
                if (syncQueueItem != null) {
                    SyncQueueItem syncQueueItem2 = syncQueueItem.f41136n;
                    while (syncQueueItem2 != null) {
                        SyncQueueItem syncQueueItem3 = syncQueueItem2.f41136n;
                        if (syncQueueItem2.rl == i2) {
                            syncQueueItem.f41136n = syncQueueItem3;
                            syncQueueItem2.nr();
                        } else {
                            syncQueueItem = syncQueueItem2;
                        }
                        syncQueueItem2 = syncQueueItem3;
                    }
                }
            }
        }

        void t(SyncQueueItem syncQueueItem) {
            synchronized (this.rl) {
                try {
                    SyncQueueItem syncQueueItem2 = this.f41134n;
                    if (syncQueueItem2 == null) {
                        this.f41134n = syncQueueItem;
                        return;
                    }
                    while (true) {
                        SyncQueueItem syncQueueItem3 = syncQueueItem2.f41136n;
                        if (syncQueueItem3 == null) {
                            syncQueueItem2.f41136n = syncQueueItem;
                            return;
                        }
                        syncQueueItem2 = syncQueueItem3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static class SyncQueueItem {
        private static final Object mUb = new Object();
        private static SyncQueueItem xMQ;
        public int J2;
        public Object KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f41135O;
        public int Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        SyncQueueItem f41136n;
        public int nr;
        public int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f41137t;

        static SyncQueueItem n(int i2, int i3, int i5) {
            return rl(i2, i3, i5, 0, 0, 0, null);
        }

        static SyncQueueItem t(int i2, int i3, Object obj) {
            return rl(i2, i3, 0, 0, 0, 0, obj);
        }

        void nr() {
            this.f41136n = null;
            this.Uo = 0;
            this.J2 = 0;
            this.f41135O = 0;
            this.nr = 0;
            this.f41137t = 0;
            this.rl = 0;
            this.KN = null;
            synchronized (mUb) {
                try {
                    SyncQueueItem syncQueueItem = xMQ;
                    if (syncQueueItem != null) {
                        this.f41136n = syncQueueItem;
                    }
                    xMQ = this;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        static SyncQueueItem rl(int i2, int i3, int i5, int i7, int i8, int i9, Object obj) {
            SyncQueueItem syncQueueItem;
            synchronized (mUb) {
                try {
                    syncQueueItem = xMQ;
                    if (syncQueueItem == null) {
                        syncQueueItem = new SyncQueueItem();
                    } else {
                        xMQ = syncQueueItem.f41136n;
                        syncQueueItem.f41136n = null;
                    }
                    syncQueueItem.rl = i2;
                    syncQueueItem.f41137t = i3;
                    syncQueueItem.nr = i5;
                    syncQueueItem.f41135O = i7;
                    syncQueueItem.J2 = i8;
                    syncQueueItem.Uo = i9;
                    syncQueueItem.KN = obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return syncQueueItem;
        }

        SyncQueueItem() {
        }
    }
}
