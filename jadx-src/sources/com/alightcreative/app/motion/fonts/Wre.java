package com.alightcreative.app.motion.fonts;

import android.net.Uri;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class Wre extends Request {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function2 f45787n;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(Function2 function2, VolleyError volleyError) {
        function2.invoke(null, volleyError);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wre(Uri uri, final Function2 onComplete) {
        super(0, uri.toString(), new Response.ErrorListener() { // from class: com.alightcreative.app.motion.fonts.I28
            @Override // com.android.volley.Response.ErrorListener
            public final void onErrorResponse(VolleyError volleyError) {
                Wre.rl(onComplete, volleyError);
            }
        });
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        this.f45787n = onComplete;
    }

    @Override // com.android.volley.Request
    protected Response parseNetworkResponse(NetworkResponse networkResponse) {
        byte[] bArr;
        if (networkResponse == null || (bArr = networkResponse.data) == null) {
            bArr = new byte[0];
        }
        Response responseSuccess = Response.success(bArr, HttpHeaderParser.parseCacheHeaders(networkResponse));
        Intrinsics.checkNotNullExpressionValue(responseSuccess, "success(...)");
        return responseSuccess;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void deliverResponse(byte[] response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f45787n.invoke(response, null);
    }
}
