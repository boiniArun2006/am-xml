package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.util.HandlerWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class I28 implements HandlerWrapper {
    private static final List rl = new ArrayList(50);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Handler f58470n;

    private static final class n implements HandlerWrapper.Message {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Message f58471n;
        private I28 rl;

        private n() {
        }

        private void n() {
            this.f58471n = null;
            this.rl = null;
            I28.t(this);
        }

        @Override // com.google.android.exoplayer2.util.HandlerWrapper.Message
        public HandlerWrapper getTarget() {
            return (HandlerWrapper) Assertions.checkNotNull(this.rl);
        }

        public boolean rl(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) Assertions.checkNotNull(this.f58471n));
            n();
            return zSendMessageAtFrontOfQueue;
        }

        @Override // com.google.android.exoplayer2.util.HandlerWrapper.Message
        public void sendToTarget() {
            ((Message) Assertions.checkNotNull(this.f58471n)).sendToTarget();
            n();
        }

        public n t(Message message, I28 i28) {
            this.f58471n = message;
            this.rl = i28;
            return this;
        }
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i2) {
        return rl().t(this.f58470n.obtainMessage(i2), this);
    }

    private static n rl() {
        n nVar;
        List list = rl;
        synchronized (list) {
            try {
                nVar = list.isEmpty() ? new n() : (n) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(n nVar) {
        List list = rl;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(nVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public Looper getLooper() {
        return this.f58470n.getLooper();
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean hasMessages(int i2) {
        return this.f58470n.hasMessages(i2);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i2, Object obj) {
        return rl().t(this.f58470n.obtainMessage(i2, obj), this);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean post(Runnable runnable) {
        return this.f58470n.post(runnable);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean postAtFrontOfQueue(Runnable runnable) {
        return this.f58470n.postAtFrontOfQueue(runnable);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean postDelayed(Runnable runnable, long j2) {
        return this.f58470n.postDelayed(runnable, j2);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public void removeCallbacksAndMessages(Object obj) {
        this.f58470n.removeCallbacksAndMessages(obj);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public void removeMessages(int i2) {
        this.f58470n.removeMessages(i2);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean sendEmptyMessage(int i2) {
        return this.f58470n.sendEmptyMessage(i2);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean sendEmptyMessageAtTime(int i2, long j2) {
        return this.f58470n.sendEmptyMessageAtTime(i2, j2);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean sendEmptyMessageDelayed(int i2, int i3) {
        return this.f58470n.sendEmptyMessageDelayed(i2, i3);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean sendMessageAtFrontOfQueue(HandlerWrapper.Message message) {
        return ((n) message).rl(this.f58470n);
    }

    public I28(Handler handler) {
        this.f58470n = handler;
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i2, int i3, int i5) {
        return rl().t(this.f58470n.obtainMessage(i2, i3, i5), this);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i2, int i3, int i5, Object obj) {
        return rl().t(this.f58470n.obtainMessage(i2, i3, i5, obj), this);
    }
}
