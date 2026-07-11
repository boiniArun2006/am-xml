package androidx.media3.common;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.UnstableApi;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@UnstableApi
public class ForwardingSimpleBasePlayer extends SimpleBasePlayer {
    private Metadata lastTimedMetadata;
    private LivePositionSuppliers livePositionSuppliers;
    private int pendingDiscontinuityReason;
    private boolean pendingFirstFrameRendered;
    private long pendingPositionDiscontinuityNewPositionMs;
    private int playWhenReadyChangeReason;
    private final Player player;

    private static final class LivePositionSuppliers {
        public final SimpleBasePlayer.LivePositionSupplier bufferedPositionSupplier;
        public final SimpleBasePlayer.LivePositionSupplier contentBufferedPositionSupplier;
        public final SimpleBasePlayer.LivePositionSupplier contentPositionSupplier;
        public final SimpleBasePlayer.LivePositionSupplier currentPositionSupplier;
        public final SimpleBasePlayer.LivePositionSupplier totalBufferedPositionSupplier;

        public void disconnect(long j2, long j3) {
            this.currentPositionSupplier.disconnect(j2);
            this.bufferedPositionSupplier.disconnect(j2);
            this.contentPositionSupplier.disconnect(j3);
            this.contentBufferedPositionSupplier.disconnect(j3);
            this.totalBufferedPositionSupplier.disconnect(0L);
        }

        public LivePositionSuppliers(final Player player) {
            Objects.requireNonNull(player);
            this.currentPositionSupplier = new SimpleBasePlayer.LivePositionSupplier(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.fuX
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return player.getCurrentPosition();
                }
            });
            this.bufferedPositionSupplier = new SimpleBasePlayer.LivePositionSupplier(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.Dsr
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return player.getBufferedPosition();
                }
            });
            this.contentPositionSupplier = new SimpleBasePlayer.LivePositionSupplier(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.aC
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return player.getContentPosition();
                }
            });
            this.contentBufferedPositionSupplier = new SimpleBasePlayer.LivePositionSupplier(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.o
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return player.getContentBufferedPosition();
                }
            });
            this.totalBufferedPositionSupplier = new SimpleBasePlayer.LivePositionSupplier(new SimpleBasePlayer.PositionSupplier() { // from class: androidx.media3.common.qz
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return player.getTotalBufferedDuration();
                }
            });
        }
    }

    protected final Player getPlayer() {
        return this.player;
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected SimpleBasePlayer.State getState() {
        SimpleBasePlayer.State.Builder builder = new SimpleBasePlayer.State.Builder();
        LivePositionSuppliers livePositionSuppliers = this.livePositionSuppliers;
        if (this.player.isCommandAvailable(16)) {
            builder.setAdBufferedPositionMs(livePositionSuppliers.bufferedPositionSupplier);
            builder.setAdPositionMs(livePositionSuppliers.currentPositionSupplier);
        }
        if (this.player.isCommandAvailable(21)) {
            builder.setAudioAttributes(this.player.getAudioAttributes());
        }
        builder.setAvailableCommands(this.player.getAvailableCommands());
        if (this.player.isCommandAvailable(16)) {
            builder.setContentBufferedPositionMs(livePositionSuppliers.contentBufferedPositionSupplier);
            builder.setContentPositionMs(livePositionSuppliers.contentPositionSupplier);
            if (this.player.isCommandAvailable(17)) {
                builder.setCurrentAd(this.player.getCurrentAdGroupIndex(), this.player.getCurrentAdIndexInAdGroup());
            }
        }
        if (this.player.isCommandAvailable(28)) {
            builder.setCurrentCues(this.player.getCurrentCues());
        }
        if (this.player.isCommandAvailable(17)) {
            builder.setCurrentMediaItemIndex(this.player.getCurrentMediaItemIndex());
        }
        builder.setDeviceInfo(this.player.getDeviceInfo());
        if (this.player.isCommandAvailable(23)) {
            builder.setDeviceVolume(this.player.getDeviceVolume());
            builder.setIsDeviceMuted(this.player.isDeviceMuted());
        }
        builder.setIsLoading(this.player.isLoading());
        builder.setMaxSeekToPreviousPositionMs(this.player.getMaxSeekToPreviousPosition());
        if (this.pendingFirstFrameRendered) {
            builder.setNewlyRenderedFirstFrame(true);
            this.pendingFirstFrameRendered = false;
        }
        builder.setPlaybackParameters(this.player.getPlaybackParameters());
        builder.setPlaybackState(this.player.getPlaybackState());
        builder.setPlaybackSuppressionReason(this.player.getPlaybackSuppressionReason());
        builder.setPlayerError(this.player.getPlayerError());
        if (this.player.isCommandAvailable(17)) {
            builder.setPlaylist(this.player.getCurrentTimeline(), this.player.isCommandAvailable(30) ? this.player.getCurrentTracks() : Tracks.EMPTY, this.player.isCommandAvailable(18) ? this.player.getMediaMetadata() : null);
        }
        if (this.player.isCommandAvailable(18)) {
            builder.setPlaylistMetadata(this.player.getPlaylistMetadata());
        }
        builder.setPlayWhenReady(this.player.getPlayWhenReady(), this.playWhenReadyChangeReason);
        long j2 = this.pendingPositionDiscontinuityNewPositionMs;
        if (j2 != -9223372036854775807L) {
            builder.setPositionDiscontinuity(this.pendingDiscontinuityReason, j2);
            this.pendingPositionDiscontinuityNewPositionMs = -9223372036854775807L;
        }
        builder.setRepeatMode(this.player.getRepeatMode());
        builder.setSeekBackIncrementMs(this.player.getSeekBackIncrement());
        builder.setSeekForwardIncrementMs(this.player.getSeekForwardIncrement());
        builder.setShuffleModeEnabled(this.player.getShuffleModeEnabled());
        builder.setSurfaceSize(this.player.getSurfaceSize());
        builder.setTimedMetadata(this.lastTimedMetadata);
        if (this.player.isCommandAvailable(16)) {
            builder.setTotalBufferedDurationMs(livePositionSuppliers.totalBufferedPositionSupplier);
        }
        builder.setTrackSelectionParameters(this.player.getTrackSelectionParameters());
        builder.setVideoSize(this.player.getVideoSize());
        if (this.player.isCommandAvailable(22)) {
            builder.setVolume(this.player.getVolume());
        }
        return builder.build();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handleClearVideoOutput(@Nullable Object obj) {
        if (obj instanceof SurfaceView) {
            this.player.clearVideoSurfaceView((SurfaceView) obj);
        } else if (obj instanceof TextureView) {
            this.player.clearVideoTextureView((TextureView) obj);
        } else if (obj instanceof SurfaceHolder) {
            this.player.clearVideoSurfaceHolder((SurfaceHolder) obj);
        } else if (obj instanceof Surface) {
            this.player.clearVideoSurface((Surface) obj);
        } else {
            if (obj != null) {
                throw new IllegalStateException();
            }
            this.player.clearVideoSurface();
        }
        return com.google.common.util.concurrent.Dsr.t();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handleDecreaseDeviceVolume(int i2) {
        if (this.player.isCommandAvailable(34)) {
            this.player.decreaseDeviceVolume(i2);
        } else {
            this.player.decreaseDeviceVolume();
        }
        return com.google.common.util.concurrent.Dsr.t();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handleIncreaseDeviceVolume(int i2) {
        if (this.player.isCommandAvailable(34)) {
            this.player.increaseDeviceVolume(i2);
        } else {
            this.player.increaseDeviceVolume();
        }
        return com.google.common.util.concurrent.Dsr.t();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handleMoveMediaItems(int i2, int i3, int i5) {
        if (i3 == i2 + 1) {
            this.player.moveMediaItem(i2, i5);
        } else {
            this.player.moveMediaItems(i2, i3, i5);
        }
        return com.google.common.util.concurrent.Dsr.t();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handlePrepare() {
        this.player.prepare();
        return com.google.common.util.concurrent.Dsr.t();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handleRelease() {
        this.player.release();
        return com.google.common.util.concurrent.Dsr.t();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handleRemoveMediaItems(int i2, int i3) {
        if (i3 == i2 + 1) {
            this.player.removeMediaItem(i2);
        } else {
            this.player.removeMediaItems(i2, i3);
        }
        return com.google.common.util.concurrent.Dsr.t();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handleReplaceMediaItems(int i2, int i3, List<MediaItem> list) {
        if (i3 == i2 + 1 && list.size() == 1) {
            this.player.replaceMediaItem(i2, list.get(0));
        } else {
            this.player.replaceMediaItems(i2, i3, list);
        }
        return com.google.common.util.concurrent.Dsr.t();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handleSetAudioAttributes(AudioAttributes audioAttributes, boolean z2) {
        this.player.setAudioAttributes(audioAttributes, z2);
        return com.google.common.util.concurrent.Dsr.t();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handleSetDeviceMuted(boolean z2, int i2) {
        if (this.player.isCommandAvailable(34)) {
            this.player.setDeviceMuted(z2, i2);
        } else {
            this.player.setDeviceMuted(z2);
        }
        return com.google.common.util.concurrent.Dsr.t();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handleSetDeviceVolume(int i2, int i3) {
        if (this.player.isCommandAvailable(33)) {
            this.player.setDeviceVolume(i2, i3);
        } else {
            this.player.setDeviceVolume(i2);
        }
        return com.google.common.util.concurrent.Dsr.t();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handleSetPlayWhenReady(boolean z2) {
        this.player.setPlayWhenReady(z2);
        return com.google.common.util.concurrent.Dsr.t();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handleSetPlaybackParameters(PlaybackParameters playbackParameters) {
        this.player.setPlaybackParameters(playbackParameters);
        return com.google.common.util.concurrent.Dsr.t();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handleSetPlaylistMetadata(MediaMetadata mediaMetadata) {
        this.player.setPlaylistMetadata(mediaMetadata);
        return com.google.common.util.concurrent.Dsr.t();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handleSetRepeatMode(int i2) {
        this.player.setRepeatMode(i2);
        return com.google.common.util.concurrent.Dsr.t();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handleSetShuffleModeEnabled(boolean z2) {
        this.player.setShuffleModeEnabled(z2);
        return com.google.common.util.concurrent.Dsr.t();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handleSetTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        this.player.setTrackSelectionParameters(trackSelectionParameters);
        return com.google.common.util.concurrent.Dsr.t();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handleSetVideoOutput(Object obj) {
        if (obj instanceof SurfaceView) {
            this.player.setVideoSurfaceView((SurfaceView) obj);
        } else if (obj instanceof TextureView) {
            this.player.setVideoTextureView((TextureView) obj);
        } else if (obj instanceof SurfaceHolder) {
            this.player.setVideoSurfaceHolder((SurfaceHolder) obj);
        } else {
            if (!(obj instanceof Surface)) {
                throw new IllegalStateException();
            }
            this.player.setVideoSurface((Surface) obj);
        }
        return com.google.common.util.concurrent.Dsr.t();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handleSetVolume(float f3) {
        this.player.setVolume(f3);
        return com.google.common.util.concurrent.Dsr.t();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handleStop() {
        this.player.stop();
        return com.google.common.util.concurrent.Dsr.t();
    }

    public ForwardingSimpleBasePlayer(final Player player) {
        super(player.getApplicationLooper());
        this.player = player;
        this.lastTimedMetadata = new Metadata(-9223372036854775807L, new Metadata.Entry[0]);
        this.playWhenReadyChangeReason = 1;
        this.pendingDiscontinuityReason = 5;
        this.livePositionSuppliers = new LivePositionSuppliers(player);
        player.addListener(new Player.Listener() { // from class: androidx.media3.common.ForwardingSimpleBasePlayer.1
            @Override // androidx.media3.common.Player.Listener
            public void onEvents(Player player2, Player.Events events) {
                ForwardingSimpleBasePlayer.this.invalidateState();
            }

            @Override // androidx.media3.common.Player.Listener
            public void onMetadata(Metadata metadata) {
                ForwardingSimpleBasePlayer.this.lastTimedMetadata = metadata;
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlayWhenReadyChanged(boolean z2, int i2) {
                ForwardingSimpleBasePlayer.this.playWhenReadyChangeReason = i2;
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
                ForwardingSimpleBasePlayer.this.pendingDiscontinuityReason = i2;
                ForwardingSimpleBasePlayer.this.pendingPositionDiscontinuityNewPositionMs = positionInfo2.positionMs;
                ForwardingSimpleBasePlayer.this.livePositionSuppliers.disconnect(positionInfo.positionMs, positionInfo.contentPositionMs);
                ForwardingSimpleBasePlayer.this.livePositionSuppliers = new LivePositionSuppliers(player);
            }

            @Override // androidx.media3.common.Player.Listener
            public void onRenderedFirstFrame() {
                ForwardingSimpleBasePlayer.this.pendingFirstFrameRendered = true;
            }
        });
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handleAddMediaItems(int i2, List<MediaItem> list) {
        if (list.size() == 1) {
            this.player.addMediaItem(i2, list.get(0));
        } else {
            this.player.addMediaItems(i2, list);
        }
        return com.google.common.util.concurrent.Dsr.t();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handleSeek(int i2, long j2, int i3) {
        switch (i3) {
            case 4:
                this.player.seekToDefaultPosition();
                break;
            case 5:
                this.player.seekTo(j2);
                break;
            case 6:
                this.player.seekToPreviousMediaItem();
                break;
            case 7:
                this.player.seekToPrevious();
                break;
            case 8:
                this.player.seekToNextMediaItem();
                break;
            case 9:
                this.player.seekToNext();
                break;
            case 10:
                if (i2 != -1) {
                    this.player.seekTo(i2, j2);
                }
                break;
            case 11:
                this.player.seekBack();
                break;
            case 12:
                this.player.seekForward();
                break;
            default:
                throw new IllegalStateException();
        }
        return com.google.common.util.concurrent.Dsr.t();
    }

    @Override // androidx.media3.common.SimpleBasePlayer
    protected com.google.common.util.concurrent.Xo handleSetMediaItems(List<MediaItem> list, int i2, long j2) {
        boolean z2 = true;
        if (list.size() != 1 || !this.player.isCommandAvailable(31)) {
            z2 = false;
        }
        if (i2 == -1) {
            if (z2) {
                this.player.setMediaItem(list.get(0));
            } else {
                this.player.setMediaItems(list);
            }
        } else if (z2) {
            this.player.setMediaItem(list.get(0), j2);
        } else {
            this.player.setMediaItems(list, i2, j2);
        }
        return com.google.common.util.concurrent.Dsr.t();
    }
}
