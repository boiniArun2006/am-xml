package com.google.firebase.analytics.connector.internal;

import N03.fuX;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import uOq.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Keep
@KeepForSdk
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SHQ.j lambda$getComponents$0(uOq.Ml ml) {
        return SHQ.n.Uo((com.google.firebase.Wre) ml.n(com.google.firebase.Wre.class), (Context) ml.n(Context.class), (WU.Ml) ml.n(WU.Ml.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @KeepForSdk
    public List<uOq.w6> getComponents() {
        return Arrays.asList(uOq.w6.t(SHQ.j.class).rl(z.mUb(com.google.firebase.Wre.class)).rl(z.mUb(Context.class)).rl(z.mUb(WU.Ml.class)).J2(j.f60068n).O().nr(), fuX.rl("fire-analytics", "22.5.0"));
    }
}
