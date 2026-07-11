package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okio.ByteString;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.ui.AdActivity;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0012J\b\u0010\u0002\u001a\u00020\u0003H&J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\tH&J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0013"}, d2 = {"Lcom/applovin/shadow/okhttp3/WebSocket;", "", "cancel", "", MRAIDPresenter.CLOSE, "", "code", "", JavetError.PARAMETER_REASON, "", "queueSize", "", AdActivity.REQUEST_KEY_EXTRA, "Lcom/applovin/shadow/okhttp3/Request;", "send", "text", "bytes", "Lcom/applovin/shadow/okio/ByteString;", "Factory", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface WebSocket {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/applovin/shadow/okhttp3/WebSocket$Factory;", "", "newWebSocket", "Lcom/applovin/shadow/okhttp3/WebSocket;", AdActivity.REQUEST_KEY_EXTRA, "Lcom/applovin/shadow/okhttp3/Request;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/applovin/shadow/okhttp3/WebSocketListener;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Factory {
        WebSocket newWebSocket(Request request, WebSocketListener listener);
    }

    void cancel();

    boolean close(int code, String reason);

    long queueSize();

    Request request();

    boolean send(ByteString bytes);

    boolean send(String text);
}
