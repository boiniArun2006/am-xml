package com.vungle.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/vungle/ads/internal/util/RingerModeReceiver;", "Landroid/content/BroadcastReceiver;", "()V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/vungle/ads/internal/util/OnSilentModeChangeListener;", "getListener", "()Lcom/vungle/ads/internal/util/OnSilentModeChangeListener;", "setListener", "(Lcom/vungle/ads/internal/util/OnSilentModeChangeListener;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RingerModeReceiver extends BroadcastReceiver {
    private OnSilentModeChangeListener listener;

    public final OnSilentModeChangeListener getListener() {
        return this.listener;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        OnSilentModeChangeListener onSilentModeChangeListener;
        if (intent != null) {
            try {
                action = intent.getAction();
            } catch (Exception e2) {
                String localizedMessage = e2.getLocalizedMessage();
                if (localizedMessage != null) {
                    Logger.INSTANCE.e("RingerModeReceiver", localizedMessage);
                    return;
                }
                return;
            }
        } else {
            action = null;
        }
        if (Intrinsics.areEqual(action, "android.media.RINGER_MODE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", -1);
            Logger.INSTANCE.d("RingerModeReceiver", "receive ringermode: " + intExtra);
            if (intExtra == 0) {
                OnSilentModeChangeListener onSilentModeChangeListener2 = this.listener;
                if (onSilentModeChangeListener2 != null) {
                    onSilentModeChangeListener2.notifySilentModeChange(true);
                    return;
                }
                return;
            }
            if (intExtra != 1) {
                if (intExtra == 2 && (onSilentModeChangeListener = this.listener) != null) {
                    onSilentModeChangeListener.notifySilentModeChange(false);
                    return;
                }
                return;
            }
            OnSilentModeChangeListener onSilentModeChangeListener3 = this.listener;
            if (onSilentModeChangeListener3 != null) {
                onSilentModeChangeListener3.notifySilentModeChange(true);
            }
        }
    }

    public final void setListener(OnSilentModeChangeListener onSilentModeChangeListener) {
        this.listener = onSilentModeChangeListener;
    }
}
