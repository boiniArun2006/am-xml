package com.facebook.ads.internal.api;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.facebook.proguard.annotations.DoNotStripAny;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Keep
@DoNotStripAny
@UiThread
public interface AudienceNetworkRemoteServiceApi {

    @Keep
    @DoNotStripAny
    public interface MessageHandler {
        boolean handleMessage(Message message);
    }

    @Keep
    @DoNotStripAny
    public interface PackageVerifier {
        @Nullable
        String verifyPackage(Context context, Message message, @Nullable String str);
    }

    @Nullable
    IBinder onBind(Intent intent);

    void onCreate();

    void onDestroy();

    void setMessageHandler(MessageHandler messageHandler);

    void setPackageVerifier(PackageVerifier packageVerifier);
}
