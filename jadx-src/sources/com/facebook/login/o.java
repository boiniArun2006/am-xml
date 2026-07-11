package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.DAz;
import com.facebook.login.LoginClient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class o extends DAz {
    @Override // com.facebook.internal.DAz
    protected void Uo(Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, LoginClient.Request request) {
        super(context, 65536, 65537, 20121101, request.getApplicationId(), request.getNonce());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
    }
}
