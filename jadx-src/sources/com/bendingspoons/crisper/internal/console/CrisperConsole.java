package com.bendingspoons.crisper.internal.console;

import android.util.Log;
import androidx.annotation.Keep;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/bendingspoons/crisper/internal/console/CrisperConsole;", "", "<init>", "()V", CreativeInfo.f62442f, "", "message", "", "crisper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CrisperConsole {
    @Keep
    public final void log(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d("CRISPER", message);
    }
}
