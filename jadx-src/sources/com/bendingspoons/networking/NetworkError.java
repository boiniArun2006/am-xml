package com.bendingspoons.networking;

import androidx.annotation.Keep;
import androidx.core.net.Toe.GDEJgAYrPQHfw;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0005\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/bendingspoons/networking/NetworkError;", "E", "", "<init>", "()V", "j", c.f62177j, "Ml", "I28", "w6", "Lcom/bendingspoons/networking/NetworkError$j;", "Lcom/bendingspoons/networking/NetworkError$n;", "Lcom/bendingspoons/networking/NetworkError$w6;", "Lcom/bendingspoons/networking/NetworkError$Ml;", "Lcom/bendingspoons/networking/NetworkError$I28;", "networking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NetworkError<E> {

    public static final class I28 extends NetworkError {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Throwable f51402n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof I28) && Intrinsics.areEqual(this.f51402n, ((I28) obj).f51402n);
        }

        public int hashCode() {
            return this.f51402n.hashCode();
        }

        public String toString() {
            return "Unknown(throwable=" + this.f51402n + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.f51402n = throwable;
        }

        public final Throwable n() {
            return this.f51402n;
        }
    }

    public static final class Ml extends NetworkError {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SocketTimeoutException f51403n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ml) && Intrinsics.areEqual(this.f51403n, ((Ml) obj).f51403n);
        }

        public int hashCode() {
            return this.f51403n.hashCode();
        }

        public String toString() {
            return "Timeout(exception=" + this.f51403n + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(SocketTimeoutException exception) {
            super(null);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f51403n = exception;
        }

        public final SocketTimeoutException n() {
            return this.f51403n;
        }
    }

    public static final class j extends NetworkError {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f51404n;
        private final Object rl;

        public j(int i2, Object obj) {
            super(null);
            this.f51404n = i2;
            this.rl = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f51404n == jVar.f51404n && Intrinsics.areEqual(this.rl, jVar.rl);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f51404n) * 31;
            Object obj = this.rl;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "HttpError(httpCode=" + this.f51404n + ", data=" + this.rl + ")";
        }

        public final Object n() {
            return this.rl;
        }

        public final int rl() {
            return this.f51404n;
        }
    }

    public static final class n extends NetworkError {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final IOException f51405n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && Intrinsics.areEqual(this.f51405n, ((n) obj).f51405n);
        }

        public int hashCode() {
            return this.f51405n.hashCode();
        }

        public String toString() {
            return "IOError(exception=" + this.f51405n + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(IOException exception) {
            super(null);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f51405n = exception;
        }

        public final IOException n() {
            return this.f51405n;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class w6 extends NetworkError {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Exception f51406n;
        private final String rl;

        public /* synthetic */ w6(Exception exc, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(exc, (i2 & 2) != 0 ? null : str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w6)) {
                return false;
            }
            w6 w6Var = (w6) obj;
            return Intrinsics.areEqual(this.f51406n, w6Var.f51406n) && Intrinsics.areEqual(this.rl, w6Var.rl);
        }

        public int hashCode() {
            int iHashCode = this.f51406n.hashCode() * 31;
            String str = this.rl;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "JsonParsingError(exception=" + this.f51406n + ", message=" + this.rl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Exception exc, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(exc, GDEJgAYrPQHfw.iJRFGPwnM);
            this.f51406n = exc;
            this.rl = str;
        }

        public final Exception n() {
            return this.f51406n;
        }
    }

    public /* synthetic */ NetworkError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NetworkError() {
    }
}
