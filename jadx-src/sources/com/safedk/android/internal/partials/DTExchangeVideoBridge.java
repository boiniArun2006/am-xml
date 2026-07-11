package com.safedk.android.internal.partials;

import android.media.MediaPlayer;
import android.view.Surface;
import android.widget.VideoView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import java.io.IOException;

/* JADX INFO: compiled from: DTExchangeSourceFile */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class DTExchangeVideoBridge {
    public static void VideoViewPlay(VideoView vv2) {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->VideoViewPlay(Landroid/widget/VideoView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewPlay: player ", vv2, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.f63176p, (Object) vv2);
                CreativeInfoManager.a(h.f63176p, BrandSafetyUtils.a(vv2), false, "video-view");
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in VideoViewPlay: ", e2.getMessage());
            }
        }
        vv2.start();
    }

    public static void VideoViewPause(VideoView vv2) {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->VideoViewPause(Landroid/widget/VideoView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewPause: player ", vv2, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.f63176p, BrandSafetyUtils.a(vv2), true, "video-view");
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in VideoViewPause : ", e2.getMessage());
            }
        }
        vv2.suspend();
    }

    public static void VideoViewSetVideoPath(VideoView vv2, String url) {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->VideoViewSetVideoPath(Landroid/widget/VideoView;Ljava/lang/String;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewSetVideoPath: player ", vv2, ", path: ", url, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.f63176p, vv2, url);
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in VideoViewSetVideoPath: ", e2.getMessage());
            }
        }
        vv2.setVideoPath(url);
    }

    public static void MediaPlayerStart(MediaPlayer mp) throws IllegalStateException {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->MediaPlayerStart(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStart: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.f63176p, mp);
                CreativeInfoManager.a(h.f63176p, (String) null, false, "media-player");
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: ", e2.getMessage());
            }
        }
        mp.start();
    }

    public static void MediaPlayerStop(MediaPlayer mp) throws IllegalStateException {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->MediaPlayerStop(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStop: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.f63176p, (String) null, true, "media-player");
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in MediaPlayerStop: ", e2.getMessage());
            }
        }
        mp.stop();
    }

    public static void MediaPlayerPause(MediaPlayer mp) throws IllegalStateException {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->MediaPlayerPause(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerPause: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.f63176p, (String) null, true, "media-player");
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in MediaPlayerPause: ", e2.getMessage());
            }
        }
        mp.pause();
    }

    public static void MediaPlayerRelease(MediaPlayer mp) throws IllegalStateException {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->MediaPlayerRelease(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerRelease: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                if (CreativeInfoManager.a(h.f63176p, AdNetworkConfiguration.SUPPORTS_MEDIA_PLAYER_RELEASE_EOV, false)) {
                    CreativeInfoManager.a(h.f63176p, (String) null, true, "media-player");
                }
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: ", e2.getMessage());
            }
        }
        mp.release();
    }

    public static void MediaPlayerSetDataSource(MediaPlayer mp, String path) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->MediaPlayerSetDataSource(Landroid/media/MediaPlayer;Ljava/lang/String;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerSetDataSource: player ", mp, ", path ", path, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.f63176p, mp, path);
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in MediaPlayerSetDataSource: ", e2.getMessage());
            }
        }
        mp.setDataSource(path);
    }

    public static void MediaPlayerSetSurface(MediaPlayer mp, Surface surface) {
        Logger.d("DTExchangeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/DTExchangeVideoBridge;->MediaPlayerSetSurface(Landroid/media/MediaPlayer;Landroid/view/Surface;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerSetSurface: player ", mp, ", surface ", surface, ", isOnUiThread = ", Boolean.valueOf(n.c()));
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in MediaPlayerSetSurface: ", e2.getMessage());
            }
        }
        mp.setSurface(surface);
    }
}
