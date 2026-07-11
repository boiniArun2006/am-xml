package androidx.core.content.pm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.pairip.VMRunner;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class ShortcutManagerCompat {

    /* JADX INFO: renamed from: androidx.core.content.pm.ShortcutManagerCompat$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    class AnonymousClass1 extends BroadcastReceiver {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ IntentSender f36350n;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VMRunner.invoke("Tb8oxpCoidVVn7TD", new Object[]{this, context, intent});
        }
    }

    @RequiresApi
    private static class Api25Impl {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ShortcutMatchFlags {
    }
}
