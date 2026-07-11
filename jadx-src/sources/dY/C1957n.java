package dY;

import wIE.I28;

/* JADX INFO: renamed from: dY.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C1957n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C1956j f63528n;
    private final I28 rl;

    /* JADX INFO: renamed from: dY.n$n, reason: collision with other inner class name */
    public static class C0842n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private C1956j f63529n;
        private I28.n rl = new I28.n();

        public C0842n O(C1956j c1956j) {
            if (c1956j == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.f63529n = c1956j;
            return this;
        }

        public C0842n nr(String str, String str2) {
            this.rl.J2(str, str2);
            return this;
        }

        public C1957n t() {
            if (this.f63529n != null) {
                return new C1957n(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    private C1957n(C0842n c0842n) {
        this.f63528n = c0842n.f63529n;
        this.rl = c0842n.rl.t();
    }

    public I28 n() {
        return this.rl;
    }

    public C1956j rl() {
        return this.f63528n;
    }

    public String toString() {
        return "Request{url=" + this.f63528n + '}';
    }
}
