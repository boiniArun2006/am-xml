package com.safedk.android.internal.partials;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import java.io.IOException;

/* JADX INFO: compiled from: LiftoffMonetizeSourceFile */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class LiftoffMonetizeVideoBridge {
    public static void MediaPlayerStart(MediaPlayer mp) throws IllegalStateException {
        Logger.d("LiftoffMonetizeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/LiftoffMonetizeVideoBridge;->MediaPlayerStart(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStart: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.f63164d, mp);
                CreativeInfoManager.a(h.f63164d, (String) null, false, "media-player");
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: ", e2.getMessage());
            }
        }
        mp.start();
    }

    public static void MediaPlayerStop(MediaPlayer mp) throws IllegalStateException {
        Logger.d("LiftoffMonetizeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/LiftoffMonetizeVideoBridge;->MediaPlayerStop(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerStop: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.f63164d, (String) null, true, "media-player");
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in MediaPlayerStop: ", e2.getMessage());
            }
        }
        mp.stop();
    }

    public static void MediaPlayerPause(MediaPlayer mp) throws IllegalStateException {
        Logger.d("LiftoffMonetizeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/LiftoffMonetizeVideoBridge;->MediaPlayerPause(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerPause: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.f63164d, (String) null, true, "media-player");
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in MediaPlayerPause: ", e2.getMessage());
            }
        }
        mp.pause();
    }

    public static void MediaPlayerRelease(MediaPlayer mp) throws IllegalStateException {
        Logger.d("LiftoffMonetizeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/LiftoffMonetizeVideoBridge;->MediaPlayerRelease(Landroid/media/MediaPlayer;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "MediaPlayerRelease: ", mp, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                if (CreativeInfoManager.a(h.f63164d, AdNetworkConfiguration.SUPPORTS_MEDIA_PLAYER_RELEASE_EOV, false)) {
                    CreativeInfoManager.a(h.f63164d, (String) null, true, "media-player");
                }
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in MediaPlayerStart: ", e2.getMessage());
            }
        }
        mp.release();
    }

    public static void MediaPlayerSetDataSource(MediaPlayer mp, Context context, Uri uri) throws IllegalStateException, IOException, IllegalArgumentException {
        Logger.d("LiftoffMonetizeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/LiftoffMonetizeVideoBridge;->MediaPlayerSetDataSource(Landroid/media/MediaPlayer;Landroid/content/Context;Landroid/net/Uri;)V");
        if (SafeDK.ad()) {
            try {
                Logger.d("VideoBridge", "media player set data source: player ", mp, ", context ", context, ",  uri= ", uri, ", isOnUiThread = ", Boolean.valueOf(n.c()));
                CreativeInfoManager.a(h.f63164d, mp, uri);
            } catch (Exception e2) {
                Logger.d("VideoBridge", "exception in MediaPlayerSetDataSource: ", e2.getMessage());
            }
        }
        mp.setDataSource(context, uri);
    }

    public static void MediaPlayerSetSurface(MediaPlayer mp, Surface surface) {
        Logger.d("LiftoffMonetizeVideo|SafeDK: Partial-Video> Lcom/safedk/android/internal/partials/LiftoffMonetizeVideoBridge;->MediaPlayerSetSurface(Landroid/media/MediaPlayer;Landroid/view/Surface;)V");
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
