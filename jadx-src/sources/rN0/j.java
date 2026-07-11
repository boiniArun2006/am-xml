package rN0;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j implements Interceptor {

    /* JADX INFO: renamed from: rN0.j$j, reason: collision with other inner class name */
    public static final class C1156j extends RequestBody {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ RequestBody f73012n;

        C1156j(RequestBody requestBody) {
            this.f73012n = requestBody;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return -1L;
        }

        @Override // okhttp3.RequestBody
        /* JADX INFO: renamed from: contentType */
        public MediaType getContentType() {
            RequestBody requestBody = this.f73012n;
            Intrinsics.checkNotNull(requestBody);
            return requestBody.getContentType();
        }

        @Override // okhttp3.RequestBody
        public void writeTo(BufferedSink sink) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            BufferedSink bufferedSinkBuffer = Okio.buffer(new GzipSink(sink));
            RequestBody requestBody = this.f73012n;
            Intrinsics.checkNotNull(requestBody);
            requestBody.writeTo(bufferedSinkBuffer);
            bufferedSinkBuffer.close();
        }
    }

    private final RequestBody n(RequestBody requestBody) {
        return new C1156j(requestBody);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        return (request.body() == null || request.header("Content-Encoding") != null) ? chain.proceed(request) : chain.proceed(request.newBuilder().header("Content-Encoding", "gzip").method(request.method(), n(request.body())).build());
    }
}
