package com.applovin.shadow.okhttp3;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/applovin/shadow/okhttp3/Callback;", "", "onFailure", "", "call", "Lcom/applovin/shadow/okhttp3/Call;", "e", "Ljava/io/IOException;", "onResponse", "response", "Lcom/applovin/shadow/okhttp3/Response;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Callback {
    void onFailure(Call call, IOException e2);

    void onResponse(Call call, Response response) throws IOException;
}
