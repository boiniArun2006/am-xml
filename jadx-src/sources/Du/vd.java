package Du;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface vd extends XA.Ml {
    XA.Ml[] childSerializers();

    public static final class j {
        public static XA.Ml[] n(vd vdVar) {
            return vd.super.typeParametersSerializers();
        }
    }

    default XA.Ml[] typeParametersSerializers() {
        return V1.f1996n;
    }
}
