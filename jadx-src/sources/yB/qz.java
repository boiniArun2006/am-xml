package yB;

import dzu.afx;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class qz extends afx {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f75585O;

    public final /* synthetic */ AtomicReferenceArray S() {
        return this.f75585O;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f63562t + ", hashCode=" + hashCode() + ']';
    }

    public qz(long j2, qz qzVar, int i2) {
        super(j2, qzVar, i2);
        this.f75585O = new AtomicReferenceArray(o.J2);
    }

    @Override // dzu.afx
    public void o(int i2, Throwable th, CoroutineContext coroutineContext) {
        S().set(i2, o.f75582O);
        Z();
    }

    @Override // dzu.afx
    public int r() {
        return o.J2;
    }
}
