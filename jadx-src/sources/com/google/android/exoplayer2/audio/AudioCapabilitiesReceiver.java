package com.google.android.exoplayer2.audio;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class AudioCapabilitiesReceiver {

    @Nullable
    AudioCapabilities audioCapabilities;
    private final Context context;

    @Nullable
    private final n externalSurroundSoundSettingObserver;
    private final Handler handler;
    private final Listener listener;

    @Nullable
    private final BroadcastReceiver receiver;
    private boolean registered;

    public interface Listener {
        void onAudioCapabilitiesChanged(AudioCapabilities audioCapabilities);
    }

    private final class n extends ContentObserver {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ContentResolver f57633n;
        private final Uri rl;

        public n(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f57633n = contentResolver;
            this.rl = uri;
        }

        public void n() {
            this.f57633n.registerContentObserver(this.rl, false, this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = AudioCapabilitiesReceiver.this;
            audioCapabilitiesReceiver.onNewAudioCapabilities(AudioCapabilities.getCapabilities(audioCapabilitiesReceiver.context));
        }

        public void rl() {
            this.f57633n.unregisterContentObserver(this);
        }
    }

    private final class w6 extends BroadcastReceiver {
        private w6() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                AudioCapabilitiesReceiver.this.onNewAudioCapabilities(AudioCapabilities.getCapabilities(context, intent));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNewAudioCapabilities(AudioCapabilities audioCapabilities) {
        if (!this.registered || audioCapabilities.equals(this.audioCapabilities)) {
            return;
        }
        this.audioCapabilities = audioCapabilities;
        this.listener.onAudioCapabilitiesChanged(audioCapabilities);
    }

    public AudioCapabilities register() {
        if (this.registered) {
            return (AudioCapabilities) Assertions.checkNotNull(this.audioCapabilities);
        }
        this.registered = true;
        n nVar = this.externalSurroundSoundSettingObserver;
        if (nVar != null) {
            nVar.n();
        }
        Intent intentRegisterReceiver = null;
        if (this.receiver != null) {
            intentRegisterReceiver = this.context.registerReceiver(this.receiver, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.handler);
        }
        AudioCapabilities capabilities = AudioCapabilities.getCapabilities(this.context, intentRegisterReceiver);
        this.audioCapabilities = capabilities;
        return capabilities;
    }

    public void unregister() {
        if (this.registered) {
            this.audioCapabilities = null;
            BroadcastReceiver broadcastReceiver = this.receiver;
            if (broadcastReceiver != null) {
                this.context.unregisterReceiver(broadcastReceiver);
            }
            n nVar = this.externalSurroundSoundSettingObserver;
            if (nVar != null) {
                nVar.rl();
            }
            this.registered = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioCapabilitiesReceiver(Context context, Listener listener) {
        w6 w6Var;
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.listener = (Listener) Assertions.checkNotNull(listener);
        Handler handlerCreateHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper();
        this.handler = handlerCreateHandlerForCurrentOrMainLooper;
        Object[] objArr = 0;
        if (Util.SDK_INT >= 21) {
            w6Var = new w6();
        } else {
            w6Var = null;
        }
        this.receiver = w6Var;
        Uri externalSurroundSoundGlobalSettingUri = AudioCapabilities.getExternalSurroundSoundGlobalSettingUri();
        this.externalSurroundSoundSettingObserver = externalSurroundSoundGlobalSettingUri != null ? new n(handlerCreateHandlerForCurrentOrMainLooper, applicationContext.getContentResolver(), externalSurroundSoundGlobalSettingUri) : null;
    }
}
