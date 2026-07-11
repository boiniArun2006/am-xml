package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface BandwidthMeter {

    public interface EventListener {

        public static final class EventDispatcher {
            private final CopyOnWriteArrayList<j> listeners = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            static final class j {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private final Handler f58418n;
                private final EventListener rl;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                private boolean f58419t;

                public void nr() {
                    this.f58419t = true;
                }

                public j(Handler handler, EventListener eventListener) {
                    this.f58418n = handler;
                    this.rl = eventListener;
                }
            }

            public void bandwidthSample(int i2, long j2, long j3) {
                final int i3;
                final long j4;
                final long j5;
                for (final j jVar : this.listeners) {
                    if (jVar.f58419t) {
                        i3 = i2;
                        j4 = j2;
                        j5 = j3;
                    } else {
                        i3 = i2;
                        j4 = j2;
                        j5 = j3;
                        jVar.f58418n.post(new Runnable() { // from class: com.google.android.exoplayer2.upstream.j
                            @Override // java.lang.Runnable
                            public final void run() {
                                jVar.rl.onBandwidthSample(i3, j4, j5);
                            }
                        });
                    }
                    i2 = i3;
                    j2 = j4;
                    j3 = j5;
                }
            }

            public void removeListener(EventListener eventListener) {
                for (j jVar : this.listeners) {
                    if (jVar.rl == eventListener) {
                        jVar.nr();
                        this.listeners.remove(jVar);
                    }
                }
            }

            public void addListener(Handler handler, EventListener eventListener) {
                Assertions.checkNotNull(handler);
                Assertions.checkNotNull(eventListener);
                removeListener(eventListener);
                this.listeners.add(new j(handler, eventListener));
            }
        }

        void onBandwidthSample(int i2, long j2, long j3);
    }

    void addEventListener(Handler handler, EventListener eventListener);

    long getBitrateEstimate();

    default long getTimeToFirstByteEstimateUs() {
        return -9223372036854775807L;
    }

    @Nullable
    TransferListener getTransferListener();

    void removeEventListener(EventListener eventListener);
}
