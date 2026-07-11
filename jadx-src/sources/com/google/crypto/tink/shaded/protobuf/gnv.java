package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
abstract class gnv {
    abstract void HI(Object obj, Object obj2);

    abstract boolean Ik(l4Z l4z);

    abstract Object J2(Object obj);

    abstract int KN(Object obj);

    abstract void O(Object obj, int i2, long j2);

    abstract Object Uo(Object obj);

    abstract void Z(Object obj, YzO yzO);

    abstract void ck(Object obj, Object obj2);

    abstract Object gh(Object obj, Object obj2);

    abstract void mUb(Object obj);

    abstract void n(Object obj, int i2, int i3);

    abstract void nr(Object obj, int i2, fuX fux);

    abstract void o(Object obj, YzO yzO);

    abstract Object r(Object obj);

    abstract void rl(Object obj, int i2, long j2);

    abstract void t(Object obj, int i2, Object obj2);

    abstract Object ty();

    abstract int xMQ(Object obj);

    gnv() {
    }

    final boolean az(Object obj, l4Z l4z) throws InvalidProtocolBufferException {
        int tag = l4z.getTag();
        int iN = M5.n(tag);
        int iRl = M5.rl(tag);
        if (iRl != 0) {
            if (iRl != 1) {
                if (iRl != 2) {
                    if (iRl != 3) {
                        if (iRl != 4) {
                            if (iRl == 5) {
                                n(obj, iN, l4z.readFixed32());
                                return true;
                            }
                            throw InvalidProtocolBufferException.O();
                        }
                        return false;
                    }
                    Object objTy = ty();
                    int iT = M5.t(iN, 4);
                    qie(objTy, l4z);
                    if (iT == l4z.getTag()) {
                        t(obj, iN, r(objTy));
                        return true;
                    }
                    throw InvalidProtocolBufferException.rl();
                }
                nr(obj, iN, l4z.readBytes());
                return true;
            }
            rl(obj, iN, l4z.readFixed64());
            return true;
        }
        O(obj, iN, l4z.readInt64());
        return true;
    }

    final void qie(Object obj, l4Z l4z) {
        while (l4z.getFieldNumber() != Integer.MAX_VALUE && az(obj, l4z)) {
        }
    }
}
