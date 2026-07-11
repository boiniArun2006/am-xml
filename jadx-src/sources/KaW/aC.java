package KaW;

import com.applovin.sdk.AppLovinEventTypes;
import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.ByteString;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Logger f5558n;
    private final Level rl;

    enum j {
        INBOUND,
        OUTBOUND
    }

    private enum n {
        HEADER_TABLE_SIZE(1),
        ENABLE_PUSH(2),
        MAX_CONCURRENT_STREAMS(4),
        MAX_FRAME_SIZE(5),
        MAX_HEADER_LIST_SIZE(6),
        INITIAL_WINDOW_SIZE(7);


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f5568n;

        public int n() {
            return this.f5568n;
        }

        n(int i2) {
            this.f5568n = i2;
        }
    }

    aC(Level level, Class cls) {
        this(level, Logger.getLogger(cls.getName()));
    }

    aC(Level level, Logger logger) {
        this.rl = (Level) t1.Xo.ck(level, AppLovinEventTypes.USER_COMPLETED_LEVEL);
        this.f5558n = (Logger) t1.Xo.ck(logger, "logger");
    }

    private boolean n() {
        return this.f5558n.isLoggable(this.rl);
    }

    private static String qie(ISg.Dsr dsr) {
        EnumMap enumMap = new EnumMap(n.class);
        for (n nVar : n.values()) {
            if (dsr.nr(nVar.n())) {
                enumMap.put(nVar, Integer.valueOf(dsr.n(nVar.n())));
            }
        }
        return enumMap.toString();
    }

    private static String az(Buffer buffer) {
        if (buffer.size() <= 64) {
            return buffer.snapshot().hex();
        }
        return buffer.snapshot((int) Math.min(buffer.size(), 64L)).hex() + "...";
    }

    void J2(j jVar, long j2) {
        if (n()) {
            this.f5558n.log(this.rl, jVar + " PING: ack=true bytes=" + j2);
        }
    }

    void KN(j jVar, int i2, ISg.j jVar2) {
        if (n()) {
            this.f5558n.log(this.rl, jVar + " RST_STREAM: streamId=" + i2 + " errorCode=" + jVar2);
        }
    }

    void O(j jVar, long j2) {
        if (n()) {
            this.f5558n.log(this.rl, jVar + " PING: ack=false bytes=" + j2);
        }
    }

    void Uo(j jVar, int i2, int i3, List list) {
        if (n()) {
            this.f5558n.log(this.rl, jVar + " PUSH_PROMISE: streamId=" + i2 + " promisedStreamId=" + i3 + " headers=" + list);
        }
    }

    void gh(j jVar, int i2, long j2) {
        if (n()) {
            this.f5558n.log(this.rl, jVar + " WINDOW_UPDATE: streamId=" + i2 + " windowSizeIncrement=" + j2);
        }
    }

    void mUb(j jVar) {
        if (n()) {
            this.f5558n.log(this.rl, jVar + " SETTINGS: ack=true");
        }
    }

    void nr(j jVar, int i2, List list, boolean z2) {
        if (n()) {
            this.f5558n.log(this.rl, jVar + " HEADERS: streamId=" + i2 + " headers=" + list + " endStream=" + z2);
        }
    }

    void rl(j jVar, int i2, Buffer buffer, int i3, boolean z2) {
        if (n()) {
            this.f5558n.log(this.rl, jVar + " DATA: streamId=" + i2 + " endStream=" + z2 + " length=" + i3 + " bytes=" + az(buffer));
        }
    }

    void t(j jVar, int i2, ISg.j jVar2, ByteString byteString) {
        if (n()) {
            this.f5558n.log(this.rl, jVar + " GO_AWAY: lastStreamId=" + i2 + " errorCode=" + jVar2 + " length=" + byteString.size() + " bytes=" + az(new Buffer().write(byteString)));
        }
    }

    void xMQ(j jVar, ISg.Dsr dsr) {
        if (n()) {
            this.f5558n.log(this.rl, jVar + " SETTINGS: ack=false settings=" + qie(dsr));
        }
    }
}
