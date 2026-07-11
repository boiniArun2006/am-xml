package HPn;

import java.io.EOFException;
import java.io.IOException;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.Buffer;
import xFr.AbstractC2425j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class I28 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String rl(Request request) {
        try {
            Request requestBuild = request.newBuilder().build();
            Buffer buffer = new Buffer();
            RequestBody requestBodyBody = requestBuild.body();
            if (requestBodyBody != null) {
                requestBodyBody.writeTo(buffer);
            }
            return AbstractC2425j.n(buffer.readByteArray());
        } catch (EOFException | IOException unused) {
            return "";
        }
    }
}
