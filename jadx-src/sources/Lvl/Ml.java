package Lvl;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import kYF.C;
import kYF.afx;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Ml {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f6235t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Request f6236n;
    private final w6 rl;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        private final boolean O(String str) {
            return (StringsKt.equals("Connection", str, true) || StringsKt.equals("Keep-Alive", str, true) || StringsKt.equals("Proxy-Authenticate", str, true) || StringsKt.equals("Proxy-Authorization", str, true) || StringsKt.equals("TE", str, true) || StringsKt.equals("Trailers", str, true) || StringsKt.equals("Transfer-Encoding", str, true) || StringsKt.equals("Upgrade", str, true)) ? false : true;
        }

        private final boolean nr(String str) {
            return StringsKt.equals("Content-Length", str, true) || StringsKt.equals("Content-Encoding", str, true) || StringsKt.equals("Content-Type", str, true);
        }

        public final Headers n(Headers headers, Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                String strName = headers.name(i2);
                String strValue = headers.value(i2);
                if ((!StringsKt.equals("Warning", strName, true) || !StringsKt.startsWith$default(strValue, "1", false, 2, (Object) null)) && (nr(strName) || !O(strName) || headers2.get(strName) == null)) {
                    builder.addUnsafeNonAscii(strName, strValue);
                }
            }
            int size2 = headers2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String strName2 = headers2.name(i3);
                if (!nr(strName2) && O(strName2)) {
                    builder.addUnsafeNonAscii(strName2, headers2.value(i3));
                }
            }
            return builder.build();
        }

        public final boolean rl(Request request, w6 w6Var) {
            if (!request.cacheControl().noStore() && !w6Var.O().noStore() && !Intrinsics.areEqual(w6Var.KN().get("Vary"), "*")) {
                return true;
            }
            return false;
        }

        public final boolean t(Request request, Response response) {
            if (!request.cacheControl().noStore() && !response.cacheControl().noStore() && !Intrinsics.areEqual(response.headers().get("Vary"), "*")) {
                return true;
            }
            return false;
        }
    }

    public static final class n {
        private String J2;
        private long KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Date f6237O;
        private Date Uo;
        private int gh;
        private String mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Request f6238n;
        private String nr;
        private final w6 rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Date f6239t;
        private long xMQ;

        private final long n() {
            Date date = this.f6239t;
            long jMax = date != null ? Math.max(0L, this.xMQ - date.getTime()) : 0L;
            int i2 = this.gh;
            if (i2 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i2));
            }
            return jMax + (this.xMQ - this.KN) + (afx.f69939n.n() - this.xMQ);
        }

        private final boolean nr(Request request) {
            return (request.header("If-Modified-Since") == null && request.header("If-None-Match") == null) ? false : true;
        }

        private final long t() {
            w6 w6Var = this.rl;
            Intrinsics.checkNotNull(w6Var);
            if (w6Var.O().maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.maxAgeSeconds());
            }
            Date date = this.Uo;
            if (date != null) {
                Date date2 = this.f6239t;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.xMQ);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f6237O != null && this.f6238n.url().query() == null) {
                Date date3 = this.f6239t;
                long time2 = date3 != null ? date3.getTime() : this.KN;
                Date date4 = this.f6237O;
                Intrinsics.checkNotNull(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / ((long) 10);
                }
            }
            return 0L;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Ml rl() {
            String str;
            w6 w6Var = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            if (this.rl == null) {
                return new Ml(this.f6238n, w6Var, objArr12 == true ? 1 : 0);
            }
            if (this.f6238n.isHttps() && !this.rl.mUb()) {
                return new Ml(this.f6238n, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0);
            }
            CacheControl cacheControlO = this.rl.O();
            if (!Ml.f6235t.rl(this.f6238n, this.rl)) {
                return new Ml(this.f6238n, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0);
            }
            CacheControl cacheControl = this.f6238n.cacheControl();
            if (cacheControl.noCache() || nr(this.f6238n)) {
                return new Ml(this.f6238n, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
            }
            long jN = n();
            long jT2 = t();
            if (cacheControl.maxAgeSeconds() != -1) {
                jT2 = Math.min(jT2, TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds()));
            }
            long millis = 0;
            long millis2 = cacheControl.minFreshSeconds() != -1 ? TimeUnit.SECONDS.toMillis(cacheControl.minFreshSeconds()) : 0L;
            if (!cacheControlO.mustRevalidate() && cacheControl.maxStaleSeconds() != -1) {
                millis = TimeUnit.SECONDS.toMillis(cacheControl.maxStaleSeconds());
            }
            if (!cacheControlO.noCache() && jN + millis2 < jT2 + millis) {
                return new Ml(objArr7 == true ? 1 : 0, this.rl, objArr6 == true ? 1 : 0);
            }
            String str2 = this.mUb;
            if (str2 != null) {
                Intrinsics.checkNotNull(str2);
                str = "If-None-Match";
            } else {
                str = "If-Modified-Since";
                if (this.f6237O != null) {
                    str2 = this.J2;
                    Intrinsics.checkNotNull(str2);
                } else {
                    if (this.f6239t == null) {
                        return new Ml(this.f6238n, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0);
                    }
                    str2 = this.nr;
                    Intrinsics.checkNotNull(str2);
                }
            }
            return new Ml(this.f6238n.newBuilder().addHeader(str, str2).build(), this.rl, objArr5 == true ? 1 : 0);
        }

        public n(Request request, w6 w6Var) {
            this.f6238n = request;
            this.rl = w6Var;
            this.gh = -1;
            if (w6Var != null) {
                this.KN = w6Var.xMQ();
                this.xMQ = w6Var.Uo();
                Headers headersKN = w6Var.KN();
                int size = headersKN.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String strName = headersKN.name(i2);
                    if (StringsKt.equals(strName, "Date", true)) {
                        this.f6239t = headersKN.getDate("Date");
                        this.nr = headersKN.value(i2);
                    } else if (StringsKt.equals(strName, "Expires", true)) {
                        this.Uo = headersKN.getDate("Expires");
                    } else if (StringsKt.equals(strName, "Last-Modified", true)) {
                        this.f6237O = headersKN.getDate("Last-Modified");
                        this.J2 = headersKN.value(i2);
                    } else if (StringsKt.equals(strName, "ETag", true)) {
                        this.mUb = headersKN.value(i2);
                    } else if (StringsKt.equals(strName, "Age", true)) {
                        this.gh = C.ViF(headersKN.value(i2), -1);
                    }
                }
            }
        }
    }

    public /* synthetic */ Ml(Request request, w6 w6Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(request, w6Var);
    }

    private Ml(Request request, w6 w6Var) {
        this.f6236n = request;
        this.rl = w6Var;
    }

    public final w6 n() {
        return this.rl;
    }

    public final Request rl() {
        return this.f6236n;
    }
}
