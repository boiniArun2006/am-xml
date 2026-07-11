package Lvl;

import java.io.IOException;
import kYF.C;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Response;
import okio.BufferedSink;
import okio.BufferedSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w6 {
    private final Headers J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f6245O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Lazy f6246n;
    private final long nr;
    private final Lazy rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f6247t;

    public w6(BufferedSource bufferedSource) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f6246n = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: Lvl.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.t(this.f6243n);
            }
        });
        this.rl = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: Lvl.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.nr(this.f6244n);
            }
        });
        this.f6247t = Long.parseLong(bufferedSource.readUtf8LineStrict());
        this.nr = Long.parseLong(bufferedSource.readUtf8LineStrict());
        this.f6245O = Integer.parseInt(bufferedSource.readUtf8LineStrict()) > 0;
        int i2 = Integer.parseInt(bufferedSource.readUtf8LineStrict());
        Headers.Builder builder = new Headers.Builder();
        for (int i3 = 0; i3 < i2; i3++) {
            C.rl(builder, bufferedSource.readUtf8LineStrict());
        }
        this.J2 = builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaType nr(w6 w6Var) {
        String str = w6Var.J2.get("Content-Type");
        if (str != null) {
            return MediaType.INSTANCE.parse(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CacheControl t(w6 w6Var) {
        return CacheControl.INSTANCE.parse(w6Var.J2);
    }

    public final MediaType J2() {
        return (MediaType) this.rl.getValue();
    }

    public final Headers KN() {
        return this.J2;
    }

    public final CacheControl O() {
        return (CacheControl) this.f6246n.getValue();
    }

    public final long Uo() {
        return this.nr;
    }

    public final void gh(BufferedSink bufferedSink) throws IOException {
        bufferedSink.writeDecimalLong(this.f6247t).writeByte(10);
        bufferedSink.writeDecimalLong(this.nr).writeByte(10);
        bufferedSink.writeDecimalLong(this.f6245O ? 1L : 0L).writeByte(10);
        bufferedSink.writeDecimalLong(this.J2.size()).writeByte(10);
        int size = this.J2.size();
        for (int i2 = 0; i2 < size; i2++) {
            bufferedSink.writeUtf8(this.J2.name(i2)).writeUtf8(": ").writeUtf8(this.J2.value(i2)).writeByte(10);
        }
    }

    public final boolean mUb() {
        return this.f6245O;
    }

    public final long xMQ() {
        return this.f6247t;
    }

    public w6(Response response) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f6246n = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: Lvl.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.t(this.f6243n);
            }
        });
        this.rl = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: Lvl.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.nr(this.f6244n);
            }
        });
        this.f6247t = response.sentRequestAtMillis();
        this.nr = response.receivedResponseAtMillis();
        this.f6245O = response.handshake() != null;
        this.J2 = response.headers();
    }
}
