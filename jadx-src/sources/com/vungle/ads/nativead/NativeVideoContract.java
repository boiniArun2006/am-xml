package com.vungle.ads.nativead;

import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/vungle/ads/nativead/NativeVideoContract;", "", "VideoControl", "VideoLifecycleCallback", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface NativeVideoContract {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/nativead/NativeVideoContract$VideoControl;", "", "getCurrentTime", "", "getDuration", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface VideoControl {
        int getCurrentTime();

        int getDuration();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0006H&¨\u0006\u0011"}, d2 = {"Lcom/vungle/ads/nativead/NativeVideoContract$VideoLifecycleCallback;", "", "onVideoCompleted", "", "onVideoError", "what", "", "extra", "", "onVideoMuted", "muted", "", "onVideoPause", "onVideoPlay", "onVideoPrepared", "onVideoProgress", "percentage", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface VideoLifecycleCallback {
        void onVideoCompleted();

        void onVideoError(int what, String extra);

        void onVideoMuted(boolean muted);

        void onVideoPause();

        void onVideoPlay();

        void onVideoPrepared();

        void onVideoProgress(int percentage);
    }
}
