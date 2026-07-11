package androidx.media3.exoplayer;

import android.media.AudioManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final /* synthetic */ class Ml implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AudioFocusManager f39386n;

    public /* synthetic */ Ml(AudioFocusManager audioFocusManager) {
        this.f39386n = audioFocusManager;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i2) {
        this.f39386n.handlePlatformAudioFocusChange(i2);
    }
}
