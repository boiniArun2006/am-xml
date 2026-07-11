package Tc;

import as.eO;
import as.qz;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface j {

    /* JADX INFO: renamed from: Tc.j$j, reason: collision with other inner class name */
    public static final class C0372j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f10522n;
        private final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f10523t;

        public /* synthetic */ C0372j(int i2, int i3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(i2, i3, i5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0372j)) {
                return false;
            }
            C0372j c0372j = (C0372j) obj;
            return eO.Uo(this.f10522n, c0372j.f10522n) && qz.nr(this.rl, c0372j.rl) && eO.Uo(this.f10523t, c0372j.f10523t);
        }

        private C0372j(int i2, int i3, int i5) {
            this.f10522n = i2;
            this.rl = i3;
            this.f10523t = i5;
        }

        public int hashCode() {
            return (((eO.KN(this.f10522n) * 31) + qz.O(this.rl)) * 31) + eO.KN(this.f10523t);
        }

        public final int n() {
            return this.rl;
        }

        public final int rl() {
            return this.f10522n;
        }

        public final int t() {
            return this.f10523t;
        }

        public String toString() {
            return "Configuration(inputSampleRate=" + ((Object) eO.xMQ(this.f10522n)) + ", channelCount=" + ((Object) qz.J2(this.rl)) + ", outputSampleRate=" + ((Object) eO.xMQ(this.f10523t)) + ')';
        }
    }

    int n();

    void nr(C0372j c0372j);

    void queueInput(ByteBuffer byteBuffer);

    ByteBuffer rl(int i2);

    void t(float f3);
}
