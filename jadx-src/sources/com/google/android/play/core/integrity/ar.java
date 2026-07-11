package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class ar extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ as f59469a;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i2, Bundle bundle) {
        if (i2 == 1) {
            this.f59469a.f59470a.trySetResult(3);
        } else if (i2 == 2) {
            this.f59469a.f59470a.trySetResult(2);
        } else {
            if (i2 != 3) {
                return;
            }
            this.f59469a.f59470a.trySetResult(1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(as asVar, Handler handler) {
        super(handler);
        this.f59469a = asVar;
    }
}
