package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.fuX;
import com.google.crypto.tink.shaded.protobuf.rv6;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class j implements rv6 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.j$j, reason: collision with other inner class name */
    public static abstract class AbstractC0803j implements rv6.j {
        protected static UninitializedMessageException rl(rv6 rv6Var) {
            return new UninitializedMessageException(rv6Var);
        }
    }

    abstract int rl(mz mzVar);

    private String t(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    UninitializedMessageException nr() {
        return new UninitializedMessageException(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.rv6
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream codedOutputStreamP5 = CodedOutputStream.p5(bArr);
            n(codedOutputStreamP5);
            codedOutputStreamP5.t();
            return bArr;
        } catch (IOException e2) {
            throw new RuntimeException(t("byte array"), e2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.rv6
    public fuX toByteString() {
        try {
            fuX.C0802fuX c0802fuXAz = fuX.az(getSerializedSize());
            n(c0802fuXAz.rl());
            return c0802fuXAz.n();
        } catch (IOException e2) {
            throw new RuntimeException(t("ByteString"), e2);
        }
    }
}
