package kotlinx.coroutines;

import GJW.V1;
import GJW.xuv;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "", "message", "", "cause", "LGJW/xuv;", "job", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;LGJW/xuv;)V", "fillInStackTrace", "()Ljava/lang/Throwable;", "toString", "()Ljava/lang/String;", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", c.f62177j, "LGJW/xuv;", "_job", "()LGJW/xuv;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JobCancellationException extends CancellationException {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final transient xuv _job;

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) other;
        return Intrinsics.areEqual(jobCancellationException.getMessage(), getMessage()) && Intrinsics.areEqual(jobCancellationException.n(), n()) && Intrinsics.areEqual(jobCancellationException.getCause(), getCause());
    }

    public final xuv n() {
        xuv xuvVar = this._job;
        return xuvVar == null ? V1.f3456n : xuvVar;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + n();
    }

    public JobCancellationException(String str, Throwable th, xuv xuvVar) {
        super(str);
        this._job = xuvVar;
        if (th != null) {
            initCause(th);
        }
    }

    public int hashCode() {
        int iHashCode;
        String message = getMessage();
        Intrinsics.checkNotNull(message);
        int iHashCode2 = message.hashCode() * 31;
        xuv xuvVarN = n();
        int iHashCode3 = 0;
        if (xuvVarN != null) {
            iHashCode = xuvVarN.hashCode();
        } else {
            iHashCode = 0;
        }
        int i2 = (iHashCode2 + iHashCode) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            iHashCode3 = cause.hashCode();
        }
        return i2 + iHashCode3;
    }
}
