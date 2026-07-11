package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.StreamVolumeManager;
import com.pairip.VMRunner;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class StreamVolumeManager {
    private static final String TAG = "StreamVolumeManager";
    private static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    private final Context applicationContext;
    private AudioManager audioManager;
    private final Listener listener;

    @Nullable
    private VolumeChangeReceiver receiver;
    private final BackgroundThreadStateHandler<StreamVolumeState> stateHandler;
    private int volumeBeforeMute;

    public interface Listener {
        void onStreamTypeChanged(int i2);

        void onStreamVolumeChanged(int i2, boolean z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    final class VolumeChangeReceiver extends BroadcastReceiver {
        private VolumeChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VMRunner.invoke("yDWdUMkPENun4h4r", new Object[]{this, context, intent});
        }

        public static /* synthetic */ void n(VolumeChangeReceiver volumeChangeReceiver) {
            if (StreamVolumeManager.this.receiver == null) {
                return;
            }
            StreamVolumeManager.this.stateHandler.setStateInBackground(StreamVolumeManager.this.generateState(((StreamVolumeState) StreamVolumeManager.this.stateHandler.get()).streamType));
        }
    }

    public static /* synthetic */ StreamVolumeState t(StreamVolumeState streamVolumeState) {
        return streamVolumeState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class StreamVolumeState {
        public final int maxVolume;
        public final int minVolume;
        public final boolean muted;
        public final int streamType;
        public final int volume;

        public StreamVolumeState(int i2, int i3, boolean z2, int i5, int i7) {
            this.streamType = i2;
            this.volume = i3;
            this.muted = z2;
            this.minVolume = i5;
            this.maxVolume = i7;
        }
    }

    public static /* synthetic */ StreamVolumeState O(StreamVolumeState streamVolumeState) {
        int i2 = streamVolumeState.streamType;
        int i3 = streamVolumeState.volume;
        int i5 = streamVolumeState.minVolume;
        return new StreamVolumeState(i2, i3 > i5 ? i3 - 1 : i5, i3 <= 1, i5, streamVolumeState.maxVolume);
    }

    public static /* synthetic */ void az(StreamVolumeManager streamVolumeManager, int i2) {
        streamVolumeManager.audioManager = (AudioManager) Assertions.checkStateNotNull((AudioManager) streamVolumeManager.applicationContext.getSystemService("audio"));
        VolumeChangeReceiver volumeChangeReceiver = new VolumeChangeReceiver();
        try {
            streamVolumeManager.applicationContext.registerReceiver(volumeChangeReceiver, new IntentFilter(VOLUME_CHANGED_ACTION));
            streamVolumeManager.receiver = volumeChangeReceiver;
        } catch (RuntimeException e2) {
            Log.w(TAG, "Error registering stream volume receiver", e2);
        }
        streamVolumeManager.stateHandler.setStateInBackground(streamVolumeManager.generateState(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public StreamVolumeState generateState(int i2) {
        Assertions.checkNotNull(this.audioManager);
        return new StreamVolumeState(i2, AudioManagerCompat.getStreamVolume(this.audioManager, i2), AudioManagerCompat.isStreamMute(this.audioManager, i2), AudioManagerCompat.getStreamMinVolume(this.audioManager, i2), AudioManagerCompat.getStreamMaxVolume(this.audioManager, i2));
    }

    public static /* synthetic */ StreamVolumeState nr(int i2, StreamVolumeState streamVolumeState) {
        int i3 = streamVolumeState.streamType;
        int i5 = streamVolumeState.minVolume;
        return new StreamVolumeState(i3, (i2 < i5 || i2 > streamVolumeState.maxVolume) ? streamVolumeState.volume : i2, i2 == 0, i5, streamVolumeState.maxVolume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStreamVolumeStateChanged(StreamVolumeState streamVolumeState, StreamVolumeState streamVolumeState2) {
        boolean z2 = streamVolumeState.muted;
        if (!z2 && streamVolumeState2.muted) {
            this.volumeBeforeMute = streamVolumeState.volume;
        }
        int i2 = streamVolumeState.volume;
        int i3 = streamVolumeState2.volume;
        if (i2 != i3 || z2 != streamVolumeState2.muted) {
            this.listener.onStreamVolumeChanged(i3, streamVolumeState2.muted);
        }
        int i5 = streamVolumeState.streamType;
        int i7 = streamVolumeState2.streamType;
        if (i5 == i7 && streamVolumeState.minVolume == streamVolumeState2.minVolume && streamVolumeState.maxVolume == streamVolumeState2.maxVolume) {
            return;
        }
        this.listener.onStreamTypeChanged(i7);
    }

    public static /* synthetic */ StreamVolumeState rl(int i2, StreamVolumeState streamVolumeState) {
        return new StreamVolumeState(i2, streamVolumeState.volume, streamVolumeState.muted, streamVolumeState.minVolume, streamVolumeState.maxVolume);
    }

    public static /* synthetic */ StreamVolumeState ty(StreamVolumeState streamVolumeState) {
        int i2 = streamVolumeState.streamType;
        int i3 = streamVolumeState.volume;
        int i5 = streamVolumeState.maxVolume;
        return new StreamVolumeState(i2, i3 < i5 ? i3 + 1 : i5, false, streamVolumeState.minVolume, i5);
    }

    public static /* synthetic */ StreamVolumeState xMQ(StreamVolumeManager streamVolumeManager, StreamVolumeState streamVolumeState) {
        VolumeChangeReceiver volumeChangeReceiver = streamVolumeManager.receiver;
        if (volumeChangeReceiver != null) {
            try {
                streamVolumeManager.applicationContext.unregisterReceiver(volumeChangeReceiver);
            } catch (RuntimeException e2) {
                Log.w(TAG, "Error unregistering stream volume receiver", e2);
            }
            streamVolumeManager.receiver = null;
        }
        return streamVolumeState;
    }

    public void decreaseVolume(final int i2) {
        this.stateHandler.updateStateAsync(new t1.CN3() { // from class: androidx.media3.exoplayer.rfW
            @Override // t1.CN3
            public final Object apply(Object obj) {
                return StreamVolumeManager.O((StreamVolumeManager.StreamVolumeState) obj);
            }
        }, new t1.CN3() { // from class: androidx.media3.exoplayer.tmw
            @Override // t1.CN3
            public final Object apply(Object obj) {
                return StreamVolumeManager.J2(this.f39802n, i2, (StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }

    public int getMaxVolume() {
        return this.stateHandler.get().maxVolume;
    }

    public int getMinVolume() {
        return this.stateHandler.get().minVolume;
    }

    public int getVolume() {
        return this.stateHandler.get().volume;
    }

    public void increaseVolume(final int i2) {
        this.stateHandler.updateStateAsync(new t1.CN3() { // from class: androidx.media3.exoplayer.DT
            @Override // t1.CN3
            public final Object apply(Object obj) {
                return StreamVolumeManager.ty((StreamVolumeManager.StreamVolumeState) obj);
            }
        }, new t1.CN3() { // from class: androidx.media3.exoplayer.Sw
            @Override // t1.CN3
            public final Object apply(Object obj) {
                return StreamVolumeManager.gh(this.f39407n, i2, (StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }

    public boolean isMuted() {
        return this.stateHandler.get().muted;
    }

    public void release() {
        this.stateHandler.updateStateAsync(new t1.CN3() { // from class: androidx.media3.exoplayer.zpl
            @Override // t1.CN3
            public final Object apply(Object obj) {
                return StreamVolumeManager.t((StreamVolumeManager.StreamVolumeState) obj);
            }
        }, new t1.CN3() { // from class: androidx.media3.exoplayer.ibE
            @Override // t1.CN3
            public final Object apply(Object obj) {
                return StreamVolumeManager.xMQ(this.f39651n, (StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }

    public void setMuted(final boolean z2, final int i2) {
        this.stateHandler.updateStateAsync(new t1.CN3() { // from class: androidx.media3.exoplayer.l
            @Override // t1.CN3
            public final Object apply(Object obj) {
                return StreamVolumeManager.n(this.f39657n, z2, (StreamVolumeManager.StreamVolumeState) obj);
            }
        }, new t1.CN3() { // from class: androidx.media3.exoplayer.xTb
            @Override // t1.CN3
            public final Object apply(Object obj) {
                return StreamVolumeManager.mUb(this.f39873n, z2, i2, (StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }

    public void setStreamType(final int i2) {
        this.stateHandler.updateStateAsync(new t1.CN3() { // from class: androidx.media3.exoplayer.ys8
            @Override // t1.CN3
            public final Object apply(Object obj) {
                return StreamVolumeManager.rl(i2, (StreamVolumeManager.StreamVolumeState) obj);
            }
        }, new t1.CN3() { // from class: androidx.media3.exoplayer.jL
            @Override // t1.CN3
            public final Object apply(Object obj) {
                return StreamVolumeManager.KN(this.f39654n, i2, (StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }

    public void setVolume(final int i2, final int i3) {
        this.stateHandler.updateStateAsync(new t1.CN3() { // from class: androidx.media3.exoplayer.tpM
            @Override // t1.CN3
            public final Object apply(Object obj) {
                return StreamVolumeManager.nr(i2, (StreamVolumeManager.StreamVolumeState) obj);
            }
        }, new t1.CN3() { // from class: androidx.media3.exoplayer.oJ
            @Override // t1.CN3
            public final Object apply(Object obj) {
                return StreamVolumeManager.Uo(this.f39681n, i2, i3, (StreamVolumeManager.StreamVolumeState) obj);
            }
        });
    }

    public StreamVolumeManager(Context context, Listener listener, final int i2, Looper looper, Looper looper2, Clock clock) {
        this.applicationContext = context.getApplicationContext();
        this.listener = listener;
        BackgroundThreadStateHandler<StreamVolumeState> backgroundThreadStateHandler = new BackgroundThreadStateHandler<>(new StreamVolumeState(i2, 0, false, 0, 0), looper, looper2, clock, new BackgroundThreadStateHandler.StateChangeListener() { // from class: androidx.media3.exoplayer.IE
            @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
            public final void onStateChanged(Object obj, Object obj2) {
                this.f39372n.onStreamVolumeStateChanged((StreamVolumeManager.StreamVolumeState) obj, (StreamVolumeManager.StreamVolumeState) obj2);
            }
        });
        this.stateHandler = backgroundThreadStateHandler;
        backgroundThreadStateHandler.runInBackground(new Runnable() { // from class: androidx.media3.exoplayer.xq
            @Override // java.lang.Runnable
            public final void run() {
                StreamVolumeManager.az(this.f39876n, i2);
            }
        });
    }

    public static /* synthetic */ StreamVolumeState J2(StreamVolumeManager streamVolumeManager, int i2, StreamVolumeState streamVolumeState) {
        streamVolumeManager.getClass();
        if (streamVolumeState.volume <= streamVolumeState.minVolume) {
            return streamVolumeState;
        }
        ((AudioManager) Assertions.checkNotNull(streamVolumeManager.audioManager)).adjustStreamVolume(streamVolumeState.streamType, -1, i2);
        return streamVolumeManager.generateState(streamVolumeState.streamType);
    }

    public static /* synthetic */ StreamVolumeState KN(StreamVolumeManager streamVolumeManager, int i2, StreamVolumeState streamVolumeState) {
        streamVolumeManager.getClass();
        if (streamVolumeState.streamType == i2) {
            return streamVolumeState;
        }
        return streamVolumeManager.generateState(i2);
    }

    public static /* synthetic */ StreamVolumeState Uo(StreamVolumeManager streamVolumeManager, int i2, int i3, StreamVolumeState streamVolumeState) {
        streamVolumeManager.getClass();
        if (i2 != streamVolumeState.volume && i2 >= streamVolumeState.minVolume && i2 <= streamVolumeState.maxVolume) {
            ((AudioManager) Assertions.checkNotNull(streamVolumeManager.audioManager)).setStreamVolume(streamVolumeState.streamType, i2, i3);
            return streamVolumeManager.generateState(streamVolumeState.streamType);
        }
        return streamVolumeState;
    }

    public static /* synthetic */ StreamVolumeState gh(StreamVolumeManager streamVolumeManager, int i2, StreamVolumeState streamVolumeState) {
        streamVolumeManager.getClass();
        if (streamVolumeState.volume >= streamVolumeState.maxVolume) {
            return streamVolumeState;
        }
        ((AudioManager) Assertions.checkNotNull(streamVolumeManager.audioManager)).adjustStreamVolume(streamVolumeState.streamType, 1, i2);
        return streamVolumeManager.generateState(streamVolumeState.streamType);
    }

    public static /* synthetic */ StreamVolumeState mUb(StreamVolumeManager streamVolumeManager, boolean z2, int i2, StreamVolumeState streamVolumeState) {
        int i3;
        streamVolumeManager.getClass();
        if (streamVolumeState.muted == z2) {
            return streamVolumeState;
        }
        Assertions.checkNotNull(streamVolumeManager.audioManager);
        if (Util.SDK_INT >= 23) {
            AudioManager audioManager = streamVolumeManager.audioManager;
            int i5 = streamVolumeState.streamType;
            if (z2) {
                i3 = -100;
            } else {
                i3 = 100;
            }
            audioManager.adjustStreamVolume(i5, i3, i2);
        } else {
            streamVolumeManager.audioManager.setStreamMute(streamVolumeState.streamType, z2);
        }
        return streamVolumeManager.generateState(streamVolumeState.streamType);
    }

    public static /* synthetic */ StreamVolumeState n(StreamVolumeManager streamVolumeManager, boolean z2, StreamVolumeState streamVolumeState) {
        int i2;
        streamVolumeManager.getClass();
        int i3 = streamVolumeState.streamType;
        if (streamVolumeState.muted == z2) {
            i2 = streamVolumeState.volume;
        } else if (z2) {
            i2 = 0;
        } else {
            i2 = streamVolumeManager.volumeBeforeMute;
        }
        return new StreamVolumeState(i3, i2, z2, streamVolumeState.minVolume, streamVolumeState.maxVolume);
    }
}
