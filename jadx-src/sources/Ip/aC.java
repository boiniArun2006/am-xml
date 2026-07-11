package Ip;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public interface aC {

    public enum j {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f4311n;

        public int rl() {
            return this.f4311n;
        }

        j(int i2) {
            this.f4311n = i2;
        }
    }

    j rl(String str);
}
