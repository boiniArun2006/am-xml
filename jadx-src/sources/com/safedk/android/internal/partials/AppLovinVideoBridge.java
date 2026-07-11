package com.safedk.android.internal.partials;

import android.media.MediaPlayer;
import android.net.Uri;
import android.widget.VideoView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;

/* JADX INFO: compiled from: AppLovinSourceFile */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class AppLovinVideoBridge {
    public static void VideoViewPlay(VideoView vv2) {
        Logger.d("AppLovinVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AppLovinVideoBridge;->VideoViewPlay(Landroid/widget/VideoView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewPlay: player ", vv2, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.f63161a, (Object) vv2);
                CreativeInfoManager.a(h.f63161a, BrandSafetyUtils.a(vv2), false, "video-view");
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in VideoViewPlay: ", e2.getMessage());
            }
        }
        vv2.start();
    }

    public static void VideoViewStop(VideoView vv2) {
        Logger.d("AppLovinVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AppLovinVideoBridge;->VideoViewStop(Landroid/widget/VideoView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewStop: player ", vv2, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.f63161a, BrandSafetyUtils.a(vv2), true, "video-view");
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in VideoViewStop : ", e2.getMessage());
            }
        }
        vv2.stopPlayback();
    }

    public static void VideoViewPause(VideoView vv2) {
        Logger.d("AppLovinVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AppLovinVideoBridge;->VideoViewPause(Landroid/widget/VideoView;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewPause: player ", vv2, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.f63161a, BrandSafetyUtils.a(vv2), true, "video-view");
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in VideoViewPause : ", e2.getMessage());
            }
        }
        vv2.suspend();
    }

    public static void VideoViewSetVideoUri(VideoView vv2, Uri uri) {
        Logger.d("AppLovinVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AppLovinVideoBridge;->VideoViewSetVideoUri(Landroid/widget/VideoView;Landroid/net/Uri;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "VideoViewSetVideoUri: player ", vv2, ", uri: ", uri, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.f63161a, vv2, uri);
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in VideoViewSetVideoPath: ", e2.getMessage());
            }
        }
        vv2.setVideoURI(uri);
    }

    public static void MediaPlayerRelease(MediaPlayer mp) throws IllegalStateException {
        Logger.d("AppLovinVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/AppLovinVideoBridge;->MediaPlayerRelease(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerRelease: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                if (CreativeInfoManager.a(h.f63161a, AdNetworkConfiguration.SUPPORTS_MEDIA_PLAYER_RELEASE_EOV, false)) {
                    CreativeInfoManager.a(h.f63161a, (String) null, true, "media-player");
                }
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: ", e2.getMessage());
            }
        }
        mp.release();
    }
}
