package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class nKK implements OU {
    private static final M rl = new j();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final M f60018n;

    class j implements M {
        @Override // com.google.crypto.tink.shaded.protobuf.M
        public boolean isSupported(Class cls) {
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.M
        public iwV messageInfoFor(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        j() {
        }
    }

    private static class n implements M {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private M[] f60019n;

        @Override // com.google.crypto.tink.shaded.protobuf.M
        public boolean isSupported(Class cls) {
            for (M m2 : this.f60019n) {
                if (m2.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.M
        public iwV messageInfoFor(Class cls) {
            for (M m2 : this.f60019n) {
                if (m2.isSupported(cls)) {
                    return m2.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        n(M... mArr) {
            this.f60019n = mArr;
        }
    }

    public nKK() {
        this(n());
    }

    private nKK(M m2) {
        this.f60018n = (M) SPz.rl(m2, "messageInfoFactory");
    }

    private static M n() {
        return new n(UGc.n(), rl());
    }

    private static mz nr(Class cls, iwV iwv) {
        return Q.class.isAssignableFrom(cls) ? t(iwv) ? h.v(cls, iwv, Zs.rl(), Z.rl(), AbstractC1905p.wTp(), QJ.rl(), lej.rl()) : h.v(cls, iwv, Zs.rl(), Z.rl(), AbstractC1905p.wTp(), null, lej.rl()) : t(iwv) ? h.v(cls, iwv, Zs.n(), Z.n(), AbstractC1905p.X(), QJ.n(), lej.n()) : h.v(cls, iwv, Zs.n(), Z.n(), AbstractC1905p.T(), null, lej.n());
    }

    private static M rl() {
        try {
            return (M) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return rl;
        }
    }

    private static boolean t(iwV iwv) {
        if (iwv.getSyntax() == iF.PROTO2) {
            return true;
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OU
    public mz createSchema(Class cls) {
        AbstractC1905p.N(cls);
        iwV iwvMessageInfoFor = this.f60018n.messageInfoFor(cls);
        if (iwvMessageInfoFor.isMessageSetWireFormat()) {
            if (Q.class.isAssignableFrom(cls)) {
                return K.J2(AbstractC1905p.wTp(), QJ.rl(), iwvMessageInfoFor.getDefaultInstance());
            }
            return K.J2(AbstractC1905p.X(), QJ.n(), iwvMessageInfoFor.getDefaultInstance());
        }
        return nr(cls, iwvMessageInfoFor);
    }
}
