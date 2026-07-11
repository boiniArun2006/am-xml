package com.safedk.android.analytics.brandsafety.creatives;

import aT.dE.JLZo;
import android.net.Uri;
import android.view.View;
import androidx.media3.common.MediaItem;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.video.VideoSize;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.o;
import com.safedk.android.utils.Logger;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import mfo.CLVG.aNrWBQYwFf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class VideoEventsManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f62049a = "VideoEventsManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Map<String, View> f62050b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Map<String, String> f62051c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Map<String, Player.Listener> f62052d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final Map<String, Boolean> f62053e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set<String> f62054f = new HashSet(Arrays.asList("android.view.TextureView", "android.view.SurfaceView", "android.view.Surface", "com.yandex.div.core.player.DivPlayerView", "yads.r52"));

    public static void onPlayerPlay(String sdkPackageName, Object player, String originatedBy) {
        try {
            if (SafeDK.ad()) {
                View view = null;
                Logger.d(f62049a, "onExoPlayerPlay started, sdk : ", sdkPackageName, " , player : ", player, ", originatedBy = ", originatedBy, ", isExoPlayer2Player ? ", Boolean.valueOf(b(player)), ", isExoPlayer2PlayerView ? ", Boolean.valueOf(e(player)));
                if (!b(player) && !e(player) && !c(player)) {
                    if (a(player) || c(player)) {
                        b(sdkPackageName, player, true);
                        return;
                    }
                    return;
                }
                if (e(player)) {
                    Logger.d(f62049a, "onExoPlayerPlay styledPlayerView MediaItems : ", Integer.valueOf(((StyledPlayerView) player).getPlayer().getMediaItemCount()));
                    view = (View) player;
                } else if (b(player)) {
                    if (!f62050b.containsKey(BrandSafetyUtils.a(player))) {
                        Logger.d(f62049a, "onExoPlayerPlay styledPlayerView cannot find view");
                    } else {
                        view = f62050b.get(BrandSafetyUtils.a(player));
                    }
                } else if (d(player) || c(player)) {
                    b(sdkPackageName, player, true);
                }
                Logger.d(f62049a, "onExoPlayerPlay styledPlayerView view is  : ", view);
            }
        } catch (Throwable th) {
            Logger.d(f62049a, "Exception in onExoPlayerPlay : ", th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, Player player, View view) {
        Uri uriA = a(player);
        Logger.d(f62049a, "attempt to match ad, sdkPackageName : ", str, ", exoplayer 2 player obj : ", player, " uri is ", uriA);
        if (uriA != null) {
            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(str);
            if (adNetworkDiscoveryJ != null) {
                CreativeInfo creativeInfoA = adNetworkDiscoveryJ.a(uriA);
                if (creativeInfoA != null && view != null) {
                    creativeInfoA.b(BrandSafetyUtils.a(view), view.getClass().getName());
                    creativeInfoA.u(CreativeInfo.f62447k);
                    o oVar = new o(creativeInfoA, CreativeInfo.f62447k, null, uriA.toString());
                    SafeDK.getInstance().z().a(oVar);
                    Logger.d(f62049a, Logger.FeatureTag.CI_MATCHING, "attempt to match ad, CI set , matchingInfo : ", oVar);
                    return;
                }
                return;
            }
            Logger.d(f62049a, "attempt to match ad, no discovery class found for ", str);
            return;
        }
        Logger.d(f62049a, "attempt to match ad, Uri is null. skipping");
    }

    public static void a(String str, Object obj, Object obj2, String str2) {
        MediaItem mediaItem;
        try {
            if (SafeDK.ad()) {
                Logger.d(f62049a, "onPlayerSetMediaItem started, sdk : ", str, ",player : ", obj, ", mediaItem : ", obj2, ", originatedBy : ", str2);
                String string = null;
                if (obj2.getClass().getCanonicalName().equals("com.google.android.exoplayer2.MediaItem")) {
                    com.google.android.exoplayer2.MediaItem mediaItem2 = (com.google.android.exoplayer2.MediaItem) obj2;
                    if (mediaItem2 != null && mediaItem2.localConfiguration != null && mediaItem2.localConfiguration.uri != null) {
                        string = mediaItem2.localConfiguration.uri.toString();
                    }
                } else if (obj2.getClass().getCanonicalName().equals("androidx.media3.common.MediaItem") && (mediaItem = (MediaItem) obj2) != null && mediaItem.localConfiguration != null) {
                    string = mediaItem.localConfiguration.uri.toString();
                }
                Logger.d(f62049a, "onPlayerSetMediaItem  mediaItem uri : ", string);
                synchronized (f62051c) {
                    f62051c.put(BrandSafetyUtils.a(obj), string);
                }
            }
        } catch (Throwable th) {
            Logger.d(f62049a, "Exception in onPlayerSetMediaItem : ", th.getMessage(), th);
        }
    }

    public static void onPlayerStop(String sdkPackageName, Object player, String originatedBy) {
        if (SafeDK.ad()) {
            Logger.d(f62049a, "onExoPlayerStop started, sdk : ", sdkPackageName, ",player : ", player);
            b(sdkPackageName, player, false);
        }
    }

    public static void a(String str, Object obj, View view, String str2) {
        if (SafeDK.ad()) {
            Logger.d(f62049a, "onExoPlayerSetPlayer started, sdk : ", str, ",player : ", obj, ", view : ", view, ", viewToPlayerMap : ", f62050b);
            if (obj == null) {
                String strA = a(view);
                SafeDK.getInstance().z().a(str, BrandSafetyUtils.a(view), true, f62049a);
                Logger.d(f62049a, "ExoPlayer2Listener onIsPlayingChanged videoCompleted triggered , value = true");
                a(strA);
                return;
            }
            synchronized (f62050b) {
                f62050b.put(BrandSafetyUtils.a(obj), view);
            }
            if (b(obj)) {
                Player player = (Player) obj;
                ExoPlayer2Listener exoPlayer2Listener = new ExoPlayer2Listener(str, player);
                player.addListener(exoPlayer2Listener);
                a(player, exoPlayer2Listener);
            }
        }
    }

    private static void a(Player player, Player.Listener listener) {
        if (!f62052d.containsValue(listener)) {
            synchronized (f62052d) {
                f62052d.put(BrandSafetyUtils.a(player), listener);
            }
            Logger.d(f62049a, "storePlayerListener added a listener");
        }
    }

    private static String a(Player.Listener listener) {
        if (f62052d.containsValue(listener)) {
            synchronized (f62052d) {
                for (Map.Entry<String, Player.Listener> entry : f62052d.entrySet()) {
                    if (entry.getValue().equals(listener)) {
                        return entry.getKey();
                    }
                }
                return null;
            }
        }
        return null;
    }

    private static String a(View view) {
        if (f62050b.containsValue(view)) {
            synchronized (f62050b) {
                for (Map.Entry<String, View> entry : f62050b.entrySet()) {
                    if (entry.getValue().equals(view)) {
                        return entry.getKey();
                    }
                }
                return null;
            }
        }
        return null;
    }

    private static boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.getClass().getCanonicalName().startsWith("androidx.media3.exoplayer.ExoPlayer");
    }

    private static boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Class.forName("com.google.android.exoplayer2.ExoPlayer", false, obj.getClass().getClassLoader()).isInstance(obj);
        } catch (ClassNotFoundException e2) {
            return false;
        }
    }

    private static boolean c(Object obj) {
        if (obj == null) {
            return false;
        }
        return a.a(obj);
    }

    private static boolean d(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Class.forName("androidx.media3.common.Player", false, obj.getClass().getClassLoader()).isInstance(obj);
        } catch (ClassNotFoundException e2) {
            return false;
        }
    }

    private static boolean e(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Class.forName("com.google.android.exoplayer2.ui.StyledPlayerView", false, obj.getClass().getClassLoader()).isInstance(obj);
        } catch (ClassNotFoundException e2) {
            return false;
        }
    }

    public static Uri a(Player player) {
        Uri uri;
        Logger.d(f62049a, "getCurrentlyPlayingUri started , playerOrView : ", player);
        com.google.android.exoplayer2.MediaItem currentMediaItem = player.getCurrentMediaItem();
        if (currentMediaItem != null) {
            MediaItem.LocalConfiguration localConfiguration = currentMediaItem.localConfiguration;
            if (localConfiguration != null) {
                uri = localConfiguration.uri;
            } else if (currentMediaItem.playbackProperties == null) {
                uri = null;
            } else {
                uri = currentMediaItem.playbackProperties.uri;
            }
            Logger.d(f62049a, "getCurrentlyPlayingUri , uri found : ", uri);
            if (uri != null || uri.toString().length() > 5) {
                return uri;
            }
        }
        return null;
    }

    public static void a(String str) {
        Logger.d(f62049a, "clearRefs started, playerAddress = ", str);
        synchronized (f62050b) {
            f62050b.remove(str);
        }
        synchronized (f62051c) {
            f62051c.remove(str);
        }
        synchronized (f62052d) {
            f62052d.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, Object obj, boolean z2) {
        boolean z3;
        if (str.equals(com.safedk.android.utils.h.f63185y) && !z2) {
            Logger.d(f62049a, "onPlayStatusChanged yandex. Skipping.");
            return;
        }
        String strA = BrandSafetyUtils.a(obj);
        if (f62053e.containsKey(strA) && z2 == f62053e.get(strA).booleanValue()) {
            z3 = false;
        } else {
            synchronized (f62053e) {
                f62053e.put(strA, Boolean.valueOf(z2));
            }
            Logger.d(f62049a, "onPlayStatusChanged player added to playerPlayState, playerAddress : ", strA);
            z3 = true;
        }
        String strA2 = BrandSafetyUtils.a(f62050b.get(strA));
        if (z3) {
            if (!SafeDK.getInstance().z().a(str, strA2, !z2, f62049a)) {
                SafeDK.getInstance().B().a(str, strA2, !z2, f62049a);
            }
            Logger.d(f62049a, "onPlayStatusChanged videoCompleted invoked, isVideoCompleted = ", Boolean.valueOf(!z2));
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    public static class ExoPlayer2Listener implements Player.Listener {
        private Player player;
        private String sdkPackageName;

        public ExoPlayer2Listener(String sdkPackageName, Player player) {
            this.sdkPackageName = null;
            this.player = null;
            this.sdkPackageName = sdkPackageName;
            this.player = player;
        }

        private ExoPlayer2Listener() {
            this.sdkPackageName = null;
            this.player = null;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            Logger.d(VideoEventsManager.f62049a, "ExoPlayer2Listener onEvents started, player :  ", player, ", events : ", eventsToString(events));
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onAudioSessionIdChanged(int audioSessionId) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onAvailableCommandsChanged(Player.Commands availableCommands) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onCues(CueGroup cueGroup) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onCues(List<Cue> cues) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onDeviceVolumeChanged(int volume, boolean muted) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onIsLoadingChanged(boolean isLoading) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onLoadingChanged(boolean isLoading) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onMaxSeekToPreviousPositionChanged(long maxSeekToPreviousPositionMs) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackSuppressionReasonChanged(int playbackSuppressionReason) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPositionDiscontinuity(Player.PositionInfo oldPosition, Player.PositionInfo newPosition, int reason) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPositionDiscontinuity(int reason) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onRenderedFirstFrame() {
            Logger.d(VideoEventsManager.f62049a, "ExoPlayer2Listener onRenderedFirstFrame started");
            VideoEventsManager.b(this.sdkPackageName, this.player, VideoEventsManager.f62050b.get(BrandSafetyUtils.a(this.player)));
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onRepeatModeChanged(int repeatMode) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onSeekBackIncrementChanged(long seekBackIncrementMs) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onSeekForwardIncrementChanged(long seekForwardIncrementMs) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onShuffleModeEnabledChanged(boolean shuffleModeEnabled) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onSkipSilenceEnabledChanged(boolean skipSilenceEnabled) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onSurfaceSizeChanged(int width, int height) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onTimelineChanged(Timeline timeline, int reason) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onTrackSelectionParametersChanged(TrackSelectionParameters parameters) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onVideoSizeChanged(VideoSize videoSize) {
            Logger.d(VideoEventsManager.f62049a, "onVideoSizeChanged started, videoSize : ", Integer.valueOf(videoSize.height), " , ", Integer.valueOf(videoSize.width));
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onVolumeChanged(float volume) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onIsPlayingChanged(boolean isPlaying) {
            Logger.d(VideoEventsManager.f62049a, "ExoPlayer2Listener onIsPlayingChanged started, isPlaying :  ", Boolean.valueOf(isPlaying));
            VideoEventsManager.b(this.sdkPackageName, this.player, isPlaying);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onMediaItemTransition(com.google.android.exoplayer2.MediaItem mediaItem, int reason) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onMetadata(Metadata metadata) {
            Logger.d(aNrWBQYwFf.HHhMdfMdG, "ExoPlayer2Listener onMetadata started, metadata :  ", metadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int playbackState) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerError(PlaybackException error) {
            String str = JLZo.udi;
            Logger.d(VideoEventsManager.f62049a, "ExoPlayer2Listener onPlayerError started, error :  ", Integer.valueOf(error.errorCode), str, error.getErrorCodeName(), str, error.getMessage(), error.getCause());
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerErrorChanged(PlaybackException error) {
            Logger.d(VideoEventsManager.f62049a, "ExoPlayer2Listener onPlayerErrorChanged started, error :  ", Integer.valueOf(error.errorCode), " , ", error.getErrorCodeName(), " , ", error.getMessage(), error.getCause());
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayWhenReadyChanged(boolean playWhenReady, int reason) {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onTracksChanged(Tracks tracks) {
            Logger.d(VideoEventsManager.f62049a, "ExoPlayer2Listener onTracksChanged started, tracks :  ", tracks);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onSeekProcessed() {
        }

        public static String eventsToString(Player.Events events) {
            if (events == null) {
                return V8ValueNull.NULL;
            }
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < events.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(eventToName(events.get(i2)));
            }
            return sb.toString();
        }

        private static String eventToName(int e2) {
            switch (e2) {
                case 0:
                    return "TIMELINE_CHANGED";
                case 1:
                    return "MEDIA_ITEM_TRANSITION";
                case 2:
                    return "TRACKS_CHANGED";
                case 3:
                    return "IS_LOADING_CHANGED";
                case 4:
                    return "PLAYBACK_STATE_CHANGED";
                case 5:
                    return "PLAY_WHEN_READY_CHANGED";
                case 6:
                    return "PLAYBACK_SUPPRESSION_REASON_CHANGED";
                case 7:
                    return "IS_PLAYING_CHANGED";
                case 8:
                    return "REPEAT_MODE_CHANGED";
                case 9:
                    return "SHUFFLE_MODE_ENABLED_CHANGED";
                case 10:
                    return "PLAYER_ERROR";
                case 11:
                    return "POSITION_DISCONTINUITY";
                case 12:
                    return "PLAYBACK_PARAMETERS_CHANGED";
                case 13:
                    return "AVAILABLE_COMMANDS_CHANGED";
                case 14:
                    return "MEDIA_METADATA_CHANGED";
                case 15:
                    return "PLAYLIST_METADATA_CHANGED";
                case 16:
                    return "SEEK_BACK_INCREMENT_CHANGED";
                case 17:
                    return "SEEK_FORWARD_INCREMENT_CHANGED";
                case 18:
                case 19:
                case 21:
                case 22:
                case 23:
                default:
                    return "UNKNOWN(" + e2 + ")";
                case 20:
                    return "AUDIO_ATTRIBUTES_CHANGED";
                case 24:
                    return "SURFACE_SIZE_CHANGED";
                case 25:
                    return "VIDEO_SIZE_CHANGED";
                case 26:
                    return "RENDERED_FIRST_FRAME";
                case 27:
                    return "CUES";
                case 28:
                    return "METADATA";
                case 29:
                    return "DEVICE_INFO_CHANGED";
                case 30:
                    return "DEVICE_VOLUME_CHANGED";
            }
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Set<String> f62055a = new HashSet(Arrays.asList("android.view.TextureView", "android.view.SurfaceView", "android.view.Surface", "android.view.SurfaceHolder", "android.graphics.SurfaceTexture", "android.widget.VideoView", "android.media.MediaPlayer", "android.media.MediaCodec", "com.google.android.exoplayer2.Player", "com.google.android.exoplayer2.SimpleExoPlayer", "com.yandex.div.core.player.DivPlayerView"));

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f62056b = 4;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f62057c = 512;

        public static boolean a(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                return a(obj, 0, new IdentityHashMap(), new AtomicInteger(512));
            } catch (Throwable th) {
                return false;
            }
        }

        private static boolean a(Object obj, int i2, IdentityHashMap<Object, Boolean> identityHashMap, AtomicInteger atomicInteger) {
            if (obj == null || i2 > 4 || atomicInteger.decrementAndGet() < 0 || identityHashMap.containsKey(obj)) {
                return false;
            }
            identityHashMap.put(obj, Boolean.TRUE);
            Class<?> superclass = obj.getClass();
            if (f62055a.contains(superclass.getName())) {
                return true;
            }
            if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    if (a(it.next(), i2 + 1, identityHashMap, atomicInteger)) {
                        return true;
                    }
                }
                return false;
            }
            if (!superclass.isArray()) {
                while (superclass != null && superclass != Object.class) {
                    try {
                        for (Field field : superclass.getDeclaredFields()) {
                            if (!Modifier.isStatic(field.getModifiers())) {
                                try {
                                    field.setAccessible(true);
                                    Object obj2 = field.get(obj);
                                    if (obj2 != null) {
                                        String name = obj2.getClass().getName();
                                        if (f62055a.contains(name)) {
                                            return true;
                                        }
                                        if (a(name) && a(obj2, i2 + 1, identityHashMap, atomicInteger)) {
                                            return true;
                                        }
                                    }
                                } catch (Throwable th) {
                                }
                            }
                        }
                    } catch (Throwable th2) {
                    }
                    superclass = superclass.getSuperclass();
                }
                return false;
            }
            int length = Array.getLength(obj);
            for (int i3 = 0; i3 < length; i3++) {
                if (a(Array.get(obj, i3), i2 + 1, identityHashMap, atomicInteger)) {
                    return true;
                }
            }
            return false;
        }

        private static boolean a(String str) {
            return str.startsWith("yads.") || str.startsWith("com.yandex.") || str.startsWith("android.view.") || str.startsWith("android.widget.");
        }
    }
}
