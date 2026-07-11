package androidx.content.preferences.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@CheckReturnValue
abstract class UnknownFieldSchema<T, B> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile int f38178n = 100;

    abstract void HI(Object obj, Object obj2);

    abstract boolean Ik(Reader reader);

    abstract Object J2(Object obj);

    abstract int KN(Object obj);

    abstract void O(Object obj, int i2, long j2);

    abstract Object Uo(Object obj);

    abstract void Z(Object obj, Writer writer);

    abstract void ck(Object obj, Object obj2);

    abstract Object gh(Object obj, Object obj2);

    abstract void mUb(Object obj);

    abstract void n(Object obj, int i2, int i3);

    abstract void nr(Object obj, int i2, ByteString byteString);

    abstract void o(Object obj, Writer writer);

    abstract Object r(Object obj);

    abstract void rl(Object obj, int i2, long j2);

    abstract void t(Object obj, int i2, Object obj2);

    abstract Object ty();

    abstract int xMQ(Object obj);

    UnknownFieldSchema() {
    }

    private final void qie(Object obj, Reader reader, int i2) {
        while (reader.getFieldNumber() != Integer.MAX_VALUE && az(obj, reader, i2)) {
        }
    }

    final boolean az(Object obj, Reader reader, int i2) throws InvalidProtocolBufferException {
        int tag = reader.getTag();
        int iN = WireFormat.n(tag);
        int iRl = WireFormat.rl(tag);
        if (iRl != 0) {
            if (iRl != 1) {
                if (iRl != 2) {
                    if (iRl != 3) {
                        if (iRl != 4) {
                            if (iRl == 5) {
                                n(obj, iN, reader.readFixed32());
                                return true;
                            }
                            throw InvalidProtocolBufferException.O();
                        }
                        return false;
                    }
                    Object objTy = ty();
                    int iT = WireFormat.t(iN, 4);
                    int i3 = i2 + 1;
                    if (i3 < f38178n) {
                        qie(objTy, reader, i3);
                        if (iT == reader.getTag()) {
                            t(obj, iN, r(objTy));
                            return true;
                        }
                        throw InvalidProtocolBufferException.rl();
                    }
                    throw InvalidProtocolBufferException.xMQ();
                }
                nr(obj, iN, reader.readBytes());
                return true;
            }
            rl(obj, iN, reader.readFixed64());
            return true;
        }
        O(obj, iN, reader.readInt64());
        return true;
    }
}
