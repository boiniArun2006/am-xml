package Hh;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final qz f3934n = new n();
    public static final qz rl = new w6();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final qz f3935t = new Ml();

    class Ml implements qz {
        @Override // Hh.qz
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public String get() {
            return "";
        }

        Ml() {
        }
    }

    class j implements qz {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Object f3936n;

        j(Object obj) {
            this.f3936n = obj;
        }

        @Override // Hh.qz
        public Object get() {
            return this.f3936n;
        }
    }

    class n implements qz {
        @Override // Hh.qz
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.TRUE;
        }

        n() {
        }
    }

    class w6 implements qz {
        @Override // Hh.qz
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.FALSE;
        }

        w6() {
        }
    }

    public static qz n(Object obj) {
        return new j(obj);
    }
}
