package Sa;

import HI0.Lu;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.squareup.moshi.JsonDataException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Sa.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C1467j extends Request {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Class f9782n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Response.Listener f9783t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1467j(String url, Class clazz, Response.Listener listener, Response.ErrorListener errorListener) {
        super(0, url, errorListener);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(errorListener, "errorListener");
        this.f9782n = clazz;
        this.f9783t = listener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.Request
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void deliverResponse(List response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.f9783t.onResponse(response);
    }

    @Override // com.android.volley.Request
    protected Response parseNetworkResponse(NetworkResponse networkResponse) {
        byte[] bArr;
        if (networkResponse != null) {
            try {
                bArr = networkResponse.data;
                if (bArr == null) {
                    bArr = new byte[0];
                }
            } catch (JsonDataException e2) {
                return Response.error(new ParseError(e2));
            } catch (UnsupportedEncodingException e3) {
                return Response.error(new ParseError(e3));
            } catch (IOException e4) {
                return Response.error(new ParseError(e4));
            }
        } else {
            bArr = new byte[0];
        }
        Charset charsetForName = Charset.forName(HttpHeaderParser.parseCharset(networkResponse != null ? networkResponse.headers : null));
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
        return Response.success(Lu.t(Lu.n(), this.f9782n, new String(bArr, charsetForName)), HttpHeaderParser.parseCacheHeaders(networkResponse));
    }
}
