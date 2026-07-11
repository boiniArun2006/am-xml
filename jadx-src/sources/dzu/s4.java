package dzu;

import GJW.DC;
import GJW.O;
import GJW.iF;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class s4 extends DC implements iF {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f63578O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Throwable f63579t;

    public /* synthetic */ s4(Throwable th, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i2 & 2) != 0 ? null : str);
    }

    @Override // GJW.DC
    public DC T3L() {
        return this;
    }

    public s4(Throwable th, String str) {
        this.f63579t = th;
        this.f63578O = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Void Uf() {
        String str;
        if (this.f63579t == null) {
            AbstractC1958c.nr();
            throw new KotlinNothingValueException();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Module with the Main dispatcher had failed to initialize");
        String str2 = this.f63578O;
        if (str2 != null) {
            str = ". " + str2;
            if (str == null) {
                str = "";
            }
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString(), this.f63579t);
    }

    @Override // GJW.DC, GJW.lej
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f63579t != null) {
            str = ", cause=" + this.f63579t;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    @Override // GJW.DC, GJW.lej
    public GJW.lej K(int i2, String str) {
        Uf();
        throw new KotlinNothingValueException();
    }

    @Override // GJW.lej
    public boolean Org(CoroutineContext coroutineContext) {
        Uf();
        throw new KotlinNothingValueException();
    }

    @Override // GJW.iF
    public O U(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        Uf();
        throw new KotlinNothingValueException();
    }

    @Override // GJW.iF
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Void z(long j2, GJW.Pl pl) {
        Uf();
        throw new KotlinNothingValueException();
    }

    @Override // GJW.lej
    /* JADX INFO: renamed from: p0N, reason: merged with bridge method [inline-methods] */
    public Void n1(CoroutineContext coroutineContext, Runnable runnable) {
        Uf();
        throw new KotlinNothingValueException();
    }
}
